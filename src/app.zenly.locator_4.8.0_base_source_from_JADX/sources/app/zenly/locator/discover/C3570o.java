package app.zenly.locator.discover;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p207x.C6272z1;
import com.airbnb.lottie.LottieAnimationView;
import com.bluelinelabs.conductor.C8819d;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.discover.o */
public class C3570o extends ZenlyController implements OnClickListener {

    /* renamed from: P */
    private LottieAnimationView f9612P;

    /* renamed from: Q */
    private View f9613Q;

    /* renamed from: R */
    private View f9614R;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_discover_end, viewGroup, false);
        this.f9612P = (LottieAnimationView) inflate.findViewById(R.id.img_anim);
        this.f9613Q = inflate.findViewById(R.id.view_restart);
        this.f9614R = inflate.findViewById(R.id.img_exit);
        this.f9613Q.setOnClickListener(this);
        this.f9614R.setOnClickListener(this);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        m10821a(this.f9614R, 600);
        this.f9612P.mo22807d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f9612P.mo22797a();
        super.mo7053d(view);
    }

    public void onClick(View view) {
        C8819d l = mo23947l();
        if (l instanceof C6272z1) {
            C6272z1 z1Var = (C6272z1) l;
            int id = view.getId();
            if (id == R.id.img_exit) {
                C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
                z1Var.mo14123d("end_view_exit_button_tap");
            } else if (id == R.id.view_restart) {
                C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
                z1Var.mo14094H();
            }
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    /* renamed from: a */
    private void m10821a(View view, long j) {
        view.setTranslationY((float) C3200e0.m10183a((Context) mo23920b(), 260));
        view.setAlpha(0.0f);
        view.animate().translationY(0.0f).alpha(1.0f).setStartDelay(j).setDuration(300).setInterpolator(C7657c.m18650f());
    }
}
