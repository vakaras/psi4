package lt.astrauskas.oop1.TemplateMethod

abstract class Noun (value: String) {
  
  val word = value
  
  def show() {
    println("Nominative: " + getNominative())
    println("Akkusative: " + getAkkusative())
    println("Dative: " + getDative())
    println("Genitive: " + getGenitive())
  }
  
  def getNominative(): String
  
  def getAkkusative(): String
  
  def getDative(): String
  
  def getGenitive(): String
  
  def getValue() = word
}