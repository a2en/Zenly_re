package com.mapbox.mapboxsdk.maps.renderer.egl;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.os.Build;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.p317m.C11493a;
import com.mapbox.mapboxsdk.utils.C11596c;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.mapbox.mapboxsdk.maps.renderer.egl.a */
public class C11562a implements EGLConfigChooser {

    /* renamed from: a */
    private boolean f29970a;

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.egl.a$a */
    class C11563a implements Comparable<C11563a> {

        /* renamed from: e */
        private final C11564b f29971e;

        /* renamed from: f */
        private final C11565c f29972f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final boolean f29973g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final boolean f29974h;

        /* renamed from: i */
        private final int f29975i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final EGLConfig f29976j;

        public C11563a(C11562a aVar, C11564b bVar, C11565c cVar, boolean z, boolean z2, int i, EGLConfig eGLConfig) {
            this.f29971e = bVar;
            this.f29972f = cVar;
            this.f29973g = z;
            this.f29974h = z2;
            this.f29975i = i;
            this.f29976j = eGLConfig;
        }

        /* renamed from: a */
        public int compareTo(C11563a aVar) {
            int a = C11596c.m30380a(this.f29971e.f29983e, aVar.f29971e.f29983e);
            if (a != 0) {
                return a;
            }
            int a2 = C11596c.m30380a(this.f29972f.f29987e, aVar.f29972f.f29987e);
            if (a2 != 0) {
                return a2;
            }
            int a3 = C11596c.m30381a(this.f29973g, aVar.f29973g);
            if (a3 != 0) {
                return a3;
            }
            int a4 = C11596c.m30381a(this.f29974h, aVar.f29974h);
            if (a4 != 0) {
                return a4;
            }
            int a5 = C11596c.m30380a(this.f29975i, aVar.f29975i);
            if (a5 != 0) {
                return a5;
            }
            return 0;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.egl.a$b */
    enum C11564b {
        Format16Bit(3),
        Format32BitNoAlpha(1),
        Format32BitAlpha(2),
        Format24Bit(0),
        Unknown(4);
        

        /* renamed from: e */
        int f29983e;

        private C11564b(int i) {
            this.f29983e = i;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.egl.a$c */
    enum C11565c {
        Format16Depth8Stencil(1),
        Format24Depth8Stencil(0);
        

        /* renamed from: e */
        int f29987e;

        private C11565c(int i) {
            this.f29987e = i;
        }
    }

    public C11562a() {
        this(false);
    }

    /* renamed from: a */
    private int[] m30176a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        int[] iArr2 = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
            return iArr2;
        }
        Logger.m29680e("Mbgl-EGLConfigChooser", String.format(C11493a.f29721a, "eglChooseConfig(NULL) returned error %d", new Object[]{Integer.valueOf(egl10.eglGetError())}));
        throw new EGLConfigException("eglChooseConfig() failed");
    }

    /* renamed from: b */
    private boolean m30178b() {
        String str = "generic";
        if (!Build.FINGERPRINT.startsWith(str) && !Build.FINGERPRINT.startsWith("unknown")) {
            String str2 = "google_sdk";
            if (!Build.MODEL.contains(str2) && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && ((!Build.BRAND.startsWith(str) || !Build.DEVICE.startsWith(str)) && !str2.equals(Build.PRODUCT) && System.getProperty("ro.kernel.qemu") == null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private boolean m30179c() {
        return Build.MANUFACTURER.contains("Genymotion");
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] a = m30175a();
        int[] a2 = m30176a(egl10, eGLDisplay, a);
        String str = "Mbgl-EGLConfigChooser";
        if (a2[0] >= 1) {
            EGLConfig a3 = m30174a(egl10, eGLDisplay, m30177a(egl10, eGLDisplay, a, a2));
            if (a3 != null) {
                return a3;
            }
            String str2 = "No config chosen";
            Logger.m29680e(str, str2);
            throw new EGLConfigException(str2);
        }
        Logger.m29680e(str, "eglChooseConfig() returned no configs.");
        throw new EGLConfigException("eglChooseConfig() failed");
    }

    public C11562a(boolean z) {
        this.f29970a = z;
    }

    /* renamed from: a */
    private EGLConfig[] m30177a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, iArr2[0], iArr2)) {
            return eGLConfigArr;
        }
        Logger.m29680e("Mbgl-EGLConfigChooser", String.format(C11493a.f29721a, "eglChooseConfig() returned error %d", new Object[]{Integer.valueOf(egl10.eglGetError())}));
        throw new EGLConfigException("eglChooseConfig() failed");
    }

    /* renamed from: a */
    private EGLConfig m30174a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        C11564b bVar;
        C11565c cVar;
        C11562a aVar = this;
        EGL10 egl102 = egl10;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
        ArrayList arrayList = new ArrayList();
        int length = eGLConfigArr2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            EGLConfig eGLConfig = eGLConfigArr2[i2];
            int i3 = i + 1;
            int a = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12327);
            int a2 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12354);
            int a3 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12320);
            int a4 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12324);
            int a5 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12323);
            int a6 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12322);
            int a7 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12321);
            aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12350);
            int a8 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12325);
            int a9 = aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12326);
            int i4 = length;
            int i5 = i2;
            if (((a8 == 24 || a8 == 16) & (a9 == 8) & (aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12338) == 0)) && (aVar.m30173a(egl102, eGLDisplay2, eGLConfig, 12337) == 0)) {
                if (a3 == 16 && a4 == 5 && a5 == 6 && a6 == 5 && a7 == 0) {
                    bVar = C11564b.Format16Bit;
                } else if (a3 == 32 && a4 == 8 && a5 == 8 && a6 == 8 && a7 == 0) {
                    bVar = C11564b.Format32BitNoAlpha;
                } else if (a3 == 32 && a4 == 8 && a5 == 8 && a6 == 8 && a7 == 8) {
                    bVar = C11564b.Format32BitAlpha;
                } else if (a3 == 24 && a4 == 8 && a5 == 8 && a6 == 8 && a7 == 0) {
                    bVar = C11564b.Format24Bit;
                } else {
                    bVar = C11564b.Unknown;
                }
                C11564b bVar2 = bVar;
                if (a8 == 16 && a9 == 8) {
                    cVar = C11565c.Format16Depth8Stencil;
                } else {
                    cVar = C11565c.Format24Depth8Stencil;
                }
                C11565c cVar2 = cVar;
                boolean z = (a2 & 4) != 4;
                boolean z2 = a != 12344;
                if (bVar2 != C11564b.Unknown) {
                    C11563a aVar2 = new C11563a(this, bVar2, cVar2, z, z2, i3, eGLConfig);
                    arrayList.add(aVar2);
                }
            }
            i2 = i5 + 1;
            aVar = this;
            egl102 = egl10;
            eGLConfigArr2 = eGLConfigArr;
            i = i3;
            length = i4;
        }
        Collections.sort(arrayList);
        if (arrayList.size() != 0) {
            C11563a aVar3 = (C11563a) arrayList.get(0);
            String str = "Mbgl-EGLConfigChooser";
            if (aVar3.f29974h) {
                Logger.m29686w(str, "Chosen config has a caveat.");
            }
            if (aVar3.f29973g) {
                Logger.m29686w(str, "Chosen config is not conformant.");
            }
            return aVar3.f29976j;
        }
        throw new EGLConfigException("No matching configurations after filtering");
    }

    /* renamed from: a */
    private int m30173a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        Logger.m29680e("Mbgl-EGLConfigChooser", String.format(C11493a.f29721a, "eglGetConfigAttrib(%d) returned error %d", new Object[]{Integer.valueOf(i), Integer.valueOf(egl10.eglGetError())}));
        throw new EGLConfigException("eglGetConfigAttrib() failed");
    }

    /* renamed from: a */
    private int[] m30175a() {
        int i = 0;
        boolean z = m30178b() || m30179c();
        Logger.m29682i("Mbgl-EGLConfigChooser", String.format("In emulator: %s", new Object[]{Boolean.valueOf(z)}));
        int[] iArr = new int[25];
        iArr[0] = 12327;
        iArr[1] = 12344;
        iArr[2] = 12339;
        iArr[3] = 4;
        iArr[4] = 12320;
        iArr[5] = 16;
        iArr[6] = 12324;
        iArr[7] = 5;
        iArr[8] = 12323;
        iArr[9] = 6;
        iArr[10] = 12322;
        iArr[11] = 5;
        iArr[12] = 12321;
        if (this.f29970a) {
            i = 8;
        }
        iArr[13] = i;
        iArr[14] = 12325;
        iArr[15] = 16;
        iArr[16] = 12326;
        iArr[17] = 8;
        iArr[18] = z ? 12344 : 12354;
        iArr[19] = 4;
        iArr[20] = z ? 12344 : 12351;
        iArr[21] = 12430;
        iArr[22] = 12352;
        iArr[23] = 4;
        iArr[24] = 12344;
        return iArr;
    }
}
