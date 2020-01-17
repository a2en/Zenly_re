package app.zenly.locator.p208y;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.Set;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.romutils.ResolutionSolver;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.y.h */
public final class C6300h {

    /* renamed from: a */
    private final SharedPreferences f15821a;

    /* renamed from: app.zenly.locator.y.h$a */
    public static final class C6301a {
        private C6301a() {
        }

        public /* synthetic */ C6301a(C12928f fVar) {
            this();
        }
    }

    static {
        new C6301a(null);
    }

    public C6300h(SharedPreferences sharedPreferences) {
        C12932j.m33818b(sharedPreferences, "sharedPreferences");
        this.f15821a = sharedPreferences;
    }

    /* renamed from: f */
    private final void m17359f() {
        if (!mo14156c()) {
            UserProto$User userMeCache = C5448c.m15478a().userMeCache();
            mo14151a(userMeCache != null && userMeCache.getFriendsCount() > 0);
        }
    }

    /* renamed from: a */
    public final Set<String> mo14149a() {
        Set<String> stringSet = this.f15821a.getStringSet("prefs:phoneSettingsOnboardingOpenedSteps", C12845m0.m33632a());
        return stringSet != null ? stringSet : C12845m0.m33632a();
    }

    /* renamed from: b */
    public final void mo14155b(boolean z) {
        Editor edit = this.f15821a.edit();
        C12932j.m33815a((Object) edit, "editor");
        edit.putBoolean("prefs:phoneSettingsOnboardingStepStarted", z);
        edit.apply();
    }

    /* renamed from: c */
    public final boolean mo14156c() {
        return this.f15821a.getBoolean("prefs:phoneSettingsOnboardingStepEnabled", false);
    }

    /* renamed from: d */
    public final boolean mo14157d() {
        return this.f15821a.getBoolean("prefs:phoneSettingsOnboardingStepStarted", false);
    }

    /* renamed from: e */
    public final void mo14158e() {
        mo14155b(false);
        mo14151a(false);
        mo14150a(C12845m0.m33632a());
        mo14154b(C12845m0.m33632a());
    }

    /* renamed from: a */
    public final void mo14150a(Set<String> set) {
        C12932j.m33818b(set, "value");
        Editor edit = this.f15821a.edit();
        C12932j.m33815a((Object) edit, "editor");
        edit.putStringSet("prefs:phoneSettingsOnboardingOpenedSteps", set);
        edit.apply();
    }

    /* renamed from: b */
    public final Set<String> mo14153b() {
        Set<String> stringSet = this.f15821a.getStringSet("prefs:phoneSettingsOnboardingResolvedSteps", C12845m0.m33632a());
        return stringSet != null ? stringSet : C12845m0.m33632a();
    }

    /* renamed from: a */
    public final void mo14151a(boolean z) {
        Editor edit = this.f15821a.edit();
        C12932j.m33815a((Object) edit, "editor");
        edit.putBoolean("prefs:phoneSettingsOnboardingStepEnabled", z);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo14154b(Set<String> set) {
        C12932j.m33818b(set, "value");
        Editor edit = this.f15821a.edit();
        C12932j.m33815a((Object) edit, "editor");
        edit.putStringSet("prefs:phoneSettingsOnboardingResolvedSteps", set);
        edit.apply();
    }

    /* renamed from: a */
    public final boolean mo14152a(Context context) {
        C12932j.m33818b(context, "context");
        m17359f();
        return mo14156c() && ResolutionSolver.get().getResolutions(context).size() - mo14149a().size() > 0;
    }
}
