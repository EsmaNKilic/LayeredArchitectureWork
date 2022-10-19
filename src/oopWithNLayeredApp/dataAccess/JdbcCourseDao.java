package oopWithNLayeredApp.dataAccess;
import oopWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Kurs JDBC ile veritabanýna eklendi.");
	}
}
