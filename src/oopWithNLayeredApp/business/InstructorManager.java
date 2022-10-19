package oopWithNLayeredApp.business;
import java.util.List;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.InstructorDao;
import oopWithNLayeredApp.dataAccess.JdbcInstructorDao;
import oopWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
}


// Bir katman baþka bir katmanýn classýný kullanýrken sadece interfacesinden eriþim kurmalýdýr.