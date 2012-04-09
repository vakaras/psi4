package lt.astrauskas.oop2

class Player extends IPlayerUse {

  var selfValue: IPlayer = this
  def self: IPlayer = selfValue
  def setSelf(newSelf: IPlayer): Unit = {
    selfValue = newSelf
  }

  def pointsImpl(): Double = 0
  def statusImpl(): String = "Player status: " + points()
  def toStringImpl(): String = "Player"

}