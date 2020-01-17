package zendesk.belvedere;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zendesk.belvedere.m */
class C13526m {

    /* renamed from: a */
    private final SharedPreferences f35072a;

    C13526m(Context context) {
        this.f35072a = context.getSharedPreferences("belvedere_prefs", 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38902a(String str) {
        this.f35072a.edit().putBoolean(str, true).apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo38903b(String str) {
        return this.f35072a.contains(str);
    }
}
