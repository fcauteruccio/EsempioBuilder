package competenzedigitali;

enum Modulo {
	INGSW, PROG, DB
}

public class Studente {
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private Modulo moduloPreferito;
	private int votoFinale;
	private int numAssenze;
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", moduloPreferito=" + moduloPreferito + ", votoFinale=" + votoFinale + ", numAssenze=" + numAssenze
				+ "]";
	}
	
	public String getNome() { return nome; }
	public String getCognome() { return cognome; }
	public String getDataDiNascita() { return dataDiNascita; }
	public Modulo getModuloPreferito() { return moduloPreferito; }
	public int getVotoFinale() { return votoFinale; }
	public int getNumAssenze() { return numAssenze; }
	
	public Studente(BuilderStudente builder) {
		this.nome = builder.nome;
		this.cognome = builder.cognome;
		this.dataDiNascita = builder.dataDiNascita;
		this.moduloPreferito = builder.moduloPreferito;
		this.votoFinale = builder.votoFinale;
		this.numAssenze = builder.numAssenze;
	}
	
	public static class BuilderStudente {
		private String nome;
		private String cognome;
		private String dataDiNascita;
		private Modulo moduloPreferito;
		private int votoFinale;
		private int numAssenze;
		
		public BuilderStudente(String nome, String cognome, String dataDiNascita) {
			this.nome = nome;
			this.cognome = cognome;
			this.dataDiNascita = dataDiNascita;
		}
		
		public BuilderStudente setModuloPreferito(Modulo moduloPreferito) {
			this.moduloPreferito = moduloPreferito;
			return this;
		}
		
		public BuilderStudente setVotoFinale(int votoFinale) {
			this.votoFinale = votoFinale;
			return this;
		}
		
		public BuilderStudente setNumAssenze(int numAssenze) {
			this.numAssenze = numAssenze;
			return this;
		}
		
		public Studente build() {
			return new Studente(this);
		}
		
		
	}
	
}
