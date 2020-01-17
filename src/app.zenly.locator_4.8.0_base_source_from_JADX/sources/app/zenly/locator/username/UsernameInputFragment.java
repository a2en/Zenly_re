package app.zenly.locator.username;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import app.zenly.android.base.util.C1299c;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.C3103g;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p151o.C5465a;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.username.idcard.BokehView;
import app.zenly.locator.username.idcard.C6027e;
import app.zenly.locator.username.idcard.C6027e.C6028a;
import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8125j3;
import p213co.znly.models.services.C8125j3.C8127b;
import p213co.znly.models.services.C8155l3;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p260i.C7684a;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

public final class UsernameInputFragment extends C1321b {

    /* renamed from: r */
    public static final C5953a f14986r = new C5953a(null);

    /* renamed from: f */
    private Callback f14987f;

    /* renamed from: g */
    private String f14988g;

    /* renamed from: h */
    private C5973e f14989h;

    /* renamed from: i */
    private String f14990i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f14991j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f14992k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f14993l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f14994m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AnimatorListener f14995n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public AnimatorListener f14996o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f14997p;

    /* renamed from: q */
    private HashMap f14998q;

    public interface Callback {
        void onDismissed();

        void onUsernameChanged(String str, String str2);
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$a */
    public static final class C5953a {
        private C5953a() {
        }

        /* renamed from: a */
        public final UsernameInputFragment mo13677a(String str, String str2, int i) {
            C12932j.m33818b(str, "userId");
            C12932j.m33818b(str2, "username");
            UsernameInputFragment usernameInputFragment = new UsernameInputFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg:userId", str);
            bundle.putString("arg:username", str2);
            bundle.putInt("arg:idCardStyle", i);
            usernameInputFragment.setArguments(bundle);
            return usernameInputFragment;
        }

        public /* synthetic */ C5953a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$b */
    static final class C5954b implements ExitListener {

        /* renamed from: a */
        final /* synthetic */ UsernameInputFragment f14999a;

        C5954b(UsernameInputFragment usernameInputFragment) {
            this.f14999a = usernameInputFragment;
        }

        public final void onExit() {
            AutoFitEditText autoFitEditText = (AutoFitEditText) this.f14999a.mo13674a(C3891l.username);
            C12932j.m33815a((Object) autoFitEditText, "username");
            C1299c.m6242a(autoFitEditText);
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$c */
    static final class C5955c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ UsernameInputFragment f15000f;

        C5955c(UsernameInputFragment usernameInputFragment) {
            this.f15000f = usernameInputFragment;
            super(0);
        }

        public final void invoke() {
            Callback b = this.f15000f.mo6614b();
            if (b != null) {
                b.onDismissed();
            }
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$d */
    static final class C5956d<T> implements Observer<String> {

        /* renamed from: a */
        final /* synthetic */ UsernameInputFragment f15001a;

        C5956d(UsernameInputFragment usernameInputFragment) {
            this.f15001a = usernameInputFragment;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            this.f15001a.f14992k = true;
            this.f15001a.m16525a(str);
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$e */
    static final class C5957e<T> implements Observer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ UsernameInputFragment f15002a;

        C5957e(UsernameInputFragment usernameInputFragment) {
            this.f15002a = usernameInputFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f15002a.m16527a(bool != null ? bool.booleanValue() : false);
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$f */
    static final class C5958f<T> implements Observer<C8155l3> {

        /* renamed from: a */
        final /* synthetic */ UsernameInputFragment f15003a;

        /* renamed from: app.zenly.locator.username.UsernameInputFragment$f$a */
        static final class C5959a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C5958f f15004e;

            C5959a(C5958f fVar) {
                this.f15004e = fVar;
            }

            public final void run() {
                if (((AutoFitEditText) this.f15004e.f15003a.mo13674a(C3891l.username)) != null) {
                    ViewPropertyAnimator interpolator = ((AutoFitEditText) this.f15004e.f15003a.mo13674a(C3891l.username)).animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(400).setInterpolator(C7657c.m18643b());
                    C12932j.m33815a((Object) interpolator, "username.animate()\n     …s.accelerateDecelerate())");
                    interpolator.setDuration(300);
                }
            }
        }

        /* renamed from: app.zenly.locator.username.UsernameInputFragment$f$b */
        public static final class C5960b implements AnimatorListener {

            /* renamed from: a */
            private boolean f15005a;

            /* renamed from: b */
            final /* synthetic */ C5958f f15006b;

            /* renamed from: c */
            final /* synthetic */ C8155l3 f15007c;

            /* renamed from: app.zenly.locator.username.UsernameInputFragment$f$b$a */
            static final class C5961a extends C12933k implements Function0<C12956q> {

                /* renamed from: f */
                final /* synthetic */ C5960b f15008f;

                C5961a(C5960b bVar) {
                    this.f15008f = bVar;
                    super(0);
                }

                public final void invoke() {
                    Callback b = this.f15008f.f15006b.f15003a.mo6614b();
                    if (b != null) {
                        String e = UsernameInputFragment.m16535e(this.f15008f.f15006b.f15003a);
                        UserProto$User user = this.f15008f.f15007c.getUser();
                        C12932j.m33815a((Object) user, "response.user");
                        String username = user.getUsername();
                        C12932j.m33815a((Object) username, "response.user.username");
                        b.onUsernameChanged(e, username);
                    }
                }
            }

            C5960b(C5958f fVar, C8155l3 l3Var) {
                this.f15006b = fVar;
                this.f15007c = l3Var;
            }

            public void onAnimationCancel(Animator animator) {
                this.f15005a = true;
            }

            public void onAnimationEnd(Animator animator) {
                if (!this.f15005a) {
                    this.f15006b.f15003a.m16526a((Function0<C12956q>) new C5961a<C12956q>(this));
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        C5958f(UsernameInputFragment usernameInputFragment) {
            this.f15003a = usernameInputFragment;
        }

        /* renamed from: a */
        public final void onChanged(C8155l3 l3Var) {
            if (l3Var != null) {
                if (l3Var.hasError()) {
                    C5343a.m15160U().mo12802Q();
                    C8125j3 error = l3Var.getError();
                    C12932j.m33815a((Object) error, "response.error");
                    C8127b code = error.getCode();
                    if (code != null) {
                        int i = C5971c.f15022a[code.ordinal()];
                        if (i == 1) {
                            UsernameInputFragment usernameInputFragment = this.f15003a;
                            usernameInputFragment.f14993l = usernameInputFragment.f14993l + 1;
                            this.f15003a.m16542h();
                        } else if (i == 2) {
                            UsernameInputFragment usernameInputFragment2 = this.f15003a;
                            usernameInputFragment2.f14993l = usernameInputFragment2.f14993l + 1;
                            this.f15003a.m16542h();
                        } else if (i == 3) {
                            this.f15003a.m16543i();
                        }
                    }
                    Toast.makeText(this.f15003a.getActivity(), R.string.addusername_error_generic_title, 0).show();
                } else {
                    C5979f fVar = C5979f.f15037a;
                    Context requireContext = this.f15003a.requireContext();
                    C12932j.m33815a((Object) requireContext, "requireContext()");
                    fVar.mo13716a(requireContext);
                    UserProto$User user = l3Var.getUser();
                    C12932j.m33815a((Object) user, "response.user");
                    C5343a.m15160U().mo12870c(UsernameInputFragment.m16541h(this.f15003a), user.getUsername());
                    if (TextUtils.isEmpty(UsernameInputFragment.m16535e(this.f15003a))) {
                        C5343a.m15160U().mo12851a(this.f15003a.f14992k, this.f15003a.f14993l, this.f15003a.f14994m);
                    } else {
                        C5343a.m15160U().mo12800O();
                    }
                    ViewPropertyAnimator alpha = ((AppCompatTextView) this.f15003a.mo13674a(C3891l.url)).animate().alpha(0.0f);
                    C12932j.m33815a((Object) alpha, "url.animate()\n                    .alpha(0f)");
                    alpha.setDuration(100);
                    AutoFitEditText autoFitEditText = (AutoFitEditText) this.f15003a.mo13674a(C3891l.username);
                    C12932j.m33815a((Object) autoFitEditText, "username");
                    Selection.removeSelection(autoFitEditText.getEditableText());
                    ((AutoFitEditText) this.f15003a.mo13674a(C3891l.username)).animate().scaleX(2.0f).scaleY(2.0f).setInterpolator(C7657c.m18650f()).setDuration(300).withEndAction(new C5959a(this));
                    this.f15003a.f14995n = new C5960b(this, l3Var);
                    ((LottieAnimationView) this.f15003a.mo13674a(C3891l.lottie_card)).mo22807d();
                    ((LottieAnimationView) this.f15003a.mo13674a(C3891l.lottie_card)).mo22798a(this.f15003a.f14995n);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$g */
    static final class C5962g<T> implements Observer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ UsernameInputFragment f15009a;

        C5962g(UsernameInputFragment usernameInputFragment) {
            this.f15009a = usernameInputFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            UsernameInputFragment usernameInputFragment = this.f15009a;
            boolean z = false;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            C8155l3 l3Var = (C8155l3) UsernameInputFragment.m16534d(this.f15009a).mo13707e().mo4390a();
            if (l3Var == null || !l3Var.hasError()) {
                z = true;
            }
            usernameInputFragment.m16528a(booleanValue, z);
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$h */
    public static final class C5963h implements TextWatcher {

        /* renamed from: e */
        final /* synthetic */ UsernameInputFragment f15010e;

        public C5963h(UsernameInputFragment usernameInputFragment) {
            this.f15010e = usernameInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            C12932j.m33818b(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            charSequence.toString();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            boolean z = false;
            if (!this.f15010e.f14991j) {
                this.f15010e.f14992k = false;
            }
            if (charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                C7697b.m18736b((AppCompatTextView) this.f15010e.mo13674a(C3891l.url), 0, null, 3, null);
                return;
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.f15010e.mo13674a(C3891l.url);
            C12932j.m33815a((Object) appCompatTextView, "url");
            appCompatTextView.setText(C5970b.m16566a(charSequence));
            C7697b.m18730a((AppCompatTextView) this.f15010e.mo13674a(C3891l.url), 0, null, 3, null);
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$i */
    static final class C5964i implements OnEditorActionListener {

        /* renamed from: e */
        final /* synthetic */ UsernameInputFragment f15011e;

        C5964i(UsernameInputFragment usernameInputFragment) {
            this.f15011e = usernameInputFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            this.f15011e.m16538f();
            return true;
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$j */
    static final class C5965j implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ UsernameInputFragment f15012e;

        C5965j(UsernameInputFragment usernameInputFragment) {
            this.f15012e = usernameInputFragment;
        }

        public final void onClick(View view) {
            this.f15012e.m16536e();
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$k */
    static final class C5966k implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ UsernameInputFragment f15013e;

        C5966k(UsernameInputFragment usernameInputFragment) {
            this.f15013e = usernameInputFragment;
        }

        public final void onClick(View view) {
            this.f15013e.m16538f();
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputFragment$l */
    public static final class C5967l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ UsernameInputFragment f15014a;

        C5967l(UsernameInputFragment usernameInputFragment) {
            this.f15014a = usernameInputFragment;
        }

        public void onAnimationEnd(Animator animator) {
            ((LottieAnimationView) this.f15014a.mo13674a(C3891l.btn_randomize)).mo22803b(this.f15014a.f14996o);
            this.f15014a.f14996o = null;
            if (this.f15014a.f14997p > ((float) 0)) {
                this.f15014a.m16540g();
            }
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ C5973e m16534d(UsernameInputFragment usernameInputFragment) {
        C5973e eVar = usernameInputFragment.f14989h;
        if (eVar != null) {
            return eVar;
        }
        C12932j.m33820c("model");
        throw null;
    }

    /* renamed from: e */
    public static final /* synthetic */ String m16535e(UsernameInputFragment usernameInputFragment) {
        String str = usernameInputFragment.f14988g;
        if (str != null) {
            return str;
        }
        C12932j.m33820c("oldUsername");
        throw null;
    }

    /* renamed from: h */
    public static final /* synthetic */ String m16541h(UsernameInputFragment usernameInputFragment) {
        String str = usernameInputFragment.f14990i;
        if (str != null) {
            return str;
        }
        C12932j.m33820c("userId");
        throw null;
    }

    /* renamed from: a */
    public View mo13674a(int i) {
        if (this.f14998q == null) {
            this.f14998q = new HashMap();
        }
        View view = (View) this.f14998q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f14998q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f14998q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r4 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            java.lang.String r0 = ""
            if (r4 == 0) goto L_0x0014
            java.lang.String r1 = "arg:userId"
            java.lang.String r4 = r4.getString(r1)
            if (r4 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r4 = r0
        L_0x0015:
            r3.f14990i = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = "arg:username"
            java.lang.String r4 = r4.getString(r1)
            if (r4 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = r0
        L_0x0027:
            r3.f14988g = r4
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            r0 = 0
            if (r4 == 0) goto L_0x0096
            androidx.lifecycle.ViewModelProvider r4 = androidx.lifecycle.C0890v.m4098a(r4)
            java.lang.Class<app.zenly.locator.username.e> r1 = app.zenly.locator.username.C5973e.class
            androidx.lifecycle.u r4 = r4.mo4415a(r1)
            java.lang.String r1 = "ViewModelProviders.of(ac…putViewModel::class.java)"
            kotlin.jvm.internal.C12932j.m33815a(r4, r1)
            app.zenly.locator.username.e r4 = (app.zenly.locator.username.C5973e) r4
            r3.f14989h = r4
            app.zenly.locator.username.e r4 = r3.f14989h
            java.lang.String r1 = "model"
            if (r4 == 0) goto L_0x0092
            androidx.lifecycle.LiveData r4 = r4.mo13709g()
            app.zenly.locator.username.UsernameInputFragment$d r2 = new app.zenly.locator.username.UsernameInputFragment$d
            r2.<init>(r3)
            r4.mo4391a(r3, r2)
            app.zenly.locator.username.e r4 = r3.f14989h
            if (r4 == 0) goto L_0x008e
            androidx.lifecycle.LiveData r4 = r4.mo13706d()
            app.zenly.locator.username.UsernameInputFragment$e r2 = new app.zenly.locator.username.UsernameInputFragment$e
            r2.<init>(r3)
            r4.mo4391a(r3, r2)
            app.zenly.locator.username.e r4 = r3.f14989h
            if (r4 == 0) goto L_0x008a
            androidx.lifecycle.LiveData r4 = r4.mo13707e()
            app.zenly.locator.username.UsernameInputFragment$f r2 = new app.zenly.locator.username.UsernameInputFragment$f
            r2.<init>(r3)
            r4.mo4391a(r3, r2)
            app.zenly.locator.username.e r4 = r3.f14989h
            if (r4 == 0) goto L_0x0086
            androidx.lifecycle.LiveData r4 = r4.mo13708f()
            app.zenly.locator.username.UsernameInputFragment$g r0 = new app.zenly.locator.username.UsernameInputFragment$g
            r0.<init>(r3)
            r4.mo4391a(r3, r0)
            return
        L_0x0086:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r0
        L_0x008a:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r0
        L_0x008e:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r0
        L_0x0092:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r0
        L_0x0096:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.username.UsernameInputFragment.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_username_input, viewGroup, false);
    }

    public void onDestroyView() {
        if (this.f14995n != null) {
            ((LottieAnimationView) mo13674a(C3891l.lottie_card)).mo22803b(this.f14995n);
            this.f14995n = null;
        }
        if (this.f14996o != null) {
            ((LottieAnimationView) mo13674a(C3891l.btn_randomize)).mo22803b(this.f14996o);
            this.f14996o = null;
        }
        super.onDestroyView();
        mo6508a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        ViewPropertyAnimator alpha = mo13674a(C3891l.flash_view).animate().setStartDelay(300).alpha(0.0f);
        C12932j.m33815a((Object) alpha, "flash_view.animate()\n   …L)\n            .alpha(0f)");
        alpha.setDuration(100);
        C6028a aVar = C6027e.f15164E;
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            C6027e a = aVar.mo13814a(arguments.getInt("arg:idCardStyle"));
            ((LottieAnimationView) mo13674a(C3891l.lottie_card)).setAnimation(a.mo13806m());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setOrientation(Orientation.TL_BR);
            gradientDrawable.setColors(a.mo13794a());
            view.setBackground(gradientDrawable);
            String str2 = "overlay_view";
            if (a.mo13810q() != null) {
                View a2 = mo13674a(C3891l.overlay_view);
                C12932j.m33815a((Object) a2, str2);
                a2.setBackgroundTintList(ColorStateList.valueOf(a.mo13810q().intValue()));
            } else {
                View a3 = mo13674a(C3891l.overlay_view);
                C12932j.m33815a((Object) a3, str2);
                a3.setVisibility(8);
            }
            ((BokehView) mo13674a(C3891l.bokeh_view)).mo13728a(a.mo13795b());
            if (a.mo13809p() != null) {
                ((BokehView) mo13674a(C3891l.overlay_bokeh_view)).mo13728a(a.mo13809p());
            } else {
                BokehView bokehView = (BokehView) mo13674a(C3891l.overlay_bokeh_view);
                C12932j.m33815a((Object) bokehView, "overlay_bokeh_view");
                bokehView.setVisibility(8);
            }
            ((AppCompatTextView) mo13674a(C3891l.url)).setTextColor(a.mo13807n());
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo13674a(C3891l.url);
            C12932j.m33815a((Object) appCompatTextView, "url");
            appCompatTextView.setBackgroundTintList(ColorStateList.valueOf(a.mo13813t()));
            ((AutoFitEditText) mo13674a(C3891l.username)).setTextColor(a.mo13807n());
            ((AutoFitEditText) mo13674a(C3891l.username)).setHintTextColor(C5465a.m15551a(a.mo13807n(), 0.5f));
            AutoFitEditText autoFitEditText = (AutoFitEditText) mo13674a(C3891l.username);
            String str3 = "username";
            C12932j.m33815a((Object) autoFitEditText, str3);
            C1315a.m6319a(autoFitEditText, new C7684a("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.-_"));
            ((AutoFitEditText) mo13674a(C3891l.username)).setOnEditorActionListener(new C5964i(this));
            AutoFitEditText autoFitEditText2 = (AutoFitEditText) mo13674a(C3891l.username);
            C12932j.m33815a((Object) autoFitEditText2, str3);
            autoFitEditText2.addTextChangedListener(new C5963h(this));
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str = arguments2.getString("arg:username");
            }
            m16525a(str);
            ((LottieAnimationView) mo13674a(C3891l.btn_randomize)).setOnClickListener(new C5965j(this));
            ((FrameLayout) mo13674a(C3891l.btn_validate)).setOnClickListener(new C5966k(this));
            AutoFitEditText autoFitEditText3 = (AutoFitEditText) mo13674a(C3891l.username);
            C12932j.m33815a((Object) autoFitEditText3, str3);
            C1299c.m6242a(autoFitEditText3);
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        AutoFitEditText autoFitEditText = (AutoFitEditText) mo13674a(C3891l.username);
        C12932j.m33815a((Object) autoFitEditText, "username");
        Editable text = autoFitEditText.getText();
        if (text != null) {
            if (!(text.length() == 0)) {
                return;
            }
        }
        C5973e eVar = this.f14989h;
        if (eVar != null) {
            eVar.mo13705c();
        } else {
            C12932j.m33820c("model");
            throw null;
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        for (View view2 : C12848o.m33643b((Object[]) new View[]{(FrameLayout) mo13674a(C3891l.card_content), (LottieAnimationView) mo13674a(C3891l.lottie_card)})) {
            C12932j.m33815a((Object) view2, "it");
            view2.setPadding(view2.getPaddingLeft(), rect.top, view2.getPaddingRight(), view2.getPaddingBottom());
        }
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, rect.bottom);
    }

    /* renamed from: d */
    private final C3106c m16533d() {
        Context context = getContext();
        if (context != null) {
            C3106c a = new C3106c(context).mo9300a((ExitListener) new C5954b(this));
            C12932j.m33815a((Object) a, "GenericDialogController.…username.showKeyboard() }");
            return a;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m16536e() {
        C5343a.m15160U().mo12803R();
        this.f14994m++;
        C5973e eVar = this.f14989h;
        if (eVar != null) {
            eVar.mo13705c();
        } else {
            C12932j.m33820c("model");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m16538f() {
        AutoFitEditText autoFitEditText = (AutoFitEditText) mo13674a(C3891l.username);
        C12932j.m33815a((Object) autoFitEditText, "username");
        String valueOf = String.valueOf(autoFitEditText.getText());
        if (valueOf.length() > 0) {
            C5973e eVar = this.f14989h;
            if (eVar != null) {
                eVar.mo13704b(valueOf);
                C5499a aVar = C5498a.f14119e;
                Context requireContext = requireContext();
                C12932j.m33815a((Object) requireContext, "requireContext()");
                C5498a.m15602a(aVar.mo13125a(requireContext), C5501c.HEAVY, C5500b.POSITIVE, 0, 4, null);
                return;
            }
            C12932j.m33820c("model");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m16540g() {
        ((LottieAnimationView) mo13674a(C3891l.btn_randomize)).setMinProgress(0.0f);
        ((LottieAnimationView) mo13674a(C3891l.btn_randomize)).setMaxProgress(this.f14997p + 0.16666667f);
        ((LottieAnimationView) mo13674a(C3891l.btn_randomize)).setMinProgress(this.f14997p);
        this.f14996o = new C5967l(this);
        ((LottieAnimationView) mo13674a(C3891l.btn_randomize)).mo22798a(this.f14996o);
        ((LottieAnimationView) mo13674a(C3891l.btn_randomize)).mo22807d();
        this.f14997p += 0.16666667f;
        if (this.f14997p >= 1.0f) {
            this.f14997p = 0.0f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m16542h() {
        C3106c d = m16533d();
        d.mo9331a(2131231414);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        d.mo9346c(C7709b.m18762a(requireContext, R.string.addusername_error_taken_title));
        d.mo9348e((int) R.string.addusername_error_taken_subtitle);
        C3103g b = d.mo9344b();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            b.mo9296j(activity);
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m16543i() {
        C3106c d = m16533d();
        d.mo9331a(2131231414);
        d.mo9349f((int) R.string.addusername_error_toosoon_title);
        d.mo9348e((int) R.string.addusername_error_toosoon_subtitle);
        C3103g b = d.mo9344b();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            b.mo9296j(activity);
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: c */
    public final boolean mo13676c() {
        if (mo13674a(C3891l.flash_view) == null) {
            return false;
        }
        m16526a((Function0<C12956q>) new C5955c<C12956q>(this));
        return true;
    }

    /* renamed from: b */
    public final Callback mo6614b() {
        return this.f14987f;
    }

    /* renamed from: a */
    public final void mo13675a(Callback callback) {
        this.f14987f = callback;
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [app.zenly.locator.username.d] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m16526a(kotlin.jvm.functions.Function0<kotlin.C12956q> r4) {
        /*
            r3 = this;
            int r0 = app.zenly.locator.C3891l.flash_view
            android.view.View r0 = r3.mo13674a(r0)
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 100
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            if (r4 == 0) goto L_0x001e
            app.zenly.locator.username.d r1 = new app.zenly.locator.username.d
            r1.<init>(r4)
            r4 = r1
        L_0x001e:
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r0.withEndAction(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.username.UsernameInputFragment.m16526a(kotlin.jvm.functions.Function0):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16527a(boolean z) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13674a(C3891l.btn_randomize);
        String str = "btn_randomize";
        C12932j.m33815a((Object) lottieAnimationView, str);
        lottieAnimationView.setEnabled(!z);
        if (z) {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo13674a(C3891l.btn_randomize);
            C12932j.m33815a((Object) lottieAnimationView2, str);
            lottieAnimationView2.setSpeed(6.0f);
            this.f14997p = 0.0f;
            m16540g();
            return;
        }
        this.f14997p = -1.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16528a(boolean z, boolean z2) {
        AutoFitEditText autoFitEditText = (AutoFitEditText) mo13674a(C3891l.username);
        C12932j.m33815a((Object) autoFitEditText, "username");
        boolean z3 = true;
        autoFitEditText.setEnabled(!z && !z2);
        FrameLayout frameLayout = (FrameLayout) mo13674a(C3891l.btn_validate);
        C12932j.m33815a((Object) frameLayout, "btn_validate");
        if (z || z2) {
            z3 = false;
        }
        frameLayout.setEnabled(z3);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo13674a(C3891l.validate_image);
        C12932j.m33815a((Object) appCompatImageView, "validate_image");
        int i = 4;
        appCompatImageView.setVisibility(z ? 4 : 0);
        ProgressBar progressBar = (ProgressBar) mo13674a(C3891l.validate_progress);
        C12932j.m33815a((Object) progressBar, "validate_progress");
        if (z) {
            i = 0;
        }
        progressBar.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16525a(String str) {
        this.f14991j = true;
        ((AutoFitEditText) mo13674a(C3891l.username)).setText(str);
        ((AutoFitEditText) mo13674a(C3891l.username)).selectAll();
        this.f14991j = false;
    }
}
