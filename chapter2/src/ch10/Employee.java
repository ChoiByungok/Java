package ch10;

public class Employee {

    private static int serialNum = 1000;
    private int employeeID;
    private String employeeName;
    private String department;

    public Employee(){

        serialNum++;
        employeeID = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeID() {
        return employeeID;
    }


    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
