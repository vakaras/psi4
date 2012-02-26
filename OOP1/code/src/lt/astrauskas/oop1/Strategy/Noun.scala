package lt.astrauskas.oop1.Strategy

class Noun (var word: String, var gender: Gender) {
   
  def show(): Unit = {
    println("  Nominative: " + gender.getNominative(getValue()))
    println("  Akkusative: " + gender.getAkkusative(getValue()))
    println("  Dative:     " + gender.getDative(getValue()))
    println("  Genitive:   " + gender.getGenitive(getValue()))
  }

  def getValue() = word

}