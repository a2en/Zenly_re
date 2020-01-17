package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;

class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    /* renamed from: e */
    private final GeneratedAdapter f3435e;

    SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.f3435e = generatedAdapter;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        this.f3435e.callMethods(lifecycleOwner, aVar, false, null);
        this.f3435e.callMethods(lifecycleOwner, aVar, true, null);
    }
}
