package ch05;

public class Test {

    public static void main(String[] args) {

        Student studentLee = new Student(100,"Lee");
        studentLee.setKoreaSubject("국어",100,1);
        studentLee.setMathSubject("수학",99,2);

        Student studentKim = new Student(200,"Kim");
        studentKim.setKoreaSubject("국어",50,1);
        studentKim.setMathSubject("수학",65,2);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
