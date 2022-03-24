package Week18;

import java.util.Comparator;

public class CompareEmployeesByStatus implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getStatus().equalsIgnoreCase("FT") && o2.getStatus().equalsIgnoreCase("PT")) {
			return -1;
		} else if (o1.getStatus().equalsIgnoreCase("PT") && o2.getStatus().equalsIgnoreCase("FT")) {
			return 1;
		} else {
			return 0;
		}
		
	}

}
