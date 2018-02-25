package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.sir.tp2.datamodel.Department;
import fr.istic.sir.tp2.datamodel.ElectronicDevice;
import fr.istic.sir.tp2.datamodel.Employee;
import fr.istic.sir.tp2.datamodel.Heater;
import fr.istic.sir.tp2.datamodel.Home;
import fr.istic.sir.tp2.datamodel.Person;

public class JpaTest {
	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createEmployees();
			test.createPersons();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		test.listEmployees();
		test.listPerson();

		manager.close();
		System.out.println(".. done");
	}

	private void createEmployees() {
		int numOfEmployees = manager.createQuery("Select a From Employee a", Employee.class).getResultList().size();
		if (numOfEmployees == 0) {
			Department department = new Department("java");
			manager.persist(department);
			manager.persist(new Employee("Jakab Gipsz", department));
			manager.persist(new Employee("Captain Nemo", department));
		}
	}

	private void createPersons() {
		Heater heaterOne = new Heater();
		heaterOne.setHeaterDescription("petit");
		Person diego = new Person();
		Heater heaterTwo = new Heater();
		heaterTwo.setHeaterDescription("grand");
		ElectronicDevice electronicDevice = new ElectronicDevice();
		electronicDevice.setName("Oven");
		ElectronicDevice electronicDeviceTwo = new ElectronicDevice();
		electronicDeviceTwo.setName("Refrigerator");
		Home home = new Home();
		home.setName("Casa 1");
		home.addHeater(heaterOne);
		home.addHeater(heaterTwo);
		diego.setName("Diego");
		diego.setLastName("Cardenas");
		diego.setEmail("ejemplo@test.com");
		diego.addHomes(home);
		home.addElectronicDevice(electronicDevice);
		home.addElectronicDevice(electronicDeviceTwo);
		manager.persist(heaterOne);
		manager.persist(heaterTwo);
		manager.persist(electronicDevice);
		manager.persist(electronicDeviceTwo);
		manager.persist(home);
		manager.persist(diego);
	}

	private void listEmployees() {
		List<Employee> resultList = manager.createQuery("Select a From Employee a", Employee.class).getResultList();
		System.out.println("num of employess:" + resultList.size());
		for (Employee next : resultList) {
			System.out.println("next employee: " + next);
		}
	}

	private void listPerson() {
		List<Person> resultList = manager.createQuery("Select a from Person a", Person.class).getResultList();
		System.out.println("num of persons" + resultList.size());
		for (Person person : resultList) {
			System.out.println("next Person: " + person);
		}
	}
}
