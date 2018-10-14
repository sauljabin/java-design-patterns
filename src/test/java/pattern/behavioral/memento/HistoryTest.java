package pattern.behavioral.memento;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class HistoryTest {

    @Test
    public void shouldReturnTheCorrectSnapshotZeroPosition() {
	History history = new History();
	Snapshot expectedObject = mock(Snapshot.class);

	history.addSnapshot(expectedObject);
	Snapshot output = history.getSnapshot(0);
	
	assertThat(output).isSameAs(expectedObject);
    }
    
    @Test
    public void shouldReturnTheCorrectSnapshotOnePosition() {
	History history = new History();
	Snapshot firstObject = mock(Snapshot.class);
	Snapshot expectedObject = mock(Snapshot.class);

	history.addSnapshot(firstObject);
	history.addSnapshot(expectedObject);
	Snapshot output = history.getSnapshot(1);
	
	assertThat(output).isSameAs(expectedObject);
    }

}
