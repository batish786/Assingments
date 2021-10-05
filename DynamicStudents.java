package com.te.assingments.students;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicStudents {

	//  Fetching Particular Record
	public static void fetchParticular() {

		EntityManagerFactory factory = null;
		EntityManager  manager = null;
		EntityTransaction transaction = null;

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("enter RollNo : ");
			int id = scanner.nextInt(); 
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			String findBy = "from  Student where RollNo = :rollno";
			Query query =manager.createQuery(findBy);
			query.setParameter("rollno", id);
			Students student = (Students) query.getSingleResult();
			System.out.println(student);

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(factory != null) {
				factory.close();
				if(manager != null) {
					manager.close();
				}
			}
		}
		System.out.println("do want to continue press(y),else no(n) y/n");
	}

	// Perform Update Method with all members
	public static void update() {

		EntityManagerFactory factory = null;
		EntityManager  manager = null;
		EntityTransaction transaction = null;

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Rollno : ");
			int r = scanner.nextInt();
			System.out.println("Enter Name : ");
			String n = scanner.next();
			System.out.println("Enter PhoneNo : ");
			long  p = scanner.nextLong();
			System.out.println("Enter Section : ");
			String s = scanner.next();
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String update = "update Student set Name = :name , PhoneNo = :phno , Section = :section  where RollNo = :rollno";
			Query query =manager.createQuery(update);
			query.setParameter("rollno", r);
			query.setParameter("name", n);
			query.setParameter("phno", p);
			query.setParameter("section", s );
			int result = query.executeUpdate();
			transaction.commit();

		}catch (Exception e) {

			e.printStackTrace();

		}finally {
			if(factory != null) {
				factory.close();
				if(manager != null) {
					manager.close();
				}
				//				if(transaction != null) {
				//					//transaction.rollback();
				//					transaction.close();
				//				}
			}
		}

		System.out.println("do want to continue press(y),else no(n) y/n");
	}

	//  update with respect to name
	public static void updateWithName() {

		EntityManagerFactory factory = null;
		EntityManager  manager = null;
		EntityTransaction transaction = null;

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Rollno : ");
			int r = scanner.nextInt();
			System.out.println("Enter Name : ");
			String n = scanner.next();

			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String update = "update Student set Name = :name   where RollNo = :rollno";
			Query query =manager.createQuery(update);
			query.setParameter("rollno", r);
			query.setParameter("name", n);
			int result = query.executeUpdate();
			transaction.commit();

		}catch (Exception e) {

			e.printStackTrace();

		}finally {

			if(factory != null) {
				factory.close();
				if(manager != null) {
					manager.close();
				}
			}
		}

		System.out.println("do want to continue press(y),else no(n) y/n");
	}

	//  update With respect to Phone number 
	public static void updateWithPhoneno() {

		EntityManagerFactory factory = null;
		EntityManager  manager = null;
		EntityTransaction transaction = null;

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Rollno : ");
			int r = scanner.nextInt();
			System.out.println("Enter PhoneNo : ");
			long p = scanner.nextLong();

			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String update = "update Student set  PhoneNo = :phno   where RollNo = :rollno";
			Query query =manager.createQuery(update);
			query.setParameter("rollno", r);
			query.setParameter("phno", p);

			int result = query.executeUpdate();
			transaction.commit();

		}catch (Exception e) {

			e.printStackTrace();

		}finally {

			if(factory != null) {
				factory.close();
				if(manager != null) {
					manager.close();
				}
			}
		}

		System.out.println("do want to continue press(y),else no(n) y/n");

	}
	// update with respect to Session
	public static void UpdateWithSection() {

		EntityManagerFactory factory = null;
		EntityManager  manager = null;
		EntityTransaction transaction = null;

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Rollno : ");
			int r = scanner.nextInt();
			System.out.println("Enter Section : ");
			String s = scanner.next();

			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String update = "update Student set  Section = :section   where RollNo = :rollno";
			Query query =manager.createQuery(update);
			query.setParameter("rollno", r);
			query.setParameter("section", s);

			int result = query.executeUpdate();
			transaction.commit();

		}catch (Exception e) {

			e.printStackTrace();

		}finally {

			if(factory != null) {
				factory.close();
				if(manager != null) {
					manager.close();
				}
			}
		}

		System.out.println("do want to continue press(y),else no(n) y/n");
	}

	// feching All The Records 
	public static void fetchAll() {

		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			String findAll = "from Student";
			Query query =manager.createQuery(findAll);
			List<Students> list = query.getResultList();
			System.out.println(list);
			System.out.println("-----------");

			for (Students student : list) {
				System.out.println(student);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(factory != null) {
				factory.close();
			}
			if(manager != null) {
				manager.close();;
			}

		}
		System.out.println("do want to continue press(y),else no(n) y/n");
	}

	// perform Deleting Operation 
	public static void delete() {
		EntityManagerFactory factory = null;
		EntityManager  manager = null;
		EntityTransaction transaction = null;

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("enter RollNo  to remove : ");
			int i = scanner.nextInt();
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String delete = "delete from Student  where RollNo = :rollno";
			Query query =manager.createQuery(delete);
			//	query.setParameter("id", Integer.parseInt(args[0]));
			query.setParameter("rollno", i);
			int result = query.executeUpdate();
			transaction.commit();

		}catch (Exception e) {

			e.printStackTrace();

		}finally {

			if(factory != null) {
				factory.close();
				if(manager != null) {
					manager.close();
				}
			}
		}
		System.out.println("do want to continue press(y),else no(n) y/n");
	}

}
