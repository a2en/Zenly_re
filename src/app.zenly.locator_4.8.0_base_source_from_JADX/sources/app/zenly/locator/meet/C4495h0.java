package app.zenly.locator.meet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.view.C0143b;
import app.zenly.android.feature.polenta.widget.C1447a;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.p072ui.activity.CopyToClipboardActivity;
import app.zenly.locator.core.p072ui.activity.ForwardIntentActivity;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.util.C3199e;
import app.zenly.locator.core.util.C3227n;
import app.zenly.locator.core.util.C3236s;
import app.zenly.locator.meet.MeetContract.C4479a;
import app.zenly.locator.meet.MeetContract.View;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import app.zenly.locator.p143s.p160v.p161b.C5530d;
import com.airbnb.lottie.LottieAnimationView;
import com.bluelinelabs.conductor.C8819d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.meet.h0 */
public final class C4495h0 extends ZenlyController implements View {

    /* renamed from: P */
    private final String f12074P;

    /* renamed from: Q */
    private boolean f12075Q;

    /* renamed from: R */
    private android.view.View f12076R;

    /* renamed from: S */
    private android.view.View f12077S;

    /* renamed from: T */
    private TextView f12078T;

    /* renamed from: U */
    private ImageButton f12079U;

    /* renamed from: V */
    private TextView f12080V;

    /* renamed from: W */
    private LottieAnimationView f12081W;

    /* renamed from: X */
    private C4498c f12082X;

    /* renamed from: Y */
    private C4498c f12083Y;

    /* renamed from: Z */
    private TextView f12084Z;

    /* renamed from: a0 */
    private ImageButton f12085a0;

    /* renamed from: b0 */
    private android.view.View f12086b0;

    /* renamed from: c0 */
    private android.view.View f12087c0;

    /* renamed from: d0 */
    private BottomSheetBehavior f12088d0;

    /* renamed from: e0 */
    private ValueAnimator f12089e0;

    /* renamed from: f0 */
    private C4502j0 f12090f0;

    /* renamed from: g0 */
    private NavigationContract f12091g0;

    /* renamed from: h0 */
    private FriendStore f12092h0;

    /* renamed from: app.zenly.locator.meet.h0$a */
    class C4496a extends C10744c {
        C4496a() {
        }

        /* renamed from: a */
        public void mo7859a(android.view.View view, int i) {
            if (i == 5) {
                C4495h0.this.mo23946k().mo23997a((C8819d) C4495h0.this);
            }
        }

        /* renamed from: a */
        public void mo7858a(android.view.View view, float f) {
            float f2 = 1.0f;
            if (!Float.isNaN(f)) {
                f2 = 1.0f + f;
            }
            C4495h0.this.onMeetHeightChanged((int) (((float) view.getHeight()) * f2));
        }
    }

    /* renamed from: app.zenly.locator.meet.h0$b */
    class C4497b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ Context f12094e;

        /* renamed from: f */
        final /* synthetic */ String f12095f;

        /* renamed from: g */
        final /* synthetic */ String f12096g;

        C4497b(C4495h0 h0Var, Context context, String str, String str2) {
            this.f12094e = context;
            this.f12095f = str;
            this.f12096g = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                C3199e.m10178a(this.f12094e, this.f12095f);
            } else if (i == 1) {
                C3199e.m10178a(this.f12094e, this.f12096g);
            } else if (i == 2) {
                Intent b = C3236s.m10262b(this.f12094e.getString(R.string.meetview_send_appendix, new Object[]{this.f12095f}));
                C3236s.m10261a(this.f12094e, "", b);
            }
        }
    }

    /* renamed from: app.zenly.locator.meet.h0$c */
    private static final class C4498c {

        /* renamed from: a */
        final android.view.View f12097a;

        /* renamed from: b */
        final TextView f12098b = ((TextView) this.f12097a.findViewById(R.id.title));

        /* renamed from: c */
        final TextView f12099c = ((TextView) this.f12097a.findViewById(R.id.subtitle));

        /* renamed from: d */
        final List<CharacterStyle> f12100d;

        C4498c(android.view.View view) {
            this.f12097a = view;
            this.f12100d = C3227n.m10229a((T[]) new CharacterStyle[]{new C7691b(view.getContext(), C7770f.TextAppearance_LCD), new C7690a(view.getContext(), (int) R.color.selector_text_color_primary_with_select_button_secondary)});
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11671a(long j) {
            TextView textView = this.f12099c;
            textView.setText(C5521c.m15667a(textView.getContext(), j, this.f12100d));
            mo11672a(true);
            mo11675c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo11673b(boolean z) {
            this.f12097a.setSelected(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo11675c() {
            this.f12097a.setVisibility(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo11676d() {
            this.f12099c.setText(R.string.meetview_hidden_time);
            mo11672a(false);
            mo11675c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo11674b() {
            return this.f12097a.isSelected();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11670a() {
            this.f12097a.setVisibility(8);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11672a(boolean z) {
            this.f12097a.setEnabled(z);
        }
    }

    public C4495h0(String str) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("KEY_USER_UUID", str);
        this(dVar.mo9605a());
    }

    /* access modifiers changed from: private */
    public void onMeetHeightChanged(int i) {
        NavigationContract navigationContract = this.f12091g0;
        if (navigationContract != null) {
            navigationContract.onMeetHeightChanged(i);
        }
    }

    /* renamed from: B */
    public /* synthetic */ void mo7192B() {
        this.f12088d0.mo30690c(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(android.view.View view) {
        super.mo7052b(view);
        this.f12090f0.subscribe();
        if (mo23947l() instanceof NavigationContract) {
            this.f12091g0 = (NavigationContract) mo23947l();
            String fogDisplayName = this.f12091g0.getFogDisplayName();
            if (fogDisplayName != null) {
                setupMeetViewForFogview(fogDisplayName);
            }
        }
        if (this.f12088d0.mo30689c() == 5) {
            this.f12087c0.post(new C4501j(this));
        } else {
            onMeetHeightChanged(this.f12088d0.mo30680a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(android.view.View view) {
        onMeetHeightChanged(0);
        this.f12091g0 = null;
        this.f12090f0.unsubscribe();
        ValueAnimator valueAnimator = this.f12089e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.mo7053d(view);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(android.view.View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f12090f0.resolveAddress();
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(android.view.View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f12090f0.callFriend();
    }

    /* renamed from: g */
    public /* synthetic */ void mo11666g(android.view.View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f12090f0.getNavigation(this.f12082X.mo11674b() ? C4479a.WALKING : C4479a.DRIVING);
    }

    /* renamed from: h */
    public /* synthetic */ void mo11667h(android.view.View view) {
        this.f12090f0.switchNavigation(0);
    }

    public boolean handleBack() {
        if (this.f12088d0.mo30689c() == 5) {
            return false;
        }
        this.f12088d0.mo30690c(5);
        return true;
    }

    public void hideFogViewMode() {
        this.f12086b0.setVisibility(8);
    }

    /* renamed from: i */
    public /* synthetic */ void mo11668i(android.view.View view) {
        this.f12090f0.switchNavigation(2);
    }

    public void onWindowInsetsChanged(android.view.View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        android.view.View view2 = this.f12087c0;
        view2.setPadding(view2.getPaddingLeft(), this.f12087c0.getPaddingTop(), this.f12087c0.getPaddingRight(), rect.bottom);
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, view.getPaddingBottom());
    }

    public void selectTransport(boolean z) {
        if (z) {
            this.f12082X.mo11673b(true);
            this.f12083Y.mo11673b(false);
            return;
        }
        this.f12082X.mo11673b(false);
        this.f12083Y.mo11673b(true);
    }

    public void setupMeetViewForFogview(String str) {
        this.f12076R.setVisibility(8);
        this.f12086b0.setVisibility(0);
        TextView textView = (TextView) this.f12086b0.findViewById(R.id.subtitle);
        ((TextView) this.f12086b0.findViewById(R.id.title)).setText(C7709b.m18762a(mo23920b(), R.string.fogview_education_title));
        textView.setText(mo23920b().getString(R.string.fogview_education_message, new Object[]{str}));
    }

    public void showAddress(String str) {
        this.f12080V.setText(str);
    }

    public void showAddressNotFound() {
        this.f12080V.setText(C7709b.m18762a(mo23920b(), R.string.map_select_user_address_notfound));
    }

    public void showBlurredMode(String str) {
        m13272e(false);
        this.f12078T.setText("🤔 ❓");
        TextView textView = this.f12080V;
        textView.setText(textView.getContext().getString(R.string.meetview_blurred_title, new Object[]{str}));
        this.f12082X.mo11676d();
        this.f12083Y.mo11676d();
        this.f12084Z.setVisibility(0);
        this.f12084Z.setAlpha(0.5f);
        this.f12084Z.setEnabled(false);
        this.f12081W.setVisibility(8);
        this.f12085a0.setVisibility(8);
        this.f12075Q = true;
    }

    public void showCall(String str) {
        C3236s.m10265c(mo23920b(), str);
    }

    public void showDistance(int i) {
        if (this.f12075Q) {
            this.f12075Q = false;
            if (this.f12089e0 == null) {
                this.f12089e0 = new ValueAnimator();
            }
            this.f12089e0.cancel();
            this.f12089e0.setIntValues(new int[]{0, i});
            this.f12089e0.setStartDelay(200);
            this.f12089e0.setDuration(600);
            this.f12089e0.setInterpolator(C7657c.m18641a());
            this.f12089e0.addUpdateListener(new C4494h(this));
            this.f12089e0.start();
            return;
        }
        m13270b(i);
    }

    public void showETAs(long j, long j2) {
        m13272e(false);
        this.f12082X.mo11671a(j);
        this.f12083Y.mo11671a(j2);
        this.f12081W.setVisibility(8);
        this.f12084Z.setVisibility(0);
        this.f12084Z.setAlpha(1.0f);
        this.f12084Z.setEnabled(true);
        this.f12085a0.setVisibility(8);
    }

    public void showIsNearby() {
        m13272e(false);
        this.f12078T.setText(R.string.meetview_nearby_title);
        this.f12082X.mo11670a();
        this.f12083Y.mo11670a();
        this.f12081W.setVisibility(8);
        this.f12084Z.setVisibility(8);
        this.f12085a0.setVisibility(0);
        this.f12075Q = true;
    }

    public void showLongDistance(float f) {
        m13272e(true);
        this.f12082X.mo11670a();
        this.f12083Y.mo11670a();
        this.f12078T.setText(R.string.meetview_unreachable_subtitle);
        this.f12084Z.setVisibility(8);
        this.f12081W.setVisibility(0);
        if (!this.f12081W.mo22804b()) {
            this.f12081W.mo22807d();
        }
        this.f12085a0.setVisibility(8);
        this.f12075Q = true;
    }

    public void showNavigationChooser(double d, double d2, C4479a aVar) {
        if (!m13269a(d, d2, m13265a(d, d2, aVar))) {
            Toast.makeText(mo23920b(), R.string.commons_noApplicationFound, 1).show();
        }
    }

    public void showShareLocationChooser(double d, double d2, String str, String str2) {
        String str3 = str;
        Activity b = mo23920b();
        String packageName = b.getPackageName();
        String format = String.format(Locale.US, "%1$f,%2$f", new Object[]{Double.valueOf(d), Double.valueOf(d2)});
        LabeledIntent labeledIntent = new LabeledIntent(CopyToClipboardActivity.m9607a(b, str3), packageName, R.string.meetview_copy_address, R.drawable.ic_copy_text);
        LabeledIntent labeledIntent2 = new LabeledIntent(CopyToClipboardActivity.m9607a(b, format), packageName, R.string.meetview_copy_gps, 2131231241);
        LabeledIntent labeledIntent3 = new LabeledIntent(ForwardIntentActivity.m9608a(b, C3236s.m10262b(b.getString(R.string.meetview_send_appendix, new Object[]{str3}))), packageName, R.string.meetview_send_address, 2131231315);
        double d3 = d;
        double d4 = d2;
        if (!m13269a(d3, d4, labeledIntent, labeledIntent2, labeledIntent3, m13266a(d3, d4, str2))) {
            m13268a(str3, format);
        }
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f12092h0 = C3015a.m9526a(context).provideFriendStore();
    }

    /* renamed from: e */
    private void m13272e(boolean z) {
        this.f12087c0.setSelected(z);
        C1447a.m6542a(this.f12079U, C7770f.ImageButton_Medium_Tertiary, new C0143b(this.f12078T.getContext(), z ? 2132083207 : 2132083208));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public android.view.View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z = false;
        android.view.View inflate = layoutInflater.inflate(R.layout.controller_meet, viewGroup, false);
        this.f12087c0 = inflate.findViewById(R.id.meet_bottom_sheet);
        this.f12076R = inflate.findViewById(R.id.meet_normal_mode);
        this.f12077S = inflate.findViewById(R.id.meet_title_header);
        this.f12078T = (TextView) inflate.findViewById(R.id.meet_title);
        this.f12079U = (ImageButton) inflate.findViewById(R.id.meet_title_button);
        this.f12080V = (TextView) inflate.findViewById(R.id.meet_subtitle);
        this.f12081W = (LottieAnimationView) inflate.findViewById(R.id.jetpack_animation);
        this.f12082X = new C4498c(inflate.findViewById(R.id.meet_duration1));
        this.f12082X.f12098b.setText(R.string.meetview_walking);
        this.f12083Y = new C4498c(inflate.findViewById(R.id.meet_duration2));
        this.f12083Y.f12098b.setText(R.string.meetview_driving);
        this.f12084Z = (TextView) inflate.findViewById(R.id.meet_button);
        this.f12085a0 = (ImageButton) inflate.findViewById(R.id.meet_call_button);
        this.f12086b0 = inflate.findViewById(R.id.meet_fogview_mode);
        this.f12090f0 = new C4502j0(new C4504k0(this.f12092h0, this.f12074P), this);
        this.f12077S.setOnClickListener(new C4486d(this));
        this.f12085a0.setOnClickListener(new C4490f(this));
        this.f12084Z.setOnClickListener(new C4488e(this));
        this.f12082X.mo11672a(false);
        this.f12083Y.mo11672a(false);
        this.f12082X.f12097a.setOnClickListener(new C4492g(this));
        this.f12083Y.f12097a.setOnClickListener(new C4499i(this));
        this.f12078T.setText(C7709b.m18762a(inflate.getContext(), R.string.map_select_user_address_loading));
        this.f12080V.setText(C7709b.m18762a(inflate.getContext(), R.string.map_select_user_address_loading));
        this.f12088d0 = BottomSheetBehavior.m27416b(this.f12087c0);
        this.f12088d0.mo30690c(5);
        this.f12088d0.mo14019a((C10744c) new C4496a());
        C5343a U = C5343a.m15160U();
        if (this.f12092h0.friendCache(this.f12074P) != null) {
            z = true;
        }
        U.mo12871c(z);
        return inflate;
    }

    public C4495h0(Bundle bundle) {
        super(bundle);
        this.f12075Q = true;
        this.f12074P = bundle.getString("KEY_USER_UUID");
    }

    /* renamed from: d */
    private Intent m13271d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setPackage("com.google.android.apps.maps");
        return intent;
    }

    /* renamed from: b */
    private void m13270b(int i) {
        String a = C5530d.m15709a(mo23920b(), (double) i);
        this.f12078T.setText(mo23920b().getString(R.string.meetview_reachable_title, new Object[]{a}));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11665a(ValueAnimator valueAnimator) {
        m13270b(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* renamed from: a */
    private boolean m13269a(double d, double d2, Intent... intentArr) {
        Uri parse = Uri.parse(String.format(Locale.US, "geo:%1$f,%2$f", new Object[]{Double.valueOf(d), Double.valueOf(d2)}));
        if (VERSION.SDK_INT < 24) {
            return C3236s.m10260a((Context) mo23920b(), parse, intentArr);
        }
        ArrayList arrayList = new ArrayList();
        for (Intent intent : intentArr) {
            if (!TextUtils.isEmpty(intent.getPackage())) {
                arrayList.add(intent.getPackage());
            }
        }
        return C3236s.m10259a((Context) mo23920b(), parse, Arrays.asList(intentArr), (List<String>) arrayList);
    }

    /* renamed from: a */
    private void m13268a(String str, String str2) {
        Activity b = mo23920b();
        new Builder(b).setItems(new CharSequence[]{b.getString(R.string.meetview_copy_address), b.getString(R.string.meetview_copy_gps), b.getString(R.string.meetview_send_address), b.getString(R.string.commons_button_cancelcap)}, new C4497b(this, b, str, str2)).create().show();
    }

    /* renamed from: a */
    private Intent m13265a(double d, double d2, C4479a aVar) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = Double.valueOf(d);
        objArr[1] = Double.valueOf(d2);
        objArr[2] = aVar == C4479a.WALKING ? "walking" : "driving";
        return m13271d(String.format(locale, "https://www.google.com/maps/dir/?api=1&destination=%1$f,%2$f&travelmode=%3$s", objArr));
    }

    /* renamed from: a */
    private Intent m13266a(double d, double d2, String str) {
        return m13271d(String.format(Locale.US, "geo:%1$f,%2$f?q=%1$f,%2$f(%3$s)", new Object[]{Double.valueOf(d), Double.valueOf(d2), str}));
    }
}
