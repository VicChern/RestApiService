package com.vicchern.jpaDemo;


import com.vicchern.jpaDemo.entity.Person;
import com.vicchern.jpaDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner{

	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
        List<Person> personList = personService.findAll();


		System.out.println();
        for (Person person : personList){
			System.out.println(person.toString());
		}

		Person person = personService.findById(1);

		System.out.println();
		System.out.println(person.toString());
		System.out.println("*");

		updatePerson(person);

		removePerson(person);
//
//		personService.deleteById(1);
//
//		runTheListChanges(personList);

//		updatePerson(personList);
	}
//		addPerson(personList);
//	}

//	private void addPerson(List<Person> personList) {
//		Person berlinPerson = new Person();
//		berlinPerson.setName("Toma");
//		berlinPerson.setLocation("Berlin");
//		berlinPerson.setBirthDate(new Date());
//
//		personService.insertPerson(berlinPerson);
//
//		runTheListChanges(personList);
//	}
//
	private void updatePerson(Person person) {
		person.setName("Jane");
		person.setLocation("Bali");

		personService.updatePerson(person);

		System.out.println("Updated person: ");
		System.out.println(person);
		System.out.println("*");

//		runTheListChanges(personList);
//	}
//
//	public void runTheListChanges(List<Person> list){
//		for (Person person : list){
//			System.out.println("\n");
//			System.out.println(person.toString());
//		}
	}

	private void removePerson(Person person) {
		personService.removePerson(person);

		System.out.println("Person was  removed!");
	}
}
