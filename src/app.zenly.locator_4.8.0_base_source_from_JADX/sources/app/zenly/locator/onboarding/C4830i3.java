package app.zenly.locator.onboarding;

import p213co.znly.models.C6952b1.C6954b;
import p213co.znly.models.C6952b1.C6956c;
import p213co.znly.models.services.C8275s4.C8277b;

/* renamed from: app.zenly.locator.onboarding.i3 */
public final /* synthetic */ class C4830i3 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f12770a = new int[C6954b.values().length];

    /* renamed from: b */
    public static final /* synthetic */ int[] f12771b = new int[C6956c.values().length];

    /* renamed from: c */
    public static final /* synthetic */ int[] f12772c = new int[C8277b.values().length];

    static {
        f12770a[C6954b.REASON_AGE_GATING.ordinal()] = 1;
        f12770a[C6954b.REASON_TOO_MANY_BLOCKED.ordinal()] = 2;
        f12771b[C6956c.TYPE_UNDER_REVIEW.ordinal()] = 1;
        f12771b[C6956c.TYPE_BAN.ordinal()] = 2;
        f12771b[C6956c.TYPE_DEACTIVATION.ordinal()] = 3;
        f12772c[C8277b.CODE_IN_DELETION_PROCESS.ordinal()] = 1;
        f12772c[C8277b.CODE_IN_PROBATION.ordinal()] = 2;
    }
}
