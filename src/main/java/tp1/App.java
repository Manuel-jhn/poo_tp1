package tp1;

public class App {
	private Zoo z;
	

	public static void main(String[] args) throws LimiteVisiteurException, AnimalDansMauvaisSecteurException {
		// TODO Auto-generated method stub
		Chat chat = new Chat();
		Chien chien = new Chien();
		
		Zoo z = new Zoo();
		z.ajouterSecteur("Canin");
		//z.ajouterSecteur("Felin");
		for(int i = 0 ; i<10 ; i++)
		{
			System.out.println(i);
			z.nouveauVisiteur();
		}
		
		System.out.println("IL y a : "+z.secteursAnimaux.size()+" secteurs");
		z.nouvelAnimal(chien);
		z.nouvelAnimal(chat);
		System.out.println("Il y a : "+z.nombreAnimaux()+" animaux");
		System.out.println("il y a une limite de : "+z.getLimiteVisiteur()+" visiteurs");
	}

}
