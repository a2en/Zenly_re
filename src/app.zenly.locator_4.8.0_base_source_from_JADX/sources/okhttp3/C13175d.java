package okhttp3;

import okhttp3.EventListener.Factory;

/* renamed from: okhttp3.d */
/* compiled from: lambda */
public final /* synthetic */ class C13175d implements Factory {

    /* renamed from: a */
    private final /* synthetic */ EventListener f33831a;

    public /* synthetic */ C13175d(EventListener eventListener) {
        this.f33831a = eventListener;
    }

    public final EventListener create(Call call) {
        EventListener eventListener = this.f33831a;
        EventListener.m34374a(eventListener, call);
        return eventListener;
    }
}
