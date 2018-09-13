package Vue;
import java.util.ArrayList;
import java.util.List;

import Controleur.ControleurBurger;
import javafx.application.Application;
import javafx.stage.Stage;
import modele.Burger;

public class NavigateurDesVues extends Application{
	
	private Stage stade;
	
	private VueAjouterBurger vueAjouterMouton = null;
	private VueListeBurger vueListeMouton = null;
	private VueBurger vueMouton = null;
	
	private ControleurBurger controleur = null;
	
	public NavigateurDesVues() 
	{		
		this.vueAjouterMouton = new VueAjouterBurger();
		this.vueListeMouton = new VueListeBurger();
		this.vueMouton = new VueBurger();
	}
	

	@Override
	public void start(Stage stade) throws Exception {
		this.stade = stade;
		
		this.stade.setScene(null);
		this.stade.show();
	
		this.controleur = ControleurBurger.getInstance();
		this.controleur.activerVues(this);
	}	
	
	public VueAjouterBurger getVueAjouterBurger() {
		return vueAjouterBurger;
	}

	public VueListeBurger getVueListeBurger() {
		return vueListeBurger;
	}

	public Vue getVueBurger() {
		return vueBurger;
	}
	
	public void naviguerVersVueBurger() {
		stade.setScene(this.vueBurger);
		stade.show();
	}
	
	public void naviguerVersVueListeBurger()
	{
		stade.setScene(this.vueListeBurger);
		stade.show();		
	}
	
	public void naviguerVersVueAjouterBurger()
	{
		stade.setScene(this.vueAjouterBurger);
		stade.show();				
	}

	
}
