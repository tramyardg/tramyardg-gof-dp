package com.tramyardg.dp.structural.composite;

public interface Employee {

    void add(Employee e);

    void remove(Employee e);

    String getName();

    String getDepartment();

    double getSalary();

    void print();

    Employee getChild(int i);

}
