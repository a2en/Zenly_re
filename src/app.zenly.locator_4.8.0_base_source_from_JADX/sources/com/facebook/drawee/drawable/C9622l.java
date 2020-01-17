package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

/* renamed from: com.facebook.drawee.drawable.l */
public class C9622l extends C9621k {
    public C9622l(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public void draw(Canvas canvas) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("RoundedNinePatchDrawable#draw");
        }
        if (!mo26002a()) {
            super.draw(canvas);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            return;
        }
        mo26015c();
        mo26014b();
        canvas.clipPath(this.f25041i);
        super.draw(canvas);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }
}
