package resto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
	
	private LocalTime heureArrivee;
	private Client client;
	private int nbPlacesReservee;
	private List<Article> articleCommandes;
	
	
	public Reservation(LocalTime heureArrivee, Client client, int nbPlacesReservee) {
		super();
		this.heureArrivee = heureArrivee;
		this.client = client;
		this.nbPlacesReservee = nbPlacesReservee;
		this.articleCommandes = new ArrayList<Article>();
	}
	
	
	
	public List<Article> getArticleCommandes() {
		return articleCommandes;
	}



	public void setArticleCommandes(List<Article> articleCommandes) {
		this.articleCommandes = articleCommandes;
	}



	void addCommande(Article article) {
		articleCommandes.add(article);
	}
	
	int montantFacture() {
		int sum = 0;
		
		for(Article art : articleCommandes) {
			 sum += art.getPrix();
		}
		
		return sum;
	}
	
    @Override
    public String toString() {
        return "Reservation{" +
                "heureArrive=" + heureArrivee +
                ", client=" + client +
                ", nbPlacesReservee=" + nbPlacesReservee +
                ", articlesCommandes=" + articleCommandes +
                '}';
    }
	

}
