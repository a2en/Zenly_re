package zendesk.support.request;

import android.widget.TextView;
import java.util.Date;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;

class CellSystemMessages$CellSystemMessage extends CellBase {
    private final String message;

    CellSystemMessages$CellSystemMessage(Date date, String str) {
        super(null, C12138h.zs_request_system_message, Long.MIN_VALUE, -2147483648L, date);
        this.message = str;
    }

    public boolean areContentsTheSame(CellType$Base cellType$Base) {
        return cellType$Base instanceof CellSystemMessages$CellSystemMessage;
    }

    public void bind(RequestViewHolder requestViewHolder) {
        ((TextView) requestViewHolder.findCachedView(C12136f.request_system_message_text)).setText(this.message);
    }
}
