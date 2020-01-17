package app.zenly.locator.core.invitations.p068g0;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.g0.d */
public final class C2594d {

    /* renamed from: a */
    private final SharedPreferences f7687a;

    /* renamed from: app.zenly.locator.core.invitations.g0.d$a */
    public static final class C2595a {
        private C2595a() {
        }

        public /* synthetic */ C2595a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2595a(null);
    }

    public C2594d(SharedPreferences sharedPreferences) {
        C12932j.m33818b(sharedPreferences, "sharedPreferences");
        this.f7687a = sharedPreferences;
    }

    /* renamed from: a */
    public final boolean mo8699a() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:hasCompletedOnboardingStep", false);
    }

    /* renamed from: b */
    public final boolean mo8701b() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:firstDashboardSectionDismissed", false);
    }

    /* renamed from: c */
    public final boolean mo8703c() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:secondDashboardSectionDismissed", false);
    }

    /* renamed from: d */
    public final boolean mo8705d() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:hasInvitedFriendsBI", false);
    }

    /* renamed from: e */
    public final boolean mo8707e() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:hasInvitedFriendsOA", false);
    }

    /* renamed from: f */
    public final boolean mo8709f() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:hasInvitedFriendsFromTraditionalInvite", false);
    }

    /* renamed from: g */
    public final boolean mo8711g() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:hasSeenFeature", false);
    }

    /* renamed from: h */
    public final boolean mo8713h() {
        return this.f7687a.getBoolean("prefs:broadcastInvite:isNewUser", false);
    }

    /* renamed from: a */
    public final void mo8698a(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:hasCompletedOnboardingStep", z);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo8700b(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:firstDashboardSectionDismissed", z);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo8702c(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:secondDashboardSectionDismissed", z);
        edit.apply();
    }

    /* renamed from: d */
    public final void mo8704d(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:hasInvitedFriendsBI", z);
        edit.apply();
    }

    /* renamed from: e */
    public final void mo8706e(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:hasInvitedFriendsOA", z);
        edit.apply();
    }

    /* renamed from: f */
    public final void mo8708f(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:hasInvitedFriendsFromTraditionalInvite", z);
        edit.apply();
    }

    /* renamed from: g */
    public final void mo8710g(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:hasSeenFeature", z);
        edit.apply();
    }

    /* renamed from: h */
    public final void mo8712h(boolean z) {
        Editor edit = this.f7687a.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean("prefs:broadcastInvite:isNewUser", z);
        edit.apply();
    }
}
