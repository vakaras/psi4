package lt.astrauskas.oop2

trait IStudentPlayingChess
    extends IStudent with IChessPlayer {

  def self: IStudentPlayingChess

  def baseIStudent(): IStudent
  def baseIChessPlayer(): IChessPlayer
  def baseIHuman(): IHuman = baseIStudent
  def baseIPlayer(): IPlayer = baseIChessPlayer

  def schoolClassImpl(): Int = baseIStudent.schoolClassImpl()

  def winImpl(): Int = baseIChessPlayer.winImpl()
  def looseImpl(): Int = baseIChessPlayer.looseImpl()
  def drawImpl(): Int = baseIChessPlayer.drawImpl()
  def pointsImpl(): Double = baseIChessPlayer().pointsImpl()

  override def toStringImpl(): String = {
    "Player: {%s} Student: {%s}".format(
        baseIChessPlayer.toStringImpl(),
        baseIStudent.toStringImpl())
  }

}