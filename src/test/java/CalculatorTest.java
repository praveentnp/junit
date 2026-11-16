import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Calculator {
    public Integer add(Integer a, Integer b) {
        return a+b;
    }
}

class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void initial() {
        //calculator = new Calculator();
        System.out.println("->Before All");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("-->Before Each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("-->After Each");
    }

    @AfterAll
    static void afterAll() {
        //calculator = new Calculator();
        System.out.println("->After All");
    }
    @Test
    @DisplayName("adding numerals")
    void addsNumbers() {
        System.out.println("--->Test annotations");
        assertEquals(4, 2 + 2);
    }


    @Test
    @DisplayName("Adding two number with object")
    void addsTwoNumbers() {
        //int result = Calculator.add(2, 3);
        System.out.println("--->add two number");
        int result = calculator.add(2,3);
        assertEquals(5, result);
    }
}