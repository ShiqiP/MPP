package Lab10.prob2;

public class Employee extends Person {
	int id;
	int salary;
	
	public Employee(int id, String n, int s) {
		super(n);
		this.id = id;
		this.salary = s;
		
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(getName());
		sb.append(" salary: ");
		sb.append("" + salary);
		sb.append(" year of birth: ");
		return sb.toString();
		
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Employee)) return false;
		Employee em = (Employee) o;
		
		
		return em.getId() == id && em.getSalary() == salary;
	}
	
}

