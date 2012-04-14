package lt.astrauskas.oop3

class Student(
    component: IHuman,
    var school: String,
    var school_class: Int
    ) extends Decorator(component) {

}