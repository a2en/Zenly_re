package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C13148t0;

public interface MainDispatcherFactory {
    C13148t0 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
