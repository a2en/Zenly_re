package app.zenly.locator.username.idcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p146j.C5435d;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;

public final class LemonadeView extends OverlayView {

    /* renamed from: B */
    private HashMap f15145B;

    public /* synthetic */ LemonadeView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2248a() {
        ImageView imageView = (ImageView) mo2261c(C3891l.lemonade_mint_right);
        C12932j.m33815a((Object) imageView, "lemonade_mint_right");
        C5435d.m15449a(imageView, 0.0f, -40.0f, 0.0f, 950, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView2 = (ImageView) mo2261c(C3891l.lemonade_lime);
        C12932j.m33815a((Object) imageView2, "lemonade_lime");
        C5435d.m15449a(imageView2, -35.0f, -120.0f, 0.0f, 800, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView3 = (ImageView) mo2261c(C3891l.lemonade_mint_left);
        C12932j.m33815a((Object) imageView3, "lemonade_mint_left");
        C5435d.m15449a(imageView3, 0.0f, 0.0f, 0.0f, 800, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView4 = (ImageView) mo2261c(C3891l.lemonade_lemon);
        C12932j.m33815a((Object) imageView4, "lemonade_lemon");
        C5435d.m15449a(imageView4, 35.0f, 65.0f, 0.0f, 800, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView5 = (ImageView) mo2261c(C3891l.lemonade_icecube_1);
        C12932j.m33815a((Object) imageView5, "lemonade_icecube_1");
        C5435d.m15449a(imageView5, 15.0f, 110.0f, 0.0f, 400, 1.0f, 1.0f, 2.0f, false, 128, null);
        ImageView imageView6 = (ImageView) mo2261c(C3891l.lemonade_icecube_2);
        C12932j.m33815a((Object) imageView6, "lemonade_icecube_2");
        C5435d.m15449a(imageView6, -20.0f, -20.0f, 0.0f, 400, 1.0f, 1.0f, 2.0f, false, 128, null).setStartDelay(150);
        ImageView imageView7 = (ImageView) mo2261c(C3891l.lemonade_icecube_3);
        C12932j.m33815a((Object) imageView7, "lemonade_icecube_3");
        C5435d.m15448a(imageView7, -45.0f, 36.0f, 0.0f, 400, 1.0f, 1.0f, 2.0f, true).setStartDelay(300);
        ImageView imageView8 = (ImageView) mo2261c(C3891l.lemonade_icecube_4);
        C12932j.m33815a((Object) imageView8, "lemonade_icecube_4");
        C5435d.m15448a(imageView8, 30.0f, -100.0f, 0.0f, 400, 1.0f, 1.0f, 2.0f, true).setStartDelay(450);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2256b() {
        ((ImageView) mo2261c(C3891l.lemonade_mint_right)).animate().cancel();
        ((ImageView) mo2261c(C3891l.lemonade_lime)).animate().cancel();
        ((ImageView) mo2261c(C3891l.lemonade_mint_left)).animate().cancel();
        ((ImageView) mo2261c(C3891l.lemonade_lemon)).animate().cancel();
        ((ImageView) mo2261c(C3891l.lemonade_icecube_1)).animate().cancel();
        ((ImageView) mo2261c(C3891l.lemonade_icecube_2)).animate().cancel();
        ((ImageView) mo2261c(C3891l.lemonade_icecube_3)).animate().cancel();
        ((ImageView) mo2261c(C3891l.lemonade_icecube_4)).animate().cancel();
    }

    /* renamed from: c */
    public View mo2261c(int i) {
        if (this.f15145B == null) {
            this.f15145B = new HashMap();
        }
        View view = (View) this.f15145B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15145B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13777c() {
        ImageView imageView = (ImageView) mo2261c(C3891l.lemonade_mint_right);
        C12932j.m33815a((Object) imageView, "lemonade_mint_right");
        C5435d.m15447a(imageView, 90.0f, 1.0f, 100.0f, 0.0f, 0.0f, 200);
        ImageView imageView2 = (ImageView) mo2261c(C3891l.lemonade_lime);
        C12932j.m33815a((Object) imageView2, "lemonade_lime");
        C5435d.m15447a(imageView2, 90.0f, 1.0f, 100.0f, -20.0f, 0.0f, 200);
        ImageView imageView3 = (ImageView) mo2261c(C3891l.lemonade_mint_left);
        C12932j.m33815a((Object) imageView3, "lemonade_mint_left");
        C5435d.m15447a(imageView3, 90.0f, 1.0f, -100.0f, 0.0f, 0.0f, 200);
        ImageView imageView4 = (ImageView) mo2261c(C3891l.lemonade_lemon);
        C12932j.m33815a((Object) imageView4, "lemonade_lemon");
        C5435d.m15447a(imageView4, 90.0f, 1.0f, -100.0f, 20.0f, 0.0f, 200);
        ImageView imageView5 = (ImageView) mo2261c(C3891l.lemonade_icecube_1);
        C12932j.m33815a((Object) imageView5, "lemonade_icecube_1");
        C5435d.m15447a(imageView5, 15.0f, 0.0f, 150.0f, 140.0f, 0.0f, 200);
        ImageView imageView6 = (ImageView) mo2261c(C3891l.lemonade_icecube_2);
        C12932j.m33815a((Object) imageView6, "lemonade_icecube_2");
        C5435d.m15447a(imageView6, -20.0f, 0.0f, -150.0f, 50.0f, 0.0f, 200).setStartDelay(0);
        ImageView imageView7 = (ImageView) mo2261c(C3891l.lemonade_icecube_3);
        C12932j.m33815a((Object) imageView7, "lemonade_icecube_3");
        C5435d.m15447a(imageView7, -45.0f, 0.0f, 150.0f, -40.0f, 0.0f, 200).setStartDelay(0);
        ImageView imageView8 = (ImageView) mo2261c(C3891l.lemonade_icecube_4);
        C12932j.m33815a((Object) imageView8, "lemonade_icecube_4");
        C5435d.m15447a(imageView8, 30.0f, 0.0f, -150.0f, -180.0f, 0.0f, 200).setStartDelay(0);
    }

    public LemonadeView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.view_lemonade, this);
    }
}
