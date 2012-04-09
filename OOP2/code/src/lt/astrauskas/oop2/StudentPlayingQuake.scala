package lt.astrauskas.oop2

class StudentPlayingQuake(
    private var baseStudent: IStudentUse,
    private var baseQuakePlayer: IQuakePlayerUse)
    extends IStudentPlayingQuake {

  var selfValue: IStudentPlayingQuake = this
  def self: IStudentPlayingQuake = selfValue
  def setSelf(newSelf: IStudentPlayingQuake): Unit = {
    selfValue = newSelf

  }

  baseStudent.setSelf(this)
  baseQuakePlayer.setSelf(this)

  def baseIStudent: IStudentUse = baseStudent
  def baseIQuakePlayer: IQuakePlayerUse = baseQuakePlayer

  override def pointsImpl(): Double = {
    baseIQuakePlayer.pointsImpl() * (12.toDouble / schoolClass())
  }

  override def statusImpl(): String = {
    "Student %s (%d): %f".format(
        fullName(), schoolClass(), points())
  }
}