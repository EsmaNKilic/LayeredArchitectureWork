package oopWithNLayeredApp.dataAccess;
import oopWithNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Eðitmen JDBC ile veritabanýna eklendi.");
	}
}
