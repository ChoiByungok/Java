package ch04;

public class Order {

    private String orderID;
    private String phoneNumber;
    private String address;
    private String date;
    private String orderTime;
    private int price;
    private String  menuNumber;

    public Order(String orderID, String phoneNumber, String address, String date, String orderTime, int price, String menuNumber){

        this.orderID = orderID;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public int getPrice() {
        return price;
    }

    public String  getMenuNumber() {
        return menuNumber;
    }

    public void showOrderInfo(){

        System.out.println("주문 접수번호 : " + getOrderID());
        System.out.println("주문 핸드폰 번호 : " + getPhoneNumber());
        System.out.println("주문 집 주소 : " + getAddress());
        System.out.println("주문 날짜 : " + getDate());
        System.out.println("주문 시간 : " + getOrderTime());
        System.out.println("주문 가격 : " + getPrice());
        System.out.println("주문 번호 : " + getMenuNumber());

    }
}
