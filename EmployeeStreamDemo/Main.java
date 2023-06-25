package EmployeeStreamDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      Department account = new Department("Account", 75); 
      Department hr = new Department("HR", 50);
      Department ops = new Department("OP", 25);
      Department tech = new Department("Tech", 150);

      List<Employee> employeeList = Arrays.asList(new  Employee("David", 32, "Matara", account), 
                           new  Employee("Brayan", 25, "Galle", hr),
                           new  Employee("JoAnne", 45, "Negombo", ops),
                           new  Employee("Jake", 65, "Galle", hr),
                           new  Employee("Brent", 55, "Matara", hr),
                           new  Employee("Allice", 23, "Matara", ops),
                           new  Employee("Austin", 30, "Negombo", tech),
                           new  Employee("Gerry", 29, "Matara", tech),
                           new  Employee("Scote", 20, "Negombo", ops),
                           new  Employee("Branden", 32, "Matara", account),
                           new  Employee("Iflias", 31, "Galle", hr));

         
        
//      Find all employees who lives in ‘Matara’ city, sort them by their name and print the names of employees.

        employeeList.stream().filter(e->e.getCity()
                             .equalsIgnoreCase("Matara"))
                             .sorted(Comparator.comparing(Employee::getName))
                             .forEach(e->System.out.println(e.getName()));

        //Sorting names in reverse order

        // employeeList.stream().filter(e->e.getCity()
        //                      .equalsIgnoreCase("Matara"))
        //                      .sorted(Comparator.comparing(Employee::getName).reversed())
        //                      .forEach(e->System.out.println(e.getName()));

        // employeeList.stream().filter(e->e.getCity()
        //             .equalsIgnoreCase("Matara"))
        //             .sorted((e1,e2)-> e1.getName().compareTo(e2.getName()))
        //             .forEach(e->System.out.println(e.getName()));

        
//      Find distinct department names that employees work for.

        employeeList.stream().map(e->e.getDepartment().getDepartmentName()).distinct().forEach(System.out::println);

        //Find the department names that these employees work for, where the number of employees in the department is over 50.

        employeeList.stream().filter(e->e.getDepartment().getNoOfEmployees()>50).map(e->e.getDepartment().getDepartmentName())
                    .distinct()
                    .forEach(e->System.out.println(e));

                    //OR

                    employeeList.stream()
                    .map(Employee::getDepartment)
                    .filter(d -> d.getNoOfEmployees() > 50)
                    .distinct()
                    .forEach(d -> System.out.println(d.getDepartmentName()));

        //Create a comma separate string of department names sorted alphabetically.

        String str = employeeList.stream().map(e->e.getDepartment().getDepartmentName())
                            .distinct()
                            .sorted()
                            .reduce("", (a,b)-> (a + ", "+b));

                            System.out.println(str);
        
        //How many employees from HR Department?

        Long n = employeeList.stream().filter(e->e.getDepartment().getDepartmentName().equalsIgnoreCase("HR")).count();
        System.out.println(n);

        //Are there any employees from HR Department?

       if(employeeList.stream().anyMatch(e->e.getDepartment().getDepartmentName().equalsIgnoreCase("HR"))) 
        System.out.println("Yes");

       //Print all employee’s name who are working for account department.

        employeeList.stream().filter(e->e.getDepartment().getDepartmentName().equalsIgnoreCase("Account")).forEach(e->System.out.println(e.getName()));
                    
        //What is the highest number of employees in all departments?

        employeeList.stream().map(e->e.getDepartment().getNoOfEmployees())
                             .reduce(Integer::max)
                             .ifPresent(System.out::println);

        // Employee res = employeeList.stream().max(Comparator.comparing(e->e.getDepartment().getNoOfEmployees())).get();
        // System.out.println(res.getDepartment().getNoOfEmployees());

        //Find the department which has the highest number of employees.

        employeeList.stream().map(Employee::getDepartment)
                             .max(Comparator.comparing(Department::getNoOfEmployees))
                             .ifPresent(d->System.out.println(d.getDepartmentName()));

        //Find the total number of employees in all the departments.

        employeeList.stream().map(e->e.getDepartment().getNoOfEmployees()).distinct().reduce(Integer::sum).ifPresent(System.out::println);

        String str1 = "AdilPathan";
        Long ans = str1.chars().mapToObj(o->(char) o).distinct().count();
        System.out.println(ans);

        List<Integer> list = Stream.of(1,2,3,4,5,6,7).collect(Collectors.toList());

        list.stream().sorted((e1,e2) -> e2 - e1);



    }
    
}
