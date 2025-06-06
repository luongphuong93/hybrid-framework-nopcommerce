package practice;

import java.util.SortedMap;

public class EmployeeDRY {
    private String employeeName;
    private String employeePosition;
    private String employeeType;
    private String employeeSalary;
    private String employeeRate;

    public EmployeeDRY(String employeeName, String employeePosition, String employeeType, String employeeSalary, String employeeRate) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeType = employeeType;
        this.employeeSalary = employeeSalary;
        this.employeeRate = employeeRate;
    }

    public void showEmployeeInfor(){
        System.out.println("Name = " + this.employeeName);
        System.out.println("Position = " + this.employeePosition);
        System.out.println("Type = " + this.employeeType);

        if(this.employeeType.equalsIgnoreCase("Fulltime")){
            System.out.println("Salary = " + this.employeeSalary);
        }else{
            System.out.println("Rate = " + this.employeeRate);
        }
    }

    public static void main(String[] args) {
        EmployeeDRY kennygy = new EmployeeDRY("Kenny Gy","Developer", "Fulltime","5000","");
        kennygy.showEmployeeInfor();

        EmployeeDRY johnwick = new EmployeeDRY("John Wick","QA", "Part-time","","20");
        johnwick.showEmployeeInfor();
    }
}
