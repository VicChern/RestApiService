package com.vicchern.databasedemo;

import com.vicchern.databasedemo.persistence.entity.Person;
import com.vicchern.databasedemo.persistence.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args){
        List<Person> personList = personService.findAll();


        for (Person person : personList){
			System.out.println(person.toString());
		}

        Person person = personService.findById(1);

		System.out.println();
		System.out.println(person.toString());
		System.out.println("*");

		personService.deleteById(1);

		runTheListChanges(personList);

		updatePerson(personList);

		addPerson(personList);
	}

	private void addPerson(List<Person> personList) {
		Person berlinPerson = new Person();
		berlinPerson.setName("Toma");
		berlinPerson.setLocation("Berlin");
		berlinPerson.setBirthDate(new Date());

		personService.insertPerson(berlinPerson);

		runTheListChanges(personList);
	}

	private void updatePerson(List<Person> personList) {
		Person updatedPerson = personList.get(2);
		updatedPerson.setName("Jane");
		updatedPerson.setLocation("Bali");
		personList.set(1,updatedPerson);

		personService.updatePerson(personList.get(2));

		runTheListChanges(personList);
	}

	public void runTheListChanges(List<Person> list){
		for (Person person : list){
			System.out.println("\n");
			System.out.println(person.toString());
		}
	}
}
