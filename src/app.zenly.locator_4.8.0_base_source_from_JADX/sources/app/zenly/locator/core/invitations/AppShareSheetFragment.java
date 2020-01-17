package app.zenly.locator.core.invitations;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.core.invitations.C2545e0.C2554e;
import app.zenly.locator.core.invitations.p068g0.C2590a;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.util.C3236s;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.referrer.C3746a;
import app.zenly.locator.experimental.referrer.C3746a.C3747a;
import app.zenly.locator.p143s.C5343a;
import com.bumptech.glide.request.target.C9231d;
import com.bumptech.glide.request.transition.Transition;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p255e.C7662d;

public final class AppShareSheetFragment extends C1321b {

    /* renamed from: m */
    static final /* synthetic */ KProperty[] f7541m;

    /* renamed from: n */
    public static final C2519a f7542n = new C2519a(null);

    /* renamed from: f */
    private final ReadWriteProperty f7543f = C7662d.m18665a((Parcelable) null, 1, (Object) null);

    /* renamed from: g */
    private final ReadWriteProperty f7544g = C7662d.m18671c();

    /* renamed from: h */
    private final ReadWriteProperty f7545h = C7662d.m18670b();

    /* renamed from: i */
    private final ReadWriteProperty f7546i = C7662d.m18667a((String) null, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ShareResult f7547j;

    /* renamed from: k */
    private final AppShareSheetFragment$receiver$1 f7548k;

    /* renamed from: l */
    private HashMap f7549l;

    /* renamed from: app.zenly.locator.core.invitations.AppShareSheetFragment$a */
    public static final class C2519a {
        private C2519a() {
        }

        /* renamed from: a */
        public final IntentSender mo8600a(Context context) {
            C12932j.m33818b(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("app.zenly.locator.action.ACTION_SHARE"), 0);
            C12932j.m33815a((Object) broadcast, "pendingIntent");
            IntentSender intentSender = broadcast.getIntentSender();
            C12932j.m33815a((Object) intentSender, "pendingIntent.intentSender");
            return intentSender;
        }

        public /* synthetic */ C2519a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.AppShareSheetFragment$b */
    static final class C2520b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2545e0 f7550e;

        /* renamed from: f */
        final /* synthetic */ int f7551f;

        /* renamed from: g */
        final /* synthetic */ AppShareSheetFragment f7552g;

        C2520b(C2545e0 e0Var, int i, AppShareSheetFragment appShareSheetFragment, List list, C2485i iVar, int i2) {
            this.f7550e = e0Var;
            this.f7551f = i;
            this.f7552g = appShareSheetFragment;
        }

        public final void onClick(View view) {
            if (this.f7550e.mo8688c() != null) {
                this.f7552g.f7547j.mo8630a(this.f7550e.mo8688c());
                this.f7552g.f7547j.mo8629a(this.f7551f);
                if (this.f7552g.m8784g()) {
                    C5343a U = C5343a.m15160U();
                    C12932j.m33815a((Object) U, "Analytics.get()");
                    AnalyticsTracker a = U.mo12806a();
                    C12932j.m33815a((Object) a, "Analytics.get().tracker");
                    C2590a aVar = new C2590a(a);
                    String b = this.f7552g.mo6614b();
                    if (b != null) {
                        C2591a valueOf = C2591a.valueOf(b);
                        String a2 = this.f7552g.f7547j.mo8628a();
                        int i = this.f7551f;
                        Context requireContext = this.f7552g.requireContext();
                        C12932j.m33815a((Object) requireContext, "requireContext()");
                        aVar.mo8695a(valueOf, a2, i, C3444a.m10686a(requireContext).mo6511a("feature:SocialNetworkInOnboarding"));
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                } else {
                    AppShareSheetFragment appShareSheetFragment = this.f7552g;
                    appShareSheetFragment.m8782c(appShareSheetFragment.f7547j.mo8628a());
                }
                C2545e0 e0Var = this.f7550e;
                AppShareSheetFragment appShareSheetFragment2 = this.f7552g;
                e0Var.mo8685a((Fragment) appShareSheetFragment2, appShareSheetFragment2.mo8597c());
            }
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.AppShareSheetFragment$c */
    public static final class C2521c extends C9231d<TextView, Drawable> {
        C2521c(View view, View view2) {
            super(view2);
        }

        /* renamed from: a */
        public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
            C12932j.m33818b(drawable, "resource");
            View a = mo24907a();
            C12932j.m33815a((Object) a, "getView()");
            C1315a.m6318a((TextView) a, (Drawable) null, drawable, (Drawable) null, (Drawable) null, 13, (Object) null);
        }

        public void onLoadFailed(Drawable drawable) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8503a(Drawable drawable) {
            View a = mo24907a();
            C12932j.m33815a((Object) a, "getView()");
            C1315a.m6318a((TextView) a, (Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null, 13, (Object) null);
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.AppShareSheetFragment$d */
    static final class C2522d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ AppShareSheetFragment f7553e;

        C2522d(AppShareSheetFragment appShareSheetFragment) {
            this.f7553e = appShareSheetFragment;
        }

        public final void onClick(View view) {
            AppShareSheetFragment appShareSheetFragment = this.f7553e;
            appShareSheetFragment.m8780a(appShareSheetFragment.mo8598d(), (ShareContent) this.f7553e.mo8597c());
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(AppShareSheetFragment.class), "trackingInfo", "getTrackingInfo()Lapp/zenly/locator/core/invitations/FriendRequestTrackingInfo;");
        C12946x.m33837a((C12934l) mVar);
        C12935m mVar2 = new C12935m(C12946x.m33834a(AppShareSheetFragment.class), "title", "getTitle()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar2);
        C12935m mVar3 = new C12935m(C12946x.m33834a(AppShareSheetFragment.class), "shareContent", "getShareContent()Lapp/zenly/locator/core/invitations/MessageShareContent;");
        C12946x.m33837a((C12934l) mVar3);
        C12935m mVar4 = new C12935m(C12946x.m33834a(AppShareSheetFragment.class), "broadcastOrigin", "getBroadcastOrigin()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar4);
        f7541m = new KProperty[]{mVar, mVar2, mVar3, mVar4};
    }

    public AppShareSheetFragment() {
        ShareResult shareResult = new ShareResult(false, null, 0, 7, null);
        this.f7547j = shareResult;
        this.f7548k = new AppShareSheetFragment$receiver$1(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8782c(String str) {
        if (m8785h() && !m8784g()) {
            C5343a.m15160U().mo12886g(str);
            FriendRequestTrackingInfo e = mo8599e();
            if (e == null) {
                return;
            }
            if (e.mo8614f()) {
                C5343a.m15160U().mo12813a(e);
            } else {
                C5343a.m15160U().mo12857b(e);
            }
        }
    }

    /* renamed from: f */
    private final void m8783f() {
        this.f7547j.mo8631a(true);
        Intent putExtra = new Intent().putExtra("app.zenly.locator.extra.SHARE_STATE", this.f7547j);
        C12932j.m33815a((Object) putExtra, "Intent().putExtra(AppSha…SHARE_STATE, shareResult)");
        requireActivity().setResult(-1, putExtra);
        requireActivity().finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final boolean m8784g() {
        return mo6614b() != null;
    }

    /* renamed from: h */
    private final boolean m8785h() {
        return mo8597c().mo8620a() != null;
    }

    /* renamed from: a */
    public View mo8592a(int i) {
        if (this.f7549l == null) {
            this.f7549l = new HashMap();
        }
        View view = (View) this.f7549l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7549l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f7549l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo8593a(FriendRequestTrackingInfo friendRequestTrackingInfo) {
        this.f7543f.setValue(this, f7541m[0], friendRequestTrackingInfo);
    }

    /* renamed from: a */
    public final void mo8594a(MessageShareContent messageShareContent) {
        C12932j.m33818b(messageShareContent, "<set-?>");
        this.f7545h.setValue(this, f7541m[2], messageShareContent);
    }

    /* renamed from: a */
    public final void mo8595a(String str) {
        this.f7546i.setValue(this, f7541m[3], str);
    }

    /* renamed from: b */
    public final String mo6614b() {
        return (String) this.f7546i.getValue(this, f7541m[3]);
    }

    /* renamed from: b */
    public final void mo8596b(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f7544g.setValue(this, f7541m[1], str);
    }

    /* renamed from: c */
    public final MessageShareContent mo8597c() {
        return (MessageShareContent) this.f7545h.getValue(this, f7541m[2]);
    }

    /* renamed from: d */
    public final String mo8598d() {
        return (String) this.f7544g.getValue(this, f7541m[1]);
    }

    /* renamed from: e */
    public final FriendRequestTrackingInfo mo8599e() {
        return (FriendRequestTrackingInfo) this.f7543f.getValue(this, f7541m[0]);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 302 || i == 303) {
            m8783f();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            String str = "INSTANCE_SHARE_RESULT";
            if (bundle.containsKey(str)) {
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable != null) {
                    this.f7547j = (ShareResult) parcelable;
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
        if (VERSION.SDK_INT >= 22) {
            requireActivity().registerReceiver(this.f7548k, new IntentFilter("app.zenly.locator.action.ACTION_SHARE"));
        }
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        C2666b.m9049a(requireContext).mo8764b();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_app_share_sheet, viewGroup, false);
    }

    public void onDestroy() {
        if (VERSION.SDK_INT >= 22) {
            requireActivity().unregisterReceiver(this.f7548k);
        }
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C12932j.m33818b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("INSTANCE_SHARE_RESULT", this.f7547j);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) mo8592a(C3891l.share_title);
        C12932j.m33815a((Object) textView, "share_title");
        textView.setText(mo8598d());
        C2485i a = C2476d.m8582a(requireContext());
        C12932j.m33815a((Object) a, "GlideApp.with(requireContext())");
        Context requireContext = requireContext();
        String str = "requireContext()";
        C12932j.m33815a((Object) requireContext, str);
        int dimensionPixelSize = requireContext.getResources().getDimensionPixelSize(R.dimen.grid_size_400);
        C2554e eVar = C2545e0.f7606d;
        Context requireContext2 = requireContext();
        C12932j.m33815a((Object) requireContext2, str);
        Locale locale = Locale.getDefault();
        C12932j.m33815a((Object) locale, "Locale.getDefault()");
        int i = 0;
        List a2 = eVar.mo8689a(requireContext2, locale, mo6614b() != null);
        View[] viewArr = {mo8592a(C3891l.share_app_1), mo8592a(C3891l.share_app_2), mo8592a(C3891l.share_app_3), mo8592a(C3891l.share_app_4), mo8592a(C3891l.share_app_5), mo8592a(C3891l.share_app_6)};
        int length = viewArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            View view2 = viewArr[i3];
            int i4 = i2 + 1;
            C2545e0 e0Var = (C2545e0) C12857w.m33673c(a2, i2);
            String str2 = "item";
            if (e0Var != null) {
                C12932j.m33815a((Object) view2, str2);
                view2.setVisibility(i);
                TextView textView2 = (TextView) view2;
                a.m8717a(Integer.valueOf(e0Var.mo8683a())).mo8541d().mo8522b(dimensionPixelSize).mo24171a(new C2521c(view2, textView2));
                textView2.setText(e0Var.mo8687b());
                C2520b bVar = r0;
                C2520b bVar2 = new C2520b(e0Var, i2, this, a2, a, dimensionPixelSize);
                view2.setOnClickListener(bVar);
            } else {
                C12932j.m33815a((Object) view2, str2);
                view2.setVisibility(8);
            }
            i3++;
            i2 = i4;
            i = 0;
        }
        ((AppCompatTextView) mo8592a(C3891l.share_other)).setOnClickListener(new C2522d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8780a(String str, ShareContent shareContent) {
        Intent intent;
        String str2 = "system_share_sheet";
        String str3 = "requireContext()";
        if (!m8784g()) {
            C5343a.m15160U().mo12911w();
            m8782c(str2);
        } else {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            C2590a aVar = new C2590a(a);
            String b = mo6614b();
            if (b != null) {
                C2591a valueOf = C2591a.valueOf(b);
                Context requireContext = requireContext();
                C12932j.m33815a((Object) requireContext, str3);
                aVar.mo8695a(valueOf, str2, -1, C3444a.m10686a(requireContext).mo6511a("feature:SocialNetworkInOnboarding"));
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
        if (shareContent instanceof MessageShareContent) {
            if (VERSION.SDK_INT >= 22) {
                C2519a aVar2 = f7542n;
                Context requireContext2 = requireContext();
                C12932j.m33815a((Object) requireContext2, str3);
                IntentSender a2 = aVar2.mo8600a(requireContext2);
                C3747a aVar3 = C3746a.f10026e;
                Context requireContext3 = requireContext();
                C12932j.m33815a((Object) requireContext3, str3);
                MessageShareContent messageShareContent = (MessageShareContent) shareContent;
                intent = C3236s.m10255a(messageShareContent.mo8620a(), str, C3746a.m11181a(aVar3.mo10297a(requireContext3), messageShareContent.mo8621b(), null, 2, null), a2);
            } else {
                C3747a aVar4 = C3746a.f10026e;
                Context requireContext4 = requireContext();
                C12932j.m33815a((Object) requireContext4, str3);
                intent = C3236s.m10254a(((MessageShareContent) shareContent).mo8620a(), str, C3746a.m11181a(aVar4.mo10297a(requireContext4), 0, null, 3, null));
            }
            startActivityForResult(intent, 302);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
