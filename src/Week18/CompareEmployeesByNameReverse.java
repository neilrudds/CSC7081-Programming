package Week18;

import java.util.Comparator;

public class CompareEmployeesByNameReverse implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
