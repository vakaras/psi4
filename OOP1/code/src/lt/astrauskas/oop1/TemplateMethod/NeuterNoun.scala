package lt.astrauskas.oop1.TemplateMethod

class NeuterNoun(value: String) extends Noun(value) {

  protected def getNominative() = "das " + getValue()
  
  protected def getAkkusative() = "das " + getValue()

  protected def getDative() = "dem " + getValue()

  protected def getGenitive() = "des " + getValue()

}