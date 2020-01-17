package zendesk.support.request;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p333g.p384h.p385a.C12131a;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import zendesk.support.UiUtils;

class ViewCellAttachmentMenuItem extends FrameLayout {
    private TextView badge;
    private View badgeContainer;
    private View shadow;

    public ViewCellAttachmentMenuItem(Context context) {
        super(context);
        viewInit();
    }

    private void bindViews() {
        this.badgeContainer = findViewById(C12136f.request_actionview_badge_container);
        this.badge = (TextView) findViewById(C12136f.request_actionview_attachment_count);
        this.shadow = findViewById(C12136f.request_actionview_compat_shadow);
    }

    private void tintBadge() {
        UiUtils.setTint(UiUtils.themeAttributeToColor(C12131a.colorAccent, getContext(), C12133c.zs_request_fallback_color_primary), this.badge.getBackground(), this.badge);
    }

    private void viewInit() {
        FrameLayout.inflate(getContext(), C12138h.zs_request_attachment_actionview, this);
        bindViews();
        tintBadge();
        if (VERSION.SDK_INT < 21) {
            this.shadow.setVisibility(0);
        }
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), 0));
    }

    /* access modifiers changed from: 0000 */
    public void setBadgeCount(int i) {
        if (i > 0) {
            this.badgeContainer.setVisibility(0);
            this.badge.setText(String.valueOf(i));
        } else {
            this.badgeContainer.setVisibility(8);
        }
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), i));
    }

    public ViewCellAttachmentMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit();
    }

    public ViewCellAttachmentMenuItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit();
    }
}
