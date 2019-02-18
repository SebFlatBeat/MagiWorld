package Game;

/**
 * classe des personnages de type Mage
 */
public class Mage extends Personnages {

    protected Mage ( int numPlayer,int force, int agilite, int intelligence) {
        super(numPlayer, force, agilite, intelligence);
        setPersoName("Mage");
        setPersoCrideguerre("Inanimatus Apparitus");
    }
}
