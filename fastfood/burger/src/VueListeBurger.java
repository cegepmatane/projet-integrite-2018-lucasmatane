

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VueListeBurger extends Application
{
	private GridPane grilleBurger = null;
	
	@Override
	public void start(Stage stade) throws Exception {
		Pane panneau = new Pane();	
 		grilleBurger = new GridPane();
 		
 		
 		panneau.getChildren().add(grilleBurger);
 		stade.setScene(new Scene(panneau, 400, 400));
 		stade.show();		
 		
 		List listeBurgerTest = new ArrayList<Burger>();
 		listeBurgerTest.add(new Burger("Cheesy", "Mozza", "3$12", "Steack"));
 		listeBurgerTest.add(new Burger("Backone", "Cheddar", "2$12", "Beacon"));
 		listeBurgerTest.add(new Burger("Giant", "Cheddar et Mozza", "3$70", "Steack"));
 		listeBurgerTest.add(new Burger("Carnivore", "Cheddar", "3$", "steack + Cheddar"));
 		this.afficherListeBurger(listeBurgerTest); 
		
	}
	
	public void afficherListeBurger(List<Burger> listeBurger)
	{
		this.grilleBurger.getChildren().clear();
		
		int numero = 0;
		this.grilleBurger.add(new Label("Nom"), 0, numero);
		this.grilleBurger.add(new Label("Viande"), 1, numero);	
		for(Burger burger : listeBurger)
		{
			numero++;
			this.grilleBurger.add(new Label(burger.getNom()), 0, numero);
			this.grilleBurger.add(new Label(burger.getViande()), 1, numero);		
			this.grilleBurger.add(new Label(burger.getFromage()), 2, numero); 
			this.grilleBurger.add(new Label(burger.getPrix()), 3, numero); 
			//this.grilleBurger.add(new Button("Editer"), 2, numero);
		}
		
	}


	
	


}
