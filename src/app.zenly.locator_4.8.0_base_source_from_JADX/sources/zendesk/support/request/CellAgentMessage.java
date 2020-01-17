package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;

class CellAgentMessage extends CellBase implements CellType$Message, CellType$Agent {
    private final Rect insets;
    private final StateMessage message;
    private boolean showAgentName = false;
    private final CharSequence textMessage;
    private final StateRequestUser user;

    CellAgentMessage(CellBindHelper cellBindHelper, StateMessage stateMessage, CharSequence charSequence, StateRequestUser stateRequestUser) {
        super(cellBindHelper, C12138h.zs_request_agent_message, stateMessage.getId(), stateMessage.getUserId(), stateMessage.getDate());
        this.textMessage = charSequence;
        this.message = stateMessage;
        this.user = stateRequestUser;
        this.insets = cellBindHelper.getInsets(0, C12134d.zs_request_message_inset_agent_top, 0, C12134d.zs_request_message_inset_agent_bottom);
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C12140j.zs_request_message_agent_text_accessibility, new Object[]{this.textMessage}));
        sb.append(" ");
        CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true);
        sb.append(context.getString(C12140j.zs_request_message_agent_sent_accessibility, new Object[]{relativeTimeSpanString, this.user.getName()}));
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType$Base cellType$Base) {
        return this.utils.areMessageContentsTheSame(this, cellType$Base) && this.utils.areAgentCellContentsTheSame(this, cellType$Base);
    }

    public void bind(RequestViewHolder requestViewHolder) {
        ViewRequestText viewRequestText = (ViewRequestText) requestViewHolder.findCachedView(C12136f.request_agent_message_text);
        viewRequestText.setText(this.textMessage);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(C12136f.request_agent_name), this.showAgentName, this.user);
        View findCachedView = requestViewHolder.findCachedView(C12136f.request_agent_message_bubble);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
        viewRequestText.requestLayout();
    }

    public StateRequestUser getAgent() {
        return this.user;
    }

    public Rect getInsets() {
        return this.insets;
    }

    public CharSequence getMessage() {
        return this.message.getBody();
    }

    public boolean isAgentNameVisible() {
        return this.showAgentName;
    }

    public void showAgentName(boolean z) {
        this.showAgentName = z;
    }
}
