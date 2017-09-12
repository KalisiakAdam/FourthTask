import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class ResultEndOfGameParameterizedTest {

    private int  inputOne;
    private int  inputTwo;
    private boolean expected;

    private static IResult result;

    @Before
    public void setUp(){
        result = new Result();
    }

    public ResultEndOfGameParameterizedTest(int inputOne, int inputTwo, boolean expected) {
        this.inputOne = inputOne;
        this.inputTwo = inputTwo;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {0, 0, false}, {0, 1, false}, {0, 2, false}, {0, 3, false}, {0, 4, true},
                {1, 0, false}, {1, 1, false}, {1, 2, false}, {1, 3, false}, {1, 4, true},
                {2, 0, false}, {2, 1, false}, {2, 2, false}, {2, 3, false}, {2, 4, true},
                {3, 0, false}, {3, 1, false}, {3, 2, false}, {3, 3, false}, {3, 4, false}, {3, 5, true},
                {4, 0, true},  {4, 1, true},  {4, 2, true},  {4, 3, false}, {4, 4, false}, {4, 5, false}, {4, 6, true},
                {5, 3, true},  {5, 4, false}, {5, 5, false},
                {6, 4, true},
        });
    }

    @Test
    public void gameShouldEndWhenPlayerGetFourPointAndHaveAdvenatageOfTwoPoints(){

        assertThat(result.isEndOfGame(inputOne,inputTwo), is(expected));
    }
}
