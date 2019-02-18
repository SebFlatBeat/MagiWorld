package Game;

public class Main {


    public static void main (String[] args){
        int numPlayer = 1;
        Personnages player1 = Personnages.creerPlayer(numPlayer); // Création du player 1
        System.out.println(player1.toString());
        numPlayer ++;
        Personnages player2 = Personnages.creerPlayer(numPlayer); // Creation du player 2
        System.out.println(player2.toString());
        player1.setAdversaire(player2);
        player2.setAdversaire(player1);
        player1.activePersonnage();
    }


}
