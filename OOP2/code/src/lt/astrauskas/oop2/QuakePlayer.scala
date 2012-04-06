package lt.astrauskas.oop2

class QuakePlayer(
    private var baseObj: IPlayer,
    deathsArg: Int,
    killsArg: Int,
    roundsPlayedArg: Int)
	extends IQuakePlayer {

  baseObj.setSelf(this)
  def base(): IPlayer = baseObj
  
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