package com.training.entities;


//1.to create ENtity  --done
//2. configure persistent unit   -- persistence.xml  --configuration file  , where
//3. entitymanager which will manage entities  -c-rud  -


import jakarta.persistence.*;

import javax.annotation.processing.Generated;

//JPA to persist this java object
//mandatory  --@Entity and @Id
@Entity //by default what will be the table
@Table(name="newemployee")
public class Employee {

    @Id  //mandatory
   @GeneratedValue(strategy = GenerationType.AUTO)  //not mandatory

    private Long id;

    private String name;
    private String dept;
    private Double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(Long id, String name, String dept, Double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee(String name, String dept, Double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
