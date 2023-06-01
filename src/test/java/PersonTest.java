import a.b.c.d.Human;
import a.b.c.d.Walk;
import a.b.c.d.WalkModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import mockit.integration.junit5.JMockitExtension;
import org.junit.Test;
import org.junit.runner.RunWith;

public class PersonTest {

    @Test
    public void test(){
        Injector injector = Guice.createInjector(new WalkModule());
        Human walk = injector.getInstance(Human.class);
        walk.eat();
    }
}
