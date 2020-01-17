package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ZendeskRequestSessionCache implements RequestSessionCache {
    private final Map<Long, TicketForm> cachedTicketForms = new HashMap();

    ZendeskRequestSessionCache() {
    }

    public boolean containsAllTicketForms(List<Long> list) {
        boolean z;
        List b = C12010a.m31638b(list);
        synchronized (this.cachedTicketForms) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!this.cachedTicketForms.containsKey((Long) it.next())) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public synchronized List<TicketForm> getTicketFormsById(List<Long> list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<Long> b = C12010a.m31638b(list);
        synchronized (this.cachedTicketForms) {
            for (Long l : b) {
                arrayList.add(this.cachedTicketForms.get(l));
            }
        }
        return arrayList;
    }

    public void updateTicketFormCache(List<TicketForm> list) {
        List<TicketForm> b = C12010a.m31638b(list);
        HashMap hashMap = new HashMap();
        for (TicketForm ticketForm : b) {
            hashMap.put(Long.valueOf(ticketForm.getId()), ticketForm);
        }
        synchronized (this.cachedTicketForms) {
            this.cachedTicketForms.putAll(hashMap);
        }
    }
}
