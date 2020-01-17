package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;

/* renamed from: com.facebook.drawee.controller.c */
public class C9596c<INFO> implements ControllerListener<INFO> {

    /* renamed from: a */
    private static final ControllerListener<Object> f24933a = new C9596c();

    /* renamed from: a */
    public static <INFO> ControllerListener<INFO> m23565a() {
        return f24933a;
    }

    public void onFailure(String str, Throwable th) {
    }

    public void onFinalImageSet(String str, INFO info, Animatable animatable) {
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    public void onIntermediateImageSet(String str, INFO info) {
    }

    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }
}
