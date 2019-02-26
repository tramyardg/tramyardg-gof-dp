package com.tramyardg.dp.structural.composite;

public class Client {

    public static void main(String[] args) {

        Employee employee1 = new Developer("Gavin Joyce", "Information Technology and Engineering", 55624);
        Employee employee2 = new Developer("Jenette Caldwell", "Information Technology and Engineering", 60323);
        Employee manager1 = new Manager("Jonas Alexander", "Information Technology and Engineering", 74128);
        manager1.add(employee2);
        manager1.add(employee1);

        Employee manager2 = new Manager("Michael Bruce", "Information Technology and Engineering", 80172);
        Manager manager3 = new Manager("Thor Walton", "Information Technology and Engineering", 98283);
        manager3.add(manager2);
        manager3.add(manager1);
        manager3.print();

    }

}
