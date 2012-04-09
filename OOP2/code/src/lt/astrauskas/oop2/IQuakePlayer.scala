package lt.astrauskas.oop2

trait IQuakePlayer extends IPlayerExtend {

  def self: IQuakePlayer

  def deaths(): Int = self.deathsImpl()
  def kills(): Int = self.killsImpl()
  def roundsPlayed(): Int = self.roundsPlayedImpl()

  def deathsImpl(): Int
  def killsImpl(): Int
  def roundsPlayedImpl(): Int

}