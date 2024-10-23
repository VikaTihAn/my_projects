package homework1;

import java.util.concurrent.CopyOnWriteArraySet;

public class Running {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Volodin", Course.ELECTRICAL_CIRCUITS);
        Teacher teacher2 = new Teacher("Popov", Course.PROGRAMMING);

        Student student1 = new Student("Ivanov");
        Student student2 = new Student("Lavrenko");
        Student student3 = new Student("Evseev");

        OptionalCourse.toRecord(teacher1, student1);
        OptionalCourse.toRecord(teacher1, student2);
        teacher1.lecture();
        OptionalCourse.toRecord(teacher2, student3);
        teacher2.lecture();

        OptionalCourse.rate(student1, Evaluation.PERFECTLY);
        OptionalCourse.rate(student2, Evaluation.SATISFACTORILY);
        OptionalCourse.rate(student3, Evaluation.GOOD);
    }
}
