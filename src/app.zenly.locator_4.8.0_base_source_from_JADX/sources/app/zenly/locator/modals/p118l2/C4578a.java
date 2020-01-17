package app.zenly.locator.modals.p118l2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.particles.C3171e;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.modals.ModalController;
import app.zenly.locator.modals.p121o2.C4647e;
import app.zenly.locator.modals.p121o2.C4655h;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.modals.l2.a */
public final class C4578a extends ModalController {

    /* renamed from: U */
    public static final C4579a f12211U = new C4579a(null);

    /* renamed from: Q */
    private final String f12212Q;

    /* renamed from: R */
    private final C4581b f12213R;

    /* renamed from: S */
    private C4647e f12214S;

    /* renamed from: T */
    private C3171e f12215T;

    /* renamed from: app.zenly.locator.modals.l2.a$a */
    public static final class C4579a {
        private C4579a() {
        }

        /* renamed from: a */
        public final C4578a mo11718a(String str) {
            C12932j.m33818b(str, "packUuid");
            Bundle bundle = new Bundle();
            bundle.putString("args:pack_uuid", str);
            return new C4578a(bundle);
        }

        public /* synthetic */ C4579a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.modals.l2.a$b */
    static final class C4580b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4578a f12216e;

        C4580b(C4578a aVar) {
            this.f12216e = aVar;
        }

        public final void onClick(View view) {
            this.f12216e.mo7192B();
        }
    }

    public C4578a(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        String string = bundle.getString("args:pack_uuid");
        if (string != null) {
            this.f12212Q = string;
            this.f12213R = new C4581b(this, this.f12212Q);
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: d */
    public static final C4578a m13411d(String str) {
        return f12211U.mo11718a(str);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11716a(app.zenly.locator.chat.panel.emojis.C2234d0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "packInfo"
            kotlin.jvm.internal.C12932j.m33818b(r9, r0)
            app.zenly.locator.s.a r0 = app.zenly.locator.p143s.C5343a.m15160U()
            r0.mo12812a(r9)
            app.zenly.locator.modals.o2.e r0 = r8.f12214S
            java.lang.String r1 = "modalView"
            r2 = 0
            if (r0 == 0) goto L_0x00d8
            android.content.Context r0 = r0.getContext()
            app.zenly.locator.modals.o2.e r3 = r8.f12214S
            if (r3 == 0) goto L_0x00d4
            r4 = 2132017535(0x7f14017f, float:1.9673351E38)
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = "context.getString(R.stri…mojiUnlock_success_title)"
            kotlin.jvm.internal.C12932j.m33815a(r4, r5)
            r3.setTitle(r4)
            co.znly.models.services.w3 r3 = r9.mo8093b()
            java.lang.String r3 = r3.getUuid()
            if (r3 != 0) goto L_0x0035
            goto L_0x008d
        L_0x0035:
            int r4 = r3.hashCode()
            switch(r4) {
                case -1311613662: goto L_0x007d;
                case -515247532: goto L_0x006d;
                case 1862979834: goto L_0x005d;
                case 1897346839: goto L_0x004d;
                case 1897349597: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x008d
        L_0x003d:
            java.lang.String r4 = "ly.zen.ping.pro"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r3 = 2131886125(0x7f12002d, float:1.940682E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x008e
        L_0x004d:
            java.lang.String r4 = "ly.zen.ping.mvp"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r3 = 2131886124(0x7f12002c, float:1.9406818E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x008e
        L_0x005d:
            java.lang.String r4 = "ly.zen.ping.expert"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r3 = 2131886123(0x7f12002b, float:1.9406816E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x008e
        L_0x006d:
            java.lang.String r4 = "ly.zen.ping.captain"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r3 = 2131886122(0x7f12002a, float:1.9406814E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x008e
        L_0x007d:
            java.lang.String r4 = "ly.zen.ping.star"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r3 = 2131886126(0x7f12002e, float:1.9406822E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x008e
        L_0x008d:
            r3 = r2
        L_0x008e:
            app.zenly.locator.modals.o2.e r4 = r8.f12214S
            if (r4 == 0) goto L_0x00d0
            if (r3 == 0) goto L_0x00c0
            java.lang.String r5 = "context"
            kotlin.jvm.internal.C12932j.m33815a(r0, r5)
            android.content.res.Resources r0 = r0.getResources()
            int r3 = r3.intValue()
            co.znly.models.services.w3 r5 = r9.mo8093b()
            int r5 = r5.getUnlockValue()
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            co.znly.models.services.w3 r9 = r9.mo8093b()
            int r9 = r9.getUnlockValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6[r7] = r9
            java.lang.String r9 = r0.getQuantityString(r3, r5, r6)
            goto L_0x00c1
        L_0x00c0:
            r9 = r2
        L_0x00c1:
            r4.setSubtitle(r9)
            app.zenly.locator.modals.o2.e r9 = r8.f12214S
            if (r9 == 0) goto L_0x00cc
            r9.mo11832a()
            return
        L_0x00cc:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r2
        L_0x00d0:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r2
        L_0x00d4:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r2
        L_0x00d8:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.modals.p118l2.C4578a.mo11716a(app.zenly.locator.chat.panel.emojis.d0):void");
    }

    /* renamed from: b */
    public C4655h mo10304b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        Context context = viewGroup.getContext();
        C12932j.m33815a((Object) context, "container.context");
        this.f12214S = new C4647e(context);
        C4647e eVar = this.f12214S;
        String str = "modalView";
        if (eVar != null) {
            eVar.setCloseButtonClickListener(new C4580b(this));
            C4581b bVar = this.f12213R;
            C4647e eVar2 = this.f12214S;
            if (eVar2 != null) {
                Context context2 = eVar2.getContext();
                C12932j.m33815a((Object) context2, "modalView.context");
                bVar.mo11721a(context2);
                C4647e eVar3 = this.f12214S;
                if (eVar3 != null) {
                    return eVar3;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f12213R.mo11720a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        C3171e eVar = this.f12215T;
        if (eVar != null) {
            eVar.mo9505m();
        }
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        C4647e eVar = this.f12214S;
        String str = "modalView";
        if (eVar != null) {
            View findViewById = eVar.findViewById(R.id.modal_title);
            C12932j.m33815a((Object) findViewById, "modalView.findViewById<View>(R.id.modal_title)");
            findViewById.setPadding(rect.left, rect.top, rect.right, findViewById.getPaddingBottom());
            C4647e eVar2 = this.f12214S;
            if (eVar2 != null) {
                View findViewById2 = eVar2.findViewById(R.id.modal_close_layout);
                C12932j.m33815a((Object) findViewById2, "modalView.findViewById<V…(R.id.modal_close_layout)");
                findViewById2.setPadding(rect.left, findViewById2.getPaddingTop(), rect.right, rect.bottom);
                return;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5499a aVar = C5498a.f14119e;
        C4647e eVar = this.f12214S;
        if (eVar != null) {
            Context context = eVar.getContext();
            C12932j.m33815a((Object) context, "modalView.context");
            aVar.mo13125a(context).mo13124a(C5501c.HEAVY, C5500b.REWARD, 2);
            return;
        }
        C12932j.m33820c("modalView");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C3171e eVar = this.f12215T;
        if (eVar != null) {
            eVar.mo9507o();
        }
    }

    /* renamed from: a */
    public final void mo11717a(List<Bitmap> list) {
        C12932j.m33818b(list, "emojis");
        C3171e eVar = this.f12215T;
        if (eVar != null) {
            eVar.mo9493a(true);
        }
        C4647e eVar2 = this.f12214S;
        String str = "modalView";
        if (eVar2 != null) {
            int width = eVar2.getParticles().getWidth();
            C4647e eVar3 = this.f12214S;
            if (eVar3 != null) {
                this.f12215T = new C3171e(new Rect(0, 0, width, eVar3.getParticles().getHeight()));
                for (Bitmap bitmap : list) {
                    C3171e eVar4 = this.f12215T;
                    if (eVar4 != null) {
                        eVar4.mo9489a(bitmap, 14);
                    }
                }
                C4647e eVar5 = this.f12214S;
                if (eVar5 != null) {
                    eVar5.getParticles().mo9542a((ParticleAnimation) this.f12215T);
                    C3171e eVar6 = this.f12215T;
                    if (eVar6 != null) {
                        eVar6.mo9509q();
                        return;
                    }
                    return;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }
}
