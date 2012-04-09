package lt.astrauskas.oop2

trait IStudent extends IHumanExtend {

  def self: IStudent

  def schoolClass(): Int = self.schoolClassImpl()

  def schoolClassImpl(): Int

}