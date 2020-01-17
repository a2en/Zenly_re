package app.zenly.locator;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.view.ViewCompat;
import app.zenly.android.base.util.C1297b;
import app.zenly.locator.core.util.C3199e;
import app.zenly.locator.p135r.p136a1.C5133a;
import app.zenly.locator.p135r.p137b1.C5147g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.core.C7123i2;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

public final class PhonePicker {

    /* renamed from: l */
    static final /* synthetic */ KProperty[] f5323l;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TextView f5324a;

    /* renamed from: b */
    private final ImageView f5325b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final View f5326c;

    /* renamed from: d */
    private final EditText f5327d;

    /* renamed from: e */
    private final PopupMenu f5328e = new PopupMenu(this.f5327d.getContext(), this.f5327d);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5133a f5329f = new C5133a(C5448c.m15478a());

    /* renamed from: g */
    private final Lazy f5330g = C12896f.m33751a(new C1487e(this));

    /* renamed from: h */
    private final View f5331h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7123i2 f5332i;

    /* renamed from: j */
    private final boolean f5333j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Callback f5334k;

    public interface Callback {
        void onCountryButtonClick();

        void onKeyboardValidate();

        void onRegionUpdated(C5147g gVar);
    }

    /* renamed from: app.zenly.locator.PhonePicker$a */
    public static final class C1483a implements TextWatcher {

        /* renamed from: e */
        final /* synthetic */ PhonePicker f5335e;

        public C1483a(PhonePicker phonePicker) {
            this.f5335e = phonePicker;
        }

        public void afterTextChanged(Editable editable) {
            C12932j.m33818b(editable, "s");
            String obj = editable.toString();
            if (this.f5335e.f5329f.mo12463a(obj)) {
                C7123i2 f = this.f5335e.f5329f.mo12468f(obj);
                String e = this.f5335e.f5329f.mo12467e(obj);
                if (f != null) {
                    if (e.length() > 0) {
                        this.f5335e.mo7010a(f);
                        this.f5335e.mo7011a(e);
                    }
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            charSequence.toString();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
        }
    }

    /* renamed from: app.zenly.locator.PhonePicker$b */
    static final class C1484b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ PhonePicker f5336e;

        C1484b(PhonePicker phonePicker) {
            this.f5336e = phonePicker;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context context = this.f5336e.f5326c.getContext();
            C12932j.m33815a((Object) context, "countryButton.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5336e.m6627j();
            this.f5336e.f5334k.onCountryButtonClick();
        }
    }

    /* renamed from: app.zenly.locator.PhonePicker$c */
    static final class C1485c implements OnEditorActionListener {

        /* renamed from: e */
        final /* synthetic */ PhonePicker f5337e;

        C1485c(PhonePicker phonePicker) {
            this.f5337e = phonePicker;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            this.f5337e.f5334k.onKeyboardValidate();
            return true;
        }
    }

    /* renamed from: app.zenly.locator.PhonePicker$d */
    static final class C1486d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ PhonePicker f5338e;

        C1486d(PhonePicker phonePicker) {
            this.f5338e = phonePicker;
        }

        public final void run() {
            this.f5338e.m6628k();
        }
    }

    /* renamed from: app.zenly.locator.PhonePicker$e */
    static final class C1487e extends C12933k implements Function0<C5147g> {

        /* renamed from: f */
        final /* synthetic */ PhonePicker f5339f;

        C1487e(PhonePicker phonePicker) {
            this.f5339f = phonePicker;
            super(0);
        }

        public final C5147g invoke() {
            C7123i2 c = this.f5339f.f5332i;
            if (c == null) {
                C5133a d = this.f5339f.f5329f;
                Context context = this.f5339f.f5324a.getContext();
                C12932j.m33815a((Object) context, "prefix.context");
                c = d.mo12462a(context);
            }
            return new C5147g(c);
        }
    }

    /* renamed from: app.zenly.locator.PhonePicker$f */
    static final class C1488f implements OnMenuItemClickListener {

        /* renamed from: a */
        final /* synthetic */ PhonePicker f5340a;

        /* renamed from: b */
        final /* synthetic */ C7123i2 f5341b;

        /* renamed from: c */
        final /* synthetic */ String f5342c;

        C1488f(PhonePicker phonePicker, Context context, String str, C7123i2 i2Var, String str2) {
            this.f5340a = phonePicker;
            this.f5341b = i2Var;
            this.f5342c = str2;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f5340a.mo7010a(this.f5341b);
            this.f5340a.mo7011a(this.f5342c);
            return true;
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(PhonePicker.class), "regionWrapper", "getRegionWrapper()Lapp/zenly/locator/contactpicker/model/RegionWrapper;");
        C12946x.m33839a((C12940r) sVar);
        f5323l = new KProperty[]{sVar};
    }

    public PhonePicker(View view, C7123i2 i2Var, boolean z, Callback callback) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(callback, "callback");
        this.f5331h = view;
        this.f5332i = i2Var;
        this.f5333j = z;
        this.f5334k = callback;
        View findViewById = this.f5331h.findViewById(R.id.country_picker_prefix);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.country_picker_prefix)");
        this.f5324a = (TextView) findViewById;
        View findViewById2 = this.f5331h.findViewById(R.id.country_picker_flag);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.country_picker_flag)");
        this.f5325b = (ImageView) findViewById2;
        View findViewById3 = this.f5331h.findViewById(R.id.country_picker_button);
        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.country_picker_button)");
        this.f5326c = findViewById3;
        View findViewById4 = this.f5331h.findViewById(R.id.phone_picker_number);
        C12932j.m33815a((Object) findViewById4, "view.findViewById(R.id.phone_picker_number)");
        this.f5327d = (EditText) findViewById4;
        m6625h();
        this.f5326c.setOnClickListener(new C1484b(this));
        this.f5327d.addTextChangedListener(new C1483a(this));
        this.f5327d.setOnEditorActionListener(new C1485c(this));
        this.f5327d.post(new C1486d(this));
    }

    /* renamed from: h */
    private final void m6625h() {
        this.f5324a.setText(m6626i().mo12519a());
        C5147g i = m6626i();
        Context context = this.f5325b.getContext();
        C12932j.m33815a((Object) context, "flag.context");
        int a = i.mo12518a(context);
        ImageView imageView = this.f5325b;
        if (a != C7674a.f19294a) {
            imageView.setVisibility(0);
            imageView.setImageResource(a);
            return;
        }
        imageView.setVisibility(4);
    }

    /* renamed from: i */
    private final C5147g m6626i() {
        Lazy lazy = this.f5330g;
        KProperty kProperty = f5323l[0];
        return (C5147g) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m6627j() {
        C1297b.m6240a(this.f5327d, false, 2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m6628k() {
        C1297b.m6241b(this.f5327d);
    }

    /* renamed from: l */
    private final boolean m6629l() {
        String str;
        Context context = this.f5327d.getContext();
        C12932j.m33815a((Object) context, "context");
        String b = C3199e.m10180b(context);
        if (b != null) {
            String c = m6620c(b);
            if (c.length() == 0) {
                return false;
            }
            C7123i2 f = this.f5329f.mo12468f(c);
            if (f == null || C12932j.m33817a((Object) c, (Object) m6620c(this.f5327d.getText().toString()))) {
                return false;
            }
            if (C12932j.m33817a((Object) f, (Object) m6626i().mo12521b())) {
                str = this.f5329f.mo12467e(c);
            } else {
                str = this.f5329f.mo12466d(c);
            }
            String str2 = str;
            if (str2.length() == 0) {
                return false;
            }
            this.f5327d.selectAll();
            PopupMenu popupMenu = this.f5328e;
            popupMenu.getMenu().clear();
            popupMenu.getMenu().add(context.getString(R.string.phoneNumber_paste, new Object[]{str2}));
            C1488f fVar = new C1488f(this, context, str2, f, c);
            popupMenu.setOnMenuItemClickListener(fVar);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m6618b(boolean z) {
        ViewCompat.m2854h(this.f5327d, (!this.f5333j || !z) ? 2 : 1);
        if (VERSION.SDK_INT >= 26) {
            AutofillManager autofillManager = (AutofillManager) this.f5327d.getContext().getSystemService(AutofillManager.class);
            if (ViewCompat.m2803C(this.f5327d)) {
                if (autofillManager != null) {
                    autofillManager.notifyViewEntered(this.f5327d);
                }
            } else if (autofillManager != null) {
                autofillManager.notifyViewExited(this.f5327d);
            }
        }
    }

    /* renamed from: a */
    public final int mo7009a() {
        return m6626i().mo12521b().getCountryDialingCode();
    }

    /* renamed from: c */
    public final String mo7014c() {
        return m6620c(this.f5327d.getText().toString());
    }

    /* renamed from: d */
    public final String mo7015d() {
        return m6617b(this.f5327d.getText().toString());
    }

    /* renamed from: e */
    public final void mo7016e() {
        boolean l = m6629l();
        m6618b(!l);
        if (l) {
            this.f5328e.show();
        } else {
            this.f5328e.dismiss();
        }
    }

    /* renamed from: f */
    public final boolean mo7017f() {
        Editable text = this.f5327d.getText();
        return !(text == null || text.length() == 0);
    }

    /* renamed from: g */
    public final boolean mo7018g() {
        return this.f5329f.mo12464b(this.f5327d.getText().toString());
    }

    /* renamed from: c */
    private final String m6620c(String str) {
        return this.f5329f.mo12465c(m6617b(str));
    }

    /* renamed from: a */
    public final void mo7010a(C7123i2 i2Var) {
        C12932j.m33818b(i2Var, "phoneRegion");
        m6626i().mo12520a(i2Var);
        m6625h();
        this.f5334k.onRegionUpdated(m6626i());
    }

    /* renamed from: a */
    public final void mo7011a(String str) {
        C12932j.m33818b(str, "phoneNumber");
        this.f5327d.setText(str);
        EditText editText = this.f5327d;
        editText.setSelection(editText.getText().length());
    }

    /* renamed from: a */
    public final void mo7012a(boolean z) {
        this.f5327d.setEnabled(z);
        this.f5326c.setClickable(z);
        if (z) {
            m6628k();
        } else {
            m6627j();
        }
    }

    /* renamed from: b */
    public final String mo7013b() {
        String isoCountryCode = m6626i().mo12521b().getIsoCountryCode();
        C12932j.m33815a((Object) isoCountryCode, "regionWrapper.region.isoCountryCode");
        return isoCountryCode;
    }

    /* renamed from: b */
    private final String m6617b(String str) {
        if (this.f5329f.mo12463a(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m6626i().mo12519a());
        sb.append(str);
        return sb.toString();
    }
}
