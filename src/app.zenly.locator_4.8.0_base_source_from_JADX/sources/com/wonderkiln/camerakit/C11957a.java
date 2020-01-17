package com.wonderkiln.camerakit;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.AutoFocusMoveCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.volley.toolbox.C8733j;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.text.TextBlock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.wonderkiln.camerakit.a */
public class C11957a extends C11966b {

    /* renamed from: z */
    private static final String f31169z = "a";

    /* renamed from: c */
    private int f31170c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Camera f31171d;

    /* renamed from: e */
    private Parameters f31172e;

    /* renamed from: f */
    private C11974i f31173f;

    /* renamed from: g */
    private CameraInfo f31174g;

    /* renamed from: h */
    private C11991r f31175h;

    /* renamed from: i */
    private C11991r f31176i;

    /* renamed from: j */
    private MediaRecorder f31177j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public AutoFocusCallback f31178k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f31179l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f31180m;

    /* renamed from: n */
    private int f31181n;

    /* renamed from: o */
    private int f31182o;

    /* renamed from: p */
    private int f31183p;

    /* renamed from: q */
    private int f31184q;

    /* renamed from: r */
    private int f31185r;

    /* renamed from: s */
    private int f31186s;

    /* renamed from: t */
    private Detector<TextBlock> f31187t;

    /* renamed from: u */
    private boolean f31188u;

    /* renamed from: v */
    private Handler f31189v;

    /* renamed from: w */
    private C11984o f31190w;

    /* renamed from: x */
    private float f31191x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final Object f31192y;

    /* renamed from: com.wonderkiln.camerakit.a$a */
    class C11958a implements C11990a {
        C11958a() {
        }

        /* renamed from: a */
        public void mo35546a() {
            if (C11957a.this.f31171d != null) {
                if (C11957a.this.f31180m) {
                    C11957a.this.f31171d.stopPreview();
                    C11957a.this.f31180m = false;
                }
                C11957a.this.mo35545h();
                C11957a.this.m31499s();
                if (!C11957a.this.f31180m) {
                    C11957a.this.f31171d.startPreview();
                    C11957a.this.f31180m = true;
                }
            }
        }
    }

    /* renamed from: com.wonderkiln.camerakit.a$b */
    class C11959b implements AutoFocusCallback {
        C11959b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C11957a.this.m31477a(z, camera);
        }
    }

    /* renamed from: com.wonderkiln.camerakit.a$c */
    class C11960c implements AutoFocusCallback {
        C11960c() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C11957a.this.m31477a(z, camera);
        }
    }

    /* renamed from: com.wonderkiln.camerakit.a$d */
    class C11961d implements AutoFocusCallback {
        C11961d() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            if (C11957a.this.f31178k != null) {
                C11957a.this.f31178k.onAutoFocus(z, camera);
            }
        }
    }

    /* renamed from: com.wonderkiln.camerakit.a$e */
    class C11962e implements PictureCallback {

        /* renamed from: a */
        final /* synthetic */ C11967a f31197a;

        C11962e(C11967a aVar) {
            this.f31197a = aVar;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            this.f31197a.mo35508a(bArr);
            C11957a.this.f31179l = false;
            synchronized (C11957a.this.f31192y) {
                if (C11957a.this.mo35544g()) {
                    try {
                        C11957a.this.mo35542f();
                        C11957a.this.mo35540e();
                    } catch (Exception e) {
                        C11957a.this.m31475a(e);
                    }
                }
            }
        }
    }

    /* renamed from: com.wonderkiln.camerakit.a$f */
    class C11963f implements PreviewCallback {

        /* renamed from: a */
        final /* synthetic */ C11967a f31199a;

        C11963f(C11967a aVar) {
            this.f31199a = aVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            int i;
            int i2;
            Parameters parameters = camera.getParameters();
            int i3 = parameters.getPreviewSize().width;
            int i4 = parameters.getPreviewSize().height;
            int f = C11957a.this.m31490j();
            YuvOperator yuvOperator = new YuvOperator(bArr, i3, i4);
            yuvOperator.mo35523a(f);
            byte[] a = yuvOperator.mo35524a();
            if (f == 90 || f == 270) {
                i = i3;
                i2 = i4;
            } else {
                i2 = i3;
                i = i4;
            }
            YuvImage yuvImage = new YuvImage(a, parameters.getPreviewFormat(), i2, i, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 100, byteArrayOutputStream);
            this.f31199a.mo35508a(byteArrayOutputStream.toByteArray());
        }
    }

    /* renamed from: com.wonderkiln.camerakit.a$g */
    class C11964g implements AutoFocusMoveCallback {
        C11964g() {
        }

        public void onAutoFocusMoving(boolean z, Camera camera) {
            C11970e eVar = new C11970e("CKFocusMovedEvent");
            eVar.mo35554a().putBoolean("started", z);
            C11957a.this.f31204a.mo35568a(eVar);
        }
    }

    /* renamed from: com.wonderkiln.camerakit.a$h */
    class C11965h implements Runnable {

        /* renamed from: e */
        final /* synthetic */ boolean f31202e;

        C11965h(boolean z) {
            this.f31202e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                com.wonderkiln.camerakit.a r0 = com.wonderkiln.camerakit.C11957a.this
                java.lang.Object r0 = r0.f31192y
                monitor-enter(r0)
                com.wonderkiln.camerakit.a r1 = com.wonderkiln.camerakit.C11957a.this     // Catch:{ all -> 0x005a }
                android.hardware.Camera r1 = r1.f31171d     // Catch:{ all -> 0x005a }
                if (r1 == 0) goto L_0x0058
                com.wonderkiln.camerakit.a r1 = com.wonderkiln.camerakit.C11957a.this     // Catch:{ all -> 0x005a }
                android.hardware.Camera r1 = r1.f31171d     // Catch:{ all -> 0x005a }
                r1.cancelAutoFocus()     // Catch:{ all -> 0x005a }
                com.wonderkiln.camerakit.a r1 = com.wonderkiln.camerakit.C11957a.this     // Catch:{ all -> 0x005a }
                android.hardware.Camera$Parameters r1 = r1.m31493m()     // Catch:{ all -> 0x005a }
                if (r1 != 0) goto L_0x0022
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                return
            L_0x0022:
                java.lang.String r2 = r1.getFocusMode()     // Catch:{ all -> 0x005a }
                java.lang.String r3 = "continuous-picture"
                if (r2 == r3) goto L_0x003f
                java.lang.String r2 = "continuous-picture"
                r1.setFocusMode(r2)     // Catch:{ all -> 0x005a }
                r2 = 0
                r1.setFocusAreas(r2)     // Catch:{ all -> 0x005a }
                r1.setMeteringAreas(r2)     // Catch:{ all -> 0x005a }
                com.wonderkiln.camerakit.a r2 = com.wonderkiln.camerakit.C11957a.this     // Catch:{ all -> 0x005a }
                android.hardware.Camera r2 = r2.f31171d     // Catch:{ all -> 0x005a }
                r2.setParameters(r1)     // Catch:{ all -> 0x005a }
            L_0x003f:
                com.wonderkiln.camerakit.a r1 = com.wonderkiln.camerakit.C11957a.this     // Catch:{ all -> 0x005a }
                android.hardware.Camera$AutoFocusCallback r1 = r1.f31178k     // Catch:{ all -> 0x005a }
                if (r1 == 0) goto L_0x0058
                com.wonderkiln.camerakit.a r1 = com.wonderkiln.camerakit.C11957a.this     // Catch:{ all -> 0x005a }
                android.hardware.Camera$AutoFocusCallback r1 = r1.f31178k     // Catch:{ all -> 0x005a }
                boolean r2 = r4.f31202e     // Catch:{ all -> 0x005a }
                com.wonderkiln.camerakit.a r3 = com.wonderkiln.camerakit.C11957a.this     // Catch:{ all -> 0x005a }
                android.hardware.Camera r3 = r3.f31171d     // Catch:{ all -> 0x005a }
                r1.onAutoFocus(r2, r3)     // Catch:{ all -> 0x005a }
            L_0x0058:
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                return
            L_0x005a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wonderkiln.camerakit.C11957a.C11965h.run():void");
        }
    }

    C11957a(C11980n nVar, C11989q qVar) {
        super(nVar, qVar);
        new Handler(Looper.getMainLooper());
        this.f31189v = new Handler();
        this.f31191x = 1.0f;
        this.f31192y = new Object();
        qVar.mo35589a((C11990a) new C11958a());
        this.f31174g = new CameraInfo();
    }

    /* renamed from: i */
    private void m31489i() {
        synchronized (this.f31192y) {
            if (this.f31180m) {
                this.f31171d.stopPreview();
            }
            m31487g(0);
            if (this.f31180m) {
                this.f31171d.startPreview();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public int m31490j() {
        int i;
        CameraInfo cameraInfo = this.f31174g;
        if (cameraInfo.facing == 1) {
            i = (cameraInfo.orientation + this.f31181n) % 360;
        } else {
            i = ((cameraInfo.orientation - this.f31181n) + 360) % 360;
        }
        if (this.f31174g.facing == 1) {
            return ((i - (this.f31181n - this.f31182o)) + 360) % 360;
        }
        return ((i + (this.f31181n - this.f31182o)) + 360) % 360;
    }

    /* renamed from: k */
    private int m31491k() {
        CameraInfo cameraInfo = this.f31174g;
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + this.f31181n) % 360)) % 360;
        }
        return ((cameraInfo.orientation - this.f31181n) + 360) % 360;
    }

    /* renamed from: l */
    private void m31492l() {
        this.f31173f = new C11974i(this.f31172e.getVerticalViewAngle(), this.f31172e.getHorizontalViewAngle());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public Parameters m31493m() {
        Camera camera = this.f31171d;
        if (camera != null) {
            try {
                return camera.getParameters();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: n */
    private int m31494n() {
        return 300;
    }

    /* renamed from: o */
    private int m31495o() {
        return C8733j.DEFAULT_IMAGE_TIMEOUT_MS;
    }

    /* renamed from: p */
    private void m31496p() {
        synchronized (this.f31192y) {
            if (this.f31171d != null) {
                m31497q();
            }
            this.f31171d = Camera.open(this.f31170c);
            this.f31172e = this.f31171d.getParameters();
            m31492l();
            m31489i();
            if (VERSION.SDK_INT >= 16) {
                this.f31171d.setAutoFocusMoveCallback(new C11964g());
            }
            this.f31204a.mo35568a(new C11970e("CKCameraOpenedEvent"));
            if (this.f31187t != null) {
                this.f31190w = new C11984o(this.f31187t, this.f31176i, this.f31171d);
                this.f31190w.mo35575c();
            }
        }
    }

    /* renamed from: q */
    private void m31497q() {
        synchronized (this.f31192y) {
            if (this.f31171d != null) {
                this.f31171d.lock();
                this.f31171d.release();
                this.f31171d = null;
                this.f31172e = null;
                this.f31176i = null;
                this.f31175h = null;
                this.f31204a.mo35568a(new C11970e("CKCameraStoppedEvent"));
                if (this.f31190w != null) {
                    this.f31190w.mo35574b();
                }
            }
        }
    }

    /* renamed from: r */
    private void m31498r() {
        synchronized (this.f31192y) {
            if (this.f31177j != null) {
                this.f31177j.reset();
                this.f31177j.release();
                this.f31177j = null;
                this.f31171d.lock();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m31499s() {
        synchronized (this.f31192y) {
            try {
                this.f31171d.reconnect();
                this.f31171d.setPreviewDisplay(this.f31205b.mo35593e());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo35541e(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo35543f(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo35545h() {
        mo35529a(this.f31181n, this.f31182o);
    }

    /* renamed from: h */
    private int m31488h(int i) {
        List zoomRatios = this.f31172e.getZoomRatios();
        int i2 = -1;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            if (i3 >= zoomRatios.size()) {
                break;
            }
            if (((Integer) zoomRatios.get(i3)).intValue() < i) {
                i4 = i3;
            } else if (((Integer) zoomRatios.get(i3)).intValue() > i) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i4 < 0) {
            return 0;
        }
        if (i4 + 1 == i2) {
            return i4;
        }
        if (i2 >= 0) {
            return i2;
        }
        return zoomRatios.size() - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo35537c(int i) {
        synchronized (this.f31192y) {
            this.f31185r = i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (this.f31172e != null && this.f31172e.getSupportedFocusModes().contains("continuous-picture")) {
                            this.f31172e.setFocusMode("continuous-picture");
                        }
                    }
                } else if (this.f31172e != null) {
                    if (this.f31172e.getSupportedFocusModes().contains("continuous-picture")) {
                        this.f31172e.setFocusMode("continuous-picture");
                    } else {
                        mo35537c(0);
                    }
                }
            } else if (this.f31172e != null) {
                List supportedFocusModes = this.f31172e.getSupportedFocusModes();
                if (supportedFocusModes.contains("fixed")) {
                    this.f31172e.setFocusMode("fixed");
                } else if (supportedFocusModes.contains("infinity")) {
                    this.f31172e.setFocusMode("infinity");
                } else {
                    this.f31172e.setFocusMode("auto");
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo35539d(int i) {
        this.f31186s = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo35540e() {
        mo35528a(this.f31183p);
        m31496p();
        if (this.f31205b.mo35597i()) {
            mo35545h();
            m31499s();
            this.f31171d.startPreview();
            this.f31180m = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo35542f() {
        this.f31189v.removeCallbacksAndMessages(null);
        Camera camera = this.f31171d;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                m31475a(e);
            }
        }
        this.f31180m = false;
        m31498r();
        m31497q();
        C11984o oVar = this.f31190w;
        if (oVar != null) {
            oVar.mo35573a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo35544g() {
        return this.f31171d != null;
    }

    /* renamed from: g */
    private void m31487g(int i) {
        boolean z;
        boolean z2 = (this.f31174g.orientation + this.f31182o) % 180 == 90;
        Parameters parameters = this.f31171d.getParameters();
        if (mo35538d() != null) {
            int i2 = this.f31182o;
            if (i2 == 0 || i2 == 180) {
                this.f31205b.mo35588a(mo35538d().mo35600b(), mo35538d().mo35598a(), this.f31172e.getPreviewFormat());
            } else {
                this.f31205b.mo35588a(mo35538d().mo35598a(), mo35538d().mo35600b(), this.f31172e.getPreviewFormat());
            }
            this.f31172e.setPreviewSize(z2 ? mo35538d().mo35598a() : mo35538d().mo35600b(), z2 ? mo35538d().mo35600b() : mo35538d().mo35598a());
            try {
                this.f31171d.setParameters(this.f31172e);
                parameters = this.f31172e;
            } catch (Exception e) {
                m31475a(e);
                this.f31172e = parameters;
            }
            z = false;
        } else {
            z = true;
        }
        if (mo35536c() != null) {
            this.f31172e.setPictureSize(mo35536c().mo35600b(), mo35536c().mo35598a());
            try {
                this.f31171d.setParameters(this.f31172e);
            } catch (Exception e2) {
                m31475a(e2);
                this.f31172e = parameters;
            }
        } else {
            z = true;
        }
        this.f31172e.setRotation(m31490j());
        mo35537c(this.f31185r);
        try {
            mo35535b(this.f31184q);
        } catch (Exception e3) {
            m31475a(e3);
        }
        if (this.f31172e.isZoomSupported()) {
            mo35534b(this.f31191x);
        }
        this.f31171d.setParameters(this.f31172e);
        if (z && i < 100) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            m31476a(String.format("retryAdjustParam Failed, attempt #: %d", new Object[]{Integer.valueOf(i)}));
            m31487g(i + 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35535b(int i) {
        synchronized (this.f31192y) {
            if (this.f31172e != null) {
                List supportedFlashModes = this.f31172e.getSupportedFlashModes();
                String a = new C11977l(i).mo35562a();
                if (supportedFlashModes == null || !supportedFlashModes.contains(a)) {
                    String a2 = new C11977l(this.f31184q).mo35562a();
                    if (supportedFlashModes == null || !supportedFlashModes.contains(a2)) {
                        this.f31172e.setFlashMode("off");
                        this.f31184q = 0;
                    }
                } else {
                    this.f31172e.setFlashMode(a);
                    this.f31184q = i;
                }
                this.f31171d.setParameters(this.f31172e);
            } else {
                this.f31184q = i;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r8.f31176i = r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.wonderkiln.camerakit.C11991r mo35538d() {
        /*
            r8 = this;
            com.wonderkiln.camerakit.r r0 = r8.f31176i
            if (r0 != 0) goto L_0x009f
            android.hardware.Camera$Parameters r0 = r8.f31172e
            if (r0 == 0) goto L_0x009f
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            android.hardware.Camera$Parameters r1 = r8.f31172e
            java.util.List r1 = r1.getSupportedPreviewSizes()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()
            android.hardware.Camera$Size r2 = (android.hardware.Camera.Size) r2
            com.wonderkiln.camerakit.r r3 = new com.wonderkiln.camerakit.r
            int r4 = r2.width
            int r2 = r2.height
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L_0x0017
        L_0x0030:
            android.hardware.Camera$Parameters r1 = r8.f31172e
            java.util.List r1 = r1.getSupportedPreviewSizes()
            android.hardware.Camera$Parameters r2 = r8.f31172e
            java.util.List r2 = r2.getSupportedPictureSizes()
            java.util.TreeSet r1 = r8.m31472a(r1, r2)
            boolean r2 = r8.f31188u
            r3 = 0
            if (r2 == 0) goto L_0x0070
            android.hardware.Camera$Parameters r2 = r8.f31172e
            java.util.List r2 = r2.getSupportedPreviewSizes()
            android.hardware.Camera$Parameters r4 = r8.f31172e
            java.util.List r4 = r4.getSupportedPictureSizes()
            java.util.TreeSet r2 = r8.m31472a(r2, r4)
            java.util.Iterator r4 = r1.descendingIterator()
            r5 = r3
        L_0x005a:
            if (r5 != 0) goto L_0x0071
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0071
            java.lang.Object r6 = r4.next()
            com.wonderkiln.camerakit.AspectRatio r6 = (com.wonderkiln.camerakit.AspectRatio) r6
            boolean r7 = r2.contains(r6)
            if (r7 == 0) goto L_0x005a
            r5 = r6
            goto L_0x005a
        L_0x0070:
            r5 = r3
        L_0x0071:
            if (r5 != 0) goto L_0x0081
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0080
            java.lang.Object r1 = r1.last()
            r3 = r1
            com.wonderkiln.camerakit.AspectRatio r3 = (com.wonderkiln.camerakit.AspectRatio) r3
        L_0x0080:
            r5 = r3
        L_0x0081:
            java.util.Iterator r0 = r0.descendingIterator()
        L_0x0085:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x009f
            com.wonderkiln.camerakit.r r1 = r8.f31176i
            if (r1 != 0) goto L_0x009f
            java.lang.Object r1 = r0.next()
            com.wonderkiln.camerakit.r r1 = (com.wonderkiln.camerakit.C11991r) r1
            if (r5 == 0) goto L_0x009d
            boolean r2 = r5.mo35453a(r1)
            if (r2 == 0) goto L_0x0085
        L_0x009d:
            r8.f31176i = r1
        L_0x009f:
            android.hardware.Camera$CameraInfo r0 = r8.f31174g
            int r0 = r0.orientation
            int r1 = r8.f31182o
            int r0 = r0 + r1
            int r0 = r0 % 180
            r1 = 90
            if (r0 != r1) goto L_0x00ae
            r0 = 1
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            com.wonderkiln.camerakit.r r1 = r8.f31176i
            if (r1 == 0) goto L_0x00c5
            if (r0 == 0) goto L_0x00c5
            com.wonderkiln.camerakit.r r0 = new com.wonderkiln.camerakit.r
            int r1 = r1.mo35598a()
            com.wonderkiln.camerakit.r r2 = r8.f31176i
            int r2 = r2.mo35600b()
            r0.<init>(r1, r2)
            return r0
        L_0x00c5:
            com.wonderkiln.camerakit.r r0 = r8.f31176i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wonderkiln.camerakit.C11957a.mo35538d():com.wonderkiln.camerakit.r");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35529a(int r2, int r3) {
        /*
            r1 = this;
            r1.f31181n = r2
            r1.f31182o = r3
            java.lang.Object r2 = r1.f31192y
            monitor-enter(r2)
            boolean r3 = r1.mo35544g()     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x0016
            android.hardware.Camera r3 = r1.f31171d     // Catch:{ RuntimeException -> 0x0016 }
            int r0 = r1.m31491k()     // Catch:{ RuntimeException -> 0x0016 }
            r3.setDisplayOrientation(r0)     // Catch:{ RuntimeException -> 0x0016 }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wonderkiln.camerakit.C11957a.mo35529a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35528a(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f31192y
            monitor-enter(r0)
            com.wonderkiln.camerakit.k r1 = new com.wonderkiln.camerakit.k     // Catch:{ all -> 0x0041 }
            r1.<init>(r6)     // Catch:{ all -> 0x0041 }
            java.lang.Integer r1 = r1.mo35561a()     // Catch:{ all -> 0x0041 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0041 }
            r2 = -1
            if (r1 != r2) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0015:
            r2 = 0
            int r3 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ all -> 0x0041 }
        L_0x001a:
            if (r2 >= r3) goto L_0x002f
            android.hardware.Camera$CameraInfo r4 = r5.f31174g     // Catch:{ all -> 0x0041 }
            android.hardware.Camera.getCameraInfo(r2, r4)     // Catch:{ all -> 0x0041 }
            android.hardware.Camera$CameraInfo r4 = r5.f31174g     // Catch:{ all -> 0x0041 }
            int r4 = r4.facing     // Catch:{ all -> 0x0041 }
            if (r4 != r1) goto L_0x002c
            r5.f31170c = r2     // Catch:{ all -> 0x0041 }
            r5.f31183p = r6     // Catch:{ all -> 0x0041 }
            goto L_0x002f
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002f:
            int r1 = r5.f31183p     // Catch:{ all -> 0x0041 }
            if (r1 != r6) goto L_0x003f
            boolean r6 = r5.mo35544g()     // Catch:{ all -> 0x0041 }
            if (r6 == 0) goto L_0x003f
            r5.mo35542f()     // Catch:{ all -> 0x0041 }
            r5.mo35540e()     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wonderkiln.camerakit.C11957a.mo35528a(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35534b(float f) {
        synchronized (this.f31192y) {
            this.f31191x = f;
            if (f <= 1.0f) {
                this.f31191x = 1.0f;
            } else {
                this.f31191x = f;
            }
            if (this.f31172e != null && this.f31172e.isZoomSupported()) {
                this.f31172e.setZoom(m31488h((int) (this.f31191x * 100.0f)));
                this.f31171d.setParameters(this.f31172e);
                float intValue = ((float) ((Integer) this.f31172e.getZoomRatios().get(this.f31172e.getZoomRatios().size() - 1)).intValue()) / 100.0f;
                if (this.f31191x > intValue) {
                    this.f31191x = intValue;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r5.f31175h = r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.wonderkiln.camerakit.C11991r mo35536c() {
        /*
            r5 = this;
            com.wonderkiln.camerakit.r r0 = r5.f31175h
            if (r0 != 0) goto L_0x006c
            android.hardware.Camera$Parameters r0 = r5.f31172e
            if (r0 == 0) goto L_0x006c
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            android.hardware.Camera$Parameters r1 = r5.f31172e
            java.util.List r1 = r1.getSupportedPictureSizes()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()
            android.hardware.Camera$Size r2 = (android.hardware.Camera.Size) r2
            com.wonderkiln.camerakit.r r3 = new com.wonderkiln.camerakit.r
            int r4 = r2.width
            int r2 = r2.height
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L_0x0017
        L_0x0030:
            android.hardware.Camera$Parameters r1 = r5.f31172e
            java.util.List r1 = r1.getSupportedPreviewSizes()
            android.hardware.Camera$Parameters r2 = r5.f31172e
            java.util.List r2 = r2.getSupportedPictureSizes()
            java.util.TreeSet r1 = r5.m31472a(r1, r2)
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x004d
            java.lang.Object r1 = r1.last()
            com.wonderkiln.camerakit.AspectRatio r1 = (com.wonderkiln.camerakit.AspectRatio) r1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            java.util.Iterator r0 = r0.descendingIterator()
        L_0x0052:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006c
            com.wonderkiln.camerakit.r r2 = r5.f31175h
            if (r2 != 0) goto L_0x006c
            java.lang.Object r2 = r0.next()
            com.wonderkiln.camerakit.r r2 = (com.wonderkiln.camerakit.C11991r) r2
            if (r1 == 0) goto L_0x006a
            boolean r3 = r1.mo35453a(r2)
            if (r3 == 0) goto L_0x0052
        L_0x006a:
            r5.f31175h = r2
        L_0x006c:
            com.wonderkiln.camerakit.r r0 = r5.f31175h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wonderkiln.camerakit.C11957a.mo35536c():com.wonderkiln.camerakit.r");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35526a(float f) {
        synchronized (this.f31192y) {
            mo35534b(this.f31191x * f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35527a(float r6, float r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f31192y
            monitor-enter(r0)
            android.hardware.Camera r1 = r5.f31171d     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00b8
            android.hardware.Camera$Parameters r1 = r5.m31493m()     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return
        L_0x000f:
            java.lang.String r2 = r1.getFocusMode()     // Catch:{ all -> 0x00ba }
            android.graphics.Rect r6 = r5.m31479b(r6, r7)     // Catch:{ all -> 0x00ba }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            android.hardware.Camera$Area r3 = new android.hardware.Camera$Area     // Catch:{ all -> 0x00ba }
            int r4 = r5.m31495o()     // Catch:{ all -> 0x00ba }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x00ba }
            r7.add(r3)     // Catch:{ all -> 0x00ba }
            int r6 = r1.getMaxNumFocusAreas()     // Catch:{ all -> 0x00ba }
            if (r6 == 0) goto L_0x007f
            if (r2 == 0) goto L_0x007f
            java.lang.String r6 = "auto"
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "macro"
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "continuous-picture"
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "continuous-video"
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r6 == 0) goto L_0x007f
        L_0x0050:
            java.lang.String r6 = "auto"
            r1.setFocusMode(r6)     // Catch:{ all -> 0x00ba }
            r1.setFocusAreas(r7)     // Catch:{ all -> 0x00ba }
            int r6 = r1.getMaxNumMeteringAreas()     // Catch:{ all -> 0x00ba }
            if (r6 <= 0) goto L_0x0061
            r1.setMeteringAreas(r7)     // Catch:{ all -> 0x00ba }
        L_0x0061:
            java.util.List r6 = r1.getSupportedFocusModes()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "auto"
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x00ba }
            if (r6 != 0) goto L_0x006f
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return
        L_0x006f:
            android.hardware.Camera r6 = r5.f31171d     // Catch:{ all -> 0x00ba }
            r6.setParameters(r1)     // Catch:{ all -> 0x00ba }
            android.hardware.Camera r6 = r5.f31171d     // Catch:{ all -> 0x00ba }
            com.wonderkiln.camerakit.a$b r7 = new com.wonderkiln.camerakit.a$b     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r6.autoFocus(r7)     // Catch:{ all -> 0x00ba }
            goto L_0x00b8
        L_0x007f:
            int r6 = r1.getMaxNumMeteringAreas()     // Catch:{ all -> 0x00ba }
            if (r6 <= 0) goto L_0x00ae
            java.util.List r6 = r1.getSupportedFocusModes()     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "auto"
            boolean r6 = r6.contains(r2)     // Catch:{ all -> 0x00ba }
            if (r6 != 0) goto L_0x0093
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return
        L_0x0093:
            java.lang.String r6 = "auto"
            r1.setFocusMode(r6)     // Catch:{ all -> 0x00ba }
            r1.setFocusAreas(r7)     // Catch:{ all -> 0x00ba }
            r1.setMeteringAreas(r7)     // Catch:{ all -> 0x00ba }
            android.hardware.Camera r6 = r5.f31171d     // Catch:{ all -> 0x00ba }
            r6.setParameters(r1)     // Catch:{ all -> 0x00ba }
            android.hardware.Camera r6 = r5.f31171d     // Catch:{ all -> 0x00ba }
            com.wonderkiln.camerakit.a$c r7 = new com.wonderkiln.camerakit.a$c     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r6.autoFocus(r7)     // Catch:{ all -> 0x00ba }
            goto L_0x00b8
        L_0x00ae:
            android.hardware.Camera r6 = r5.f31171d     // Catch:{ all -> 0x00ba }
            com.wonderkiln.camerakit.a$d r7 = new com.wonderkiln.camerakit.a$d     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r6.autoFocus(r7)     // Catch:{ all -> 0x00ba }
        L_0x00b8:
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return
        L_0x00ba:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wonderkiln.camerakit.C11957a.mo35527a(float, float):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11974i mo35533b() {
        return this.f31173f;
    }

    /* renamed from: b */
    private Rect m31479b(float f, float f2) {
        int n = m31494n() / 2;
        int i = (int) (f * 2000.0f);
        int i2 = (int) (f2 * 2000.0f);
        int i3 = i - n;
        int i4 = i2 - n;
        int i5 = i + n;
        int i6 = i2 + n;
        int i7 = 0;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i5 > 2000) {
            i5 = 2000;
        }
        if (i4 >= 0) {
            i7 = i4;
        }
        if (i6 > 2000) {
            i6 = 2000;
        }
        return new Rect(i3 - 1000, i7 - 1000, i5 - 1000, i6 - 1000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35531a(boolean z) {
        this.f31188u = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35530a(C11967a aVar) {
        int i = this.f31186s;
        if (i == 0) {
            synchronized (this.f31192y) {
                if (this.f31179l || this.f31171d == null) {
                    Log.w(f31169z, "Unable, waiting for picture to be taken");
                } else {
                    this.f31179l = true;
                    this.f31172e.setRotation(m31490j());
                    this.f31171d.setParameters(this.f31172e);
                    this.f31171d.takePicture(null, null, null, new C11962e(aVar));
                }
            }
        } else if (i == 1) {
            synchronized (this.f31192y) {
                this.f31171d.setOneShotPreviewCallback(new C11963f(aVar));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35532a() {
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(0, cameraInfo);
        if (Camera.getNumberOfCameras() == 1 && cameraInfo.facing == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m31476a(String str) {
        C11969d dVar = new C11969d();
        dVar.mo35555a(str);
        this.f31204a.mo35568a((C11970e) dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31475a(Exception exc) {
        this.f31204a.mo35568a((C11970e) new C11969d(exc));
    }

    /* renamed from: a */
    private TreeSet<AspectRatio> m31472a(List<Size> list, List<Size> list2) {
        HashSet<AspectRatio> hashSet = new HashSet<>();
        for (Size size : list) {
            AspectRatio b = AspectRatio.m31428b(C11968c.f31207b, C11968c.f31206a);
            AspectRatio b2 = AspectRatio.m31428b(size.width, size.height);
            if (b.equals(b2)) {
                hashSet.add(b2);
            }
        }
        HashSet<AspectRatio> hashSet2 = new HashSet<>();
        for (Size size2 : list2) {
            hashSet2.add(AspectRatio.m31428b(size2.width, size2.height));
        }
        TreeSet<AspectRatio> treeSet = new TreeSet<>();
        if (hashSet.size() == 0) {
            Size size3 = (Size) list.get(0);
            AspectRatio b3 = AspectRatio.m31428b(size3.width, size3.height);
            for (AspectRatio aspectRatio : hashSet2) {
                if (aspectRatio.equals(b3)) {
                    treeSet.add(aspectRatio);
                }
            }
        } else {
            for (AspectRatio aspectRatio2 : hashSet) {
                if (hashSet2.contains(aspectRatio2)) {
                    treeSet.add(aspectRatio2);
                }
            }
        }
        return treeSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31477a(boolean z, Camera camera) {
        this.f31189v.removeCallbacksAndMessages(null);
        this.f31189v.postDelayed(new C11965h(z), 3000);
    }
}
