package me.project.smartstore.customer;

import me.project.smartstore.group.Group;
import me.project.smartstore.group.Groups;
import me.project.smartstore.group.Parameter;

import java.util.Arrays;
import java.util.Objects;

import static me.project.smartstore.menu.Menu.*;

public class Customers{


    private Customer[] customers;
    private int size;
    private int index = 0;

    public Customers() {
        this.customers = new Customer[10];
        this.size = 10;
    }
    public Customers(int size){
        customers = new Customer[size];
    }

    public Customers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }
    public Customer[] cutNull(int size){
        Customer[] result = Arrays.copyOf(customers,size);
        return result;
    }


    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
    public int size() {
        return index;
    }

    public Customer get(int index){
        return getCustomers()[index];
    }
    public void add(Customer customer){
        if(isFull()){
            size *= 2;
            Customer[] tempArr = new Customer[size];
            System.arraycopy(customers,0,tempArr,0,index);
            customers = new Customer[size];
            System.arraycopy(tempArr,0,customers,0,index);
        }
        getCustomers()[index] = customer;
        index++;
    }
    public boolean isFull(){
        return index == size;
    }
    public void remove(int input){
        if(isEmpty()){
            System.out.println("배열이 비어 있어서 삭제 불가능");
            return;
        }
        if(input > index){
            System.out.println("배열의 범위를 벗어났습니다.");
            return;
        }
        getCustomers()[input] = null;
        for(int i = input ;i < index ; i++){
            getCustomers()[i] = getCustomers()[i+1];
        }
        index--;
    }
    public Customers[] groupByCustomer(){

        int index = size();
        Customers oC = new Customers(index);
        Customers gC = new Customers(index);
        Customers vC = new Customers(index);
        Customers vvC = new Customers(index);
        int oIDx = 0;
        int gIDx = 0;
        int vIDx = 0;
        int vvIDx = 0;
        if(g.getParameter().getMinimumSpentTime() !=0 && g.getParameter().getMinimumTotalPay() !=0 &&
          v.getParameter().getMinimumSpentTime() !=0 && v.getParameter().getMinimumTotalPay() != 0 &&
          vv.getParameter().getMinimumSpentTime() !=0 && vv.getParameter().getMinimumTotalPay() !=0){
            for(int i = 0; i < index; i++){
                if (customers[i].getSpentTime() >= vv.getParameter().getMinimumSpentTime() && customers[i].getTotalPay() >= vv.getParameter().getMinimumTotalPay()) {
                    vvC.getCustomers()[vvIDx] = customers[i];
                    vvIDx++;
                } else if (customers[i].getSpentTime() >= v.getParameter().getMinimumSpentTime() && customers[i].getTotalPay() >= v.getParameter().getMinimumTotalPay()) {
                    vC.getCustomers()[vIDx] = customers[i];
                    vIDx++;
                } else if (customers[i].getSpentTime() >= g.getParameter().getMinimumSpentTime() && customers[i].getTotalPay() >= g.getParameter().getMinimumTotalPay()) {
                    gC.getCustomers()[gIDx] = customers[i];
                    gIDx++;
                } else {
                    oC.getCustomers()[oIDx] = customers[i];
                    oIDx++;
                }
            }
        }
        else{
            for(int i = 0; i < index; i++){
                oC.getCustomers()[oIDx] = customers[i];
                oIDx++;
            }
        }

        return new Customers[] {
                new Customers(oC.cutNull(oIDx)),
                new Customers(gC.cutNull(gIDx)),
                new Customers(vC.cutNull(vIDx)),
                new Customers(vvC.cutNull(vvIDx))};
    }
    public boolean isEmpty(){
        return index == 0;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers1 = (Customers) o;
        return size == customers1.size && Arrays.equals(customers, customers1.customers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(customers);
        return result;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customers=" + Arrays.toString(customers) +
                ", size=" + size +
                '}';
    }

}
