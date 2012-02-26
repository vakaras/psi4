package lt.astrauskas.oop1.TemplateMethodScala

trait Feminine {

  def getValue(): String
  
  protected def getNominative() = "die " + getValue()
  
  protected def getAkkusative() = "die " + getValue()

  protected def getDative() = "der " + getValue()

  protected def getGenitive() = "der " + getValue()
  
}