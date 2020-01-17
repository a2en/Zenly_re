package zendesk.support;

public class TicketFieldOption {
    TicketFieldOption(long j, String str, String str2, boolean z) {
    }

    static TicketFieldOption create(RawTicketFieldOption rawTicketFieldOption) {
        TicketFieldOption ticketFieldOption = new TicketFieldOption(rawTicketFieldOption.getId(), rawTicketFieldOption.getName(), rawTicketFieldOption.getValue(), rawTicketFieldOption.isDefault());
        return ticketFieldOption;
    }
}
