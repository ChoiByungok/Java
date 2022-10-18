package ch09;

public class Bus {

    private String busID;
    private int money;
    private int passengerCount;

    public Bus(String busID){
        this.busID = busID;
    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showBusInfo(){

        System.out.println(busID + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
}
