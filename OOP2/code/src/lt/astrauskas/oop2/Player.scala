package lt.astrauskas.oop2

class Player extends IPlayer {

  def pointsImpl(): Int = 0
  def statusImpl(): String = "Player status: " + points()
  def toStringImpl(): String = "Player"

}