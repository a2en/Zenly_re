package app.zenly.locator.contactpicker.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.Callback;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import app.zenly.locator.core.invitations.C2545e0.C2564j;
import app.zenly.locator.core.invitations.C2545e0.C2566k;
import app.zenly.locator.core.invitations.C2620u;
import app.zenly.locator.core.invitations.MessageShareContent;
import app.zenly.locator.core.invitations.ShareResult;
import app.zenly.locator.core.invitations.p068g0.C2590a;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.invitations.p068g0.C2597f;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.request.C9224d;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.contactpicker.adapter.l */
public final class C2412l {

    /* renamed from: a */
    private final Activity f7242a;

    /* renamed from: b */
    private final List<View> f7243b;

    /* renamed from: c */
    private final List<C2545e0> f7244c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f7245d;

    /* renamed from: app.zenly.locator.contactpicker.adapter.l$a */
    public static final class C2413a {
        private C2413a() {
        }

        public /* synthetic */ C2413a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.contactpicker.adapter.l$b */
    static final class C2414b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2545e0 f7246e;

        /* renamed from: f */
        final /* synthetic */ int f7247f;

        /* renamed from: g */
        final /* synthetic */ C2412l f7248g;

        /* renamed from: h */
        final /* synthetic */ C2594d f7249h;

        /* renamed from: i */
        final /* synthetic */ C2591a f7250i;

        /* renamed from: j */
        final /* synthetic */ C3744d f7251j;

        /* renamed from: k */
        final /* synthetic */ C12275b f7252k;

        /* renamed from: app.zenly.locator.contactpicker.adapter.l$b$a */
        public static final class C2415a implements Callback {

            /* renamed from: a */
            final /* synthetic */ C2414b f7253a;

            C2415a(C2414b bVar) {
                this.f7253a = bVar;
            }

            public void onShareSheetClosed(ShareResult shareResult) {
                C12932j.m33818b(shareResult, "shareResult");
                if (shareResult.mo8633c() && this.f7253a.f7248g.f7245d) {
                    if (this.f7253a.f7248g.f7245d) {
                        this.f7253a.f7249h.mo8706e(true);
                    } else {
                        this.f7253a.f7249h.mo8704d(true);
                    }
                }
            }
        }

        C2414b(C2545e0 e0Var, int i, C2412l lVar, int i2, C2594d dVar, C2591a aVar, C3744d dVar2, C12275b bVar) {
            this.f7246e = e0Var;
            this.f7247f = i;
            this.f7248g = lVar;
            this.f7249h = dVar;
            this.f7250i = aVar;
            this.f7251j = dVar2;
            this.f7252k = bVar;
        }

        public final void onClick(View view) {
            this.f7249h.mo8710g(true);
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            new C2590a(a).mo8695a(this.f7250i, this.f7246e.mo8688c(), this.f7247f, this.f7248g.m8481b());
            if (C12932j.m33817a((Object) this.f7246e, (Object) C2549b0.f7613e)) {
                C12773a.m33432a(new C2597f(this.f7248g.mo8372a(), this.f7251j.mo10293b()).mo8714a(), this.f7252k);
                if (this.f7248g.f7245d) {
                    this.f7249h.mo8706e(true);
                } else {
                    this.f7249h.mo8704d(true);
                }
            } else {
                Activity a2 = this.f7248g.mo8372a();
                if (a2 != null) {
                    C2620u uVar = new C2620u((FragmentActivity) a2);
                    String string = this.f7248g.mo8372a().getString(R.string.sharesheet_broadcastedInvite_title);
                    C12932j.m33815a((Object) string, "activity.getString(R.str…_broadcastedInvite_title)");
                    C2620u.m8944a(uVar, null, string, new MessageShareContent(null, this.f7251j.mo10293b()), this.f7250i, this.f7246e, new C2415a(this), 1, null);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        }
    }

    /* renamed from: app.zenly.locator.contactpicker.adapter.l$c */
    static final class C2416c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2412l f7254e;

        /* renamed from: f */
        final /* synthetic */ C2594d f7255f;

        /* renamed from: g */
        final /* synthetic */ C3744d f7256g;

        /* renamed from: h */
        final /* synthetic */ C2591a f7257h;

        /* renamed from: app.zenly.locator.contactpicker.adapter.l$c$a */
        public static final class C2417a implements Callback {

            /* renamed from: a */
            final /* synthetic */ C2416c f7258a;

            C2417a(C2416c cVar) {
                this.f7258a = cVar;
            }

            public void onShareSheetClosed(ShareResult shareResult) {
                C12932j.m33818b(shareResult, "shareResult");
                if (shareResult.mo8633c()) {
                    int b = shareResult.mo8632b();
                    C5343a U = C5343a.m15160U();
                    C12932j.m33815a((Object) U, "Analytics.get()");
                    AnalyticsTracker a = U.mo12806a();
                    C12932j.m33815a((Object) a, "Analytics.get().tracker");
                    new C2590a(a).mo8695a(this.f7258a.f7257h, shareResult.mo8628a(), b, this.f7258a.f7254e.m8481b());
                    if (this.f7258a.f7254e.f7245d) {
                        this.f7258a.f7255f.mo8706e(true);
                    } else {
                        this.f7258a.f7255f.mo8704d(true);
                    }
                }
            }
        }

        C2416c(C2412l lVar, C2594d dVar, C3744d dVar2, C2591a aVar) {
            this.f7254e = lVar;
            this.f7255f = dVar;
            this.f7256g = dVar2;
            this.f7257h = aVar;
        }

        public final void onClick(View view) {
            this.f7255f.mo8710g(true);
            Activity a = this.f7254e.mo8372a();
            if (a != null) {
                C2620u uVar = new C2620u((FragmentActivity) a);
                String string = this.f7254e.mo8372a().getString(R.string.sharesheet_broadcastedInvite_title);
                C12932j.m33815a((Object) string, "activity.getString(R.str…_broadcastedInvite_title)");
                C2620u.m8944a(uVar, null, string, new MessageShareContent(null, this.f7256g.mo10293b()), C2591a.ADD_FRIEND, null, new C2417a(this), 17, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    static {
        new C2413a(null);
    }

    public C2412l(Activity activity, List<? extends View> list, List<? extends C2545e0> list2, boolean z) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(list, "containers");
        C12932j.m33818b(list2, "availableSharingOptions");
        this.f7242a = activity;
        this.f7243b = list;
        this.f7244c = list2;
        this.f7245d = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m8481b() {
        return C3444a.m10686a(this.f7242a).mo6511a("feature:SocialNetworkInOnboarding");
    }

    /* renamed from: a */
    public final Activity mo8372a() {
        return this.f7242a;
    }

    /* renamed from: a */
    public final void mo8373a(C12275b bVar) {
        int i;
        C3744d dVar;
        C3744d dVar2;
        C2591a aVar;
        C12932j.m33818b(bVar, "disposeOnDetach");
        C2594d dVar3 = new C2594d(C5407g.f13966d.mo12991a(this.f7242a).mo12986h());
        int i2 = 0;
        boolean z = this.f7244c.size() > 5;
        if (z) {
            i = C12973l.m33890b(this.f7244c.size(), 4);
        } else {
            i = this.f7244c.size();
        }
        int i3 = i;
        C2591a aVar2 = this.f7245d ? C2591a.ONBOARDING : C2591a.ADD_FRIEND;
        if (C3444a.m10686a(this.f7242a).mo6511a("feature:SocialNetworkInOnboarding") && this.f7245d) {
            dVar = C3744d.OnboardingSocialNetwork;
        } else if (this.f7245d) {
            dVar = C3744d.BroadcastInviteOnboarding;
        } else {
            dVar = C3744d.BroadcastInviteAddFriend;
        }
        C3744d dVar4 = dVar;
        int i4 = 0;
        for (Object next : this.f7243b) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                View view = (View) next;
                ImageView imageView = (ImageView) view.findViewById(C3891l.logo);
                TextView textView = (TextView) view.findViewById(C3891l.app_name);
                if (i4 < i3) {
                    view.setVisibility(i2);
                    C2545e0 e0Var = (C2545e0) this.f7244c.get(i4);
                    C2476d.m8581a(this.f7242a).m8717a(Integer.valueOf(m8479a(e0Var))).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a((float) this.f7242a.getResources().getDimensionPixelSize(R.dimen.corner_radius_300)))).m8693a(new C9224d().mo8517a(C8978i.f23423a)).mo24173a(imageView);
                    C12932j.m33815a((Object) textView, "appName");
                    textView.setText(this.f7242a.getString(e0Var.mo8687b()));
                    View view2 = view;
                    dVar2 = dVar4;
                    aVar = aVar2;
                    C2414b bVar2 = new C2414b(e0Var, i4, this, i3, dVar3, aVar2, dVar4, bVar);
                    view2.setOnClickListener(bVar2);
                } else {
                    dVar2 = dVar4;
                    aVar = aVar2;
                    view.setVisibility(8);
                }
                aVar2 = aVar;
                i4 = i5;
                dVar4 = dVar2;
                i2 = 0;
                C12275b bVar3 = bVar;
            } else {
                C12844m.m33616c();
                throw null;
            }
        }
        C3744d dVar5 = dVar4;
        C2591a aVar3 = aVar2;
        if (z) {
            List<View> list = this.f7243b;
            View view3 = (View) list.get(list.size() - 1);
            TextView textView2 = (TextView) view3.findViewById(C3891l.app_name);
            ((ImageView) view3.findViewById(C3891l.logo)).setImageResource(this.f7245d ? 2131231277 : 2131231278);
            textView2.setText(R.string.add_friends_section_broadcastedInvite_more);
            view3.setVisibility(0);
            view3.setOnClickListener(new C2416c(this, dVar3, dVar5, aVar3));
        }
    }

    /* renamed from: a */
    private final int m8479a(C2545e0 e0Var) {
        if (C12932j.m33817a((Object) e0Var, (Object) C2564j.f7626e) && !this.f7245d) {
            return C2566k.f7628e.mo8683a();
        }
        if (!C12932j.m33817a((Object) e0Var, (Object) C2566k.f7628e) || !this.f7245d) {
            return e0Var.mo8683a();
        }
        return C2564j.f7626e.mo8683a();
    }
}
