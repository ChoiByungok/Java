package me.project.smartstore.customer;

import me.project.smartstore.group.Group;
import me.project.smartstore.group.Groups;
import me.project.smartstore.group.Parameter;

import java.util.Arrays;
import java.util.Objects;

public class Customers {


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

    public Customers(Customer[] customers, int size) {
        this.customers = customers;
        this.size = size;
    }

    public Customer[] getCustomers() {
        return customers;
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
    public Customers[] groupByCustomer(Group g , Group v , Group vv){
        Customers oC = new Customers(customers.length);
        Customers gC = new Customers(customers.length);
        Customers vC = new Customers(customers.length);
        Customers vvC = new Customers(customers.length);

        int oIDx = 0;
        int gIdx = 0;
        int vIdx = 0;
        int vvIdx = 0;
        if(g == null && v == null && vv == null){
            for(int i = 0 ; i < customers.length ; i++){
                oC.getCustomers()[i] = getCustomers()[i];
                oIDx++;
            }
        }else{
            for(int i = 0 ; i < customers.length ; i++){
                if(getCustomers()[i].getSpentTime() < g.getParameter().getMinimumSpentTime() && getCustomers()[i].getTotalPay() < g.getParameter().getMinimumTotalPay()){
                    oC.getCustomers()[i] = getCustomers()[i];
                    oIDx++;
                } else if (getCustomers()[i].getSpentTime() < v.getParameter().getMinimumSpentTime() && getCustomers()[i].getTotalPay() < v.getParameter().getMinimumTotalPay()) {
                    gC.getCustomers()[i] = getCustomers()[i];
                    gIdx++;
                }else if(getCustomers()[i].getSpentTime() < vv.getParameter().getMinimumSpentTime() && getCustomers()[i].getTotalPay() < vv.getParameter().getMinimumTotalPay()){
                    vC.getCustomers()[i] = getCustomers()[i];
                    vIdx++;
                }else{
                    vvC.getCustomers()[i] = getCustomers()[i];
                    vvIdx++;
                }
            }
        }


        return new Customers[] {oC,gC,vC,vvC};
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
