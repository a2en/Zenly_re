package zendesk.commonui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.zendesk.util.C12017g;
import p214e.p244l.p245a.p246a.C7643b;
import p214e.p244l.p245a.p246a.C7644c;

public class InputBox extends FrameLayout {

    /* renamed from: e */
    private AnimatorSet f35100e;

    /* renamed from: f */
    private AnimatorSet f35101f;

    /* renamed from: g */
    private AnimatorSet f35102g;

    /* renamed from: h */
    private AnimatorSet f35103h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AnimatorSet f35104i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AnimatorSet f35105j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public EditText f35106k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AttachmentsIndicator f35107l;

    /* renamed from: m */
    private ImageView f35108m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public InputTextConsumer f35109n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public TextWatcher f35110o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public OnClickListener f35111p;

    public interface InputTextConsumer {
        boolean onConsumeText(String str);
    }

    /* renamed from: zendesk.commonui.InputBox$a */
    class C13546a implements OnClickListener {
        C13546a() {
        }

        public void onClick(View view) {
            if (InputBox.this.f35111p != null) {
                InputBox.this.f35111p.onClick(view);
            }
        }
    }

    /* renamed from: zendesk.commonui.InputBox$b */
    class C13547b implements OnClickListener {
        C13547b() {
        }

        public void onClick(View view) {
            if (InputBox.this.f35109n != null && InputBox.this.f35109n.onConsumeText(InputBox.this.f35106k.getText().toString())) {
                InputBox.this.f35107l.mo38933a();
                InputBox.this.f35106k.setText(null);
            }
        }
    }

    /* renamed from: zendesk.commonui.InputBox$c */
    class C13548c extends C13560k {
        C13548c() {
        }

        public void afterTextChanged(Editable editable) {
            boolean b = C12017g.m31658b(editable.toString());
            boolean z = true;
            boolean z2 = InputBox.this.f35107l.getAttachmentsCount() > 0;
            InputBox inputBox = InputBox.this;
            boolean z3 = b || z2;
            if (!b && !z2) {
                z = false;
            }
            inputBox.m35881a(z3, z);
            if (InputBox.this.f35110o != null) {
                InputBox.this.f35110o.afterTextChanged(editable);
            }
        }
    }

    /* renamed from: zendesk.commonui.InputBox$d */
    class C13549d implements OnFocusChangeListener {
        C13549d() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                InputBox.this.f35104i.start();
            } else {
                InputBox.this.f35105j.start();
            }
        }
    }

    public InputBox(Context context) {
        super(context);
        m35878a(context);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.f35106k.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return !isEnabled() || super.dispatchTouchEvent(motionEvent);
    }

    public void setAttachmentsCount(int i) {
        this.f35107l.setAttachmentsCount(i);
    }

    public void setAttachmentsIndicatorClickListener(OnClickListener onClickListener) {
        this.f35111p = onClickListener;
        m35880a(onClickListener != null);
    }

    public void setInputTextConsumer(InputTextConsumer inputTextConsumer) {
        this.f35109n = inputTextConsumer;
    }

    public void setInputTextWatcher(TextWatcher textWatcher) {
        this.f35110o = textWatcher;
    }

    /* renamed from: b */
    private void m35883b() {
        Resources resources = getResources();
        int integer = resources.getInteger(C13556g.zui_input_box_transform_animation_duration);
        int dimensionPixelSize = resources.getDimensionPixelSize(C13554e.zui_input_box_collapsed_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C13554e.zui_input_box_expanded_min_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C13554e.zui_input_box_expanded_side_margin);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(C13554e.zui_input_box_collapsed_side_margin);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(C13554e.zui_input_box_expanded_top_padding);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(C13554e.zui_input_box_collapsed_top_padding);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C13554e.zui_input_box_expanded_bottom_padding);
        this.f35100e = new AnimatorSet();
        this.f35102g = new AnimatorSet();
        this.f35101f = new AnimatorSet();
        this.f35103h = new AnimatorSet();
        C7644c cVar = new C7644c();
        C7643b bVar = new C7643b();
        this.f35100e.setInterpolator(cVar);
        this.f35102g.setInterpolator(cVar);
        this.f35101f.setInterpolator(bVar);
        this.f35103h.setInterpolator(bVar);
        this.f35100e.play(C13563n.m35902b(this.f35106k, dimensionPixelSize, dimensionPixelSize2, integer)).with(C13563n.m35903c(this.f35106k, dimensionPixelSize4, dimensionPixelSize3, integer)).with(C13563n.m35904d(this.f35106k, dimensionPixelSize6, dimensionPixelSize5, integer)).with(C13563n.m35901a(this.f35106k, 0, dimensionPixelOffset, integer));
        this.f35101f.play(C13563n.m35903c(this.f35106k, dimensionPixelSize3, dimensionPixelSize4, integer)).with(C13563n.m35904d(this.f35106k, dimensionPixelSize5, dimensionPixelSize6, integer)).with(C13563n.m35902b(this.f35106k, dimensionPixelSize2, dimensionPixelSize, integer)).with(C13563n.m35901a(this.f35106k, dimensionPixelOffset, 0, integer));
        this.f35102g.play(C13563n.m35902b(this.f35106k, dimensionPixelSize, dimensionPixelSize2, integer)).with(C13563n.m35903c(this.f35106k, dimensionPixelSize3, dimensionPixelSize3, integer)).with(C13563n.m35904d(this.f35106k, dimensionPixelSize6, dimensionPixelSize5, integer)).with(C13563n.m35901a(this.f35106k, 0, dimensionPixelOffset, integer));
        this.f35103h.play(C13563n.m35903c(this.f35106k, dimensionPixelSize3, dimensionPixelSize3, integer)).with(C13563n.m35904d(this.f35106k, dimensionPixelSize5, dimensionPixelSize6, integer)).with(C13563n.m35902b(this.f35106k, dimensionPixelSize2, dimensionPixelSize, integer)).with(C13563n.m35901a(this.f35106k, dimensionPixelOffset, 0, integer));
    }

    /* renamed from: c */
    private void m35886c() {
        this.f35107l.setOnClickListener(new C13546a());
        this.f35108m.setOnClickListener(new C13547b());
        this.f35106k.addTextChangedListener(new C13548c());
        this.f35106k.setOnFocusChangeListener(new C13549d());
    }

    public InputBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35878a(context);
    }

    /* renamed from: a */
    private void m35878a(Context context) {
        FrameLayout.inflate(context, C13557h.zui_view_input_box, this);
        if (!isInEditMode()) {
            m35877a();
            m35886c();
            m35883b();
            m35880a(false);
        }
    }

    public InputBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35878a(context);
    }

    public InputBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m35878a(context);
    }

    InputBox(Context context, AttachmentsIndicator attachmentsIndicator, EditText editText, ImageView imageView, AnimatorSet animatorSet, AnimatorSet animatorSet2, AnimatorSet animatorSet3, AnimatorSet animatorSet4) {
        super(context);
        this.f35107l = attachmentsIndicator;
        this.f35106k = editText;
        this.f35108m = imageView;
        this.f35100e = animatorSet;
        this.f35102g = animatorSet3;
        this.f35101f = animatorSet2;
        this.f35103h = animatorSet4;
    }

    /* renamed from: a */
    private void m35877a() {
        this.f35106k = (EditText) findViewById(C13555f.input_box_input_text);
        this.f35107l = (AttachmentsIndicator) findViewById(C13555f.input_box_attachments_indicator);
        this.f35108m = (ImageView) findViewById(C13555f.input_box_send_btn);
    }

    /* renamed from: a */
    private void m35880a(boolean z) {
        if (z) {
            this.f35104i = this.f35100e;
            this.f35105j = this.f35101f;
            this.f35107l.setEnabled(true);
            m35884b(true);
            this.f35107l.setVisibility(0);
            return;
        }
        this.f35104i = this.f35102g;
        this.f35105j = this.f35103h;
        this.f35107l.setEnabled(false);
        this.f35107l.setVisibility(8);
        m35884b(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35881a(boolean z, boolean z2) {
        int i;
        Context context = getContext();
        if (z2) {
            i = C13562m.m35899a(C13552c.colorPrimary, context, C13553d.zui_color_primary);
        } else {
            i = C13562m.m35898a(C13553d.zui_input_box_send_btn_color_inactive, context);
        }
        int i2 = 0;
        this.f35108m.setEnabled(z && z2);
        ImageView imageView = this.f35108m;
        if (!z) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        C13562m.m35900a(i, this.f35108m.getDrawable(), (View) this.f35108m);
    }

    /* renamed from: b */
    private void m35884b(boolean z) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C13554e.zui_input_box_expanded_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C13554e.zui_input_box_collapsed_side_margin);
        LayoutParams layoutParams = (LayoutParams) this.f35106k.getLayoutParams();
        if (!z) {
            dimensionPixelSize2 = dimensionPixelSize;
        }
        layoutParams.leftMargin = dimensionPixelSize2;
        this.f35106k.setLayoutParams(layoutParams);
    }
}
