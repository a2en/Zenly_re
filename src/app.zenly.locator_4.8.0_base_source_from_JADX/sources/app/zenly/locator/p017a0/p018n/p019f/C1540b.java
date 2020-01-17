package app.zenly.locator.p017a0.p018n.p019f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import androidx.appcompat.app.C0122a.C0123a;
import app.zenly.locator.R;
import app.zenly.locator.p017a0.p018n.C1534c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.C12286f;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.a0.n.f.b */
public final class C1540b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f5447a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1534c f5448b;

    /* renamed from: c */
    private final C12286f f5449c;

    /* renamed from: app.zenly.locator.a0.n.f.b$a */
    static final class C1541a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1540b f5450e;

        /* renamed from: f */
        final /* synthetic */ C1539a f5451f;

        C1541a(C1540b bVar, C1539a aVar) {
            this.f5450e = bVar;
            this.f5451f = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f5450e.m6727a(this.f5451f.mo7076a());
            }
        }
    }

    /* renamed from: app.zenly.locator.a0.n.f.b$b */
    static final class C1542b implements Action {

        /* renamed from: a */
        public static final C1542b f5452a = new C1542b();

        C1542b() {
        }

        public final void run() {
        }
    }

    /* renamed from: app.zenly.locator.a0.n.f.b$c */
    static final class C1543c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1540b f5453e;

        /* renamed from: f */
        final /* synthetic */ UserProto$User f5454f;

        C1543c(C1540b bVar, UserProto$User userProto$User) {
            this.f5453e = bVar;
            this.f5454f = userProto$User;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f5453e.f5448b.mo7071a(this.f5454f);
            Toast.makeText(this.f5453e.f5447a, R.string.settings_blocked_loadingfail_message, 0).show();
        }
    }

    public C1540b(Context context, C1534c cVar, C12286f fVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(cVar, "viewModel");
        C12932j.m33818b(fVar, "uiScheduler");
        this.f5447a = context;
        this.f5448b = cVar;
        this.f5449c = fVar;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onBlockedUserClick(C1539a aVar) {
        C12932j.m33818b(aVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f5447a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        String string = this.f5447a.getResources().getString(R.string.commons_button_cancelcap);
        C12932j.m33815a((Object) string, "context.resources.getStr…commons_button_cancelcap)");
        String[] strArr = {C7709b.m18762a(this.f5447a, R.string.profile_button_unblock), string};
        C0123a aVar2 = new C0123a(this.f5447a);
        aVar2.mo547b((CharSequence) aVar.mo7076a().getName());
        aVar2.mo541a((CharSequence[]) strArr, (OnClickListener) new C1541a(this, aVar));
        aVar2.mo550c();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public final void m6727a(UserProto$User userProto$User) {
        this.f5448b.mo7072b(userProto$User);
        this.f5448b.mo7073c(userProto$User).mo36342a(this.f5449c).mo36345a(C1542b.f5452a, new C1543c(this, userProto$User));
    }
}
