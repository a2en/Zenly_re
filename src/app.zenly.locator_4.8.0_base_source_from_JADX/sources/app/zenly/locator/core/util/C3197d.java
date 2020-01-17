package app.zenly.locator.core.util;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: app.zenly.locator.core.util.d */
public class C3197d {

    /* renamed from: a */
    private final Bundle f8965a;

    public C3197d(Bundle bundle) {
        this.f8965a = bundle;
    }

    /* renamed from: a */
    public C3197d mo9612a(String str, boolean z) {
        this.f8965a.putBoolean(str, z);
        return this;
    }

    /* renamed from: a */
    public C3197d mo9606a(String str, double d) {
        this.f8965a.putDouble(str, d);
        return this;
    }

    /* renamed from: a */
    public C3197d mo9608a(String str, long j) {
        this.f8965a.putLong(str, j);
        return this;
    }

    /* renamed from: a */
    public C3197d mo9610a(String str, String str2) {
        this.f8965a.putString(str, str2);
        return this;
    }

    /* renamed from: a */
    public C3197d mo9613a(String str, byte[] bArr) {
        this.f8965a.putByteArray(str, bArr);
        return this;
    }

    /* renamed from: a */
    public C3197d mo9607a(String str, int i) {
        this.f8965a.putInt(str, i);
        return this;
    }

    /* renamed from: a */
    public C3197d mo9609a(String str, Serializable serializable) {
        this.f8965a.putSerializable(str, serializable);
        return this;
    }

    /* renamed from: a */
    public C3197d mo9611a(String str, ArrayList<String> arrayList) {
        this.f8965a.putStringArrayList(str, arrayList);
        return this;
    }

    /* renamed from: a */
    public Bundle mo9605a() {
        return this.f8965a;
    }
}
