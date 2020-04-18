package pattern.behavioral.iterator;

/**
 * Interfaz iterable.
 */
public interface SocialNetwork {
    PostsIterator findPostsByHashtag(String hashtag);
}
