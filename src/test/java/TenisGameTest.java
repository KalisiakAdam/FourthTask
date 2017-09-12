import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TenisGameTest {

    @Mock
    private Player player1;

    @Mock
    private Player player2;

    private TenisGame tenisGame;

    @Before
    public void setUp() {
        tenisGame = new TenisGame(player1, player2);

        when(player1.getListOfPoints()).thenReturn(new Stack<Integer>());
        when(player2.getListOfPoints()).thenReturn(new Stack<Integer>());
    }

    @Test
    public void isAssigningPointToPlayerOneIsCorrect() {
        assertThat(tenisGame.assignPointToPlayer(0), is(player1.getListOfPoints().size()));
    }

    @Test
    public void isAssigningPointToPlayerTwoIsCorrect() {
        assertThat(tenisGame.assignPointToPlayer(1), is(player2.getListOfPoints().size()));
    }

    @Test
    public void itIsNotRequierdToRemoveRowAndColumn_MulitplayerBelow25(){
        assertFalse(tenisGame.isItRequierdToRemoveColumnAndRow(4,6));
    }

    @Test
    public void itIsRequierdToRemoveRowAndColumn_MulitplayerEqualOrAbove25(){
        assertTrue(tenisGame.isItRequierdToRemoveColumnAndRow(5,5));
    }
}
