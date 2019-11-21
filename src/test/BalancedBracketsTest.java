package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets testClass = new BalancedBrackets();
        assertTrue(testClass.hasBalancedBrackets("[]"));
    }
    @Test
    public void brakcetsAndNonBracketsReturnsTrue(){
        BalancedBrackets testClass = new BalancedBrackets();
        assertTrue(testClass.hasBalancedBrackets("[LunchCode]"));
    }
    @Test
    public void nestedBracketsReturnsTrue(){
        BalancedBrackets testClass = new BalancedBrackets();
        assertTrue(testClass.hasBalancedBrackets("[[Hello]]"));
    }@Test
    public void missingBracketsReturnsFalse(){
        BalancedBrackets testClass = new BalancedBrackets();
        assertFalse(testClass.hasBalancedBrackets("[Lunch"));
    }
    @Test
    public void unorderedBracketsReturnsFalse(){
        BalancedBrackets testClass = new BalancedBrackets();
        assertFalse(testClass.hasBalancedBrackets("]["));
    }
    @Test
    public void messyNestedBracketsReturnsTrue (){
        BalancedBrackets testClass = new BalancedBrackets();
        assertTrue(testClass.hasBalancedBrackets("Hell[[OOOOOoooOOOoo][[LaUnChCodDE]EE]]"));
    }
    @Test
    public void emptyStringReturnsFalse () {
        BalancedBrackets testClass = new BalancedBrackets();
        assertFalse(testClass.hasBalancedBrackets("   "));
    }
}
