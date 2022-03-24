package Week18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class CompareEmployeeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Matthew", 36, "FT");
		Employee e2 = new Employee("Zach", 18, "PT");
		Employee e3 = new Employee("Alice", 24, "FT");
		Employee e4 = new Employee("Bob", 50, "PT");
		
		//CompareEmployeesByName cName = new CompareEmployeesByName();
		//System.out.println(cName.compare(e1, e3));
		
		List<Employee> staffList = new LinkedList<Employee>();
		staffList.add(e1);
		staffList.add(e2);
		staffList.add(e3);
		staffList.add(e4);
		
		showAll(staffList);
		
		
		//Collections.sort(staffList, new CompareEmployeesByAge());
		//Collections.sort(staffList, new CompareEmployeesByNameReverse());
		Collections.sort(staffList, new CompareEmployeesByName());
		Collections.sort(staffList, new CompareEmployeesByStatus());
		
		showAll(staffList);

	}
	
	public static void showAll(List<Employee> inputList) {
		for(Employee e : inputList) {
			System.out.println(e);
		}
		System.out.println();
	}

}
