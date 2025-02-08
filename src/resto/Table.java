package resto;

public class Table {
	
	public static int nombreTotalTables = 0;
	
	private int id = -1;
	private int capacite;
	
	
	public Table(int capacite) {
		super();
		this.id = nombreTotalTables++;
		this.capacite = capacite;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	@Override
	public String toString() {
		return "Table" + id + "(" + capacite + "places)";
	}

	
	
	
	
	

}
