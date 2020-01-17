package app.zenly.android.feature.polenta.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0540a;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.base.widget.LinearLayout;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p263b.p279d.C7765a;
import p250f.p251a.p252a.p263b.p279d.C7768d;
import p250f.p251a.p252a.p263b.p279d.C7769e;
import p250f.p251a.p252a.p263b.p279d.C7770f;
import p250f.p251a.p252a.p263b.p279d.C7771g;

@SuppressLint({"CustomViewStyleable"})
public final class ScreenBar extends LinearLayout {

    /* renamed from: A */
    private OnClickListener f5202A;

    /* renamed from: B */
    private CharSequence f5203B;

    /* renamed from: C */
    private OnClickListener f5204C;

    /* renamed from: D */
    private boolean f5205D;

    /* renamed from: E */
    private HashMap f5206E;

    /* renamed from: v */
    private final Lazy<TextView> f5207v;

    /* renamed from: w */
    private final Lazy<ImageView> f5208w;

    /* renamed from: x */
    private final Lazy<TextView> f5209x;

    /* renamed from: y */
    private int f5210y;

    /* renamed from: z */
    private OnClickListener f5211z;

    /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBar$a */
    static final class C1429a extends C12933k implements Function0<TextView> {

        /* renamed from: f */
        final /* synthetic */ ScreenBar f5212f;

        /* renamed from: g */
        final /* synthetic */ Context f5213g;

        C1429a(ScreenBar screenBar, Context context) {
            this.f5212f = screenBar;
            this.f5213g = context;
            super(0);
        }

        public final TextView invoke() {
            LinearLayout linearLayout = (LinearLayout) this.f5212f.mo6849d(C7768d.actions);
            View inflate = LayoutInflater.from(this.f5213g).inflate(C7769e.view_screen_bar__action, linearLayout, false);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setOnClickListener(this.f5212f.getActionClickListener());
                C1448b.m6544a(textView, this.f5212f.getActionStyle());
                linearLayout.addView(textView);
                return textView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBar$b */
    static final class C1430b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ScreenBar f5214e;

        /* renamed from: f */
        final /* synthetic */ Function1 f5215f;

        C1430b(ScreenBar screenBar, Function1 function1) {
            this.f5214e = screenBar;
            this.f5215f = function1;
        }

        public final void onClick(View view) {
            this.f5215f.invoke(this.f5214e);
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBar$c */
    static final class C1431c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ScreenBar f5216e;

        /* renamed from: f */
        final /* synthetic */ Function1 f5217f;

        C1431c(ScreenBar screenBar, Function1 function1) {
            this.f5216e = screenBar;
            this.f5217f = function1;
        }

        public final void onClick(View view) {
            this.f5217f.invoke(this.f5216e);
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBar$d */
    static final class C1432d extends C12933k implements Function0<ImageView> {

        /* renamed from: f */
        final /* synthetic */ ScreenBar f5218f;

        /* renamed from: g */
        final /* synthetic */ Context f5219g;

        C1432d(ScreenBar screenBar, Context context) {
            this.f5218f = screenBar;
            this.f5219g = context;
            super(0);
        }

        public final ImageView invoke() {
            LinearLayout linearLayout = (LinearLayout) this.f5218f.mo6849d(C7768d.actions);
            View inflate = LayoutInflater.from(this.f5219g).inflate(C7769e.view_screen_bar__secondary_action, linearLayout, false);
            if (inflate != null) {
                ImageView imageView = (ImageView) inflate;
                imageView.setOnClickListener(this.f5218f.getSecondaryActionClickListener());
                linearLayout.addView(imageView, 0);
                return imageView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBar$e */
    static final class C1433e extends C12933k implements Function0<TextView> {

        /* renamed from: f */
        final /* synthetic */ ScreenBar f5220f;

        /* renamed from: g */
        final /* synthetic */ Context f5221g;

        C1433e(ScreenBar screenBar, Context context) {
            this.f5220f = screenBar;
            this.f5221g = context;
            super(0);
        }

        public final TextView invoke() {
            View inflate = LayoutInflater.from(this.f5221g).inflate(C7769e.view_screen_bar__subtitle, this.f5220f, false);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setOnClickListener(this.f5220f.getSubtitleClickListener());
                this.f5220f.addView(textView);
                return textView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public ScreenBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public ScreenBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ScreenBar(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = C7765a.screenBarStyle;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    private final void m6513c() {
        if (this.f5208w.isInitialized()) {
            ((ImageView) this.f5208w.getValue()).setVisibility(getSecondaryActionIcon() != null ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo6846a() {
        ((TextView) this.f5207v.getValue()).setCompoundDrawablePadding(0);
    }

    /* renamed from: b */
    public final void mo6848b(Function1<? super ScreenBar, C12956q> function1) {
        C12932j.m33818b(function1, "callback");
        setSecondaryActionClickListener(new C1431c(this, function1));
    }

    /* renamed from: d */
    public View mo6849d(int i) {
        if (this.f5206E == null) {
            this.f5206E = new HashMap();
        }
        View view = (View) this.f5206E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f5206E.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final OnClickListener getActionClickListener() {
        return this.f5211z;
    }

    public final Drawable getActionIcon() {
        if (this.f5207v.isInitialized()) {
            return ((TextView) this.f5207v.getValue()).getCompoundDrawablesRelative()[0];
        }
        return null;
    }

    public final int getActionStyle() {
        return this.f5210y;
    }

    public final CharSequence getActionText() {
        if (this.f5207v.isInitialized()) {
            return ((TextView) this.f5207v.getValue()).getText();
        }
        return null;
    }

    public final OnClickListener getSecondaryActionClickListener() {
        return this.f5202A;
    }

    public final Drawable getSecondaryActionIcon() {
        if (this.f5208w.isInitialized()) {
            return ((ImageView) this.f5208w.getValue()).getDrawable();
        }
        return null;
    }

    public final boolean getSingleLine() {
        return this.f5205D;
    }

    public final CharSequence getSubtitle() {
        return this.f5203B;
    }

    public final OnClickListener getSubtitleClickListener() {
        return this.f5204C;
    }

    public final CharSequence getTitle() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo6849d(C7768d.view_title);
        C12932j.m33815a((Object) appCompatTextView, "view_title");
        return appCompatTextView.getText();
    }

    public final void setActionClickListener(OnClickListener onClickListener) {
        if (this.f5207v.isInitialized()) {
            ((TextView) this.f5207v.getValue()).setOnClickListener(onClickListener);
        }
        this.f5211z = onClickListener;
    }

    public final void setActionIcon(Drawable drawable) {
        if (drawable != null) {
            C1315a.m6318a((TextView) this.f5207v.getValue(), drawable, (Drawable) null, (Drawable) null, (Drawable) null, 14, (Object) null);
        } else if (this.f5207v.isInitialized()) {
            C1315a.m6318a((TextView) this.f5207v.getValue(), drawable, (Drawable) null, (Drawable) null, (Drawable) null, 14, (Object) null);
        }
        m6512b();
    }

    public final void setActionStyle(int i) {
        if (this.f5210y != i) {
            if (this.f5207v.isInitialized()) {
                C1448b.m6544a((TextView) this.f5207v.getValue(), i);
            }
            this.f5210y = i;
        }
    }

    public final void setActionText(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            ((TextView) this.f5207v.getValue()).setText(charSequence);
        } else if (this.f5207v.isInitialized()) {
            ((TextView) this.f5207v.getValue()).setText(charSequence);
        }
        m6512b();
    }

    public final void setSecondaryActionClickListener(OnClickListener onClickListener) {
        if (this.f5208w.isInitialized()) {
            ((ImageView) this.f5208w.getValue()).setOnClickListener(onClickListener);
        }
        this.f5202A = onClickListener;
    }

    public final void setSecondaryActionIcon(Drawable drawable) {
        if (drawable != null) {
            ((ImageView) this.f5208w.getValue()).setImageDrawable(drawable);
        } else if (this.f5208w.isInitialized()) {
            ((ImageView) this.f5208w.getValue()).setImageDrawable(drawable);
        }
        m6513c();
    }

    public final void setSingleLine(boolean z) {
        String str = "view_title";
        if (z) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo6849d(C7768d.view_title);
            C12932j.m33815a((Object) appCompatTextView, str);
            appCompatTextView.setMaxLines(1);
        } else {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo6849d(C7768d.view_title);
            C12932j.m33815a((Object) appCompatTextView2, str);
            appCompatTextView2.setMaxLines(2);
        }
        this.f5205D = z;
    }

    public final void setSubtitle(CharSequence charSequence) {
        if (charSequence != null || this.f5209x.isInitialized()) {
            ((TextView) this.f5209x.getValue()).setText(charSequence);
            TextView textView = (TextView) this.f5209x.getValue();
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                i = 8;
            }
            textView.setVisibility(i);
        }
        this.f5203B = charSequence;
    }

    public final void setSubtitleClickListener(OnClickListener onClickListener) {
        if (this.f5209x.isInitialized()) {
            ((TextView) this.f5209x.getValue()).setOnClickListener(onClickListener);
        }
        this.f5204C = onClickListener;
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo6849d(C7768d.view_title);
        C12932j.m33815a((Object) appCompatTextView, "view_title");
        appCompatTextView.setText(charSequence);
    }

    public final void setTitleClickListener(OnClickListener onClickListener) {
        ((AppCompatTextView) mo6849d(C7768d.view_title)).setOnClickListener(onClickListener);
    }

    public ScreenBar(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f5207v = C12896f.m33751a(new C1429a(this, context));
        this.f5208w = C12896f.m33751a(new C1432d(this, context));
        this.f5209x = C12896f.m33751a(new C1433e(this, context));
        this.f5210y = C7770f.Button_Small_Secondary;
        LayoutInflater.from(context).inflate(C7769e.view_screen_bar, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7771g.ScreenBar, i, 0);
        setTitle((CharSequence) obtainStyledAttributes.getString(C7771g.ScreenBar_title));
        setActionText((CharSequence) obtainStyledAttributes.getString(C7771g.ScreenBar_actionText));
        setActionIcon(obtainStyledAttributes.getDrawable(C7771g.ScreenBar_actionIcon));
        setSingleLine(obtainStyledAttributes.getBoolean(C7771g.ScreenBar_singleLine, false));
        setSubtitle(obtainStyledAttributes.getString(C7771g.ScreenBar_subtitle));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private final void m6512b() {
        if (this.f5207v.isInitialized()) {
            TextView textView = (TextView) this.f5207v.getValue();
            CharSequence actionText = getActionText();
            int i = 0;
            if ((actionText == null || actionText.length() == 0) && getActionIcon() == null) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo6847a(Function1<? super ScreenBar, C12956q> function1) {
        C12932j.m33818b(function1, "callback");
        setActionClickListener(new C1430b(this, function1));
    }

    public final void setTitle(int i) {
        setTitle((CharSequence) getContext().getString(i));
    }

    public final void setActionIcon(int i) {
        setActionIcon(C0540a.m2546c(getContext(), i));
    }

    public final void setSecondaryActionIcon(int i) {
        setSecondaryActionIcon(C0540a.m2546c(getContext(), i));
    }

    public final void setActionText(int i) {
        setActionText((CharSequence) getContext().getString(i));
    }
}
