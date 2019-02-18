package Game;

/**
 * classe des personnages de type  Rodeur
 */
public class Rodeur extends Personnages {

    protected Rodeur ( int numPlayer,int force, int agilite, int intelligence) {
        super(numPlayer, force, agilite, intelligence);
        setPersoName("Rôdeur");
        setPersoCrideguerre("sssssssssssssshhhhhhhhhh");
    }
}
