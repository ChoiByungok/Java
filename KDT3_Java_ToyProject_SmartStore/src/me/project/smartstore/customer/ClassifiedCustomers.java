package me.project.smartstore.customer;

import me.project.smartstore.group.Parameter;

import java.util.Arrays;
import java.util.Objects;

public class ClassifiedCustomers {

     private Customers[] classifiedCustomers;

    public ClassifiedCustomers(){
        classifiedCustomers = new Customers[4];
    }

    public Customers[] getClassifiedCustomers() {
        return classifiedCustomers;
    }

    public void setClassifiedCustomers(Customers[] classifiedCustomers) {
        this.classifiedCustomers = classifiedCustomers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassifiedCustomers that = (ClassifiedCustomers) o;
        return Arrays.equals(classifiedCustomers, that.classifiedCustomers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(classifiedCustomers);
    }

    @Override
    public String toString() {
        return "==============================================\n OTHERS : " +
                Arrays.toString(getClassifiedCustomers()[0].getCustomers()) + "\n" +
                "=============================================\n GENERAL : " +
                Arrays.toString(getClassifiedCustomers()[1].getCustomers()) + "\n" +
                "=============================================\n VIP : " +
                Arrays.toString(getClassifiedCustomers()[2].getCustomers()) + "\n" +
                "=============================================\n VVIP : " +
                Arrays.toString(getClassifiedCustomers()[3].getCustomers());
    }
}
