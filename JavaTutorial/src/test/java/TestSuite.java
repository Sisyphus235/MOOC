import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class TestSuite {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void before(){
        System.out.println("Before hooray");
    }

    @Test
    public void test1(){
        System.out.println("Hooray1");
    }

    @Test
    public void test2(){
        System.out.println("Hooray2");
    }

    @After
    public void after(){
        System.out.println("After hooray");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }
}
