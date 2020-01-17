package com.wonderkiln.camerakit;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0540a;
import androidx.core.view.ViewCompat;
import com.wonderkiln.camerakit.p332t.C11998c;
import java.util.ArrayList;
import p214e.p234h.p236f.p237a.C7630a;

public class CameraView extends CameraViewLayout {

    /* renamed from: C */
    private static Handler f31129C;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C11980n f31130A;

    /* renamed from: B */
    private FocusMarkerLayout f31131B;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f31132i;

    /* renamed from: j */
    private int f31133j;

    /* renamed from: k */
    private int f31134k;

    /* renamed from: l */
    private int f31135l;

    /* renamed from: m */
    private boolean f31136m;

    /* renamed from: n */
    private float f31137n;

    /* renamed from: o */
    private int f31138o;

    /* renamed from: p */
    private int f31139p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f31140q;

    /* renamed from: r */
    private int f31141r;

    /* renamed from: s */
    private boolean f31142s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f31143t;

    /* renamed from: u */
    private boolean f31144u;

    /* renamed from: v */
    private boolean f31145v;

    /* renamed from: w */
    private C11978m f31146w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C11966b f31147x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C11989q f31148y;

    /* renamed from: z */
    private boolean f31149z;

    /* renamed from: com.wonderkiln.camerakit.CameraView$a */
    class C11948a extends C11978m {
        C11948a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void mo35505a(int i, int i2) {
            CameraView.this.f31147x.mo35529a(i, i2);
            CameraView.this.f31148y.mo35586a(i);
        }
    }

    /* renamed from: com.wonderkiln.camerakit.CameraView$b */
    class C11949b implements Runnable {
        C11949b() {
        }

        public void run() {
            CameraView.this.f31147x.mo35540e();
        }
    }

    /* renamed from: com.wonderkiln.camerakit.CameraView$c */
    class C11950c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ int f31152e;

        C11950c(int i) {
            this.f31152e = i;
        }

        public void run() {
            CameraView.this.f31147x.mo35528a(this.f31152e);
        }
    }

    /* renamed from: com.wonderkiln.camerakit.CameraView$d */
    class C11951d implements C11967a {

        /* renamed from: a */
        final /* synthetic */ CameraKitEventCallback f31154a;

        C11951d(CameraKitEventCallback cameraKitEventCallback) {
            this.f31154a = cameraKitEventCallback;
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr) {
            C11986p pVar = new C11986p(bArr);
            pVar.mo35581b(CameraView.this.f31140q);
            pVar.mo35578a(CameraView.this.f31132i);
            if (CameraView.this.f31143t) {
                pVar.mo35579a(AspectRatio.m31428b(CameraView.this.getWidth(), CameraView.this.getHeight()));
            }
            C11972g gVar = new C11972g(pVar.mo35580a());
            CameraKitEventCallback cameraKitEventCallback = this.f31154a;
            if (cameraKitEventCallback != null) {
                cameraKitEventCallback.callback(gVar);
            }
            CameraView.this.f31130A.mo35568a((C11970e) gVar);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("CameraViewWorker");
        handlerThread.setDaemon(true);
        handlerThread.start();
        f31129C = new Handler(handlerThread.getLooper());
    }

    public CameraView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public C11966b getCameraImpl() {
        return this.f31147x;
    }

    public C11974i getCameraProperties() {
        return this.f31147x.mo35533b();
    }

    public C11991r getCaptureSize() {
        C11966b bVar = this.f31147x;
        if (bVar != null) {
            return bVar.mo35536c();
        }
        return null;
    }

    public int getFacing() {
        return this.f31132i;
    }

    public int getFlash() {
        return this.f31133j;
    }

    /* access modifiers changed from: protected */
    public C11989q getPreviewImpl() {
        return this.f31148y;
    }

    public C11991r getPreviewSize() {
        C11966b bVar = this.f31147x;
        if (bVar != null) {
            return bVar.mo35538d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.f31146w.mo35565a(ViewCompat.m2802B(this) ? C7630a.m18582a(getContext().getApplicationContext()).mo19749a(0) : null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f31146w.mo35563a();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f31145v) {
            C11991r previewSize = getPreviewSize();
            if (previewSize == null) {
                super.onMeasure(i, i2);
                return;
            } else if (getLayoutParams().width == -2) {
                super.onMeasure(MeasureSpec.makeMeasureSpec((int) (((float) previewSize.mo35600b()) * (((float) MeasureSpec.getSize(i2)) / ((float) previewSize.mo35598a()))), 1073741824), i2);
                return;
            } else if (getLayoutParams().height == -2) {
                super.onMeasure(i, MeasureSpec.makeMeasureSpec((int) (((float) previewSize.mo35598a()) * (((float) MeasureSpec.getSize(i)) / ((float) previewSize.mo35600b()))), 1073741824));
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCropOutput(boolean z) {
        this.f31143t = z;
    }

    public void setFacing(int i) {
        this.f31132i = i;
        f31129C.post(new C11950c(i));
    }

    public void setFlash(int i) {
        this.f31133j = i;
        this.f31147x.mo35535b(i);
    }

    public void setFocus(int i) {
        this.f31134k = i;
        int i2 = this.f31134k;
        if (i2 == 3) {
            this.f31147x.mo35537c(2);
        } else {
            this.f31147x.mo35537c(i2);
        }
    }

    public void setJpegQuality(int i) {
        this.f31140q = i;
    }

    public void setLockVideoAspectRatio(boolean z) {
        this.f31142s = z;
        this.f31147x.mo35531a(z);
    }

    public void setMethod(int i) {
        this.f31135l = i;
        this.f31147x.mo35539d(this.f31135l);
    }

    public void setPermissions(int i) {
        this.f31138o = i;
    }

    public void setPinchToZoom(boolean z) {
        this.f31136m = z;
    }

    public void setVideoBitRate(int i) {
        this.f31141r = i;
        this.f31147x.mo35541e(this.f31141r);
    }

    public void setVideoQuality(int i) {
        this.f31139p = i;
        this.f31147x.mo35543f(this.f31139p);
    }

    public void setZoom(float f) {
        this.f31137n = f;
        this.f31147x.mo35534b(f);
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35476a(float f, boolean z) {
        if (this.f31136m) {
            this.f31147x.mo35526a(((f - 1.0f) * 0.8f) + 1.0f);
        }
    }

    /* renamed from: b */
    public void mo35479b() {
        mo35477a(null);
    }

    /* renamed from: c */
    public void mo35480c() {
        if (!this.f31149z && isEnabled()) {
            this.f31149z = true;
            int a = C0540a.m2537a(getContext(), "android.permission.CAMERA");
            int a2 = C0540a.m2537a(getContext(), "android.permission.RECORD_AUDIO");
            int i = this.f31138o;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 && a != 0) {
                        m31442a(true, false);
                        return;
                    }
                } else if (a != 0) {
                    m31442a(true, true);
                    return;
                }
            } else if (!(a == 0 && a2 == 0)) {
                m31442a(true, true);
            }
            f31129C.postDelayed(new C11949b(), 100);
        }
    }

    /* renamed from: d */
    public void mo35481d() {
        if (this.f31149z) {
            this.f31149z = false;
            this.f31147x.mo35542f();
        }
    }

    /* renamed from: e */
    public int mo35482e() {
        int i = this.f31132i;
        if (i == 0) {
            setFacing(1);
        } else if (i == 1) {
            setFacing(0);
        }
        return this.f31132i;
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C11998c.CameraView, 0, 0);
            try {
                this.f31132i = obtainStyledAttributes.getInteger(C11998c.CameraView_ckFacing, 0);
                this.f31133j = obtainStyledAttributes.getInteger(C11998c.CameraView_ckFlash, 0);
                this.f31134k = obtainStyledAttributes.getInteger(C11998c.CameraView_ckFocus, 1);
                this.f31135l = obtainStyledAttributes.getInteger(C11998c.CameraView_ckMethod, 0);
                this.f31136m = obtainStyledAttributes.getBoolean(C11998c.CameraView_ckPinchToZoom, true);
                this.f31137n = obtainStyledAttributes.getFloat(C11998c.CameraView_ckZoom, 1.0f);
                this.f31138o = obtainStyledAttributes.getInteger(C11998c.CameraView_ckPermissions, 0);
                this.f31139p = obtainStyledAttributes.getInteger(C11998c.CameraView_ckVideoQuality, 0);
                this.f31140q = obtainStyledAttributes.getInteger(C11998c.CameraView_ckJpegQuality, 100);
                this.f31143t = obtainStyledAttributes.getBoolean(C11998c.CameraView_ckCropOutput, false);
                this.f31141r = obtainStyledAttributes.getInteger(C11998c.CameraView_ckVideoBitRate, 0);
                this.f31144u = obtainStyledAttributes.getBoolean(C11998c.CameraView_ckDoubleTapToToggleFacing, false);
                this.f31142s = obtainStyledAttributes.getBoolean(C11998c.CameraView_ckLockVideoAspectRatio, false);
                this.f31145v = obtainStyledAttributes.getBoolean(C11998c.CameraView_android_adjustViewBounds, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f31130A = new C11980n();
        this.f31148y = new C11992s(context, this);
        this.f31147x = new C11957a(this.f31130A, this.f31148y);
        this.f31149z = false;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management") && windowManager.getDefaultDisplay().getRotation() == 0) {
            z = true;
        }
        if (this.f31147x.mo35532a() || z) {
            this.f31132i = 1;
        }
        setFacing(this.f31132i);
        setFlash(this.f31133j);
        setFocus(this.f31134k);
        setMethod(this.f31135l);
        setPinchToZoom(this.f31136m);
        setZoom(this.f31137n);
        setPermissions(this.f31138o);
        setVideoQuality(this.f31139p);
        setVideoBitRate(this.f31141r);
        setLockVideoAspectRatio(this.f31142s);
        if (!isInEditMode()) {
            this.f31146w = new C11948a(context);
            this.f31131B = new FocusMarkerLayout(getContext());
            addView(this.f31131B);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35475a(float f, float f2) {
        int i = this.f31134k;
        if (i == 2 || i == 3) {
            this.f31131B.mo35516a(f, f2);
            this.f31147x.mo35527a((f - getPreviewImpl().mo35595g()) / ((float) getPreviewImpl().mo35594f()), (f2 - getPreviewImpl().mo35596h()) / ((float) getPreviewImpl().mo35590b()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35474a() {
        if (this.f31144u) {
            mo35482e();
        }
    }

    /* renamed from: a */
    public void mo35477a(CameraKitEventCallback<C11972g> cameraKitEventCallback) {
        this.f31147x.mo35530a((C11967a) new C11951d(cameraKitEventCallback));
    }

    /* renamed from: a */
    private void m31442a(boolean z, boolean z2) {
        Activity activity = null;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("android.permission.CAMERA");
        }
        if (z2) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (activity != null) {
            ActivityCompat.m2350a(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 16);
        }
    }

    /* renamed from: a */
    public void mo35478a(CameraKitEventListener cameraKitEventListener) {
        this.f31130A.mo35567a(cameraKitEventListener);
    }
}
