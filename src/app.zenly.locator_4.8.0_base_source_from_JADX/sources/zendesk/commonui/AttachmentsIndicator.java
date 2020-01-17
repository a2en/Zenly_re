package zendesk.commonui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class AttachmentsIndicator extends FrameLayout {

    /* renamed from: k */
    private static final String f35091k;

    /* renamed from: e */
    private ImageView f35092e;

    /* renamed from: f */
    private View f35093f;

    /* renamed from: g */
    private TextView f35094g;

    /* renamed from: h */
    private int f35095h;

    /* renamed from: i */
    private int f35096i;

    /* renamed from: j */
    private int f35097j;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(9));
        sb.append("+");
        f35091k = sb.toString();
    }

    public AttachmentsIndicator(Context context) {
        super(context);
        mo38934a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38934a(Context context) {
        FrameLayout.inflate(context, C13557h.zui_view_attachments_indicator, this);
        if (!isInEditMode()) {
            this.f35092e = (ImageView) findViewById(C13555f.attachments_indicator_icon);
            this.f35093f = findViewById(C13555f.attachments_indicator_bottom_border);
            this.f35094g = (TextView) findViewById(C13555f.attachments_indicator_counter);
            this.f35095h = C13562m.m35899a(C13552c.colorPrimary, context, C13553d.zui_color_primary);
            this.f35096i = C13562m.m35898a(C13553d.zui_attachment_indicator_color_inactive, context);
            ((GradientDrawable) ((LayerDrawable) this.f35094g.getBackground()).findDrawableByLayerId(C13555f.inner_circle)).setColor(this.f35095h);
            setContentDescription(m35870a(getContext(), this.f35097j));
        }
    }

    /* access modifiers changed from: 0000 */
    public int getAttachmentsCount() {
        return this.f35097j;
    }

    /* access modifiers changed from: 0000 */
    public void setAttachmentsCount(int i) {
        String str;
        this.f35097j = i;
        int i2 = i > 9 ? C13554e.zui_attachment_indicator_counter_width_double_digit : C13554e.zui_attachment_indicator_counter_width_single_digit;
        LayoutParams layoutParams = this.f35094g.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i2);
        this.f35094g.setLayoutParams(layoutParams);
        TextView textView = this.f35094g;
        if (i > 9) {
            str = f35091k;
        } else {
            str = String.valueOf(i);
        }
        textView.setText(str);
        boolean z = i > 0;
        setCounterVisible(z);
        setBottomBorderVisible(z);
        mo38935a(z);
        setContentDescription(m35870a(getContext(), i));
    }

    /* access modifiers changed from: 0000 */
    public void setBottomBorderVisible(boolean z) {
        this.f35093f.setVisibility(z ? 0 : 4);
    }

    /* access modifiers changed from: 0000 */
    public void setCounterVisible(boolean z) {
        this.f35094g.setVisibility(z ? 0 : 4);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo38934a(context);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo38934a(context);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo38934a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38935a(boolean z) {
        C13562m.m35900a(z ? this.f35095h : this.f35096i, this.f35092e.getDrawable(), (View) this.f35092e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38933a() {
        setCounterVisible(false);
        setAttachmentsCount(0);
        setBottomBorderVisible(false);
        mo38935a(false);
    }

    /* renamed from: a */
    static String m35870a(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C13558i.zui_attachment_indicator_accessibility));
        sb.append(". ");
        if (i == 0) {
            sb.append(context.getString(C13558i.zui_attachment_indicator_no_attachments_selected_accessibility));
        } else if (i == 1) {
            sb.append(context.getString(C13558i.zui_attachment_indicator_one_attachments_selected_accessibility));
        } else {
            sb.append(context.getString(C13558i.zui_attachment_indicator_n_attachments_selected_accessibility, new Object[]{Integer.valueOf(i)}));
        }
        return sb.toString();
    }
}
