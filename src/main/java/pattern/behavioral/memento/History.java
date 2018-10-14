package pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    
    private List<Snapshot> snapshots = new ArrayList<Snapshot>();

    public void addSnapshot(Snapshot snapshot) {
	snapshots.add(snapshot);
    }

    public Snapshot getSnapshot(int index) {
	return snapshots.get(index);
    }
    
}
