import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Feline feline;

    @Spy
    Cat cat = new Cat(feline);

    @Test
    public void getTextInGetSound() {
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetSound() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Cat catSpy = Mockito.spy(cat);
        catSpy.getFood();
        Mockito.verify(catSpy, Mockito.times(1)).getFood();
    }

    @Test
    public void TestGetFoodWithValue() throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        Cat cat = new Cat(felineSpy);
        Cat catSpy = Mockito.spy(cat);
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(eat, catSpy.getFood());
    }


}










