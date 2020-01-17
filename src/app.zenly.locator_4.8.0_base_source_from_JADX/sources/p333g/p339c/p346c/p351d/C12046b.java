package p333g.p339c.p346c.p351d;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.internal.C9536j;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import java.util.Arrays;
import java.util.List;

/* renamed from: g.c.c.d.b */
public class C12046b {

    /* renamed from: s */
    public static final ScaleType f31406s = ScaleType.f24943f;

    /* renamed from: t */
    public static final ScaleType f31407t = ScaleType.f24944g;

    /* renamed from: a */
    private Resources f31408a;

    /* renamed from: b */
    private int f31409b;

    /* renamed from: c */
    private float f31410c;

    /* renamed from: d */
    private Drawable f31411d;

    /* renamed from: e */
    private ScaleType f31412e;

    /* renamed from: f */
    private Drawable f31413f;

    /* renamed from: g */
    private ScaleType f31414g;

    /* renamed from: h */
    private Drawable f31415h;

    /* renamed from: i */
    private ScaleType f31416i;

    /* renamed from: j */
    private Drawable f31417j;

    /* renamed from: k */
    private ScaleType f31418k;

    /* renamed from: l */
    private ScaleType f31419l;

    /* renamed from: m */
    private PointF f31420m;

    /* renamed from: n */
    private ColorFilter f31421n;

    /* renamed from: o */
    private Drawable f31422o;

    /* renamed from: p */
    private List<Drawable> f31423p;

    /* renamed from: q */
    private Drawable f31424q;

    /* renamed from: r */
    private C12049e f31425r;

    public C12046b(Resources resources) {
        this.f31408a = resources;
        m31774t();
    }

    /* renamed from: t */
    private void m31774t() {
        this.f31409b = 300;
        this.f31410c = 0.0f;
        this.f31411d = null;
        ScaleType scaleType = f31406s;
        this.f31412e = scaleType;
        this.f31413f = null;
        this.f31414g = scaleType;
        this.f31415h = null;
        this.f31416i = scaleType;
        this.f31417j = null;
        this.f31418k = scaleType;
        this.f31419l = f31407t;
        this.f31420m = null;
        this.f31421n = null;
        this.f31422o = null;
        this.f31423p = null;
        this.f31424q = null;
        this.f31425r = null;
    }

    /* renamed from: u */
    private void m31775u() {
        List<Drawable> list = this.f31423p;
        if (list != null) {
            for (Drawable a : list) {
                C9536j.m23271a(a);
            }
        }
    }

    /* renamed from: a */
    public C12046b mo35715a(int i) {
        this.f31409b = i;
        return this;
    }

    /* renamed from: b */
    public C12046b mo35720b(Drawable drawable) {
        this.f31415h = drawable;
        return this;
    }

    /* renamed from: c */
    public C12046b mo35724c(ScaleType scaleType) {
        this.f31412e = scaleType;
        return this;
    }

    /* renamed from: d */
    public C12046b mo35726d(Drawable drawable) {
        this.f31411d = drawable;
        return this;
    }

    /* renamed from: e */
    public C12046b mo35730e(ScaleType scaleType) {
        this.f31414g = scaleType;
        return this;
    }

    /* renamed from: f */
    public float mo35731f() {
        return this.f31410c;
    }

    /* renamed from: g */
    public int mo35733g() {
        return this.f31409b;
    }

    /* renamed from: h */
    public Drawable mo35735h() {
        return this.f31415h;
    }

    /* renamed from: i */
    public ScaleType mo35736i() {
        return this.f31416i;
    }

    /* renamed from: j */
    public List<Drawable> mo35737j() {
        return this.f31423p;
    }

    /* renamed from: k */
    public Drawable mo35738k() {
        return this.f31411d;
    }

    /* renamed from: l */
    public ScaleType mo35739l() {
        return this.f31412e;
    }

    /* renamed from: m */
    public Drawable mo35740m() {
        return this.f31424q;
    }

    /* renamed from: n */
    public Drawable mo35741n() {
        return this.f31417j;
    }

    /* renamed from: o */
    public ScaleType mo35742o() {
        return this.f31418k;
    }

    /* renamed from: p */
    public Resources mo35743p() {
        return this.f31408a;
    }

    /* renamed from: q */
    public Drawable mo35744q() {
        return this.f31413f;
    }

    /* renamed from: r */
    public ScaleType mo35745r() {
        return this.f31414g;
    }

    /* renamed from: s */
    public C12049e mo35746s() {
        return this.f31425r;
    }

    /* renamed from: a */
    public C12046b mo35714a(float f) {
        this.f31410c = f;
        return this;
    }

    /* renamed from: b */
    public C12046b mo35721b(ScaleType scaleType) {
        this.f31416i = scaleType;
        return this;
    }

    /* renamed from: c */
    public PointF mo35722c() {
        return this.f31420m;
    }

    /* renamed from: d */
    public C12046b mo35727d(ScaleType scaleType) {
        this.f31418k = scaleType;
        return this;
    }

    /* renamed from: e */
    public Drawable mo35728e() {
        return this.f31422o;
    }

    /* renamed from: f */
    public C12046b mo35732f(Drawable drawable) {
        this.f31417j = drawable;
        return this;
    }

    /* renamed from: g */
    public C12046b mo35734g(Drawable drawable) {
        this.f31413f = drawable;
        return this;
    }

    /* renamed from: a */
    public C12046b mo35717a(ScaleType scaleType) {
        this.f31419l = scaleType;
        return this;
    }

    /* renamed from: b */
    public ColorFilter mo35719b() {
        return this.f31421n;
    }

    /* renamed from: c */
    public C12046b mo35723c(Drawable drawable) {
        if (drawable == null) {
            this.f31423p = null;
        } else {
            this.f31423p = Arrays.asList(new Drawable[]{drawable});
        }
        return this;
    }

    /* renamed from: d */
    public ScaleType mo35725d() {
        return this.f31419l;
    }

    /* renamed from: e */
    public C12046b mo35729e(Drawable drawable) {
        if (drawable == null) {
            this.f31424q = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f31424q = stateListDrawable;
        }
        return this;
    }

    /* renamed from: a */
    public C12046b mo35716a(Drawable drawable) {
        this.f31422o = drawable;
        return this;
    }

    /* renamed from: a */
    public C12046b mo35718a(C12049e eVar) {
        this.f31425r = eVar;
        return this;
    }

    /* renamed from: a */
    public C12045a mo35713a() {
        m31775u();
        return new C12045a(this);
    }
}
