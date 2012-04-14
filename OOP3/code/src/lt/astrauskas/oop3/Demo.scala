package lt.astrauskas.oop3

object Demo {

  def main(args: Array[String]): Unit = {
    println("Start.")

    var human: IHuman = new Human("Vytautas", "Astrauskas")
    println("Full name: " + human.fullName)

    var withEmail = new HumanWithEmail(
        human, "vastrauskas@gmail.com")
    println("Full name:    " + withEmail.fullName)
    println("Pretty email: " + withEmail.prettyEmail)

    println("End.")
  }

}