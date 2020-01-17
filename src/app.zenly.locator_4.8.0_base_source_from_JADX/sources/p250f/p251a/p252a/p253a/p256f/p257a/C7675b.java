package p250f.p251a.p252a.p253a.p256f.p257a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.core.content.res.C0554e;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p253a.C7654c;

/* renamed from: f.a.a.a.f.a.b */
public final class C7675b {

    /* renamed from: a */
    private final boolean f19295a;

    /* renamed from: b */
    private final ColorStateList f19296b;

    /* renamed from: c */
    private final ColorStateList f19297c;

    /* renamed from: d */
    private final float f19298d;

    /* renamed from: e */
    private final int f19299e;

    /* renamed from: f */
    private final int f19300f;

    /* renamed from: g */
    private final String f19301g;

    /* renamed from: h */
    private final int f19302h;

    /* renamed from: i */
    private final Lazy<Typeface> f19303i;

    /* renamed from: j */
    private final Typeface f19304j = ((Typeface) this.f19303i.getValue());

    /* renamed from: f.a.a.a.f.a.b$a */
    static final class C7676a extends C12933k implements Function0<Typeface> {

        /* renamed from: f */
        final /* synthetic */ C7675b f19305f;

        /* renamed from: g */
        final /* synthetic */ Context f19306g;

        C7676a(C7675b bVar, Context context) {
            this.f19305f = bVar;
            this.f19306g = context;
            super(0);
        }

        public final Typeface invoke() {
            Typeface typeface;
            if (C7674a.m18692a(this.f19305f.mo19817c())) {
                return Typeface.create(C0554e.m2605a(this.f19306g, this.f19305f.mo19817c()), this.f19305f.mo19822h());
            }
            if (this.f19305f.mo19816b() != null) {
                return Typeface.create(this.f19305f.mo19816b(), this.f19305f.mo19822h());
            }
            int i = this.f19305f.mo19823i();
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else if (i != 3) {
                typeface = Typeface.DEFAULT;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            return Typeface.create(typeface, this.f19305f.mo19822h());
        }
    }

    /* renamed from: f.a.a.a.f.a.b$b */
    public static final class C7677b {
        private C7677b() {
        }

        public /* synthetic */ C7677b(C12928f fVar) {
            this();
        }
    }

    static {
        new C7677b(null);
    }

    public C7675b(Context context, int i) {
        C12932j.m33818b(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7654c.TextAppearance);
        this.f19301g = obtainStyledAttributes.getString(C7654c.TextAppearance_android_fontFamily);
        this.f19302h = obtainStyledAttributes.getResourceId(C7654c.TextAppearance_android_fontFamily, C7674a.f19294a);
        this.f19295a = obtainStyledAttributes.getBoolean(C7654c.TextAppearance_android_textAllCaps, false);
        this.f19296b = obtainStyledAttributes.getColorStateList(C7654c.TextAppearance_android_textColor);
        this.f19297c = obtainStyledAttributes.getColorStateList(C7654c.TextAppearance_android_textColorLink);
        this.f19298d = obtainStyledAttributes.getDimension(C7654c.TextAppearance_android_textSize, 0.0f);
        this.f19299e = obtainStyledAttributes.getInt(C7654c.TextAppearance_android_textStyle, 0);
        this.f19300f = obtainStyledAttributes.getInt(C7654c.TextAppearance_android_typeface, 1);
        this.f19303i = C12896f.m33751a(new C7676a(this, context));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final Typeface mo19815a() {
        return this.f19304j;
    }

    /* renamed from: b */
    public final String mo19816b() {
        return this.f19301g;
    }

    /* renamed from: c */
    public final int mo19817c() {
        return this.f19302h;
    }

    /* renamed from: d */
    public final boolean mo19818d() {
        return this.f19295a;
    }

    /* renamed from: e */
    public final ColorStateList mo19819e() {
        return this.f19296b;
    }

    /* renamed from: f */
    public final ColorStateList mo19820f() {
        return this.f19297c;
    }

    /* renamed from: g */
    public final float mo19821g() {
        return this.f19298d;
    }

    /* renamed from: h */
    public final int mo19822h() {
        return this.f19299e;
    }

    /* renamed from: i */
    public final int mo19823i() {
        return this.f19300f;
    }
}
