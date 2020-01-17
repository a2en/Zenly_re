package app.zenly.locator.chat.capsules;

import app.zenly.locator.core.p072ui.view.particles.ParticlesGroupEmojisAnimation.OnNewParticleStartedCallback;

/* renamed from: app.zenly.locator.chat.capsules.d */
/* compiled from: lambda */
public final /* synthetic */ class C1901d implements OnNewParticleStartedCallback {

    /* renamed from: a */
    private final /* synthetic */ C1911b f6210a;

    /* renamed from: b */
    private final /* synthetic */ int f6211b;

    public /* synthetic */ C1901d(C1911b bVar, int i) {
        this.f6210a = bVar;
        this.f6211b = i;
    }

    public final void onNewParticleStarted(int i) {
        this.f6210a.itemView.post(new C1900c(i, this.f6211b, this.f6210a));
    }
}
