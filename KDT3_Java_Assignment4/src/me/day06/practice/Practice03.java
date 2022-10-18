package me.day06.practice;
//scores2d[0].length 열의 길이 반환 3
//scores2d.length 행의 길이 반환 5

public class Practice03 {
    public static double[] bubbleSort(double[] avg, int length, char sd) { //선생님의 피드백을 받고 오름차순 내림차순 함수를 하나로
        for (int i = 0; i < length - 1; i++) {                             //합쳤습니다.
            for (int j = 0; j < length - 1 - i; j++) {
                if (sd == 'a') {
                    if (avg[j] > avg[j + 1]) {
                        double tmp = avg[j + 1];
                        avg[j + 1] = avg[j];
                        avg[j] = tmp;
                    }
                }
                else {
                    if (avg[j] < avg[j + 1]) {
                        double tmp = avg[j + 1];
                        avg[j + 1] = avg[j];
                        avg[j] = tmp;
                    }
                }
            }

        }
        return avg;
    }
        public static void main (String[]args){
            int[][] scores2d = {{50, 60, 70}, {60, 76, 100}, {95, 88, 87}, {60, 65, 85}, {100, 85, 77}};
            double[] studentAverage = new double[5];  //학생별 과목 평균 배열
            double[] subjectAverage = new double[3];  //과목별 학생 평균 배열
            char asc = 'a';
            char desc = 'd';

            for (int i = 0; i < scores2d.length; i++) {     //반복문 돌면서 학생별 과목 평균 배열값 계산함
                for (int j = 0; j < scores2d[i].length; j++) {
                    studentAverage[i] += scores2d[i][j];
                }
                studentAverage[i] = studentAverage[i] / scores2d[i].length;
            }
            for (int i = 0; i < scores2d[i].length; i++) {  //왠만하면 첫번재 이중반복문에서 끝내고 싶었는데
                for (int j = 0; j < scores2d.length; j++) {  //머리가 굴러가지 않아서 열우선으로 순회해서 과목별 학생평균값을 따로 구햇습니다.
                    subjectAverage[i] += scores2d[j][i];
                }
                subjectAverage[i] = subjectAverage[i] / scores2d.length;
            }

            double[] avgStu = bubbleSort(studentAverage, studentAverage.length,asc);//주소값을 매개변수로 보내면 따로 배열을 또 선언하지 않아도 되지만
            double[] avgSub = bubbleSort(subjectAverage, subjectAverage.length,desc);//잘 안되서 이렇게 했습니다.

            System.out.println("학생번호   국어성적   수학성적  영어성적");
            for (int i = 0; i < scores2d.length; i++) {//5
                System.out.print((i + 1) + "         ");
                for (int j = 0; j < scores2d[i].length; j++) {//3
                    System.out.print(scores2d[i][j] + "        ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("각 학생별 과목 성적평균 오름차순");

            for (int i = 0; i <avgStu.length; i++) {
                System.out.print(avgStu[i]+ "점  ");
            }
            System.out.println("\n\n각 과목별 학생 평균 내림차순\n영어\t\t수학\t\t국어");
            for (int i = 0; i < avgSub.length; i++) {
                System.out.print(avgSub[i] + "점  ");
            }
            /*예제처럼 깔끔하게 출력하고 싶었는데 기술력이 부족해서 못했습니다.*/
        }
    }