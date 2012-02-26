package lt.astrauskas.oop1.TemplateMethodScala

trait Neuter {

  def getValue(): String
  
  protected def getNominative() = "das " + getValue()
  
  protected def getAkkusative() = "das " + getValue()

  protected def getDative() = "dem " + getValue()

  protected def getGenitive() = "des " + getValue()
  
}