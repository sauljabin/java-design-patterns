package pattern.creational.singleton;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class SettingsTest {
    private static final String KEY = "KEY";
    private static final String VALUE = "VALUE";
    private Settings settings;

    @Before
    public void setUp() {
        settings = Settings.getInstance();
    }

    @Test
    public void shouldGetSameInstance() {
        assertThat(Settings.getInstance(), is(settings));
    }

    @Test
    public void shouldSetGetAndRemoveASetting() {
        settings.set(KEY, VALUE);
        assertThat(settings.get(KEY), is(VALUE));

        settings.remove(KEY);
        assertThat(settings.get(KEY), is(nullValue()));
    }

    /**
     * Este es un ejemplo de como se utilizaría el patrón.
     */
    @Ignore
    @Test
    public void exampleSingleton() {
        Settings settings = Settings.getInstance();

        settings.set(KEY, VALUE);

        System.out.println(Settings.getInstance().get(KEY)); // Se llama al método getInstance de nuevo
    }
}