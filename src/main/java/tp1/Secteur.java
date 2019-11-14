package tp1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
	
	private String typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur;
	
	Secteur(String tADS) {
		
		this.typeAnimauxDansSecteur = tADS;
		animauxDansSecteur = new ArrayList<Animal>();
	}
	
	public void ajouterAnimal(Animal a) {
		
		this.animauxDansSecteur.add(a);
	}
	
	public int getNombreAnimaux() {
		return this.animauxDansSecteur.size();
	}
	
	public String obtenirType() {
		return this.typeAnimauxDansSecteur;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
