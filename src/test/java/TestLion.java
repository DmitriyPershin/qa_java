import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestLion{
    @Spy
    Feline feline;


    @Test
    public void testTextException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            new Lion("djghsladjkgn", feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",exception.getMessage());
    }


    @Test
    public void testGetKittens() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец",feline);
        Lion lionSpy = Mockito.spy(lion);
        lionSpy.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = Mockito.spy(Feline.class);
        Lion lion = new Lion("Самец",feline);
        Lion lionSpy = Mockito.spy(lion);
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(eat,lionSpy.getFood());
    }




}













