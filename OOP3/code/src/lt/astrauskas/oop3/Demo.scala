package lt.astrauskas.oop3

object Demo {

  def show[T <: Decorator : Manifest](
      human: Decorator, function: T => Unit) = {
    val m = manifest[T]
    human.get(m) match {
      case Some(decorator)
        if ClassManifest.singleType(decorator) <:< m
        => function(decorator.asInstanceOf[T])
      case _ => println("Not found: " + m.erasure.toString())
    }
  }

  def remove[T <: Decorator : Manifest](human: IHuman): IHuman = {
    val m = manifest[T]
    println("Trying to remove: " + m)
    human match {
      case decorator: Decorator => {
        println("  Decorated. Removing.")
        return decorator.remove(m)
      }
      case _ => {
        println("  Not decorated.")
        return human
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println("Start.")

    var human: IHuman = new Human("Vytautas", "Astrauskas")
    println("Full name: " + human.fullName)

    var student = new Student(
        human, "VŽG", 10)
    println("Decorated with Student.")

    var withEmail = new HumanWithEmail(
        student, "vastrauskas@gmail.com")
    println("Decorated with HumanWithEmail.")

    show(withEmail,
        (human: HumanWithEmail) => println(
            "Pretty email: " + human.prettyEmail))
    show(withEmail,
        (human: Student) => println("School: " + human.school))

    withEmail.setComponent(human)
    remove[Student](withEmail) match {
      case decorator: HumanWithEmail => withEmail = decorator
      case _ =>
    }
    println("Removed decorator Student.")

    show(withEmail,
        (human: Student) => println("School: " + human.school))

    var teacher = new Teacher(
        withEmail, "matematika", "m. m.")
    println("Decorated with Teacher.")

    show(teacher,
        (human: Teacher) => println(
            "Full name: " + human.fullName))

    var withPassport = new WithPassport(teacher, "39004134482")
    println("Decorated with Passport")
    show(withPassport,
        (human: WithPassport) => println(
            "Passport information: " +
            human.passportInformation()))

    human = remove[Teacher](withPassport)
    human = remove[Teacher](human)
    human = remove[HumanWithEmail](human)
    human = remove[WithPassport](human)
    human = remove[Student](human)

    println("End.")
  }

}