package me.project.smartstore.customer;

import java.util.Objects;

public class Customer implements Comparable<Customer>{

    private static int serialNum = 1000;
    private int num;
    private String name;
    private String userID;
    private int spentTime;
    private int totalPay;

    public Customer(){
        serialNum++;
        num = serialNum;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return num == customer.num && spentTime == customer.spentTime && totalPay == customer.totalPay && name.equals(customer.name) && userID.equals(customer.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, userID, spentTime, totalPay);
    }

    @Override
    public String toString() {
        return "고객정보{" +
                "일련번호=" + num +
                ", 이름='" + name + '\'' +
                ", 유저ID='" + userID + '\'' +
                ", 소비시간=" + spentTime +
                ", 소비금액=" + totalPay +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
