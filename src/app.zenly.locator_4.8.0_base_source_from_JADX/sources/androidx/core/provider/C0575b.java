package androidx.core.provider;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0554e.C0555a;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.SelfDestructiveThread.ReplyCallback;
import androidx.core.util.C0607i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p214e.p228e.C7577e;
import p214e.p228e.C7584g;
import p214e.p234h.p235e.C7619d;
import p214e.p234h.p235e.C7629k;

/* renamed from: androidx.core.provider.b */
public class C0575b {

    /* renamed from: a */
    static final C7577e<String, Typeface> f2663a = new C7577e<>(16);

    /* renamed from: b */
    private static final SelfDestructiveThread f2664b = new SelfDestructiveThread("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f2665c = new Object();

    /* renamed from: d */
    static final C7584g<String, ArrayList<ReplyCallback<C0582g>>> f2666d = new C7584g<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f2667e = new C0579d();

    /* renamed from: androidx.core.provider.b$a */
    static class C0576a implements Callable<C0582g> {

        /* renamed from: e */
        final /* synthetic */ Context f2668e;

        /* renamed from: f */
        final /* synthetic */ C0574a f2669f;

        /* renamed from: g */
        final /* synthetic */ int f2670g;

        /* renamed from: h */
        final /* synthetic */ String f2671h;

        C0576a(Context context, C0574a aVar, int i, String str) {
            this.f2668e = context;
            this.f2669f = aVar;
            this.f2670g = i;
            this.f2671h = str;
        }

        public C0582g call() throws Exception {
            C0582g a = C0575b.m2696a(this.f2668e, this.f2669f, this.f2670g);
            Typeface typeface = a.f2682a;
            if (typeface != null) {
                C0575b.f2663a.mo19521a(this.f2671h, typeface);
            }
            return a;
        }
    }

    /* renamed from: androidx.core.provider.b$b */
    static class C0577b implements ReplyCallback<C0582g> {

        /* renamed from: a */
        final /* synthetic */ C0555a f2672a;

        /* renamed from: b */
        final /* synthetic */ Handler f2673b;

        C0577b(C0555a aVar, Handler handler) {
            this.f2672a = aVar;
            this.f2673b = handler;
        }

        /* renamed from: a */
        public void onReply(C0582g gVar) {
            if (gVar == null) {
                this.f2672a.mo3099a(1, this.f2673b);
                return;
            }
            int i = gVar.f2683b;
            if (i == 0) {
                this.f2672a.mo3100a(gVar.f2682a, this.f2673b);
            } else {
                this.f2672a.mo3099a(i, this.f2673b);
            }
        }
    }

    /* renamed from: androidx.core.provider.b$c */
    static class C0578c implements ReplyCallback<C0582g> {

        /* renamed from: a */
        final /* synthetic */ String f2674a;

        C0578c(String str) {
            this.f2674a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((androidx.core.provider.SelfDestructiveThread.ReplyCallback) r1.get(r0)).onReply(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReply(androidx.core.provider.C0575b.C0582g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.C0575b.f2665c
                monitor-enter(r0)
                e.e.g<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread$ReplyCallback<androidx.core.provider.b$g>>> r1 = androidx.core.provider.C0575b.f2666d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f2674a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                e.e.g<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread$ReplyCallback<androidx.core.provider.b$g>>> r2 = androidx.core.provider.C0575b.f2666d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f2674a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                androidx.core.provider.SelfDestructiveThread$ReplyCallback r2 = (androidx.core.provider.SelfDestructiveThread.ReplyCallback) r2
                r2.onReply(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0575b.C0578c.onReply(androidx.core.provider.b$g):void");
        }
    }

    /* renamed from: androidx.core.provider.b$d */
    static class C0579d implements Comparator<byte[]> {
        C0579d() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    }

    /* renamed from: androidx.core.provider.b$e */
    public static class C0580e {

        /* renamed from: a */
        private final int f2675a;

        /* renamed from: b */
        private final C0581f[] f2676b;

        public C0580e(int i, C0581f[] fVarArr) {
            this.f2675a = i;
            this.f2676b = fVarArr;
        }

        /* renamed from: a */
        public C0581f[] mo3194a() {
            return this.f2676b;
        }

        /* renamed from: b */
        public int mo3195b() {
            return this.f2675a;
        }
    }

    /* renamed from: androidx.core.provider.b$f */
    public static class C0581f {

        /* renamed from: a */
        private final Uri f2677a;

        /* renamed from: b */
        private final int f2678b;

        /* renamed from: c */
        private final int f2679c;

        /* renamed from: d */
        private final boolean f2680d;

        /* renamed from: e */
        private final int f2681e;

        public C0581f(Uri uri, int i, int i2, boolean z, int i3) {
            C0607i.m2773a(uri);
            this.f2677a = uri;
            this.f2678b = i;
            this.f2679c = i2;
            this.f2680d = z;
            this.f2681e = i3;
        }

        /* renamed from: a */
        public int mo3196a() {
            return this.f2681e;
        }

        /* renamed from: b */
        public int mo3197b() {
            return this.f2678b;
        }

        /* renamed from: c */
        public Uri mo3198c() {
            return this.f2677a;
        }

        /* renamed from: d */
        public int mo3199d() {
            return this.f2679c;
        }

        /* renamed from: e */
        public boolean mo3200e() {
            return this.f2680d;
        }
    }

    /* renamed from: androidx.core.provider.b$g */
    private static final class C0582g {

        /* renamed from: a */
        final Typeface f2682a;

        /* renamed from: b */
        final int f2683b;

        C0582g(Typeface typeface, int i) {
            this.f2682a = typeface;
            this.f2683b = i;
        }
    }

    /* renamed from: a */
    static C0582g m2696a(Context context, C0574a aVar, int i) {
        try {
            C0580e a = m2695a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo3195b() == 0) {
                Typeface a2 = C7619d.m18513a(context, null, a.mo3194a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0582g(a2, i2);
            }
            if (a.mo3195b() == 1) {
                i2 = -2;
            }
            return new C0582g(null, i2);
        } catch (NameNotFoundException unused) {
            return new C0582g(null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        f2664b.mo3176a((java.util.concurrent.Callable<T>) r1, (androidx.core.provider.SelfDestructiveThread.ReplyCallback<T>) new androidx.core.provider.C0575b.C0578c<T>(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2694a(android.content.Context r2, androidx.core.provider.C0574a r3, androidx.core.content.res.C0554e.C0555a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo3184c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            e.e.e<java.lang.String, android.graphics.Typeface> r1 = f2663a
            java.lang.Object r1 = r1.mo19526b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1944a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            androidx.core.provider.b$g r2 = m2696a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f2683b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f2682a
            r4.mo3100a(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.mo3099a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f2682a
            return r2
        L_0x0043:
            androidx.core.provider.b$a r1 = new androidx.core.provider.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            androidx.core.provider.SelfDestructiveThread r3 = f2664b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo3173a(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            androidx.core.provider.b$g r3 = (androidx.core.provider.C0575b.C0582g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f2682a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            androidx.core.provider.b$b r3 = new androidx.core.provider.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f2665c
            monitor-enter(r4)
            e.e.g<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread$ReplyCallback<androidx.core.provider.b$g>>> r5 = f2666d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            e.e.g<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread$ReplyCallback<androidx.core.provider.b$g>>> r3 = f2666d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            androidx.core.provider.SelfDestructiveThread r3 = f2664b
            androidx.core.provider.b$c r4 = new androidx.core.provider.b$c
            r4.<init>(r0)
            r3.mo3176a(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0575b.m2694a(android.content.Context, androidx.core.provider.a, androidx.core.content.res.e$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Typeface m2693a(Context context, CancellationSignal cancellationSignal, C0581f[] fVarArr) {
        return C7619d.m18513a(context, cancellationSignal, fVarArr, 0);
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m2699a(Context context, C0581f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0581f fVar : fVarArr) {
            if (fVar.mo3196a() == 0) {
                Uri c = fVar.mo3198c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C7629k.m18577a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C0580e m2695a(Context context, CancellationSignal cancellationSignal, C0574a aVar) throws NameNotFoundException {
        ProviderInfo a = m2692a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C0580e(1, null);
        }
        return new C0580e(0, m2701a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    public static ProviderInfo m2692a(PackageManager packageManager, C0574a aVar, Resources resources) throws NameNotFoundException {
        String d = aVar.mo3185d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(d);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(aVar.mo3186e())) {
            List a = m2698a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f2667e);
            List a2 = m2697a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a2.get(i));
                Collections.sort(arrayList, f2667e);
                if (m2700a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(d);
            sb2.append(", but package was not ");
            sb2.append(aVar.mo3186e());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m2697a(C0574a aVar, Resources resources) {
        if (aVar.mo3182a() != null) {
            return aVar.mo3182a();
        }
        return FontResourcesParserCompat.m2563a(resources, aVar.mo3183b());
    }

    /* renamed from: a */
    private static boolean m2700a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m2698a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static C0581f[] m2701a(Context context, C0574a aVar, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri uri;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        String str3 = "content";
        Uri build = new Builder().scheme(str3).authority(str2).build();
        Uri build2 = new Builder().scheme(str3).authority(str2).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            if (VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo3187f()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo3187f()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    C0581f fVar = new C0581f(uri, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i);
                    arrayList2.add(fVar);
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return (C0581f[]) arrayList.toArray(new C0581f[0]);
        } catch (Throwable th) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
