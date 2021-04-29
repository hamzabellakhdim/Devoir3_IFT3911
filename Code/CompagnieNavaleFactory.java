import java.util.Scanner;

public class CompagnieNavaleFactory extends AbstractCompagnieFactory {

	public CompagnieNavale create() {
		Scanner myObj = new Scanner(System.in); 
		CompagnieNavale com;
		System.out.println("Veuillez rentrer l'id de la compagnie navale.\n\n\n\n");
		String id = myObj.nextLine();
		System.out.println("Veuillez rentrer le nom de la compagnie navale.\n\n\n\n");
		String nom = myObj.nextLine();
		com = new CompagnieNavale(id, nom);
		myObj.close();
		return com;
	}

}