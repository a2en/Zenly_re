package zendesk.support;

import java.util.List;

interface RequestSessionCache {
    boolean containsAllTicketForms(List<Long> list);

    List<TicketForm> getTicketFormsById(List<Long> list);

    void updateTicketFormCache(List<TicketForm> list);
}
