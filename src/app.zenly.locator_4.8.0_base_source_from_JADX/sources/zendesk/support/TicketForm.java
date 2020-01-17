package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

public class TicketForm {

    /* renamed from: id */
    private long f35202id;

    public TicketForm(long j, String str, List<TicketField> list) {
        this.f35202id = j;
        C12010a.m31632a(list);
    }

    public long getId() {
        return this.f35202id;
    }
}
