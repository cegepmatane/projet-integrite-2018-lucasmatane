package Vue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modele.Burger;

public class VueAjouterBurger extends Scene {

	protected TextField valeurNom;
	protected TextField valeurFromage;
	protected TextField valeurPrix;
	protected TextField valeurViande;
	
	public VueAjouterBurger()  {
		super(new VBox(), 400, 400);
		VBox panneau = (VBox) this.getRoot();
		GridPane grilleBurger = new GridPane();

		
		valeurNom = new TextField();
		grilleBurger.add(new Label("Nom : "), 0, 0);
		grilleBurger.add(valeurNom, 1, 0);
		
		valeurFromage = new TextField("");
		grilleBurger.add(new Label("FRomage : "), 0, 1);
		grilleBurger.add(valeurFromage, 1, 1);

		valeurPrix = new TextField("");
		grilleBurger.add(new Label("Prix : "), 0, 2);
		grilleBurger.add(valeurPrix, 1, 2);		

		valeurViande = new TextField("");
		grilleBurger.add(new Label("Viande : "), 0, 3);
		grilleBurger.add(valeurViande, 1, 3);				
			
		panneau.getChildren().add(new Label("Ajouter un hamburger")); 
		panneau.getChildren().add(grilleBurger);
		panneau.getChildren().add(new Button("Enregistrer"));
	}
	
	public Burger demanderBurger()
	{
		Burger burger = new Burger(this.valeurNom.getText(), 
								this.valeurFromage.getText(), 
								this.valeurPrix.getText(), 
								this.valeurViande.getText());
		return burger;
	}

}