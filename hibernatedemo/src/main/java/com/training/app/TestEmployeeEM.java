package com.training.app;

import com.training.entities.Employee;
import jakarta.persistence.*;

import java.util.List;

public class TestEmployeeEM {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("empPU");

         EntityManager em =  factory.createEntityManager();

         Query query = em.createQuery("select e from Employee e");

         List<Employee> list = query.getResultList();
        System.out.println(list);

        EntityTransaction tx =  em.getTransaction();

        tx.begin();
        Query query2 = em.createQuery("update Employee e set e.salary = e.salary +1000");

        query2.executeUpdate();
        tx.commit();




        TypedQuery<Employee> query3 =
                em.createQuery("select e from Employee e where e.name like 'Ja%'",Employee.class);


        Employee e1 =  query3.getSingleResult();
        System.out.println(e1);


        tx.begin();
        Employee sheena = new Employee("sheena  d","IT",45555D);
        em.persist(sheena);
        tx.commit();

        System.out.println("The new employee was added with given Id"+sheena.getId());

        System.out.println("After updating name to Sheena T");



        tx.begin();
        sheena.setName("Siya");
        em.merge(sheena);
        tx.commit();



        Query query4 = em.createQuery("select e from Employee e");

        List<Employee> list4= query4.getResultList();
        System.out.println(list4);




        //select delete update

//query.getSingleResult
    }
}
