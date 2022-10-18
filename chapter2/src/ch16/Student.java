package ch16;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    ArrayList<Subject> subjects;

    public Student(int studentID, String studentName){

        this.studentID = studentID;
        this.studentName = studentName;
        subjects = new ArrayList<Subject>();
    }

    public void addSubject(String subjectName, int score){

        subjects.add(new Subject(subjectName,score));
    }

    public void showStudentInfo(){

        int total = 0;
        for(int i = 0; i < subjects.size(); i++){
            System.out.println("학생 " + studentName + "의 " + subjects.get(i).getSubjectName() + " 과목 성적은 " + subjects.get(i).getScore() + "입니다.");
            total += subjects.get(i).getScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
