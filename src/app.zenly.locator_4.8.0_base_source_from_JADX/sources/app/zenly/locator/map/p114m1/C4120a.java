package app.zenly.locator.map.p114m1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import app.zenly.locator.map.p107g1.C3979c;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.m1.a */
public final class C4120a extends C3979c {

    /* renamed from: G */
    private final OnSharedPreferenceChangeListener f10793G = C4121a.f10794a;

    /* renamed from: app.zenly.locator.map.m1.a$a */
    static final class C4121a implements OnSharedPreferenceChangeListener {

        /* renamed from: a */
        public static final C4121a f10794a = new C4121a();

        C4121a() {
        }

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        }
    }

    public C4120a(Context context, boolean z) {
        C12932j.m33818b(context, "context");
        super(context);
    }

    /* renamed from: c */
    public final OnSharedPreferenceChangeListener mo10795c() {
        return this.f10793G;
    }
}
