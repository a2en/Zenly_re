package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.C9700d;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.C9884a.C9886b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.producers.d */
public class C9805d implements ProducerContext {

    /* renamed from: a */
    private final C9884a f25741a;

    /* renamed from: b */
    private final String f25742b;

    /* renamed from: c */
    private final ProducerListener f25743c;

    /* renamed from: d */
    private final Object f25744d;

    /* renamed from: e */
    private final C9886b f25745e;

    /* renamed from: f */
    private boolean f25746f;

    /* renamed from: g */
    private C9700d f25747g;

    /* renamed from: h */
    private boolean f25748h;

    /* renamed from: i */
    private boolean f25749i = false;

    /* renamed from: j */
    private final List<ProducerContextCallbacks> f25750j = new ArrayList();

    public C9805d(C9884a aVar, String str, ProducerListener producerListener, Object obj, C9886b bVar, boolean z, boolean z2, C9700d dVar) {
        this.f25741a = aVar;
        this.f25742b = str;
        this.f25743c = producerListener;
        this.f25744d = obj;
        this.f25745e = bVar;
        this.f25746f = z;
        this.f25747g = dVar;
        this.f25748h = z2;
    }

    /* renamed from: c */
    public static void m24379c(List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onIsPrefetchChanged : list) {
                onIsPrefetchChanged.onIsPrefetchChanged();
            }
        }
    }

    /* renamed from: d */
    public static void m24380d(List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onPriorityChanged : list) {
                onPriorityChanged.onPriorityChanged();
            }
        }
    }

    /* renamed from: a */
    public void mo26631a() {
        m24377a(mo26632b());
    }

    public void addCallbacks(ProducerContextCallbacks producerContextCallbacks) {
        boolean z;
        synchronized (this) {
            this.f25750j.add(producerContextCallbacks);
            z = this.f25749i;
        }
        if (z) {
            producerContextCallbacks.onCancellationRequested();
        }
    }

    /* renamed from: b */
    public synchronized List<ProducerContextCallbacks> mo26633b(boolean z) {
        if (z == this.f25746f) {
            return null;
        }
        this.f25746f = z;
        return new ArrayList(this.f25750j);
    }

    public Object getCallerContext() {
        return this.f25744d;
    }

    public String getId() {
        return this.f25742b;
    }

    public C9884a getImageRequest() {
        return this.f25741a;
    }

    public ProducerListener getListener() {
        return this.f25743c;
    }

    public C9886b getLowestPermittedRequestLevel() {
        return this.f25745e;
    }

    public synchronized C9700d getPriority() {
        return this.f25747g;
    }

    public synchronized boolean isIntermediateResultExpected() {
        return this.f25748h;
    }

    public synchronized boolean isPrefetch() {
        return this.f25746f;
    }

    /* renamed from: a */
    public synchronized List<ProducerContextCallbacks> mo26629a(C9700d dVar) {
        if (dVar == this.f25747g) {
            return null;
        }
        this.f25747g = dVar;
        return new ArrayList(this.f25750j);
    }

    /* renamed from: b */
    public synchronized List<ProducerContextCallbacks> mo26632b() {
        if (this.f25749i) {
            return null;
        }
        this.f25749i = true;
        return new ArrayList(this.f25750j);
    }

    /* renamed from: a */
    public synchronized List<ProducerContextCallbacks> mo26630a(boolean z) {
        if (z == this.f25748h) {
            return null;
        }
        this.f25748h = z;
        return new ArrayList(this.f25750j);
    }

    /* renamed from: b */
    public static void m24378b(List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onIsIntermediateResultExpectedChanged : list) {
                onIsIntermediateResultExpectedChanged.onIsIntermediateResultExpectedChanged();
            }
        }
    }

    /* renamed from: a */
    public static void m24377a(List<ProducerContextCallbacks> list) {
        if (list != null) {
            for (ProducerContextCallbacks onCancellationRequested : list) {
                onCancellationRequested.onCancellationRequested();
            }
        }
    }
}
