package oopWithNLayeredApp.dataAccess;
import oopWithNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi.");
	}
}
