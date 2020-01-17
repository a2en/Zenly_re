package app.zenly.locator.experimental.map;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.experimental.map.f */
public final class C3737f {

    /* renamed from: a */
    private final SharedPreferences f9993a;

    /* renamed from: app.zenly.locator.experimental.map.f$a */
    public static final class C3738a {
        private C3738a() {
        }

        public /* synthetic */ C3738a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3738a(null);
    }

    public C3737f(SharedPreferences sharedPreferences) {
        C12932j.m33818b(sharedPreferences, "preferences");
        this.f9993a = sharedPreferences;
    }

    /* renamed from: a */
    public final boolean mo10272a() {
        return this.f9993a.getBoolean("prefs:experimental:nextUnlockEligibilityTriggered", false);
    }

    /* renamed from: b */
    public final boolean mo10274b() {
        return this.f9993a.getBoolean("prefs:experimental:hinterDisplayedTriggered", false);
    }

    /* renamed from: a */
    public final void mo10271a(boolean z) {
        Editor edit = this.f9993a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:experimental:nextUnlockEligibilityTriggered", z);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo10273b(boolean z) {
        Editor edit = this.f9993a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:experimental:hinterDisplayedTriggered", z);
        edit.apply();
    }
}
