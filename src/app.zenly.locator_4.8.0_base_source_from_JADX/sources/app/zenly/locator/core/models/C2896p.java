package app.zenly.locator.core.models;

import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.p143s.p150n.C5459d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: app.zenly.locator.core.models.p */
public class C2896p {

    /* renamed from: A */
    public final C2874c0 f8192A = new C2874c0();

    /* renamed from: B */
    public boolean f8193B = true;

    /* renamed from: C */
    public boolean f8194C = false;

    /* renamed from: D */
    public double f8195D;

    /* renamed from: E */
    public boolean f8196E;

    /* renamed from: a */
    public String f8197a;

    /* renamed from: b */
    public C2879d0 f8198b;

    /* renamed from: c */
    public C5459d f8199c;

    /* renamed from: d */
    public C5459d f8200d;

    /* renamed from: e */
    public boolean f8201e;

    /* renamed from: f */
    public double f8202f;

    /* renamed from: g */
    public double f8203g;

    /* renamed from: h */
    public boolean f8204h;

    /* renamed from: i */
    public boolean f8205i;

    /* renamed from: j */
    public int f8206j;

    /* renamed from: k */
    public boolean f8207k;

    /* renamed from: l */
    public boolean f8208l;

    /* renamed from: m */
    public double f8209m;

    /* renamed from: n */
    public C2890k f8210n;

    /* renamed from: o */
    public boolean f8211o;

    /* renamed from: p */
    public int f8212p;

    /* renamed from: q */
    public boolean f8213q;

    /* renamed from: r */
    public boolean f8214r;

    /* renamed from: s */
    public float f8215s;

    /* renamed from: t */
    public int f8216t = -1;

    /* renamed from: u */
    public boolean f8217u;

    /* renamed from: v */
    public String f8218v;

    /* renamed from: w */
    public C2918b f8219w = C2918b.NONE;

    /* renamed from: x */
    public final C2897a f8220x = new C2897a(this);

    /* renamed from: y */
    public final List<C2916z> f8221y = new ArrayList();

    /* renamed from: z */
    public final C2908w f8222z = new C2908w();

    /* renamed from: app.zenly.locator.core.models.p$a */
    public final class C2897a {

        /* renamed from: a */
        public boolean f8223a;

        public C2897a(C2896p pVar) {
        }

        /* renamed from: a */
        public C2897a mo8982a(C2897a aVar) {
            aVar.f8223a = this.f8223a;
            return aVar;
        }
    }

    /* renamed from: a */
    public boolean mo8976a() {
        return this.f8206j < 7;
    }

    /* renamed from: b */
    public boolean mo8977b() {
        return this.f8206j < 15;
    }

    /* renamed from: c */
    public boolean mo8978c() {
        return this.f8206j == 0;
    }

    /* renamed from: d */
    public boolean mo8979d() {
        return (this.f8198b == null || this.f8199c == null || this.f8201e) ? false : true;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C2896p) && Objects.equals(this.f8197a, ((C2896p) obj).f8197a);
    }

    public int hashCode() {
        String str = this.f8197a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public C2896p mo8975a(C2896p pVar) {
        pVar.f8197a = this.f8197a;
        pVar.f8198b = this.f8198b;
        pVar.f8199c = this.f8199c;
        pVar.f8200d = this.f8200d;
        pVar.f8201e = this.f8201e;
        pVar.f8203g = this.f8203g;
        pVar.f8202f = this.f8202f;
        pVar.f8204h = this.f8204h;
        pVar.f8205i = this.f8205i;
        pVar.f8206j = this.f8206j;
        pVar.f8207k = this.f8207k;
        pVar.f8208l = this.f8208l;
        pVar.f8209m = this.f8209m;
        pVar.f8210n = this.f8210n;
        pVar.f8211o = this.f8211o;
        pVar.f8212p = this.f8212p;
        pVar.f8213q = this.f8213q;
        pVar.f8214r = this.f8214r;
        pVar.f8215s = this.f8215s;
        pVar.f8195D = this.f8195D;
        pVar.f8196E = this.f8196E;
        pVar.f8216t = this.f8216t;
        pVar.f8217u = this.f8217u;
        pVar.f8218v = this.f8218v;
        pVar.f8219w = this.f8219w;
        pVar.f8193B = this.f8193B;
        pVar.f8194C = this.f8194C;
        pVar.f8221y.clear();
        pVar.f8221y.addAll(this.f8221y);
        this.f8220x.mo8982a(pVar.f8220x);
        this.f8222z.mo8988a(pVar.f8222z);
        this.f8192A.mo8925a(pVar.f8192A);
        return pVar;
    }
}
