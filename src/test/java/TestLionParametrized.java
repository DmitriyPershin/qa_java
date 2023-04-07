import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.Spy;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class TestLionParametrized {

    String sexForTest;
    boolean hasManeForTest;

    public TestLionParametrized(String sexForTest, boolean hasManeForTest){
    this.sexForTest=sexForTest;
    this.hasManeForTest=hasManeForTest;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {"Самец", true},
                {"Самка", false}

        });
    }
    @Spy
    Feline feline;



    @Test
    public void testConstructorForLion() throws Exception {
        Lion lion = new Lion(sexForTest,feline);
        Lion lionSpy = Mockito.spy(lion);
        Assert.assertEquals(hasManeForTest,lionSpy.doesHaveMane());
    }


}













