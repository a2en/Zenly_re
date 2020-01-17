package p250f.p251a.p252a.p263b.p275c.p276l;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore.Files;
import androidx.paging.C1033j;
import androidx.paging.C1033j.C1035b;
import androidx.paging.C1033j.C1037d;
import androidx.paging.C1033j.C1038e;
import androidx.paging.C1033j.C1040g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p275c.p277m.C7763a;

/* renamed from: f.a.a.b.c.l.a */
public final class C7758a extends C1033j<C7763a> {

    /* renamed from: c */
    private final C7760b f19421c = new C7760b(this, null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ContentResolver f19422d;

    /* renamed from: f.a.a.b.c.l.a$a */
    private static final class C7759a {

        /* renamed from: a */
        private static final Uri f19423a;

        /* renamed from: b */
        private static final String[] f19424b = {"_id", "mime_type", "orientation"};

        /* renamed from: c */
        private static final String[] f19425c = {"COUNT(_id)"};

        /* renamed from: d */
        private static final String[] f19426d = {String.valueOf(1)};

        /* renamed from: e */
        public static final C7759a f19427e = new C7759a();

        static {
            Uri contentUri = Files.getContentUri("external");
            if (contentUri != null) {
                f19423a = contentUri;
                return;
            }
            C12932j.m33814a();
            throw null;
        }

        private C7759a() {
        }

        /* renamed from: a */
        public final Uri mo19960a() {
            return f19423a;
        }

        /* renamed from: b */
        public final String[] mo19961b() {
            return f19424b;
        }

        /* renamed from: c */
        public final String[] mo19962c() {
            return f19425c;
        }

        /* renamed from: d */
        public final String[] mo19963d() {
            return f19426d;
        }
    }

    /* renamed from: f.a.a.b.c.l.a$b */
    public static final class C7760b extends ContentObserver {

        /* renamed from: a */
        final /* synthetic */ C7758a f19428a;

        C7760b(C7758a aVar, Handler handler) {
            this.f19428a = aVar;
            super(handler);
        }

        public void onChange(boolean z, Uri uri) {
            this.f19428a.f19422d.unregisterContentObserver(this);
            this.f19428a.mo4800a();
            super.onChange(z, uri);
        }
    }

    public C7758a(ContentResolver contentResolver) {
        C12932j.m33818b(contentResolver, "contentResolver");
        this.f19422d = contentResolver;
        this.f19422d.registerContentObserver(C7759a.f19427e.mo19960a(), true, this.f19421c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        kotlin.p409io.C12901b.m33759a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        throw r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m18853e() {
        /*
            r6 = this;
            android.content.ContentResolver r0 = r6.f19422d
            f.a.a.b.c.l.a$a r1 = p250f.p251a.p252a.p263b.p275c.p276l.C7758a.C7759a.f19427e
            android.net.Uri r1 = r1.mo19960a()
            f.a.a.b.c.l.a$a r2 = p250f.p251a.p252a.p263b.p275c.p276l.C7758a.C7759a.f19427e
            java.lang.String[] r2 = r2.mo19962c()
            f.a.a.b.c.l.a$a r3 = p250f.p251a.p252a.p263b.p275c.p276l.C7758a.C7759a.f19427e
            java.lang.String[] r4 = r3.mo19963d()
            java.lang.String r3 = "media_type = ? AND _size > 0"
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0034
            r1 = 0
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x002d }
            r3 = 0
            if (r2 == 0) goto L_0x0029
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x002d }
        L_0x0029:
            kotlin.p409io.C12901b.m33759a(r0, r1)
            return r3
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r2 = move-exception
            kotlin.p409io.C12901b.m33759a(r0, r1)
            throw r2
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Received null cursor while loading item count"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p250f.p251a.p252a.p263b.p275c.p276l.C7758a.m18853e():int");
    }

    /* renamed from: a */
    public void mo4906a(C1037d dVar, C1035b<C7763a> bVar) {
        C12932j.m33818b(dVar, "params");
        C12932j.m33818b(bVar, "callback");
        int e = m18853e();
        if (e == 0) {
            bVar.mo4911a(C12848o.m33640a(), 0, 0);
            return;
        }
        int a = C1033j.m4630a(dVar, e);
        bVar.mo4911a(m18851a(a, C1033j.m4631a(dVar, a, e)), a, e);
    }

    /* renamed from: a */
    public void mo4907a(C1040g gVar, C1038e<C7763a> eVar) {
        C12932j.m33818b(gVar, "params");
        C12932j.m33818b(eVar, "callback");
        eVar.mo4912a(m18851a(gVar.f3883a, gVar.f3884b));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        kotlin.p409io.C12901b.m33759a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        throw r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<p250f.p251a.p252a.p263b.p275c.p277m.C7763a> m18851a(int r7, int r8) {
        /*
            r6 = this;
            android.content.ContentResolver r0 = r6.f19422d
            f.a.a.b.c.l.a$a r1 = p250f.p251a.p252a.p263b.p275c.p276l.C7758a.C7759a.f19427e
            android.net.Uri r1 = r1.mo19960a()
            f.a.a.b.c.l.a$a r2 = p250f.p251a.p252a.p263b.p275c.p276l.C7758a.C7759a.f19427e
            java.lang.String[] r2 = r2.mo19961b()
            f.a.a.b.c.l.a$a r3 = p250f.p251a.p252a.p263b.p275c.p276l.C7758a.C7759a.f19427e
            java.lang.String[] r4 = r3.mo19963d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "date_modified DESC"
            r3.append(r5)
            java.lang.String r5 = " LIMIT "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r5 = " OFFSET "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r5 = r3.toString()
            java.lang.String r3 = "media_type = ? AND _size > 0"
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x004a
            r7 = 0
            java.util.List r8 = r6.m18852a(r0)     // Catch:{ all -> 0x0043 }
            kotlin.p409io.C12901b.m33759a(r0, r7)
            return r8
        L_0x0043:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r8 = move-exception
            kotlin.p409io.C12901b.m33759a(r0, r7)
            throw r8
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received a null cursor while loading range ["
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r7 = r7 + r8
            r0.append(r7)
            r7 = 93
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p250f.p251a.p252a.p263b.p275c.p276l.C7758a.m18851a(int, int):java.util.List");
    }

    /* renamed from: a */
    private final List<C7763a> m18852a(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            C12932j.m33815a((Object) string, "cursor.getString(1)");
            arrayList.add(new C7763a(j, string, cursor.getInt(2)));
        }
        return arrayList;
    }
}
