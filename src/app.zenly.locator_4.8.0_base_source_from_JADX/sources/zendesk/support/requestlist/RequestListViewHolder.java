package zendesk.support.requestlist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.squareup.picasso.Picasso;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p333g.p384h.p385a.C12131a;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;

class RequestListViewHolder extends C1085v {
    private final int avatarRadius = this.context.getResources().getDimensionPixelOffset(C12134d.zs_request_list_avatar_radius);
    private final ZendeskAvatarView avatarView;
    private final TextView commentText;
    private final Context context;
    /* access modifiers changed from: private */
    public final OnItemClick listener;
    private final Picasso picasso;
    private final TextView subjectText;
    private final TextView timeText;
    private final TextView userText;

    private RequestListViewHolder(View view, OnItemClick onItemClick, Picasso picasso2) {
        super(view);
        this.listener = onItemClick;
        this.picasso = picasso2;
        this.context = view.getContext();
        this.avatarView = (ZendeskAvatarView) view.findViewById(C12136f.request_list_item_avatar);
        this.timeText = (TextView) view.findViewById(C12136f.request_list_item_time);
        this.userText = (TextView) view.findViewById(C12136f.request_list_item_user);
        this.subjectText = (TextView) view.findViewById(C12136f.request_list_item_subject);
        this.commentText = (TextView) view.findViewById(C12136f.request_list_item_body);
    }

    private void bindAvatar(boolean z, List<String> list, String str) {
        if (!z) {
            this.avatarView.showUserWithIdentifier(Integer.valueOf(C12140j.request_list_me));
        } else if (C12017g.m31658b(str)) {
            this.avatarView.showUserWithAvatarImage(this.picasso, str, (String) list.get(0), this.avatarRadius);
        } else {
            this.avatarView.showUserWithName((String) list.get(0));
        }
    }

    static RequestListViewHolder create(Context context2, ViewGroup viewGroup, OnItemClick onItemClick, Picasso picasso2) {
        return new RequestListViewHolder(LayoutInflater.from(context2).inflate(C12138h.zs_request_list_ticket_item, viewGroup, false), onItemClick, picasso2);
    }

    private String generateUserText(String str, List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        return TextUtils.join(", ", arrayList);
    }

    private CharSequence getDateTimeString(Date date) {
        return DateUtils.getRelativeTimeSpanString(this.context, date.getTime(), false);
    }

    private void style(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(1));
            this.userText.setTypeface(Typeface.defaultFromStyle(1));
            this.commentText.setTextColor(C0540a.m2536a(this.context, C12133c.zs_request_list_dark_text_color));
            this.timeText.setTextColor(UiUtils.themeAttributeToColor(C12131a.colorPrimary, this.context, C12133c.zs_request_list_light_text_color));
        } else {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(0));
            this.userText.setTypeface(Typeface.defaultFromStyle(0));
            this.commentText.setTextColor(C0540a.m2536a(this.context, C12133c.zs_request_list_light_text_color));
            this.timeText.setTextColor(C0540a.m2536a(this.context, C12133c.zs_request_list_light_text_color));
        }
        if (z2) {
            this.commentText.setTextColor(C0540a.m2536a(this.context, C12133c.zs_request_cell_label_color_error));
        }
        this.itemView.setBackgroundColor(C0540a.m2536a(this.context, z3 ? C12133c.zs_request_list_default_item_background : C12133c.zs_request_list_white));
    }

    /* access modifiers changed from: 0000 */
    public void bind(final RequestListItem requestListItem) {
        String str;
        this.userText.setText(generateUserText(this.context.getString(C12140j.request_list_me), requestListItem.getLastCommentingAgentNames()));
        TextView textView = this.subjectText;
        if (requestListItem.hasAgentReplied()) {
            str = this.context.getString(C12140j.request_list_re, new Object[]{requestListItem.getFirstMessage()});
        } else {
            str = requestListItem.getFirstMessage();
        }
        textView.setText(str);
        if (requestListItem.isClosed()) {
            this.commentText.setText(C12140j.request_list_ticket_closed);
        } else if (requestListItem.isFailed()) {
            this.commentText.setText(C12140j.ask_request_list_failed_request_message);
        } else {
            this.commentText.setText(requestListItem.getLastMessage());
        }
        this.timeText.setText(getDateTimeString(requestListItem.getLastUpdated()));
        bindAvatar(requestListItem.hasAgentReplied(), requestListItem.getLastCommentingAgentNames(), requestListItem.getAvatar());
        style(requestListItem.isUnread(), requestListItem.isFailed(), requestListItem.isClosed());
        this.itemView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                RequestListViewHolder.this.listener.onClick(requestListItem);
            }
        });
    }
}
