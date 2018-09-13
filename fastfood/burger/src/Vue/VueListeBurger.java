
package Vue;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Burger;

public class VueListeBurger extends Scene {

	protected GridPane grilleBurger;
	
	public VueListeBurger() {
		super(new GridPane(), 400,400);
		grilleBurger = (GridPane) this.getRoot();
	}
	
	public void afficherListeMouton(List<Burger> listeBurger)
	{
		this.grilleBurger.getChildren().clear();
		
		int numero = 0;
		this.grilleBurger.add(new Label("Nom"), 0, numero);
		this.grilleBurger.add(new Label("Naissance"), 1, numero);			
		for(Burger burger : listeBurger)
		{
			numero++;
			this.grilleBurger.add(new Label(burger.getNom()), 0, numero);
			this.grilleBurger.add(new Label(burger.getViande()), 1, numero);			
		}
	}

}