package me.day06.practice;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Practice07 {
    public static void main(String[] args) {

        final String jsonString = "{\n" +
                "\t\"name\": \"Molecule Man\",\n" +
                "\t\"age\": 29,\n" +
                "\t\"secretIdentity\": \"Dan Jukes\",\n" +
                "\t\"powers\": \"Radiation resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Madame Uppercut\",\n" +
                "\t\"age\": 39,\n" +
                "\t\"secretIdentity\": \"Jane Wilson\",\n" +
                "\t\"powers\": \"Damage resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Eternal Flame\",\n" +
                "\t\"age\": 1000000,\n" +
                "\t\"secretIdentity\": \"Unknown\",\n" +
                "\t\"powers\": \"Heat Immunity\"\n" +
                "}";
        String  jsonString2 = jsonString.replaceAll("[\t\n\\{\\}\"\\\"\"]","");//특수문자 제거
        String[] jsonString3 = jsonString2.split(","); //,기준으로 문자 나눔 총 12개로 나누어짐
        String[] jsonString4 = new String[jsonString3.length];//속성 담을 임시 문자형 배열
        String[] jsonString5 = new String[jsonString3.length];//값을 담을 임시 문자형 배열

        for (int i = 0; i <jsonString3.length ; i++) {
            String[] jsonString6 = jsonString3[i].split(":"); //: 기준으로 나누면 속성이랑 값이랑 나눠짐
            jsonString4[i] = jsonString6[0]; //속성
            jsonString5[i] = jsonString6[1]; //값
        }

        String[] jsonColumn = new String[4]; //속성은 4개만 필요하니 4개짜리 배열을 생성함
        for (int i = 0; i < jsonColumn.length; i++){ //뒤에는 버리고 앞에 4개만 저장함 어차피 앞에 4개만 필요함
            jsonColumn[i] = jsonString4[i];
        }

        int k = 0;
        String[][] jsonValue = new String[3][4]; //값을 담을 2차원 문자형 배열을 생성함
        for(int i = 0; i<jsonValue.length; i++){
            for (int j = 0; j<jsonValue[i].length; j++){
                jsonValue[i][j] =  jsonString5[k]; //1차원 배열에 담긴 값을 2차원배열에 넣기 위해 1차원배열에 접근하는 임시 변수를 둠
                k++;
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.print("|");
        for (int i = 0; i<jsonColumn.length; i++){
            System.out.printf("%24s",jsonColumn[i]);
            System.out.print(" |");
        }
        System.out.println("\n---------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jsonValue.length ; i++) {
            System.out.print("|");
            for (int j = 0; j < jsonValue[i].length ; j++) {
                System.out.printf("%24s",jsonValue[i][j]);
                System.out.print(" |");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");

    }
}