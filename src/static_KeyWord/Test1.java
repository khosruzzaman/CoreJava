package static_KeyWord;

public class Test1 {
	public static void main(String[] args) {
		
		Student st1 = new Student("Khosru", 101);
		st1.displayInformation();
		//System.out.println(Student.universityName);
		
		System.out.println();
		
		Student st2 = new Student("zaman", 102);
		st2.displayInformation();
		//System.out.println(Student.universityName);
		System.out.println("\n");
		System.err.println("Non Static : "+ st1.quot.toUpperCase());
		System.out.println();
		System.err.println("Static : "+ Student.quots.toLowerCase());

	}

}
