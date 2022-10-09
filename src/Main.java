public class Main {
    public static void main(String[] args) {


        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Савелий Иванович", "3", 81000, 0);
        employees[1] = new Employee("Иванов Иван Иванович", "1", 89000, 0);
        employees[2] = new Employee("Иванов Александр Иванович", "1", 80000, 0);
        employees[3] = new Employee("Иванов Алексей Иванович", "2", 70000, 0);
        employees[4] = new Employee("Иванов Антон Иванович", "2", 60000, 0);
        employees[5] = new Employee("Иванов Ибрагим Иванович", "5", 90000, 0);
        employees[6] = new Employee("Иванов Аристотель Иванович", "5", 85000, 0);
        employees[7] = new Employee("Иванов Даниил Иванович", "1", 75000, 0);
        employees[8] = new Employee("Иванов Аркадий Иванович", "4", 80000, 0);
        employees[9] = new Employee("Иванов Павел Иванович", "4", 85000, 0);




        // a.Получить список всех сотрудников со всеми имеющимися по ним данными
        System.out.println("Cписок всех сотрудников со всеми имеющимися по ним данными:");
        EmployeeService.printEmployees(employees);
        System.out.println();

        // b.Посчитать сумму затрат на зарплаты в месяц.
        EmployeeService.printSalaryMonth(employees);
        System.out.println();

        // c.Найти сотрудника с минимальной зарплатой
        EmployeeService.printMinSalary(employees);
        System.out.println();

        // d.Найти сотрудника с максимальной зарплатой.
        EmployeeService.printMaxSalary(employees);
        System.out.println();

        // e.Подсчитать среднее значение зарплат
        EmployeeService.printMeanSalaryMonth(employees);
        System.out.println();

        // f.Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.println("Cписок всех сотрудников:");
        EmployeeService.printEmployeesFIO(employees);

    }

}