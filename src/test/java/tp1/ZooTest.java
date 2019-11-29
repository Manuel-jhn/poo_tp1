package tp1;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

import junit.framework.Assert;

public class ZooTest {

	@Test
	public void test() throws LimiteVisiteurException, AnimalDansMauvaisSecteurException {
		
		Zoo z = new Zoo();
		Chat chat = new Chat();
		Chien chien = new Chien();
		
		z.ajouterSecteur("Canin");
		
		for(int i = 0 ; i<15 ; i++)
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
	
	@Test
	public void testComparator() throws AnimalDansMauvaisSecteurException {
		Chat chat = new Chat();
		Chien chien = new Chien();
		
		Zoo z = new Zoo();
		z.ajouterSecteur("Canin");
		z.ajouterSecteur("Felin");
		z.nouvelAnimal(chien);
		z.nouvelAnimal(chat);
		z.nouvelAnimal(chien);
		comparateurAnimaux ca = new comparateurAnimaux();
		Collections.sort(z.secteursAnimaux, ca);
		assertEquals("Canin", z.secteursAnimaux.get(1).obtenirType());
	}

}
