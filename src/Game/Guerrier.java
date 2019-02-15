package Game;

/**
 * classe des personnages de type Guerrier
 */
public class Guerrier extends Personnages {

    protected Guerrier(String persoName, int niveau, int vie, int force, int agilite, int intelligence, int sortBasique, int sortSpecial) {
        super(persoName, niveau, vie, force, agilite, intelligence,sortBasique,sortSpecial);
        type = "Guerrier";
        cri = "GROAAR";
    }
}
