package homework1;

import java.util.HashMap;
import java.util.Map;

public class OptionalCourse {

    public static Map<Student, Course> allStudent = new HashMap<>();

    //Запись на курс
    public static void toRecord(Teacher teacher, Student student) {
        Course course = teacher.getCourse();
        allStudent.put(student, course);
    }

    //Выставление оценки и занесение в архив
    public static void rate(Student student, Evaluation evaluation) {
        student.setEvaluation(evaluation);
        Archive.saveToArchive(student, evaluation);
    }
}
