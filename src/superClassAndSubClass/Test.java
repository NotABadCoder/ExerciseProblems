package superClassAndSubClass;

public class Test {
	public static void main(String args[]) {
		Person p=new Person("Varun","Sukhdeonagar");
		Student s=new Student("Varun","Sukhdeonagar","Cronos",2018,1333.5);
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
