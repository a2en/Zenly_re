package app.zenly.locator.experimental.firstexperience;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.experimental.firstexperience.h */
public final class C3677h {

    /* renamed from: a */
    private final SharedPreferences f9850a;

    /* renamed from: app.zenly.locator.experimental.firstexperience.h$a */
    public static final class C3678a {
        private C3678a() {
        }

        public /* synthetic */ C3678a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3678a(null);
    }

    public C3677h(SharedPreferences sharedPreferences) {
        C12932j.m33818b(sharedPreferences, "preferences");
        this.f9850a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo10191a(boolean z) {
        Editor edit = this.f9850a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:experimental:noFriendDialogDismissed", z);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo10193b() {
        return this.f9850a.getBoolean("prefs:experimental:noFriendDialogDismissed", false);
    }

    /* renamed from: c */
    public final boolean mo10195c() {
        return this.f9850a.getBoolean("prefs:experimental:noFriendDialogCarouselDisplayed", false);
    }

    /* renamed from: d */
    public final boolean mo10196d() {
        return this.f9850a.getBoolean("prefs:experimental:noFriendDialogControlGroup", false);
    }

    /* renamed from: b */
    public final void mo10192b(boolean z) {
        Editor edit = this.f9850a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:experimental:noFriendDialogCarouselDisplayed", z);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo10194c(boolean z) {
        Editor edit = this.f9850a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:experimental:noFriendDialogControlGroup", z);
        edit.apply();
    }

    /* renamed from: a */
    public final int mo10189a() {
        return this.f9850a.getInt("prefs:experimental:noFriendDialogIndex", 0);
    }

    /* renamed from: a */
    public final void mo10190a(int i) {
        Editor edit = this.f9850a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putInt("prefs:experimental:noFriendDialogIndex", i);
        edit.apply();
    }
}
