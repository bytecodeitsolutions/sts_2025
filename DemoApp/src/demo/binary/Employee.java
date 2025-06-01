package demo.binary;

public class Employee {
	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
