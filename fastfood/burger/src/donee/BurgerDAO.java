package donee;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 import modele.Burger;
 
 public class BurgerDAO {
 	
 	private List<Burger> simulerListerBurger()
 	{
 		List listeBurgerTest = new ArrayList<Burger>();
 		listeBurgerTest.add(new Burger("Simple", "fromage", "1$", "Steack"));
 		listeBurgerTest.add(new Burger("Double", "Cheddar", "2$", "Poulet"));
 		listeBurgerTest.add(new Burger("frenchy", "creme", "2$", "Dinde"));
 		listeBurgerTest.add(new Burger("Cheesy", "Cheddar", "3$", "Steack"));
 		return listeBurgerTest;
	}
	public List<Burger> listerBurger()
	{
		
		String BASEDEDONNEES_DRIVER = "org.postgresql.Driver";
		String BASEDEDONNEES_URL = "jdbc:postgresql://localhost:5432/burger";
		String BASEDEDONNEES_USAGER = "admin";
		String BASEDEDONNEES_MOTDEPASSE = "admin";
		
		try {
			Class.forName(BASEDEDONNEES_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			DriverManager.getConnection(BASEDEDONNEES_URL, BASEDEDONNEES_USAGER, BASEDEDONNEES_MOTDEPASSE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.simulerListerBurger();
	}
}