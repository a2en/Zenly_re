package p250f.p251a.p252a.p253a.p255e;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12932j;
import kotlin.properties.ReadWriteProperty;

/* renamed from: f.a.a.a.e.d */
public final class C7662d {

    /* renamed from: f.a.a.a.e.d$a */
    public static final class C7663a extends C7661c<Boolean> {
        C7663a(boolean z, Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo19795a(Bundle bundle, String str, Object obj) {
            mo19799a(bundle, str, ((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public void mo19799a(Bundle bundle, String str, boolean z) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            bundle.putBoolean(str, z);
        }
    }

    /* renamed from: f.a.a.a.e.d$b */
    public static final class C7664b extends C7661c<Integer> {
        C7664b(int i, Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo19795a(Bundle bundle, String str, Object obj) {
            mo19800a(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: a */
        public void mo19800a(Bundle bundle, String str, int i) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            bundle.putInt(str, i);
        }
    }

    /* renamed from: f.a.a.a.e.d$c */
    public static final class C7665c extends C7661c<int[]> {
        C7665c() {
            super(null, 1, null);
        }

        /* renamed from: a */
        public void mo19795a(Bundle bundle, String str, int[] iArr) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            C12932j.m33818b(iArr, "value");
            bundle.putIntArray(str, iArr);
        }
    }

    /* renamed from: f.a.a.a.e.d$d */
    public static final class C7666d extends C7661c<Long> {
        C7666d(long j, Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo19795a(Bundle bundle, String str, Object obj) {
            mo19802a(bundle, str, ((Number) obj).longValue());
        }

        /* renamed from: a */
        public void mo19802a(Bundle bundle, String str, long j) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            bundle.putLong(str, j);
        }
    }

    /* renamed from: f.a.a.a.e.d$e */
    public static final class C7667e extends C7672f<T> {
        C7667e(Parcelable parcelable, Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public void mo19804a(Bundle bundle, String str, T t) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            bundle.putParcelable(str, t);
        }
    }

    /* renamed from: f.a.a.a.e.d$f */
    public static final class C7668f extends C7672f<String> {
        C7668f(String str, Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public void mo19804a(Bundle bundle, String str, String str2) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            bundle.putString(str, str2);
        }
    }

    /* renamed from: f.a.a.a.e.d$g */
    public static final class C7669g extends C7661c<T> {
        C7669g() {
            super(null, 1, null);
        }

        /* renamed from: a */
        public void mo19795a(Bundle bundle, String str, T t) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            C12932j.m33818b(t, "value");
            bundle.putParcelable(str, t);
        }
    }

    /* renamed from: f.a.a.a.e.d$h */
    public static final class C7670h extends C7661c<String> {
        C7670h() {
            super(null, 1, null);
        }

        /* renamed from: a */
        public void mo19795a(Bundle bundle, String str, String str2) {
            C12932j.m33818b(bundle, "args");
            C12932j.m33818b(str, "key");
            C12932j.m33818b(str2, "value");
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ ReadWriteProperty m18669a(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m18668a(z);
    }

    /* renamed from: b */
    public static final <T extends Parcelable> ReadWriteProperty<Fragment, T> m18670b() {
        return new C7669g();
    }

    /* renamed from: c */
    public static final ReadWriteProperty<Fragment, String> m18671c() {
        return new C7670h();
    }

    /* renamed from: a */
    public static final ReadWriteProperty<Fragment, Boolean> m18668a(boolean z) {
        return new C7663a(z, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static /* synthetic */ ReadWriteProperty m18661a(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m18660a(i);
    }

    /* renamed from: a */
    public static final ReadWriteProperty<Fragment, Integer> m18660a(int i) {
        return new C7664b(i, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static /* synthetic */ ReadWriteProperty m18663a(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return m18662a(j);
    }

    /* renamed from: a */
    public static final ReadWriteProperty<Fragment, Long> m18662a(long j) {
        return new C7666d(j, Long.valueOf(j));
    }

    /* renamed from: a */
    public static final ReadWriteProperty<Fragment, int[]> m18659a() {
        return new C7665c();
    }

    /* renamed from: a */
    public static /* synthetic */ ReadWriteProperty m18667a(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m18666a(str);
    }

    /* renamed from: a */
    public static final ReadWriteProperty<Fragment, String> m18666a(String str) {
        return new C7668f(str, str);
    }

    /* renamed from: a */
    public static /* synthetic */ ReadWriteProperty m18665a(Parcelable parcelable, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelable = null;
        }
        return m18664a((T) parcelable);
    }

    /* renamed from: a */
    public static final <T extends Parcelable> ReadWriteProperty<Fragment, T> m18664a(T t) {
        return new C7667e(t, t);
    }
}
