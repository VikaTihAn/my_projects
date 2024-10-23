package homework1;

public class Student {

    private final String surname;
    private Evaluation evaluation;

    public Student(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }
}
