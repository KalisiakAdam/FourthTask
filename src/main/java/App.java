
public class App {
    public static void main(String[] args) {

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        RandomNumber randomNumber = new RandomNumber();
        IResult result = new Result();

        TenisGame tenisGame = new TenisGame(player1,player2,randomNumber,result);
        tenisGame.runGame();

    }
}
