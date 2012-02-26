package lt.astrauskas.oop1.Strategy

class Feminine extends Gender {

  def getNominative(value: String) = "die " + value

  def getAkkusative(value: String) = "die " + value

  def getDative(value: String) = "der " + value

  def getGenitive(value: String) = "der " + value

}