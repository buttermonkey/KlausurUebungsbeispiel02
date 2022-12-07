package org.campus02.oop;

import java.util.HashMap;
import java.util.Map;

public class CountryAnalyzer extends PersonAnalyzer {
	private Map<String, Integer> result = new HashMap<>();

	@Override
	public void analyze() {
		result.clear();
		for (Person person : getPersons()) {
			int count = 0;
			if (result.containsKey(person.getCountry()))
				count = result.get(person.getCountry());
			result.put(person.getCountry(), count);
		}
	}

	public Map<String, Integer> getResult() {
		return result;
	}
}
