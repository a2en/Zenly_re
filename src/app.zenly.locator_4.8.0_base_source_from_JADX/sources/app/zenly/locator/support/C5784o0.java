package app.zenly.locator.support;

import zendesk.support.RequestStatus;

/* renamed from: app.zenly.locator.support.o0 */
public final /* synthetic */ class C5784o0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f14655a = new int[RequestStatus.values().length];

    static {
        f14655a[RequestStatus.New.ordinal()] = 1;
        f14655a[RequestStatus.Open.ordinal()] = 2;
        f14655a[RequestStatus.Pending.ordinal()] = 3;
        f14655a[RequestStatus.Hold.ordinal()] = 4;
        f14655a[RequestStatus.Solved.ordinal()] = 5;
        f14655a[RequestStatus.Closed.ordinal()] = 6;
    }
}
