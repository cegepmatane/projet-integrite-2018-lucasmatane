import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage; 


public class VueListeBurger extends Scene
{
	protected GridPane grilleBurger;
		public VueListeBurger() {
			super(new Pane(), 400,400);
			Pane panneau = (Pane) this.getRoot();
			grilleBurger = new GridPane();
			
	panneau.getChildren().add(grilleBurger); 	
		
	}
	
		public void afficherListeBurger(List<Burger> listeBurger)
		{
			int numero = 0;
			this.grilleBurger.add(new Label("Nom"), 0, numero);
			this.grilleBurger.add(new Label("Prix"), 1, numero);			
			for(Burger burger : listeBurger)
			{
				numero++;
				this.grilleBurger.add(new Label(burger.getNom()), 0, numero);
				this.grilleBurger.add(new Label(burger.getPrix()), 1, numero);			
			}
		}

	}


