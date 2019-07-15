package practice;

public class Employee {
 String name;
 int age;
 
 public Employee(String name, int age) {
	 this.name=name;
	 this.age=age;
	 
 }
 public void workOnAssignment() {
	 
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public void main(String[] args) {
	Employee e= new Employee("Ram",10);
	//Employee e1= new Employee("Sita",20);
	System.out.println("Employee name:" +e.name);
	System.out.println("Employee age:" +e.age);
}
}
