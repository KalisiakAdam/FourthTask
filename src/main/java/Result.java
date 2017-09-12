
public class Result implements IResult {

    private String [][] resultMatrix = {
            {"Love-All", "Love-Fifteen", "Love-Thirty", "Love-Forty", "Win for Player 2", "Impossible", "Impossible" },
            {"Fifteen-Love", "Fifteen-All", "Fifteen-Thirty", "Fifteen-Forty", "Win for Player 2", "Impossible", "Impossible"},
            {"Thirty-Love", "Thirty-Fifteen", "Thirty-All", "Thirty-Forty", "Win for Player 2", "Impossible", "Impossible"},
            {"Forty-Love", "Forty-Fifteen", "Forty-Thirty", "Forty-All", "Advantage Player 2","Win for Player 2", "Impossible","Impossible"},
            {"Win for Player 1", "Win for Player 1", "Win for Player 1", "Advantage Player 1", "Deuce", "Advantage Player 2", "Win for Player 2"},
            {"Impossible", "Impossible", "Impossible", "Win for Player 1", "Advantage Player 1", "Deuce", "Impossible"},
            {"Impossible", "Impossible", "Impossible", "Impossible", "Win for Player 1", "Impossible", "Impossible"}
    };



    public  String getResultMatrix(int resultPlayer1, int resultPlayer2){
        return resultMatrix [resultPlayer1][resultPlayer2];
    }


    public boolean isEndOfGame(int sizeOfFirstArray, int sizeOfSecondArray) {

        if ((sizeOfFirstArray <= 2 || sizeOfSecondArray <=2) &&
                (sizeOfFirstArray == 4 || sizeOfSecondArray == 4)) return true;

        return (sizeOfFirstArray * sizeOfSecondArray >= 4) &&
                (sizeOfFirstArray + 2 == sizeOfSecondArray || sizeOfFirstArray == sizeOfSecondArray + 2);
    }
}
