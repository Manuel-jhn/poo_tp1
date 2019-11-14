package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	@Test
	public void test() throws LimiteVisiteurException, AnimalDansMauvaisSecteurException {
		
		Zoo z = new Zoo();
		Chat chat = new Chat();
		Chien chien = new Chien();
		
		z.ajouterSecteur("Canin");
		
		for(int i = 0 ; i<14 ; i++)
		{
			z.nouveauVisiteur();		
		}	
		try {
			z.nouveauVisiteur();
			fail("exception visiteur non lancee");
		} 
		catch(LimiteVisiteurException e)
		{
			
		}
		
		
		z.nouvelAnimal(chien);
		try {
			z.nouvelAnimal(chat);
			fail("exception secteur non lancee");
		}
		catch( AnimalDansMauvaisSecteurException e) {
			
		}
		
		
		
	}

}
