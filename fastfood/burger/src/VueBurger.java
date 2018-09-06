import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class VueBurger extends Application {

	protected Label valeurNom;
	protected Label valeurFromage;
	protected Label valeurPrix;
	protected Label valeurViande;
	
	
	
	public void start(Stage stade) throws Exception {
		
 		Pane panneau = new Pane();	
		GridPane grilleBurger = new GridPane();

		
		valeurNom = new Label("");
		grilleBurger.add(new Label("Nom : "), 0, 0);
		grilleBurger.add(valeurNom, 1, 0);
		
		valeurFromage = new Label("");
		grilleBurger.add(new Label("fromage : "), 0, 1);
		grilleBurger.add(valeurFromage, 1, 1);

		valeurPrix = new Label("");
		grilleBurger.add(new Label("Prix : "), 0, 2);
		grilleBurger.add(valeurPrix, 1, 2);		

		valeurViande = new Label("");
		grilleBurger.add(new Label("Viande : "), 0, 3);
		grilleBurger.add(valeurViande, 1, 3);			
		
		panneau.getChildren().add(grilleBurger);
		stade.setScene(new Scene(panneau, 400, 400)); 
		stade.show();

		}
	
	/*public void afficherBurger(Burger burger)
	{
		this.valeurNom.setText(burger.getNom());
		this.valeurFromage.setText(burger.getFromage());
		this.valeurPrix.setText(burger.getPrix());
		this.valeurViande.setText(burger.getViande());	
	}*/


	
	

}