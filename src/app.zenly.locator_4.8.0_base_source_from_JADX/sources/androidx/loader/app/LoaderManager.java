package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        Loader<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(Loader<D> loader, D d);

        void onLoaderReset(Loader<D> loader);
    }

    /* renamed from: a */
    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager m4103a(T t) {
        return new C0892a(t, ((ViewModelStoreOwner) t).getViewModelStore());
    }

    /* renamed from: a */
    public abstract void mo4504a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo4505a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
