package lt.astrauskas.oop1.Strategy

class Neuter extends Gender {

  def getNominative(value: String) = "das " + value

  def getAkkusative(value: String) = "das " + value

  def getDative(value: String) = "dem " + value

  def getGenitive(value: String) = "des " + value

}