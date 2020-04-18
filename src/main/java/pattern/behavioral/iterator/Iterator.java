package pattern.behavioral.iterator;

public class Iterator {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        PostsIterator postsIterator = twitter.findPostsByHashtag("#java");
        while (postsIterator.hasNext()){
            Post post = postsIterator.getNext();
            System.out.println(post.getContent());
        }
    }
}
