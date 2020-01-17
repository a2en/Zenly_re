package app.zenly.locator.core.invitations;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.spam.prevention.C1454f;
import app.zenly.android.feature.spam.prevention.C1460h;
import app.zenly.android.feature.spam.prevention.model.C1468a;
import app.zenly.android.feature.spam.prevention.repository.SpamPreventionRepository;
import app.zenly.locator.C3819h;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.C2530a0.C2531a;
import app.zenly.locator.core.invitations.C2530a0.C2532b;
import app.zenly.locator.core.invitations.C2530a0.C2533c;
import app.zenly.locator.core.invitations.C2530a0.C2534d;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.referrer.C3748b;
import app.zenly.locator.experimental.referrer.C3756e;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.p042b0.C1688a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p196u.p197b.C5943a;
import com.android.installreferrer.api.C8695a;
import java.util.List;
import kotlin.C12899i;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin.C6804a;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin.C6804a.C6805a;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin.C6806b;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin.C6807c;
import p213co.znly.models.services.C7979a3;
import p213co.znly.models.services.C8117j0.C8119b;
import p213co.znly.models.services.C8351w2.C8353b;
import p213co.znly.models.services.C8369x2;
import p213co.znly.models.services.C8369x2.C8370a;
import p213co.znly.models.services.C8385y2;
import p213co.znly.models.services.C8399z2;
import p213co.znly.models.services.C8399z2.C8400a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.core.invitations.c0 */
public class C2538c0 {

    /* renamed from: a */
    private final FragmentActivity f7587a;

    /* renamed from: b */
    private final C2620u f7588b;

    /* renamed from: c */
    private final SpamPreventionRepository f7589c;

    /* renamed from: d */
    private final C1688a f7590d;

    /* renamed from: e */
    private final C5943a f7591e;

    /* renamed from: f */
    private final ZenlySchedulers f7592f = C1351e.m6372a(C3819h.f10169b.mo19916a("inviteManager"));

    /* renamed from: app.zenly.locator.core.invitations.c0$a */
    static /* synthetic */ class C2539a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7593a = new int[C8119b.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f7594b = new int[C8353b.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f7595c = new int[C2587f0.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b7 */
        static {
            /*
                app.zenly.locator.core.invitations.f0[] r0 = app.zenly.locator.core.invitations.C2587f0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7595c = r0
                r0 = 1
                int[] r1 = f7595c     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.invitations.f0 r2 = app.zenly.locator.core.invitations.C2587f0.ONBOARDING_CONTACT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f7595c     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.invitations.f0 r3 = app.zenly.locator.core.invitations.C2587f0.ONBOARDING_SUGGESTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f7595c     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.invitations.f0 r4 = app.zenly.locator.core.invitations.C2587f0.ADDFRIEND_SUGGESTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f7595c     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.core.invitations.f0 r5 = app.zenly.locator.core.invitations.C2587f0.DASHBOARD_SUGGESTED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f7595c     // Catch:{ NoSuchFieldError -> 0x0040 }
                app.zenly.locator.core.invitations.f0 r6 = app.zenly.locator.core.invitations.C2587f0.ADDFRIEND_CONTACT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r5 = 6
                int[] r6 = f7595c     // Catch:{ NoSuchFieldError -> 0x004b }
                app.zenly.locator.core.invitations.f0 r7 = app.zenly.locator.core.invitations.C2587f0.DASHBOARD_CONTACT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                co.znly.models.services.w2$b[] r6 = p213co.znly.models.services.C8351w2.C8353b.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f7594b = r6
                int[] r6 = f7594b     // Catch:{ NoSuchFieldError -> 0x005e }
                co.znly.models.services.w2$b r7 = p213co.znly.models.services.C8351w2.C8353b.NO_ERROR     // Catch:{ NoSuchFieldError -> 0x005e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r6 = f7594b     // Catch:{ NoSuchFieldError -> 0x0068 }
                co.znly.models.services.w2$b r7 = p213co.znly.models.services.C8351w2.C8353b.ALREADY_INVITED     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r6 = f7594b     // Catch:{ NoSuchFieldError -> 0x0072 }
                co.znly.models.services.w2$b r7 = p213co.znly.models.services.C8351w2.C8353b.ALREADY_FRIENDS     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r6 = f7594b     // Catch:{ NoSuchFieldError -> 0x007c }
                co.znly.models.services.w2$b r7 = p213co.znly.models.services.C8351w2.C8353b.CANNOT_COERCED_PHONENUMBER     // Catch:{ NoSuchFieldError -> 0x007c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r6 = f7594b     // Catch:{ NoSuchFieldError -> 0x0086 }
                co.znly.models.services.w2$b r7 = p213co.znly.models.services.C8351w2.C8353b.SAME_AUTHOR_TARGET     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r4 = f7594b     // Catch:{ NoSuchFieldError -> 0x0090 }
                co.znly.models.services.w2$b r6 = p213co.znly.models.services.C8351w2.C8353b.UNKNOWN_USERNAME     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r4[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                co.znly.models.services.j0$b[] r4 = p213co.znly.models.services.C8117j0.C8119b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f7593a = r4
                int[] r4 = f7593a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                co.znly.models.services.j0$b r5 = p213co.znly.models.services.C8117j0.C8119b.NO_ACL_ERROR     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x00ad }
                co.znly.models.services.j0$b r4 = p213co.znly.models.services.C8117j0.C8119b.BLOCK     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                co.znly.models.services.j0$b r1 = p213co.znly.models.services.C8117j0.C8119b.PRIVATE     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x00c1 }
                co.znly.models.services.j0$b r1 = p213co.znly.models.services.C8117j0.C8119b.RATE_LIMIT_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x00c1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c1 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c1 }
            L_0x00c1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.C2538c0.C2539a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.c0$b */
    private static class C2540b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C8385y2 f7596a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1468a f7597b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f7598c;

        C2540b(C8385y2 y2Var, C1468a aVar, int i) {
            this.f7596a = y2Var;
            this.f7597b = aVar;
            this.f7598c = i;
        }
    }

    private C2538c0(Activity activity) {
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        this.f7587a = fragmentActivity;
        this.f7588b = new C2620u(fragmentActivity);
        this.f7589c = C1460h.m6557a(activity).provideSpamPreventionRepository();
        this.f7590d = new C1688a(C5343a.m15160U().mo12806a());
        this.f7591e = new C5943a(C5343a.m15160U().mo12806a(), C5448c.m15478a());
    }

    /* renamed from: a */
    public static C2538c0 m8837a(Activity activity) {
        return new C2538c0(activity);
    }

    /* renamed from: a */
    static /* synthetic */ void m8849a(C7979a3 a3Var) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12279e<C2540b> mo8666a(C8369x2 x2Var, C12899i<C1468a, Integer> iVar) {
        return C5448c.m15478a().friendRequestCreate(x2Var).mo36501i(new C2616q(iVar));
    }

    /* renamed from: d */
    private void m8862d(C2627z zVar, String str) {
        EditText editText = new EditText(this.f7587a);
        editText.setText(str);
        editText.setPaddingRelative(this.f7587a.getResources().getDimensionPixelSize(R.dimen.spacing_400), this.f7587a.getResources().getDimensionPixelSize(R.dimen.spacing_200), this.f7587a.getResources().getDimensionPixelSize(R.dimen.spacing_400), this.f7587a.getResources().getDimensionPixelSize(R.dimen.spacing_200));
        C0123a aVar = new C0123a(this.f7587a);
        aVar.mo527a(2131231362);
        aVar.mo548c(R.string.signup_contactpicker_alerttitle_correctnumber);
        aVar.mo546b((View) editText);
        aVar.mo549c(R.string.commons_button_ok, new C2589g(this, editText, zVar));
        aVar.mo545b(R.string.commons_button_cancel, new C2610k(this, zVar));
        aVar.mo530a((OnCancelListener) new C2537c(this, zVar));
        aVar.mo542a().show();
    }

    /* renamed from: c */
    public /* synthetic */ void mo8679c(C2627z zVar, DialogInterface dialogInterface) {
        m8843a(zVar);
    }

    /* renamed from: c */
    private void m8861c(C2627z zVar, String str) {
        C8370a newBuilder = C8369x2.newBuilder();
        newBuilder.setName(zVar.mo8738b().mo8726a());
        newBuilder.mo22335a(C5448c.m15478a().phoneNumberNormalizeE164(str));
        newBuilder.mo22334a(zVar.mo8738b().mo8727b().mo8692b());
        m8844a(zVar, (C8369x2) newBuilder.build());
    }

    /* renamed from: a */
    public void mo8670a(C2625y yVar, InvitationCallback invitationCallback) {
        C2627z zVar = new C2627z(yVar, invitationCallback);
        C8370a newBuilder = C8369x2.newBuilder();
        newBuilder.setName(yVar.mo8726a());
        if (yVar.mo8728c() instanceof C2533c) {
            newBuilder.mo22336b(((C2533c) yVar.mo8728c()).mo8650a());
        } else if (yVar.mo8728c() instanceof C2534d) {
            newBuilder.mo22337c(((C2534d) yVar.mo8728c()).mo8654a());
        } else if (yVar.mo8728c() instanceof C2531a) {
            C2531a aVar = (C2531a) yVar.mo8728c();
            newBuilder.mo22336b(aVar.mo8642b());
            C6806b newBuilder2 = Origin.newBuilder();
            newBuilder2.mo16893a(C6807c.ORIGIN_BRUMP);
            C6805a newBuilder3 = C6804a.newBuilder();
            newBuilder3.mo16891a(aVar.mo8641a());
            newBuilder2.mo16892a(newBuilder3);
            newBuilder.mo22333a(newBuilder2);
        } else if (yVar.mo8728c() instanceof C2532b) {
            m8848a(zVar, ((C2532b) yVar.mo8728c()).mo8646a());
            return;
        }
        newBuilder.mo22334a(yVar.mo8727b().mo8692b());
        if (yVar.mo8727b() == C2587f0.REFERRER) {
            C3748b bVar = new C3748b(new C3756e(), new C5943a(C5343a.m15160U().mo12806a(), C5448c.m15478a()), C3444a.m10686a(this.f7587a), C8695a.m20457a((Context) this.f7587a).mo23483a(), C5407g.m15386a((Context) this.f7587a).mo12986h());
            this.f7591e.mo13645b(bVar.mo10299b());
            bVar.mo10298a();
        }
        m8844a(zVar, (C8369x2) newBuilder.build());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo8674a(C2627z zVar, C8369x2 x2Var, C2540b bVar) {
        m8845a(zVar, x2Var, bVar.f7596a);
        if (bVar.f7597b != C1468a.NO_SPAM && !bVar.f7596a.hasError()) {
            this.f7590d.mo7303a(bVar.f7597b);
            m8841a(bVar.f7598c);
        }
    }

    /* renamed from: b */
    private void m8853b() {
        m8840a();
        FragmentManager supportFragmentManager = this.f7587a.getSupportFragmentManager();
        String str = "SpamPreventionFragment";
        if (supportFragmentManager.mo4083b(str) == null) {
            C0819o b = supportFragmentManager.mo4084b();
            b.mo4310a((int) R.anim.slide_in_bottom, (int) R.anim.slide_out_bottom, (int) R.anim.slide_in_bottom, (int) R.anim.slide_out_bottom);
            b.mo4312a((int) R.id.main_fragment_container, (Fragment) new C1454f(), str);
            b.mo4317a("spam");
            b.mo4176a();
        }
    }

    /* renamed from: b */
    private void m8858b(C2627z zVar, List<String> list) {
        C0123a aVar = new C0123a(this.f7587a);
        aVar.mo527a(2131231362);
        aVar.mo548c(R.string.signup_contactpicker_alerttitle_picknumber);
        aVar.mo530a((OnCancelListener) new C2617r(this, zVar));
        aVar.mo536a((ListAdapter) new ArrayAdapter(this.f7587a, R.layout.view_simple_list_item, list), (OnClickListener) new C2612m(this, list, zVar));
        aVar.mo542a().show();
    }

    /* renamed from: b */
    public /* synthetic */ void mo8677b(C2627z zVar, DialogInterface dialogInterface) {
        m8843a(zVar);
    }

    /* renamed from: b */
    private void m8857b(C2627z zVar, String str) {
        TextView textView = new TextView(this.f7587a);
        textView.setGravity(49);
        textView.setPaddingRelative(this.f7587a.getResources().getDimensionPixelSize(R.dimen.spacing_200), this.f7587a.getResources().getDimensionPixelSize(R.dimen.spacing_400), this.f7587a.getResources().getDimensionPixelSize(R.dimen.spacing_200), 0);
        C5448c.m15478a().deviceCountryCode().mo36428a((C12286f) this.f7592f.getMainThread()).mo36412a((Consumer<? super T>) new C2613n<Object>(this, textView, str), (Consumer<? super Throwable>) C2611l.f7705e);
        C0123a aVar = new C0123a(this.f7587a);
        aVar.mo527a(2131231362);
        aVar.mo548c(R.string.signup_contactpicker_alerttitle_invalidphonenumber);
        aVar.mo546b((View) textView);
        aVar.mo545b(R.string.signup_contactpicker_alertbutton_usenumber, new C2541d(this, zVar, str));
        aVar.mo549c(R.string.signup_contactpicker_alertbutton_editnumber, new C2615p(this, zVar, str));
        aVar.mo530a((OnCancelListener) new C2586f(this, zVar));
        aVar.mo542a().show();
    }

    /* renamed from: a */
    private void m8848a(C2627z zVar, List<String> list) {
        if (list.size() == 0) {
            zVar.mo8736a().onError(C2624x.OTHER);
        } else if (list.size() == 1) {
            m8846a(zVar, (String) list.get(0));
        } else {
            m8858b(zVar, list);
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private void m8844a(C2627z zVar, C8369x2 x2Var) {
        C12279e.m32610a((ObservableSource<? extends T1>) this.f7589c.isSpamThresholdReachedOnNextRequest(), (ObservableSource<? extends T2>) this.f7589c.uponNextRequestGetFriendRequestCount(), (BiFunction<? super T1, ? super T2, ? extends R>) C2619t.f7722a).mo36509m(new C2614o(this, x2Var)).mo36428a((C12286f) this.f7592f.getMainThread()).mo36412a((Consumer<? super T>) new C2609j<Object>(this, zVar, x2Var), (Consumer<? super Throwable>) new C2608i<Object>(zVar));
    }

    /* renamed from: b */
    public /* synthetic */ void mo8678b(C2627z zVar, String str, DialogInterface dialogInterface, int i) {
        m8862d(zVar, str);
    }

    /* renamed from: b */
    private boolean m8860b(String str) {
        return !TextUtils.isEmpty(C5448c.m15478a().phoneNumberNormalizeE164(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo8673a(C2627z zVar, ShareResult shareResult) {
        if (shareResult.mo8633c()) {
            m8854b(zVar);
        } else {
            m8843a(zVar);
        }
    }

    /* renamed from: a */
    static /* synthetic */ C2540b m8836a(C12899i iVar, C8385y2 y2Var) throws Exception {
        return new C2540b(y2Var, (C1468a) iVar.mo37204c(), ((Integer) iVar.mo37205d()).intValue());
    }

    /* renamed from: a */
    private void m8841a(int i) {
        C3106c cVar = new C3106c(this.f7587a);
        cVar.mo9331a(2131231414);
        cVar.mo9346c(this.f7587a.getString(R.string.spamPrevention_modal_message_1));
        cVar.mo9341b(this.f7587a.getString(R.string.spamPrevention_modal_message_2));
        cVar.mo9335a(this.f7587a.getString(R.string.spamPrevention_modal_button_ok));
        cVar.mo9342b(this.f7587a.getString(R.string.spamPrevention_modal_button_manage_title), this.f7587a.getResources().getQuantityString(R.plurals.spamPrevention_modal_button_manage_subtitle, i, new Object[]{Integer.valueOf(i)}), new C2529a(this));
        cVar.mo9330a();
        cVar.mo9344b().mo9296j(this.f7587a);
    }

    /* renamed from: b */
    private void m8854b(C2627z zVar) {
        zVar.mo8736a().onSuccess();
    }

    /* renamed from: a */
    public /* synthetic */ void mo8667a(View view) {
        m8853b();
    }

    /* renamed from: a */
    private void m8840a() {
        if (this.f7587a.findViewById(R.id.main_fragment_container) == null) {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            FrameLayout frameLayout = new FrameLayout(this.f7587a);
            frameLayout.setId(R.id.main_fragment_container);
            this.f7587a.addContentView(frameLayout, layoutParams);
        }
    }

    /* renamed from: a */
    private void m8845a(C2627z zVar, C8369x2 x2Var, C8385y2 y2Var) {
        int i = C2539a.f7593a[y2Var.getError().getAclError().getCode().ordinal()];
        if (i == 1) {
            switch (C2539a.f7594b[y2Var.getError().getCode().ordinal()]) {
                case 1:
                    boolean z = !TextUtils.isEmpty(x2Var.getPhoneNumber());
                    String phoneNumber = z ? x2Var.getPhoneNumber() : y2Var.getFriendRequest().getTargetPhoneNumber();
                    FriendRequestTrackingInfo friendRequestTrackingInfo = new FriendRequestTrackingInfo(zVar.mo8738b().mo8729d().mo8660c(), zVar.mo8738b().mo8727b(), ((Boolean) C5448c.m15478a().contactsByPhoneNumber(phoneNumber).mo36501i(C2544e.f7605e).mo36446a(Boolean.valueOf(false))).booleanValue(), zVar.mo8738b().mo8729d().mo8661d(), y2Var.hasTarget() && y2Var.getTarget().getAvatarVersion() != 0, zVar.mo8738b().mo8729d().mo8659b(), zVar.mo8738b().mo8729d().mo8658a());
                    if (!y2Var.getFriendRequest().getTargetExists() && z) {
                        zVar.mo8737a(y2Var.getFriendRequest().getUuid());
                        m8842a(friendRequestTrackingInfo, zVar, phoneNumber);
                        break;
                    } else {
                        if (friendRequestTrackingInfo.mo8614f()) {
                            C5343a.m15160U().mo12813a(friendRequestTrackingInfo);
                        } else {
                            C5343a.m15160U().mo12857b(friendRequestTrackingInfo);
                        }
                        zVar.mo8736a().onSuccess();
                        break;
                    }
                case 2:
                    zVar.mo8736a().onError(C2624x.ALREADY_INVITED);
                    break;
                case 3:
                    zVar.mo8736a().onError(C2624x.ALREADY_FRIENDS);
                    break;
                case 4:
                    zVar.mo8736a().onError(C2624x.INVALID_PHONE_NUMBER);
                    break;
                case 5:
                    zVar.mo8736a().onError(C2624x.SELF_INVITE);
                    break;
                case 6:
                    zVar.mo8736a().onError(C2624x.UNKNOWN_USERNAME);
                    break;
                default:
                    zVar.mo8736a().onError(C2624x.OTHER);
                    break;
            }
        } else if (i == 2) {
            zVar.mo8736a().onError(C2624x.BLOCKED);
        } else if (i == 3) {
            zVar.mo8736a().onError(C2624x.PRIVATE);
        } else if (i != 4) {
            zVar.mo8736a().onError(C2624x.OTHER);
        } else {
            zVar.mo8736a().onError(C2624x.RATE_LIMIT);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8676a(List list, C2627z zVar, DialogInterface dialogInterface, int i) {
        if (i < 0 || i >= list.size()) {
            m8843a(zVar);
        } else {
            m8846a(zVar, (String) list.get(i));
        }
    }

    /* renamed from: a */
    private void m8846a(C2627z zVar, String str) {
        if (m8860b(str)) {
            m8861c(zVar, str);
        } else {
            m8857b(zVar, str);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8669a(TextView textView, String str, Long l) throws Exception {
        textView.setText(this.f7587a.getString(R.string.signup_contactpicker_alertcontent_numbernocountryprefix, new Object[]{str, Long.toString(l.longValue())}));
    }

    /* renamed from: a */
    public /* synthetic */ void mo8675a(C2627z zVar, String str, DialogInterface dialogInterface, int i) {
        m8861c(zVar, str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8671a(C2627z zVar, DialogInterface dialogInterface) {
        m8843a(zVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8668a(EditText editText, C2627z zVar, DialogInterface dialogInterface, int i) {
        m8861c(zVar, editText.getText().toString());
    }

    /* renamed from: a */
    public /* synthetic */ void mo8672a(C2627z zVar, DialogInterface dialogInterface, int i) {
        m8843a(zVar);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private void m8850a(String str) {
        C8400a newBuilder = C8399z2.newBuilder();
        newBuilder.setUuid(str);
        newBuilder.mo22342a(C6812c.canceled);
        C5448c.m15478a().friendRequestRespond((C8399z2) newBuilder.build()).mo36412a((Consumer<? super T>) C2607h.f7698e, (Consumer<? super Throwable>) C2535b.f7580e);
    }

    /* renamed from: a */
    private void m8842a(FriendRequestTrackingInfo friendRequestTrackingInfo, C2627z zVar, String str) {
        FriendRequestTrackingInfo friendRequestTrackingInfo2 = friendRequestTrackingInfo;
        this.f7588b.mo8725a(friendRequestTrackingInfo2, this.f7587a.getString(R.string.sharesheet_invite_postsms), new MessageShareContent(str, m8838a(friendRequestTrackingInfo).mo10293b()), null, null, new C2618s(this, zVar));
    }

    /* renamed from: a */
    private C3744d m8838a(FriendRequestTrackingInfo friendRequestTrackingInfo) {
        switch (C2539a.f7595c[friendRequestTrackingInfo.mo8611d().ordinal()]) {
            case 1:
                return C3744d.OnboardingContact;
            case 2:
            case 3:
            case 4:
                return C3744d.SuggestedContact;
            case 5:
            case 6:
                return C3744d.AddFriendContact;
            default:
                return C3744d.Other;
        }
    }

    /* renamed from: a */
    private void m8843a(C2627z zVar) {
        if (!zVar.mo8738b().mo8729d().mo8660c()) {
            C5343a.m15160U().mo12910v();
            if (zVar.mo8739c() != null) {
                m8850a(zVar.mo8739c());
            }
        }
        zVar.mo8736a().onCancel();
    }
}
