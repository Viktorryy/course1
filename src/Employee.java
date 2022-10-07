public class Employee {
    private String FIO;
    private String Department; // можно было сделать тип int, т.к. по условию названия отделов цифры  1-5
    private float salary;
    private int id;

    public Employee(String FIO, String Department, float salary, int id) {
        this.FIO = FIO;
        this.Department = Department;
        this.salary = salary;
        this.id = id;
    }
    public String getDepartment() {
        return Department;
    }
    public String getFIO() {
        return FIO;
    }
    public float getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "ФИО "+this.getFIO() + ", отдел " + this.getDepartment() + ", зарплата " + this.getSalary() + ", ID сотрудника " + this.getId();
    }
}




