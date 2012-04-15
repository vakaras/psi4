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
    println("Removed decorator Student.")

    show(withEmail,
        (human: Student) => println("School: " + human.school))

    var teacher = new Teacher(
        withEmail, "matematika", "m. m.")
    println("Decorated with Teacher.")

    show(teacher,
        (human: Teacher) => println(
            "Full name: " + human.fullName))

    println("End.")
  }

}