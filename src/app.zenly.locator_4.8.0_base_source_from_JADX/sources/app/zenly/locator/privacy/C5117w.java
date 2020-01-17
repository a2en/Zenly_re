package app.zenly.locator.privacy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0122a.C0123a;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.privacy.model.C5081c;
import app.zenly.locator.privacy.model.C5082d;
import app.zenly.locator.privacy.model.ICallbackUpdateUser;
import app.zenly.locator.privacy.p134z.C5128b;
import app.zenly.locator.privacy.view.GhostLocalSettingsView;
import app.zenly.locator.privacy.view.GhostLocalSettingsView.C5104f;
import com.bluelinelabs.conductor.C8819d;
import p213co.znly.models.C6980c3;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.privacy.w */
public class C5117w extends ZenlyController implements ICallBackGhostLocalSettings, ICallbackUpdateUser {

    /* renamed from: P */
    private String f13257P;

    /* renamed from: Q */
    private GhostLocalSettingsView f13258Q;

    /* renamed from: R */
    private C5082d f13259R;

    /* renamed from: S */
    private C5082d f13260S;

    /* renamed from: T */
    private UserProto$User f13261T;

    /* renamed from: U */
    private C6980c3 f13262U;

    /* renamed from: V */
    private long f13263V;

    /* renamed from: W */
    private FriendStore f13264W;

    /* renamed from: X */
    private FriendshipStore f13265X;

    /* renamed from: Y */
    private final C12275b f13266Y;

    /* renamed from: app.zenly.locator.privacy.w$a */
    static /* synthetic */ class C5118a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13267a = new int[C5082d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.privacy.model.d[] r0 = app.zenly.locator.privacy.model.C5082d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13267a = r0
                int[] r0 = f13267a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Precise     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13267a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Frozen     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13267a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Blurred     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.privacy.C5117w.C5118a.<clinit>():void");
        }
    }

    public C5117w() {
        this.f13263V = -1;
        this.f13266Y = new C12275b();
    }

    /* renamed from: B */
    private void m14561B() {
        GhostLocalSettingsView ghostLocalSettingsView = this.f13258Q;
        if (ghostLocalSettingsView != null) {
            UserProto$User userProto$User = this.f13261T;
            if (userProto$User != null) {
                C6980c3 c3Var = this.f13262U;
                if (c3Var != null) {
                    ghostLocalSettingsView.mo12380a(userProto$User, c3Var, C5128b.m14615a(userProto$User, c3Var));
                }
            }
        }
    }

    /* renamed from: C */
    private C12279e<Boolean> m14562C() {
        return C12279e.m32621b((ObservableSource<? extends T>) this.f13265X.friendship(this.f13257P).mo36432a((Consumer<? super Throwable>) C5068c.f13141e).mo36455b((Consumer<? super T>) new C5073h<Object>(this)), (ObservableSource<? extends T>) this.f13264W.friend(this.f13257P).mo36432a((Consumer<? super Throwable>) C5074i.f13147e).mo36455b((Consumer<? super T>) new C5075j<Object>(this))).mo36428a(C12295a.m32802a()).mo36455b((Consumer<? super T>) new C5069d<Object>(this)).mo36501i(C5066a.f13139e);
    }

    /* renamed from: D */
    private void m14563D() {
        if (mo23946k() != null) {
            mo23946k().mo23997a((C8819d) this);
        }
    }

    /* renamed from: E */
    private void m14564E() {
        UserProto$User userProto$User = this.f13261T;
        if (userProto$User != null) {
            this.f13258Q.mo12380a(userProto$User, this.f13262U, this.f13259R);
            this.f13263V = -1;
        }
    }

    /* renamed from: F */
    private void m14565F() {
        C5081c.m14490a(new String[]{this.f13261T.getUuid()}, this.f13260S, this.f13263V, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        StoreModule a = C3015a.m9526a(context);
        this.f13264W = a.provideFriendStore();
        this.f13265X = a.provideFriendshipStore();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f13266Y.mo36401a();
        super.mo7066c(view);
    }

    public boolean handleBack() {
        GhostLocalSettingsView ghostLocalSettingsView = this.f13258Q;
        if (ghostLocalSettingsView == null || ghostLocalSettingsView.mo12382a()) {
            return super.handleBack();
        }
        C5082d dVar = this.f13259R;
        if (dVar != null) {
            this.f13258Q.setPrivacyState(dVar);
        }
        this.f13258Q.mo12379a(C5104f.LOCATION, true);
        return true;
    }

    public void onUpdateUserError() {
        this.f13258Q.mo12381a(false);
        this.f13258Q.setEnabled(true);
        if (mo23920b() != null) {
            String a = C7709b.m18762a(mo23920b(), R.string.commons_button_retry);
            C0123a aVar = new C0123a(mo23920b());
            aVar.mo544b((int) R.string.commons_content_oopserror);
            aVar.mo538a((CharSequence) a, (OnClickListener) new C5071f(this));
            aVar.mo545b(R.string.commons_button_cancel, new C5067b(this));
            aVar.mo542a().show();
            return;
        }
        m14564E();
        m14563D();
    }

    public void onUpdateUserSuccess() {
        this.f13258Q.mo12381a(false);
        this.f13258Q.setEnabled(true);
        m14563D();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setChoice(C5082d dVar) {
        this.f13259R = dVar;
        this.f13260S = this.f13259R;
        GhostLocalSettingsView ghostLocalSettingsView = this.f13258Q;
        if (ghostLocalSettingsView != null) {
            ghostLocalSettingsView.setPrivacyState(this.f13260S);
        }
    }

    public void updateChoice(long j) {
        this.f13258Q.mo12381a(true);
        this.f13258Q.setEnabled(false);
        this.f13263V = j;
        m14565F();
    }

    /* renamed from: b */
    public /* synthetic */ void mo12425b(DialogInterface dialogInterface, int i) {
        m14564E();
        m14563D();
    }

    public C5117w(String str) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("GhostLocalSettingsController.uuid", str);
        this(dVar.mo9605a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f13258Q = new GhostLocalSettingsView(new ContextThemeWrapper(viewGroup.getContext(), 2132083208));
        this.f13258Q.mo12378a(C5104f.LOCATION);
        this.f13258Q.setCallback(this);
        this.f13258Q.mo12381a(true);
        if (this.f13261T == null && this.f13257P == null) {
            m14563D();
        }
        UserProto$User userProto$User = this.f13261T;
        if (userProto$User != null) {
            this.f13259R = C5128b.m14615a(userProto$User, this.f13262U);
            C5082d dVar = this.f13259R;
            this.f13260S = dVar;
            this.f13258Q.mo12380a(this.f13261T, this.f13262U, dVar);
        } else {
            this.f13266Y.add(m14562C().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5072g<Object>(this), (Consumer<? super Throwable>) new C5070e<Object>(this)));
        }
        this.f13258Q.setClickable(true);
        return this.f13258Q;
    }

    public void updateChoice(C5082d dVar) {
        this.f13260S = dVar;
        int i = C5118a.f13267a[dVar.ordinal()];
        if (i == 1) {
            this.f13258Q.mo12381a(true);
            this.f13258Q.setEnabled(false);
            this.f13263V = 0;
            m14565F();
        } else if (i == 2) {
            this.f13258Q.mo12379a(C5104f.DURATION, true);
        } else if (i == 3) {
            this.f13258Q.mo12381a(true);
            this.f13258Q.setEnabled(false);
            this.f13263V = 172800000000L;
            m14565F();
        }
    }

    public C5117w(Bundle bundle) {
        super(bundle);
        this.f13263V = -1;
        this.f13266Y = new C12275b();
        this.f13257P = bundle.getString("GhostLocalSettingsController.uuid");
    }

    /* renamed from: a */
    public /* synthetic */ void mo12422a(Boolean bool) throws Exception {
        this.f13258Q.mo12381a(false);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12424a(Throwable th) throws Exception {
        this.f13258Q.mo12381a(false);
        m14563D();
        C12143a.m32032b(th, "Erreur observableZenlyContact", new Object[0]);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12421a(C2991u0 u0Var) throws Exception {
        this.f13262U = u0Var.mo9175a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo12420a(C2936a0 a0Var) throws Exception {
        this.f13261T = a0Var.mo9074a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo12423a(Object obj) throws Exception {
        m14561B();
    }

    /* renamed from: a */
    public /* synthetic */ void mo12419a(DialogInterface dialogInterface, int i) {
        if (this.f13263V == -1 || this.f13260S == null || this.f13261T == null) {
            m14564E();
            m14563D();
            return;
        }
        m14565F();
    }
}
