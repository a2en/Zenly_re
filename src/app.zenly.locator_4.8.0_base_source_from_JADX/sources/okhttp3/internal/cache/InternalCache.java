package okhttp3.internal.cache;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13331y;

public interface InternalCache {
    C13167a0 get(C13331y yVar) throws IOException;

    CacheRequest put(C13167a0 a0Var) throws IOException;

    void remove(C13331y yVar) throws IOException;

    void trackConditionalCacheHit();

    void trackResponse(C13218b bVar);

    void update(C13167a0 a0Var, C13167a0 a0Var2);
}
