package homework1;

public class Teacher {

    public String surname;
    private Course course;

    public Teacher(String surname, Course course) {
        this.surname = surname;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    //Проведение лекции
    public void lecture() {
        System.out.println("Преподаватель " + surname + " рассказывает лекцию");
    }
}
