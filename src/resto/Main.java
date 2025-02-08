package resto;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Restaurant room = new Restaurant();
        RepasComplet repasComplet = new RepasComplet("Formule déjeuner","salade", "tartare de bœuf", "crème brûlée",35);
        Plat bouillabaisse = new Plat("Bouillabaisse",40);
        room.addTable(4);
        room.addTable(2);
        room.addTable(2);
        Client marius = new Client("Marius");
        Client fanny = new Client("Fanny");
        Table fannyTable = room.reserver(fanny, 2, LocalTime.of(20,0));
        Table mariusTable = room.reserver(marius, 3, LocalTime.of(19,30));
//        room.addCommande(bouillabaisse, 3, mariusTable);
        room.addCommande(repasComplet, fannyTable);
        room.addCommande(bouillabaisse, fannyTable);
        System.out.println(room);

	}

}
