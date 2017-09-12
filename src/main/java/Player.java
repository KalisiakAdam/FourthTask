import java.util.Stack;

public class Player {

    private String playerName;
    private Stack<Integer> listOfPoints;

    Player(String playerName){
        this.playerName = playerName;
        listOfPoints = new Stack<>();
    }

    Stack<Integer> getListOfPoints(){
        return listOfPoints;
    }

    public void setListOfPoints(Stack<Integer> listOfPoints) {
        this.listOfPoints = listOfPoints;
    }

    public String getPlayerName(){
        return playerName;
    }
}
