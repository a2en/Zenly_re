package p389io.fabric.sdk.android.services.persistence;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import p389io.fabric.sdk.android.C12161g;

/* renamed from: io.fabric.sdk.android.services.persistence.b */
public class C12246b implements PreferenceStore {

    /* renamed from: a */
    private final SharedPreferences f31838a;

    /* renamed from: b */
    private final String f31839b;

    /* renamed from: c */
    private final Context f31840c;

    public C12246b(Context context, String str) {
        if (context != null) {
            this.f31840c = context;
            this.f31839b = str;
            this.f31838a = this.f31840c.getSharedPreferences(this.f31839b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public Editor edit() {
        return this.f31838a.edit();
    }

    public SharedPreferences get() {
        return this.f31838a;
    }

    @TargetApi(9)
    public boolean save(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    @Deprecated
    public C12246b(C12161g gVar) {
        this(gVar.mo36008b(), gVar.getClass().getName());
    }
}
