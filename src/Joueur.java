
public class Joueur {
	int id_joueur;
	String pseudo;
	String couleur;
	boolean test_obj;
	int nb_units;
	int id_objectif;

public Joueur(){
	    System.out.println("Création d'un joueur !");      
	    id_joueur = 0;
	    pseudo = "Inconnu";
	    couleur = "Inconnu";
	    test_obj=false;
	    nb_units=0;
	    id_objectif=0;
}

public Joueur(int pid_joueur, String ppseudo, String pcouleur, boolean ptest_obj, int pnb_units, int pid_objectif){
    System.out.println("Création d'un joueur !");      
    id_joueur = pid_joueur;
    pseudo = ppseudo;
    couleur = pcouleur;
    test_obj=ptest_obj;
    nb_units=pnb_units;
    id_objectif=pid_objectif;
}
}