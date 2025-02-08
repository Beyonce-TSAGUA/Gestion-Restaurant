package resto;

public class Client {
	
	private String nomCl;

	public Client(String nomCl) {
		super();
		this.nomCl = nomCl;
	}

	public String getNomCl() {
		return nomCl;
	}

	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nomCl + "]";
	}
	

}
