package resto;

public class Plat implements Article {
	
	private String nomPl;
	private int prixPl;
	
	
	public Plat(String nomPl, int prixPl) {
		super();
		this.nomPl = nomPl;
		this.prixPl = prixPl;
	}
	
	

	@Override
	public int getPrix() {
		// TODO Auto-generated method stub
		return prixPl;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " ' "+nomPl +" : "+ prixPl+"€' ";
	}
	
	
	
	

}
