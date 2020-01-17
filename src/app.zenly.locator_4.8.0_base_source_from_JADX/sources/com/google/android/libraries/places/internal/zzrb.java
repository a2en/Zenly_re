package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb;
import com.google.android.libraries.places.internal.zzrb.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzrb<MessageType extends zzrb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzpu<MessageType, BuilderType> {
    private static Map<Object, zzrb<?, ?>> zzd = new ConcurrentHashMap();
    protected zztu zzb = zztu.zza();
    private int zzc = -1;

    public static class zza<T extends zzrb<T, ?>> extends zzpw<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    public static abstract class zzb<MessageType extends zzrb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzpt<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;
        private boolean zzc = false;

        protected zzb(MessageType messagetype) {
            this.zzb = messagetype;
            this.zza = (zzrb) messagetype.zza(zzc.zzd, (Object) null, (Object) null);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb2 = (zzb) this.zzb.zza(zzc.zze, (Object) null, (Object) null);
            zzb2.zza((MessageType) (zzrb) zze());
            return zzb2;
        }

        public final BuilderType zza(MessageType messagetype) {
            zzb();
            zza(this.zza, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public final void zzb() {
            if (this.zzc) {
                MessageType messagetype = (zzrb) this.zza.zza(zzc.zzd, (Object) null, (Object) null);
                zza(messagetype, this.zza);
                this.zza = messagetype;
                this.zzc = false;
            }
        }

        /* renamed from: zzc */
        public MessageType zze() {
            if (this.zzc) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzsy.zza().zza(messagetype).zzb(messagetype);
            this.zzc = true;
            return this.zza;
        }

        /* renamed from: zzd */
        public final MessageType zzf() {
            MessageType messagetype = (zzrb) zze();
            if (messagetype.zzg()) {
                return messagetype;
            }
            throw new zzts(messagetype);
        }

        public final boolean zzg() {
            return zzrb.zza(this.zza, false);
        }

        public final /* synthetic */ zzsm zzm() {
            return this.zzb;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzsy.zza().zza(messagetype).zzb(messagetype, messagetype2);
        }

        public final /* synthetic */ zzpt zza() {
            return (zzb) clone();
        }
    }

    /* 'enum' access flag removed */
    public static final class zzc {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzl = {zza, zzb, zzc, zzd, zze, zzf, zzg};
        private static final /* synthetic */ int[] zzm = {zzh, zzi};
        private static final /* synthetic */ int[] zzn = {zzj, zzk};

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzrb<MessageType, BuilderType> implements zzso {
        protected zzqw<Object> zzc = zzqw.zza();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.libraries.places.internal.zzrh, com.google.android.libraries.places.internal.zzre] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.google.android.libraries.places.internal.zzrh, com.google.android.libraries.places.internal.zzre]
      assigns: [com.google.android.libraries.places.internal.zzre]
      uses: [com.google.android.libraries.places.internal.zzrh]
      mth insns count: 2
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.google.android.libraries.places.internal.zzrh zzi() {
        /*
            com.google.android.libraries.places.internal.zzre r0 = com.google.android.libraries.places.internal.zzre.zzd()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzrb.zzi():com.google.android.libraries.places.internal.zzrh");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.libraries.places.internal.zzrz, com.google.android.libraries.places.internal.zzrj] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.google.android.libraries.places.internal.zzrz, com.google.android.libraries.places.internal.zzrj]
      assigns: [com.google.android.libraries.places.internal.zzrz]
      uses: [com.google.android.libraries.places.internal.zzrj]
      mth insns count: 2
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.google.android.libraries.places.internal.zzrj zzj() {
        /*
            com.google.android.libraries.places.internal.zzrz r0 = com.google.android.libraries.places.internal.zzrz.zzd()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzrb.zzj():com.google.android.libraries.places.internal.zzrj");
    }

    protected static <E> zzrm<E> zzk() {
        return zzsx.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzrb) zza(zzc.zzf, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzsy.zza().zza(this).zza(this, (zzrb) obj);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        this.zza = zzsy.zza().zza(this).zza(this);
        return this.zza;
    }

    public String toString() {
        return zzsn.zza(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    public final void zza(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: 0000 */
    public final int zze() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzrb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzf() {
        return (zzb) zza(zzc.zze, (Object) null, (Object) null);
    }

    public final boolean zzg() {
        return zza((T) this, Boolean.TRUE.booleanValue());
    }

    public final int zzh() {
        if (this.zzc == -1) {
            this.zzc = zzsy.zza().zza(this).zzd(this);
        }
        return this.zzc;
    }

    public final /* synthetic */ zzsl zzl() {
        zzb zzb2 = (zzb) zza(zzc.zze, (Object) null, (Object) null);
        zzb2.zza(this);
        return zzb2;
    }

    public final /* synthetic */ zzsm zzm() {
        return (zzrb) zza(zzc.zzf, (Object) null, (Object) null);
    }

    public final void zza(zzqn zzqn) throws IOException {
        zzsy.zza().zza(this).zza(this, (zzul) zzqq.zza(zzqn));
    }

    static <T extends zzrb<?, ?>> T zza(Class<T> cls) {
        T t = (zzrb) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzrb) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzrb) ((zzrb) zztx.zza(cls)).zza(zzc.zzf, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzrb<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static Object zza(zzsm zzsm, String str, Object[] objArr) {
        return new zzta(zzsm, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends zzrb<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzc.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzc2 = zzsy.zza().zza(t).zzc(t);
        if (z) {
            t.zza(zzc.zzb, (Object) zzc2 ? t : null, (Object) null);
        }
        return zzc2;
    }

    protected static <E> zzrm<E> zza(zzrm<E> zzrm) {
        int size = zzrm.size();
        return zzrm.zzb(size == 0 ? 10 : size << 1);
    }
}
