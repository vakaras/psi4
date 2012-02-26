package lt.astrauskas.oop1.TemplateMethodScala

trait Masculine {

  def getValue(): String
  
  protected def getNominative() = "der " + getValue()
  
  protected def getAkkusative() = "den " + getValue()

  protected def getDative() = "dem " + getValue()

  protected def getGenitive() = "des " + getValue()
  
}