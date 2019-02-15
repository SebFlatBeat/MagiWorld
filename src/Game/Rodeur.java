package Game;

/**
 * classe des personnages de type  Rodeur
 */
public class Rodeur extends Personnages {

    protected Rodeur (String persoName, int niveau, int vie, int force, int agilite, int intelligence,int sortBasique, int sortSpecial){
        super (persoName, niveau, vie, force, agilite, intelligence,sortBasique,sortSpecial);
        type = "Rôdeur";
        cri = "sssssssssssssshhhhhhhhhh";
    }
}
