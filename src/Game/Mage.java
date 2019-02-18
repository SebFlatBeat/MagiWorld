package Game;

/**
 * classe des personnages de type Mage
 */
public class Mage extends Personnages implements Attaques{

    protected Mage ( int numPlayer,int force, int agilite, int intelligence) {
        super(numPlayer, force, agilite, intelligence);
        setPersoName("Mage");
        setPersoCrideguerre("Inanimatus Apparitus");
    }

    @Override
    protected String play(int choice) {
        if (choice == 1) {
            attaqueBasique("Boule de feu");
        }else if (choice == 2){
            attaqueSpecial("Soin");
        }
        return this.play(choice);
    }

    @Override
    public void attaqueBasique(String basicName) {

    }

    @Override
    public void attaqueSpecial(String specialName) {

    }
}
