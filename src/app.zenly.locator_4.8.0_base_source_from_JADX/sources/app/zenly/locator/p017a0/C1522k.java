package app.zenly.locator.p017a0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.settings.view.SwitchMenuItem;
import app.zenly.locator.settings.view.SwitchMenuItem.OnCheckChangedListener;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: app.zenly.locator.a0.k */
public final class C1522k extends C1512f {

    /* renamed from: Q */
    private SwitchMenuItem f5409Q;

    /* renamed from: R */
    private SwitchMenuItem f5410R;

    /* renamed from: S */
    private View f5411S;

    /* renamed from: T */
    private View f5412T;

    /* renamed from: app.zenly.locator.a0.k$a */
    public static final class C1523a implements OnCheckChangedListener {

        /* renamed from: e */
        final /* synthetic */ C1522k f5413e;

        C1523a(C1522k kVar) {
            this.f5413e = kVar;
        }

        public void onCheckChanged(SwitchMenuItem switchMenuItem, boolean z) {
            C12932j.m33818b(switchMenuItem, "view");
            C6925a newBuilder = UserProto$User.newBuilder();
            newBuilder.mo18020b(z);
            UserProto$User userProto$User = (UserProto$User) newBuilder.build();
            C12932j.m33815a((Object) userProto$User, "user");
            Activity A = this.f5413e.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C1526m.m6703e(userProto$User, A);
            C5343a.m15160U().mo12879e(z);
            C5343a.m15160U().mo12865b(userProto$User.getUuid(), z);
        }
    }

    /* renamed from: app.zenly.locator.a0.k$b */
    public static final class C1524b implements OnCheckChangedListener {

        /* renamed from: e */
        final /* synthetic */ C1522k f5414e;

        C1524b(C1522k kVar) {
            this.f5414e = kVar;
        }

        public void onCheckChanged(SwitchMenuItem switchMenuItem, boolean z) {
            C12932j.m33818b(switchMenuItem, "view");
            C6925a newBuilder = UserProto$User.newBuilder();
            newBuilder.mo18019a(z);
            UserProto$User userProto$User = (UserProto$User) newBuilder.build();
            C12932j.m33815a((Object) userProto$User, "user");
            Activity A = this.f5414e.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C1526m.m6702d(userProto$User, A);
            C5343a.m15160U().mo12875d(z);
            C5343a.m15160U().mo12847a(userProto$User.getUuid(), z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_personal_settings, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.screen_bar_layout);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.screen_bar_layout)");
        this.f5411S = findViewById;
        View findViewById2 = inflate.findViewById(R.id.scroll_view);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.scroll_view)");
        this.f5412T = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.settings_personal_private);
        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.settings_personal_private)");
        this.f5409Q = (SwitchMenuItem) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.settings_personal_opt_out_suggestion);
        C12932j.m33815a((Object) findViewById4, "view.findViewById(R.id.s…sonal_opt_out_suggestion)");
        this.f5410R = (SwitchMenuItem) findViewById4;
        SwitchMenuItem switchMenuItem = this.f5409Q;
        if (switchMenuItem != null) {
            switchMenuItem.setOnCheckChangedListener(new C1523a(this));
            SwitchMenuItem switchMenuItem2 = this.f5410R;
            if (switchMenuItem2 != null) {
                switchMenuItem2.setOnCheckChangedListener(new C1524b(this));
                C12932j.m33815a((Object) inflate, "view");
                return inflate;
            }
            C12932j.m33820c("optOutSuggestionMenuItem");
            throw null;
        }
        C12932j.m33820c("privateModeMenuItem");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        View view2 = this.f5411S;
        if (view2 != null) {
            view2.setPadding(rect.left, rect.top, rect.right, view2.getPaddingBottom());
            View view3 = this.f5412T;
            if (view3 != null) {
                view3.setPadding(rect.left, view3.getPaddingTop(), rect.right, rect.bottom);
                return;
            }
            C12932j.m33820c("scrollView");
            throw null;
        }
        C12932j.m33820c("screenBarLayout");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7050a(Context context, UserProto$User userProto$User) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(userProto$User, "user");
        SwitchMenuItem switchMenuItem = this.f5409Q;
        if (switchMenuItem != null) {
            switchMenuItem.setChecked(userProto$User.getPrivateMode());
            SwitchMenuItem switchMenuItem2 = this.f5410R;
            if (switchMenuItem2 != null) {
                switchMenuItem2.setChecked(userProto$User.getOptOutSuggest());
            } else {
                C12932j.m33820c("optOutSuggestionMenuItem");
                throw null;
            }
        } else {
            C12932j.m33820c("privateModeMenuItem");
            throw null;
        }
    }
}
