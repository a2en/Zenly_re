package app.zenly.locator.chat.capsules;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.base.view.C1309a;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.p143s.p146j.C5432b;
import java.util.List;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.chat.capsules.t */
public final class C1941t {

    /* renamed from: a */
    private final C2477e f6287a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f6288b;

    /* renamed from: c */
    private final List<ImageView> f6289c = C12848o.m33643b((Object[]) new ImageView[]{(ImageView) this.f6291e.findViewById(C3891l.chat_user_1), (ImageView) this.f6291e.findViewById(C3891l.chat_user_2), (ImageView) this.f6291e.findViewById(C3891l.chat_user_3), (ImageView) this.f6291e.findViewById(C3891l.chat_user_4)});

    /* renamed from: d */
    private final ObjectAnimator f6290d;

    /* renamed from: e */
    private final View f6291e;

    /* renamed from: app.zenly.locator.chat.capsules.t$a */
    public static final class C1942a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ C1941t f6292b;

        C1942a(C1941t tVar) {
            this.f6292b = tVar;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            super.mo7336a(animator, z);
            this.f6292b.mo7691a(false);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.t$b */
    static final class C1943b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C1941t f6293e;

        /* renamed from: f */
        final /* synthetic */ boolean f6294f;

        C1943b(C1941t tVar, boolean z) {
            this.f6293e = tVar;
            this.f6294f = z;
        }

        public final void run() {
            this.f6293e.f6288b = this.f6294f;
        }
    }

    /* JADX INFO: used method not loaded: kotlin.collections.o.b(java.lang.Object[]):null, types can be incorrect */
    public C1941t(View view) {
        C12932j.m33818b(view, "containerView");
        this.f6291e = view;
        Context context = this.f6291e.getContext();
        C12932j.m33815a((Object) context, "containerView.context");
        this.f6287a = new C2477e(context);
        this.f6291e.setVisibility(0);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f6291e.findViewById(C3891l.chat_group_target_container);
        C12932j.m33815a((Object) constraintLayout, "containerView.chat_group_target_container");
        constraintLayout.setClipToOutline(true);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6291e, C1309a.f4895a, new float[]{1.0f, 1.2f, 1.0f});
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(C7657c.m18643b());
        ofFloat.addListener(new C1942a(this));
        this.f6290d = ofFloat;
    }

    /* renamed from: a */
    public final void mo7690a(List<UserProto$User> list) {
        C12932j.m33818b(list, "users");
        List a = C12853s.m33648a(C12857w.m33675c((Iterable) list, this.f6289c.size()));
        int i = 0;
        for (Object next : this.f6289c) {
            int i2 = i + 1;
            if (i >= 0) {
                ImageView imageView = (ImageView) next;
                String str = "avatar";
                if (i < a.size()) {
                    C12932j.m33815a((Object) imageView, str);
                    imageView.setVisibility(0);
                    this.f6287a.load(C2884f.m9355a((UserProto$User) a.get(i))).withCorners(new C1335a(0.0f)).into(imageView);
                } else {
                    C12932j.m33815a((Object) imageView, str);
                    imageView.setVisibility(8);
                }
                i = i2;
            } else {
                C12844m.m33616c();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo7689a(int i) {
        if (i == 1 && !this.f6288b) {
            mo7691a(true);
        }
    }

    /* renamed from: a */
    public final void mo7691a(boolean z) {
        float f = z ? 1.0f : 0.0f;
        long j = z ? 0 : 300;
        this.f6290d.cancel();
        this.f6291e.animate().scaleX(f).scaleY(f).setStartDelay(j).setDuration(300).setInterpolator(C7657c.m18643b()).withStartAction(new C1943b(this, z));
    }

    /* renamed from: a */
    public final void mo7688a() {
        ObjectAnimator objectAnimator = this.f6290d;
        C12932j.m33815a((Object) objectAnimator, "avatarBlinkAnimator");
        if (!objectAnimator.isRunning()) {
            this.f6290d.start();
        }
    }
}
