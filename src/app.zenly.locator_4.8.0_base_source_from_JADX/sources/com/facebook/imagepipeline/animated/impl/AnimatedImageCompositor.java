package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.C9653a;
import com.facebook.imagepipeline.animated.base.C9653a.C9654a;
import com.facebook.imagepipeline.animated.base.C9653a.C9655b;

public class AnimatedImageCompositor {

    /* renamed from: a */
    private final AnimatedDrawableBackend f25240a;

    /* renamed from: b */
    private final Callback f25241b;

    /* renamed from: c */
    private final Paint f25242c = new Paint();

    public interface Callback {
        CloseableReference<Bitmap> getCachedBitmap(int i);

        void onIntermediateResult(int i, Bitmap bitmap);
    }

    /* renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a */
    static /* synthetic */ class C9662a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25243a = new int[C9663b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b[] r0 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.C9663b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25243a = r0
                int[] r0 = f25243a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.C9663b.REQUIRED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25243a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.C9663b.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25243a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.C9663b.ABORT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f25243a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.C9663b.SKIP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.C9662a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b */
    private enum C9663b {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public AnimatedImageCompositor(AnimatedDrawableBackend animatedDrawableBackend, Callback callback) {
        this.f25240a = animatedDrawableBackend;
        this.f25241b = callback;
        this.f25242c.setColor(0);
        this.f25242c.setStyle(Style.FILL);
        this.f25242c.setXfermode(new PorterDuffXfermode(Mode.SRC));
    }

    /* renamed from: b */
    private boolean m23755b(int i) {
        boolean z = true;
        if (i == 0) {
            return true;
        }
        C9653a frameInfo = this.f25240a.getFrameInfo(i);
        C9653a frameInfo2 = this.f25240a.getFrameInfo(i - 1);
        if (frameInfo.f25216e == C9654a.NO_BLEND && m23754a(frameInfo)) {
            return true;
        }
        if (frameInfo2.f25217f != C9655b.DISPOSE_TO_BACKGROUND || !m23754a(frameInfo2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo26189a(int i, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, Mode.SRC);
        for (int a = !m23755b(i) ? m23751a(i - 1, canvas) : i; a < i; a++) {
            C9653a frameInfo = this.f25240a.getFrameInfo(a);
            C9655b bVar = frameInfo.f25217f;
            if (bVar != C9655b.DISPOSE_TO_PREVIOUS) {
                if (frameInfo.f25216e == C9654a.NO_BLEND) {
                    m23753a(canvas, frameInfo);
                }
                this.f25240a.renderFrame(a, canvas);
                this.f25241b.onIntermediateResult(a, bitmap);
                if (bVar == C9655b.DISPOSE_TO_BACKGROUND) {
                    m23753a(canvas, frameInfo);
                }
            }
        }
        C9653a frameInfo2 = this.f25240a.getFrameInfo(i);
        if (frameInfo2.f25216e == C9654a.NO_BLEND) {
            m23753a(canvas, frameInfo2);
        }
        this.f25240a.renderFrame(i, canvas);
    }

    /* renamed from: a */
    private int m23751a(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = C9662a.f25243a[m23752a(i).ordinal()];
            if (i2 == 1) {
                C9653a frameInfo = this.f25240a.getFrameInfo(i);
                CloseableReference cachedBitmap = this.f25241b.getCachedBitmap(i);
                if (cachedBitmap != null) {
                    try {
                        canvas.drawBitmap((Bitmap) cachedBitmap.mo25724b(), 0.0f, 0.0f, null);
                        if (frameInfo.f25217f == C9655b.DISPOSE_TO_BACKGROUND) {
                            m23753a(canvas, frameInfo);
                        }
                        return i + 1;
                    } finally {
                        cachedBitmap.close();
                    }
                } else if (m23755b(i)) {
                    return i;
                }
            } else if (i2 == 2) {
                return i + 1;
            } else {
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    /* renamed from: a */
    private void m23753a(Canvas canvas, C9653a aVar) {
        int i = aVar.f25212a;
        float f = (float) i;
        int i2 = aVar.f25213b;
        canvas.drawRect(f, (float) i2, (float) (i + aVar.f25214c), (float) (i2 + aVar.f25215d), this.f25242c);
    }

    /* renamed from: a */
    private C9663b m23752a(int i) {
        C9653a frameInfo = this.f25240a.getFrameInfo(i);
        C9655b bVar = frameInfo.f25217f;
        if (bVar == C9655b.DISPOSE_DO_NOT) {
            return C9663b.REQUIRED;
        }
        if (bVar == C9655b.DISPOSE_TO_BACKGROUND) {
            if (m23754a(frameInfo)) {
                return C9663b.NOT_REQUIRED;
            }
            return C9663b.REQUIRED;
        } else if (bVar == C9655b.DISPOSE_TO_PREVIOUS) {
            return C9663b.SKIP;
        } else {
            return C9663b.ABORT;
        }
    }

    /* renamed from: a */
    private boolean m23754a(C9653a aVar) {
        return aVar.f25212a == 0 && aVar.f25213b == 0 && aVar.f25214c == this.f25240a.getRenderedWidth() && aVar.f25215d == this.f25240a.getRenderedHeight();
    }
}
