package ch01;

public class VIPCustomer extends Customer {

    double saleRatio;
    private String agentID;

    public VIPCustomer(){

        bonusRatio = 0.05;
        saleRatio = 0.;
        customerGrade = "VIP";

    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
