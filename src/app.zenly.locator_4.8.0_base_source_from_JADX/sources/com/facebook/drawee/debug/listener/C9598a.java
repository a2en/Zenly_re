package com.facebook.drawee.debug.listener;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.C9596c;

/* renamed from: com.facebook.drawee.debug.listener.a */
public class C9598a extends C9596c {

    /* renamed from: b */
    private long f24935b = -1;

    /* renamed from: c */
    private long f24936c = -1;

    /* renamed from: d */
    private ImageLoadingTimeListener f24937d;

    public C9598a(ImageLoadingTimeListener imageLoadingTimeListener) {
        this.f24937d = imageLoadingTimeListener;
    }

    public void onFinalImageSet(String str, Object obj, Animatable animatable) {
        this.f24936c = System.currentTimeMillis();
        ImageLoadingTimeListener imageLoadingTimeListener = this.f24937d;
        if (imageLoadingTimeListener != null) {
            imageLoadingTimeListener.onFinalImageSet(this.f24936c - this.f24935b);
        }
    }

    public void onSubmit(String str, Object obj) {
        this.f24935b = System.currentTimeMillis();
    }
}
