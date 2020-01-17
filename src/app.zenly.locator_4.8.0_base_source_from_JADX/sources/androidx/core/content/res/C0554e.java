package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: androidx.core.content.res.e */
public final class C0554e {

    /* renamed from: androidx.core.content.res.e$a */
    public static abstract class C0555a {

        /* renamed from: androidx.core.content.res.e$a$a */
        class C0556a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Typeface f2600e;

            C0556a(Typeface typeface) {
                this.f2600e = typeface;
            }

            public void run() {
                C0555a.this.mo1944a(this.f2600e);
            }
        }

        /* renamed from: androidx.core.content.res.e$a$b */
        class C0557b implements Runnable {

            /* renamed from: e */
            final /* synthetic */ int f2602e;

            C0557b(int i) {
                this.f2602e = i;
            }

            public void run() {
                C0555a.this.mo1943a(this.f2602e);
            }
        }

        /* renamed from: a */
        public abstract void mo1943a(int i);

        /* renamed from: a */
        public abstract void mo1944a(Typeface typeface);

        /* renamed from: a */
        public final void mo3100a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0556a(typeface));
        }

        /* renamed from: a */
        public final void mo3099a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0557b(i));
        }
    }

    /* renamed from: a */
    public static int m2604a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: b */
    public static Drawable m2609b(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: a */
    public static Typeface m2605a(Context context, int i) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2607a(context, i, new TypedValue(), 0, null, null, false);
    }

    /* renamed from: a */
    public static Typeface m2606a(Context context, int i, TypedValue typedValue, int i2, C0555a aVar) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2607a(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: a */
    private static Typeface m2607a(Context context, int i, TypedValue typedValue, int i2, C0555a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m2608a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m2608a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.res.C0554e.C0555a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00a7
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo3099a(r14, r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = p214e.p234h.p235e.C7619d.m18517b(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo3100a(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r2 = androidx.core.content.res.FontResourcesParserCompat.m2562a(r1, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0052
            r9.mo3099a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p214e.p234h.p235e.C7619d.m18514a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = p214e.p234h.p235e.C7619d.m18511a(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo3100a(r0, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo3099a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a1
        L_0x008c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a1:
            if (r9 == 0) goto L_0x00a6
            r9.mo3099a(r14, r10)
        L_0x00a6:
            return r13
        L_0x00a7:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0554e.m2608a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.e$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
