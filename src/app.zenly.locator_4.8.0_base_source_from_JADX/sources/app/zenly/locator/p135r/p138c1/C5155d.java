package app.zenly.locator.p135r.p138c1;

import android.content.Context;
import app.zenly.locator.contactpicker.adapter.ContactAdapter.OnCellInteraction;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.p135r.p137b1.C5139b;
import app.zenly.locator.p135r.p137b1.C5142c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: app.zenly.locator.r.c1.d */
public class C5155d {

    /* renamed from: a */
    private Map<String, Integer> f13368a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public OnCellInteraction f13369b;

    /* renamed from: c */
    private final boolean f13370c;

    /* renamed from: d */
    private final C2538c0 f13371d;

    /* renamed from: app.zenly.locator.r.c1.d$a */
    class C5156a extends C2623w {

        /* renamed from: c */
        final /* synthetic */ C5139b f13372c;

        C5156a(Context context, boolean z, C5139b bVar) {
            this.f13372c = bVar;
            super(context, z);
        }

        public void onCancel() {
            C5155d.this.mo12527a(this.f13372c, Integer.valueOf(0));
            if (C5155d.this.f13369b != null) {
                C5155d.this.f13369b.onCellUpdated(this.f13372c);
            }
        }

        public boolean onError(C2624x xVar) {
            if (super.onError(xVar)) {
                C5155d.this.mo12527a(this.f13372c, Integer.valueOf(0));
                if (C5155d.this.f13369b != null) {
                    C5155d.this.f13369b.onCellUpdated(this.f13372c);
                }
            }
            return true;
        }

        public void onSuccess() {
            C5155d.this.mo12527a(this.f13372c, Integer.valueOf(3));
            if (C5155d.this.f13369b != null) {
                C5155d.this.f13369b.onCellUpdated(this.f13372c);
            }
        }
    }

    /* renamed from: app.zenly.locator.r.c1.d$b */
    class C5157b extends C2623w {

        /* renamed from: c */
        final /* synthetic */ C5139b f13374c;

        /* renamed from: d */
        final /* synthetic */ boolean f13375d;

        C5157b(Context context, boolean z, C5139b bVar, boolean z2) {
            this.f13374c = bVar;
            this.f13375d = z2;
            super(context, z);
        }

        public void onCancel() {
            C5155d.this.mo12527a(this.f13374c, Integer.valueOf(0));
            if (C5155d.this.f13369b != null) {
                C5155d.this.f13369b.onCellUpdated(this.f13374c);
            }
        }

        public boolean onError(C2624x xVar) {
            if (super.onError(xVar)) {
                C5155d.this.mo12527a(this.f13374c, Integer.valueOf(0));
                if (C5155d.this.f13369b != null) {
                    C5155d.this.f13369b.onCellUpdated(this.f13374c);
                }
            }
            return true;
        }

        public void onSuccess() {
            C5155d.this.mo12527a(this.f13374c, Integer.valueOf(this.f13375d ? 3 : 2));
            if (C5155d.this.f13369b != null) {
                C5155d.this.f13369b.onCellUpdated(this.f13374c);
            }
        }
    }

    /* renamed from: app.zenly.locator.r.c1.d$c */
    static /* synthetic */ class C5158c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13377a = new int[C5142c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.r.b1.c[] r0 = app.zenly.locator.p135r.p137b1.C5142c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13377a = r0
                int[] r0 = f13377a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.ALREADY_ON_ZENLY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13377a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.CONTACTS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13377a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.SUGGESTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p135r.p138c1.C5155d.C5158c.<clinit>():void");
        }
    }

    public C5155d(C2538c0 c0Var, OnCellInteraction onCellInteraction, boolean z) {
        this.f13369b = onCellInteraction;
        this.f13370c = z;
        this.f13371d = c0Var;
    }

    /* renamed from: b */
    private C2587f0 m14718b(C5139b bVar) {
        if (bVar.mo12486i()) {
            return C2587f0.REFERRER;
        }
        int i = C5158c.f13377a[bVar.mo12482e().ordinal()];
        if (i == 1) {
            return this.f13370c ? C2587f0.ONBOARDING_AOZ : C2587f0.ADDFRIEND_AOZ;
        } else if (i == 2) {
            return this.f13370c ? C2587f0.ONBOARDING_CONTACT : C2587f0.ADDFRIEND_CONTACT;
        } else if (i != 3) {
            return C2587f0.UNDEFINED;
        } else {
            return this.f13370c ? C2587f0.ONBOARDING_SUGGESTED : C2587f0.ADDFRIEND_SUGGESTED;
        }
    }

    /* renamed from: a */
    public void mo12527a(C5139b bVar, Integer num) {
        if (bVar != null && num != null) {
            if (bVar.mo12471a() != null) {
                this.f13368a.put(bVar.mo12471a().getDeviceContactId(), num);
            } else if (bVar.mo12484g() != null) {
                this.f13368a.put(bVar.mo12484g().getUuid(), num);
            }
        }
    }

    /* renamed from: a */
    public int mo12524a(C5139b bVar) {
        if (bVar.mo12471a() != null && this.f13368a.containsKey(bVar.mo12471a().getDeviceContactId())) {
            return ((Integer) this.f13368a.get(bVar.mo12471a().getDeviceContactId())).intValue();
        }
        if (bVar.mo12484g() == null || !this.f13368a.containsKey(bVar.mo12484g().getUuid())) {
            return 0;
        }
        return ((Integer) this.f13368a.get(bVar.mo12484g().getUuid())).intValue();
    }

    /* renamed from: a */
    public void mo12525a(Context context, C5139b bVar) {
        C2587f0 b = m14718b(bVar);
        if (bVar.mo12484g() != null) {
            m14717a(context, bVar, b, true);
        } else if (bVar.mo12471a() != null) {
            this.f13371d.mo8670a(C2625y.m8947a(b, bVar.mo12471a(), false), (InvitationCallback) new C5156a(context, true, bVar));
        }
    }

    /* renamed from: a */
    public void mo12526a(Context context, LinkedHashMap<String, C5139b> linkedHashMap) {
        C2587f0 f0Var;
        for (Entry entry : linkedHashMap.entrySet()) {
            if (((C5139b) entry.getValue()).mo12486i()) {
                f0Var = C2587f0.REFERRER;
            } else if (this.f13370c) {
                f0Var = C2587f0.ONBOARDING_AOZ;
            } else {
                f0Var = C2587f0.ADDFRIEND_AOZ;
            }
            m14717a(context, (C5139b) entry.getValue(), f0Var, false);
        }
    }

    /* renamed from: a */
    private void m14717a(Context context, C5139b bVar, C2587f0 f0Var, boolean z) {
        C2538c0 c0Var = this.f13371d;
        C2625y a = C2625y.m8946a(f0Var, bVar.mo12484g(), false, null, false);
        C5157b bVar2 = new C5157b(context, true, bVar, z);
        c0Var.mo8670a(a, (InvitationCallback) bVar2);
    }

    /* renamed from: a */
    public int mo12523a(int i) {
        int i2 = 0;
        for (Integer intValue : this.f13368a.values()) {
            if (i == intValue.intValue()) {
                i2++;
            }
        }
        return i2;
    }
}
