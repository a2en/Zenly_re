package androidx.loader.content;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader<D> {

    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(Loader<D> loader);
    }

    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(Loader<D> loader, D d);
    }

    @Deprecated
    /* renamed from: a */
    public void mo4517a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo4518a() {
        throw null;
    }

    /* renamed from: b */
    public void mo4519b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo4520c() {
        throw null;
    }

    /* renamed from: d */
    public void mo4521d() {
        throw null;
    }
}
