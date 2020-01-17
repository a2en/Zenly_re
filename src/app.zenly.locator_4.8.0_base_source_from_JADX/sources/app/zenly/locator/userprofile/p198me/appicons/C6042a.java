package app.zenly.locator.userprofile.p198me.appicons;

import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$UserEngagementStats.C6929b;

/* renamed from: app.zenly.locator.userprofile.me.appicons.a */
public enum C6042a implements AppIconsConfiguration {
    ;
    

    /* renamed from: p */
    public static final C6044b f15226p = null;

    /* renamed from: e */
    private final String f15227e;

    /* renamed from: f */
    private final int f15228f;

    /* renamed from: g */
    private final int f15229g;

    /* renamed from: h */
    private final int f15230h;

    /* renamed from: i */
    private final int f15231i;

    /* renamed from: app.zenly.locator.userprofile.me.appicons.a$a */
    static final class C6043a extends C6042a {
        C6043a(String str, int i) {
            String str2 = str;
            int i2 = i;
            super(str2, i2, "baby", 1, R.string.streak_modal_newbie_title, 0, 0, C6059j.f15248g, null);
        }

        /* renamed from: a */
        public Void m16780a() {
            throw new IllegalAccessException("We cant use the default icon as shortcut");
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.appicons.a$b */
    public static final class C6044b {
        private C6044b() {
        }

        /* renamed from: a */
        public final C6042a mo13857a(C6929b bVar) {
            C12932j.m33818b(bVar, "level");
            int i = C6048b.f15236a[bVar.ordinal()];
            if (i == 1) {
                return C6042a.f15221k;
            }
            if (i == 2) {
                return C6042a.f15222l;
            }
            if (i == 3) {
                return C6042a.f15223m;
            }
            if (i != 4) {
                return C6042a.f15221k;
            }
            return C6042a.f15224n;
        }

        public /* synthetic */ C6044b(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C6042a mo13858a(String str) {
            C6042a aVar;
            C12932j.m33818b(str, "id");
            C6042a[] values = C6042a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i];
                if (C12932j.m33817a((Object) aVar.mo13854c(), (Object) str)) {
                    break;
                }
                i++;
            }
            return aVar != null ? aVar : C6042a.f15221k;
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.appicons.a$c */
    static final class C6045c extends C6042a {

        /* renamed from: q */
        private final String f15233q;

        C6045c(String str, int i) {
            String str2 = str;
            int i2 = i;
            super(str2, i2, "leader", 2, R.string.streak_modal_boss_title, 3, 3, C6060k.f15252h, null);
            this.f15233q = "AppIconsLeader";
        }

        /* renamed from: a */
        public String mo13851a() {
            return this.f15233q;
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.appicons.a$d */
    static final class C6046d extends C6042a {

        /* renamed from: q */
        private final String f15234q;

        C6046d(String str, int i) {
            String str2 = str;
            int i2 = i;
            super(str2, i2, "star", 4, R.string.streak_modal_star_title, 15, 50, C6061l.f15256h, null);
            this.f15234q = "AppIconsStar";
        }

        /* renamed from: a */
        public String mo13851a() {
            return this.f15234q;
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.appicons.a$e */
    static final class C6047e extends C6042a {

        /* renamed from: q */
        private final String f15235q;

        C6047e(String str, int i) {
            String str2 = str;
            int i2 = i;
            super(str2, i2, "vip", 3, R.string.streak_modal_vip_title, 8, 10, C6062m.f15260h, null);
            this.f15235q = "AppIconsVip";
        }

        /* renamed from: a */
        public String mo13851a() {
            return this.f15235q;
        }
    }

    static {
        f15226p = new C6044b(null);
    }

    private C6042a(String str, int i, int i2, int i3, int i4, AppIconsConfiguration appIconsConfiguration) {
        this.f15232j = appIconsConfiguration;
        this.f15227e = str;
        this.f15228f = i;
        this.f15229g = i2;
        this.f15230h = i3;
        this.f15231i = i4;
    }

    /* renamed from: a */
    public abstract String mo13851a();

    /* renamed from: a */
    public final boolean mo13852a(C6042a aVar) {
        C12932j.m33818b(aVar, "appIconsThreshold");
        return this.f15228f >= aVar.f15228f;
    }

    /* renamed from: b */
    public final int mo13853b() {
        return this.f15229g;
    }

    /* renamed from: c */
    public final String mo13854c() {
        return this.f15227e;
    }

    /* renamed from: d */
    public final int mo13855d() {
        return this.f15230h;
    }

    /* renamed from: e */
    public final int mo13856e() {
        return this.f15231i;
    }

    public int getIconResource() {
        return this.f15232j.getIconResource();
    }

    public int getLargeIcon() {
        return this.f15232j.getLargeIcon();
    }

    public int getProfileIcon() {
        return this.f15232j.getProfileIcon();
    }
}
