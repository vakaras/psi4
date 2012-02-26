package lt.astrauskas.oop1.TemplateMethod

class FeminineNoun(word: String) extends Noun(word) {

  def getNominative() = "die " + getValue()
  
  def getAkkusative() = "die " + getValue()

  def getDative() = "der " + getValue()

  def getGenitive() = "der " + getValue()

}