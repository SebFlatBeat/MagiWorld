package Game;

public class Main {


    public static void main (String[] args){
        int numPlayer = 1;
        Personnage player1 = PersonnageFabrique.creerPlayer(numPlayer); // Création du player 1
        System.out.println(player1.toString());
        numPlayer ++;
        Personnage player2 = PersonnageFabrique.creerPlayer(numPlayer); // Creation du player 2
        System.out.println(player2.toString());
        player1.setAdversaire(player2);
        player1.setJoueurActif(player1);
        player2.setAdversaire(player1);
        player2.setJoueurActif(player2);
        player1.activePersonnage();
    }


}
