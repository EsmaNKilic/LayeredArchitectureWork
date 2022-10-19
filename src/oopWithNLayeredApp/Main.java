package oopWithNLayeredApp;
import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.business.InstructorManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateCategoryDao;
import oopWithNLayeredApp.dataAccess.HibernateCourseDao;
import oopWithNLayeredApp.dataAccess.HibernateInstructorDao;
import oopWithNLayeredApp.dataAccess.JdbcCategoryDao;
import oopWithNLayeredApp.dataAccess.JdbcCourseDao;
import oopWithNLayeredApp.dataAccess.JdbcInstructorDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor1 = new Instructor(1, "Esma", "Kýlýç", 5000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		Course course1 = new Course(1, "Siber Güvenlik", 300);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		
		Category category1 = new Category(1, "Eðitim");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
	}

}
