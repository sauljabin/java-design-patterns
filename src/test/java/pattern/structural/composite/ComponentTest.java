package pattern.structural.composite;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ComponentTest {

    @Test
    public void shouldInvokeInnerComponents() {
        Component component = new Component() {
        };

        Component component1 = mock(Component.class);
        component.add(component1);
        Component component2 = mock(Component.class);
        component.add(component2);

        component.draw();

        verify(component1).draw();
        verify(component2).draw();
    }
}
