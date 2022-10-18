package ch04;

public class Test {

    public static void main(String[] args) {

        Person person = new Person(180,78,"남성","Tomas",37);

        System.out.println(person.showPersonInfo());
        System.out.println();

        Order order = new Order("202011020003","01023450001","서울시 강남구 역삼동 111-333","20201102","130258",35000,"0003");

        order.showOrderInfo();
    }
}
