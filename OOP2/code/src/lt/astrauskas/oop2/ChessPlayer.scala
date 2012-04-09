package lt.astrauskas.oop2

class ChessPlayer(
    private var baseObj: IPlayerUse,
    winArg: Int,
    looseArg: Int,
    drawArg: Int)
	extends IChessPlayer {

  var selfValue: IChessPlayer = this
  def self: IChessPlayer = selfValue
  def setSelf(newSelf: IChessPlayer): Unit = {
    selfValue = newSelf
    baseIPlayer.setSelf(newSelf)
  }
  baseObj.setSelf(this)

  def baseIPlayer(): IPlayerUse = baseObj

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