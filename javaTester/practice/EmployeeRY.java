package practice;

public class EmployeeRY {
    public void showFullTimeKennyGyDetail(){
        System.out.println("Name = Kenny Gy");
        System.out.println("Position = Developer");
        System.out.println("Type = Fulltime");
        System.out.println("Salary = 4000");
    }

    public void showParttimeVinnothDetail(){
        System.out.println("Name = Vinnoth");
        System.out.println("Position = QA");
        System.out.println("Type = Parttime");
        System.out.println("Rate = 20");
    }

    public static void main(String[] args) {
        EmployeeRY employee = new EmployeeRY();
        employee.showFullTimeKennyGyDetail();
        employee.showParttimeVinnothDetail();
    }
}
