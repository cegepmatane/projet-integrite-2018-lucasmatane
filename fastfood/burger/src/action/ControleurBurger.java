package action;

import java.util.List;

import donee.BurgerDAO;
import modele.Burger;
import Vue.NavigateurDesVues;
import Vue.VueAjouterBurger;
import Vue.VueListeBurger;
import Vue.VueBurger;

public class ControleurBurger {
	
	private NavigateurDesVues navigateur;
	private VueAjouterBurger vueAjouterBurger = null;
	private VueListeBurger vueListeBurger= null;
	private VueBurger vueBurger = null;
		
	private ControleurBurger()
	{
		System.out.println("debut du controleur");		
	}
	
	public void activerVues(NavigateurDesVues navigateur)
	{
		this.navigateur = navigateur;
		this.vueAjouterBurger = navigateur.getVueAjouterBurger();
		this.vueBurger = navigateur.getVueBurger();
		this.vueListeBurger = navigateur.getVueListeBurger();
						
		Burger burger= new Burger("MacBurger", "raclette", "3$", "chorrizo");
		this.vueBurger.afficherBurger(burger); 			
		
		this.navigateur.naviguerVersVueBurger();
		
		BurgerDAO burgerDAO = new BurgerDAO();
		List<Burger> listeBurgerTest = BurgerDAO.listeBurger();
		this.vueListeBurger.afficherListeBurger(listeBurgerTest); 
		
		this.navigateur.naviguerVersVueListeBurger();		
				
	}
	
	private static ControleurBurger instance = null;
	public static ControleurBurger getInstance()
	{
		if(null == instance) instance = new ControleurBurger();
		return instance;
	}

}