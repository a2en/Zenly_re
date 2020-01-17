package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.request.transition.Transition.ViewAdapter;

/* renamed from: com.bumptech.glide.request.transition.a */
public class C9241a<R> implements Transition<R> {

    /* renamed from: a */
    static final C9241a<?> f24017a = new C9241a<>();

    /* renamed from: b */
    private static final TransitionFactory<?> f24018b = new C9242a();

    /* renamed from: com.bumptech.glide.request.transition.a$a */
    public static class C9242a<R> implements TransitionFactory<R> {
        public Transition<R> build(C8882a aVar, boolean z) {
            return C9241a.f24017a;
        }
    }

    /* renamed from: a */
    public static <R> TransitionFactory<R> m22253a() {
        return f24018b;
    }

    public boolean transition(Object obj, ViewAdapter viewAdapter) {
        return false;
    }
}
