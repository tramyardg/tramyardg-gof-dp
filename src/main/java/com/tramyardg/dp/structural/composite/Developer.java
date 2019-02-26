package com.tramyardg.dp.structural.composite;

import com.tramyardg.util.LoggerSingleton;

public class Developer implements Employee {

    private String name;
    private String department;
    private double salary;

    public Developer(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void add(Employee e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Employee e) {
        throw new UnsupportedOperationException();
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
    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

}
