package lt.astrauskas.oop2

class StudentPlayingChess(
    private var baseStudent: IStudentUse,
    private var baseChessPlayer: IChessPlayerUse)
    extends IStudentPlayingChess {

  var selfValue: IStudentPlayingChess = this
  def self: IStudentPlayingChess = selfValue
  def setSelf(newSelf: IStudentPlayingChess): Unit = {
    selfValue = newSelf
    baseIStudent.setSelf(newSelf)
    baseIChessPlayer.setSelf(newSelf)
  }

  baseStudent.setSelf(this)
  baseChessPlayer.setSelf(this)

  def baseIStudent: IStudentUse = baseStudent
  def baseIChessPlayer: IChessPlayerUse = baseChessPlayer

  override def pointsImpl(): Double = {
    baseIChessPlayer.pointsImpl() * (12.toDouble / schoolClass())
  }

  override def statusImpl(): String = {
    "Student %s (%d): %f".format(
        fullName(), schoolClass(), points())
  }

}