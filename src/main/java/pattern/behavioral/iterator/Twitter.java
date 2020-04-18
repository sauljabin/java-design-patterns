package pattern.behavioral.iterator;

public class Twitter implements SocialNetwork {
    @Override
    public PostsIterator findPostsByHashtag(String hashtag) {
        return new TwitterIterator(hashtag);
    }
}
