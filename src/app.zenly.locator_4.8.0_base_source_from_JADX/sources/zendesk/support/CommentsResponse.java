package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

public class CommentsResponse extends ResponseWrapper {
    private List<CommentResponse> comments;
    private List<User> users;

    public List<CommentResponse> getComments() {
        return C12010a.m31632a(this.comments);
    }

    public List<User> getUsers() {
        return C12010a.m31632a(this.users);
    }
}
