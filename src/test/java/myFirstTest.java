import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class myFirstTest {
    @BeforeAll
    static void beforeAll(){
      // System.out.println("тесты пошли");
    }

    @BeforeEach
    void setUp() {
        //System.out.println("новый тест запущен");
    }

    @Test
    void test() {
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test1(int argument) {
        System.out.println("тест запущен с параметром" + argument);
    }

    @Disabled
    @Test
    void test2() {
    }

    @AfterEach
    void tearDown() {
        //System.out.println("новый тест завершён");
    }
}
