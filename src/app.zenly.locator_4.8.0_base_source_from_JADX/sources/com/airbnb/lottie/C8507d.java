package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.model.C8583f;
import com.airbnb.lottie.p286o.C8606c;
import com.airbnb.lottie.p287p.C8644t;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p289q.C8658h;
import com.appsflyer.share.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.C13354l;

/* renamed from: com.airbnb.lottie.d */
public class C8507d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, C8533h<C8506c>> f21772a = new HashMap();

    /* renamed from: com.airbnb.lottie.d$a */
    class C8508a implements LottieListener<C8506c> {

        /* renamed from: a */
        final /* synthetic */ String f21773a;

        C8508a(String str) {
            this.f21773a = str;
        }

        /* renamed from: a */
        public void onResult(C8506c cVar) {
            C8507d.f21772a.remove(this.f21773a);
        }
    }

    /* renamed from: com.airbnb.lottie.d$b */
    class C8509b implements LottieListener<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f21774a;

        C8509b(String str) {
            this.f21774a = str;
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            C8507d.f21772a.remove(this.f21774a);
        }
    }

    /* renamed from: com.airbnb.lottie.d$c */
    class C8510c implements Callable<C8532g<C8506c>> {

        /* renamed from: e */
        final /* synthetic */ Context f21775e;

        /* renamed from: f */
        final /* synthetic */ String f21776f;

        C8510c(Context context, String str) {
            this.f21775e = context;
            this.f21776f = str;
        }

        public C8532g<C8506c> call() {
            return C8606c.m20007a(this.f21775e, this.f21776f);
        }
    }

    /* renamed from: com.airbnb.lottie.d$d */
    class C8511d implements Callable<C8532g<C8506c>> {

        /* renamed from: e */
        final /* synthetic */ Context f21777e;

        /* renamed from: f */
        final /* synthetic */ String f21778f;

        C8511d(Context context, String str) {
            this.f21777e = context;
            this.f21778f = str;
        }

        public C8532g<C8506c> call() {
            return C8507d.m19686b(this.f21777e, this.f21778f);
        }
    }

    /* renamed from: com.airbnb.lottie.d$e */
    class C8512e implements Callable<C8532g<C8506c>> {

        /* renamed from: e */
        final /* synthetic */ WeakReference f21779e;

        /* renamed from: f */
        final /* synthetic */ Context f21780f;

        /* renamed from: g */
        final /* synthetic */ int f21781g;

        C8512e(WeakReference weakReference, Context context, int i) {
            this.f21779e = weakReference;
            this.f21780f = context;
            this.f21781g = i;
        }

        public C8532g<C8506c> call() {
            Context context = (Context) this.f21779e.get();
            if (context == null) {
                context = this.f21780f;
            }
            return C8507d.m19685b(context, this.f21781g);
        }
    }

    /* renamed from: com.airbnb.lottie.d$f */
    class C8513f implements Callable<C8532g<C8506c>> {

        /* renamed from: e */
        final /* synthetic */ InputStream f21782e;

        /* renamed from: f */
        final /* synthetic */ String f21783f;

        C8513f(InputStream inputStream, String str) {
            this.f21782e = inputStream;
            this.f21783f = str;
        }

        public C8532g<C8506c> call() {
            return C8507d.m19687b(this.f21782e, this.f21783f);
        }
    }

    /* renamed from: com.airbnb.lottie.d$g */
    class C8514g implements Callable<C8532g<C8506c>> {

        /* renamed from: e */
        final /* synthetic */ C8506c f21784e;

        C8514g(C8506c cVar) {
            this.f21784e = cVar;
        }

        public C8532g<C8506c> call() {
            return new C8532g<>(this.f21784e);
        }
    }

    /* renamed from: b */
    public static C8532g<C8506c> m19686b(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("asset_");
            sb.append(str);
            String sb2 = sb.toString();
            if (str.endsWith(".zip")) {
                return m19678a(new ZipInputStream(context.getAssets().open(str)), sb2);
            }
            return m19687b(context.getAssets().open(str), sb2);
        } catch (IOException e) {
            return new C8532g<>((Throwable) e);
        }
    }

    /* renamed from: c */
    public static C8533h<C8506c> m19689c(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("url_");
        sb.append(str);
        return m19682a(sb.toString(), (Callable<C8532g<C8506c>>) new C8510c<C8532g<C8506c>>(context, str));
    }

    /* renamed from: a */
    public static C8533h<C8506c> m19680a(Context context, String str) {
        return m19682a(str, (Callable<C8532g<C8506c>>) new C8511d<C8532g<C8506c>>(context.getApplicationContext(), str));
    }

    /* renamed from: c */
    private static String m19690c(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m19684a(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static C8533h<C8506c> m19679a(Context context, int i) {
        return m19682a(m19690c(context, i), (Callable<C8532g<C8506c>>) new C8512e<C8532g<C8506c>>(new WeakReference(context), context.getApplicationContext(), i));
    }

    /* renamed from: b */
    public static C8532g<C8506c> m19685b(Context context, int i) {
        try {
            return m19687b(context.getResources().openRawResource(i), m19690c(context, i));
        } catch (NotFoundException e) {
            return new C8532g<>((Throwable) e);
        }
    }

    /* renamed from: a */
    private static boolean m19684a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: a */
    public static C8533h<C8506c> m19681a(InputStream inputStream, String str) {
        return m19682a(str, (Callable<C8532g<C8506c>>) new C8513f<C8532g<C8506c>>(inputStream, str));
    }

    /* renamed from: b */
    public static C8532g<C8506c> m19687b(InputStream inputStream, String str) {
        return m19677a(inputStream, str, true);
    }

    /* renamed from: a */
    private static C8532g<C8506c> m19677a(InputStream inputStream, String str, boolean z) {
        try {
            return m19675a(C8630c.m20058a(C13354l.m35375a(C13354l.m35381a(inputStream))), str);
        } finally {
            if (z) {
                C8658h.m20202a((Closeable) inputStream);
            }
        }
    }

    /* renamed from: b */
    private static C8532g<C8506c> m19688b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C8506c cVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    cVar = (C8506c) m19676a(C8630c.m20058a(C13354l.m35375a(C13354l.m35381a((InputStream) zipInputStream))), (String) null, false).mo23028b();
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split(Constants.URL_PATH_DELIMITER);
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (cVar == null) {
                return new C8532g<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Entry entry : hashMap.entrySet()) {
                C8531f a = m19674a(cVar, (String) entry.getKey());
                if (a != null) {
                    a.mo23022a(C8658h.m20196a((Bitmap) entry.getValue(), a.mo23026e(), a.mo23024c()));
                }
            }
            for (Entry entry2 : cVar.mo22939h().entrySet()) {
                if (((C8531f) entry2.getValue()).mo23021a() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("There is no image for ");
                    sb.append(((C8531f) entry2.getValue()).mo23023b());
                    return new C8532g<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            if (str != null) {
                C8583f.m19913a().mo23173a(str, cVar);
            }
            return new C8532g<>(cVar);
        } catch (IOException e) {
            return new C8532g<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C8532g<C8506c> m19675a(C8630c cVar, String str) {
        return m19676a(cVar, str, true);
    }

    /* renamed from: a */
    private static C8532g<C8506c> m19676a(C8630c cVar, String str, boolean z) {
        try {
            C8506c a = C8644t.m20131a(cVar);
            if (str != null) {
                C8583f.m19913a().mo23173a(str, a);
            }
            C8532g<C8506c> gVar = new C8532g<>(a);
            if (z) {
                C8658h.m20202a((Closeable) cVar);
            }
            return gVar;
        } catch (Exception e) {
            C8532g<C8506c> gVar2 = new C8532g<>((Throwable) e);
            if (z) {
                C8658h.m20202a((Closeable) cVar);
            }
            return gVar2;
        } catch (Throwable th) {
            if (z) {
                C8658h.m20202a((Closeable) cVar);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static C8532g<C8506c> m19678a(ZipInputStream zipInputStream, String str) {
        try {
            return m19688b(zipInputStream, str);
        } finally {
            C8658h.m20202a((Closeable) zipInputStream);
        }
    }

    /* renamed from: a */
    private static C8531f m19674a(C8506c cVar, String str) {
        for (C8531f fVar : cVar.mo22939h().values()) {
            if (fVar.mo23023b().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C8533h<C8506c> m19682a(String str, Callable<C8532g<C8506c>> callable) {
        C8506c a = str == null ? null : C8583f.m19913a().mo23172a(str);
        if (a != null) {
            return new C8533h<>(new C8514g(a));
        }
        if (str != null && f21772a.containsKey(str)) {
            return (C8533h) f21772a.get(str);
        }
        C8533h<C8506c> hVar = new C8533h<>(callable);
        hVar.mo23032b(new C8508a(str));
        hVar.mo23031a((LottieListener<Throwable>) new C8509b<Throwable>(str));
        f21772a.put(str, hVar);
        return hVar;
    }
}
