package mvc;

public class Programa {
	public static void main(String[] args) {
		Student student = getFromDB();
		StudentView sv = new StudentView();
		
		StudentController sc = new StudentController(student, sv);
		
		sc.updateView();
		
		sc.setStudentName("Maína");
		
		sc.updateView();
	}
	
	public static Student getFromDB() {
		Student st = new Student();
		st.setNome("Luan Eleuterio");
		st.setMatricula("2020024521");
		return st;
	}
}
