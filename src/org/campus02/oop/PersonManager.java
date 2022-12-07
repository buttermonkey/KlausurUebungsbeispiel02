package org.campus02.oop;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	private List<Person> persons = new ArrayList<>();

	public PersonManager() {
	}

	public void add(Person person) {
		persons.add(person);
	}

	public void doAnalysis(PersonAnalyzer analyzer) {
		analyzer.setPersons(persons);
		analyzer.analyze();
	}
}
