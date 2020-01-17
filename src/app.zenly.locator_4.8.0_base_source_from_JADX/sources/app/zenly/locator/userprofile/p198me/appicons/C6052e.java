package app.zenly.locator.userprofile.p198me.appicons;

import android.content.SharedPreferences.Editor;
import app.zenly.locator.p143s.C5407g;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.userprofile.me.appicons.e */
public final class C6052e {

    /* renamed from: a */
    private final C12785a<Boolean> f15240a;

    /* renamed from: b */
    private final C12279e<Boolean> f15241b = this.f15240a;

    /* renamed from: c */
    private final C5407g f15242c;

    /* renamed from: app.zenly.locator.userprofile.me.appicons.e$a */
    public static final class C6053a {
        private C6053a() {
        }

        public /* synthetic */ C6053a(C12928f fVar) {
            this();
        }
    }

    static {
        new C6053a(null);
    }

    public C6052e(C5407g gVar) {
        C12932j.m33818b(gVar, "zenlyPrefs");
        this.f15242c = gVar;
        C12785a<Boolean> h = C12785a.m33446h(Boolean.valueOf(false));
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(false)");
        this.f15240a = h;
    }

    /* renamed from: e */
    private final int m16792e() {
        return this.f15242c.mo12986h().getInt("prefs:flagsOpenedGift", 0);
    }

    /* renamed from: a */
    public final String mo13863a() {
        String string = this.f15242c.mo12986h().getString("prefs:appIconsLastInstalledIcon", C6042a.f15221k.mo13854c());
        if (string != null) {
            return string;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: b */
    public final int mo13868b() {
        return this.f15242c.mo12986h().getInt("prefs:appIconsMaxStreak", 0);
    }

    /* renamed from: c */
    public final C12279e<Boolean> mo13870c() {
        return this.f15241b;
    }

    /* renamed from: d */
    public final boolean mo13872d() {
        Object s = this.f15240a.mo36963s();
        if (s != null) {
            C12932j.m33815a(s, "_unlockableObservable.value!!");
            return ((Boolean) s).booleanValue();
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: b */
    private final void m16790b(int i) {
        Editor edit = this.f15242c.mo12986h().edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putInt("prefs:flagsOpenedGift", i);
        edit.apply();
    }

    /* renamed from: d */
    private final boolean m16791d(C6042a aVar) {
        return mo13867a(aVar, C6042a.f15222l) || mo13867a(aVar, C6042a.f15223m) || mo13867a(aVar, C6042a.f15224n);
    }

    /* renamed from: a */
    public final void mo13865a(String str) {
        C12932j.m33818b(str, "value");
        Editor edit = this.f15242c.mo12986h().edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putString("prefs:appIconsLastInstalledIcon", str);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo13871c(C6042a aVar) {
        C12932j.m33818b(aVar, "appIcons");
        this.f15240a.onNext(Boolean.valueOf(m16791d(aVar)));
    }

    /* renamed from: a */
    public final boolean mo13866a(C6042a aVar) {
        C12932j.m33818b(aVar, "appIcons");
        int i = C6054f.f15244b[aVar.ordinal()];
        if (i == 1) {
            return C7710c.m18767b(m16792e(), 1);
        }
        if (i == 2) {
            return C7710c.m18767b(m16792e(), 2);
        }
        if (i != 3) {
            return true;
        }
        return C7710c.m18767b(m16792e(), 4);
    }

    /* renamed from: b */
    public final void mo13869b(C6042a aVar) {
        int i;
        C12932j.m33818b(aVar, "appIcons");
        int i2 = C6054f.f15243a[aVar.ordinal()];
        if (i2 == 1) {
            i = C7710c.m18765a(m16792e(), 1);
        } else if (i2 == 2) {
            i = C7710c.m18765a(m16792e(), 2);
        } else if (i2 == 3) {
            i = C7710c.m18765a(m16792e(), 4);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("We can't open a gift for level ");
            sb.append(aVar.name());
            throw new IllegalAccessException(sb.toString());
        }
        m16790b(i);
        mo13871c(aVar);
    }

    /* renamed from: a */
    public final void mo13864a(int i) {
        if (mo13868b() < i) {
            Editor edit = this.f15242c.mo12986h().edit();
            C12932j.m33815a((Object) edit, "this");
            edit.putInt("prefs:appIconsMaxStreak", i);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo13867a(C6042a aVar, C6042a aVar2) {
        C12932j.m33818b(aVar, "currentAppIcons");
        C12932j.m33818b(aVar2, "appIconsThreshold");
        return aVar.mo13852a(aVar2) && !mo13866a(aVar2);
    }
}
