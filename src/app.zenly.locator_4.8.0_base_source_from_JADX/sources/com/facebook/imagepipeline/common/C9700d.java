package com.facebook.imagepipeline.common;

/* renamed from: com.facebook.imagepipeline.common.d */
public enum C9700d {
    LOW,
    MEDIUM,
    HIGH;

    /* renamed from: a */
    public static C9700d m23853a(C9700d dVar, C9700d dVar2) {
        if (dVar == null) {
            return dVar2;
        }
        return (dVar2 != null && dVar.ordinal() <= dVar2.ordinal()) ? dVar2 : dVar;
    }
}
