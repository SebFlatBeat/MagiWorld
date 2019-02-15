package Game;

/**
 * classe des personnages de type  Mage
 */

public class Mage extends Personnages {

    protected Mage (String persoName, int niveau, int vie, int force, int agilite, int intelligence,int sortBasique, int sortSpecial) {
    super(persoName, niveau, vie, force, agilite, intelligence, sortBasique, sortSpecial);
        type = "Mage";
        cri = "Inanimatus Apparitus";
    }
}
