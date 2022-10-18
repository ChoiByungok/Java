package me.project.smartstore.group;

import java.util.Objects;

public class Parameter {

   protected int minimumSpentTime = 0;
   protected int minimumTotalPay = 0;

   public Parameter(){}
   public Parameter(int minimumSpentTime, int minimumTotalPay){

       this.minimumSpentTime = minimumSpentTime;
       this.minimumTotalPay = minimumTotalPay;
   }

    public int getMinimumSpentTime() {
        return minimumSpentTime;
    }

    public void setMinimumSpentTime(int minimumSpentTime) {
        this.minimumSpentTime = minimumSpentTime;
    }

    public int getMinimumTotalPay() {
        return minimumTotalPay;
    }

    public void setMinimumTotalPay(int minimumTotalPay) {
        this.minimumTotalPay = minimumTotalPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter parameter = (Parameter) o;
        return minimumSpentTime == parameter.minimumSpentTime && minimumTotalPay == parameter.minimumTotalPay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumSpentTime, minimumTotalPay);
    }

    @Override
    public String toString() {
        return "최소시간= " + minimumSpentTime +
                ", 최소금액= " + minimumTotalPay
                ;
    }
}
