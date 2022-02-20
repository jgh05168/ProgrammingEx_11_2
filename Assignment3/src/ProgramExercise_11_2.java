
public class ProgramExercise_11_2 {
	public static void main(String[] args) {
		// Create a Person, Student, Employee, Faculty, and Staff objects
		Person person = new Person("Doe", "Oakwood street", "1111111111", "john1@gmail.com");

		Student student = new Student("May", "100 Street Ave", "2222222222", "may5@gmail.com", Student.FRESHMAN);

		Employee employee = new Employee("Lucas", "33 West Ave", "3333333333", "Luk34@gmail.com", 910, 50000);

		Faculty faculty = new Faculty("Sia", "28 Golfside Rd", "4444444444", "siafro3m@gmail.com", 103, 60000,
				"3pm to 5pm", "Professor");

		Staff staff = new Staff("Tim", "99 Country road", "5555555555", "Timmy2@gmail.com", 12, 65000,
				"Executive Assistant");

		// Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}