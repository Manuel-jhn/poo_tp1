package tp1;

import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {
	private Zoo z;
	private static final Logger logger = LogManager.getLogger(App.class) ;
	/* Test */
	public static void main(String[] args) throws LimiteVisiteurException, AnimalDansMauvaisSecteurException {
		
		Logger logger = LogManager.getLogger();
		// TODO Auto-generated method stub
		Chat chat = new Chat();
		Chien chien = new Chien();
		
		Zoo z = new Zoo();
		z.ajouterSecteur("Canin");
		z.ajouterSecteur("Felin");
		/*for(int i = 0 ; i<10 ; i++)
		{
			System.out.println(i);
			z.nouveauVisiteur();
		}*/
		
		System.out.println("IL y a : "+z.secteursAnimaux.size()+" secteurs");
		z.nouvelAnimal(chien);
		z.nouvelAnimal(chat);
		z.nouvelAnimal(chien);
		System.out.println("Il y a : "+z.nombreAnimaux()+" animaux");
		System.out.println("il y a une limite de : "+z.getLimiteVisiteur()+" visiteurs");
		
		
		logger.info(" Nouvel animal : "+chat.getClass().toString());
		logger.trace(" Nouvel animal : "+chat.getClass().toString());
		logger.debug(" Nouvel animal : "+chat.getClass().toString());
		logger.warn(" Nouvel animal : "+chat.getClass().toString());
		logger.error(" Nouvel animal : "+chat.getClass().toString());
		logger.fatal(" Nouvel animal : "+chat.getClass().toString());
	}	
}
