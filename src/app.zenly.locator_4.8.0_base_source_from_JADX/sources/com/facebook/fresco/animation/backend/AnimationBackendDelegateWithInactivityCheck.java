package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.MonotonicClock;
import com.facebook.fresco.animation.backend.AnimationBackend;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnimationBackendDelegateWithInactivityCheck<T extends AnimationBackend> extends C9628a<T> {

    /* renamed from: b */
    private final MonotonicClock f25089b;

    /* renamed from: c */
    private final ScheduledExecutorService f25090c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f25091d = false;

    /* renamed from: e */
    private long f25092e;

    /* renamed from: f */
    private long f25093f = 2000;

    /* renamed from: g */
    private long f25094g = 1000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public InactivityListener f25095h;

    /* renamed from: i */
    private final Runnable f25096i = new C9627a();

    public interface InactivityListener {
        void onInactive();
    }

    /* renamed from: com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck$a */
    class C9627a implements Runnable {
        C9627a() {
        }

        public void run() {
            synchronized (AnimationBackendDelegateWithInactivityCheck.this) {
                AnimationBackendDelegateWithInactivityCheck.this.f25091d = false;
                if (!AnimationBackendDelegateWithInactivityCheck.this.m23662a()) {
                    AnimationBackendDelegateWithInactivityCheck.this.m23666b();
                } else if (AnimationBackendDelegateWithInactivityCheck.this.f25095h != null) {
                    AnimationBackendDelegateWithInactivityCheck.this.f25095h.onInactive();
                }
            }
        }
    }

    private AnimationBackendDelegateWithInactivityCheck(T t, InactivityListener inactivityListener, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f25095h = inactivityListener;
        this.f25089b = monotonicClock;
        this.f25090c = scheduledExecutorService;
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        this.f25092e = this.f25089b.now();
        boolean drawFrame = super.drawFrame(drawable, canvas, i);
        m23666b();
        return drawFrame;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m23666b() {
        if (!this.f25091d) {
            this.f25091d = true;
            this.f25090c.schedule(this.f25096i, this.f25094g, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public static <T extends AnimationBackend & InactivityListener> C9628a<T> m23660a(T t, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorService) {
        return m23661a(t, (InactivityListener) t, monotonicClock, scheduledExecutorService);
    }

    /* renamed from: a */
    public static <T extends AnimationBackend> C9628a<T> m23661a(T t, InactivityListener inactivityListener, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorService) {
        return new AnimationBackendDelegateWithInactivityCheck(t, inactivityListener, monotonicClock, scheduledExecutorService);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m23662a() {
        return this.f25089b.now() - this.f25092e > this.f25093f;
    }
}
