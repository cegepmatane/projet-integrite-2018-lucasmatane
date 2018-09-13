package Vue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Burger;

public class VueBurger extends Scene{

	protected Label valeurNom;
	protected Label valeurFromage;
	protected Label valeurPrix;
	protected Label valeurViande;
	
	public VueBurger() {
		super(new GridPane(),400,400);
		GridPane grilleBurger = (GridPane) this.getRoot();

		// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html
		valeurNom = new Label("");
		grilleBurger.add(new Label("Nom : "), 0, 0);
		grilleBurger.add(valeurNom, 1, 0);
		
		valeurFromage = new Label("");
		grilleBurger.add(new Label("Couleur : "), 0, 1);
		grilleBurger.add(valeurFromage, 1, 1);

		valeurPrix = new Label("");
		grilleBurger.add(new Label("Poids : "), 0, 2);
		grilleBurger.add(valeurPrix, 1, 2);		

		valeurViande = new Label("");
		grilleBurger.add(new Label("Naissance : "), 0, 3);
		grilleBurger.add(valeurViande, 1, 3);				
	}
	
	public void afficherBurger(Burger burger)
	{
		this.valeurNom.setText(burger.getNom());
		this.valeurFromage.setText(burger.getFromage());
		this.valeurPrix.setText(burger.getPrix());
		this.valeurViande.setText(burger.getFromage());	
	}

}