package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13170b0;
import okhttp3.C13321t;
import okhttp3.C13328w;
import okhttp3.C13331y;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class CachingInterceptor implements Interceptor {
    private final BaseStorage cache;
    private final Map<String, Lock> locks = new HashMap();

    CachingInterceptor(BaseStorage baseStorage) {
        this.cache = baseStorage;
    }

    private C13167a0 createResponse(int i, C13331y yVar, C13170b0 b0Var) {
        C13168a aVar = new C13168a();
        if (b0Var != null) {
            aVar.mo37811a(b0Var);
        } else {
            Logger.m31614d("CachingInterceptor", "Response body is null", new Object[0]);
        }
        aVar.mo37806a(i);
        aVar.mo37808a(yVar.mo38387e());
        aVar.mo37815a(yVar);
        aVar.mo37814a(C13328w.HTTP_1_1);
        return aVar.mo37816a();
    }

    private C13167a0 loadData(String str, Chain chain) throws IOException {
        int i;
        C13170b0 b0Var;
        C13170b0 b0Var2 = (C13170b0) this.cache.get(str, C13170b0.class);
        if (b0Var2 == null) {
            String str2 = "CachingInterceptor";
            Logger.m31608a(str2, "Response not cached, loading it from the network. | %s", str);
            C13167a0 proceed = chain.proceed(chain.request());
            if (proceed.mo37796g()) {
                C13321t e = proceed.mo37789a().mo37828e();
                byte[] b = proceed.mo37789a().mo37824b();
                this.cache.put(str, (Object) C13170b0.m34434a(e, b));
                b0Var = C13170b0.m34434a(e, b);
            } else {
                Logger.m31608a(str2, "Unable to load data from network. | %s", str);
                b0Var = proceed.mo37789a();
            }
            b0Var2 = b0Var;
            i = proceed.mo37793d();
        } else {
            i = 200;
        }
        return createResponse(i, chain.request(), b0Var2);
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        Lock lock;
        String sVar = chain.request().mo38389g().toString();
        synchronized (this.locks) {
            if (this.locks.containsKey(sVar)) {
                lock = (Lock) this.locks.get(sVar);
            } else {
                lock = new ReentrantLock();
                this.locks.put(sVar, lock);
            }
        }
        try {
            lock.lock();
            return loadData(sVar, chain);
        } finally {
            lock.unlock();
        }
    }
}
