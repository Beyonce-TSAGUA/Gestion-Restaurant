package resto;

public class RepasComplet implements Article {
	
	private String nomRp;
	private String entree;
	private String platPrincipal;
	private String dessert;
	private int prixRp;
	
	

	public RepasComplet(String nomRp, String entree, String platPrincipal, String dessert, int prixRp) {
		super();
		this.nomRp = nomRp;
		this.entree = entree;
		this.platPrincipal = platPrincipal;
		this.dessert = dessert;
		this.prixRp = prixRp;
	}

	@Override
	public int getPrix() {
		// TODO Auto-generated method stub
		return prixRp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  nomRp +"("+entree+"+"+platPrincipal+"+"+dessert+")"+":"+prixRp+"€";
	}

}
