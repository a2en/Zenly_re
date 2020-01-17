package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p301o.C9212f;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.v */
class C9010v implements DataFetcherGenerator, DataCallback<Object>, FetcherReadyCallback {

    /* renamed from: e */
    private final C8966f<?> f23533e;

    /* renamed from: f */
    private final FetcherReadyCallback f23534f;

    /* renamed from: g */
    private int f23535g;

    /* renamed from: h */
    private C8941c f23536h;

    /* renamed from: i */
    private Object f23537i;

    /* renamed from: j */
    private volatile C9045a<?> f23538j;

    /* renamed from: k */
    private C8957d f23539k;

    C9010v(C8966f<?> fVar, FetcherReadyCallback fetcherReadyCallback) {
        this.f23533e = fVar;
        this.f23534f = fetcherReadyCallback;
    }

    /* renamed from: b */
    private boolean m21670b() {
        return this.f23535g < this.f23533e.mo24431g().size();
    }

    /* renamed from: a */
    public boolean mo24274a() {
        Object obj = this.f23537i;
        if (obj != null) {
            this.f23537i = null;
            m21669a(obj);
        }
        C8941c cVar = this.f23536h;
        if (cVar != null && cVar.mo24274a()) {
            return true;
        }
        this.f23536h = null;
        this.f23538j = null;
        boolean z = false;
        while (!z && m21670b()) {
            List g = this.f23533e.mo24431g();
            int i = this.f23535g;
            this.f23535g = i + 1;
            this.f23538j = (C9045a) g.get(i);
            if (this.f23538j != null && (this.f23533e.mo24429e().mo24464a(this.f23538j.f23580c.getDataSource()) || this.f23533e.mo24427c(this.f23538j.f23580c.getDataClass()))) {
                this.f23538j.f23580c.loadData(this.f23533e.mo24434j(), this);
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        C9045a<?> aVar = this.f23538j;
        if (aVar != null) {
            aVar.f23580c.cancel();
        }
    }

    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, C8882a aVar) {
        this.f23534f.onDataFetcherFailed(key, exc, dataFetcher, this.f23538j.f23580c.getDataSource());
    }

    public void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, C8882a aVar, Key key2) {
        this.f23534f.onDataFetcherReady(key, obj, dataFetcher, this.f23538j.f23580c.getDataSource(), key);
    }

    public void onDataReady(Object obj) {
        C8978i e = this.f23533e.mo24429e();
        if (obj == null || !e.mo24464a(this.f23538j.f23580c.getDataSource())) {
            this.f23534f.onDataFetcherReady(this.f23538j.f23578a, obj, this.f23538j.f23580c, this.f23538j.f23580c.getDataSource(), this.f23539k);
            return;
        }
        this.f23537i = obj;
        this.f23534f.reschedule();
    }

    public void onLoadFailed(Exception exc) {
        this.f23534f.onDataFetcherFailed(this.f23539k, exc, this.f23538j.f23580c, this.f23538j.f23580c.getDataSource());
    }

    public void reschedule() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m21669a(Object obj) {
        String str = "SourceGenerator";
        long a = C9212f.m22072a();
        try {
            Encoder a2 = this.f23533e.mo24416a(obj);
            C8958e eVar = new C8958e(a2, obj, this.f23533e.mo24433i());
            this.f23539k = new C8957d(this.f23538j.f23578a, this.f23533e.mo24436l());
            this.f23533e.mo24428d().put(this.f23539k, eVar);
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f23539k);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(a2);
                sb.append(", duration: ");
                sb.append(C9212f.m22071a(a));
                Log.v(str, sb.toString());
            }
            this.f23538j.f23580c.cleanup();
            this.f23536h = new C8941c(Collections.singletonList(this.f23538j.f23578a), this.f23533e, this);
        } catch (Throwable th) {
            this.f23538j.f23580c.cleanup();
            throw th;
        }
    }
}
