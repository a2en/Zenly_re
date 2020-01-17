package zendesk.support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private boolean agent;

    /* renamed from: id */
    private Long f35203id;
    private String name;
    private Long organizationId;
    private Attachment photo;
    private List<String> tags;
    private Map<String, String> userFields;

    public User(Long l, String str, Attachment attachment, boolean z, Long l2, List<String> list, Map<String, String> map) {
        this.f35203id = l;
        this.name = str;
        this.photo = attachment;
        this.agent = z;
        this.organizationId = l2;
        this.tags = list;
        this.userFields = map;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.agent != user.agent) {
            return false;
        }
        Long l = this.f35203id;
        if (l == null ? user.f35203id != null : !l.equals(user.f35203id)) {
            return false;
        }
        Attachment attachment = this.photo;
        if (attachment == null ? user.photo != null : !attachment.equals(user.photo)) {
            return false;
        }
        Long l2 = this.organizationId;
        if (l2 == null ? user.organizationId != null : !l2.equals(user.organizationId)) {
            return false;
        }
        List<String> list = this.tags;
        if (list == null ? user.tags != null : !list.equals(user.tags)) {
            return false;
        }
        Map<String, String> map = this.userFields;
        Map<String, String> map2 = user.userFields;
        if (map != null) {
            z = map.equals(map2);
        } else if (map2 != null) {
            z = false;
        }
        return z;
    }

    public Long getId() {
        return this.f35203id;
    }

    public String getName() {
        return this.name;
    }

    public Attachment getPhoto() {
        return this.photo;
    }

    public int hashCode() {
        Long l = this.f35203id;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Attachment attachment = this.photo;
        int hashCode2 = (((hashCode + (attachment != null ? attachment.hashCode() : 0)) * 31) + (this.agent ? 1 : 0)) * 31;
        Long l2 = this.organizationId;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        List<String> list = this.tags;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map = this.userFields;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public boolean isAgent() {
        return this.agent;
    }

    public User() {
        Long valueOf = Long.valueOf(-1);
        this.f35203id = valueOf;
        this.name = "";
        this.photo = null;
        this.agent = false;
        this.organizationId = valueOf;
        this.tags = new ArrayList();
        this.userFields = new HashMap();
    }
}
