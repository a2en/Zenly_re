package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator.C0945a;
import androidx.navigation.Navigator.Extras;

@C0945a("navigation")
/* renamed from: androidx.navigation.l */
public class C0973l extends Navigator<C0971k> {

    /* renamed from: a */
    private final C0996r f3723a;

    public C0973l(C0996r rVar) {
        this.f3723a = rVar;
    }

    /* renamed from: c */
    public boolean mo4657c() {
        return true;
    }

    /* renamed from: a */
    public C0971k m4358a() {
        return new C0971k(this);
    }

    /* renamed from: a */
    public C0969j mo4654a(C0971k kVar, Bundle bundle, C0976o oVar, Extras extras) {
        int i = kVar.mo4746i();
        if (i != 0) {
            C0969j a = kVar.mo4741a(i, false);
            if (a != null) {
                return this.f3723a.mo4797a(a.mo4735e()).mo4654a(a, a.mo4722a(bundle), oVar, extras);
            }
            String h = kVar.mo4745h();
            StringBuilder sb = new StringBuilder();
            sb.append("navigation destination ");
            sb.append(h);
            sb.append(" is not a direct child of this NavGraph");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("no start destination defined via app:startDestination for ");
        sb2.append(kVar.mo4733c());
        throw new IllegalStateException(sb2.toString());
    }
}
