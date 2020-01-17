package com.bumptech.glide;

import com.bumptech.glide.C8871k;
import com.bumptech.glide.request.transition.C9241a;
import com.bumptech.glide.request.transition.TransitionFactory;

/* renamed from: com.bumptech.glide.k */
public abstract class C8871k<CHILD extends C8871k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: e */
    private TransitionFactory<? super TranscodeType> f23126e = C9241a.m22253a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final TransitionFactory<? super TranscodeType> mo24196a() {
        return this.f23126e;
    }

    public final CHILD clone() {
        try {
            return (C8871k) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
