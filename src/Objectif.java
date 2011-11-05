
public class Objectif {
	int id_objectif;
	int nb_pays;
	String couleur_joueur;
	String libellé;
	boolean continent1;
	boolean continent2;
	boolean continent3;
	boolean continent4;
	boolean continent5;

public Objectif(){
    System.out.println("Création d'un objectif !");      
    id_objectif = 0;
    nb_pays = 0;
    couleur_joueur = "Inconnu";
    libellé = "Inconnu";
    continent1=false;
    continent2=false;
    continent3=false;
    continent4=false;
    continent5=false;
}

public Objectif(int pid_objectif, int pnb_pays, String pcouleur_joueur, String plibellé, boolean pcontinent1, boolean pcontinent2, boolean pcontinent3, boolean pcontinent4, boolean pcontinent5){
    System.out.println("Création d'un objectif !");      
    id_objectif = pid_objectif;
    nb_pays = pnb_pays;
    couleur_joueur = pcouleur_joueur;
    libellé = plibellé;
    continent1=pcontinent1;
    continent2=pcontinent2;
    continent3=pcontinent3;
    continent4=pcontinent4;
    continent5=pcontinent5;
}
}