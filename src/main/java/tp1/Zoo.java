package tp1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private int visiteurs;
	List<Secteur> secteursAnimaux;
	
	Zoo(){
		secteursAnimaux = new ArrayList<Secteur>();
	}
	
	public void ajouterSecteur(String s) {
		Secteur secteur = new Secteur(s);
		this.secteursAnimaux.add(secteur);
	}
	
	public void nouveauVisiteur() throws LimiteVisiteurException
	{
		if(visiteurs >= getLimiteVisiteur())
		{
			throw new LimiteVisiteurException();
		}
		else
		{
			this.visiteurs++;
		}
		
	}
	
	public int getLimiteVisiteur() {
		return secteursAnimaux.size() *15;
	}
	
	public void nouvelAnimal(Animal newAnimal) throws AnimalDansMauvaisSecteurException {
		for( Secteur i : secteursAnimaux)
		{
			if ( i.obtenirType().contentEquals(newAnimal.getTypeAnimal()))
			{
				i.ajouterAnimal(newAnimal);
			}
			else
			{
				throw new AnimalDansMauvaisSecteurException();
			}
		}
	}
	
	public int nombreAnimaux() {
		int nbAnimaux = 0;
		for( Secteur i : secteursAnimaux)
		{
			nbAnimaux += i.getNombreAnimaux();
		}
		return nbAnimaux;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
