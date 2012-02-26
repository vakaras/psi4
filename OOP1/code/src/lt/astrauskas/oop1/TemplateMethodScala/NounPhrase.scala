package lt.astrauskas.oop1.TemplateMethodScala

abstract class NounPhrase(val adjective: String, val noun: String) {

  def show(): Unit = {
    println("  Nominative: " + getNominative())
    println("  Akkusative: " + getAkkusative())
    println("  Dative:     " + getDative())
    println("  Genitive:   " + getGenitive())
  }
  
  protected def getNominative(): String

  protected def getAkkusative(): String

  protected def getDative(): String

  protected def getGenitive(): String

  def getValue() = adjective + " " + noun
  
}