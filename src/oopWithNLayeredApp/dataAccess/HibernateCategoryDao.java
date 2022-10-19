package oopWithNLayeredApp.dataAccess;
import oopWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Kategori Hibernate ile veritabanýna eklendi.");
	}
}
