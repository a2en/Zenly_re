package app.zenly.locator.experimental.inbox;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.experimental.inbox.c */
public final class C3695c {

    /* renamed from: a */
    private final C12785a<Collection<String>> f9919a;

    /* renamed from: b */
    private final SharedPreferences f9920b;

    /* renamed from: app.zenly.locator.experimental.inbox.c$a */
    public static final class C3696a {
        private C3696a() {
        }

        public /* synthetic */ C3696a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3696a(null);
    }

    public C3695c(SharedPreferences sharedPreferences) {
        C12932j.m33818b(sharedPreferences, "preferences");
        this.f9920b = sharedPreferences;
        C12785a<Collection<String>> h = C12785a.m33446h(m11067b());
        C12932j.m33815a((Object) h, "BehaviorSubject.createDe…ng>>(alreadyAcknowledged)");
        this.f9919a = h;
    }

    /* renamed from: a */
    private final void m11066a(Set<String> set) {
        Editor edit = this.f9920b.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putStringSet("prefs:suggested:alreadyAcknowledged", set);
        edit.apply();
    }

    /* renamed from: b */
    private final Set<String> m11067b() {
        Set<String> stringSet = this.f9920b.getStringSet("prefs:suggested:alreadyAcknowledged", C12845m0.m33632a());
        if (stringSet != null) {
            return stringSet;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public final void mo10225a(String str) {
        C12932j.m33818b(str, "id");
        m11066a(C12847n0.m33637a(m11067b(), str));
        this.f9919a.onNext(m11067b());
    }

    /* renamed from: a */
    public final C12279e<Collection<String>> mo10224a() {
        C12279e<Collection<String>> g = this.f9919a.mo36496g();
        C12932j.m33815a((Object) g, "alreadyAcknowledgedSubject.hide()");
        return g;
    }
}
