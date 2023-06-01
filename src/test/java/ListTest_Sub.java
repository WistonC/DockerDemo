import a.b.c.d.Bird;
import a.b.c.d.GW;
import a.b.c.d.Walk;
import com.google.common.math.PairedStats;
import mockit.*;
import org.junit.Test;

public class ListTest_Sub extends ListTest{

    @Tested
    Walk walk;
    /*@Mocked
    GW gw;
    static {
        new MockUp<Bird>(){
            @Mock
            public void setAge(){
                System.out.println("Mocked setAge()");
            }
        };
    }*/

    @Test
    public void testGetStu() {
        walk.walk();
    }

    @Test
    public void testMockBird() {
        Bird bird = new Bird();
        bird.setAge();
        bird.getAge();
    }
}
