import java.util.Objects;

public class Employee {
    private String FIO;
    private String Department; // можно было сделать тип int, т.к. по условию названия отделов цифры  1-5
    private float salary;
    private int id;
    private static int countId;

    public Employee(String FIO, String Department, float salary, int id) {
        this.FIO = FIO;
        this.Department = Department;
        this.salary = salary;
        Employee.countId++;
        this.id = countId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.getSalary(), getSalary()) == 0 && getId() == employee.getId() && Objects.equals(getFIO(), employee.getFIO()) && Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFIO(), getDepartment(), getSalary(), getId());
    }
}




