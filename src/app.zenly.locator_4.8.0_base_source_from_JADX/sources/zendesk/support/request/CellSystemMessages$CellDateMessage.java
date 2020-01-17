package zendesk.support.request;

import android.widget.TextView;
import java.util.Date;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;

class CellSystemMessages$CellDateMessage extends CellBase {
    CellSystemMessages$CellDateMessage(CellBindHelper cellBindHelper, long j, Date date) {
        super(cellBindHelper, C12138h.zs_request_date_message, j, -2147483648L, date);
    }

    public boolean areContentsTheSame(CellType$Base cellType$Base) {
        return getTimeStamp().equals(cellType$Base.getTimeStamp());
    }

    public void bind(RequestViewHolder requestViewHolder) {
        this.utils.bindDate((TextView) requestViewHolder.findCachedView(C12136f.request_date_message_text), getTimeStamp());
    }
}
