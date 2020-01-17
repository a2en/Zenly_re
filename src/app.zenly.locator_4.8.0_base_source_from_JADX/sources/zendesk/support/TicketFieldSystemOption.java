package zendesk.support;

public class TicketFieldSystemOption {
    TicketFieldSystemOption(String str, String str2) {
    }

    static TicketFieldSystemOption create(RawTicketFieldSystemOption rawTicketFieldSystemOption) {
        return new TicketFieldSystemOption(rawTicketFieldSystemOption.getName(), rawTicketFieldSystemOption.getValue());
    }
}
