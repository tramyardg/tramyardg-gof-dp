package com.tramyardg.dp.structural.composite;

import com.tramyardg.util.LoggerSingleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

    private String name;
    private String department;
    private double salary;
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void add(Employee e) {
        employees.add(e);
    }

    @Override
    public void remove(Employee e) {
        employees.remove(e);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("[name=" + getName() + ", salary=" + getSalary() + "]");
        for (Employee emp : employees) {
            emp.print();
        }
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

}
