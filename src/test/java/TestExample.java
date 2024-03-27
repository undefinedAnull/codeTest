import org.junit.Test;
import test.code.CodeTest;

public class TestExample {


    @Test
    public void stageOne(){
        String str = "aabccccbbaad";
        System.out.println(CodeTest.removeConsecutiveChars(str));
    }

    @Test
    public void stageTwo(){
        String str = "abcccbad";
        System.out.println(CodeTest.replaceConsecutiveChars(str));
    }
}
