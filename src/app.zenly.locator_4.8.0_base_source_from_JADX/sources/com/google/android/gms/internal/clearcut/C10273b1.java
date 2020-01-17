package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1;
import com.google.android.gms.internal.clearcut.C10273b1.C10274a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.b1 */
public abstract class C10273b1<MessageType extends C10273b1<MessageType, BuilderType>, BuilderType extends C10274a<MessageType, BuilderType>> extends C10368o<MessageType, BuilderType> {
    private static Map<Object, C10273b1<?, ?>> zzjr = new ConcurrentHashMap();
    protected C10301e3 zzjp = C10301e3.m26061d();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.b1$a */
    public static abstract class C10274a<MessageType extends C10273b1<MessageType, BuilderType>, BuilderType extends C10274a<MessageType, BuilderType>> extends C10374p<MessageType, BuilderType> {

        /* renamed from: e */
        private final MessageType f26884e;

        /* renamed from: f */
        protected MessageType f26885f;

        /* renamed from: g */
        protected boolean f26886g = false;

        protected C10274a(MessageType messagetype) {
            this.f26884e = messagetype;
            this.f26885f = (C10273b1) messagetype.mo27802a(C10278e.f26892d, (Object) null, (Object) null);
        }

        /* renamed from: a */
        private static void m25930a(MessageType messagetype, MessageType messagetype2) {
            C10321h2.m26127a().mo27926a(messagetype).mo27831a(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final BuilderType mo27813a(MessageType messagetype) {
            mo27815a();
            m25930a(this.f26885f, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ C10374p mo27814a(C10368o oVar) {
            mo27813a((MessageType) (C10273b1) oVar);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo27815a() {
            if (this.f26886g) {
                MessageType messagetype = (C10273b1) this.f26885f.mo27802a(C10278e.f26892d, (Object) null, (Object) null);
                m25930a(messagetype, this.f26885f);
                this.f26885f = messagetype;
                this.f26886g = false;
            }
        }

        /* renamed from: b */
        public MessageType zzbi() {
            if (this.f26886g) {
                return this.f26885f;
            }
            MessageType messagetype = this.f26885f;
            C10321h2.m26127a().mo27926a(messagetype).zzc(messagetype);
            this.f26886g = true;
            return this.f26885f;
        }

        /* renamed from: c */
        public final MessageType mo27817c() {
            MessageType messagetype = (C10273b1) zzbi();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo27802a(C10278e.f26889a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C10321h2.m26127a().mo27926a(messagetype).mo27833a(messagetype);
                    if (booleanValue) {
                        messagetype.mo27802a(C10278e.f26890b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzew(messagetype);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C10274a aVar = (C10274a) this.f26884e.mo27802a(C10278e.f26893e, (Object) null, (Object) null);
            aVar.mo27813a((MessageType) (C10273b1) zzbi());
            return aVar;
        }

        public final boolean isInitialized() {
            return C10273b1.m25924a(this.f26885f, false);
        }

        public final /* synthetic */ zzdo zzbe() {
            return this.f26884e;
        }

        public final /* synthetic */ zzdo zzbj() {
            C10273b1 b1Var = (C10273b1) zzbi();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b1Var.mo27802a(C10278e.f26889a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C10321h2.m26127a().mo27926a(b1Var).mo27833a(b1Var);
                    if (booleanValue) {
                        b1Var.mo27802a(C10278e.f26890b, (Object) z ? b1Var : null, (Object) null);
                    }
                }
            }
            if (z) {
                return b1Var;
            }
            throw new zzew(b1Var);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.b1$b */
    public static class C10275b<T extends C10273b1<T, ?>> extends C10380q<T> {
        public C10275b(T t) {
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.b1$c */
    public static abstract class C10276c<MessageType extends C10276c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends C10273b1<MessageType, BuilderType> implements zzdq {
        protected C10402t0<C10277d> zzjv = C10402t0.m26527i();
    }

    /* renamed from: com.google.android.gms.internal.clearcut.b1$d */
    static final class C10277d implements zzca<C10277d> {

        /* renamed from: e */
        final int f26887e;

        /* renamed from: f */
        final C10399s3 f26888f;

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f26887e - ((C10277d) obj).f26887e;
        }

        public final zzdp zza(zzdp zzdp, zzdo zzdo) {
            return ((C10274a) zzdp).mo27813a((C10273b1) zzdo);
        }

        public final zzdv zza(zzdv zzdv, zzdv zzdv2) {
            throw new UnsupportedOperationException();
        }

        public final C10399s3 zzau() {
            return this.f26888f;
        }

        public final C10429x3 zzav() {
            return this.f26888f.mo28124a();
        }

        public final boolean zzaw() {
            return false;
        }

        public final boolean zzax() {
            return false;
        }

        public final int zzc() {
            return this.f26887e;
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.clearcut.b1$e */
    public static final class C10278e {

        /* renamed from: a */
        public static final int f26889a = 1;

        /* renamed from: b */
        public static final int f26890b = 2;

        /* renamed from: c */
        public static final int f26891c = 3;

        /* renamed from: d */
        public static final int f26892d = 4;

        /* renamed from: e */
        public static final int f26893e = 5;

        /* renamed from: f */
        public static final int f26894f = 6;

        /* renamed from: g */
        public static final int f26895g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f26896h = {f26889a, f26890b, f26891c, f26892d, f26893e, f26894f, f26895g};

        /* renamed from: i */
        public static final int f26897i = 1;

        /* renamed from: j */
        public static final int f26898j = 2;

        /* renamed from: k */
        public static final int f26899k = 1;

        /* renamed from: l */
        public static final int f26900l = 2;

        static {
            int[] iArr = {f26897i, f26898j};
            int[] iArr2 = {f26899k, f26900l};
        }

        /* renamed from: a */
        public static int[] m25936a() {
            return (int[]) f26896h.clone();
        }
    }

    /* renamed from: a */
    private static <T extends C10273b1<T, ?>> T m25919a(T t, byte[] bArr) throws zzco {
        T t2 = (C10273b1) t.mo27802a(C10278e.f26892d, (Object) null, (Object) null);
        try {
            C10321h2.m26127a().mo27926a(t2).mo27832a(t2, bArr, 0, bArr.length, new C10407u());
            C10321h2.m26127a().mo27926a(t2).zzc(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzco) {
                throw ((zzco) e.getCause());
            }
            throw new zzco(e.getMessage()).mo28265a(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzco.m26829a().mo28265a(t2);
        }
    }

    /* renamed from: a */
    static <T extends C10273b1<?, ?>> T m25920a(Class<T> cls) {
        T t = (C10273b1) zzjr.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C10273b1) zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String str = "Unable to get default instance for: ";
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    protected static Object m25921a(zzdo zzdo, String str, Object[] objArr) {
        return new C10333j2(zzdo, str, objArr);
    }

    /* renamed from: a */
    static Object m25922a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static <T extends C10273b1<?, ?>> void m25923a(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    /* renamed from: a */
    protected static final <T extends C10273b1<T, ?>> boolean m25924a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo27802a(C10278e.f26889a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C10321h2.m26127a().mo27926a(t).mo27833a(t);
    }

    /* renamed from: b */
    protected static <T extends C10273b1<T, ?>> T m25925b(T t, byte[] bArr) throws zzco {
        T a = m25919a(t, bArr);
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo27802a(C10278e.f26889a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C10321h2.m26127a().mo27926a(a).mo27833a(a);
                    if (booleanValue) {
                        a.mo27802a(C10278e.f26890b, (Object) z ? a : null, (Object) null);
                    }
                }
            }
            if (!z) {
                throw new zzco(new zzew(a).getMessage()).mo28265a(a);
            }
        }
        return a;
    }

    /* renamed from: b */
    protected static <E> zzcn<E> m25926b() {
        return C10327i2.m26135b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo27801a() {
        return this.zzjq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo27802a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27803a(int i) {
        this.zzjq = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C10273b1) mo27802a(C10278e.f26894f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C10321h2.m26127a().mo27926a(this).mo27835b(this, (C10273b1) obj);
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        this.zzex = C10321h2.m26127a().mo27926a(this).mo27834b(this);
        return this.zzex;
    }

    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo27802a(C10278e.f26889a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a = C10321h2.m26127a().mo27926a(this).mo27833a(this);
        if (booleanValue) {
            mo27802a(C10278e.f26890b, (Object) a ? this : null, (Object) null);
        }
        return a;
    }

    public String toString() {
        return C10267a2.m25904a(this, super.toString());
    }

    public final int zzas() {
        if (this.zzjq == -1) {
            this.zzjq = C10321h2.m26127a().mo27926a(this).mo27836c(this);
        }
        return this.zzjq;
    }

    public final void zzb(zzbn zzbn) throws IOException {
        C10321h2.m26127a().mo27925a(getClass()).mo27830a(this, (C10435y3) C10351l0.m26288a(zzbn));
    }

    public final /* synthetic */ zzdp zzbc() {
        C10274a aVar = (C10274a) mo27802a(C10278e.f26893e, (Object) null, (Object) null);
        aVar.mo27813a(this);
        return aVar;
    }

    public final /* synthetic */ zzdp zzbd() {
        return (C10274a) mo27802a(C10278e.f26893e, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzdo zzbe() {
        return (C10273b1) mo27802a(C10278e.f26894f, (Object) null, (Object) null);
    }
}
