package ch09;

public class Subway {

    private String subwayID;
    private int money;
    private int passengerCount;

    public Subway(String subwayID){

        this.subwayID = subwayID;
    }

    public void take(int money){

        this.money += money;
        passengerCount++;
    }
    public void showSubwayInfo(){

        System.out.println(subwayID + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
}
