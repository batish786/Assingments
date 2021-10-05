package com.te.assingments.students;

import java.util.Collections;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentInsert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Students student = new  Students();

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try { 



			System.out.println("Enter the RollNo : ");
			int roll = scanner.nextInt();

			System.out.println("Enter the name : ");
			String name = scanner.next();

			System.out.println("Enter the phoneNo : ");
			long  phoneNo = scanner.nextLong();


			student.setPhnno(roll);
			student.setName(name);
			student.setPhnno(phoneNo);

			factory = Persistence.createEntityManagerFactory("emp"); 
			manager = factory.createEntityManager(); 
			transaction = manager.getTransaction(); 
			transaction.begin();


			manager.persist(student);
			transaction.commit();   

		}catch (Exception e) {
			e.printStackTrace();
			if(transaction != null) {
				transaction.rollback();
			}
		}finally {
			if(manager != null) {
				manager.close();
			}

			if(factory != null) {
				factory.close();
			}
		}

	}
}



