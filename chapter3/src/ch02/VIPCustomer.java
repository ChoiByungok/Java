package ch02;

public class VIPCustomer extends Customer {

    double saleRatio;
    private String agentID;

    /*public VIPCustomer(){

        bonusRatio = 0.05;
        saleRatio = 0.;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");

    }*/
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
