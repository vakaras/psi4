package lt.astrauskas.oop2

trait IChessPlayer extends IPlayerExtend {

  def self: IChessPlayer

  def win(): Int = self.winImpl()
  def loose(): Int = self.looseImpl()
  def draw(): Int = self.drawImpl()
  def played(): Int = self.playedImpl()

  def winImpl(): Int
  def looseImpl(): Int
  def drawImpl(): Int
  def playedImpl(): Int = win() + loose() + draw()

}