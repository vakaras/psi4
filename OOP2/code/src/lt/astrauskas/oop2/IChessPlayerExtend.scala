package lt.astrauskas.oop2

trait IChessPlayerExtend extends IChessPlayer {
  
  def base(): IChessPlayer
  
  def winImpl(): Int = base.winImpl()
  def looseImpl(): Int = base.looseImpl()
  def drawImpl(): Int = base.drawImpl()

}