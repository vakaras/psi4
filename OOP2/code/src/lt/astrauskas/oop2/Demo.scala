package lt.astrauskas.oop2

object Demo {

  def main(args: Array[String]): Unit = {
    println("Start.")
    
    println("----------Testing human---------")
    var human1: IHuman = new Human("Vytautas", "Astrauskas")
    println("(H) First name: " + human1.firstName())
    println("(H) Last name: " + human1.lastName())
    println("(H) Full name: " + human1.fullName())
    println("(H) REPR: " + human1.toString())
    
    println("----------Testing student---------")
    var student: IStudent = new Student(human1, 10)
    println("(H) First name: " + human1.firstName())
    println("(H) Last name: " + human1.lastName())
    println("(H) Full name: " + human1.fullName())
    println("(H) REPR: " + human1.toString())
    println("(S) First name: " + student.firstName())
    println("(S) Last name: " + student.lastName())
    println("(S) Full name: " + student.fullName())
    println("(S) Class: " + student.schoolClass())
    println("(S) REPR: " + student.toString())
    
    println("----------Testing teacher---------")
    var human2: IHuman = new Human("Petras", "Petraitis")
    var teacher: ITeacher = new Teacher(
        human2, "m.m.", "matematika")
    println("(H) First name: " + human2.firstName())
    println("(H) Last name: " + human2.lastName())
    println("(H) Full name: " + human2.fullName())
    println("(H) REPR: " + human2.toString())
    println("(T) First name: " + teacher.firstName())
    println("(T) Last name: " + teacher.lastName())
    println("(T) Full name: " + teacher.fullName())
    println("(T) Degree: " + teacher.degree())
    println("(T) Subject: " + teacher.subject())
    println("(T) REPR: " + teacher.toString())

    println("----------Testing player---------")
    var player1: IPlayer = new Player()
    println("(P) Points: " + player1.points())
    println("(P) Status: " + player1.status())
    println("(P) REPR: " + player1.toString())

    println("End.")
  }

}