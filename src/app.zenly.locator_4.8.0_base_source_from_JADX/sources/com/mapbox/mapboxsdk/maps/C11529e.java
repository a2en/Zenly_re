package com.mapbox.mapboxsdk.maps;

import android.os.Handler;
import android.os.Message;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveCanceledListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveStartedListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mapbox.mapboxsdk.maps.e */
class C11529e implements OnCameraMoveStartedListener, OnCameraMoveListener, OnCameraMoveCanceledListener, OnCameraIdleListener {

    /* renamed from: a */
    private final C11530a f29861a = new C11530a(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f29862b = true;

    /* renamed from: c */
    private int f29863c;

    /* renamed from: d */
    private final CopyOnWriteArrayList<OnCameraMoveStartedListener> f29864d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private final CopyOnWriteArrayList<OnCameraMoveCanceledListener> f29865e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    private final CopyOnWriteArrayList<OnCameraMoveListener> f29866f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    private final CopyOnWriteArrayList<OnCameraIdleListener> f29867g = new CopyOnWriteArrayList<>();

    /* renamed from: com.mapbox.mapboxsdk.maps.e$a */
    private static class C11530a extends Handler {

        /* renamed from: a */
        private WeakReference<C11529e> f29868a;

        C11530a(C11529e eVar) {
            this.f29868a = new WeakReference<>(eVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo33811a(int i) {
            C11529e eVar = (C11529e) this.f29868a.get();
            if (eVar != null) {
                if (i == 0) {
                    boolean z = !eVar.f29862b && (hasMessages(3) || hasMessages(2));
                    removeMessages(3);
                    removeMessages(2);
                    if (z) {
                        return;
                    }
                }
                Message message = new Message();
                message.what = i;
                sendMessage(message);
            }
        }

        public void handleMessage(Message message) {
            C11529e eVar = (C11529e) this.f29868a.get();
            if (eVar != null) {
                int i = message.what;
                if (i == 0) {
                    eVar.m30002d();
                } else if (i == 1) {
                    eVar.m29998b();
                } else if (i == 2) {
                    eVar.m30000c();
                } else if (i == 3) {
                    eVar.m29996a();
                }
            }
        }
    }

    C11529e() {
    }

    public void onCameraIdle() {
        this.f29861a.mo33811a(3);
    }

    public void onCameraMove() {
        this.f29861a.mo33811a(1);
    }

    public void onCameraMoveCanceled() {
        this.f29861a.mo33811a(2);
    }

    public void onCameraMoveStarted(int i) {
        this.f29863c = i;
        this.f29861a.mo33811a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29998b() {
        if (!this.f29866f.isEmpty() && !this.f29862b) {
            Iterator it = this.f29866f.iterator();
            while (it.hasNext()) {
                ((OnCameraMoveListener) it.next()).onCameraMove();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30000c() {
        if (!this.f29865e.isEmpty() && !this.f29862b) {
            Iterator it = this.f29865e.iterator();
            while (it.hasNext()) {
                ((OnCameraMoveCanceledListener) it.next()).onCameraMoveCanceled();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m30002d() {
        if (this.f29862b) {
            this.f29862b = false;
            if (!this.f29864d.isEmpty()) {
                Iterator it = this.f29864d.iterator();
                while (it.hasNext()) {
                    ((OnCameraMoveStartedListener) it.next()).onCameraMoveStarted(this.f29863c);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33809a(OnCameraIdleListener onCameraIdleListener) {
        this.f29867g.add(onCameraIdleListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33810a(OnCameraMoveListener onCameraMoveListener) {
        this.f29866f.add(onCameraMoveListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29996a() {
        if (!this.f29862b) {
            this.f29862b = true;
            if (!this.f29867g.isEmpty()) {
                Iterator it = this.f29867g.iterator();
                while (it.hasNext()) {
                    ((OnCameraIdleListener) it.next()).onCameraIdle();
                }
            }
        }
    }
}
