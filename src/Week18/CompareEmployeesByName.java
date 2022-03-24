package Week18;

import java.util.Comparator;

public class CompareEmployeesByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e3) {
		return e1.getName().compareTo(e3.getName());
	}
}