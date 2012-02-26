package lt.astrauskas.oop1.TemplateMethod

class NeuterNoun(value: String) extends Noun(value) {

  def getNominative() = "das " + getValue()
  
  def getAkkusative() = "das " + getValue()

  def getDative() = "dem " + getValue()

  def getGenitive() = "des " + getValue()

}