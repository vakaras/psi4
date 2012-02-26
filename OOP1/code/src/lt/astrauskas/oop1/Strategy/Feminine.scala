package lt.astrauskas.oop1.Strategy

class Feminine extends Gender {

  def show(value: String): Unit = {
    println("Nominative: die " + value)
    println("Akkusative: die " + value)
    println("Dative: der " + value)
    println("Genitive: der " + value)
  }

}