package app.zenly.locator.onboarding;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2869a;
import app.zenly.locator.core.models.C2885g;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.view.CustomEditText;
import app.zenly.locator.core.util.C3222k;
import app.zenly.locator.onboarding.p125y3.C4947a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p159u.C5513a;
import com.appsflyer.share.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import p250f.p251a.p252a.p253a.p260i.C7689e;

/* renamed from: app.zenly.locator.onboarding.z2 */
public class C4955z2 extends BaseSignupController {

    /* renamed from: a0 */
    private static final int[] f12948a0 = {R.id.signup_age_title1, R.id.signup_age_title2, R.id.signup_age_title3};

    /* renamed from: b0 */
    private static final int[] f12949b0 = {R.id.signup_age_edittext1, R.id.signup_age_edittext2, R.id.signup_age_edittext3};

    /* renamed from: T */
    private CustomEditText[] f12950T = new CustomEditText[3];

    /* renamed from: U */
    private int f12951U = 0;

    /* renamed from: V */
    private int f12952V = 1;

    /* renamed from: W */
    private int f12953W = 2;

    /* renamed from: X */
    private ScreenBar f12954X;

    /* renamed from: Y */
    private View f12955Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f12956Z;

    /* renamed from: app.zenly.locator.onboarding.z2$a */
    class C4956a extends C7689e {

        /* renamed from: e */
        final /* synthetic */ int f12957e;

        /* renamed from: f */
        final /* synthetic */ int f12958f;

        /* renamed from: g */
        final /* synthetic */ int f12959g;

        /* renamed from: h */
        final /* synthetic */ View f12960h;

        C4956a(int i, int i2, int i3, View view) {
            this.f12957e = i;
            this.f12958f = i2;
            this.f12959g = i3;
            this.f12960h = view;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C4955z2.this.f12956Z) {
                if (charSequence.length() >= this.f12957e) {
                    C4955z2.this.m14285I();
                }
                if (C4955z2.this.m14290a(this.f12958f, charSequence.length(), this.f12959g, this.f12957e)) {
                    C4955z2.this.m14288a(this.f12960h.getContext(), true);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.z2$b */
    static /* synthetic */ class C4957b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12962a = new int[C2869a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.core.models.a[] r0 = app.zenly.locator.core.models.C2869a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12962a = r0
                int[] r0 = f12962a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.models.a r1 = app.zenly.locator.core.models.C2869a.AGE_INVALID     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12962a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.models.a r1 = app.zenly.locator.core.models.C2869a.AGE_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12962a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.models.a r1 = app.zenly.locator.core.models.C2869a.AGE_TOO_YOUNG     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.onboarding.C4955z2.C4957b.<clinit>():void");
        }
    }

    /* renamed from: G */
    private void m14283G() {
        for (CustomEditText text : this.f12950T) {
            text.setText("");
        }
        C1297b.m6236a(mo23920b());
    }

    /* renamed from: H */
    private String m14284H() {
        String[] strArr = new String[3];
        int i = 0;
        while (true) {
            CustomEditText[] customEditTextArr = this.f12950T;
            if (i >= customEditTextArr.length) {
                return TextUtils.join(Constants.URL_PATH_DELIMITER, strArr);
            }
            strArr[i] = customEditTextArr[i].getText().toString();
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m14285I() {
        CustomEditText[] customEditTextArr;
        for (CustomEditText customEditText : this.f12950T) {
            if (customEditText.getText().length() < customEditText.getMinValidLength()) {
                C1297b.m6241b(customEditText);
                return;
            }
        }
    }

    /* renamed from: e */
    private void m14297e(View view) {
        String a = C3222k.m10216a(view.getContext());
        for (int i = 0; i < a.length(); i++) {
            char charAt = a.charAt(i);
            if (charAt == 'd') {
                this.f12951U = i;
            } else if (charAt == 'm') {
                this.f12952V = i;
            } else if (charAt == 'y') {
                this.f12953W = i;
            }
        }
    }

    /* renamed from: B */
    public int mo7192B() {
        return 25;
    }

    /* renamed from: E */
    public /* synthetic */ void mo12000E() {
        this.f12950T[0].requestFocus();
    }

    /* renamed from: F */
    public /* synthetic */ void mo12152F() {
        this.f12950T[1].requestFocus();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f12956Z = false;
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        String name = this.f12511Q.getCache().getName();
        this.f12954X.setTitle((CharSequence) view.getContext().getString(R.string.signup_ageform_title, new Object[]{name}));
        if (this.f12511Q.getCache().hasBirthdate()) {
            Calendar a = C4947a.m14275a(this.f12511Q.getCache().getBirthdate());
            String str = "%02d";
            this.f12950T[this.f12951U].setText(String.format(Locale.US, str, new Object[]{Integer.valueOf(a.get(5))}));
            this.f12950T[this.f12952V].setText(String.format(Locale.US, str, new Object[]{Integer.valueOf(a.get(2) + 1)}));
            this.f12950T[this.f12953W].setText(String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(a.get(1))}));
            CustomEditText[] customEditTextArr = this.f12950T;
            int i = this.f12951U;
            customEditTextArr[i].setSelection(customEditTextArr[i].getText().length());
            CustomEditText[] customEditTextArr2 = this.f12950T;
            int i2 = this.f12952V;
            customEditTextArr2[i2].setSelection(customEditTextArr2[i2].getText().length());
            CustomEditText[] customEditTextArr3 = this.f12950T;
            int i3 = this.f12953W;
            customEditTextArr3[i3].setSelection(customEditTextArr3[i3].getText().length());
            this.f12955Y.requestFocus();
        } else {
            C1297b.m6241b(view.findViewById(R.id.signup_age_edittext1));
        }
        this.f12956Z = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        SimpleDateFormat simpleDateFormat;
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.controller_age, viewGroup, false);
        m14297e(inflate);
        this.f12954X = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        this.f12955Y = inflate.findViewById(R.id.signup_age_nextbutton);
        this.f12955Y.setOnClickListener(new C4774c(this, inflate));
        int i2 = 0;
        while (true) {
            int[] iArr = f12949b0;
            if (i2 >= iArr.length) {
                break;
            }
            this.f12950T[i2] = (CustomEditText) inflate.findViewById(iArr[i2]);
            i2++;
        }
        this.f12950T[1].setOnDelPressedListener(new C4779d(this));
        this.f12950T[2].setOnDelPressedListener(new C4762b(this));
        this.f12950T[this.f12951U].setHint(R.string.signup_ageform_day_short);
        this.f12950T[this.f12951U].setMaxLength(2);
        this.f12950T[this.f12951U].setMinValidLength(1);
        this.f12950T[this.f12952V].setHint(R.string.signup_ageform_month_short);
        this.f12950T[this.f12952V].setMaxLength(2);
        this.f12950T[this.f12952V].setMinValidLength(1);
        this.f12950T[this.f12953W].setHint(R.string.signup_ageform_year_short);
        this.f12950T[this.f12953W].setMaxLength(4);
        if (new Locale("th", "TH").equals(Locale.getDefault())) {
            this.f12950T[this.f12953W].setMinValidLength(4);
        } else {
            this.f12950T[this.f12953W].setMinValidLength(2);
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        gregorianCalendar.set(1, gregorianCalendar.get(1) - (C2885g.m9359b(inflate.getContext()) + 1));
        if (this.f12953W == 0) {
            simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
        } else if (this.f12952V == 0) {
            simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        }
        String format = simpleDateFormat.format(gregorianCalendar.getTime());
        ((TextView) inflate.findViewById(R.id.signup_age_sample)).setText(inflate.getContext().getString(R.string.signup_ageform_example, new Object[]{format}));
        while (true) {
            CustomEditText[] customEditTextArr = this.f12950T;
            if (i < customEditTextArr.length) {
                CustomEditText customEditText = customEditTextArr[i];
                C4956a aVar = new C4956a(customEditText.getMaxLength(), i, customEditText.getMinValidLength(), inflate);
                customEditText.addTextChangedListener(aVar);
                i++;
            } else {
                ((TextView) inflate.findViewById(f12948a0[this.f12951U])).setText(R.string.signup_ageform_day);
                ((TextView) inflate.findViewById(f12948a0[this.f12952V])).setText(R.string.signup_ageform_month);
                ((TextView) inflate.findViewById(f12948a0[this.f12953W])).setText(R.string.signup_ageform_year);
                return inflate;
            }
        }
    }

    /* renamed from: b */
    private static C3106c m14295b(Context context, String str) {
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9340b(R.string.signup_error_future_title, str);
        cVar.mo9348e((int) R.string.signup_error_future_message);
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* renamed from: b */
    private static C3106c m14294b(Context context) {
        int b = C2885g.m9359b(context);
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9349f((int) R.string.signup_error_young_title);
        cVar.mo9332a((int) R.string.signup_error_young_message_gdpr, Integer.valueOf(b));
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12153a(View view, View view2) {
        C5498a.m15600a(view2.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14288a(view.getContext(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m14290a(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i == this.f12951U || i == this.f12952V) {
            if (i2 < i4) {
                z = false;
            }
            return z;
        } else if (i != this.f12953W) {
            return false;
        } else {
            if (i2 < i3) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14288a(Context context, boolean z) {
        CustomEditText[] customEditTextArr;
        for (CustomEditText customEditText : this.f12950T) {
            if (customEditText.getText().length() < customEditText.getMinValidLength()) {
                if (!z) {
                    m14287a(context, C2869a.AGE_INVALID);
                }
                return;
            }
        }
        try {
            int parseInt = Integer.parseInt(this.f12950T[this.f12953W].getText().toString());
            int parseInt2 = Integer.parseInt(this.f12950T[this.f12952V].getText().toString());
            int parseInt3 = Integer.parseInt(this.f12950T[this.f12951U].getText().toString());
            if (parseInt < 100 || parseInt >= 1000) {
                int i = GregorianCalendar.getInstance().get(1) / 100;
                if (parseInt != i) {
                    if (parseInt != i - 1) {
                        C2885g gVar = new C2885g(parseInt, parseInt2, parseInt3);
                        C2869a a = gVar.mo8957a(context);
                        if (a == C2869a.AGE_VALID) {
                            this.f12511Q.getCache().mo19163a(C4947a.m14274a(gVar.mo8958b()));
                            this.f12511Q.saveCache();
                            C4847l3.m14146j().mo12067a(gVar.mo8956a(), C5513a.m15632a(mo23920b()));
                            mo11926D();
                        } else if (a != C2869a.AGE_TOO_YOUNG || m14291a(gVar)) {
                            m14287a(context, a);
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
            m14287a(context, C2869a.AGE_INVALID);
        } catch (IllegalArgumentException unused2) {
            m14287a(context, C2869a.AGE_INVALID);
        }
    }

    /* renamed from: a */
    private boolean m14291a(C2885g gVar) {
        C5343a.m15160U().mo12807a(gVar.mo8956a());
        boolean configurationOnboardingAllowAgeGatingRetry = C5448c.m15478a().configurationOnboardingAllowAgeGatingRetry();
        if (!configurationOnboardingAllowAgeGatingRetry) {
            this.f12511Q.getCache().mo19163a(C4947a.m14274a(gVar.mo8958b()));
            this.f12511Q.saveCache();
            mo11926D();
        }
        return configurationOnboardingAllowAgeGatingRetry;
    }

    /* renamed from: a */
    private static C3106c m14286a(Context context, String str) {
        String str2;
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        if (str == null) {
            str2 = context.getString(R.string.signup_error_baddate_title_wodate);
        } else {
            str2 = context.getString(R.string.signup_error_baddate_title, new Object[]{str});
        }
        cVar.mo9346c(str2);
        cVar.mo9348e((int) R.string.signup_error_baddate_message);
        cVar.mo9345c((int) R.string.commons_button_ok);
        return cVar;
    }

    /* renamed from: a */
    private void m14287a(Context context, C2869a aVar) {
        C3106c cVar;
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.MEDIUM, C5500b.ERROR);
        int i = C4957b.f12962a[aVar.ordinal()];
        if (i == 1) {
            cVar = m14286a(context, (String) null);
        } else if (i == 2) {
            cVar = m14295b(context, m14284H());
        } else if (i != 3) {
            cVar = m14286a(context, (String) null);
        } else {
            cVar = m14294b(context);
        }
        cVar.mo9344b().mo9296j(mo23920b());
        m14283G();
    }
}
