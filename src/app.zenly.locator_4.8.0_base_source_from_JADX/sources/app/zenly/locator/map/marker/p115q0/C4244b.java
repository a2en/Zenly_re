package app.zenly.locator.map.marker.p115q0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import app.zenly.locator.R;
import app.zenly.locator.map.marker.AvatarMarkerView;
import app.zenly.locator.p143s.p146j.C5432b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.marker.q0.b */
public final class C4244b {

    /* renamed from: a */
    private FrameLayout f11382a;

    /* renamed from: b */
    private final C4242a f11383b;

    /* renamed from: c */
    private final C4242a f11384c;

    /* renamed from: d */
    private final C4242a f11385d;

    /* renamed from: e */
    private C4242a f11386e = this.f11383b;

    /* renamed from: f */
    private final AvatarMarkerView f11387f;

    /* renamed from: app.zenly.locator.map.marker.q0.b$a */
    public static final class C4245a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ FrameLayout f11388b;

        /* renamed from: c */
        final /* synthetic */ Runnable f11389c;

        C4245a(FrameLayout frameLayout, long j, Runnable runnable) {
            this.f11388b = frameLayout;
            this.f11389c = runnable;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            this.f11388b.setVisibility(4);
            Runnable runnable = this.f11389c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.q0.b$b */
    public static final class C4246b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ Runnable f11390b;

        C4246b(long j, Runnable runnable) {
            this.f11390b = runnable;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            Runnable runnable = this.f11390b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C4244b(AvatarMarkerView avatarMarkerView) {
        C12932j.m33818b(avatarMarkerView, "markerView");
        this.f11387f = avatarMarkerView;
        AvatarMarkerView avatarMarkerView2 = this.f11387f;
        this.f11383b = new C4242a(avatarMarkerView2, R.id.marker_dot_default, avatarMarkerView2.getResources().getDimensionPixelSize(R.dimen.stroke_50));
        AvatarMarkerView avatarMarkerView3 = this.f11387f;
        this.f11384c = new C4242a(avatarMarkerView3, R.id.marker_dot_heading, avatarMarkerView3.getResources().getDimensionPixelSize(R.dimen.stroke_100));
        AvatarMarkerView avatarMarkerView4 = this.f11387f;
        this.f11385d = new C4242a(avatarMarkerView4, R.id.marker_dot_sleeping, avatarMarkerView4.getResources().getDimensionPixelSize(R.dimen.stroke_100));
    }

    /* renamed from: a */
    public final C4242a mo11243a() {
        return this.f11383b;
    }

    /* renamed from: b */
    public final C4242a mo11247b() {
        return this.f11384c;
    }

    /* renamed from: c */
    public final C4242a mo11250c() {
        return this.f11385d;
    }

    /* renamed from: a */
    public final void mo11246a(C4242a aVar) {
        C12932j.m33818b(aVar, "value");
        if (!C12932j.m33817a((Object) aVar, (Object) this.f11386e)) {
            if (this.f11382a != null) {
                this.f11386e.mo11238a();
            }
            this.f11386e = aVar;
            if (this.f11382a != null) {
                this.f11386e.mo11240b();
            }
        }
    }

    /* renamed from: b */
    public final void mo11248b(int i) {
        this.f11384c.mo11239a(i);
        this.f11385d.mo11239a(i);
    }

    /* renamed from: b */
    public final void mo11249b(long j, Runnable runnable) {
        if (this.f11382a == null) {
            View findViewById = this.f11387f.findViewById(R.id.marker_dot_container);
            if (findViewById != null) {
                View inflate = ((ViewStub) findViewById).inflate();
                if (inflate != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    frameLayout.setAlpha(0.0f);
                    this.f11382a = frameLayout;
                    this.f11386e.mo11240b();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
            }
        }
        FrameLayout frameLayout2 = this.f11382a;
        if (frameLayout2 != null) {
            frameLayout2.animate().cancel();
            frameLayout2.setVisibility(0);
            if (j == 0) {
                frameLayout2.setAlpha(1.0f);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            frameLayout2.animate().setDuration(j).alpha(1.0f).setListener(new C4246b(j, runnable));
        }
    }

    /* renamed from: a */
    public final void mo11244a(int i) {
        this.f11383b.mo11239a(i);
        this.f11384c.mo11241b(i);
        this.f11384c.mo11242c(i);
        this.f11385d.mo11241b(i);
        this.f11385d.mo11242c(i);
    }

    /* renamed from: a */
    public final void mo11245a(long j, Runnable runnable) {
        FrameLayout frameLayout = this.f11382a;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            if (j == 0) {
                frameLayout.setVisibility(4);
                frameLayout.setAlpha(0.0f);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            frameLayout.animate().setDuration(j).alpha(0.0f).setListener(new C4245a(frameLayout, j, runnable));
        }
    }
}
