package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.mapbox.mapboxsdk.maps.j */
final class C11546j {

    /* renamed from: a */
    private final C11568u f29931a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11573v f29932b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11534i f29933c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11547a f29934d;

    /* renamed from: com.mapbox.mapboxsdk.maps.j$a */
    private class C11547a implements Runnable {

        /* renamed from: e */
        private boolean f29935e = false;

        C11547a() {
        }

        /* renamed from: a */
        public void mo33879a() {
            this.f29935e = true;
        }

        public void run() {
            if (!this.f29935e) {
                C11546j.this.f29933c.mo33850b(new PointF(C11546j.this.f29932b.mo34014u() / 2.0f, C11546j.this.f29932b.mo34004n() / 2.0f), true);
                C11546j.this.f29934d = null;
            }
        }
    }

    C11546j(C11568u uVar, C11573v vVar, C11534i iVar) {
        this.f29931a = uVar;
        this.f29932b = vVar;
        this.f29933c = iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo33878c(int i, KeyEvent keyEvent) {
        if (keyEvent.isCanceled()) {
            return false;
        }
        if ((i != 23 && i != 66) || !this.f29932b.mo33964L()) {
            return false;
        }
        this.f29933c.mo33842a(new PointF(this.f29932b.mo34014u() / 2.0f, this.f29932b.mo34004n() / 2.0f), true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo33877b(int i, KeyEvent keyEvent) {
        if ((i != 23 && i != 66) || !this.f29932b.mo33964L()) {
            return false;
        }
        this.f29933c.mo33850b(new PointF(this.f29932b.mo34014u() / 2.0f, this.f29932b.mo34004n() / 2.0f), true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33875a(int i, KeyEvent keyEvent) {
        int i2 = i;
        double d = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i2 != 66) {
            switch (i2) {
                case 19:
                    if (!this.f29932b.mo33962J()) {
                        return false;
                    }
                    this.f29931a.mo33932a();
                    this.f29931a.mo33934a(0.0d, d, 0);
                    return true;
                case 20:
                    if (!this.f29932b.mo33962J()) {
                        return false;
                    }
                    this.f29931a.mo33932a();
                    this.f29931a.mo33934a(0.0d, -d, 0);
                    return true;
                case 21:
                    if (!this.f29932b.mo33962J()) {
                        return false;
                    }
                    this.f29931a.mo33932a();
                    this.f29931a.mo33934a(d, 0.0d, 0);
                    return true;
                case 22:
                    if (!this.f29932b.mo33962J()) {
                        return false;
                    }
                    this.f29931a.mo33932a();
                    this.f29931a.mo33934a(-d, 0.0d, 0);
                    return true;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        keyEvent.startTracking();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33876a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C11547a aVar = this.f29934d;
            if (aVar != null) {
                aVar.mo33879a();
                this.f29934d = null;
            }
            this.f29934d = new C11547a();
            new Handler(Looper.getMainLooper()).postDelayed(this.f29934d, (long) ViewConfiguration.getLongPressTimeout());
            return true;
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return false;
                }
                C11547a aVar2 = this.f29934d;
                if (aVar2 != null) {
                    aVar2.mo33879a();
                    this.f29934d = null;
                }
                return true;
            } else if (!this.f29932b.mo33962J()) {
                return false;
            } else {
                this.f29931a.mo33932a();
                this.f29931a.mo33934a(((double) motionEvent.getX()) * -10.0d, ((double) motionEvent.getY()) * -10.0d, 0);
                return true;
            }
        } else if (!this.f29932b.mo33964L()) {
            return false;
        } else {
            if (this.f29934d != null) {
                this.f29933c.mo33842a(new PointF(this.f29932b.mo34014u() / 2.0f, this.f29932b.mo34004n() / 2.0f), true);
            }
            return true;
        }
    }
}
