package lt.astrauskas.oop1.Strategy

class Maskuline extends Gender {

  def getNominative(value: String) = "der " + value

  def getAkkusative(value: String) = "den " + value

  def getDative(value: String) = "dem " + value

  def getGenitive(value: String) = "des " + value

}