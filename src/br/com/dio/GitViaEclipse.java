package br.com.dio;

public class GitViaEclipse {
	
	public static void main(String[] args) {
		OutraClasse outraClasse = new OutraClasse();
		
		outraClasse.setClasse("NomeClasse");
		outraClasse.setMetodo("NomeMetodo");
		
		System.out.println(outraClasse);
	}

}

class OutraClasse {
	String classe;
	String metodo;

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	@Override
	public String toString() {
		return "OutraClasse - classe [" + classe + "] metodo [" + metodo + "]";
	}
}
