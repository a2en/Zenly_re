package com.facebook.fresco.animation.frame;

import com.facebook.fresco.animation.backend.AnimationInformation;

/* renamed from: com.facebook.fresco.animation.frame.a */
public class C9648a implements FrameScheduler {

    /* renamed from: a */
    private final AnimationInformation f25180a;

    /* renamed from: b */
    private long f25181b = -1;

    public C9648a(AnimationInformation animationInformation) {
        this.f25180a = animationInformation;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo26149a(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += (long) this.f25180a.getFrameDurationMs(i);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    public int getFrameNumberToRender(long j, long j2) {
        if (isInfiniteAnimation() || j / getLoopDurationMs() < ((long) this.f25180a.getLoopCount())) {
            return mo26149a(j % getLoopDurationMs());
        }
        return -1;
    }

    public long getLoopDurationMs() {
        long j = this.f25181b;
        if (j != -1) {
            return j;
        }
        this.f25181b = 0;
        int frameCount = this.f25180a.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.f25181b += (long) this.f25180a.getFrameDurationMs(i);
        }
        return this.f25181b;
    }

    public long getTargetRenderTimeForNextFrameMs(long j) {
        long loopDurationMs = getLoopDurationMs();
        long j2 = 0;
        if (loopDurationMs == 0) {
            return -1;
        }
        if (!isInfiniteAnimation() && j / getLoopDurationMs() >= ((long) this.f25180a.getLoopCount())) {
            return -1;
        }
        long j3 = j % loopDurationMs;
        int frameCount = this.f25180a.getFrameCount();
        for (int i = 0; i < frameCount && j2 <= j3; i++) {
            j2 += (long) this.f25180a.getFrameDurationMs(i);
        }
        return j + (j2 - j3);
    }

    public long getTargetRenderTimeMs(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (long) this.f25180a.getFrameDurationMs(i);
        }
        return j;
    }

    public boolean isInfiniteAnimation() {
        return this.f25180a.getLoopCount() == 0;
    }
}
