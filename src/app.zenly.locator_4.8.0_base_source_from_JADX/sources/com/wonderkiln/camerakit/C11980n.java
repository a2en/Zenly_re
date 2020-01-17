package com.wonderkiln.camerakit;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.wonderkiln.camerakit.n */
class C11980n {

    /* renamed from: a */
    private Handler f31221a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<CameraKitEventListener> f31222b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C11982b> f31223c = new ArrayList();

    /* renamed from: com.wonderkiln.camerakit.n$a */
    class C11981a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C11970e f31224e;

        C11981a(C11970e eVar) {
            this.f31224e = eVar;
        }

        public void run() {
            for (CameraKitEventListener cameraKitEventListener : C11980n.this.f31222b) {
                cameraKitEventListener.onEvent(this.f31224e);
                C11970e eVar = this.f31224e;
                if (eVar instanceof C11969d) {
                    cameraKitEventListener.onError((C11969d) eVar);
                }
                C11970e eVar2 = this.f31224e;
                if (eVar2 instanceof C11972g) {
                    cameraKitEventListener.onImage((C11972g) eVar2);
                }
                C11970e eVar3 = this.f31224e;
                if (eVar3 instanceof C11973h) {
                    cameraKitEventListener.onVideo((C11973h) eVar3);
                }
            }
            for (C11982b a : C11980n.this.f31223c) {
                try {
                    a.mo35570a(this.f31224e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.wonderkiln.camerakit.n$b */
    private class C11982b {

        /* renamed from: a */
        private Map<Class, List<C11983a>> f31226a;

        /* renamed from: com.wonderkiln.camerakit.n$b$a */
        private class C11983a {

            /* renamed from: a */
            private Object f31227a;

            /* renamed from: b */
            private Method f31228b;

            /* renamed from: a */
            public Object mo35571a() {
                return this.f31227a;
            }

            /* renamed from: b */
            public Method mo35572b() {
                return this.f31228b;
            }
        }

        /* renamed from: a */
        public void mo35570a(C11970e eVar) throws IllegalAccessException, InvocationTargetException {
            List<C11983a> list = (List) this.f31226a.get(C11970e.class);
            if (list != null) {
                for (C11983a aVar : list) {
                    aVar.mo35572b().invoke(aVar.mo35571a(), new Object[]{eVar});
                }
            }
            List<C11983a> list2 = (List) this.f31226a.get(eVar.getClass());
            if (list2 != null) {
                for (C11983a aVar2 : list2) {
                    aVar2.mo35572b().invoke(aVar2.mo35571a(), new Object[]{eVar});
                }
            }
        }
    }

    /* renamed from: a */
    public void mo35567a(CameraKitEventListener cameraKitEventListener) {
        this.f31222b.add(cameraKitEventListener);
    }

    /* renamed from: a */
    public void mo35568a(C11970e eVar) {
        this.f31221a.post(new C11981a(eVar));
    }
}
