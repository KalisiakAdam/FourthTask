import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({RandomNumberTest.class,
        ResultGetMatrixParameterizedTest.class,
        ResultEndOfGameParameterizedTest.class,
        TenisGameTest.class
})
public class TenisGameSuite {
}
