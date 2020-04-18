package pattern.behavioral.iterator;

/**
 * Iterador concreto, ayuda a acceder a los elementos encontrados sin necesidad
 * de saber la estructura de la colección o el algoritmo para obtenerlos.
 */
public class TwitterIterator implements PostsIterator {
    private String hashtag;
    private Post[] posts;
    private int position;

    public TwitterIterator(String hashtag) {
        this.hashtag = hashtag;
    }

    @Override
    public boolean hasNext() {
        loadPosts();
        return posts != null && posts.length > 0 && position < posts.length;
    }

    @Override
    public Post getNext() {
        return posts != null && position < posts.length ? posts[position++] : null;
    }

    @Override
    public void reset() {
        posts = null;
        position = 0;
    }

    private void loadPosts() {
        if (posts == null) {
            posts = new Post[]{
                    new Post(hashtag + " Java es un lenguaje orientado a objetos"),
                    new Post("En " + hashtag + " los patrones de diseños ayudan mucho")
            };
        }
    }
}
