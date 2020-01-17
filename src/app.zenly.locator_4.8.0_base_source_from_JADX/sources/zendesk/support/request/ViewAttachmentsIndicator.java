package zendesk.support.request;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0559a;
import p333g.p384h.p385a.C12131a;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.support.UiUtils;

public class ViewAttachmentsIndicator extends FrameLayout {
    private static final String COUNT_THRESHOLD_TEXT;
    private int attachmentsCount;
    private View attachmentsIndicatorBottomBorder;
    private TextView attachmentsIndicatorCounter;
    private ImageView attachmentsIndicatorIcon;
    private int colorActive;
    private int colorInactive;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(9));
        sb.append("+");
        COUNT_THRESHOLD_TEXT = sb.toString();
    }

    public ViewAttachmentsIndicator(Context context) {
        super(context);
        init(context);
    }

    /* access modifiers changed from: 0000 */
    public void enableActiveState(boolean z) {
        C0559a.m2650b(C0559a.m2657i(this.attachmentsIndicatorIcon.getDrawable()).mutate(), z ? this.colorActive : this.colorInactive);
        this.attachmentsIndicatorIcon.invalidate();
    }

    /* access modifiers changed from: 0000 */
    public int getAttachmentsCount() {
        return this.attachmentsCount;
    }

    /* access modifiers changed from: 0000 */
    public void init(Context context) {
        FrameLayout.inflate(context, C12138h.zs_view_request_attachments_indicator, this);
        if (!isInEditMode()) {
            this.attachmentsIndicatorIcon = (ImageView) findViewById(C12136f.attachments_indicator_icon);
            this.attachmentsIndicatorBottomBorder = findViewById(C12136f.attachments_indicator_bottom_border);
            this.attachmentsIndicatorCounter = (TextView) findViewById(C12136f.attachments_indicator_counter);
            this.colorActive = UiUtils.themeAttributeToColor(C12131a.colorPrimary, context, C12133c.zs_request_fallback_color_primary);
            this.colorInactive = UiUtils.resolveColor(C12133c.zs_request_attachment_indicator_color_inactive, context);
            ((GradientDrawable) ((LayerDrawable) this.attachmentsIndicatorCounter.getBackground()).findDrawableByLayerId(C12136f.inner_circle)).setColor(this.colorActive);
            getContext().getString(C12140j.zs_request_attachment_indicator_accessibility);
            setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
        }
    }

    /* access modifiers changed from: 0000 */
    public void reset() {
        setCounterVisible(false);
        setAttachmentsCount(0);
        setBottomBorderVisible(false);
        enableActiveState(false);
    }

    /* access modifiers changed from: 0000 */
    public void setAttachmentsCount(int i) {
        String str;
        this.attachmentsCount = i;
        int i2 = i > 9 ? C12134d.zs_request_attachment_indicator_counter_width_double_digit : C12134d.zs_request_attachment_indicator_counter_width_single_digit;
        LayoutParams layoutParams = this.attachmentsIndicatorCounter.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i2);
        this.attachmentsIndicatorCounter.setLayoutParams(layoutParams);
        TextView textView = this.attachmentsIndicatorCounter;
        if (i > 9) {
            str = COUNT_THRESHOLD_TEXT;
        } else {
            str = String.valueOf(i);
        }
        textView.setText(str);
        boolean z = i > 0;
        setCounterVisible(z);
        setBottomBorderVisible(z);
        enableActiveState(z);
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
    }

    /* access modifiers changed from: 0000 */
    public void setBottomBorderVisible(boolean z) {
        this.attachmentsIndicatorBottomBorder.setVisibility(z ? 0 : 4);
    }

    /* access modifiers changed from: 0000 */
    public void setCounterVisible(boolean z) {
        this.attachmentsIndicatorCounter.setVisibility(z ? 0 : 4);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
