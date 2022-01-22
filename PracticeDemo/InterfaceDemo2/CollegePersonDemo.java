package InterfaceDemo2;

public class CollegePersonDemo {
public static void main(String[] args) {
	Resume r = new Student();
	
	r.getBioData();
	r.getInstitute();
	
	System.out.println();
	
	Resume r2 = new Teacher();
	
	r2.getBioData();
	r2.getInstitute();
	
	System.out.println();
	
	Student student1 = new Student("Tony", "MIT");
	student1.getBioData();
	student1.getInstitute();
	student1.branch();
	student1.result();
	
	System.out.println();
	
	Teacher t1 = new Teacher("Bryant", "SCSU");
	t1.getBioData();
	t1.getInstitute();
	t1.qualification();
	t1.experience();
	
	
	
}

}
