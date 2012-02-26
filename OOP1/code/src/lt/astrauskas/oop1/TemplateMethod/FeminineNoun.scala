package lt.astrauskas.oop1.TemplateMethod

class FeminineNoun(word: String) extends Noun(word) {

  protected def getNominative() = "die " + getValue()
  
  protected def getAkkusative() = "die " + getValue()

  protected def getDative() = "der " + getValue()

  protected def getGenitive() = "der " + getValue()

}