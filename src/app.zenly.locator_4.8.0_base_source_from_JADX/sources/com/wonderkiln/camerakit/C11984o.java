package com.wonderkiln.camerakit;

import android.annotation.SuppressLint;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.vision.Detector;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.wonderkiln.camerakit.o */
public class C11984o implements Runnable {

    /* renamed from: p */
    private static final String f31229p = C11984o.class.getSimpleName();

    /* renamed from: e */
    private Detector<?> f31230e;

    /* renamed from: f */
    private long f31231f = SystemClock.elapsedRealtime();

    /* renamed from: g */
    private final Object f31232g = new Object();

    /* renamed from: h */
    private boolean f31233h = true;

    /* renamed from: i */
    private long f31234i;

    /* renamed from: j */
    private int f31235j = 0;

    /* renamed from: k */
    private ByteBuffer f31236k;

    /* renamed from: l */
    private Thread f31237l;

    /* renamed from: m */
    private Map<byte[], ByteBuffer> f31238m = new HashMap();

    /* renamed from: n */
    private C11991r f31239n;

    /* renamed from: o */
    private Camera f31240o;

    /* renamed from: com.wonderkiln.camerakit.o$a */
    class C11985a implements PreviewCallback {
        C11985a() {
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C11984o.this.m31564a(bArr, camera);
        }
    }

    static {
        Class<C11984o> cls = C11984o.class;
    }

    public C11984o(Detector<?> detector, C11991r rVar, Camera camera) {
        this.f31230e = detector;
        this.f31239n = rVar;
        this.f31240o = camera;
        this.f31237l = new Thread(this);
    }

    @SuppressLint({"Assert"})
    /* renamed from: b */
    public void mo35574b() {
        this.f31230e.release();
    }

    /* renamed from: c */
    public void mo35575c() {
        this.f31237l = new Thread(this);
        m31563a(true);
        this.f31237l.start();
        this.f31240o.setPreviewCallbackWithBuffer(new C11985a());
        this.f31240o.addCallbackBuffer(m31566a(this.f31239n));
        this.f31240o.addCallbackBuffer(m31566a(this.f31239n));
        this.f31240o.addCallbackBuffer(m31566a(this.f31239n));
        this.f31240o.addCallbackBuffer(m31566a(this.f31239n));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|3|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.f31230e.receiveFrame(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        android.util.Log.e(f31229p, "Exception thrown from receiver.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r6.f31240o.addCallbackBuffer(r2.array());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6.f31232g
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f31233h     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0013
            java.nio.ByteBuffer r1 = r6.f31236k     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f31232g     // Catch:{ InterruptedException -> 0x0011 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0003
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0013:
            boolean r1 = r6.f31233h     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0019:
            com.wonderkiln.camerakit.r r1 = r6.f31239n     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = "WHAT"
            java.lang.String r2 = "waitin for preview size to not be null"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x0000
        L_0x0026:
            com.google.android.gms.vision.Frame$Builder r1 = new com.google.android.gms.vision.Frame$Builder     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r2 = r6.f31236k     // Catch:{ all -> 0x0086 }
            com.wonderkiln.camerakit.r r3 = r6.f31239n     // Catch:{ all -> 0x0086 }
            int r3 = r3.mo35600b()     // Catch:{ all -> 0x0086 }
            com.wonderkiln.camerakit.r r4 = r6.f31239n     // Catch:{ all -> 0x0086 }
            int r4 = r4.mo35598a()     // Catch:{ all -> 0x0086 }
            r5 = 17
            com.google.android.gms.vision.Frame$Builder r1 = r1.setImageData(r2, r3, r4, r5)     // Catch:{ all -> 0x0086 }
            int r2 = r6.f31235j     // Catch:{ all -> 0x0086 }
            com.google.android.gms.vision.Frame$Builder r1 = r1.setId(r2)     // Catch:{ all -> 0x0086 }
            long r2 = r6.f31234i     // Catch:{ all -> 0x0086 }
            com.google.android.gms.vision.Frame$Builder r1 = r1.setTimestampMillis(r2)     // Catch:{ all -> 0x0086 }
            r2 = 0
            com.google.android.gms.vision.Frame$Builder r1 = r1.setRotation(r2)     // Catch:{ all -> 0x0086 }
            com.google.android.gms.vision.Frame r1 = r1.build()     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r2 = r6.f31236k     // Catch:{ all -> 0x0086 }
            r3 = 0
            r6.f31236k = r3     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            com.google.android.gms.vision.Detector<?> r0 = r6.f31230e     // Catch:{ all -> 0x0069 }
            r0.receiveFrame(r1)     // Catch:{ all -> 0x0069 }
            android.hardware.Camera r0 = r6.f31240o
            byte[] r1 = r2.array()
            r0.addCallbackBuffer(r1)
            goto L_0x0000
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = f31229p     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "Exception thrown from receiver."
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x007b }
            android.hardware.Camera r0 = r6.f31240o
            byte[] r1 = r2.array()
            r0.addCallbackBuffer(r1)
            goto L_0x0000
        L_0x007b:
            r0 = move-exception
            android.hardware.Camera r1 = r6.f31240o
            byte[] r2 = r2.array()
            r1.addCallbackBuffer(r2)
            throw r0
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wonderkiln.camerakit.C11984o.run():void");
    }

    /* renamed from: a */
    public void mo35573a() {
        Thread thread = this.f31237l;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException unused) {
                Log.d(f31229p, "Frame processing thread interrupted on release.");
            }
            this.f31237l = null;
        }
        m31563a(false);
        this.f31238m.clear();
    }

    /* renamed from: a */
    private void m31563a(boolean z) {
        synchronized (this.f31232g) {
            this.f31233h = z;
            this.f31232g.notifyAll();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31564a(byte[] bArr, Camera camera) {
        synchronized (this.f31232g) {
            if (this.f31236k != null) {
                camera.addCallbackBuffer(this.f31236k.array());
                this.f31236k = null;
            }
            if (!this.f31238m.containsKey(bArr)) {
                Log.d(f31229p, "Skipping frame.  Could not find ByteBuffer associated with the image data from the camera.");
                return;
            }
            this.f31234i = SystemClock.elapsedRealtime() - this.f31231f;
            this.f31235j++;
            this.f31236k = (ByteBuffer) this.f31238m.get(bArr);
            this.f31232g.notifyAll();
        }
    }

    /* renamed from: a */
    private void m31565a(byte[] bArr, ByteBuffer byteBuffer) {
        this.f31238m.put(bArr, byteBuffer);
    }

    /* renamed from: a */
    private byte[] m31566a(C11991r rVar) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) ((long) ((rVar.mo35598a() * rVar.mo35600b()) * ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        m31565a(bArr, wrap);
        return bArr;
    }
}
