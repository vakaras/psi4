package lt.astrauskas.oop1.TemplateMethod

class MaskulineNoun(value: String) extends Noun(value) {

  protected def getNominative() = "der " + getValue()
  
  protected def getAkkusative() = "den " + getValue()

  protected def getDative() = "dem " + getValue()

  protected def getGenitive() = "des " + getValue()

}