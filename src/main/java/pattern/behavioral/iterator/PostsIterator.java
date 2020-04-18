package pattern.behavioral.iterator;

/**
 * Interfaz iterator.
 */
public interface PostsIterator {
    boolean hasNext();
    Post getNext();
    void reset();
}
