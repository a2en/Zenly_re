package app.zenly.locator.p017a0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.models.C2869a;
import app.zenly.locator.core.models.C2885g;
import app.zenly.locator.core.models.C2885g.C2886a;
import app.zenly.locator.core.p072ui.controller.C3103g;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.view.CustomEditText;
import app.zenly.locator.core.p072ui.view.CustomEditText.OnDelPressedListener;
import app.zenly.locator.core.util.C3222k;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C12956q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12948z;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp.Builder;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p250f.p251a.p252a.p253a.p260i.C7689e;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.a0.h */
public final class C1514h extends C1512f {

    /* renamed from: Q */
    private final int[] f5387Q = {R.id.age_title1, R.id.age_title2, R.id.age_title3};

    /* renamed from: R */
    private final int[] f5388R = {R.id.age_edittext1, R.id.age_edittext2, R.id.age_edittext3};

    /* renamed from: S */
    private List<? extends CustomEditText> f5389S;

    /* renamed from: T */
    private int f5390T;

    /* renamed from: U */
    private int f5391U = 1;

    /* renamed from: V */
    private int f5392V = 2;

    /* renamed from: W */
    private C2885g f5393W = C2885g.f8168d;

    /* renamed from: X */
    private String f5394X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f5395Y = true;

    /* renamed from: app.zenly.locator.a0.h$a */
    static final class C1515a extends C12933k implements Function1<View, C12956q> {

        /* renamed from: f */
        final /* synthetic */ Context f5396f;

        /* renamed from: g */
        final /* synthetic */ C1514h f5397g;

        /* renamed from: h */
        final /* synthetic */ View f5398h;

        C1515a(Context context, C1514h hVar, View view, C2869a aVar, String str) {
            this.f5396f = context;
            this.f5397g = hVar;
            this.f5398h = view;
            super(1);
        }

        /* renamed from: a */
        public final void mo7055a(View view) {
            C12932j.m33818b(view, "<anonymous parameter 0>");
            C1514h hVar = this.f5397g;
            Context context = this.f5396f;
            C12932j.m33815a((Object) context, "context");
            hVar.m6679b(context);
            this.f5397g.m6683f(this.f5398h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7055a((View) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.a0.h$b */
    public static final class C1516b extends C7689e {

        /* renamed from: e */
        final /* synthetic */ CustomEditText f5399e;

        /* renamed from: f */
        final /* synthetic */ C1514h f5400f;

        /* renamed from: g */
        final /* synthetic */ View f5401g;

        C1516b(CustomEditText customEditText, C1514h hVar, View view) {
            this.f5399e = customEditText;
            this.f5400f = hVar;
            this.f5401g = view;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            if (!this.f5400f.f5395Y && charSequence.length() >= this.f5399e.getMaxLength() && !((CustomEditText) C12857w.m33686h(C1514h.m6674a(this.f5400f))).hasFocus()) {
                int nextFocusForwardId = this.f5399e.getNextFocusForwardId();
                if (nextFocusForwardId != -1) {
                    ((TextView) this.f5401g.findViewById(nextFocusForwardId)).requestFocus();
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.a0.h$c */
    static final class C1517c implements OnDelPressedListener {

        /* renamed from: a */
        final /* synthetic */ C1514h f5402a;

        C1517c(C1514h hVar) {
            this.f5402a = hVar;
        }

        public final void onDelPressed() {
            ((CustomEditText) C1514h.m6674a(this.f5402a).get(0)).requestFocus();
        }
    }

    /* renamed from: app.zenly.locator.a0.h$d */
    static final class C1518d implements OnDelPressedListener {

        /* renamed from: a */
        final /* synthetic */ C1514h f5403a;

        C1518d(C1514h hVar) {
            this.f5403a = hVar;
        }

        public final void onDelPressed() {
            ((CustomEditText) C1514h.m6674a(this.f5403a).get(1)).requestFocus();
        }
    }

    /* renamed from: app.zenly.locator.a0.h$e */
    static final class C1519e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1514h f5404e;

        /* renamed from: f */
        final /* synthetic */ View f5405f;

        C1519e(C1514h hVar, View view) {
            this.f5404e = hVar;
            this.f5405f = view;
        }

        public final void onClick(View view) {
            C1514h hVar = this.f5404e;
            View view2 = this.f5405f;
            C12932j.m33815a((Object) view2, "view");
            hVar.m6684g(view2);
        }
    }

    /* renamed from: C */
    private final void m6672C() {
        mo23946k().mo24014n();
    }

    /* renamed from: D */
    private final String m6673D() {
        StringBuilder sb = new StringBuilder();
        List<? extends CustomEditText> list = this.f5389S;
        String str = "mEditTexts";
        if (list != null) {
            sb.append(((CustomEditText) list.get(0)).getText());
            sb.append('/');
            List<? extends CustomEditText> list2 = this.f5389S;
            if (list2 != null) {
                sb.append(((CustomEditText) list2.get(1)).getText());
                sb.append('/');
                List<? extends CustomEditText> list3 = this.f5389S;
                if (list3 != null) {
                    sb.append(((CustomEditText) list3.get(2)).getText());
                    return sb.toString();
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* renamed from: e */
    private final void m6682e(View view) {
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "view.context");
        String a = C3222k.m10216a(context);
        int length = a.length();
        for (int i = 0; i < length; i++) {
            char charAt = a.charAt(i);
            if (charAt == 'd') {
                this.f5390T = i;
            } else if (charAt == 'm') {
                this.f5391U = i;
            } else if (charAt == 'y') {
                this.f5392V = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m6683f(View view) {
        View findViewById = view.findViewById(R.id.age_edittext1);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.age_edittext1)");
        C1297b.m6241b(findViewById);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m6684g(View view) {
        C1297b.m6240a(view, false, 2, null);
        C5499a aVar = C5498a.f14119e;
        Context context = view.getContext();
        String str = "view.context";
        C12932j.m33815a((Object) context, str);
        C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        try {
            List<? extends CustomEditText> list = this.f5389S;
            String str2 = "mEditTexts";
            if (list != null) {
                int parseInt = Integer.parseInt(String.valueOf(((CustomEditText) list.get(this.f5392V)).getText()));
                List<? extends CustomEditText> list2 = this.f5389S;
                if (list2 != null) {
                    int parseInt2 = Integer.parseInt(String.valueOf(((CustomEditText) list2.get(this.f5391U)).getText()));
                    List<? extends CustomEditText> list3 = this.f5389S;
                    if (list3 != null) {
                        C2885g gVar = new C2885g(parseInt, parseInt2, Integer.parseInt(String.valueOf(((CustomEditText) list3.get(this.f5390T)).getText())));
                        Context context2 = view.getContext();
                        C12932j.m33815a((Object) context2, str);
                        C2869a a = gVar.mo8957a(context2);
                        if (a == C2869a.AGE_VALID) {
                            m6678a(gVar);
                            return;
                        }
                        if (a == C2869a.AGE_TOO_YOUNG) {
                            C5343a.m15160U().mo12807a(gVar.mo8956a());
                        }
                        m6675a(view, a, m6673D());
                        return;
                    }
                    C12932j.m33820c(str2);
                    throw null;
                }
                C12932j.m33820c(str2);
                throw null;
            }
            C12932j.m33820c(str2);
            throw null;
        } catch (NumberFormatException unused) {
            m6675a(view, C2869a.AGE_INVALID, "");
        } catch (IllegalArgumentException unused2) {
            m6675a(view, C2869a.AGE_INVALID, m6673D());
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public static final /* synthetic */ List m6674a(C1514h hVar) {
        List<? extends CustomEditText> list = hVar.f5389S;
        if (list != null) {
            return list;
        }
        C12932j.m33820c("mEditTexts");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        m6683f(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7050a(Context context, UserProto$User userProto$User) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(userProto$User, "user");
        this.f5394X = userProto$User.getUuid();
        Timestamp birthdate = userProto$User.getBirthdate();
        C12932j.m33815a((Object) birthdate, "user.birthdate");
        this.f5393W = new C2885g(birthdate);
        m6679b(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m6679b(Context context) {
        Locale a = C7713f.m18776a(context);
        this.f5395Y = true;
        List<? extends CustomEditText> list = this.f5389S;
        String str = "mEditTexts";
        if (list != null) {
            CustomEditText customEditText = (CustomEditText) list.get(this.f5390T);
            C12948z zVar = C12948z.f33530a;
            Object[] objArr = {Integer.valueOf(this.f5393W.mo8958b().get(5))};
            String str2 = "%02d";
            String format = String.format(a, str2, Arrays.copyOf(objArr, objArr.length));
            String str3 = "java.lang.String.format(locale, format, *args)";
            C12932j.m33815a((Object) format, str3);
            customEditText.setText(format);
            List<? extends CustomEditText> list2 = this.f5389S;
            if (list2 != null) {
                CustomEditText customEditText2 = (CustomEditText) list2.get(this.f5391U);
                C12948z zVar2 = C12948z.f33530a;
                Object[] objArr2 = {Integer.valueOf(this.f5393W.mo8958b().get(2) + 1)};
                String format2 = String.format(a, str2, Arrays.copyOf(objArr2, objArr2.length));
                C12932j.m33815a((Object) format2, str3);
                customEditText2.setText(format2);
                List<? extends CustomEditText> list3 = this.f5389S;
                if (list3 != null) {
                    CustomEditText customEditText3 = (CustomEditText) list3.get(this.f5392V);
                    C12948z zVar3 = C12948z.f33530a;
                    Object[] objArr3 = {Integer.valueOf(this.f5393W.mo8958b().get(1))};
                    String format3 = String.format(a, "%4d", Arrays.copyOf(objArr3, objArr3.length));
                    C12932j.m33815a((Object) format3, str3);
                    customEditText3.setText(format3);
                    this.f5395Y = false;
                    List<? extends CustomEditText> list4 = this.f5389S;
                    if (list4 != null) {
                        CustomEditText customEditText4 = (CustomEditText) list4.get(0);
                        customEditText4.requestFocus();
                        customEditText4.selectAll();
                        return;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.controller_birthday, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        m6682e(inflate);
        int[] iArr = this.f5388R;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int findViewById : iArr) {
            arrayList.add((CustomEditText) inflate.findViewById(findViewById));
        }
        this.f5389S = arrayList;
        List<? extends CustomEditText> list = this.f5389S;
        String str = "mEditTexts";
        if (list != null) {
            ((CustomEditText) list.get(this.f5390T)).setHint(R.string.signup_ageform_day_short);
            List<? extends CustomEditText> list2 = this.f5389S;
            if (list2 != null) {
                ((CustomEditText) list2.get(this.f5390T)).setMaxLength(2);
                List<? extends CustomEditText> list3 = this.f5389S;
                if (list3 != null) {
                    ((CustomEditText) list3.get(this.f5391U)).setHint(R.string.signup_ageform_month_short);
                    List<? extends CustomEditText> list4 = this.f5389S;
                    if (list4 != null) {
                        ((CustomEditText) list4.get(this.f5391U)).setMaxLength(2);
                        List<? extends CustomEditText> list5 = this.f5389S;
                        if (list5 != null) {
                            ((CustomEditText) list5.get(this.f5392V)).setHint(R.string.signup_ageform_year_short);
                            List<? extends CustomEditText> list6 = this.f5389S;
                            if (list6 != null) {
                                ((CustomEditText) list6.get(this.f5392V)).setMaxLength(4);
                                List<? extends CustomEditText> list7 = this.f5389S;
                                if (list7 != null) {
                                    for (CustomEditText customEditText : list7) {
                                        customEditText.setSelectAllOnFocus(true);
                                        customEditText.addTextChangedListener(new C1516b(customEditText, this, inflate));
                                    }
                                    List<? extends CustomEditText> list8 = this.f5389S;
                                    if (list8 != null) {
                                        int a = C12848o.m33638a((List) list8) - 1;
                                        if (a >= 0) {
                                            while (true) {
                                                List<? extends CustomEditText> list9 = this.f5389S;
                                                if (list9 != null) {
                                                    int i2 = i + 1;
                                                    ((CustomEditText) list9.get(i)).setNextFocusForwardId(this.f5388R[i2]);
                                                    if (i == a) {
                                                        break;
                                                    }
                                                    i = i2;
                                                } else {
                                                    C12932j.m33820c(str);
                                                    throw null;
                                                }
                                            }
                                        }
                                        List<? extends CustomEditText> list10 = this.f5389S;
                                        if (list10 != null) {
                                            ((CustomEditText) list10.get(1)).setOnDelPressedListener(new C1517c(this));
                                            List<? extends CustomEditText> list11 = this.f5389S;
                                            if (list11 != null) {
                                                ((CustomEditText) list11.get(2)).setOnDelPressedListener(new C1518d(this));
                                                ((TextView) inflate.findViewById(this.f5387Q[this.f5390T])).setText(R.string.signup_ageform_day);
                                                ((TextView) inflate.findViewById(this.f5387Q[this.f5391U])).setText(R.string.signup_ageform_month);
                                                ((TextView) inflate.findViewById(this.f5387Q[this.f5392V])).setText(R.string.signup_ageform_year);
                                                View findViewById2 = inflate.findViewById(R.id.validate_button);
                                                C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.validate_button)");
                                                ((ImageButton) findViewById2).setOnClickListener(new C1519e(this, inflate));
                                                return inflate;
                                            }
                                            C12932j.m33820c(str);
                                            throw null;
                                        }
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                                C12932j.m33820c(str);
                                throw null;
                            }
                            C12932j.m33820c(str);
                            throw null;
                        }
                        C12932j.m33820c(str);
                        throw null;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* renamed from: a */
    private final void m6675a(View view, C2869a aVar, String str) {
        C8819d l = mo23947l();
        if (!(l instanceof NavigationContract)) {
            l = null;
        }
        if (((NavigationContract) l) != null) {
            Context context = view.getContext();
            String string = context.getString(R.string.commons_button_ok);
            C12932j.m33815a((Object) string, "context.getString(R.string.commons_button_ok)");
            C1515a aVar2 = new C1515a(context, this, view, aVar, str);
            C3106c cVar = new C3106c(context);
            cVar.mo9338a(string, null, new C1520i(aVar2));
            int i = C1513g.f5386a[aVar.ordinal()];
            if (i == 1) {
                String string2 = str.length() == 0 ? context.getString(R.string.signup_error_baddate_title_wodate) : context.getString(R.string.signup_error_baddate_title, new Object[]{str});
                C12932j.m33815a((Object) string2, "if (date.isEmpty()) cont…rror_baddate_title, date)");
                cVar.mo9331a(2131231414);
                cVar.mo9346c(string2);
                cVar.mo9348e((int) R.string.signup_error_baddate_message);
            } else if (i == 2) {
                cVar.mo9331a(2131231414);
                cVar.mo9346c(context.getString(R.string.signup_error_future_title, new Object[]{str}));
                cVar.mo9348e((int) R.string.signup_error_future_message);
            } else if (i == 3) {
                C2886a aVar3 = C2885g.f8170f;
                Context context2 = view.getContext();
                C12932j.m33815a((Object) context2, "view.context");
                int a = aVar3.mo8960a(context2);
                cVar.mo9331a(2131231414);
                cVar.mo9349f((int) R.string.signup_error_young_title);
                cVar.mo9332a((int) R.string.signup_error_young_message_gdpr, Integer.valueOf(a));
            } else if (i == 4) {
                C12143a.m32030b("displayError() must not be invoked with AgeValidity.AGE_VALID", new Object[0]);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C3103g b = cVar.mo9344b();
            Activity b2 = mo23920b();
            if (b2 != null) {
                b.mo9296j(b2);
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: a */
    private final void m6678a(C2885g gVar) {
        this.f5393W = gVar;
        C5343a.m15160U().mo12856b(this.f5393W.mo8956a());
        Builder newBuilder = Timestamp.newBuilder();
        C12932j.m33815a((Object) newBuilder, "birthdate");
        newBuilder.setSeconds(this.f5393W.mo8959c());
        C6925a newBuilder2 = UserProto$User.newBuilder();
        C12932j.m33815a((Object) newBuilder2, "user");
        newBuilder2.mo18016a((Timestamp) newBuilder.build());
        C5343a.m15160U().mo12841a(this.f5394X, newBuilder2.getBirthdate());
        GeneratedMessageLite build = newBuilder2.build();
        C12932j.m33815a((Object) build, "user.build()");
        UserProto$User userProto$User = (UserProto$User) build;
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        C1526m.m6698a(userProto$User, A);
        m6672C();
    }
}
