package zendesk.support.request;

import com.zendesk.util.C12017g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.Attachment;
import zendesk.support.User;

class StateRequestUser implements Serializable {
    private final String avatar;

    /* renamed from: id */
    private final long f35243id;
    private final boolean isAgent;
    private final String name;

    StateRequestUser(String str, String str2, boolean z, long j) {
        this.name = str;
        this.avatar = str2;
        this.isAgent = z;
        this.f35243id = j;
    }

    static boolean containsAgent(List<StateRequestUser> list) {
        for (StateRequestUser isAgent2 : list) {
            if (isAgent2.isAgent()) {
                return true;
            }
        }
        return false;
    }

    static List<StateRequestUser> convert(List<User> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (User user : list) {
            if (user.getId() != null) {
                Attachment photo = user.getPhoto();
                StateRequestUser stateRequestUser = new StateRequestUser(user.getName(), (photo == null || !C12017g.m31658b(photo.getContentUrl())) ? "" : photo.getContentUrl(), user.isAgent(), user.getId().longValue());
                arrayList.add(stateRequestUser);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public String getAvatar() {
        return this.avatar;
    }

    /* access modifiers changed from: 0000 */
    public long getId() {
        return this.f35243id;
    }

    /* access modifiers changed from: 0000 */
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: 0000 */
    public boolean isAgent() {
        return this.isAgent;
    }
}
