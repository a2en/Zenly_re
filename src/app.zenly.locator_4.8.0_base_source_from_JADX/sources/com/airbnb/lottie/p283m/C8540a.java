package com.airbnb.lottie.p283m;

import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: com.airbnb.lottie.m.a */
public class C8540a extends Paint {
    public C8540a() {
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public C8540a(int i) {
        super(i);
    }

    public C8540a(Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C8540a(int i, Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
