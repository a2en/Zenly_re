package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.core.util.C0600b;
import androidx.lifecycle.C0874n;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.loader.content.Loader;
import androidx.loader.content.Loader.OnLoadCompleteListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p214e.p228e.C7585h;

/* renamed from: androidx.loader.app.a */
class C0892a extends LoaderManager {

    /* renamed from: c */
    static boolean f3513c = false;

    /* renamed from: a */
    private final LifecycleOwner f3514a;

    /* renamed from: b */
    private final C0895c f3515b;

    /* renamed from: androidx.loader.app.a$a */
    public static class C0893a<D> extends C0874n<D> implements OnLoadCompleteListener<D> {

        /* renamed from: k */
        private final int f3516k;

        /* renamed from: l */
        private final Bundle f3517l;

        /* renamed from: m */
        private final Loader<D> f3518m;

        /* renamed from: n */
        private LifecycleOwner f3519n;

        /* renamed from: o */
        private C0894b<D> f3520o;

        /* renamed from: p */
        private Loader<D> f3521p;

        /* renamed from: a */
        public void mo4393a(Observer<? super D> observer) {
            super.mo4393a(observer);
            this.f3519n = null;
            this.f3520o = null;
        }

        /* renamed from: b */
        public void mo4395b(D d) {
            super.mo4395b(d);
            Loader<D> loader = this.f3521p;
            if (loader != null) {
                loader.mo4519b();
                throw null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo4397c() {
            if (C0892a.f3513c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f3518m.mo4520c();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo4398d() {
            if (C0892a.f3513c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f3518m.mo4521d();
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4512e() {
            LifecycleOwner lifecycleOwner = this.f3519n;
            C0894b<D> bVar = this.f3520o;
            if (lifecycleOwner != null && bVar != null) {
                super.mo4393a((Observer<? super T>) bVar);
                mo4391a(lifecycleOwner, bVar);
            }
        }

        public void onLoadComplete(Loader<D> loader, D d) {
            String str = "LoaderManager";
            if (C0892a.f3513c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                Log.v(str, sb.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo4395b(d);
                return;
            }
            if (C0892a.f3513c) {
                Log.w(str, "onLoadComplete was incorrectly called on a background thread");
            }
            mo4394a(d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3516k);
            sb.append(" : ");
            C0600b.m2765a(this.f3518m, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Loader<D> mo4510a(boolean z) {
            if (C0892a.f3513c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f3518m.mo4518a();
            throw null;
        }

        /* renamed from: a */
        public void mo4511a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3516k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3517l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3518m);
            Loader<D> loader = this.f3518m;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            loader.mo4517a(sb.toString(), fileDescriptor, printWriter, strArr);
            throw null;
        }
    }

    /* renamed from: androidx.loader.app.a$b */
    static class C0894b<D> implements Observer<D> {
    }

    /* renamed from: androidx.loader.app.a$c */
    static class C0895c extends C0889u {

        /* renamed from: d */
        private static final Factory f3522d = new C0896a();

        /* renamed from: c */
        private C7585h<C0893a> f3523c = new C7585h<>();

        /* renamed from: androidx.loader.app.a$c$a */
        static class C0896a implements Factory {
            C0896a() {
            }

            public <T extends C0889u> T create(Class<T> cls) {
                return new C0895c();
            }
        }

        C0895c() {
        }

        /* renamed from: a */
        static C0895c m4115a(C0891w wVar) {
            return (C0895c) new ViewModelProvider(wVar, f3522d).mo4415a(C0895c.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4269b() {
            super.mo4269b();
            if (this.f3523c.mo19615a() <= 0) {
                this.f3523c.clear();
            } else {
                ((C0893a) this.f3523c.mo19627f(0)).mo4510a(true);
                throw null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4516c() {
            int a = this.f3523c.mo19615a();
            for (int i = 0; i < a; i++) {
                ((C0893a) this.f3523c.mo19627f(i)).mo4512e();
            }
        }

        /* renamed from: a */
        public void mo4515a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3523c.mo19615a() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                if (this.f3523c.mo19615a() > 0) {
                    C0893a aVar = (C0893a) this.f3523c.mo19627f(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3523c.mo19621c(0));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo4511a(sb2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }
    }

    C0892a(LifecycleOwner lifecycleOwner, C0891w wVar) {
        this.f3514a = lifecycleOwner;
        this.f3515b = C0895c.m4115a(wVar);
    }

    /* renamed from: a */
    public void mo4504a() {
        this.f3515b.mo4516c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0600b.m2765a(this.f3514a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo4505a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3515b.mo4515a(str, fileDescriptor, printWriter, strArr);
    }
}
