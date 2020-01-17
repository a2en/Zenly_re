package com.airbnb.lottie;

import androidx.core.util.C0603e;
import com.airbnb.lottie.p289q.C8656f;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p214e.p228e.C7573b;

public class PerformanceTracker {

    /* renamed from: a */
    private boolean f21569a = false;

    /* renamed from: b */
    private final Set<FrameListener> f21570b = new C7573b();

    /* renamed from: c */
    private final Map<String, C8656f> f21571c = new HashMap();

    public interface FrameListener {
        void onFrameRendered(float f);
    }

    /* renamed from: com.airbnb.lottie.PerformanceTracker$a */
    class C8468a implements Comparator<C0603e<String, Float>> {
        C8468a(PerformanceTracker performanceTracker) {
        }

        /* renamed from: a */
        public int compare(C0603e<String, Float> eVar, C0603e<String, Float> eVar2) {
            float floatValue = ((Float) eVar.f2730b).floatValue();
            float floatValue2 = ((Float) eVar2.f2730b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public PerformanceTracker() {
        new C8468a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22869a(boolean z) {
        this.f21569a = z;
    }

    /* renamed from: a */
    public void mo22868a(String str, float f) {
        if (this.f21569a) {
            C8656f fVar = (C8656f) this.f21571c.get(str);
            if (fVar == null) {
                fVar = new C8656f();
                this.f21571c.put(str, fVar);
            }
            fVar.mo23286a(f);
            if (str.equals("__container")) {
                for (FrameListener onFrameRendered : this.f21570b) {
                    onFrameRendered.onFrameRendered(f);
                }
            }
        }
    }
}
