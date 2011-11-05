
public class Continent {
	int id_continent;
	int bonus;



public Continent(){
    System.out.println("Création d'un continent !");      
    id_continent = 0;
    bonus = 0;
}

public Continent(int pid_continent, int pbonus){
    System.out.println("Création d'un continent !");      
    id_continent = pid_continent;
    bonus = pbonus;
}

}