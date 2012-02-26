package lt.astrauskas.oop1.TemplateMethod

class MaskulineNoun(value: String) extends Noun(value) {

  def getNominative() = "der " + getValue()
  
  def getAkkusative() = "den " + getValue()

  def getDative() = "dem " + getValue()

  def getGenitive() = "des " + getValue()

}