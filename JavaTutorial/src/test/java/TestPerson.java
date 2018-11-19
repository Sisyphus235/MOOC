import lesson1.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPerson{
    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person person1 = new Person();
        Person person2 = new Person();
        assertEquals("Hello Marcus", person1.hello("Marcus"));
        assertEquals("Hello Tom", person2.hello("Tom"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();
        /* 最好使用Person.numberOfPersons，因为方法是static的，numberOfPersons不属于任何一个instance，而是属于Person这个class */
        assertEquals(3, Person.numberOfPersons());
    }
}
