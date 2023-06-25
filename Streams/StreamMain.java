package Streams;


import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101,"adil",101,"active",2000));
        empList.add(new Employee(102,"sana",101,"active",5000));
        empList.add(new Employee(103,"adyan",102,"inactive",6000));
        empList.add(new Employee(104,"fuzaila",102,"inactive",4000));
        empList.add(new Employee(105,"saad",103,"active",3500));
        empList.add(new Employee(106,"fahad",103,"inactive",3500));
        empList.add(new Employee(107,"abdul",104,"active",3500));

        //empList.forEach(System.out::println);

        // Print emp details based on dept:
        System.out.println("Print emp details based on dept:");

        Map<Integer, List<Employee>> empListMapByDept =
                empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

        empListMapByDept.entrySet().forEach(System.out::println);

        //Print the count of employees in each dept:
        System.out.println("Print the count of employees in each dept");

        Map<Integer, Long> counMap =  empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));

        counMap.entrySet().forEach(System.out::println);

        //Print employees based on status :
        System.out.println("Print employees based on status");

        Map<String, List<Employee>> empByStatus = empList.stream().collect(Collectors.groupingBy(Employee::getStaus, Collectors.toList()));

        empByStatus.entrySet().forEach(System.out::println);

        //Print the active and inactive employees :
        System.out.println("Print the active and inactive employees ");

        List<Employee> activeList = empList.stream().filter(e->"active".equals(e.getStaus())).collect(Collectors.toList());

        System.out.println(activeList);

        //you can get count of active/inactive similarly :
        System.out.println("you can get count of active/inactive similarly: ");

        long activeCount = empList.stream().filter(e->"active".equals(e.getStaus())).count();

        System.out.println(activeCount);

        //.Write a program to print Max/Min employee salary from the given collection

        System.out.println(".Write a program to print Max/Min employee salary from the given collection");

         Employee e = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Max salary is : "+e.getSalary());

        Employee eMin = empList.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Min salary is : "+eMin.getSalary());

        //Write a program to print the max salary of an employee from each department
        System.out.println("Write a program to print the max salary of an employee from each department : ");

        Map<Integer, Optional<Employee>> empMaxSalaryDeptWise = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        empMaxSalaryDeptWise.entrySet().forEach(entry -> System.out.println("Dept "+entry.getKey()+"---"+entry.getValue()));


        //Sort all employees based on names

        System.out.println("Sort all employees based on names: ");

        empList.stream().sorted((e1,e2) ->e1.getEmpName().compareTo(e2.getEmpName())).toList().forEach(System.out::println);

        //Sort all employees based on salaries :
        System.out.println("Sort all employees based on salaries : ");

        empList.stream().sorted((e1,e2) -> e2.getSalary()-e1.getSalary()).toList().forEach(System.out::println);

        empList.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).forEach(e3-> { System.out.println(e3.getSalary()); } );

    }
}
