package defaut;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Prof p1 = new Prof("Jacqueline", "Duverger", "Français");
		Prof p2 = new Prof("Robert", "Momet", "Maths");
		Prof p3 = new Prof("Jean-Michel", "Alvalle", "Espagnol");
		Prof p4 = new Prof("Jack", "Beauregard", "Economie");
		Prof p5 = new Prof("Jean-Jacques", "Luther-King", "Droit");
		List<Prof> profs = new ArrayList<>();
		profs.add(p1);
		profs.add(p2);
		profs.add(p3);
		profs.add(p4);
		profs.add(p5);
		Etudiant e = new Etudiant("Jack", 0147200001);
		System.out.println("Hello tout le monde je m'appelle " + e.getName());
		System.out.println("Voici mes professeurs: ");
		for (Prof p : profs) {
			System.out.println(p);
		}

	}
}
