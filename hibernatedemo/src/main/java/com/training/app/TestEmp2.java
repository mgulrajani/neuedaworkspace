package com.training.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestEmp2 {

    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("empPU");

        EntityManager em =  factory.createEntityManager();


    }
}
