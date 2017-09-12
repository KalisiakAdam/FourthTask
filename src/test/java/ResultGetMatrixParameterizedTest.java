import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class ResultGetMatrixParameterizedTest {

    private int  inputOne;
    private int  inputTwo;
    private String expected;

    private static IResult result = new Result();

    public ResultGetMatrixParameterizedTest(int inputOne, int inputTwo, String expected) {
        this.inputOne = inputOne;
        this.inputTwo = inputTwo;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {0, 0,  "Love-All"},         {0, 1, "Love-Fifteen"},     {0, 2, "Love-Thirty"},      {0, 3, "Love-Forty"},         {0, 4, "Win for Player 2"},
                {1, 0,  "Fifteen-Love"},     {1, 1, "Fifteen-All"},      {1, 2, "Fifteen-Thirty"},   {1, 3, "Fifteen-Forty"},      {1, 4, "Win for Player 2"},
                {2, 0,  "Thirty-Love"},      {2, 1, "Thirty-Fifteen"},   {2, 2, "Thirty-All"},       {2, 3, "Thirty-Forty"},       {2, 4, "Win for Player 2"},
                {3, 0,  "Forty-Love"},       {3, 1, "Forty-Fifteen"},    {3, 2, "Forty-Thirty"},     {3, 3, "Forty-All"},          {3, 4, "Advantage Player 2"}, {3, 5, "Win for Player 2"},
                {4, 0,  "Win for Player 1"}, {4, 1, "Win for Player 1"}, {4, 2, "Win for Player 1"}, {4, 3, "Advantage Player 1"}, {4, 4, "Deuce"},              {4, 5, "Advantage Player 2"}, {4, 6, "Win for Player 2"},
                {5, 3, "Win for Player 1"},   {5, 4, "Advantage Player 1"}, {5, 5, "Deuce"},
                {6, 4, "Win for Player 1"},
        });
    }

    @Test
    public void scoresShouldBeWellAssignToConventionInTenisGame() {

        assertThat(result.getResultMatrix(inputOne, inputTwo),is(expected));
    }
}
