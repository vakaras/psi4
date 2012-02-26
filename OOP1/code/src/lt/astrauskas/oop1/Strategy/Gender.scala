package lt.astrauskas.oop1.Strategy

trait Gender {
  
  def getNominative(value: String): String

  def getAkkusative(value: String): String

  def getDative(value: String): String

  def getGenitive(value: String): String

}