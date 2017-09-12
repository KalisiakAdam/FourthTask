import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TenisGame {

    private Player player1;
    private Player player2;
    private RandomNumber randomNumber;
    private IResult result;
    private final Logger logger = Logger.getLogger(getClass().getName());


    TenisGame(Player player1, Player player2, RandomNumber randomNumber, IResult result){
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
        this.result = result;
    }

    public TenisGame(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public TenisGame(){}

    void runGame() {

        boolean run = true;
        while(run) {

            int number = randomNumber.generateRandomBinary();
            assignPointToPlayer(number);

            logger.log(Level.INFO, generateScoreOutput(player1.getListOfPoints().size(), player2.getListOfPoints().size()));

            if ((result.isEndOfGame(player1.getListOfPoints().size(),player2.getListOfPoints().size()))) {
                run = false;

            }
        }
    }

    int assignPointToPlayer(int number){
        try {
            switch (number) {
                case 0:
                    return player1.getListOfPoints().push(1);

                case 1:
                    return player2.getListOfPoints().push(1);
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return -1;
    }

    private String generateScoreOutput(int player1Points, int player2Points) {

        try {
            if (!(isItRequierdToRemoveColumnAndRow(player1Points,player2Points))) {
                return result.getResultMatrix(player1Points, player2Points);

            } else if (isItRequierdToRemoveColumnAndRow(player1Points,player2Points)) {
                player1.getListOfPoints().pop();
                player2.getListOfPoints().pop();
                return result.getResultMatrix(player1Points, player2Points);
            }

        } catch (InputMismatchException e){
            e.printStackTrace();
        }
        return "### There is now result for this value, something went wrong";
    }

    boolean isItRequierdToRemoveColumnAndRow(int player1Points, int player2Points) {
        if (player1Points * player2Points < 25) return false;
        return player1Points * player2Points >= 25;
    }
}
