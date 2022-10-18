package ch09;

public class Test {

    public static void main(String[] args) {

        Student studentT = new Student("Tomas",10000);
        Student studentJ = new Student("James",5000);

        Bus bus100 = new Bus("100");
        Subway subway2 = new Subway("2");

        studentJ.takeBus(bus100);
        studentT.takeSubway(subway2);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        subway2.showSubwayInfo();

        Student studentE = new Student("Edward",20000);

        Taxi taxiGood = new Taxi("잘나간다 운수");

        studentE.takeTaxi(taxiGood);

        studentE.showInfo();
        taxiGood.showTaxiInfo();
    }
}
