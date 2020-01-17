package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import java.util.List;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;

class CellUserAttachmentImage extends CellBase implements CellType$Attachment, CellType$Stateful {
    private final StateRequestAttachment attachment;
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final boolean showError;

    CellUserAttachmentImage(CellBindHelper cellBindHelper, StateMessage stateMessage, StateRequestAttachment stateRequestAttachment, Date date, boolean z, boolean z2, List<StateMessage> list, boolean z3) {
        super(cellBindHelper, C12138h.zs_request_user_attachment_image, stateRequestAttachment.getId(), -2147483647L, date);
        this.message = stateMessage;
        this.attachment = stateRequestAttachment;
        this.markAsDelivered = z;
        this.showError = z2;
        this.erroredMessages = list;
        CellBindHelper cellBindHelper2 = cellBindHelper;
        this.insets = cellBindHelper.getInsets(0, 0, 0, C12134d.zs_request_message_inset_user_bottom);
        this.lastErrorCellOfBlock = z3;
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C12140j.zs_request_message_user_image_accessibility, new Object[]{this.attachment.getName()}));
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
        ImageView imageView = (ImageView) requestViewHolder.findCachedView(C12136f.request_user_message_attachment_image);
        this.utils.bindImage(imageView, this.attachment);
        this.utils.addOnClickListenerForImageAttachment(imageView, this.attachment);
        this.utils.bindStatusLabel((TextView) requestViewHolder.findCachedView(C12136f.request_user_attachment_image_status), this.lastErrorCellOfBlock, this.markAsDelivered);
        OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        imageView.setColorFilter(this.utils.colorForErrorImage(this.showError));
        if (errorClickListener != null) {
            imageView.setOnClickListener(errorClickListener);
        }
        View findCachedView = requestViewHolder.findCachedView(C12136f.request_user_message_attachment_container);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    public StateRequestAttachment getAttachment() {
        return this.attachment;
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
        CellUserAttachmentImage cellUserAttachmentImage = new CellUserAttachmentImage(this.utils, this.message, this.attachment, getTimeStamp(), true, this.showError, this.erroredMessages, this.lastErrorCellOfBlock);
        return cellUserAttachmentImage;
    }

    public CellType$Stateful markAsErrored(List<StateMessage> list, boolean z) {
        CellUserAttachmentImage cellUserAttachmentImage = new CellUserAttachmentImage(this.utils, this.message, this.attachment, getTimeStamp(), this.markAsDelivered, true, list, z);
        return cellUserAttachmentImage;
    }
}
