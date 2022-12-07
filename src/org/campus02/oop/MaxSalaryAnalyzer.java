package org.campus02.oop;

public class MaxSalaryAnalyzer extends PersonAnalyzer {
	@Override
	public void analyze() {
		int maxSalary = 0;
		for (Person person : getPersons()) {
			if (person.getSalary() > maxSalary)
				maxSalary = person.getSalary();
		}
		for (Person person : getPersons()) {
			if (person.getSalary() == maxSalary) {
				System.out.println(person);
			}
		}
	}
}
