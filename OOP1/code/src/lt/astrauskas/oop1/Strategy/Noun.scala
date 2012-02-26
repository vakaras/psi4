package lt.astrauskas.oop1.Strategy

class Noun (var word: String, var gender: Gender) {
   
  def show(): Unit = {
    gender.show(getValue())
  }
  
  def getValue() = word

}