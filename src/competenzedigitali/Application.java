package competenzedigitali;

import competenzedigitali.Studente.BuilderStudente;

public class Application {

	public static void main(String[] args) {
		BuilderStudente b = new Studente.BuilderStudente("Mario", "Rossi", "20/03/1989");
		b.setModuloPreferito(Modulo.INGSW);
		Studente s1 = b.setNumAssenze(10).build();
		Studente s2 = b.setModuloPreferito(Modulo.PROG).build();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
