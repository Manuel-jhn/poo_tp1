package tp1;

import java.util.Comparator;

public class comparateurAnimaux implements Comparator<Secteur>{
	public int compare(Secteur s1, Secteur s2)
	{
		return s1.getNombreAnimaux() -s2.getNombreAnimaux();
	}
}
