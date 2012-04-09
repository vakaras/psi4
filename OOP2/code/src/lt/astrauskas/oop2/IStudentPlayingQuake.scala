package lt.astrauskas.oop2

trait IStudentPlayingQuake
    extends IStudent with IQuakePlayer {

  def self: IStudentPlayingQuake

  def baseIStudent(): IStudent
  def baseIQuakePlayer(): IQuakePlayer
  def baseIHuman(): IHuman = baseIStudent
  def baseIPlayer(): IPlayer = baseIQuakePlayer

  def schoolClassImpl(): Int = baseIStudent.schoolClassImpl()

  def deathsImpl(): Int = baseIQuakePlayer.deathsImpl()
  def killsImpl(): Int = baseIQuakePlayer.killsImpl()
  def roundsPlayedImpl(): Int = baseIQuakePlayer.roundsPlayedImpl()
  def pointsImpl(): Double = baseIQuakePlayer.pointsImpl()

  override def toStringImpl(): String = {
    "Player: {%s} Student: {%s}".format(
        baseIQuakePlayer.toStringImpl(),
        baseIStudent.toStringImpl())
  }

}