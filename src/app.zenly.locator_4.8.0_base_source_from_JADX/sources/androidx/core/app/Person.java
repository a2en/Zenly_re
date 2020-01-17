package androidx.core.app;

import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

public class Person implements VersionedParcelable {

    /* renamed from: a */
    public CharSequence f2480a;

    /* renamed from: b */
    public IconCompat f2481b;

    /* renamed from: c */
    public String f2482c;

    /* renamed from: d */
    public String f2483d;

    /* renamed from: e */
    public boolean f2484e;

    /* renamed from: f */
    public boolean f2485f;

    /* renamed from: a */
    public PersistableBundle mo3013a() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f2480a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f2482c);
        persistableBundle.putString("key", this.f2483d);
        persistableBundle.putBoolean("isBot", this.f2484e);
        persistableBundle.putBoolean("isImportant", this.f2485f);
        return persistableBundle;
    }
}
