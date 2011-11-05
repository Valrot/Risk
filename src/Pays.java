
public class Pays {
	int id_pays;
	int nb_units;
	String nom;
	int id_joueur;
	int id_continent;
	int nb_unites;

public Pays(){
    System.out.println("Création d'un pays !");      
    id_pays = 0;
    nb_units = 0;
    nom = "Inconnu";
    id_joueur=0;
    id_continent=0;
    nb_unites=0;
}
    
    public Pays(int pid_pays, int pnb_units,String pnom, int pid_joueur, int pid_continent, int pnb_unites ){
        System.out.println("Création d'un pays !");      
        id_pays = pid_pays;
        nb_units = pnb_units;
        nom = pnom;
        id_joueur=pid_joueur;
        id_continent=pid_continent;
        nb_unites=pnb_unites;
}
}