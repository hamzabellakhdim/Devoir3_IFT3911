import java.util.ArrayList;
import java.util.Scanner;

public class CompagnieGestion implements Gestionnaire {
	ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
	private CompagnieSingleton cs = new CompagnieSingleton();

	public CompagnieGestion(){

	}

	public Compagnie ajouter() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'a' pour modifier une compagnie aerienne.");
		System.out.println("Tapez 'f' pour modifier une compagnie ferroviaire.");
		System.out.println("Tapez 'n' pour modifier une compagnie navale.\n\n\n\n");
		String typeCompany = myObj.nextLine();
		Compagnie com = null;
		switch(typeCompany){
			case "a":
				CompagnieAerienneFactory caf = cs.getAerialFactory();
				com = caf.create();
				break;
			case "f":
				CompagnieFerroviaireFactory cff = cs.getTrainCFactory();
				com = cff.create();
				break;
			case "n":
				CompagnieNavaleFactory cnf = cs.getNavalFactory();
				com = cnf.create();
				break;

			default:
				System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");

		}
		boolean flag = true;
		// TODO - implement CompagnieGestion.ajouter
		for (int i = 0; i < compagnies.size(); i++){
			Compagnie elem = compagnies.get(i);
			if(elem.idCompagnie == com.idCompagnie){
				System.out.println("element avec cet Id existe déjà ");
				flag = false;
				break;
			}
		}
		if(flag){
			compagnies.add(com);
		}
		myObj.close();
		return com;
	}

	public void notify_() {
		// TODO - implement CompagnieGestion.notify
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ModifCompagnie
	 */
	public void attach(int ModifCompagnie) {
		// TODO - implement CompagnieGestion.attach
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ModifCompagnie
	 */
	public void detach(int ModifCompagnie) {
		// TODO - implement CompagnieGestion.detach
		throw new UnsupportedOperationException();
	}


	public void supprimer(Compagnie C) {
		// TODO Auto-generated method stub
	}

	public void modifier(Compagnie C) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Object o) {
		// TODO Auto-generated method stub
		
	}

}