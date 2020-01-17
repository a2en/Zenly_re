package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public C13054a createDispatcher(List<? extends MainDispatcherFactory> list) {
        C12932j.m33818b(list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        C12932j.m33815a((Object) mainLooper, "Looper.getMainLooper()");
        return new C13054a(C13059c.m34081a(mainLooper, true), "Main");
    }
}
