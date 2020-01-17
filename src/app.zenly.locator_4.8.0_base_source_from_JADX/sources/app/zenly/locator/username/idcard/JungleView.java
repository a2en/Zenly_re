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

public final class JungleView extends OverlayView {

    /* renamed from: B */
    private HashMap f15144B;

    public /* synthetic */ JungleView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
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
        ImageView imageView = (ImageView) mo2261c(C3891l.jumaji_medium_leaf_1);
        C12932j.m33815a((Object) imageView, "jumaji_medium_leaf_1");
        C5435d.m15449a(imageView, 0.0f, -16.0f, 0.0f, 800, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView2 = (ImageView) mo2261c(C3891l.jumaji_medium_leaf_2);
        C12932j.m33815a((Object) imageView2, "jumaji_medium_leaf_2");
        C5435d.m15449a(imageView2, 0.0f, 0.0f, 0.0f, 950, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView3 = (ImageView) mo2261c(C3891l.jumaji_medium_leaf_3);
        C12932j.m33815a((Object) imageView3, "jumaji_medium_leaf_3");
        C5435d.m15449a(imageView3, 0.0f, 0.0f, 0.0f, 1100, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView4 = (ImageView) mo2261c(C3891l.jumaji_fern_leaf_1);
        C12932j.m33815a((Object) imageView4, "jumaji_fern_leaf_1");
        C5435d.m15449a(imageView4, 0.0f, -48.0f, 0.0f, 800, 0.0f, 0.0f, 0.0f, false, 240, null);
        ImageView imageView5 = (ImageView) mo2261c(C3891l.jumaji_fern_leaf_2);
        C12932j.m33815a((Object) imageView5, "jumaji_fern_leaf_2");
        C5435d.m15449a(imageView5, 0.0f, -24.0f, 0.0f, 1250, 0.0f, 0.0f, 0.0f, true, 112, null);
        ImageView imageView6 = (ImageView) mo2261c(C3891l.jumaji_big_leaf);
        C12932j.m33815a((Object) imageView6, "jumaji_big_leaf");
        C5435d.m15449a(imageView6, 0.0f, 40.0f, 0.0f, 1250, 0.0f, 0.0f, 0.0f, true, 112, null);
        ImageView imageView7 = (ImageView) mo2261c(C3891l.jumaji_fern_leaf_3);
        C12932j.m33815a((Object) imageView7, "jumaji_fern_leaf_3");
        C5435d.m15449a(imageView7, 0.0f, 20.0f, 0.0f, 800, 0.0f, 0.0f, 0.0f, false, 240, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2256b() {
        ((ImageView) mo2261c(C3891l.jumaji_medium_leaf_1)).animate().cancel();
        ((ImageView) mo2261c(C3891l.jumaji_medium_leaf_2)).animate().cancel();
        ((ImageView) mo2261c(C3891l.jumaji_medium_leaf_3)).animate().cancel();
        ((ImageView) mo2261c(C3891l.jumaji_fern_leaf_1)).animate().cancel();
        ((ImageView) mo2261c(C3891l.jumaji_fern_leaf_2)).animate().cancel();
        ((ImageView) mo2261c(C3891l.jumaji_big_leaf)).animate().cancel();
        ((ImageView) mo2261c(C3891l.jumaji_fern_leaf_3)).animate().cancel();
    }

    /* renamed from: c */
    public View mo2261c(int i) {
        if (this.f15144B == null) {
            this.f15144B = new HashMap();
        }
        View view = (View) this.f15144B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15144B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13777c() {
        ImageView imageView = (ImageView) mo2261c(C3891l.jumaji_medium_leaf_1);
        C12932j.m33815a((Object) imageView, "jumaji_medium_leaf_1");
        C5435d.m15447a(imageView, 90.0f, 1.0f, 100.0f, 0.0f, 1.0f, 200);
        ImageView imageView2 = (ImageView) mo2261c(C3891l.jumaji_medium_leaf_2);
        C12932j.m33815a((Object) imageView2, "jumaji_medium_leaf_2");
        C5435d.m15447a(imageView2, 0.0f, 1.0f, 100.0f, 0.0f, 1.0f, 200);
        ImageView imageView3 = (ImageView) mo2261c(C3891l.jumaji_medium_leaf_3);
        C12932j.m33815a((Object) imageView3, "jumaji_medium_leaf_3");
        C5435d.m15447a(imageView3, -90.0f, 1.0f, 100.0f, 0.0f, 1.0f, 200);
        ImageView imageView4 = (ImageView) mo2261c(C3891l.jumaji_fern_leaf_1);
        C12932j.m33815a((Object) imageView4, "jumaji_fern_leaf_1");
        C5435d.m15447a(imageView4, -90.0f, 1.0f, 100.0f, 0.0f, 1.0f, 200);
        ImageView imageView5 = (ImageView) mo2261c(C3891l.jumaji_fern_leaf_2);
        C12932j.m33815a((Object) imageView5, "jumaji_fern_leaf_2");
        C5435d.m15447a(imageView5, 90.0f, 1.0f, 100.0f, 0.0f, 1.0f, 200);
        ImageView imageView6 = (ImageView) mo2261c(C3891l.jumaji_big_leaf);
        C12932j.m33815a((Object) imageView6, "jumaji_big_leaf");
        C5435d.m15447a(imageView6, -90.0f, 1.0f, -100.0f, 0.0f, 1.0f, 200);
        ImageView imageView7 = (ImageView) mo2261c(C3891l.jumaji_fern_leaf_3);
        C12932j.m33815a((Object) imageView7, "jumaji_fern_leaf_3");
        C5435d.m15447a(imageView7, 90.0f, 1.0f, -100.0f, 0.0f, 1.0f, 200);
    }

    public JungleView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.view_jungle, this);
    }
}
