import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RandomNumberTest {

    private RandomNumber number;

    @Before
    public void setUp() {
        number = new RandomNumber();
    }

    @Test
    public void shouldGiveNumberZeroOrOne(){
        assertThat(number.generateRandomBinary(), either(is(0)).or( is(1)));
    }
}
