package org.example;

import java.util.List;

//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник
public class Main {

    public static void main(String[] args) {

        Directory directory = new Directory();
        Employee employee1 = new Employee(1, 111111111, "John", "Doe", 5);
        Employee employee2 = new Employee(2, 222222222, "Petja", "Pupkin", 5);
        Employee employee3 = new Employee(3, 333333333, "Lena", "Letuchaja", 3);
        Employee employee4 = new Employee(4, 444444444, "Vova", "Lenin", 2);
        Employee employee5 = new Employee(5, 555555555, "Vova", "Sinicha", 5);

        directory.employeesAdd(employee1);
        directory.employeesAdd(employee2);
        directory.employeesAdd(employee3);
        directory.employeesAdd(employee4);
        directory.employeesAdd(employee5);

        List<Employee> employeesByExperience = directory.employeesFindByExperience(5);
        for (Employee employee: employeesByExperience) {
            System.out.printf("Сотрудник со стажем %s лет %s\n " ,employee.getExperience() ,employee.getName() );
        }
        System.out.println();

        List<Employee> employeesByName = directory.employeesFindByName("Vova");
        for (Employee employee: employeesByName) {
            System.out.printf("Телефон сотрудника с именем %s фамилия %s - %s\n",employee.getName(),employee.getLastName(), employee.getPhoneNumber());
        }
        System.out.println();

        Employee employee = directory.employeesFindById(2);
        if (employee != null) {
            System.out.println("Сотрудник со ID 2 найден: " + employee.getName());
        } else {
            System.out.println("Сотрудник со ID 2 не найден:");
        }
    }
}