package app.zenly.locator.p206w;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.Callback;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2620u;
import app.zenly.locator.core.invitations.MessageShareContent;
import app.zenly.locator.core.invitations.ShareResult;
import app.zenly.locator.core.invitations.p068g0.C2590a;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import app.zenly.locator.core.invitations.p068g0.C2593c;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.invitations.p068g0.C2596e;
import app.zenly.locator.core.p072ui.view.C3140d;
import app.zenly.locator.core.p072ui.view.C3144f;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.core.widget.DecorView;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.p143s.C5343a;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: app.zenly.locator.w.a */
public final class C6177a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final BaseActivity f15533a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3144f f15534b;

    /* renamed from: app.zenly.locator.w.a$a */
    public static final class C6178a {

        /* renamed from: a */
        private final List<C2545e0> f15535a;

        /* renamed from: b */
        private final C2594d f15536b;

        /* renamed from: c */
        private final C1322a f15537c;

        /* renamed from: d */
        private final Timestamp f15538d;

        /* renamed from: app.zenly.locator.w.a$a$a */
        public static final class C6179a {
            private C6179a() {
            }

            public /* synthetic */ C6179a(C12928f fVar) {
                this();
            }
        }

        static {
            new C6179a(null);
        }

        public C6178a(String str, List<? extends C2545e0> list, C2594d dVar, C1322a aVar, Timestamp timestamp) {
            C12932j.m33818b(str, "shareMessage");
            C12932j.m33818b(list, "sharingOptions");
            C12932j.m33818b(dVar, "broadcastInvitePrefs");
            C12932j.m33818b(aVar, "decisionApi");
            C12932j.m33818b(timestamp, "userCreatedAt");
            this.f15535a = list;
            this.f15536b = dVar;
            this.f15537c = aVar;
            this.f15538d = timestamp;
        }

        /* renamed from: a */
        public final C2594d mo14051a() {
            return this.f15536b;
        }

        /* renamed from: b */
        public final List<C2545e0> mo14052b() {
            return this.f15535a;
        }

        /* renamed from: c */
        public final boolean mo14053c() {
            boolean a = this.f15537c.mo6511a("feature:skipBroadcastInviteFeature");
            if (!C2593c.m8906a(this.f15537c, this.f15536b) || !(!this.f15535a.isEmpty()) || C3245z.m10287f(this.f15538d) < 5 || (!m17119a(a) && !m17120b(a))) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private final boolean m17119a(boolean z) {
            return !z && !this.f15536b.mo8711g();
        }

        /* renamed from: b */
        private final boolean m17120b(boolean z) {
            return z && !this.f15536b.mo8707e() && !this.f15536b.mo8705d();
        }
    }

    /* renamed from: app.zenly.locator.w.a$b */
    public static final class C6180b implements Callback {

        /* renamed from: a */
        private final C3144f f15539a;

        /* renamed from: b */
        private final C3140d f15540b;

        /* renamed from: c */
        private final String f15541c;

        public C6180b(C3144f fVar, C3140d dVar, C1322a aVar, String str) {
            C12932j.m33818b(fVar, "inAppNotificationService");
            C12932j.m33818b(dVar, "notification");
            C12932j.m33818b(aVar, "decisionApi");
            this.f15539a = fVar;
            this.f15540b = dVar;
            this.f15541c = str;
        }

        public void onShareSheetClosed(ShareResult shareResult) {
            int i;
            C12932j.m33818b(shareResult, "shareResult");
            if (shareResult.mo8633c()) {
                if (this.f15541c != null) {
                    i = 0;
                } else {
                    i = shareResult.mo8632b();
                }
                C5343a U = C5343a.m15160U();
                C12932j.m33815a((Object) U, "Analytics.get()");
                AnalyticsTracker a = U.mo12806a();
                C12932j.m33815a((Object) a, "Analytics.get().tracker");
                C2590a aVar = new C2590a(a);
                C2591a aVar2 = C2591a.BRUCE;
                String str = this.f15541c;
                C2590a.m8901a(aVar, aVar2, str != null ? str : shareResult.mo8628a(), i, false, 8, null);
                this.f15539a.mo9474a(this.f15540b);
            }
        }
    }

    /* renamed from: app.zenly.locator.w.a$c */
    static final class C6181c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6177a f15542e;

        /* renamed from: f */
        final /* synthetic */ TextView f15543f;

        /* renamed from: g */
        final /* synthetic */ View f15544g;

        /* renamed from: h */
        final /* synthetic */ int f15545h;

        /* renamed from: i */
        final /* synthetic */ C2545e0 f15546i;

        /* renamed from: j */
        final /* synthetic */ C3140d f15547j;

        /* renamed from: k */
        final /* synthetic */ C1322a f15548k;

        C6181c(C6177a aVar, TextView textView, View view, int i, C2545e0 e0Var, C3140d dVar, C1322a aVar2) {
            this.f15542e = aVar;
            this.f15543f = textView;
            this.f15544g = view;
            this.f15545h = i;
            this.f15546i = e0Var;
            this.f15547j = dVar;
            this.f15548k = aVar2;
        }

        public final void onClick(View view) {
            TextView textView = this.f15543f;
            C12932j.m33815a((Object) textView, "tapToOpenButton");
            textView.setVisibility(4);
            View view2 = this.f15544g;
            C12932j.m33815a((Object) view2, "view");
            ProgressBar progressBar = (ProgressBar) view2.findViewById(C3891l.tap_to_open_progress_bar);
            C12932j.m33815a((Object) progressBar, "view.tap_to_open_progress_bar");
            progressBar.setVisibility(0);
            BaseActivity a = this.f15542e.f15533a;
            if (a != null) {
                C2620u uVar = new C2620u(a);
                String string = this.f15542e.f15533a.getString(R.string.sharesheet_broadcastedInvite_title);
                C12932j.m33815a((Object) string, "activity.getString(R.str…_broadcastedInvite_title)");
                C2620u.m8944a(uVar, null, string, new MessageShareContent(null, this.f15545h), C2591a.BRUCE, this.f15546i, new C6180b(this.f15542e.f15534b, this.f15547j, this.f15548k, this.f15546i.mo8688c()), 1, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    /* renamed from: app.zenly.locator.w.a$d */
    static final class C6182d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6177a f15549e;

        /* renamed from: f */
        final /* synthetic */ int f15550f;

        /* renamed from: g */
        final /* synthetic */ C3140d f15551g;

        /* renamed from: h */
        final /* synthetic */ C1322a f15552h;

        /* renamed from: i */
        final /* synthetic */ C2545e0 f15553i;

        C6182d(C6177a aVar, int i, C3140d dVar, C1322a aVar2, C2545e0 e0Var) {
            this.f15549e = aVar;
            this.f15550f = i;
            this.f15551g = dVar;
            this.f15552h = aVar2;
            this.f15553i = e0Var;
        }

        public final void onClick(View view) {
            BaseActivity a = this.f15549e.f15533a;
            if (a != null) {
                C2620u uVar = new C2620u(a);
                String string = this.f15549e.f15533a.getString(R.string.sharesheet_broadcastedInvite_title);
                C12932j.m33815a((Object) string, "activity.getString(R.str…_broadcastedInvite_title)");
                C2620u.m8944a(uVar, null, string, new MessageShareContent(null, this.f15550f), C2591a.BRUCE, null, new C6180b(this.f15549e.f15534b, this.f15551g, this.f15552h, this.f15553i.mo8688c()), 17, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    /* renamed from: app.zenly.locator.w.a$e */
    static final class C6183e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6177a f15554e;

        /* renamed from: f */
        final /* synthetic */ C3140d f15555f;

        C6183e(C6177a aVar, C3140d dVar) {
            this.f15554e = aVar;
            this.f15555f = dVar;
        }

        public final void onClick(View view) {
            this.f15554e.f15534b.mo9474a(this.f15555f);
        }
    }

    /* renamed from: app.zenly.locator.w.a$f */
    static final class C6184f implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C6178a f15556e;

        C6184f(C6178a aVar) {
            this.f15556e = aVar;
        }

        public final void run() {
            this.f15556e.mo14051a().mo8710g(true);
        }
    }

    public C6177a(BaseActivity baseActivity, C3144f fVar) {
        C12932j.m33818b(baseActivity, "activity");
        C12932j.m33818b(fVar, "inAppNotificationService");
        this.f15533a = baseActivity;
        this.f15534b = fVar;
    }

    /* renamed from: a */
    public final void mo14050a(C6178a aVar) {
        C6178a aVar2 = aVar;
        C12932j.m33818b(aVar2, "broadcastInviteNotification");
        C2545e0 e0Var = (C2545e0) C12857w.m33683g(aVar.mo14052b());
        if (e0Var != null) {
            DecorView a = this.f15534b.mo9473a();
            Context context = a.getContext();
            C12932j.m33815a((Object) context, "context");
            C1322a a2 = C3444a.m10686a(context);
            View inflate = LayoutInflater.from(context).inflate(R.layout.notification_broadcast_invite, a.getInAppNotificationContainer(), false);
            C12932j.m33815a((Object) inflate, "view");
            C3140d dVar = new C3140d(inflate, true, false, null, new C6184f(aVar2), 12, null);
            float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.corner_radius_300);
            C2476d.m8583a(inflate).m8714a().m8682a(Integer.valueOf(e0Var.mo8683a())).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a(dimensionPixelSize))).m8691a(C8978i.f23426d).mo24173a((ImageView) inflate.findViewById(C3891l.sharing_app_icon));
            C2476d.m8583a(inflate).m8714a().m8682a(Integer.valueOf(2131231316)).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a(dimensionPixelSize))).m8691a(C8978i.f23426d).mo24173a((ImageView) inflate.findViewById(C3891l.zenly_icon));
            TextView textView = (TextView) inflate.findViewById(C3891l.notification_title);
            String a3 = C2596e.m8923a(e0Var, context);
            C12932j.m33815a((Object) textView, "notificationTitle");
            textView.setText(context.getString(R.string.banner_broadcastedInvite_title, new Object[]{a3}));
            int b = C3744d.BroadcastInviteBanner.mo10293b();
            aVar.mo14051a().mo8710g(true);
            TextView textView2 = (TextView) inflate.findViewById(C3891l.tap_to_open_button);
            C12932j.m33815a((Object) textView2, "tapToOpenButton");
            textView2.setText(context.getString(R.string.onboarding_broadcastedInvite_button_open, new Object[]{a3}));
            C2545e0 e0Var2 = e0Var;
            C3140d dVar2 = dVar;
            View view = inflate;
            C6181c cVar = new C6181c(this, textView2, inflate, b, e0Var2, dVar, a2);
            textView2.setOnClickListener(cVar);
            TextView textView3 = (TextView) view.findViewById(C3891l.other_apps);
            C6182d dVar3 = new C6182d(this, b, dVar2, a2, e0Var2);
            textView3.setOnClickListener(dVar3);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(C3891l.btn_close);
            C12932j.m33815a((Object) appCompatImageButton, "btnClose");
            appCompatImageButton.setVisibility(0);
            appCompatImageButton.setOnClickListener(new C6183e(this, dVar2));
            this.f15534b.mo9476b(dVar2);
        }
    }
}
