package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class RawTicketField {
    private List<RawTicketFieldOption> customFieldOptions;
    private String description;

    /* renamed from: id */
    private long f35194id;
    private String regexpForValidation;
    private List<RawTicketFieldSystemOption> systemFieldOptions;
    private String title;
    private String titleInPortal;
    private TicketFieldType type;

    RawTicketField() {
    }

    /* access modifiers changed from: 0000 */
    public List<RawTicketFieldOption> getCustomFieldOptions() {
        return C12010a.m31632a(this.customFieldOptions);
    }

    /* access modifiers changed from: 0000 */
    public String getDescription() {
        return this.description;
    }

    /* access modifiers changed from: 0000 */
    public long getId() {
        return this.f35194id;
    }

    /* access modifiers changed from: 0000 */
    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    /* access modifiers changed from: 0000 */
    public List<RawTicketFieldSystemOption> getSystemFieldOptions() {
        return C12010a.m31632a(this.systemFieldOptions);
    }

    /* access modifiers changed from: 0000 */
    public String getTitle() {
        return this.title;
    }

    /* access modifiers changed from: 0000 */
    public String getTitleInPortal() {
        return this.titleInPortal;
    }

    /* access modifiers changed from: 0000 */
    public TicketFieldType getType() {
        return this.type;
    }
}
