package org.campus02.oop;

import java.util.ArrayList;
import java.util.List;

public class BMIAnalyzer extends PersonAnalyzer {
	List<Pair<Person, Double>>	result = new ArrayList<>();

	@Override
	public void analyze() {
		for (Person person : getPersons()) {
			result.add(new Pair<>(person, calcBMI(person)));
		}
		printResult(result);
	}

	public static void printResult(List<Pair<Person, Double>> results) {
		for (Pair<Person, Double> result : results) {
			System.out.println(String.format("%.2f", result.getSecond()));
		}
	}

	public double calcBMI (Person person) {
		double weight = person.getWeight();
		double height = person.getSize();
		return weight / (height / 100.0) * (height / 100.0);
	}

	public List<Pair<Person, Double>> getResult() {
		return result;
	}
}
