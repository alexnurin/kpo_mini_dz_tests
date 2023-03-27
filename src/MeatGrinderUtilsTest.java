import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MeatGrinderUtilsTest {
    int weight;
    int version;
    int var;
    String sound;

    @Before
    public void setup() {
        weight = 0;
        version = 100;
        sound = "'";
        var = 13;
    }

    @Test
    public void testChop() {
        Assert.assertEquals(5, MeatGrinder.chop(3), "Great meat");
        Assert.assertEquals(0, MeatGrinder.chop(1), "Chop with no MeatGrinder means..");
        Assert.assertEquals(5, MeatGrinder.chop(2), "Tasty meat");

    }

    @Test
    public void testSound() {
        String result = "brbrbrbrbrbrbrbrbrbrbrbrbr";
        Assert.assertEquals(result, MeatGrinder.force(12), "How loud can it work");
    }

    @Test
    public void testHeap(){
        Assert.assertEquals(6, MeatGrinder.inHeap(), "Int must be together");
        MeatGrinder.weight = 123;
        MeatGrinder.version = 2;
        Assert.assertEquals(125, MeatGrinder.inHeap(), "Int must be together");
        Assert.assertEquals(125, MeatGrinder.inHeap(), "Int must be together");
    }

}
