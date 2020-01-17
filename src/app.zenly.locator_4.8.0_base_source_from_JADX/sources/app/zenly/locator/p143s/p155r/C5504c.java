package app.zenly.locator.p143s.p155r;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.ArrayList;

/* renamed from: app.zenly.locator.s.r.c */
public final class C5504c {

    /* renamed from: a */
    private static final C5508d f14140a;

    @TargetApi(26)
    /* renamed from: app.zenly.locator.s.r.c$b */
    private static final class C5506b implements C5508d {
        private C5506b() {
        }

        /* renamed from: a */
        public boolean mo13136a(Vibrator vibrator) {
            return vibrator.hasAmplitudeControl();
        }

        /* renamed from: a */
        public void mo13135a(Vibrator vibrator, long[] jArr, int[] iArr, int i) {
            vibrator.vibrate(VibrationEffect.createWaveform(jArr, iArr, i));
        }
    }

    /* renamed from: app.zenly.locator.s.r.c$c */
    private static final class C5507c implements C5508d {
        private C5507c() {
        }

        /* renamed from: a */
        public void mo13135a(Vibrator vibrator, long[] jArr, int[] iArr, int i) {
            ArrayList arrayList = new ArrayList();
            if (iArr[0] != 0) {
                arrayList.add(Long.valueOf(0));
            }
            int i2 = 0;
            boolean z = false;
            while (i2 < jArr.length && i2 < iArr.length) {
                long j = jArr[i2];
                boolean z2 = iArr[i2] != 0;
                if (z2 != z || arrayList.isEmpty()) {
                    arrayList.add(Long.valueOf(j));
                    z = z2;
                } else {
                    arrayList.add(Long.valueOf(((Long) arrayList.remove(arrayList.size() - 1)).longValue() + j));
                }
                i2++;
            }
            long[] jArr2 = new long[arrayList.size()];
            for (int i3 = 0; i3 < jArr2.length; i3++) {
                jArr2[i3] = ((Long) arrayList.get(i3)).longValue();
            }
            vibrator.vibrate(jArr2, i);
        }

        /* renamed from: a */
        public boolean mo13136a(Vibrator vibrator) {
            return false;
        }
    }

    /* renamed from: app.zenly.locator.s.r.c$d */
    private interface C5508d {
        /* renamed from: a */
        void mo13135a(Vibrator vibrator, long[] jArr, int[] iArr, int i);

        /* renamed from: a */
        boolean mo13136a(Vibrator vibrator);
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f14140a = new C5506b();
        } else {
            f14140a = new C5507c();
        }
    }

    /* renamed from: a */
    public static boolean m15617a(Vibrator vibrator) {
        return f14140a.mo13136a(vibrator);
    }

    /* renamed from: a */
    public static void m15616a(Vibrator vibrator, long[] jArr, int[] iArr, int i) {
        f14140a.mo13135a(vibrator, jArr, iArr, i);
    }
}
