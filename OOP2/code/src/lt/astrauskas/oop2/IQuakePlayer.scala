package lt.astrauskas.oop2

trait IQuakePlayer extends IPlayerExtend {

  private var self: IQuakePlayer = this
  
  def setSelf(newSelf: IQuakePlayer): Unit = {
    self = newSelf
    setSelf(newSelf.asInstanceOf[IPlayer])
    baseIPlayer.setSelf(newSelf)
  }
  
  def deaths(): Int = self.deathsImpl()
  def kills(): Int = self.killsImpl()
  def roundsPlayed(): Int = self.roundsPlayedImpl()
  
  def deathsImpl(): Int
  def killsImpl(): Int
  def roundsPlayedImpl(): Int
  
}