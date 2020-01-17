package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class RawTicketFormResponse {
    private List<RawTicketField> ticketFields;
    private List<RawTicketForm> ticketForms;

    RawTicketFormResponse() {
    }

    /* access modifiers changed from: 0000 */
    public List<RawTicketField> getTicketFields() {
        return C12010a.m31632a(this.ticketFields);
    }

    /* access modifiers changed from: 0000 */
    public List<RawTicketForm> getTicketForms() {
        return C12010a.m31632a(this.ticketForms);
    }
}
