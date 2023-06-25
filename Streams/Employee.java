package Streams;

public class Employee {
    private int empId;
    private String empName;
    private int deptId;
    private String staus="active";
    private int salary;

    public Employee(int empId, String empName, int deptId, String staus, int salary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.staus = staus;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", deptId=" + deptId +
                ", staus='" + staus + '\'' +
                ", salary=" + salary +
                '}';
    }
}
