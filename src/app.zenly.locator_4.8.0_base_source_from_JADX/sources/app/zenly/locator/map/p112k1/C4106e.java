package app.zenly.locator.map.p112k1;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import app.zenly.android.base.view.C1311b;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3238u;
import app.zenly.locator.debug.C3439b;
import app.zenly.locator.map.p111j1.C4079a;
import app.zenly.locator.map.view.HeaderView;
import app.zenly.locator.p143s.p146j.C5432b;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.map.k1.e */
public final class C4106e {

    /* renamed from: c */
    private static final int[] f10750c = {R.string.launch_welcometext0, R.string.launch_welcometext1, R.string.launch_welcometext2, R.string.launch_welcometext3, R.string.launch_welcometext4, R.string.launch_welcometext5, R.string.launch_welcometext6, R.string.launch_welcometext7, R.string.launch_welcometext8, R.string.launch_welcometext9, R.string.launch_welcometext10, R.string.launch_welcometext11, R.string.launch_welcometext12, R.string.launch_welcometext13, R.string.launch_welcometext14, R.string.launch_welcometext15, R.string.launch_welcometext16, R.string.launch_welcometext17, R.string.launch_welcometext18, R.string.launch_welcometext19, R.string.launch_welcometext20, R.string.launch_welcometext21, R.string.launch_welcometext22, R.string.launch_welcometext23, R.string.launch_welcometext24, R.string.launch_welcometext25, R.string.launch_welcometext26, R.string.launch_welcometext27, R.string.launch_welcometext28, R.string.launch_welcometext29, R.string.launch_welcometext20, R.string.launch_welcometext21, R.string.launch_welcometext22, R.string.launch_welcometext23, R.string.launch_welcometext24, R.string.launch_welcometext25, R.string.launch_welcometext26, R.string.launch_welcometext27, R.string.launch_welcometext28, R.string.launch_welcometext29, R.string.launch_welcometext30, R.string.launch_welcometext31, R.string.launch_welcometext32, R.string.launch_welcometext33, R.string.launch_welcometext34, R.string.launch_welcometext35, R.string.launch_welcometext36, R.string.launch_welcometext37, R.string.launch_welcometext38, R.string.launch_welcometext39, R.string.launch_welcometext40, R.string.launch_welcometext41, R.string.launch_welcometext42, R.string.launch_welcometext43, R.string.launch_welcometext44, R.string.launch_welcometext45, R.string.launch_welcometext46, R.string.launch_welcometext47, R.string.launch_welcometext48, R.string.launch_welcometext49, R.string.launch_welcometext50, R.string.launch_welcometext51, R.string.launch_welcometext52, R.string.launch_welcometext53, R.string.launch_welcometext54, R.string.launch_welcometext55, R.string.launch_welcometext56, R.string.launch_welcometext57, R.string.launch_welcometext58, R.string.launch_welcometext59, R.string.launch_welcometext60, R.string.launch_welcometext61, R.string.launch_welcometext62, R.string.launch_welcometext63, R.string.launch_welcometext64, R.string.launch_welcometext65, R.string.launch_welcometext66, R.string.launch_welcometext67, R.string.launch_welcometext68, R.string.launch_welcometext69, R.string.launch_welcometext70};

    /* renamed from: a */
    private final HeaderView f10751a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f10752b;

    /* renamed from: app.zenly.locator.map.k1.e$a */
    public static final class C4107a {
        private C4107a() {
        }

        public /* synthetic */ C4107a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.k1.e$b */
    public static final class C4108b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ TextView f10753b;

        /* renamed from: c */
        final /* synthetic */ C4106e f10754c;

        /* renamed from: d */
        final /* synthetic */ Runnable f10755d;

        C4108b(TextView textView, C4106e eVar, Runnable runnable) {
            this.f10753b = textView;
            this.f10754c = eVar;
            this.f10755d = runnable;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            C1311b.m6278a(this.f10753b);
            this.f10754c.f10752b = null;
            this.f10755d.run();
        }
    }

    static {
        new C4107a(null);
    }

    public C4106e(View view) {
        C12932j.m33818b(view, "view");
        View findViewById = view.findViewById(R.id.header_view);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.header_view)");
        this.f10751a = (HeaderView) findViewById;
        this.f10752b = (TextView) view.findViewById(R.id.tv_welcome_message);
        TextView textView = this.f10752b;
        if (textView != null) {
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "view.context");
            textView.setText(C7709b.m18762a(context, C3238u.m10271a(f10750c)));
        }
        new C4079a();
    }

    /* renamed from: a */
    public final void mo10773a(C4079a aVar) {
        C12932j.m33818b(aVar, "value");
        this.f10751a.setContextualLabeling(aVar);
        C3439b.m10684a().setContextualLabeling(aVar);
    }

    /* renamed from: a */
    public final void mo10775a(boolean z) {
        int i;
        this.f10751a.mo11433a(z);
        TextView textView = this.f10752b;
        if (textView != null) {
            if (z) {
                i = this.f10751a.getMainLabelDarkModeColor();
            } else {
                i = this.f10751a.getMainLabelBrightModeColor();
            }
            textView.setTextColor(i);
        }
    }

    /* renamed from: a */
    public final void mo10774a(Runnable runnable) {
        C12932j.m33818b(runnable, "onComplete");
        TextView textView = this.f10752b;
        if (textView != null) {
            textView.animate().translationY(-(textView.getY() + ((float) textView.getHeight()))).setStartDelay(2000).setListener(new C4108b(textView, this, runnable));
        }
    }
}
