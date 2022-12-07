package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer {
	public GenderAnalyzer() {
		super();
	}

	@Override
	public void analyze() {
		int numMales = 0;
		int numFemales = 0;
		int accHeightMales = 0;
		int accHeightFemals = 0;

		for (Person person : this.getPersons()) {
			if (person.getGender() == 'M') {
				numMales++;
				accHeightMales += person.getSize();
			}
			else if (person.getGender() == 'F') {
				numFemales++;
				accHeightFemals += person.getSize();
			}
			else {
				System.out.println("Error: person is neither male nor female: " + person.getFirstname()
						+ " " + person.getLastname());
			}
		}

		if (numMales > 0) {
			System.out.println("In der Liste existieren " + numMales +
					" Männer mit einer durchschnittlichen Körpergröße von " + (accHeightMales / numMales) + " cm.");
		}
		if (numFemales > 0) {
			System.out.println("In der Liste existieren " + numFemales +
					" Frauen mit einer durchschnittlichen Körpergröße von " + (accHeightFemals / numFemales) + " cm.");
		}
	}
}
