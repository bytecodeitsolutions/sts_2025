package demo.binary;

public class EmployeeBinarySearchApp {

	public static void main(String[] args) {
		Employee[] employees = new Employee[] { new Employee(111, "Raja"), new Employee(222, "Rani"),
				new Employee(333, "Raju"), new Employee(444, "Ramesh"), new Employee(555, "Ratnesh") };
		int targetId = 333;
		int index = binarySearchByEmpId(employees, targetId);
		if (index == -1) {
			System.out.println("Employee not found ");
		} else {
			System.out.println("Employee found ::" + employees[index] +" at="+index);
		}
	}

	public static int binarySearchByEmpId(Employee[] employees, int targetId) {
		int start = 0;
		int end = employees.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			int midId = employees[mid].getId();

			if (midId == targetId) {
				return mid;
			} else if (midId < targetId) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
