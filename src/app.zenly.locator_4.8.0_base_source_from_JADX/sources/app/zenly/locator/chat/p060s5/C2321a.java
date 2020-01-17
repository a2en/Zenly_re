package app.zenly.locator.chat.p060s5;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.TextView;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p160v.p161b.C5543i;
import app.zenly.locator.privacy.model.C5082d;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.chat.s5.a */
public final class C2321a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TextView f7035a;

    /* renamed from: app.zenly.locator.chat.s5.a$a */
    public static final class C2322a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ C2321a f7036b;

        /* renamed from: app.zenly.locator.chat.s5.a$a$a */
        public static final class C2323a extends C5432b {

            /* renamed from: b */
            final /* synthetic */ C2322a f7037b;

            C2323a(C2322a aVar) {
                this.f7037b = aVar;
            }

            /* renamed from: a */
            public void mo7336a(Animator animator, boolean z) {
                C12932j.m33818b(animator, "animation");
                if (!z) {
                    this.f7037b.f7036b.f7035a.setVisibility(8);
                }
            }
        }

        C2322a(C2321a aVar, String str, C5082d dVar) {
            this.f7036b = aVar;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            if (!z) {
                this.f7036b.f7035a.animate().alpha(0.0f).setInterpolator(C7657c.m18649e()).setDuration(300).setStartDelay(3000).setListener(new C2323a(this)).start();
            }
        }
    }

    public C2321a(TextView textView) {
        C12932j.m33818b(textView, "precisionView");
        this.f7035a = textView;
    }

    /* renamed from: a */
    public final void mo8224a(String str, C5082d dVar) {
        String str2;
        C12932j.m33818b(str, "userName");
        C12932j.m33818b(dVar, "precision");
        TextView textView = this.f7035a;
        String string = textView.getContext().getString(R.string.map_callout_ghost_label);
        Object[] objArr = new Object[2];
        objArr[0] = str;
        C7685b bVar = new C7685b();
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        C12932j.m33815a((Object) valueOf, "ColorStateList.valueOf(Color.WHITE)");
        bVar.mo19897a((Object) new C7690a(valueOf, null, 2, null));
        Context context = textView.getContext();
        C12932j.m33815a((Object) context, "context");
        bVar.mo19897a((Object) new C7691b(context, C7770f.TextAppearance_Section));
        if (dVar == C5082d.Frozen) {
            str2 = textView.getContext().getString(R.string.map_callout_ghost_label_frozen);
        } else {
            str2 = textView.getContext().getString(R.string.map_callout_ghost_label_blurred);
        }
        C12932j.m33815a((Object) str2, "if (precision == Privacy…ed)\n                    }");
        bVar.mo19896a((CharSequence) str2);
        bVar.mo19899c();
        bVar.mo19899c();
        objArr[1] = bVar.mo19893a();
        textView.setText(C5543i.m15727a(string, objArr));
        textView.setVisibility(0);
        textView.setScaleX(0.0f);
        textView.setScaleY(0.0f);
        textView.setAlpha(1.0f);
        textView.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(C7657c.m18647d()).setDuration(900).setStartDelay(1000).setListener(new C2322a(this, str, dVar)).start();
    }

    /* renamed from: a */
    public final void mo8223a() {
        this.f7035a.animate().cancel();
        this.f7035a.setVisibility(8);
    }
}
