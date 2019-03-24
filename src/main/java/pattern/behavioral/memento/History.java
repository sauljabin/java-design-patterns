package pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite almacenar el historial ordenado de estados de un objeto.
 */
public class History {

    private List<Snapshot> snapshots = new ArrayList<>();

    public void addSnapshot(Snapshot snapshot) {
        snapshots.add(snapshot);
    }

    public Snapshot getSnapshot(int index) {
        return snapshots.get(index);
    }

}
