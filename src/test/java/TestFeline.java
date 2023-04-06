import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void testGetKittens(){
        Feline feline = new Feline();
        Assert.assertEquals(1,feline.getKittens());
    }

    @Test
    public void testGetKittensWithValue(){
        Feline feline = new Feline();
        int value = 50;
        Assert.assertEquals(value,feline.getKittens(value));
    }






}
