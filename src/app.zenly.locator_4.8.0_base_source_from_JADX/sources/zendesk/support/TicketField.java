package zendesk.support;

import java.util.ArrayList;
import java.util.List;

public class TicketField {
    TicketField(long j, TicketFieldType ticketFieldType, String str, String str2, String str3, String str4, List<TicketFieldOption> list, List<TicketFieldSystemOption> list2) {
    }

    static TicketField create(RawTicketField rawTicketField) {
        TicketFieldType ticketFieldType;
        ArrayList arrayList = new ArrayList();
        for (RawTicketFieldOption create : rawTicketField.getCustomFieldOptions()) {
            arrayList.add(TicketFieldOption.create(create));
        }
        ArrayList arrayList2 = new ArrayList();
        for (RawTicketFieldSystemOption create2 : rawTicketField.getSystemFieldOptions()) {
            arrayList2.add(TicketFieldSystemOption.create(create2));
        }
        if (rawTicketField.getType() != null) {
            ticketFieldType = rawTicketField.getType();
        } else {
            ticketFieldType = TicketFieldType.Unknown;
        }
        TicketField ticketField = new TicketField(rawTicketField.getId(), ticketFieldType, rawTicketField.getTitle(), rawTicketField.getTitleInPortal(), rawTicketField.getDescription(), rawTicketField.getRegexpForValidation(), arrayList, arrayList2);
        return ticketField;
    }
}
