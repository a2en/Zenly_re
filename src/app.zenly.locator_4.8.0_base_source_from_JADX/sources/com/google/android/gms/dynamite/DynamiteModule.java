package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.util.C10168e;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C10186b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {

    /* renamed from: b */
    private static Boolean f26751b = null;

    /* renamed from: c */
    private static zzj f26752c = null;

    /* renamed from: d */
    private static zzl f26753d = null;

    /* renamed from: e */
    private static String f26754e = null;

    /* renamed from: f */
    private static int f26755f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C10193a> f26756g = new ThreadLocal<>();

    /* renamed from: h */
    private static final zzb f26757h = new C10195a();

    /* renamed from: i */
    public static final VersionPolicy f26758i = new C10197c();

    /* renamed from: a */
    private final Context f26759a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, C10195a aVar) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, C10195a aVar) {
            this(str, th);
        }
    }

    public interface VersionPolicy {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$a */
        public static class C10192a {

            /* renamed from: a */
            public int f26760a = 0;

            /* renamed from: b */
            public int f26761b = 0;

            /* renamed from: c */
            public int f26762c = 0;
        }

        public interface zzb {
            int getLocalVersion(Context context, String str);

            int zza(Context context, String str, boolean z) throws LoadingException;
        }

        C10192a zza(Context context, String str, zzb zzb2) throws LoadingException;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    private static class C10193a {

        /* renamed from: a */
        public Cursor f26763a;

        private C10193a() {
        }

        /* synthetic */ C10193a(C10195a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    private static class C10194b implements zzb {

        /* renamed from: a */
        private final int f26764a;

        public C10194b(int i, int i2) {
            this.f26764a = i;
        }

        public final int getLocalVersion(Context context, String str) {
            return this.f26764a;
        }

        public final int zza(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new C10196b();
        new C10199e();
        new C10198d();
        new C10201g();
        new C10200f();
    }

    private DynamiteModule(Context context) {
        C10123l.m25505a(context);
        this.f26759a = context;
    }

    /* renamed from: a */
    public static DynamiteModule m25722a(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        C10192a zza;
        String str2 = ":";
        String str3 = "DynamiteModule";
        C10193a aVar = (C10193a) f26756g.get();
        C10193a aVar2 = new C10193a(null);
        f26756g.set(aVar2);
        try {
            zza = versionPolicy.zza(context, str, f26757h);
            int i = zza.f26760a;
            int i2 = zza.f26761b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i2);
            Log.i(str3, sb.toString());
            if (zza.f26762c == 0 || ((zza.f26762c == -1 && zza.f26760a == 0) || (zza.f26762c == 1 && zza.f26761b == 0))) {
                int i3 = zza.f26760a;
                int i4 = zza.f26761b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (C10195a) null);
            } else if (zza.f26762c == -1) {
                DynamiteModule b = m25727b(context, str);
                Cursor cursor = aVar2.f26763a;
                if (cursor != null) {
                    cursor.close();
                }
                f26756g.set(aVar);
                return b;
            } else if (zza.f26762c == 1) {
                DynamiteModule a = m25723a(context, str, zza.f26761b);
                Cursor cursor2 = aVar2.f26763a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f26756g.set(aVar);
                return a;
            } else {
                int i5 = zza.f26762c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new LoadingException(sb3.toString(), (C10195a) null);
            }
        } catch (LoadingException e) {
            String str4 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            if (zza.f26760a == 0 || versionPolicy.zza(context, str, new C10194b(zza.f26760a, 0)).f26762c != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
            }
            DynamiteModule b2 = m25727b(context, str);
            Cursor cursor3 = aVar2.f26763a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f26756g.set(aVar);
            return b2;
        } catch (Throwable th) {
            Cursor cursor4 = aVar2.f26763a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f26756g.set(aVar);
            throw th;
        }
    }

    /* renamed from: b */
    private static int m25726b(Context context, String str, boolean z) {
        String str2 = "DynamiteModule";
        zzj a = m25724a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.zzak() >= 2) {
                return a.zzb(C10186b.m25715a(context), str, z);
            }
            Log.w(str2, "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.zza(C10186b.m25715a(context), str, z);
        } catch (RemoteException e) {
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m25730c(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x007a }
            f26754e = r1     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x007a }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x007a }
            f26755f = r1     // Catch:{ all -> 0x007a }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$a> r10 = f26756g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r10 = (com.google.android.gms.dynamite.DynamiteModule.C10193a) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007d
            android.database.Cursor r1 = r10.f26763a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007d
            r10.f26763a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r8 = r0
            goto L_0x007d
        L_0x007a:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007d:
            if (r8 == 0) goto L_0x0082
            r8.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m25730c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    private static DynamiteModule m25727b(Context context, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Selected local version of ";
        Log.i("DynamiteModule", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: b */
    private static DynamiteModule m25728b(Context context, String str, int i) throws LoadingException, RemoteException {
        zzl zzl;
        IObjectWrapper iObjectWrapper;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            zzl = f26753d;
        }
        if (zzl != null) {
            C10193a aVar = (C10193a) f26756g.get();
            if (aVar == null || aVar.f26763a == null) {
                throw new LoadingException("No result cursor", (C10195a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = aVar.f26763a;
            C10186b.m25715a(null);
            if (m25729b().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                iObjectWrapper = zzl.zzb(C10186b.m25715a(applicationContext), str, i, C10186b.m25715a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                iObjectWrapper = zzl.zza(C10186b.m25715a(applicationContext), str, i, C10186b.m25715a(cursor));
            }
            Context context2 = (Context) C10186b.m25716a(iObjectWrapper);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (C10195a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (C10195a) null);
    }

    /* renamed from: a */
    public static int m25720a(Context context, String str) {
        String str2 = "DynamiteModule";
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e(str2, sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w(str2, sb3.toString());
            return 0;
        } catch (Exception e) {
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* renamed from: b */
    private static Boolean m25729b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f26755f >= 2);
        }
        return valueOf;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:44|45|46|47|56|57|58|59|(3:61|62|63)(2:73|74)) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009a, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d7, code lost:
        return m25730c(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        return m25726b(r8, r9, r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0090 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3 A[SYNTHETIC, Splitter:B:61:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fa A[Catch:{ LoadingException -> 0x00d8, all -> 0x0102 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:39:0x008d=Splitter:B:39:0x008d} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m25721a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0102 }
            java.lang.Boolean r1 = f26751b     // Catch:{ all -> 0x00ff }
            if (r1 != 0) goto L_0x00cc
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0032:
            m25725a(r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x009c }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r2.set(r3, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0052:
            int r4 = m25730c(r8, r9, r10)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r5 = f26754e     // Catch:{ LoadingException -> 0x0090 }
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = f26754e     // Catch:{ LoadingException -> 0x0090 }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x0090 }
            if (r5 == 0) goto L_0x0063
            goto L_0x008d
        L_0x0063:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0090 }
            r6 = 29
            if (r5 < r6) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r6 = f26754e     // Catch:{ LoadingException -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0090 }
            goto L_0x0080
        L_0x0075:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r6 = f26754e     // Catch:{ LoadingException -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0090 }
        L_0x0080:
            m25725a(r5)     // Catch:{ LoadingException -> 0x0090 }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x0090 }
            f26751b = r5     // Catch:{ LoadingException -> 0x0090 }
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            return r4
        L_0x008d:
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            return r4
        L_0x0090:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r2.set(r3, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
        L_0x0099:
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            r1 = r2
            goto L_0x00ca
        L_0x009c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            throw r2     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
        L_0x009f:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ff }
            int r3 = r3.length()     // Catch:{ all -> 0x00ff }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r4.<init>(r3)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ff }
            r4.append(r1)     // Catch:{ all -> 0x00ff }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ff }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ff }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ff }
        L_0x00ca:
            f26751b = r1     // Catch:{ all -> 0x00ff }
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00fa
            int r8 = m25730c(r8, r9, r10)     // Catch:{ LoadingException -> 0x00d8 }
            return r8
        L_0x00d8:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0102 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0102 }
            int r1 = r9.length()     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x0102 }
            goto L_0x00f5
        L_0x00f0:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0102 }
            r9.<init>(r0)     // Catch:{ all -> 0x0102 }
        L_0x00f5:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x0102 }
            r8 = 0
            return r8
        L_0x00fa:
            int r8 = m25726b(r8, r9, r10)     // Catch:{ all -> 0x0102 }
            return r8
        L_0x00ff:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            throw r9     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r9 = move-exception
            com.google.android.gms.common.util.C10168e.m25662a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m25721a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    private static DynamiteModule m25723a(Context context, String str, int i) throws LoadingException {
        Boolean bool;
        IObjectWrapper iObjectWrapper;
        try {
            synchronized (DynamiteModule.class) {
                bool = f26751b;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (C10195a) null);
            } else if (bool.booleanValue()) {
                return m25728b(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                zzj a = m25724a(context);
                if (a != null) {
                    if (a.zzak() >= 2) {
                        iObjectWrapper = a.zzb(C10186b.m25715a(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        iObjectWrapper = a.zza(C10186b.m25715a(context), str, i);
                    }
                    if (C10186b.m25716a(iObjectWrapper) != null) {
                        return new DynamiteModule((Context) C10186b.m25716a(iObjectWrapper));
                    }
                    throw new LoadingException("Failed to load remote module.", (C10195a) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (C10195a) null);
            }
        } catch (RemoteException e) {
            throw new LoadingException("Failed to load remote module.", e, null);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Throwable th) {
            C10168e.m25662a(context, th);
            throw new LoadingException("Failed to load remote module.", th, null);
        }
    }

    /* renamed from: a */
    private static zzj m25724a(Context context) {
        zzj zzj;
        synchronized (DynamiteModule.class) {
            if (f26752c != null) {
                zzj zzj2 = f26752c;
                return zzj2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzj = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzj) {
                        zzj = (zzj) queryLocalInterface;
                    } else {
                        zzj = new C10203i(iBinder);
                    }
                }
                if (zzj != null) {
                    f26752c = zzj;
                    return zzj;
                }
            } catch (Exception e) {
                String str = "DynamiteModule";
                String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Context mo27652a() {
        return this.f26759a;
    }

    /* renamed from: a */
    private static void m25725a(ClassLoader classLoader) throws LoadingException {
        zzl zzl;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzl = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzl) {
                    zzl = (zzl) queryLocalInterface;
                } else {
                    zzl = new C10204j(iBinder);
                }
            }
            f26753d = zzl;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }
}
