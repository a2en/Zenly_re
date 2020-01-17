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

public final class GoldView extends OverlayView {

    /* renamed from: B */
    private HashMap f15143B;

    public /* synthetic */ GoldView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
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
        ImageView imageView = (ImageView) mo2261c(C3891l.gold_diamond_1);
        C12932j.m33815a((Object) imageView, "gold_diamond_1");
        C5435d.m15449a(imageView, -20.0f, 100.0f, 0.0f, 400, 1.1f, 1.0f, 2.0f, false, 128, null);
        ImageView imageView2 = (ImageView) mo2261c(C3891l.gold_diamond_2);
        C12932j.m33815a((Object) imageView2, "gold_diamond_2");
        C5435d.m15449a(imageView2, 20.0f, -60.0f, 0.0f, 400, 1.0f, 1.0f, 3.5f, false, 128, null).setStartDelay(150);
        ImageView imageView3 = (ImageView) mo2261c(C3891l.gold_diamond_3);
        C12932j.m33815a((Object) imageView3, "gold_diamond_3");
        C5435d.m15448a(imageView3, -10.0f, 80.0f, 0.0f, 400, 0.9f, 1.0f, 5.0f, true).setStartDelay(300);
        ImageView imageView4 = (ImageView) mo2261c(C3891l.gold_diamond_4);
        C12932j.m33815a((Object) imageView4, "gold_diamond_4");
        C5435d.m15448a(imageView4, 20.0f, -80.0f, 0.0f, 400, 1.1f, 1.0f, 2.5f, true).setStartDelay(450);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2256b() {
        ((ImageView) mo2261c(C3891l.gold_diamond_1)).animate().cancel();
        ((ImageView) mo2261c(C3891l.gold_diamond_2)).animate().cancel();
        ((ImageView) mo2261c(C3891l.gold_diamond_3)).animate().cancel();
        ((ImageView) mo2261c(C3891l.gold_diamond_4)).animate().cancel();
    }

    /* renamed from: c */
    public View mo2261c(int i) {
        if (this.f15143B == null) {
            this.f15143B = new HashMap();
        }
        View view = (View) this.f15143B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15143B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13777c() {
        ImageView imageView = (ImageView) mo2261c(C3891l.gold_diamond_1);
        C12932j.m33815a((Object) imageView, "gold_diamond_1");
        C5435d.m15447a(imageView, -20.0f, 0.0f, 100.0f, 0.0f, 0.0f, 200);
        ImageView imageView2 = (ImageView) mo2261c(C3891l.gold_diamond_2);
        C12932j.m33815a((Object) imageView2, "gold_diamond_2");
        C5435d.m15447a(imageView2, 20.0f, 0.0f, -60.0f, 0.0f, 0.0f, 200).setStartDelay(0);
        ImageView imageView3 = (ImageView) mo2261c(C3891l.gold_diamond_3);
        C12932j.m33815a((Object) imageView3, "gold_diamond_3");
        C5435d.m15447a(imageView3, -10.0f, 0.0f, 80.0f, 0.0f, 0.0f, 200).setStartDelay(0);
        ImageView imageView4 = (ImageView) mo2261c(C3891l.gold_diamond_4);
        C12932j.m33815a((Object) imageView4, "gold_diamond_4");
        C5435d.m15447a(imageView4, 20.0f, 0.0f, -80.0f, 0.0f, 0.0f, 200).setStartDelay(0);
    }

    public GoldView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.view_gold, this);
    }
}
