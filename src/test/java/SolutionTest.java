import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String s = "ADOBECODEBANC";
        String t= "ABC";
        String expected = "BANC";
        String actual = new Solution().minWindow(s, t);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String s = "a";
        String t= "a";
        String expected = "a";
        String actual = new Solution().minWindow(s, t);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        String s = "a";
        String t= "aa";
        String expected = "";
        String actual = new Solution().minWindow(s, t);

        Assert.assertEquals(expected, actual);
    }
}
