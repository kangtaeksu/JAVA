package kosta.data;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person() {}
	
	
	@Override
	public int compareTo(Person p) {
//나이기준의 오름차순
		if(age< p.age) {
			return -1;
		}else if(age>p.age) {
			return 1;
		}
		return 0;
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
