package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;

class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* renamed from: e */
    private final GeneratedAdapter[] f3401e;

    CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.f3401e = generatedAdapterArr;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        C0873m mVar = new C0873m();
        for (GeneratedAdapter callMethods : this.f3401e) {
            callMethods.callMethods(lifecycleOwner, aVar, false, mVar);
        }
        for (GeneratedAdapter callMethods2 : this.f3401e) {
            callMethods2.callMethods(lifecycleOwner, aVar, true, mVar);
        }
    }
}
