package p389io.fabric.sdk.android.services.concurrency;

/* renamed from: io.fabric.sdk.android.services.concurrency.d */
public enum C12215d {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    /* renamed from: a */
    static <Y> int m32354a(PriorityProvider priorityProvider, Y y) {
        C12215d dVar;
        if (y instanceof PriorityProvider) {
            dVar = ((PriorityProvider) y).getPriority();
        } else {
            dVar = NORMAL;
        }
        return dVar.ordinal() - priorityProvider.getPriority().ordinal();
    }
}
