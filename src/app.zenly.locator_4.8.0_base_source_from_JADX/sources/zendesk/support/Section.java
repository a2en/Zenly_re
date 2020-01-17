package zendesk.support;

import java.io.Serializable;

public class Section implements Serializable {
    private Long categoryId;

    /* renamed from: id */
    private Long f35200id;
    private String name;

    public Long getCategoryId() {
        return this.categoryId;
    }

    public Long getId() {
        return this.f35200id;
    }

    public String getName() {
        return this.name;
    }
}
