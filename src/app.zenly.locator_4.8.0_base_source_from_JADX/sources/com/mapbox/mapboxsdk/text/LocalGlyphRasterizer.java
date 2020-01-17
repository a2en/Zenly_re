package com.mapbox.mapboxsdk.text;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import androidx.annotation.Keep;

public class LocalGlyphRasterizer {

    /* renamed from: a */
    private final Bitmap f30094a = Bitmap.createBitmap(35, 35, Config.ARGB_8888);

    /* renamed from: b */
    private final Paint f30095b = new Paint();

    /* renamed from: c */
    private final Canvas f30096c;

    LocalGlyphRasterizer() {
        this.f30095b.setAntiAlias(true);
        this.f30095b.setTextSize(24.0f);
        this.f30096c = new Canvas();
        this.f30096c.setBitmap(this.f30094a);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Bitmap drawGlyphBitmap(String str, boolean z, char c) {
        this.f30095b.setTypeface(Typeface.create(str, z ? 1 : 0));
        this.f30096c.drawColor(0, Mode.CLEAR);
        this.f30096c.drawText(String.valueOf(c), 0.0f, 20.0f, this.f30095b);
        return this.f30094a;
    }
}
