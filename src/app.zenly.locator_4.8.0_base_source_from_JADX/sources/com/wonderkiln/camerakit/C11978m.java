package com.wonderkiln.camerakit;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;

/* renamed from: com.wonderkiln.camerakit.m */
public abstract class C11978m {

    /* renamed from: d */
    static final SparseIntArray f31215d = new SparseIntArray();

    /* renamed from: a */
    private final OrientationEventListener f31216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Display f31217b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f31218c = 0;

    /* renamed from: com.wonderkiln.camerakit.m$a */
    class C11979a extends OrientationEventListener {

        /* renamed from: a */
        private int f31219a = -1;

        C11979a(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i) {
            boolean z;
            if (i != -1 && C11978m.this.f31217b != null) {
                int rotation = C11978m.this.f31217b.getRotation();
                int i2 = 0;
                if (this.f31219a != rotation) {
                    this.f31219a = rotation;
                    z = true;
                } else {
                    z = false;
                }
                if (i >= 60 && i <= 140) {
                    i2 = 270;
                } else if (i >= 140 && i <= 220) {
                    i2 = 180;
                } else if (i >= 220 && i <= 300) {
                    i2 = 90;
                }
                if (C11978m.this.f31218c != i2) {
                    C11978m.this.f31218c = i2;
                    z = true;
                }
                if (z) {
                    C11978m.this.mo35564a(C11978m.f31215d.get(rotation));
                }
            }
        }
    }

    static {
        f31215d.put(0, 0);
        f31215d.put(1, 90);
        f31215d.put(2, 180);
        f31215d.put(3, 270);
    }

    public C11978m(Context context) {
        this.f31216a = new C11979a(context);
    }

    /* renamed from: a */
    public abstract void mo35505a(int i, int i2);

    /* renamed from: a */
    public void mo35565a(Display display) {
        this.f31217b = display;
        this.f31216a.enable();
        mo35564a(f31215d.get(display.getRotation()));
    }

    /* renamed from: a */
    public void mo35563a() {
        this.f31216a.disable();
        this.f31217b = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35564a(int i) {
        if (this.f31216a.canDetectOrientation()) {
            mo35505a(i, this.f31218c);
        } else {
            mo35505a(i, i);
        }
    }
}
