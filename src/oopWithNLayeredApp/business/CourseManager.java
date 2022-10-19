package oopWithNLayeredApp.business;
import java.util.List;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.dataAccess.JdbcCourseDao;
import oopWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if(course.getPrice() < 0) {
			throw new Exception("Kurs fiyatý 0'dan küçük olamaz.");
		}
		if(course.getName().equals(course.getName())) {
			throw new Exception("Bu kurs ismi zaten mevcut. Kurs ismi tekrar edemez.");
		}
		
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
