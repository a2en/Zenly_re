package app.zenly.android.feature.polenta.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p279d.C7765a;
import p250f.p251a.p252a.p263b.p279d.C7768d;
import p250f.p251a.p252a.p263b.p279d.C7769e;
import p250f.p251a.p252a.p263b.p279d.C7770f;
import p250f.p251a.p252a.p263b.p279d.C7771g;

public final class EmptyView extends ConstraintLayout {

    /* renamed from: A */
    private CharSequence f5174A;

    /* renamed from: B */
    private int f5175B;

    /* renamed from: C */
    private CharSequence f5176C;

    /* renamed from: D */
    private int f5177D;

    /* renamed from: E */
    private String f5178E;

    /* renamed from: F */
    private int f5179F;

    /* renamed from: G */
    private OnClickListener f5180G;

    /* renamed from: H */
    private final ImageView f5181H;

    /* renamed from: I */
    private final TextView f5182I;

    /* renamed from: J */
    private final TextView f5183J;

    /* renamed from: K */
    private final TextView f5184K;

    /* renamed from: L */
    private final ProgressBar f5185L;

    /* renamed from: M */
    private int f5186M;

    /* renamed from: z */
    private boolean f5187z;

    /* renamed from: app.zenly.android.feature.polenta.widget.EmptyView$a */
    public static final class C1425a {
        private C1425a() {
        }

        public /* synthetic */ C1425a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.EmptyView$b */
    static final class C1426b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ Function0 f5188e;

        C1426b(Function0 function0) {
            this.f5188e = function0;
        }

        public final void onClick(View view) {
            this.f5188e.invoke();
        }
    }

    static {
        new C1425a(null);
    }

    public EmptyView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EmptyView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = C7765a.emptyViewStyle;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    private final void m6508b() {
        if (!C7674a.m18692a(this.f5186M) || getVisibility() == 8) {
            this.f5181H.setVisibility(8);
            this.f5181H.setImageDrawable(null);
            return;
        }
        this.f5181H.setVisibility(0);
        this.f5181H.setImageResource(this.f5186M);
    }

    /* renamed from: a */
    public final void mo6794a(Function0<C12956q> function0) {
        setOnActionClickListener(function0 == null ? null : new C1426b(function0));
    }

    public final int getActionImportance() {
        return this.f5179F;
    }

    public final String getActionText() {
        return this.f5178E;
    }

    public final OnClickListener getOnActionClickListener() {
        return this.f5180G;
    }

    public final CharSequence getSubtitle() {
        return this.f5176C;
    }

    public final int getSubtitleColor() {
        return this.f5177D;
    }

    public final CharSequence getTitle() {
        return this.f5174A;
    }

    public final int getTitleColor() {
        return this.f5175B;
    }

    public final void setActionImportance(int i) {
        int i2;
        if (i == 0) {
            i2 = C7770f.Button_Large_Primary;
        } else if (i != 1) {
            i2 = C7770f.Button_Large_Primary;
        } else {
            i2 = C7770f.Button_Large_Tertiary;
        }
        C1448b.m6544a(this.f5184K, i2);
        this.f5179F = i;
    }

    public final void setActionText(String str) {
        C12932j.m33818b(str, "value");
        this.f5178E = str;
        m6507a();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f5184K.setEnabled(z);
        this.f5181H.setEnabled(z);
        this.f5183J.setEnabled(z);
        this.f5182I.setEnabled(z);
    }

    public final void setImageResource(int i) {
        if (this.f5186M != i) {
            this.f5186M = i;
            m6508b();
        }
    }

    public final void setLoading(boolean z) {
        if (this.f5187z != z) {
            this.f5187z = z;
            m6507a();
        }
    }

    public final void setOnActionClickListener(OnClickListener onClickListener) {
        this.f5180G = onClickListener;
        this.f5184K.setOnClickListener(onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "value");
        if (charSequence.length() > 0) {
            this.f5183J.setVisibility(0);
            this.f5183J.setText(charSequence);
        } else {
            this.f5183J.setVisibility(8);
        }
        this.f5176C = charSequence;
    }

    public final void setSubtitleColor(int i) {
        this.f5177D = i;
        this.f5183J.setTextColor(i);
    }

    public final void setTitle(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "value");
        if (charSequence.length() > 0) {
            this.f5182I.setVisibility(0);
            this.f5182I.setText(charSequence);
        } else {
            this.f5182I.setVisibility(8);
        }
        this.f5174A = charSequence;
    }

    public final void setTitleColor(int i) {
        this.f5175B = i;
        this.f5182I.setTextColor(i);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        m6508b();
    }

    public EmptyView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        String str = "";
        this.f5174A = str;
        this.f5175B = -16777216;
        this.f5176C = str;
        this.f5177D = -16777216;
        this.f5178E = str;
        this.f5186M = C7674a.f19294a;
        LayoutInflater.from(context).inflate(C7769e.view_empty, this);
        View findViewById = findViewById(C7768d.empty_image);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.empty_image)");
        this.f5181H = (ImageView) findViewById;
        View findViewById2 = findViewById(C7768d.empty_title);
        C12932j.m33815a((Object) findViewById2, "findViewById(R.id.empty_title)");
        this.f5182I = (TextView) findViewById2;
        View findViewById3 = findViewById(C7768d.empty_subtitle);
        C12932j.m33815a((Object) findViewById3, "findViewById(R.id.empty_subtitle)");
        this.f5183J = (TextView) findViewById3;
        View findViewById4 = findViewById(C7768d.empty_action);
        C12932j.m33815a((Object) findViewById4, "findViewById(R.id.empty_action)");
        this.f5184K = (TextView) findViewById4;
        View findViewById5 = findViewById(C7768d.empty_progress);
        C12932j.m33815a((Object) findViewById5, "findViewById(R.id.empty_progress)");
        this.f5185L = (ProgressBar) findViewById5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7771g.EmptyView, i, 0);
        String string = obtainStyledAttributes.getString(C7771g.EmptyView_actionText);
        if (string == null) {
            string = str;
        }
        setActionText(string);
        setActionImportance(obtainStyledAttributes.getInt(C7771g.EmptyView_actionImportance, 0));
        String string2 = obtainStyledAttributes.getString(C7771g.EmptyView_subtitle);
        if (string2 == null) {
            string2 = str;
        }
        setSubtitle((CharSequence) string2);
        setSubtitleColor(obtainStyledAttributes.getColor(C7771g.EmptyView_subtitleColor, this.f5177D));
        String string3 = obtainStyledAttributes.getString(C7771g.EmptyView_title);
        if (string3 == null) {
            string3 = str;
        }
        setTitle((CharSequence) string3);
        setTitleColor(obtainStyledAttributes.getColor(C7771g.EmptyView_titleColor, this.f5175B));
        setImageResource(obtainStyledAttributes.getResourceId(C7771g.EmptyView_src, C7674a.f19294a));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m6507a() {
        if (this.f5187z) {
            this.f5184K.setText("");
            this.f5184K.setVisibility(0);
            this.f5185L.setVisibility(0);
            return;
        }
        if (this.f5178E.length() == 0) {
            this.f5184K.setVisibility(8);
        } else {
            this.f5184K.setText(this.f5178E);
            this.f5184K.setVisibility(0);
        }
        this.f5185L.setVisibility(8);
    }

    public final void setActionText(int i) {
        String string = getContext().getString(i);
        C12932j.m33815a((Object) string, "context.getString(actionResId)");
        setActionText(string);
    }

    public final void setSubtitle(int i) {
        String string = getContext().getString(i);
        C12932j.m33815a((Object) string, "context.getString(subtitleResId)");
        setSubtitle((CharSequence) string);
    }

    public final void setTitle(int i) {
        String string = getContext().getString(i);
        C12932j.m33815a((Object) string, "context.getString(titleResId)");
        setTitle((CharSequence) string);
    }
}
