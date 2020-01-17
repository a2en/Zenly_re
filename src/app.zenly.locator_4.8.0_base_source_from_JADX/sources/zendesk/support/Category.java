package zendesk.support;

import java.io.Serializable;

public class Category implements Serializable {
    private String description;

    /* renamed from: id */
    private Long f35188id;
    private String name;

    public String getDescription() {
        return this.description;
    }

    public Long getId() {
        return this.f35188id;
    }

    public String getName() {
        return this.name;
    }
}
