package zendesk.belvedere;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.core.util.C0603e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: zendesk.belvedere.k */
class C13520k {

    /* renamed from: a */
    private final C13530q f35061a;

    /* renamed from: b */
    private final C13519j f35062b;

    /* renamed from: c */
    private final Context f35063c;

    C13520k(Context context, C13530q qVar, C13519j jVar) {
        this.f35063c = context;
        this.f35061a = qVar;
        this.f35062b = jVar;
    }

    /* renamed from: b */
    private boolean m35808b(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        PackageManager packageManager = context.getPackageManager();
        boolean z = packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean a = m35807a(intent, context);
        C13480L.m35692a("Belvedere", String.format(Locale.US, "Camera present: %b, Camera App present: %b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(a)}));
        if (!z || !a) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m35809c(Context context) {
        return m35807a(m35803a("*/*", false), context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public MediaIntent mo38897a(int i, String str, boolean z) {
        if (!m35809c(this.f35063c)) {
            return MediaIntent.m35705e();
        }
        MediaIntent mediaIntent = new MediaIntent(i, m35803a(str, z), null, true, 1);
        return mediaIntent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0603e<MediaIntent, MediaResult> mo38896a(int i) {
        if (m35806a(this.f35063c)) {
            return m35804a(this.f35063c, i);
        }
        return new C0603e<>(MediaIntent.m35705e(), null);
    }

    /* renamed from: a */
    private boolean m35806a(Context context) {
        return m35808b(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38898a(Context context, int i, int i2, Intent intent, C13492c<List<MediaResult>> cVar, boolean z) {
        Context context2 = context;
        int i3 = i;
        int i4 = i2;
        C13492c<List<MediaResult>> cVar2 = cVar;
        ArrayList arrayList = new ArrayList();
        MediaResult b = this.f35062b.mo38895b(i3);
        if (b != null) {
            String str = "Belvedere";
            if (b.mo38840a() == null || b.mo38849g() == null) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(i4 == -1);
                C13480L.m35692a(str, String.format(locale, "Parsing activity result - Gallery - Ok: %s", objArr));
                if (i4 == -1) {
                    List<Uri> a = m35805a(intent);
                    C13480L.m35692a(str, String.format(Locale.US, "Number of items received from gallery: %s", new Object[]{Integer.valueOf(a.size())}));
                    if (z) {
                        C13480L.m35692a(str, "Resolving items");
                        C13529p.m35835a(context2, this.f35061a, cVar2, a);
                        return;
                    }
                    C13480L.m35692a(str, "Resolving items turned off");
                    for (Uri b2 : a) {
                        arrayList.add(C13530q.m35843b(context2, b2));
                    }
                }
            } else {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[1];
                objArr2[0] = Boolean.valueOf(i4 == -1);
                C13480L.m35692a(str, String.format(locale2, "Parsing activity result - Camera - Ok: %s", objArr2));
                this.f35061a.mo38913a(context2, b.mo38849g(), 3);
                if (i4 == -1) {
                    MediaResult b3 = C13530q.m35843b(context2, b.mo38849g());
                    MediaResult mediaResult = new MediaResult(b.mo38840a(), b.mo38849g(), b.mo38846e(), b.mo38844d(), b3.mo38842c(), b3.mo38848f(), b3.mo38850h(), b3.mo38841b());
                    arrayList.add(mediaResult);
                    C13480L.m35692a(str, String.format(Locale.US, "Image from camera: %s", new Object[]{b.mo38840a()}));
                }
                this.f35062b.mo38893a(i3);
            }
        }
        if (cVar2 != null) {
            cVar2.internalSuccess(arrayList);
        }
    }

    /* renamed from: a */
    private boolean m35807a(Intent intent, Context context) {
        return (intent == null || intent.resolveActivity(context.getPackageManager()) == null) ? false : true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private List<Uri> m35805a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (VERSION.SDK_INT >= 16 && intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Item itemAt = clipData.getItemAt(i);
                if (itemAt.getUri() != null) {
                    arrayList.add(itemAt.getUri());
                }
            }
        } else if (intent.getData() != null) {
            arrayList.add(intent.getData());
        }
        return arrayList;
    }

    /* renamed from: a */
    private C0603e<MediaIntent, MediaResult> m35804a(Context context, int i) {
        Context context2 = context;
        File a = this.f35061a.mo38909a(context2);
        String str = "Belvedere";
        if (a == null) {
            C13480L.m35696c(str, "Camera Intent: Image path is null. There's something wrong with the storage.");
            return null;
        }
        Uri a2 = this.f35061a.mo38908a(context2, a);
        if (a2 == null) {
            C13480L.m35696c(str, "Camera Intent: Uri to file is null. There's something wrong with the storage or FileProvider configuration.");
            return null;
        }
        C13480L.m35692a(str, String.format(Locale.US, "Camera Intent: Request Id: %s - File: %s - Uri: %s", new Object[]{Integer.valueOf(i), a, a2}));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", a2);
        this.f35061a.mo38912a(context2, intent, a2, 3);
        String str2 = "android.permission.CAMERA";
        boolean z = C13527n.m35833a(context2, str2) && !C13527n.m35834b(context2, str2);
        MediaResult b = C13530q.m35843b(context2, a2);
        String name = a.getName();
        String c = b.mo38842c();
        long f = b.mo38848f();
        long h = b.mo38850h();
        long b2 = b.mo38841b();
        String str3 = str2;
        MediaResult mediaResult = r3;
        MediaResult mediaResult2 = new MediaResult(a, a2, a2, name, c, f, h, b2);
        MediaIntent mediaIntent = new MediaIntent(i, intent, z ? str3 : null, true, 2);
        return new C0603e<>(mediaIntent, mediaResult);
    }

    @TargetApi(19)
    /* renamed from: a */
    private Intent m35803a(String str, boolean z) {
        Intent intent;
        String str2 = "Belvedere";
        if (VERSION.SDK_INT >= 19) {
            C13480L.m35692a(str2, "Gallery Intent, using 'ACTION_OPEN_DOCUMENT'");
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        } else {
            C13480L.m35692a(str2, "Gallery Intent, using 'ACTION_GET_CONTENT'");
            intent = new Intent("android.intent.action.GET_CONTENT");
        }
        intent.setType(str);
        intent.addCategory("android.intent.category.OPENABLE");
        if (VERSION.SDK_INT >= 18) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        }
        return intent;
    }
}
