package com.mapbox.mapboxsdk.maps.renderer;

import android.content.Context;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFpsChangedListener;
import com.mapbox.mapboxsdk.storage.FileSource;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@Keep
public abstract class MapRenderer implements MapRendererScheduler {
    private static final String TAG = "Mbgl-MapRenderer";
    private double expectedRenderTime = 0.0d;
    private long nativePtr = 0;
    private OnFpsChangedListener onFpsChangedListener;
    private long timeElapsed;

    public MapRenderer(Context context, String str) {
        nativeInitialize(this, context.getResources().getDisplayMetrics().density, FileSource.m30348e(context), str);
    }

    private native void nativeInitialize(MapRenderer mapRenderer, float f, String str, String str2);

    private native void nativeOnSurfaceChanged(int i, int i2);

    private native void nativeOnSurfaceCreated();

    private native void nativeOnSurfaceDestroyed();

    private native void nativeRender();

    private void updateFps() {
        long nanoTime = System.nanoTime();
        this.onFpsChangedListener.onFpsChanged(1.0E9d / ((double) (nanoTime - this.timeElapsed)));
        this.timeElapsed = nanoTime;
    }

    /* access modifiers changed from: protected */
    public native void finalize() throws Throwable;

    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    public void onDrawFrame(GL10 gl10) {
        String str = TAG;
        long nanoTime = System.nanoTime();
        try {
            nativeRender();
        } catch (Error e) {
            Logger.m29680e(str, e.getMessage());
        }
        double nanoTime2 = (double) (System.nanoTime() - nanoTime);
        double d = this.expectedRenderTime;
        if (nanoTime2 < d) {
            try {
                Thread.sleep((long) ((d - nanoTime2) / 1000000.0d));
            } catch (InterruptedException e2) {
                Logger.m29680e(str, e2.getMessage());
            }
        }
        if (this.onFpsChangedListener != null) {
            updateFps();
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    /* access modifiers changed from: protected */
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        gl10.glViewport(0, 0, i, i2);
        nativeOnSurfaceChanged(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nativeOnSurfaceCreated();
    }

    /* access modifiers changed from: protected */
    public void onSurfaceDestroyed() {
        nativeOnSurfaceDestroyed();
    }

    /* access modifiers changed from: 0000 */
    public void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent(mapRendererRunnable);
    }

    public void setMaximumFps(int i) {
        if (i > 0) {
            this.expectedRenderTime = 1.0E9d / ((double) i);
        }
    }

    public void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener2) {
        this.onFpsChangedListener = onFpsChangedListener2;
    }
}
