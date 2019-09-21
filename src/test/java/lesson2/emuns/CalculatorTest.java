package lesson2.emuns;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static lesson2.emuns.Calculator.calc2;
import static org.junit.Assert.assertEquals;

//@Ignore("for class")
public class CalculatorTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void init(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void destroy(){
        System.out.println("After class");
    }

    @Before
    public void initBeforeEachMethod(){
        System.out.println("before method");
    }

    @After
    public void destroyAfterEachMethod(){
        System.out.println("after method");
    }

    @Test
//    @Ignore("for method")
    public void shouldReturnSumOfArguments() {
        int actual = calc2(1, "+", 1);
        int expected = 2;

        assertEquals("", expected, actual);

        // String actual ="Hello"
        // String expected="He...."
    }

    //    @Test(expected = RuntimeException.class)
    @Test
    public void shouldThrowExceptionForNullOperator() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Operator is null");

        calc2(1, null, 2);
    }
}