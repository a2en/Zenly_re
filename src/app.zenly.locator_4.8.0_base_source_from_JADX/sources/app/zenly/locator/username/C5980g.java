package app.zenly.locator.username;

import android.content.Context;
import app.zenly.locator.cards.C1815k;
import java.io.File;
import kotlin.jvm.internal.C12932j;
import p213co.znly.cardgenerator.CardGenerator;
import p213co.znly.cardgenerator.CardGenerator.CardGeneratorProgress;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.username.g */
public final class C5980g implements UsernamePreviewRenderer {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5982b f15038a = C5982b.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final UsernamePreviewRenderListener f15039b;

    /* renamed from: c */
    private final int f15040c;

    /* renamed from: d */
    private final C1815k f15041d;

    /* renamed from: app.zenly.locator.username.g$a */
    public static final class C5981a {
        private C5981a() {
        }

        public /* synthetic */ C5981a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.g$b */
    private enum C5982b {
        CANCELING,
        IDLE,
        RENDERING
    }

    /* renamed from: app.zenly.locator.username.g$c */
    public static final class C5983c implements CardGeneratorProgress {

        /* renamed from: a */
        final /* synthetic */ C5980g f15046a;

        C5983c(C5980g gVar) {
            this.f15046a = gVar;
        }

        public void onError(Throwable th) {
            C12932j.m33818b(th, "t");
            int i = C5984h.f15049c[this.f15046a.f15038a.ordinal()];
            if (i == 1) {
                this.f15046a.f15039b.onCancel();
                this.f15046a.f15038a = C5982b.IDLE;
            } else if (i != 2 && i == 3) {
                this.f15046a.f15039b.onError();
                this.f15046a.f15038a = C5982b.IDLE;
            }
        }

        public void onFinish(File file) {
            C12932j.m33818b(file, "output");
            int i = C5984h.f15047a[this.f15046a.f15038a.ordinal()];
            if (i == 1) {
                this.f15046a.f15039b.onCancel();
                this.f15046a.f15038a = C5982b.IDLE;
            } else if (i != 2 && i == 3) {
                this.f15046a.f15039b.onSuccess(file);
                this.f15046a.f15038a = C5982b.IDLE;
            }
        }

        public void onProgress(float f) {
            int i = C5984h.f15048b[this.f15046a.f15038a.ordinal()];
            if (i == 1) {
                this.f15046a.f15039b.onCancel();
                this.f15046a.f15038a = C5982b.IDLE;
            } else if (i != 2 && i == 3) {
                this.f15046a.f15039b.onProgress(f);
            }
        }
    }

    static {
        new C5981a(null);
    }

    public C5980g(UsernamePreviewRenderListener usernamePreviewRenderListener, int i, C1815k kVar) {
        C12932j.m33818b(usernamePreviewRenderListener, "listener");
        C12932j.m33818b(kVar, "renderingOutput");
        this.f15039b = usernamePreviewRenderListener;
        this.f15040c = i;
        this.f15041d = kVar;
    }

    public void render(Context context, String str, String str2, File file) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "name");
        C12932j.m33818b(str2, "url");
        C12932j.m33818b(file, "outputFile");
        this.f15038a = C5982b.RENDERING;
        try {
            CardGenerator cardGenerator = new CardGenerator(context);
            cardGenerator.mo14203a(this.f15041d.mo7475b(), this.f15041d.mo7474a());
            cardGenerator.mo14204a(3100);
            String[][] strArr = {new String[]{"username", str}, new String[]{"userlink", str2}};
            C5968a a = C5968a.f15017k.mo13702a(this.f15040c);
            cardGenerator.mo14205a(a.mo13701c(), a.mo13699a(), strArr, file, new C5983c(this));
        } catch (Exception e) {
            C12143a.m32032b(e, "Unable to render the card", new Object[0]);
            if (this.f15038a == C5982b.CANCELING) {
                this.f15039b.onCancel();
            } else {
                this.f15039b.onError();
            }
            this.f15038a = C5982b.IDLE;
        }
    }

    /* renamed from: b */
    public final boolean mo13718b() {
        return this.f15038a == C5982b.RENDERING;
    }

    /* renamed from: a */
    public final void mo13717a() {
        this.f15038a = C5982b.CANCELING;
    }
}
