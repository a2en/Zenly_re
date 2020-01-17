package app.zenly.locator.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0540a;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.invitations.AppShareSheetFragment;
import app.zenly.locator.core.invitations.AppShareSheetFragment.C2519a;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import app.zenly.locator.core.invitations.C2545e0.C2554e;
import app.zenly.locator.core.invitations.C2545e0.C2564j;
import app.zenly.locator.core.invitations.C2545e0.C2566k;
import app.zenly.locator.core.invitations.C2620u;
import app.zenly.locator.core.invitations.MessageShareContent;
import app.zenly.locator.core.invitations.ShareContent;
import app.zenly.locator.core.invitations.ShareResult;
import app.zenly.locator.core.invitations.p068g0.C2590a;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.invitations.p068g0.C2597f;
import app.zenly.locator.core.util.C3236s;
import app.zenly.locator.decision.p082b.p083u.C3498n;
import app.zenly.locator.experimental.referrer.C3746a;
import app.zenly.locator.experimental.referrer.C3746a.C3747a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.target.C9231d;
import com.bumptech.glide.request.transition.Transition;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7174n2.C7175a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.p405m.C12773a;

public final class BroadcastInviteOtherAppsController extends BaseSignupController {

    /* renamed from: T */
    private final C12275b f12514T = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ShareResult f12515U;

    /* renamed from: V */
    private final BroadcastInviteOtherAppsController$receiver$1 f12516V;

    /* renamed from: app.zenly.locator.onboarding.BroadcastInviteOtherAppsController$a */
    public static final class C4735a {
        private C4735a() {
        }

        public /* synthetic */ C4735a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.BroadcastInviteOtherAppsController$b */
    static final class C4736b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2545e0 f12517e;

        /* renamed from: f */
        final /* synthetic */ int f12518f;

        /* renamed from: g */
        final /* synthetic */ BroadcastInviteOtherAppsController f12519g;

        C4736b(C2545e0 e0Var, int i, BroadcastInviteOtherAppsController broadcastInviteOtherAppsController, int i2, List list, Context context, int i3) {
            this.f12517e = e0Var;
            this.f12518f = i;
            this.f12519g = broadcastInviteOtherAppsController;
        }

        public final void onClick(View view) {
            this.f12519g.m13762a(this.f12517e, this.f12518f);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.BroadcastInviteOtherAppsController$c */
    public static final class C4737c extends C9231d<TextView, Drawable> {
        C4737c(TextView textView, View view) {
            super(view);
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

    /* renamed from: app.zenly.locator.onboarding.BroadcastInviteOtherAppsController$d */
    static final class C4738d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ BroadcastInviteOtherAppsController f12520e;

        /* renamed from: f */
        final /* synthetic */ Context f12521f;

        C4738d(BroadcastInviteOtherAppsController broadcastInviteOtherAppsController, Context context) {
            this.f12520e = broadcastInviteOtherAppsController;
            this.f12521f = context;
        }

        public final void onClick(View view) {
            BroadcastInviteOtherAppsController broadcastInviteOtherAppsController = this.f12520e;
            String string = this.f12521f.getString(R.string.sharesheet_broadcastedInvite_title);
            C12932j.m33815a((Object) string, "context.getString(R.stri…_broadcastedInvite_title)");
            broadcastInviteOtherAppsController.m13765a(string, (ShareContent) new MessageShareContent(null, C3744d.BroadcastInviteOnboarding.mo10293b()));
        }
    }

    /* renamed from: app.zenly.locator.onboarding.BroadcastInviteOtherAppsController$e */
    static final class C4739e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ BroadcastInviteOtherAppsController f12522e;

        C4739e(BroadcastInviteOtherAppsController broadcastInviteOtherAppsController) {
            this.f12522e = broadcastInviteOtherAppsController;
        }

        public final void onClick(View view) {
            this.f12522e.m13760E();
            this.f12522e.mo11926D();
        }
    }

    static {
        new C4735a(null);
    }

    public BroadcastInviteOtherAppsController() {
        ShareResult shareResult = new ShareResult(false, null, 0, 7, null);
        this.f12515U = shareResult;
        this.f12516V = new BroadcastInviteOtherAppsController$receiver$1(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m13760E() {
        Activity A = mo9304A();
        if (A != null) {
            SignupListener signupListener = (SignupListener) A;
            C7175a cache = signupListener.getCache();
            C12932j.m33815a((Object) cache, "signupListener.cache");
            cache.mo19170b(54);
            signupListener.saveCache();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.onboarding.BaseSignupController.SignupListener");
    }

    /* renamed from: B */
    public int mo7192B() {
        return 54;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        if (VERSION.SDK_INT >= 22) {
            mo9304A().unregisterReceiver(this.f12516V);
        }
        this.f12514T.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        if (VERSION.SDK_INT >= 22) {
            mo9304A().registerReceiver(this.f12516V, new IntentFilter("app.zenly.locator.action.ACTION_SHARE"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        List list;
        int i;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C12932j.m33818b(layoutInflater2, "inflater");
        C12932j.m33818b(viewGroup2, "container");
        int i2 = 0;
        View inflate = layoutInflater2.inflate(R.layout.controller_broadcast_invite_other_apps, viewGroup2, false);
        C12932j.m33815a((Object) inflate, "view");
        Context context = inflate.getContext();
        TextView textView = (TextView) inflate.findViewById(C3891l.share_title);
        C12932j.m33815a((Object) textView, "view.share_title");
        textView.setText(context.getString(R.string.sharesheet_broadcastedInvite_title));
        C2554e eVar = C2545e0.f7606d;
        C12932j.m33815a((Object) context, "context");
        Locale locale = Locale.getDefault();
        C12932j.m33815a((Object) locale, "Locale.getDefault()");
        List a = eVar.mo8689a(context, locale, true);
        TextView[] textViewArr = new TextView[6];
        View findViewById = inflate.findViewById(C3891l.share_app_1);
        String str = "null cannot be cast to non-null type android.widget.TextView";
        if (findViewById != null) {
            textViewArr[0] = (TextView) findViewById;
            View findViewById2 = inflate.findViewById(C3891l.share_app_2);
            if (findViewById2 != null) {
                textViewArr[1] = (TextView) findViewById2;
                View findViewById3 = inflate.findViewById(C3891l.share_app_3);
                if (findViewById3 != null) {
                    textViewArr[2] = (TextView) findViewById3;
                    View findViewById4 = inflate.findViewById(C3891l.share_app_4);
                    if (findViewById4 != null) {
                        textViewArr[3] = (TextView) findViewById4;
                        View findViewById5 = inflate.findViewById(C3891l.share_app_5);
                        if (findViewById5 != null) {
                            textViewArr[4] = (TextView) findViewById5;
                            View findViewById6 = inflate.findViewById(C3891l.share_app_6);
                            if (findViewById6 != null) {
                                textViewArr[5] = (TextView) findViewById6;
                                List b = C12848o.m33643b((Object[]) textViewArr);
                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.grid_size_400);
                                int min = Math.min(b.size(), a.size());
                                int i3 = 0;
                                for (Object next : b) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        TextView textView2 = (TextView) next;
                                        if (i3 < min) {
                                            textView2.setVisibility(i2);
                                            C2545e0 e0Var = (C2545e0) a.get(i3);
                                            if (C12932j.m33817a((Object) e0Var, (Object) C2564j.f7626e)) {
                                                i = C2566k.f7628e.mo8683a();
                                            } else {
                                                i = e0Var.mo8683a();
                                            }
                                            C2476d.m8582a(context).m8717a(Integer.valueOf(i)).mo8541d().m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a((float) context.getResources().getDimensionPixelSize(R.dimen.corner_radius_300)))).mo8522b(dimensionPixelSize).mo24171a(new C4737c(textView2, textView2));
                                            textView2.setText(context.getString(e0Var.mo8687b()));
                                            C4736b bVar = r0;
                                            list = a;
                                            TextView textView3 = textView2;
                                            C4736b bVar2 = new C4736b(e0Var, i3, this, min, a, context, dimensionPixelSize);
                                            textView3.setOnClickListener(bVar);
                                            textView3.setTextColor(C0540a.m2536a(context, (int) R.color.white));
                                        } else {
                                            list = a;
                                            textView2.setVisibility(8);
                                        }
                                        a = list;
                                        i3 = i4;
                                        i2 = 0;
                                    } else {
                                        C12844m.m33616c();
                                        throw null;
                                    }
                                }
                                ((AppCompatTextView) inflate.findViewById(C3891l.share_other)).setOnClickListener(new C4738d(this, context));
                                ((AppCompatImageButton) inflate.findViewById(C3891l.button_next)).setOnClickListener(new C4739e(this));
                                return inflate;
                            }
                            throw new TypeCastException(str);
                        }
                        throw new TypeCastException(str);
                    }
                    throw new TypeCastException(str);
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        super.mo8182a(i, i2, intent);
        if (i == 302) {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            C2590a.m8901a(new C2590a(a), C2591a.ONBOARDING, this.f12515U.mo8628a(), -1, false, 8, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13765a(String str, ShareContent shareContent) {
        Intent intent;
        C5408a aVar = C5407g.f13966d;
        Activity A = mo9304A();
        String str2 = "requireActivity()";
        C12932j.m33815a((Object) A, str2);
        new C2594d(aVar.mo12991a(A).mo12986h()).mo8710g(true);
        if (shareContent instanceof MessageShareContent) {
            if (VERSION.SDK_INT >= 22) {
                C2519a aVar2 = AppShareSheetFragment.f7542n;
                Activity A2 = mo9304A();
                C12932j.m33815a((Object) A2, str2);
                IntentSender a = aVar2.mo8600a(A2);
                C3747a aVar3 = C3746a.f10026e;
                Activity A3 = mo9304A();
                C12932j.m33815a((Object) A3, str2);
                MessageShareContent messageShareContent = (MessageShareContent) shareContent;
                intent = C3236s.m10255a(messageShareContent.mo8620a(), str, C3746a.m11181a(aVar3.mo10297a(A3), messageShareContent.mo8621b(), null, 2, null), a);
            } else {
                C3747a aVar4 = C3746a.f10026e;
                Activity A4 = mo9304A();
                C12932j.m33815a((Object) A4, str2);
                intent = C3236s.m10254a(((MessageShareContent) shareContent).mo8620a(), str, C3746a.m11181a(aVar4.mo10297a(A4), 0, null, 3, null));
            }
            mo23903a(intent, 302);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13762a(C2545e0 e0Var, int i) {
        C5408a aVar = C5407g.f13966d;
        Activity A = mo9304A();
        String str = "requireActivity()";
        C12932j.m33815a((Object) A, str);
        new C2594d(aVar.mo12991a(A).mo12986h()).mo8710g(true);
        C5343a U = C5343a.m15160U();
        C12932j.m33815a((Object) U, "Analytics.get()");
        AnalyticsTracker a = U.mo12806a();
        C12932j.m33815a((Object) a, "Analytics.get().tracker");
        C2590a.m8901a(new C2590a(a), C2591a.ONBOARDING, e0Var.mo8688c(), i, false, 8, null);
        int b = C3744d.BroadcastInviteOnboarding.mo10293b();
        if (!C12932j.m33817a((Object) e0Var, (Object) C2549b0.f7613e) || !C3498n.f9481a.isOpen()) {
            Activity A2 = mo9304A();
            C12932j.m33815a((Object) A2, str);
            if (A2 != null) {
                C2620u uVar = new C2620u((FragmentActivity) A2);
                String string = A2.getString(R.string.sharesheet_broadcastedInvite_title);
                C12932j.m33815a((Object) string, "activity.getString(R.str…_broadcastedInvite_title)");
                C2620u.m8944a(uVar, null, string, new MessageShareContent(null, b), C2591a.ONBOARDING, e0Var, null, 33, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
        Activity A3 = mo9304A();
        C12932j.m33815a((Object) A3, str);
        C12773a.m33432a(new C2597f(A3, b).mo8714a(), this.f12514T);
    }
}
