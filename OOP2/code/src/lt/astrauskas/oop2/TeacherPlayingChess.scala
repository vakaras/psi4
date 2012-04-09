package lt.astrauskas.oop2

class TeacherPlayingChess(
    private var baseTeacher: ITeacherUse,
    private var baseChessPlayer: IChessPlayerUse)
    extends ITeacherPlayingChess {

  var selfValue: ITeacherPlayingChess = this
  def self: ITeacherPlayingChess = selfValue
  def setSelf(newSelf: ITeacherPlayingChess): Unit = {
    selfValue = newSelf
    baseITeacher.setSelf(newSelf)
    baseIChessPlayer.setSelf(newSelf)
  }

  baseTeacher.setSelf(this)
  baseChessPlayer.setSelf(this)

  def baseITeacher: ITeacherUse = baseTeacher
  def baseIChessPlayer: IChessPlayerUse = baseChessPlayer

  override def statusImpl(): String = {
    "Teacher %s (%s): %f".format(
        fullName(), subject(), points())
  }
}