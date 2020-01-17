package zendesk.support;

import com.zendesk.logger.Logger;
import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private User author;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlUrl;

    /* renamed from: id */
    private Long f35184id;
    private String locale;
    private Long sectionId;
    private String title;
    private Integer voteCount;
    private Integer voteSum;

    public User getAuthor() {
        return this.author;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        Date date = this.createdAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public int getDownvoteCount() {
        Integer num = this.voteSum;
        if (num != null && this.voteCount != null) {
            return Math.abs(num.intValue() - this.voteCount.intValue()) / 2;
        }
        Logger.m31610b("Article", "Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
        return -1;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public Long getId() {
        return this.f35184id;
    }

    public String getLocale() {
        return this.locale;
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUpvoteCount() {
        Integer num = this.voteSum;
        if (num != null && this.voteCount != null) {
            return (num.intValue() + this.voteCount.intValue()) / 2;
        }
        Logger.m31610b("Article", "Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
        return -1;
    }

    public void setAuthor(User user) {
        this.author = user;
    }
}
