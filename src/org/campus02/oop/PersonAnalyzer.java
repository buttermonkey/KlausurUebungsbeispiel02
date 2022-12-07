package org.campus02.oop;

import java.util.List;

public abstract class PersonAnalyzer {
	private List<Person> persons;

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	protected List<Person> getPersons() {
		return persons;
	}

	abstract public void analyze();
}
