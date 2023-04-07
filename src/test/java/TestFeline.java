import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    private Feline obFeline;
    @Before

    public void testGetFamily1(){
     obFeline =new Feline();
    }


    @Test
    public void testGetFamily(){
        Assert.assertEquals("Кошачьи",obFeline.getFamily());
    }

    @Test
    public void testGetKittens(){
       Assert.assertEquals(1,obFeline.getKittens());
    }

    @Test
    public void testGetKittensWithValue(){
        int value = 50;
        Assert.assertEquals(value,obFeline.getKittens(value));
    }






}
