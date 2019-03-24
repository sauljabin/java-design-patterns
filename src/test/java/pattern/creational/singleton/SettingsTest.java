package pattern.creational.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(Settings.getInstance())
                .isSameAs(settings);
    }

    @Test
    public void shouldSetGetAndRemoveASetting() {
        settings.set(KEY, VALUE);
        assertThat(settings.get(KEY))
                .isEqualTo(VALUE);

        settings.remove(KEY);
        assertThat(settings.get(KEY))
                .isNull();
    }
}