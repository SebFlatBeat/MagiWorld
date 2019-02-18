package Game;

/**
 * classe des personnages de type  Rodeur
 */
public class Rodeur extends Personnages implements Attaques{

    protected Rodeur ( int numPlayer,int force, int agilite, int intelligence) {
        super(numPlayer, force, agilite, intelligence);
        setPersoName("Rôdeur");
        setPersoCrideguerre("sssssssssssssshhhhhhhhhh");
    }

    @Override
    protected String play(int choice) {
        if (choice == 1) {
            attaqueBasique("Tir à l'arc");
        }else if (choice == 2) {
            attaqueSpecial("Concentration");
        }
        return String.valueOf(choice);
    }

    @Override
    public void attaqueBasique(String basicName) {
        adversaire.enleverVie(getAgilite());
        System.out.println(persoName + " tir à l'arc et inflige " + getAgilite() + " de points de dégâts !");
    }

    @Override
    public void attaqueSpecial(String specialName) {

    }
}
