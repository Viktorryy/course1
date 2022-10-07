public class EmployeeService {

    public static void listEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + 1 + ". " + (employees[i]));
        }
    }

    public static void listEmployeesFIO(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + 1 + ". " + employees[i].getFIO());
        }
    }

    public static void printSalaryMonth(Employee[] employees) {
        float sumSalaryMonth = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalaryMonth = sumSalaryMonth + employees[i].getSalary();
        }
        System.out.println(String.format("Общая сумму затрат на зарплаты в месяц: %.2f", sumSalaryMonth));
    }

    public static void printMeanSalaryMonth(Employee[] employees) {
        int ii = 0;
        float sumMeanSalaryMonth = 0;
        float sumSalaryMonth = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0) {
                sumSalaryMonth = sumSalaryMonth + employees[i].getSalary();
                ii = ii + 1;
            }
        }
        sumMeanSalaryMonth = sumSalaryMonth / ii;
        System.out.println(String.format("Cреднее значение зарплаты в месяц: %.2f", sumMeanSalaryMonth));
    }

    public static void printMinSalary(Employee[] employees) {
        String employeesMinFIO = "";
        float minSalaryMonth = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0 && minSalaryMonth == 0) {
                minSalaryMonth = employees[i].getSalary();
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryMonth && employees[i].getSalary() != 0) {
                minSalaryMonth = employees[i].getSalary();
                employeesMinFIO = employees[i].getFIO();
            }
        }
        System.out.println(employeesMinFIO + " - сотрудник c минимальным значением зарплаты в месяц: " + minSalaryMonth);
    }

    public static void printMaxSalary(Employee[] employees) {
        String employeesMaxFIO = "";
        float maxSalaryMonth = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0 && maxSalaryMonth == 0) {
                maxSalaryMonth = employees[i].getSalary();
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryMonth) {
                maxSalaryMonth = employees[i].getSalary();
                employeesMaxFIO = employees[i].getFIO();
            }
        }
        System.out.println(employeesMaxFIO + " - сотрудник c максимальным значением зарплаты в месяц: " + maxSalaryMonth);
    }

}
