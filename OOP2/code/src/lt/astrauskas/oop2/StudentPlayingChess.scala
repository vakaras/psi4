package lt.astrauskas.oop2

class StudentPlayingChess(
    private var baseStudent: IStudent,
    private var baseChessPlayer: IChessPlayer)
    extends IStudentPlayingChess {

  baseStudent.setSelf(this)
  baseChessPlayer.setSelf(this)
  
  def baseIStudent(): IStudent = baseStudent
  def baseIChessPlayer(): IChessPlayer = baseChessPlayer
  
  override def pointsImpl(): Double = {
    baseIChessPlayer.pointsImpl() * (12 / schoolClass())
  }
  
  override def statusImpl(): String = {
    "Student %s (%d): %f".format(
        fullName(), schoolClass(), points())
  }
  
}