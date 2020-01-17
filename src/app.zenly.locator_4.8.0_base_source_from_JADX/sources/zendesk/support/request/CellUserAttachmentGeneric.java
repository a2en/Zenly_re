package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.util.Date;
import java.util.List;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;

class CellUserAttachmentGeneric extends CellBase implements CellType$Attachment, CellType$Stateful {
    private final ResolveInfo appInfo;
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final StateRequestAttachment requestAttachment;
    private final boolean showError;

    CellUserAttachmentGeneric(CellBindHelper cellBindHelper, StateMessage stateMessage, StateRequestAttachment stateRequestAttachment, Date date, boolean z, boolean z2, List<StateMessage> list, boolean z3) {
        CellBindHelper cellBindHelper2 = cellBindHelper;
        super(cellBindHelper, C12138h.zs_request_user_attachment_generic, stateRequestAttachment.getId(), -2147483647L, date);
        this.requestAttachment = stateRequestAttachment;
        this.markAsDelivered = z;
        this.message = stateMessage;
        this.showError = z2;
        this.erroredMessages = list;
        this.lastErrorCellOfBlock = z3;
        this.appInfo = cellBindHelper.getAppInfo(stateRequestAttachment.getName());
        this.insets = cellBindHelper.getInsets(0, 0, 0, C12134d.zs_request_message_inset_user_bottom);
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C12140j.zs_request_message_user_file_accessibility, new Object[]{this.requestAttachment.getName()}));
        sb.append(" ");
        if (!this.showError) {
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true);
            sb.append(context.getString(C12140j.zs_request_message_user_sent_accessibility, new Object[]{relativeTimeSpanString}));
        } else {
            sb.append(context.getString(C12140j.zs_request_message_user_error_accessibility));
        }
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType$Base cellType$Base) {
        return this.utils.areAttachmentCellContentsTheSame(this, cellType$Base) && this.utils.areStatefulCellContentsTheSame(this, cellType$Base);
    }

    public void bind(RequestViewHolder requestViewHolder) {
        ((TextView) requestViewHolder.findCachedView(C12136f.request_user_attachment_generic_name)).setText(this.requestAttachment.getName());
        this.utils.bindAppInfo(this.appInfo, (TextView) requestViewHolder.findCachedView(C12136f.request_user_attachment_generic_type), (ImageView) requestViewHolder.findCachedView(C12136f.request_user_attachment_generic_icon));
        CardView cardView = (CardView) requestViewHolder.findCachedView(C12136f.request_user_attachment_generic_container);
        this.utils.addOnClickListenerForFileAttachment(cardView, this.requestAttachment);
        this.utils.bindStatusLabel((TextView) requestViewHolder.findCachedView(C12136f.request_user_attachment_generic_status), this.lastErrorCellOfBlock, this.markAsDelivered);
        OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        cardView.setCardBackgroundColor(this.utils.colorForError(this.showError));
        if (errorClickListener != null) {
            cardView.setOnClickListener(errorClickListener);
        }
        cardView.setContentDescription(buildTalkBackString(cardView.getContext()));
    }

    public StateRequestAttachment getAttachment() {
        return this.requestAttachment;
    }

    public List<StateMessage> getErrorGroupMessages() {
        return this.erroredMessages;
    }

    public Rect getInsets() {
        return this.insets;
    }

    public StateMessage getStateMessage() {
        return this.message;
    }

    public boolean isErrorShown() {
        return this.showError;
    }

    public boolean isLastErrorCellOfBlock() {
        return this.lastErrorCellOfBlock;
    }

    public boolean isMarkedAsDelivered() {
        return this.markAsDelivered;
    }

    public CellType$Stateful markAsDelivered() {
        CellUserAttachmentGeneric cellUserAttachmentGeneric = new CellUserAttachmentGeneric(this.utils, this.message, this.requestAttachment, getTimeStamp(), true, this.showError, this.erroredMessages, this.lastErrorCellOfBlock);
        return cellUserAttachmentGeneric;
    }

    public CellType$Stateful markAsErrored(List<StateMessage> list, boolean z) {
        CellUserAttachmentGeneric cellUserAttachmentGeneric = new CellUserAttachmentGeneric(this.utils, this.message, this.requestAttachment, getTimeStamp(), this.markAsDelivered, true, list, z);
        return cellUserAttachmentGeneric;
    }
}
