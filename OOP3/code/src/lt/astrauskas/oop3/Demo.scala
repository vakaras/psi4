package lt.astrauskas.oop3

object Demo {

  def main(args: Array[String]): Unit = {
    println("Start.")

    var human: IHuman = new Human("Vytautas", "Astrauskas")
    println("Full name: " + human.fullName())

    var manager = new DecoratorManager(human)
    println("Full name: " + manager.fullName())

    println("End.")
  }

}