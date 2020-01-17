package app.zenly.locator.chat.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.base.widget.C1315a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.chat.p053m5.C2097a;
import app.zenly.locator.chat.view.MediaEditText.ImageListener;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p253a.p260i.C7689e;

public final class ComposeView extends FrameLayout implements OnFocusChangeListener, OnEditorActionListener, ImageListener {

    /* renamed from: e */
    private int f7110e;

    /* renamed from: f */
    private boolean f7111f;

    /* renamed from: g */
    private int f7112g;

    /* renamed from: h */
    private String f7113h;

    /* renamed from: i */
    private boolean f7114i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public OnActionListener f7115j;

    /* renamed from: k */
    private boolean f7116k;

    /* renamed from: l */
    private boolean f7117l;

    /* renamed from: m */
    private HashMap f7118m;

    public interface OnActionListener {
        void onEmojiButtonClicked();

        void onFocusChanged(boolean z);

        void onInputClicked();

        void onMediaButtonClicked();

        void onMeetButtonClicked();

        void onMessageSend(C2097a aVar, C2353g gVar);

        void onMessageTyped(CharSequence charSequence);
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$a */
    static final class C2347a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ComposeView f7119e;

        C2347a(ComposeView composeView) {
            this.f7119e = composeView;
        }

        public final void onClick(View view) {
            OnActionListener a = this.f7119e.f7115j;
            if (a != null) {
                a.onMeetButtonClicked();
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$b */
    static final class C2348b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ComposeView f7120e;

        C2348b(ComposeView composeView) {
            this.f7120e = composeView;
        }

        public final void onClick(View view) {
            OnActionListener a = this.f7120e.f7115j;
            if (a != null) {
                a.onEmojiButtonClicked();
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$c */
    static final class C2349c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ComposeView f7121e;

        C2349c(ComposeView composeView) {
            this.f7121e = composeView;
        }

        public final void onClick(View view) {
            OnActionListener a = this.f7121e.f7115j;
            if (a != null) {
                a.onMediaButtonClicked();
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$d */
    static final class C2350d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ComposeView f7122e;

        C2350d(ComposeView composeView) {
            this.f7122e = composeView;
        }

        public final void onClick(View view) {
            this.f7122e.m8380a(C2353g.BUTTON);
        }
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$e */
    public static final class C2351e extends C7689e {

        /* renamed from: e */
        final /* synthetic */ ComposeView f7123e;

        C2351e(ComposeView composeView) {
            this.f7123e = composeView;
        }

        public void afterTextChanged(Editable editable) {
            C12932j.m33818b(editable, "s");
            this.f7123e.m8383a(editable.length() == 0);
            OnActionListener a = this.f7123e.f7115j;
            if (a != null) {
                a.onMessageTyped(editable);
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$f */
    static final class C2352f implements OnTouchListener {

        /* renamed from: e */
        final /* synthetic */ ComposeView f7124e;

        C2352f(ComposeView composeView) {
            this.f7124e = composeView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C12932j.m33815a((Object) motionEvent, "event");
            if (motionEvent.getAction() == 1) {
                OnActionListener a = this.f7124e.f7115j;
                if (a != null) {
                    a.onInputClicked();
                }
            }
            return false;
        }
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$g */
    public enum C2353g {
        BUTTON,
        KEYBOARD
    }

    /* renamed from: app.zenly.locator.chat.view.ComposeView$h */
    static final class C2354h implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ComposeView f7128e;

        C2354h(ComposeView composeView) {
            this.f7128e = composeView;
        }

        public final void run() {
            MediaEditText mediaEditText = (MediaEditText) this.f7128e.mo8257a(C3891l.compose_input);
            C12932j.m33815a((Object) mediaEditText, "compose_input");
            C1297b.m6241b(mediaEditText);
        }
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    private final void m8385c() {
        if (this.f7116k) {
            Context context = getContext();
            C12932j.m33815a((Object) context, "context");
            setBackgroundColor(C7678c.m18702a(context, (int) R.attr.zenlyColorBackground));
            return;
        }
        setBackgroundResource(C7674a.f19294a);
    }

    /* renamed from: d */
    private final void m8386d() {
        boolean z = this.f7116k && this.f7117l;
        MediaEditText mediaEditText = (MediaEditText) mo8257a(C3891l.compose_input);
        String str = "compose_input";
        C12932j.m33815a((Object) mediaEditText, str);
        mediaEditText.setFocusable(z);
        MediaEditText mediaEditText2 = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText2, str);
        mediaEditText2.setFocusableInTouchMode(z);
        MediaEditText mediaEditText3 = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText3, str);
        mediaEditText3.setCursorVisible(z);
        if (!z) {
            MediaEditText mediaEditText4 = (MediaEditText) mo8257a(C3891l.compose_input);
            C12932j.m33815a((Object) mediaEditText4, str);
            C1297b.m6240a(mediaEditText4, false, 2, null);
        }
    }

    /* renamed from: e */
    private final void m8387e() {
        MediaEditText mediaEditText = (MediaEditText) mo8257a(C3891l.compose_input);
        String str = "compose_input";
        C12932j.m33815a((Object) mediaEditText, str);
        mediaEditText.setHint(this.f7114i ? this.f7113h : null);
        MediaEditText mediaEditText2 = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText2, str);
        mediaEditText2.setMaxLines((!this.f7116k || this.f7114i) ? 1 : this.f7112g);
    }

    /* renamed from: f */
    private final void m8388f() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.f7116k ? R.dimen.spacing_100 : R.dimen.spacing_200);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo8257a(C3891l.compose_layout);
        C12932j.m33815a((Object) constraintLayout, "compose_layout");
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), dimensionPixelSize, constraintLayout.getPaddingRight(), dimensionPixelSize);
    }

    /* renamed from: a */
    public View mo8257a(int i) {
        if (this.f7118m == null) {
            this.f7118m = new HashMap();
        }
        View view = (View) this.f7118m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f7118m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final void mo8261b(int i) {
        View a = mo8257a(C3891l.compose_background);
        C12932j.m33815a((Object) a, "compose_background");
        Drawable background = a.getBackground();
        C12932j.m33815a((Object) background, "compose_background.background");
        background.setAlpha(i);
    }

    public final String getText() {
        MediaEditText mediaEditText = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText, "compose_input");
        return String.valueOf(mediaEditText.getText());
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C12932j.m33818b(textView, "v");
        if (i != 4) {
            return false;
        }
        m8380a(C2353g.KEYBOARD);
        return true;
    }

    public void onFocusChange(View view, boolean z) {
        C12932j.m33818b(view, "v");
        OnActionListener onActionListener = this.f7115j;
        if (onActionListener != null) {
            onActionListener.onFocusChanged(z);
        }
    }

    public void onImageSelected(String str, int i, int i2) {
        C12932j.m33818b(str, "imagePath");
        C2097a a = C2097a.m7847a(str, i, i2);
        OnActionListener onActionListener = this.f7115j;
        if (onActionListener != null) {
            C12932j.m33815a((Object) a, "message");
            onActionListener.onMessageSend(a, C2353g.KEYBOARD);
        }
    }

    public final void setEditable(boolean z) {
        if (z != this.f7116k) {
            this.f7116k = z;
            m8387e();
            m8386d();
            m8384b();
            m8385c();
            m8388f();
            if (this.f7116k && this.f7117l) {
                post(new C2354h(this));
            }
        }
    }

    public final void setOnActionListener(OnActionListener onActionListener) {
        C12932j.m33818b(onActionListener, "listener");
        this.f7115j = onActionListener;
    }

    public final void setStateEnabled(boolean z) {
        if (z != this.f7117l) {
            this.f7117l = z;
            m8386d();
            m8384b();
        }
    }

    public final void setText(String str) {
        ((MediaEditText) mo8257a(C3891l.compose_input)).setText(str);
        MediaEditText mediaEditText = (MediaEditText) mo8257a(C3891l.compose_input);
        MediaEditText mediaEditText2 = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText2, "compose_input");
        Editable text = mediaEditText2.getText();
        if (text != null) {
            mediaEditText.setSelection(text.length());
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f7110e = -1;
        this.f7114i = true;
        this.f7117l = true;
        View.inflate(context, R.layout.view_compose, this);
        setClickable(true);
        ((ImageButton) mo8257a(C3891l.compose_meet_button)).setOnClickListener(new C2347a(this));
        ((AppCompatImageView) mo8257a(C3891l.compose_emoji_button)).setOnClickListener(new C2348b(this));
        ((AppCompatImageView) mo8257a(C3891l.compose_media_button)).setOnClickListener(new C2349c(this));
        ((TextView) mo8257a(C3891l.compose_send_button)).setOnClickListener(new C2350d(this));
        ((MediaEditText) mo8257a(C3891l.compose_input)).setOnEditorActionListener(this);
        ((MediaEditText) mo8257a(C3891l.compose_input)).setImageListener(this);
        MediaEditText mediaEditText = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText, "compose_input");
        this.f7112g = mediaEditText.getMaxLines();
        ((MediaEditText) mo8257a(C3891l.compose_input)).addTextChangedListener(new C2351e(this));
        ((MediaEditText) mo8257a(C3891l.compose_input)).setOnTouchListener(new C2352f(this));
    }

    /* renamed from: b */
    private final void m8384b() {
        int i = 0;
        int i2 = this.f7117l ? 0 : 8;
        if (!this.f7117l || (!this.f7111f && this.f7110e != 1)) {
            i = 8;
        }
        String str = "compose_send_button";
        String str2 = "compose_media_button";
        String str3 = "compose_emoji_button";
        String str4 = "compose_meet_button";
        if (!this.f7116k || this.f7114i) {
            ImageButton imageButton = (ImageButton) mo8257a(C3891l.compose_meet_button);
            C12932j.m33815a((Object) imageButton, str4);
            imageButton.setVisibility((this.f7116k || this.f7110e != 0) ? 8 : i2);
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo8257a(C3891l.compose_emoji_button);
            C12932j.m33815a((Object) appCompatImageView, str3);
            if (!this.f7116k) {
                i2 = 8;
            }
            appCompatImageView.setVisibility(i2);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo8257a(C3891l.compose_media_button);
            C12932j.m33815a((Object) appCompatImageView2, str2);
            appCompatImageView2.setVisibility(i);
            TextView textView = (TextView) mo8257a(C3891l.compose_send_button);
            C12932j.m33815a((Object) textView, str);
            textView.setVisibility(8);
            return;
        }
        ImageButton imageButton2 = (ImageButton) mo8257a(C3891l.compose_meet_button);
        C12932j.m33815a((Object) imageButton2, str4);
        imageButton2.setVisibility(8);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo8257a(C3891l.compose_emoji_button);
        C12932j.m33815a((Object) appCompatImageView3, str3);
        appCompatImageView3.setVisibility(8);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) mo8257a(C3891l.compose_media_button);
        C12932j.m33815a((Object) appCompatImageView4, str2);
        appCompatImageView4.setVisibility(8);
        TextView textView2 = (TextView) mo8257a(C3891l.compose_send_button);
        C12932j.m33815a((Object) textView2, str);
        textView2.setVisibility(i2);
    }

    /* renamed from: a */
    public final boolean mo8260a() {
        return this.f7117l;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8380a(C2353g gVar) {
        MediaEditText mediaEditText = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText, "compose_input");
        String valueOf = String.valueOf(mediaEditText.getText());
        if (valueOf != null) {
            String obj = C13029r.m34033f(valueOf).toString();
            if (!(obj.length() == 0)) {
                ((MediaEditText) mo8257a(C3891l.compose_input)).setText("");
                C2097a a = C2097a.m7846a(obj);
                OnActionListener onActionListener = this.f7115j;
                if (onActionListener != null) {
                    C12932j.m33815a((Object) a, "message");
                    onActionListener.onMessageSend(a, gVar);
                }
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    public final void mo8258a(int i, int i2, Object... objArr) {
        C12932j.m33818b(objArr, "args");
        MediaEditText mediaEditText = (MediaEditText) mo8257a(C3891l.compose_input);
        C12932j.m33815a((Object) mediaEditText, "compose_input");
        C1315a.m6316a((TextView) mediaEditText, i, 0, 0, 0, 14, (Object) null);
        this.f7113h = getContext().getString(i2, Arrays.copyOf(objArr, objArr.length));
        m8387e();
    }

    /* renamed from: a */
    public final void mo8259a(int i, boolean z) {
        this.f7110e = i;
        this.f7111f = z;
        m8384b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8383a(boolean z) {
        if (z != this.f7114i) {
            this.f7114i = z;
            m8387e();
            m8384b();
        }
    }
}
