package a.b.c.d;

import com.google.inject.AbstractModule;

public class WalkModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Human.class).to(Person.class);
    }
}
