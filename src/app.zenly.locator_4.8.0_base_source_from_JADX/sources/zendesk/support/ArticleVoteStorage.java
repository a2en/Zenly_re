package zendesk.support;

public interface ArticleVoteStorage {
    ArticleVote getStoredArticleVote(Long l);

    void removeStoredArticleVote(Long l);

    void storeArticleVote(Long l, ArticleVote articleVote);
}
