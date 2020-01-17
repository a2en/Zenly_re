package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView.OnCameraDidChangeListener;
import com.mapbox.mapboxsdk.maps.MapView.OnCameraIsChangingListener;
import com.mapbox.mapboxsdk.maps.MapView.OnCameraWillChangeListener;
import com.mapbox.mapboxsdk.maps.MapView.OnDidBecomeIdleListener;
import com.mapbox.mapboxsdk.maps.MapView.OnDidFailLoadingMapListener;
import com.mapbox.mapboxsdk.maps.MapView.OnDidFinishLoadingMapListener;
import com.mapbox.mapboxsdk.maps.MapView.OnDidFinishLoadingStyleListener;
import com.mapbox.mapboxsdk.maps.MapView.OnDidFinishRenderingFrameListener;
import com.mapbox.mapboxsdk.maps.MapView.OnDidFinishRenderingMapListener;
import com.mapbox.mapboxsdk.maps.MapView.OnSourceChangedListener;
import com.mapbox.mapboxsdk.maps.MapView.OnWillStartLoadingMapListener;
import com.mapbox.mapboxsdk.maps.MapView.OnWillStartRenderingFrameListener;
import com.mapbox.mapboxsdk.maps.MapView.OnWillStartRenderingMapListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mapbox.mapboxsdk.maps.h */
class C11533h implements C11507a {

    /* renamed from: a */
    private final List<OnCameraWillChangeListener> f29879a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final List<OnCameraIsChangingListener> f29880b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final List<OnCameraDidChangeListener> f29881c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final List<OnWillStartLoadingMapListener> f29882d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final List<OnDidFinishLoadingMapListener> f29883e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private final List<OnDidFailLoadingMapListener> f29884f = new CopyOnWriteArrayList();

    /* renamed from: g */
    private final List<OnWillStartRenderingFrameListener> f29885g = new CopyOnWriteArrayList();

    /* renamed from: h */
    private final List<OnDidFinishRenderingFrameListener> f29886h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final List<OnWillStartRenderingMapListener> f29887i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<OnDidFinishRenderingMapListener> f29888j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private final List<OnDidBecomeIdleListener> f29889k = new CopyOnWriteArrayList();

    /* renamed from: l */
    private final List<OnDidFinishLoadingStyleListener> f29890l = new CopyOnWriteArrayList();

    /* renamed from: m */
    private final List<OnSourceChangedListener> f29891m = new CopyOnWriteArrayList();

    C11533h() {
    }

    /* renamed from: a */
    public void mo33738a(String str) {
        try {
            if (!this.f29891m.isEmpty()) {
                for (OnSourceChangedListener onSourceChangedListener : this.f29891m) {
                    onSourceChangedListener.onSourceChangedListener(str);
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onSourceChanged", th);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33835b(OnCameraIsChangingListener onCameraIsChangingListener) {
        this.f29880b.remove(onCameraIsChangingListener);
    }

    public void onCameraDidChange(boolean z) {
        try {
            if (!this.f29881c.isEmpty()) {
                for (OnCameraDidChangeListener onCameraDidChange : this.f29881c) {
                    onCameraDidChange.onCameraDidChange(z);
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onCameraDidChange", th);
            throw th;
        }
    }

    public void onCameraIsChanging() {
        try {
            if (!this.f29880b.isEmpty()) {
                for (OnCameraIsChangingListener onCameraIsChanging : this.f29880b) {
                    onCameraIsChanging.onCameraIsChanging();
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onCameraIsChanging", th);
            throw th;
        }
    }

    public void onCameraWillChange(boolean z) {
        try {
            if (!this.f29879a.isEmpty()) {
                for (OnCameraWillChangeListener onCameraWillChange : this.f29879a) {
                    onCameraWillChange.onCameraWillChange(z);
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onCameraWillChange", th);
            throw th;
        }
    }

    public void onDidBecomeIdle() {
        try {
            if (!this.f29889k.isEmpty()) {
                for (OnDidBecomeIdleListener onDidBecomeIdle : this.f29889k) {
                    onDidBecomeIdle.onDidBecomeIdle();
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onDidBecomeIdle", th);
            throw th;
        }
    }

    public void onDidFailLoadingMap(String str) {
        try {
            if (!this.f29884f.isEmpty()) {
                for (OnDidFailLoadingMapListener onDidFailLoadingMap : this.f29884f) {
                    onDidFailLoadingMap.onDidFailLoadingMap(str);
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onDidFailLoadingMap", th);
            throw th;
        }
    }

    public void onDidFinishLoadingMap() {
        try {
            if (!this.f29883e.isEmpty()) {
                for (OnDidFinishLoadingMapListener onDidFinishLoadingMap : this.f29883e) {
                    onDidFinishLoadingMap.onDidFinishLoadingMap();
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingMap", th);
            throw th;
        }
    }

    public void onDidFinishLoadingStyle() {
        try {
            if (!this.f29890l.isEmpty()) {
                for (OnDidFinishLoadingStyleListener onDidFinishLoadingStyle : this.f29890l) {
                    onDidFinishLoadingStyle.onDidFinishLoadingStyle();
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingStyle", th);
            throw th;
        }
    }

    public void onDidFinishRenderingFrame(boolean z) {
        try {
            if (!this.f29886h.isEmpty()) {
                for (OnDidFinishRenderingFrameListener onDidFinishRenderingFrame : this.f29886h) {
                    onDidFinishRenderingFrame.onDidFinishRenderingFrame(z);
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingFrame", th);
            throw th;
        }
    }

    public void onDidFinishRenderingMap(boolean z) {
        try {
            if (!this.f29888j.isEmpty()) {
                for (OnDidFinishRenderingMapListener onDidFinishRenderingMap : this.f29888j) {
                    onDidFinishRenderingMap.onDidFinishRenderingMap(z);
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingMap", th);
            throw th;
        }
    }

    public void onWillStartLoadingMap() {
        try {
            if (!this.f29882d.isEmpty()) {
                for (OnWillStartLoadingMapListener onWillStartLoadingMap : this.f29882d) {
                    onWillStartLoadingMap.onWillStartLoadingMap();
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onWillStartLoadingMap", th);
            throw th;
        }
    }

    public void onWillStartRenderingFrame() {
        try {
            if (!this.f29885g.isEmpty()) {
                for (OnWillStartRenderingFrameListener onWillStartRenderingFrame : this.f29885g) {
                    onWillStartRenderingFrame.onWillStartRenderingFrame();
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingFrame", th);
            throw th;
        }
    }

    public void onWillStartRenderingMap() {
        try {
            if (!this.f29887i.isEmpty()) {
                for (OnWillStartRenderingMapListener onWillStartRenderingMap : this.f29887i) {
                    onWillStartRenderingMap.onWillStartRenderingMap();
                }
            }
        } catch (Throwable th) {
            Logger.m29681e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingMap", th);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33834b(OnCameraDidChangeListener onCameraDidChangeListener) {
        this.f29881c.remove(onCameraDidChangeListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33837b(OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.f29883e.remove(onDidFinishLoadingMapListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33836b(OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.f29884f.remove(onDidFailLoadingMapListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33839b(OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.f29886h.remove(onDidFinishRenderingFrameListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33829a(OnCameraWillChangeListener onCameraWillChangeListener) {
        this.f29879a.add(onCameraWillChangeListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33838b(OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.f29890l.remove(onDidFinishLoadingStyleListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33828a(OnCameraIsChangingListener onCameraIsChangingListener) {
        this.f29880b.add(onCameraIsChangingListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33827a(OnCameraDidChangeListener onCameraDidChangeListener) {
        this.f29881c.add(onCameraDidChangeListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33831a(OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.f29883e.add(onDidFinishLoadingMapListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33830a(OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.f29884f.add(onDidFailLoadingMapListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33833a(OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.f29886h.add(onDidFinishRenderingFrameListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33832a(OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.f29890l.add(onDidFinishLoadingStyleListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33826a() {
        this.f29879a.clear();
        this.f29880b.clear();
        this.f29881c.clear();
        this.f29882d.clear();
        this.f29883e.clear();
        this.f29884f.clear();
        this.f29885g.clear();
        this.f29886h.clear();
        this.f29887i.clear();
        this.f29888j.clear();
        this.f29889k.clear();
        this.f29890l.clear();
        this.f29891m.clear();
    }
}
