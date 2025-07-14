package com.demo.oops;

public class StaticVsInstance {
    public static void main(String[] args)
    {
        Employee.companyName="The Amazing Company";
        String companyName=Employee.companyName;
        System.out.println(companyName);

        Employee employee1=new Employee();
        employee1.employeeName="peter";
        System.out.println(employee1.employeeName);
        Employee employee2=new Employee();
    }


}
class Employee{
    public static String companyName="Ascendion";
    public String employeeName;
}
