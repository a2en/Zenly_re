package app.zenly.locator.controllers.country.p065f;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.controllers.country.C2425a;
import app.zenly.locator.controllers.country.p066g.C2440a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.controllers.country.f.a */
public final class C2437a extends C7717d<C2440a> {

    /* renamed from: e */
    private HashMap f7325e;

    /* renamed from: app.zenly.locator.controllers.country.f.a$a */
    static final class C2438a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2437a f7326e;

        C2438a(C2437a aVar) {
            this.f7326e = aVar;
        }

        public final void onClick(View view) {
            this.f7326e.mo34491a().dispatch(new C2425a(C2437a.m8523a(this.f7326e)));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C2440a m8523a(C2437a aVar) {
        return (C2440a) aVar.mo34494c();
    }

    /* renamed from: a */
    public View mo8399a(int i) {
        if (this.f7325e == null) {
            this.f7325e = new HashMap();
        }
        View view = (View) this.f7325e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f7325e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        view.setOnClickListener(new C2438a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C2440a aVar, C2440a aVar2) {
        C12932j.m33818b(aVar, "model");
        Context context = mo34493b().getContext();
        String str = "flag";
        if (C7674a.m18692a(aVar.mo8405g())) {
            ((ImageView) mo8399a(C3891l.flag)).setImageResource(aVar.mo8405g());
            ImageView imageView = (ImageView) mo8399a(C3891l.flag);
            C12932j.m33815a((Object) imageView, str);
            imageView.setImageTintList(null);
        } else {
            ((ImageView) mo8399a(C3891l.flag)).setImageResource(R.drawable.flag_default);
            ImageView imageView2 = (ImageView) mo8399a(C3891l.flag);
            C12932j.m33815a((Object) imageView2, str);
            imageView2.setImageTintList(context.getColorStateList(R.attr.zenlyButtonTertiaryBackgroundColor));
        }
        TextView textView = (TextView) mo8399a(C3891l.country_code);
        C12932j.m33815a((Object) textView, "country_code");
        textView.setText(context.getString(R.string.countryPicker_prefix_format, new Object[]{Integer.valueOf(aVar.mo8404f())}));
        TextView textView2 = (TextView) mo8399a(C3891l.country_name);
        C12932j.m33815a((Object) textView2, "country_name");
        textView2.setText(aVar.mo8407i());
        CheckBox checkBox = (CheckBox) mo8399a(C3891l.check_box);
        C12932j.m33815a((Object) checkBox, "check_box");
        checkBox.setChecked(aVar.mo8408j());
    }
}
