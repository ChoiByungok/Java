package ch16;

public class Subject {

    private String subjectName;
    private int score;

    public Subject(){}
    public Subject(String subjectName, int score){

        this.subjectName = subjectName;
        this.score = score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }
}
