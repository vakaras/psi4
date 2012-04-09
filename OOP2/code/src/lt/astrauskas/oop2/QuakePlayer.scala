package lt.astrauskas.oop2

class QuakePlayer(
    private var baseObj: IPlayerUse,
    deathsArg: Int,
    killsArg: Int,
    roundsPlayedArg: Int)
	extends IQuakePlayerUse {

  var selfValue: IQuakePlayer = this
  def self: IQuakePlayer = selfValue
  def setSelf(newSelf: IQuakePlayer): Unit = {
    selfValue = newSelf
    baseIPlayer.setSelf(newSelf)
  }
  baseObj.setSelf(self)

  def baseIPlayer: IPlayerUse = baseObj

  override def toStringImpl(): String = {
    "Quake Player: deaths=%d kills=%d round=%d".format(
        deaths(), kills(), roundsPlayed())
  }
  def deathsImpl(): Int = deathsArg
  def killsImpl(): Int = killsArg
  def roundsPlayedImpl(): Int = roundsPlayedArg
  def pointsImpl(): Double = {
    (kills().toDouble/roundsPlayed())
  }
  
}