package lt.astrauskas.oop2

class ChessPlayer(
    private var baseObj: IPlayer,
    winArg: Int,
    looseArg: Int,
    drawArg: Int)
	extends IChessPlayer {
  
  baseObj.setSelf(this)
  def baseIPlayer(): IPlayer = baseObj
  
  override def toStringImpl(): String = {
    "Chess player: win=%d loose=%d draw=%d played=%d".format(
        win(), loose(), draw(), played()
      )
  }
  def winImpl(): Int = winArg
  def looseImpl(): Int = looseArg
  def drawImpl(): Int = drawArg
  def pointsImpl(): Double = {
    (win() + 0.5 * draw()) / played()
  }

}