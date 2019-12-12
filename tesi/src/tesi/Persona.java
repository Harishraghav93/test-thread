package tesi;

public class Persona {
	
	//Attributes
	
	public String nome;
	public String cognome;
	public String codice_fiscale;
	public int eta;
	
	public Persona(String nome,String cognome,int eta,String codice_fiscale) {
		
		super();
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.codice_fiscale=codice_fiscale;
		
	}
	
	@Override 
	
	public String toString() {
		return "Persona[nome=" +nome  +  ", cognome=" +cognome  + ",eta=" +eta  + ",codice_fiscale=" +codice_fiscale +"]";
	}
	
	/*public static void dettagli() {
		String nome = "Harish";
		String cognome = "Raghav";
		System.out.println("nome della persona" +nome + "e cognome" +cognome);
	}*/
	
	

}
