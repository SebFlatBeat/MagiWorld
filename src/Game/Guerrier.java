package Game;

/**
 * classe des personnages de type Guerrier
 */
public class Guerrier extends Personnages {

    protected Guerrier( int numPlayer,int force, int agilite, int intelligence) {
        super(numPlayer, force, agilite, intelligence);
        setPersoCrideguerre(" GROAAR");
        setPersoName("Guerrier");
    }

}
