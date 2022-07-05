package example08;

public class StudentEx {

	public static void main(String[] args) {
		
		Person<String, String> person = new Student<String, String, Integer>();
		person.setKind("황인종");
		person.setMode("전투태세");
		
		System.out.println(person.getKind() + " : " + person.getMode());
		
		System.out.println();
		
		Student<String, String, Integer> personStudent = new Student<>();
		personStudent.setKind("황인종");
		personStudent.setMode("전투태세");
		personStudent.setC(100);
		
		System.out.println(person.getKind() + " : " + person.getMode() + "\n전투력 : " + personStudent.getC());
		

	}

}
