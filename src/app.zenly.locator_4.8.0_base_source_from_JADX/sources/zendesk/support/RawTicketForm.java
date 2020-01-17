package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class RawTicketForm {

    /* renamed from: id */
    private long f35196id;
    private String name;
    private List<Long> ticketFieldIds;

    RawTicketForm() {
    }

    public static TicketForm create(RawTicketForm rawTicketForm, List<TicketField> list) {
        return new TicketForm(rawTicketForm.getId(), rawTicketForm.getName(), list);
    }

    /* access modifiers changed from: 0000 */
    public long getId() {
        return this.f35196id;
    }

    /* access modifiers changed from: 0000 */
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: 0000 */
    public List<Long> getTicketFieldIds() {
        return C12010a.m31632a(this.ticketFieldIds);
    }
}
