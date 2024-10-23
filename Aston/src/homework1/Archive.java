package homework1;

import java.util.HashMap;
import java.util.Map;

public class Archive {

    public static Map<Student, Evaluation> archive = new HashMap<>();

    public static void saveToArchive(Student student, Evaluation evaluation) {
        archive.put(student, evaluation);
    }
}
