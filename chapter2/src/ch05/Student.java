package ch05;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentID, String studentName){

        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score, int id){

        korea.subjectName = name;
        korea.score = score;
        korea.subjectID = id;
    }

    public void setMathSubject(String name, int score, int id){

        math.subjectName = name;
        math.score = score;
        math.subjectID = id;
    }

    public void showScoreInfo(){

        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
