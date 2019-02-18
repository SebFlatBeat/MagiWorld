package Game;

/**
 * classe des personnages de type Guerrier
 */
public class Guerrier extends Personnages implements Attaques{

    protected Guerrier( int numPlayer,int force, int agilite, int intelligence) {
        super(numPlayer, force, agilite, intelligence);
        setPersoCrideguerre(" GROAAR");
        setPersoName("Guerrier");
    }

    @Override
    protected String play(int choice) {
        if (choice == 1) {
            attaqueBasique("Coup d'épée");
        } else if (choice == 2) {
            attaqueSpecial("Coup de Rage");
        }
        return this.play(choice);
    }

    @Override
    public void attaqueBasique(String basicName) {
        adversaire.enleverVie(getForce());
        System.out.println(persoName + " utilise Coup d'épée et inflige " + getForce() + "de dégâts !");

    }

    @Override
    public void attaqueSpecial(String specialName) {
        adversaire.enleverVie(getForce()*2);
        vie = vie - getForce()/2;
        System.out.println(persoName + " utilise Coup de Rage, il inflige " + (getForce()*2 + "de dégâts et perd " + (getForce()/2) + " de vitalité ! " ));
    }

}
