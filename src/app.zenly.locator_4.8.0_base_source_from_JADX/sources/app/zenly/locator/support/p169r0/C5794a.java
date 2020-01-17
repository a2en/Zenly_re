package app.zenly.locator.support.p169r0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.R;
import app.zenly.locator.controllers.country.C2426b;
import app.zenly.locator.controllers.country.OnCountryPickedListener;
import app.zenly.locator.core.models.C2869a;
import app.zenly.locator.core.models.C2885g;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p135r.p136a1.C5133a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.C5659d0;
import app.zenly.locator.support.C5688j0;
import app.zenly.locator.support.C5724n0;
import app.zenly.locator.support.changenumber.view.DateOfBirthPicker;
import app.zenly.locator.support.changenumber.view.PhoneNumberPicker;
import app.zenly.locator.support.p168di.C5665b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8818e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.core.C7123i2;
import p213co.znly.models.services.C7973a0;
import p213co.znly.models.services.C8393z;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.support.r0.a */
public final class C5794a extends ZenlyController implements OnCountryPickedListener {

    /* renamed from: P */
    private C5688j0 f14668P;

    /* renamed from: Q */
    private C5724n0 f14669Q;

    /* renamed from: R */
    private TextView f14670R;

    /* renamed from: S */
    private TextView f14671S;

    /* renamed from: T */
    private TextView f14672T;

    /* renamed from: U */
    private TextView f14673U;

    /* renamed from: V */
    private TextView f14674V;

    /* renamed from: W */
    private PhoneNumberPicker f14675W;

    /* renamed from: X */
    private PhoneNumberPicker f14676X;

    /* renamed from: Y */
    private EditText f14677Y;

    /* renamed from: Z */
    private DateOfBirthPicker f14678Z;

    /* renamed from: a0 */
    private EditText f14679a0;

    /* renamed from: b0 */
    private DateOfBirthPicker f14680b0;

    /* renamed from: c0 */
    private View f14681c0;

    /* renamed from: d0 */
    private View f14682d0;

    /* renamed from: e0 */
    private View f14683e0;

    /* renamed from: f0 */
    private HashMap<Integer, C7123i2> f14684f0 = new HashMap<>();

    /* renamed from: g0 */
    private final C12275b f14685g0 = new C12275b();

    /* renamed from: app.zenly.locator.support.r0.a$a */
    public static final class C5795a {
        private C5795a() {
        }

        public /* synthetic */ C5795a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.r0.a$b */
    static final class C5796b implements ExitListener {

        /* renamed from: a */
        final /* synthetic */ C5794a f14686a;

        C5796b(C5794a aVar) {
            this.f14686a = aVar;
        }

        public final void onExit() {
            View m = this.f14686a.mo23948m();
            if (m != null) {
                C12932j.m33815a((Object) m, "view!!");
                C1297b.m6240a(m, false, 2, null);
                this.f14686a.mo23946k().mo24014n();
                return;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.support.r0.a$c */
    static final class C5797c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5794a f14687e;

        C5797c(C5794a aVar) {
            this.f14687e = aVar;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            C12932j.m33815a((Object) view, "it");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "it.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f14687e.m16209E();
        }
    }

    /* renamed from: app.zenly.locator.support.r0.a$d */
    static final class C5798d extends C12933k implements Function1<PhoneNumberPicker, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5794a f14688f;

        C5798d(C5794a aVar) {
            this.f14688f = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13483a(PhoneNumberPicker phoneNumberPicker) {
            C12932j.m33818b(phoneNumberPicker, "it");
            this.f14688f.m16219b(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13483a((PhoneNumberPicker) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.r0.a$e */
    static final class C5799e extends C12933k implements Function1<PhoneNumberPicker, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5794a f14689f;

        C5799e(C5794a aVar) {
            this.f14689f = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13484a(PhoneNumberPicker phoneNumberPicker) {
            C12932j.m33818b(phoneNumberPicker, "it");
            this.f14689f.m16219b(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13484a((PhoneNumberPicker) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.r0.a$f */
    static final class C5800f<T> implements Consumer<C7973a0> {

        /* renamed from: e */
        final /* synthetic */ C5794a f14690e;

        C5800f(C5794a aVar) {
            this.f14690e = aVar;
        }

        /* renamed from: a */
        public final void accept(C7973a0 a0Var) {
            String d = C5447b.m15477d(C5448c.m15478a());
            C5343a.m15160U().mo12797L();
            C5343a.m15160U().mo12862b(d);
            this.f14690e.m16224e(false);
            this.f14690e.m16206B();
        }
    }

    /* renamed from: app.zenly.locator.support.r0.a$g */
    static final class C5801g<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5794a f14691e;

        C5801g(C5794a aVar) {
            this.f14691e = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f14691e.m16224e(false);
            this.f14691e.m16207C();
        }
    }

    static {
        new C5795a(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m16206B() {
        Activity b = mo23920b();
        if (b != null) {
            C3106c a = new C3106c(b).mo9300a((ExitListener) new C5796b(this));
            a.mo9331a(2131231414);
            a.mo9349f((int) R.string.support_change_phone_number_dialog_success_title);
            a.mo9348e((int) R.string.support_change_phone_number_dialog_success_description);
            a.mo9345c((int) R.string.commons_button_ok);
            a.mo9344b().mo9296j(mo9304A());
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m16207C() {
        Activity b = mo23920b();
        if (b != null) {
            C3106c cVar = new C3106c(b);
            cVar.mo9331a(2131231414);
            cVar.mo9349f((int) R.string.support_change_phone_number_dialog_error_title);
            cVar.mo9348e((int) R.string.support_change_phone_number_dialog_error_description);
            cVar.mo9345c((int) R.string.commons_button_ok);
            cVar.mo9344b().mo9296j(mo9304A());
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: D */
    private final String m16208D() {
        C12899i[] iVarArr = new C12899i[6];
        PhoneNumberPicker phoneNumberPicker = this.f14675W;
        if (phoneNumberPicker != null) {
            iVarArr[0] = C12954o.m33853a("Previous phone number", phoneNumberPicker.getInternationalNumber());
            PhoneNumberPicker phoneNumberPicker2 = this.f14676X;
            if (phoneNumberPicker2 != null) {
                iVarArr[1] = C12954o.m33853a("New phone number", phoneNumberPicker2.getInternationalNumber());
                EditText editText = this.f14677Y;
                if (editText != null) {
                    iVarArr[2] = C12954o.m33853a("Zenly username", editText.getText().toString());
                    DateOfBirthPicker dateOfBirthPicker = this.f14678Z;
                    if (dateOfBirthPicker != null) {
                        iVarArr[3] = C12954o.m33853a("Date-of-birth", m16212a(dateOfBirthPicker));
                        EditText editText2 = this.f14679a0;
                        if (editText2 != null) {
                            iVarArr[4] = C12954o.m33853a("New username", editText2.getText().toString());
                            DateOfBirthPicker dateOfBirthPicker2 = this.f14680b0;
                            if (dateOfBirthPicker2 != null) {
                                iVarArr[5] = C12954o.m33853a("New Date-of-birth", m16212a(dateOfBirthPicker2));
                                List<C12899i> b = C12848o.m33643b((Object[]) iVarArr);
                                ArrayList arrayList = new ArrayList(C12850p.m33647a(b, 10));
                                for (C12899i iVar : b) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((String) iVar.mo37204c());
                                    sb.append(": ");
                                    sb.append((String) iVar.mo37205d());
                                    arrayList.add(sb.toString());
                                }
                                return C12857w.m33662a(arrayList, "\n", null, null, 0, null, null, 62, null);
                            }
                            C12932j.m33820c("otherDateOfBirth");
                            throw null;
                        }
                        C12932j.m33820c("otherUsername");
                        throw null;
                    }
                    C12932j.m33820c("dateOfBirth");
                    throw null;
                }
                C12932j.m33820c("username");
                throw null;
            }
            C12932j.m33820c("newNumber");
            throw null;
        }
        C12932j.m33820c("previousNumber");
        throw null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        if (m16221b(r7) == false) goto L_0x00ac;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m16209E() {
        /*
            r12 = this;
            android.app.Activity r0 = r12.mo9304A()
            java.lang.String r1 = "requireActivity()"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            app.zenly.locator.support.changenumber.view.PhoneNumberPicker r1 = r12.f14675W
            r2 = 0
            if (r1 == 0) goto L_0x0133
            boolean r1 = r12.m16218a(r1)
            android.widget.TextView r3 = r12.f14670R
            if (r3 == 0) goto L_0x012d
            r4 = 2132018306(0x7f140482, float:1.9674915E38)
            r5 = r1 ^ 1
            r6 = 1
            java.lang.CharSequence r4 = r12.m16210a(r0, r4, r6, r5)
            r3.setText(r4)
            app.zenly.locator.support.changenumber.view.PhoneNumberPicker r3 = r12.f14676X
            if (r3 == 0) goto L_0x0127
            boolean r3 = r12.m16218a(r3)
            android.widget.TextView r4 = r12.f14671S
            if (r4 == 0) goto L_0x0121
            r5 = 2132018303(0x7f14047f, float:1.9674909E38)
            r7 = r3 ^ 1
            java.lang.CharSequence r5 = r12.m16210a(r0, r5, r6, r7)
            r4.setText(r5)
            android.widget.EditText r4 = r12.f14677Y
            if (r4 == 0) goto L_0x011b
            boolean r4 = r12.m16217a(r4)
            android.widget.TextView r5 = r12.f14672T
            if (r5 == 0) goto L_0x0115
            r7 = 2132018310(0x7f140486, float:1.9674923E38)
            r8 = r4 ^ 1
            java.lang.CharSequence r7 = r12.m16210a(r0, r7, r6, r8)
            r5.setText(r7)
            app.zenly.locator.support.changenumber.view.DateOfBirthPicker r5 = r12.f14678Z
            if (r5 == 0) goto L_0x010f
            boolean r5 = r12.m16221b(r5)
            android.widget.TextView r7 = r12.f14673U
            if (r7 == 0) goto L_0x0109
            r8 = 2132018297(0x7f140479, float:1.9674897E38)
            r9 = r5 ^ 1
            java.lang.CharSequence r8 = r12.m16210a(r0, r8, r6, r9)
            r7.setText(r8)
            android.widget.EditText r7 = r12.f14679a0
            java.lang.String r8 = "otherUsername"
            if (r7 == 0) goto L_0x0105
            android.text.Editable r7 = r7.getText()
            java.lang.String r9 = "otherUsername.text"
            kotlin.jvm.internal.C12932j.m33815a(r7, r9)
            int r7 = r7.length()
            r9 = 0
            if (r7 <= 0) goto L_0x0083
            r7 = 1
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            app.zenly.locator.support.changenumber.view.DateOfBirthPicker r10 = r12.f14680b0
            java.lang.String r11 = "otherDateOfBirth"
            if (r10 == 0) goto L_0x0101
            boolean r10 = r10.mo6846a()
            r10 = r10 ^ r6
            if (r7 != 0) goto L_0x0093
            if (r10 == 0) goto L_0x00ad
        L_0x0093:
            android.widget.EditText r7 = r12.f14679a0
            if (r7 == 0) goto L_0x00fd
            boolean r7 = r12.m16217a(r7)
            if (r7 == 0) goto L_0x00ac
            app.zenly.locator.support.changenumber.view.DateOfBirthPicker r7 = r12.f14680b0
            if (r7 == 0) goto L_0x00a8
            boolean r7 = r12.m16221b(r7)
            if (r7 != 0) goto L_0x00ad
            goto L_0x00ac
        L_0x00a8:
            kotlin.jvm.internal.C12932j.m33820c(r11)
            throw r2
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            android.widget.TextView r7 = r12.f14674V
            if (r7 == 0) goto L_0x00f7
            r8 = 2132018304(0x7f140480, float:1.967491E38)
            r10 = r6 ^ 1
            java.lang.CharSequence r8 = r12.m16210a(r0, r8, r9, r10)
            r7.setText(r8)
            if (r1 == 0) goto L_0x00f3
            if (r3 == 0) goto L_0x00f3
            if (r4 == 0) goto L_0x00f3
            if (r5 == 0) goto L_0x00f3
            if (r6 != 0) goto L_0x00c8
            goto L_0x00f3
        L_0x00c8:
            app.zenly.locator.support.j0 r1 = r12.f14668P
            java.lang.String r3 = "ticketCreator"
            if (r1 == 0) goto L_0x00ef
            java.lang.String r4 = r12.m16208D()
            r1.mo13351a(r4)
            app.zenly.locator.support.j0 r1 = r12.f14668P
            if (r1 == 0) goto L_0x00eb
            app.zenly.locator.support.n0 r3 = r12.f14669Q
            if (r3 == 0) goto L_0x00e5
            co.znly.models.services.z r0 = r1.mo13347a(r0, r3)
            r12.m16216a(r0)
            return
        L_0x00e5:
            java.lang.String r0 = "zendeskSdk"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x00eb:
            kotlin.jvm.internal.C12932j.m33820c(r3)
            throw r2
        L_0x00ef:
            kotlin.jvm.internal.C12932j.m33820c(r3)
            throw r2
        L_0x00f3:
            r12.m16207C()
            return
        L_0x00f7:
            java.lang.String r0 = "otherInfoTitle"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x00fd:
            kotlin.jvm.internal.C12932j.m33820c(r8)
            throw r2
        L_0x0101:
            kotlin.jvm.internal.C12932j.m33820c(r11)
            throw r2
        L_0x0105:
            kotlin.jvm.internal.C12932j.m33820c(r8)
            throw r2
        L_0x0109:
            java.lang.String r0 = "dateOfBirthTitle"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x010f:
            java.lang.String r0 = "dateOfBirth"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x0115:
            java.lang.String r0 = "usernameTitle"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x011b:
            java.lang.String r0 = "username"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x0121:
            java.lang.String r0 = "newNumberTitle"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x0127:
            java.lang.String r0 = "newNumber"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x012d:
            java.lang.String r0 = "previousNumberTitle"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        L_0x0133:
            java.lang.String r0 = "previousNumber"
            kotlin.jvm.internal.C12932j.m33820c(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.p169r0.C5794a.m16209E():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m16224e(boolean z) {
        View view = this.f14681c0;
        if (view != null) {
            view.setClickable(!z);
            View view2 = this.f14682d0;
            if (view2 != null) {
                int i = 8;
                view2.setVisibility(z ? 8 : 0);
                View view3 = this.f14683e0;
                if (view3 != null) {
                    if (z) {
                        i = 0;
                    }
                    view3.setVisibility(i);
                    return;
                }
                C12932j.m33820c("okButtonProgress");
                throw null;
            }
            C12932j.m33820c("okButtonImage");
            throw null;
        }
        C12932j.m33820c("okButton");
        throw null;
    }

    public void onPhoneRegionSelected(C7123i2 i2Var, int i) {
        C12932j.m33818b(i2Var, "phoneRegion");
        this.f14684f0.put(Integer.valueOf(i), i2Var);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: c */
    private final PhoneNumberPicker m16222c(int i) {
        PhoneNumberPicker phoneNumberPicker;
        if (i == 1) {
            phoneNumberPicker = this.f14675W;
            if (phoneNumberPicker == null) {
                C12932j.m33820c("previousNumber");
                throw null;
            }
        } else if (i == 2) {
            phoneNumberPicker = this.f14676X;
            if (phoneNumberPicker == null) {
                C12932j.m33820c("newNumber");
                throw null;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return phoneNumberPicker;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C8819d l = mo23947l();
        if (!(l instanceof C5659d0)) {
            l = null;
        }
        C5659d0 d0Var = (C5659d0) l;
        C5688j0 B = d0Var != null ? d0Var.mo7192B() : null;
        if (B != null) {
            this.f14668P = B;
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: b */
    private final boolean m16221b(DateOfBirthPicker dateOfBirthPicker) {
        try {
            C2885g gVar = new C2885g(Integer.parseInt(dateOfBirthPicker.getYearText()), Integer.parseInt(dateOfBirthPicker.getMonthText()), Integer.parseInt(dateOfBirthPicker.getDayText()));
            Activity A = mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            if (gVar.mo8957a(A) == C2869a.AGE_VALID) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14669Q = C5665b.m15987a(context).mo13329a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_change_phone_number, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.previous_number_title);
        C12932j.m33815a((Object) findViewById, "findViewById<TextView>(R.id.previous_number_title)");
        this.f14670R = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.new_number_title);
        C12932j.m33815a((Object) findViewById2, "findViewById<TextView>(R.id.new_number_title)");
        this.f14671S = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.username_title);
        C12932j.m33815a((Object) findViewById3, "findViewById<TextView>(R.id.username_title)");
        this.f14672T = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.date_of_birth_title);
        C12932j.m33815a((Object) findViewById4, "findViewById<TextView>(R.id.date_of_birth_title)");
        this.f14673U = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.other_info_title);
        C12932j.m33815a((Object) findViewById5, "findViewById<TextView>(R.id.other_info_title)");
        this.f14674V = (TextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.previous_number);
        C12932j.m33815a((Object) findViewById6, "findViewById<PhoneNumber…er>(R.id.previous_number)");
        this.f14675W = (PhoneNumberPicker) findViewById6;
        View findViewById7 = inflate.findViewById(R.id.new_number);
        C12932j.m33815a((Object) findViewById7, "findViewById<PhoneNumberPicker>(R.id.new_number)");
        this.f14676X = (PhoneNumberPicker) findViewById7;
        View findViewById8 = inflate.findViewById(R.id.username);
        C12932j.m33815a((Object) findViewById8, "findViewById<EditText>(R.id.username)");
        this.f14677Y = (EditText) findViewById8;
        View findViewById9 = inflate.findViewById(R.id.date_of_birth);
        C12932j.m33815a((Object) findViewById9, "findViewById<DateOfBirth…cker>(R.id.date_of_birth)");
        this.f14678Z = (DateOfBirthPicker) findViewById9;
        View findViewById10 = inflate.findViewById(R.id.other_username);
        C12932j.m33815a((Object) findViewById10, "findViewById<EditText>(R.id.other_username)");
        this.f14679a0 = (EditText) findViewById10;
        View findViewById11 = inflate.findViewById(R.id.other_date_of_birth);
        C12932j.m33815a((Object) findViewById11, "findViewById<DateOfBirth…R.id.other_date_of_birth)");
        this.f14680b0 = (DateOfBirthPicker) findViewById11;
        C5133a aVar = new C5133a(C5448c.m15478a());
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        C7123i2 a = aVar.mo12462a((Context) A);
        PhoneNumberPicker phoneNumberPicker = this.f14675W;
        String str = "previousNumber";
        if (phoneNumberPicker != null) {
            C7123i2 i2Var = (C7123i2) this.f14684f0.get(Integer.valueOf(1));
            if (i2Var == null) {
                i2Var = a;
            }
            phoneNumberPicker.setPhoneRegion(i2Var);
            PhoneNumberPicker phoneNumberPicker2 = this.f14675W;
            if (phoneNumberPicker2 != null) {
                phoneNumberPicker2.setOnPickRegionListener(new C5798d(this));
                PhoneNumberPicker phoneNumberPicker3 = this.f14676X;
                String str2 = "newNumber";
                if (phoneNumberPicker3 != null) {
                    C7123i2 i2Var2 = (C7123i2) this.f14684f0.get(Integer.valueOf(2));
                    if (i2Var2 != null) {
                        a = i2Var2;
                    }
                    phoneNumberPicker3.setPhoneRegion(a);
                    PhoneNumberPicker phoneNumberPicker4 = this.f14676X;
                    if (phoneNumberPicker4 != null) {
                        phoneNumberPicker4.setOnPickRegionListener(new C5799e(this));
                        C12932j.m33815a((Object) inflate, "view");
                        Context context = inflate.getContext();
                        TextView textView = this.f14670R;
                        if (textView != null) {
                            C12932j.m33815a((Object) context, "context");
                            textView.setText(m16211a(this, context, R.string.support_change_phone_number_previous_phone_number_field_title, false, false, 12, null));
                            TextView textView2 = this.f14671S;
                            if (textView2 != null) {
                                textView2.setText(m16211a(this, context, R.string.support_change_phone_number_new_phone_number_field_title, false, false, 12, null));
                                TextView textView3 = this.f14672T;
                                if (textView3 != null) {
                                    textView3.setText(m16211a(this, context, R.string.support_change_phone_number_zenly_username_field_title, false, false, 12, null));
                                    TextView textView4 = this.f14673U;
                                    if (textView4 != null) {
                                        textView4.setText(m16211a(this, context, R.string.support_change_phone_number_date_of_birth_field_title, false, false, 12, null));
                                        View findViewById12 = inflate.findViewById(R.id.button_ok);
                                        findViewById12.setOnClickListener(new C5797c(this));
                                        C12932j.m33815a((Object) findViewById12, "view.findViewById<View>(…)\n            }\n        }");
                                        this.f14681c0 = findViewById12;
                                        View view = this.f14681c0;
                                        String str3 = "okButton";
                                        if (view != null) {
                                            View findViewById13 = view.findViewById(R.id.button_ok_image);
                                            C12932j.m33815a((Object) findViewById13, "okButton.findViewById(R.id.button_ok_image)");
                                            this.f14682d0 = findViewById13;
                                            View view2 = this.f14681c0;
                                            if (view2 != null) {
                                                View findViewById14 = view2.findViewById(R.id.button_ok_progress);
                                                C12932j.m33815a((Object) findViewById14, "okButton.findViewById(R.id.button_ok_progress)");
                                                this.f14683e0 = findViewById14;
                                                return inflate;
                                            }
                                            C12932j.m33820c(str3);
                                            throw null;
                                        }
                                        C12932j.m33820c(str3);
                                        throw null;
                                    }
                                    C12932j.m33820c("dateOfBirthTitle");
                                    throw null;
                                }
                                C12932j.m33820c("usernameTitle");
                                throw null;
                            }
                            C12932j.m33820c("newNumberTitle");
                            throw null;
                        }
                        C12932j.m33820c("previousNumberTitle");
                        throw null;
                    }
                    C12932j.m33820c(str2);
                    throw null;
                }
                C12932j.m33820c(str2);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m16219b(int i) {
        String isoCountryCode = m16222c(i).getPhoneRegion().getIsoCountryCode();
        C12932j.m33815a((Object) isoCountryCode, "phoneNumberPicker(who).phoneRegion.isoCountryCode");
        C2426b bVar = new C2426b(isoCountryCode, 2132083208, i);
        bVar.mo23929b((C8819d) this);
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) bVar);
        a.mo24026b(new C8818e());
        a.mo24023a((ControllerChangeHandler) new C8818e());
        k.mo23991a(a);
    }

    /* renamed from: a */
    private final boolean m16218a(PhoneNumberPicker phoneNumberPicker) {
        String phoneNumberNormalizeE164 = C5448c.m15478a().phoneNumberNormalizeE164(phoneNumberPicker.getInternationalNumber());
        C12932j.m33815a((Object) phoneNumberNormalizeE164, "ZenlyCoreProvider.get().…cker.internationalNumber)");
        return phoneNumberNormalizeE164.length() > 0;
    }

    /* renamed from: a */
    private final boolean m16217a(EditText editText) {
        return editText.getText().toString().length() > 0;
    }

    /* renamed from: a */
    private final void m16216a(C8393z zVar) {
        m16224e(true);
        C5724n0 n0Var = this.f14669Q;
        if (n0Var != null) {
            Disposable a = n0Var.mo13394a(zVar).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5800f<Object>(this), (Consumer<? super Throwable>) new C5801g<Object>(this));
            C12932j.m33815a((Object) a, "zendeskSdk.saveTicket(ti…          }\n            )");
            C12773a.m33432a(a, this.f14685g0);
            return;
        }
        C12932j.m33820c("zendeskSdk");
        throw null;
    }

    /* renamed from: a */
    static /* synthetic */ CharSequence m16211a(C5794a aVar, Context context, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return aVar.m16210a(context, i, z, z2);
    }

    /* renamed from: a */
    private final CharSequence m16210a(Context context, int i, boolean z, boolean z2) {
        C7685b bVar = new C7685b();
        if (z2) {
            C7690a aVar = new C7690a(context, R.color.pink, 0, 4, null);
            bVar.mo19897a((Object) aVar);
        }
        String string = context.getString(i);
        C12932j.m33815a((Object) string, "context.getString(textId)");
        bVar.mo19896a((CharSequence) string);
        if (z) {
            C7690a aVar2 = new C7690a(context, R.color.pink, 0, 4, null);
            bVar.mo19897a((Object) aVar2);
            String string2 = context.getString(R.string.support_change_phone_number_mandatory_field_tag);
            C12932j.m33815a((Object) string2, "context.getString(R.stri…mber_mandatory_field_tag)");
            bVar.mo19896a((CharSequence) string2);
            bVar.mo19899c();
        }
        if (z2) {
            bVar.mo19899c();
        }
        return bVar.mo19893a();
    }

    /* renamed from: a */
    private final String m16212a(DateOfBirthPicker dateOfBirthPicker) {
        boolean z;
        boolean z2 = false;
        List b = C12848o.m33643b((Object[]) new String[]{dateOfBirthPicker.getDayText(), dateOfBirthPicker.getMonthText(), dateOfBirthPicker.getYearText()});
        if (!(b instanceof Collection) || !b.isEmpty()) {
            Iterator it = b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((String) it.next()).length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return "";
        }
        return C12857w.m33662a(b, "-", null, null, 0, null, null, 62, null);
    }
}
