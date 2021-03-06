package Vue;

import action.ControleurBurger;
import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application{
	
	private Stage stade;
	
	private VueAjouterBurger vueAjouterBurger = null;
	private VueListeBurger vueListeBurger = null;
	private VueBurger vueBurger = null;
	
	private ControleurBurger controleur = null;
	
	public NavigateurDesVues() 
	{		
		this.vueAjouterBurger = new VueAjouterBurger();
		this.vueListeBurger = new VueListeBurger();
		this.vueBurger = new VueBurger();
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

	public VueBurger getVueBurger() {
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