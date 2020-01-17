package app.zenly.locator.modals;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.modals.p121o2.C4644c;
import app.zenly.locator.modals.p121o2.C4654g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7492v2;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.notifications.C7857w;
import p213co.znly.models.notifications.C7857w.C7859b;
import p213co.znly.models.services.C8305u2;
import p213co.znly.models.services.C8305u2.C8306a;
import p387h.p388a.C12143a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.modals.p1 */
public class C4660p1 extends ModalController {

    /* renamed from: Q */
    private C4654g f12409Q;

    /* renamed from: R */
    private final C7857w f12410R;

    /* renamed from: S */
    private final boolean f12411S;

    /* renamed from: T */
    private final UserProto$User f12412T;

    /* renamed from: U */
    private boolean f12413U;

    /* renamed from: app.zenly.locator.modals.p1$a */
    static /* synthetic */ class C4661a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12414a = new int[C7859b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                co.znly.models.notifications.w$b[] r0 = p213co.znly.models.notifications.C7857w.C7859b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12414a = r0
                int[] r0 = f12414a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.notifications.w$b r1 = p213co.znly.models.notifications.C7857w.C7859b.DISABLE_GHOST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12414a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.notifications.w$b r1 = p213co.znly.models.notifications.C7857w.C7859b.LOCATION_REQUEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.modals.C4660p1.C4661a.<clinit>():void");
        }
    }

    public C4660p1(C7857w wVar, boolean z) throws InvalidProtocolBufferException, IllegalArgumentException {
        this(m13616a(wVar, z));
    }

    /* renamed from: a */
    private static Bundle m13616a(C7857w wVar, boolean z) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9613a("notification", wVar.toByteArray());
        dVar.mo9612a("isCityMode", z);
        return dVar.mo9605a();
    }

    /* renamed from: B */
    public void mo7192B() {
        if (!this.f12413U) {
            super.mo7192B();
        }
    }

    /* renamed from: C */
    public void mo10303C() {
        if (!this.f12413U) {
            this.f12413U = true;
            C8306a newBuilder = C8305u2.newBuilder();
            newBuilder.mo22268a(this.f12412T.getUuid());
            newBuilder.mo22266a(C7492v2.city);
            newBuilder.mo22265a(Timestamp.newBuilder());
            C5448c.m15478a().friendGhost((C8305u2) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) C4684u.f12446e, (Consumer<? super Throwable>) new C4681t<Object>(this), (Action) new C4687v(this));
        }
    }

    /* renamed from: E */
    public /* synthetic */ void mo11875E() throws Exception {
        C12143a.m32027a("processFriendRequest: onComplete", new Object[0]);
        this.f12413U = false;
        mo23946k().mo24014n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
    }

    public C4660p1(Bundle bundle) throws InvalidProtocolBufferException, IllegalArgumentException {
        super(bundle);
        this.f12410R = C7857w.parseFrom(bundle.getByteArray("notification"));
        this.f12411S = bundle.getBoolean("isCityMode");
        int i = C4661a.f12414a[this.f12410R.getNotificationCase().ordinal()];
        if (i == 1) {
            this.f12412T = this.f12410R.getDisableGhost().getAuthor();
        } else if (i == 2) {
            this.f12412T = this.f12410R.getLocationRequest().getAuthor();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public C4644c m13623b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f12409Q = new C4654g(viewGroup.getContext());
        this.f12409Q.setTitle((CharSequence) mo23920b().getString(R.string.troubleshoot_cityprecise_title_disablecitymode, new Object[]{this.f12412T.getName()}));
        if (this.f12411S) {
            this.f12409Q.setSummary((CharSequence) mo23920b().getString(R.string.troubleshoot_blurred_subtitle_disableblurred, new Object[]{this.f12412T.getName()}));
        } else {
            this.f12409Q.setSummary((CharSequence) mo23920b().getString(R.string.troubleshoot_frozen_subtitle_disablefrozen, new Object[]{this.f12412T.getName()}));
        }
        this.f12409Q.mo11815a(true);
        this.f12409Q.setImageResource(2131231633);
        this.f12409Q.setPrimaryActionTitle((int) R.string.commons_button_allow);
        return this.f12409Q;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11876a(Throwable th) throws Exception {
        C12143a.m32032b(th, "processFriendRequest: onError", new Object[0]);
        this.f12413U = false;
        Toast.makeText(mo23920b(), R.string.commons_content_oopserror, 0).show();
        mo23946k().mo24014n();
    }
}
