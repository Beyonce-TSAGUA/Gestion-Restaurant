package resto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
	
	ArrayList<Table> tables;
	Map<Table,Reservation> tablesReservees;
	
	public Restaurant() {
		tables = new ArrayList<Table>();
		tablesReservees = new HashMap<Table,Reservation>();
	}
	
	public void addTable(int capacite) {
		tables.add(new Table(capacite));
	}
	
	public boolean tableEstReservee(Table table) {
		//Manipulation des HashMap
		return this.tablesReservees.get(table) != null;
		
	}
	
    private Table chercherTableCapaciteSuffisante(int nbPersonnes) {
        Table tableLibre = null;
        Collections.sort(tables);
        for(Table table : tables) {
            if(!tableEstReservee(table)) {
                if(table.getCapacite() >= nbPersonnes) {
                    tableLibre = table;
                    break;
                }
            }
        }

        return tableLibre;
    }
	
	public Table reserver(Client client, int nombrePlaces, LocalTime heureArrivee) {
		
		 Table tableRes = chercherTableCapaciteSuffisante(nombrePlaces);
		 
		 if(tableRes != null) {
			 tablesReservees.put(tableRes, new Reservation(heureArrivee, client, nombrePlaces));
		 }else {
			 return null;
		 }
		 
		return tableRes;
	}
	
	public void addCommande(Article article, Table table) {
		if(tablesReservees.containsKey(table)) {
			Reservation reserver = tablesReservees.get(table);
			reserver.addCommande(article);
		}
	}
	
	 public void addCommande(Plat plat, Table table, int qtt) {
	        for(int i =0; i < qtt; i++) {
	            this.addCommande(plat, table);
	        }
	    }

	@Override
	public String toString() {
		return "Restaurant [tables=" + tables + "\ntablesReservees=" + tablesReservees + "]";
	}
	 
	 

}
