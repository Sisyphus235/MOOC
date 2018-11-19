import dataStructure.arraysAndStrings.uniqueCharacter1_1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUniqueCharacter {
    @Test
    public void isUnique(){
        uniqueCharacter1_1 uniqueChar = new uniqueCharacter1_1();
        assertEquals(true, uniqueChar.isUniqueChars("helo"));
    }

    @Test
    public void notUnique(){
        uniqueCharacter1_1 uniqueChar = new uniqueCharacter1_1();
        assertEquals(false, uniqueChar.isUniqueChars("hello"));
    }
}
