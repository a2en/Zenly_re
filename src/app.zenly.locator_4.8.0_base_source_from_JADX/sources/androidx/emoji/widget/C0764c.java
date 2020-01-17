package androidx.emoji.widget;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.Editable.Factory;

/* renamed from: androidx.emoji.widget.c */
final class C0764c extends Factory {

    /* renamed from: a */
    private static final Object f3120a = new Object();

    /* renamed from: b */
    private static volatile Factory f3121b;

    /* renamed from: c */
    private static Class<?> f3122c;

    @SuppressLint({"PrivateApi"})
    private C0764c() {
        try {
            f3122c = getClass().getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (Throwable unused) {
        }
    }

    public static Factory getInstance() {
        if (f3121b == null) {
            synchronized (f3120a) {
                if (f3121b == null) {
                    f3121b = new C0764c();
                }
            }
        }
        return f3121b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f3122c;
        if (cls != null) {
            return C0770h.m3554a(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
