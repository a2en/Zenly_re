package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.inputmethod.InputContentInfo;

/* renamed from: androidx.core.view.inputmethod.b */
public final class C0651b {

    /* renamed from: a */
    private final C0654c f2824a;

    /* renamed from: androidx.core.view.inputmethod.b$a */
    private static final class C0652a implements C0654c {

        /* renamed from: a */
        final InputContentInfo f2825a;

        C0652a(Object obj) {
            this.f2825a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public Uri mo3420a() {
            return this.f2825a.getContentUri();
        }

        /* renamed from: b */
        public void mo3421b() {
            this.f2825a.requestPermission();
        }

        /* renamed from: c */
        public void mo3422c() {
            this.f2825a.releasePermission();
        }

        C0652a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f2825a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    /* renamed from: androidx.core.view.inputmethod.b$b */
    private static final class C0653b implements C0654c {

        /* renamed from: a */
        private final Uri f2826a;

        C0653b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f2826a = uri;
        }

        /* renamed from: a */
        public Uri mo3420a() {
            return this.f2826a;
        }

        /* renamed from: b */
        public void mo3421b() {
        }

        /* renamed from: c */
        public void mo3422c() {
        }
    }

    /* renamed from: androidx.core.view.inputmethod.b$c */
    private interface C0654c {
        /* renamed from: a */
        Uri mo3420a();

        /* renamed from: b */
        void mo3421b();

        /* renamed from: c */
        void mo3422c();
    }

    public C0651b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (VERSION.SDK_INT >= 25) {
            this.f2824a = new C0652a(uri, clipDescription, uri2);
        } else {
            this.f2824a = new C0653b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: a */
    public Uri mo3417a() {
        return this.f2824a.mo3420a();
    }

    /* renamed from: b */
    public void mo3418b() {
        this.f2824a.mo3422c();
    }

    /* renamed from: c */
    public void mo3419c() {
        this.f2824a.mo3421b();
    }

    /* renamed from: a */
    public static C0651b m3039a(Object obj) {
        if (obj != null && VERSION.SDK_INT >= 25) {
            return new C0651b(new C0652a(obj));
        }
        return null;
    }

    private C0651b(C0654c cVar) {
        this.f2824a = cVar;
    }
}
