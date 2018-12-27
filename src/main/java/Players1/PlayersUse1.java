package Players1;

public class PlayersUse1 {


    public static void main(String[] args) {
        Player1 player1 = new Player1(200);
        Player2 player2 = new Player2(300);
        Player3 player3 = new Player3(400);
        Player4 player4 = new Player4(600);
        Player5 player5 = new Player5(700);
        Player6 player6 = new Player6(800);

        player1.playSong();
        System.out.println("");
        player2.playSong();
        System.out.println("");

        player3.playSong();
        player3.playAllSongs();
        System.out.println("");

        player4.playSong();
        player4.playAllSongs();
        System.out.println("");

        player5.playSong();
        player5.playAllSongs();
        System.out.println("");

        player6.playSong();
        player6.playAllSongs();
        player6.shuffle();
    }
}
