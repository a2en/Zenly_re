package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p214e.p228e.C7571a;

public abstract class VersionedParcel {

    /* renamed from: a */
    protected final C7571a<String, Method> f4776a;

    /* renamed from: b */
    protected final C7571a<String, Method> f4777b;

    /* renamed from: c */
    protected final C7571a<String, Class> f4778c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C7571a<String, Method> aVar, C7571a<String, Method> aVar2, C7571a<String, Class> aVar3) {
        this.f4776a = aVar;
        this.f4777b = aVar2;
        this.f4778c = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6292a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6293a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6296a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6297a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6298a(boolean z);

    /* renamed from: a */
    public void mo6299a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6300a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo6301a(int i);

    /* renamed from: a */
    public boolean mo6302a(boolean z, int i) {
        if (!mo6301a(i)) {
            return z;
        }
        return mo6315d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract VersionedParcel mo6304b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6305b(int i);

    /* renamed from: b */
    public void mo6311b(boolean z, int i) {
        mo6305b(i);
        mo6298a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo6313c(int i);

    /* renamed from: c */
    public boolean mo6314c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo6315d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo6316e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract CharSequence mo6317f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo6318g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract <T extends Parcelable> T mo6319h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo6320i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public <T extends VersionedParcelable> T mo6321j() {
        String i = mo6320i();
        if (i == null) {
            return null;
        }
        return mo6289a(i, mo6304b());
    }

    /* renamed from: a */
    public int mo6286a(int i, int i2) {
        if (!mo6301a(i2)) {
            return i;
        }
        return mo6318g();
    }

    /* renamed from: b */
    public void mo6312b(byte[] bArr, int i) {
        mo6305b(i);
        mo6300a(bArr);
    }

    /* renamed from: a */
    public String mo6291a(String str, int i) {
        if (!mo6301a(i)) {
            return str;
        }
        return mo6320i();
    }

    /* renamed from: b */
    public void mo6309b(CharSequence charSequence, int i) {
        mo6305b(i);
        mo6296a(charSequence);
    }

    /* renamed from: a */
    public byte[] mo6303a(byte[] bArr, int i) {
        if (!mo6301a(i)) {
            return bArr;
        }
        return mo6316e();
    }

    /* renamed from: b */
    public void mo6306b(int i, int i2) {
        mo6305b(i2);
        mo6313c(i);
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo6287a(T t, int i) {
        if (!mo6301a(i)) {
            return t;
        }
        return mo6319h();
    }

    /* renamed from: b */
    public void mo6310b(String str, int i) {
        mo6305b(i);
        mo6297a(str);
    }

    /* renamed from: a */
    public CharSequence mo6290a(CharSequence charSequence, int i) {
        if (!mo6301a(i)) {
            return charSequence;
        }
        return mo6317f();
    }

    /* renamed from: b */
    public void mo6307b(Parcelable parcelable, int i) {
        mo6305b(i);
        mo6293a(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6294a(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            mo6297a((String) null);
            return;
        }
        m6114b(versionedParcelable);
        VersionedParcel b = mo6304b();
        mo6295a((T) versionedParcelable, b);
        b.mo6292a();
    }

    /* renamed from: b */
    public void mo6308b(VersionedParcelable versionedParcelable, int i) {
        mo6305b(i);
        mo6294a(versionedParcelable);
    }

    /* renamed from: b */
    private void m6114b(VersionedParcelable versionedParcelable) {
        try {
            mo6297a(m6111a(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(versionedParcelable.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: b */
    private Method m6113b(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method method = (Method) this.f4776a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4776a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: a */
    public <T extends VersionedParcelable> T mo6288a(T t, int i) {
        if (!mo6301a(i)) {
            return t;
        }
        return mo6321j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends VersionedParcelable> T mo6289a(String str, VersionedParcel versionedParcel) {
        try {
            return (VersionedParcelable) m6113b(str).invoke(null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    private Method m6112b(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f4777b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a = m6111a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f4777b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends VersionedParcelable> void mo6295a(T t, VersionedParcel versionedParcel) {
        try {
            m6112b(t.getClass()).invoke(null, new Object[]{t, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    private Class m6111a(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f4778c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4778c.put(cls.getName(), cls3);
        return cls3;
    }
}
