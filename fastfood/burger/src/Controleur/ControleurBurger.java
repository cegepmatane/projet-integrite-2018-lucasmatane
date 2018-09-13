package Controleur;

import java.util.ArrayList;
import java.util.List;

import accesseur.BurgerDAO;
import modele.Burger;
import Vue.NavigateurDesVues;
import Vue.VueAjouterBurger;
import Vue.VueListeBurger;
import Vue.VueBurger;

public class ControleurBurger {
	
	private NavigateurDesVues navigateur;
	private VueAjouterBurger vueAjouterBurger = null;
	private VueListeBurger vueListeBurger = null;
	private VueBurger vueBurger = null;
		
	private ControleurBurger()
	{
		System.out.println("Initialisation du controleur");		
	}
	
	public void activerVues(NavigateurDesVues navigateur)
	{
		this.navigateur = navigateur;
		this.vueAjouterBurger = navigateur.getVueAjouterBurger();
		this.vueBurger = navigateur.getVueBurger();
		this.vueListeBurger = navigateur.getVueListeBurger();
						
		//// TEST ////
		Burger burger = new Burger("Dolly", "Grise", "20 kg", "5 juin 2015");
		this.vueBurger.afficherBurger(burger); // Appel de ma fonction avant de la programmer (pour tester à mesure)					
		
		this.navigateur.naviguerVersVueBurger();
		
		/// TEST ///
		BurgerDAO burgerDAO = new BurgerDAO();
		List<Burger> listeBurgerTest = burgerDAO.listerBurger();
		this.vueListeBurger.afficherListeBurger(listeBurgerTest); // Appel de ma fonction avant de la programmer (pour tester à mesure)
		
		this.navigateur.naviguerVersVueListeBurger();		
				
		//this.navigateur.naviguerVersVueAjouterMouton();
	}
	
	// SINGLETON DEBUT
	private static ControleurBurger instance = null;
	public static ControleurBurger getInstance()
	{
		if(null == instance) instance = new ControleurBurger();
		return instance;
	}
	// SINGLETON FINI

}