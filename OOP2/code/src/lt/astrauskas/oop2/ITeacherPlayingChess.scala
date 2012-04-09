package lt.astrauskas.oop2

trait ITeacherPlayingChess
    extends ITeacher with IChessPlayer {

  def self: ITeacherPlayingChess

  def baseITeacher(): ITeacher
  def baseIChessPlayer(): IChessPlayer
  def baseIHuman(): IHuman = baseITeacher
  def baseIPlayer(): IPlayer = baseIChessPlayer

  def degreeImpl(): String = baseITeacher.degreeImpl()
  def subjectImpl(): String = baseITeacher.subjectImpl()

  def winImpl(): Int = baseIChessPlayer.winImpl()
  def looseImpl(): Int = baseIChessPlayer.looseImpl()
  def drawImpl(): Int = baseIChessPlayer.drawImpl()
  def pointsImpl(): Double = baseIChessPlayer().pointsImpl()

  override def toStringImpl(): String = {
    "Player: {%s} Teacher: {%s}".format(
        baseIChessPlayer.toStringImpl(),
        baseITeacher.toStringImpl())
  }
}