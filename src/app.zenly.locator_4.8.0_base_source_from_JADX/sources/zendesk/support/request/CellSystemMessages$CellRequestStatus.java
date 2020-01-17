package zendesk.support.request;

import android.widget.TextView;
import java.util.Date;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.support.RequestStatus;

class CellSystemMessages$CellRequestStatus extends CellBase {
    private final RequestStatus requestStatus;

    CellSystemMessages$CellRequestStatus(CellBindHelper cellBindHelper, RequestStatus requestStatus2) {
        super(cellBindHelper, C12138h.zs_request_system_message, -9223372036854775807L, -2147483648L, new Date());
        this.requestStatus = requestStatus2;
    }

    public boolean areContentsTheSame(CellType$Base cellType$Base) {
        return cellType$Base instanceof CellSystemMessages$CellRequestStatus;
    }

    public void bind(RequestViewHolder requestViewHolder) {
        TextView textView = (TextView) requestViewHolder.findCachedView(C12136f.request_system_message_text);
        if (this.requestStatus == RequestStatus.Closed) {
            textView.setText(C12140j.request_system_message_closed_ticket);
        }
    }
}
