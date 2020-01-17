package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;

class CellAgentAttachmentGeneric extends CellBase implements CellType$Attachment, CellType$Agent {
    private final ResolveInfo appInfo;
    private final Rect insets;
    private boolean isAgentNameVisible = false;
    private final StateRequestAttachment requestAttachment;
    private final StateRequestUser user;

    CellAgentAttachmentGeneric(CellBindHelper cellBindHelper, StateRequestAttachment stateRequestAttachment, StateRequestUser stateRequestUser, Date date) {
        super(cellBindHelper, C12138h.zs_request_agent_attachment_generic, stateRequestAttachment.getId(), stateRequestUser.getId(), date);
        this.requestAttachment = stateRequestAttachment;
        this.user = stateRequestUser;
        this.appInfo = cellBindHelper.getAppInfo(stateRequestAttachment.getName());
        this.insets = cellBindHelper.getInsets(0, 0, 0, C12134d.zs_request_message_inset_agent_attachment_bottom);
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C12140j.zs_request_message_agent_file_accessibility, new Object[]{this.requestAttachment.getName()}));
        sb.append(" ");
        CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(context, getTimeStamp().getTime(), true);
        sb.append(context.getString(C12140j.zs_request_message_agent_sent_accessibility, new Object[]{relativeTimeSpanString, this.user.getName()}));
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType$Base cellType$Base) {
        return this.utils.areAttachmentCellContentsTheSame(this, cellType$Base) && this.utils.areAgentCellContentsTheSame(this, cellType$Base);
    }

    public void bind(RequestViewHolder requestViewHolder) {
        ((TextView) requestViewHolder.findCachedView(C12136f.request_agent_attachment_generic_name)).setText(this.requestAttachment.getName());
        this.utils.bindAppInfo(this.appInfo, (TextView) requestViewHolder.findCachedView(C12136f.request_agent_attachment_generic_type), (ImageView) requestViewHolder.findCachedView(C12136f.request_agent_attachment_generic_icon));
        View findCachedView = requestViewHolder.findCachedView(C12136f.request_agent_attachment_generic_container);
        this.utils.addOnClickListenerForFileAttachment(findCachedView, this.requestAttachment);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(C12136f.request_agent_attachment_generic_agent_name), this.isAgentNameVisible, this.user);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    public StateRequestUser getAgent() {
        return this.user;
    }

    public StateRequestAttachment getAttachment() {
        return this.requestAttachment;
    }

    public Rect getInsets() {
        return this.insets;
    }

    public boolean isAgentNameVisible() {
        return this.isAgentNameVisible;
    }

    public void showAgentName(boolean z) {
        this.isAgentNameVisible = z;
    }
}
