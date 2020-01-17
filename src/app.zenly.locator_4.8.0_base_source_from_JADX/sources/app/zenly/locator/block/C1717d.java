package app.zenly.locator.block;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.Toast;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.services.C8189n5;
import p213co.znly.models.services.C8189n5.C8190a;
import p213co.znly.models.services.C8189n5.C8191b;
import p213co.znly.models.services.C8214o5;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.block.d */
public final class C1717d extends ZenlyController {

    /* renamed from: U */
    private static final Map<C8191b, Integer> f5770U = C12835h0.m33548a(C12954o.m33853a(C8191b.REASON_SPAM, Integer.valueOf(R.string.block_user_reason_spam)), C12954o.m33853a(C8191b.REASON_BULLY, Integer.valueOf(R.string.block_user_reason_bully)), C12954o.m33853a(C8191b.REASON_INAPPROPRIATE_MESSAGE, Integer.valueOf(R.string.block_user_reason_inappropriateMessage)), C12954o.m33853a(C8191b.REASON_UNKNOWN, Integer.valueOf(R.string.block_user_reason_unknown)), C12954o.m33853a(C8191b.REASON_REPEATED_INVITES, Integer.valueOf(R.string.block_user_reason_repeatedInvites)), C12954o.m33853a(C8191b.REASON_INAPPROPRIATE_PICTURE, Integer.valueOf(R.string.block_user_reason_inappropriatePicture)), C12954o.m33853a(C8191b.REASON_OFFENSIVE_NAME, Integer.valueOf(R.string.block_user_reason_offensiveName)), C12954o.m33853a(C8191b.REASON_OTHER, Integer.valueOf(R.string.block_user_reason_other)));

    /* renamed from: V */
    public static final C1718a f5771V = new C1718a(null);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final String f5772P;

    /* renamed from: Q */
    private final String f5773Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C8191b f5774R;

    /* renamed from: S */
    private View f5775S;

    /* renamed from: T */
    private View f5776T;

    /* renamed from: app.zenly.locator.block.d$a */
    public static final class C1718a {
        private C1718a() {
        }

        /* renamed from: a */
        public final C1717d mo7323a(String str, String str2) {
            C12932j.m33818b(str, "userUuid");
            C12932j.m33818b(str2, "username");
            C3197d dVar = new C3197d(new Bundle());
            dVar.mo9610a("args:user_uuid", str);
            dVar.mo9610a("args:username", str2);
            Bundle a = dVar.mo9605a();
            C12932j.m33815a((Object) a, "BundleBuilder(Bundle())\n…ame)\n            .build()");
            return new C1717d(a);
        }

        public /* synthetic */ C1718a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.block.d$b */
    static final class C1719b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C1717d f5777f;

        /* renamed from: g */
        final /* synthetic */ Function0 f5778g;

        C1719b(C1717d dVar, Function0 function0) {
            this.f5777f = dVar;
            this.f5778g = function0;
            super(0);
        }

        public final void invoke() {
            C7697b.m18729a(C1717d.m7066a(this.f5777f), 150, this.f5778g);
        }
    }

    /* renamed from: app.zenly.locator.block.d$c */
    static final class C1720c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ Entry f5779a;

        /* renamed from: b */
        final /* synthetic */ C1717d f5780b;

        C1720c(Entry entry, C1717d dVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            this.f5779a = entry;
            this.f5780b = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f5780b.f5774R = (C8191b) this.f5779a.getKey();
            }
        }
    }

    /* renamed from: app.zenly.locator.block.d$d */
    public static final class C1721d extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C1717d f5781g;

        /* renamed from: h */
        final /* synthetic */ Context f5782h;

        /* renamed from: app.zenly.locator.block.d$d$a */
        static final class C1722a extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C1721d f5783f;

            /* renamed from: app.zenly.locator.block.d$d$a$a */
            static final class C1723a<T> implements Consumer<C8214o5> {

                /* renamed from: e */
                final /* synthetic */ C1722a f5784e;

                C1723a(C1722a aVar) {
                    this.f5784e = aVar;
                }

                /* renamed from: a */
                public final void accept(C8214o5 o5Var) {
                    this.f5784e.f5783f.f5781g.m7065B();
                }
            }

            /* renamed from: app.zenly.locator.block.d$d$a$b */
            static final class C1724b<T> implements Consumer<Throwable> {

                /* renamed from: e */
                final /* synthetic */ C1722a f5785e;

                /* renamed from: app.zenly.locator.block.d$d$a$b$a */
                static final class C1725a extends C12933k implements Function0<C12956q> {

                    /* renamed from: f */
                    final /* synthetic */ C1724b f5786f;

                    C1725a(C1724b bVar) {
                        this.f5786f = bVar;
                        super(0);
                    }

                    public final void invoke() {
                        Toast.makeText(this.f5786f.f5785e.f5783f.f5782h, R.string.commons_content_oopserror, 0).show();
                    }
                }

                C1724b(C1722a aVar) {
                    this.f5785e = aVar;
                }

                /* renamed from: a */
                public final void accept(Throwable th) {
                    this.f5785e.f5783f.f5781g.m7069a((Function0<C12956q>) new C1725a<C12956q>(this));
                }
            }

            C1722a(C1721d dVar) {
                this.f5783f = dVar;
                super(0);
            }

            public final void invoke() {
                C8190a newBuilder = C8189n5.newBuilder();
                newBuilder.mo22166a(this.f5783f.f5781g.f5772P);
                newBuilder.mo22165a(C1717d.m7073c(this.f5783f.f5781g));
                C5448c.m15478a().userBlock((C8189n5) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C1723a<Object>(this), (Consumer<? super Throwable>) new C1724b<Object>(this));
            }
        }

        C1721d(C1717d dVar, Context context) {
            this.f5781g = dVar;
            this.f5782h = context;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C12932j.m33818b(view, "v");
            C5499a aVar = C5498a.f14119e;
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "v.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5781g.m7072b((Function0<C12956q>) new C1722a<C12956q>(this));
        }
    }

    /* renamed from: app.zenly.locator.block.d$e */
    static final class C1726e extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C1717d f5787f;

        /* renamed from: g */
        final /* synthetic */ Function0 f5788g;

        C1726e(C1717d dVar, Function0 function0) {
            this.f5787f = dVar;
            this.f5788g = function0;
            super(0);
        }

        public final void invoke() {
            C7697b.m18729a(C1717d.m7070b(this.f5787f), 150, this.f5788g);
        }
    }

    public C1717d(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        String string = bundle.getString("args:user_uuid", null);
        C12932j.m33815a((Object) string, "args.getString(KEY_USER_UUID, null)");
        this.f5772P = string;
        String string2 = bundle.getString("args:username", null);
        C12932j.m33815a((Object) string2, "args.getString(KEY_USERNAME, null)");
        this.f5773Q = string2;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m7065B() {
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) C1714c.f5767Q.mo7321a(this.f5773Q));
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    /* renamed from: a */
    public static final /* synthetic */ View m7066a(C1717d dVar) {
        View view = dVar.f5775S;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("nextButton");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m7070b(C1717d dVar) {
        View view = dVar.f5776T;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("nextProgressBar");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ C8191b m7073c(C1717d dVar) {
        C8191b bVar = dVar.f5774R;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("reason");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m7072b(Function0<C12956q> function0) {
        View view = this.f5775S;
        if (view != null) {
            C7697b.m18735b(view, 150, new C1726e(this, function0));
        } else {
            C12932j.m33820c("nextButton");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_block_user_reason, viewGroup, false);
        C12932j.m33815a((Object) inflate, "root");
        Context context = inflate.getContext();
        ((ScreenBar) inflate.findViewById(R.id.screen_bar)).setTitle((CharSequence) context.getString(R.string.block_user_title, new Object[]{this.f5773Q}));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.reason_radio_group);
        for (Entry entry : f5770U.entrySet()) {
            View inflate2 = layoutInflater.inflate(R.layout.list_item_report_reason, viewGroup2, false);
            if (inflate2 != null) {
                RadioButton radioButton = (RadioButton) inflate2;
                radioButton.setText(((Number) entry.getValue()).intValue());
                radioButton.setOnCheckedChangeListener(new C1720c(entry, this, layoutInflater, viewGroup2));
                viewGroup2.addView(radioButton);
                radioButton.setChecked(C12932j.m33817a((Object) entry, (Object) (Entry) C12857w.m33677d((Iterable) f5770U.entrySet())));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RadioButton");
            }
        }
        View findViewById = inflate.findViewById(R.id.reason_next_button);
        C12932j.m33815a((Object) findViewById, "root.findViewById(R.id.reason_next_button)");
        this.f5775S = findViewById;
        View findViewById2 = inflate.findViewById(R.id.reason_next_progress_bar);
        C12932j.m33815a((Object) findViewById2, "root.findViewById(R.id.reason_next_progress_bar)");
        this.f5776T = findViewById2;
        View view = this.f5776T;
        if (view != null) {
            C7697b.m18736b(view, 0, null, 2, null);
            View view2 = this.f5775S;
            if (view2 != null) {
                view2.setOnClickListener(new C1721d(this, context));
                return inflate;
            }
            C12932j.m33820c("nextButton");
            throw null;
        }
        C12932j.m33820c("nextProgressBar");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7069a(Function0<C12956q> function0) {
        View view = this.f5776T;
        if (view != null) {
            C7697b.m18735b(view, 150, new C1719b(this, function0));
        } else {
            C12932j.m33820c("nextProgressBar");
            throw null;
        }
    }
}
