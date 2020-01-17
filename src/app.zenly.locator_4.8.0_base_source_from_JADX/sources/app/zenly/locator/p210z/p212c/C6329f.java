package app.zenly.locator.p210z.p212c;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.block.C1713b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p210z.p212c.C6332i.C6334b;
import app.zenly.locator.report.base.ReportBlockController;
import p213co.znly.models.services.C8262r5;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.z.c.f */
public final class C6329f extends ReportBlockController {

    /* renamed from: d0 */
    private final C12275b f15857d0 = new C12275b();

    public C6329f(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: K */
    public /* synthetic */ void mo14170K() throws Exception {
        mo12768e(false);
        mo12767c(new C6330g(mo12757E()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.mo7054a(layoutInflater, viewGroup);
        Context context = a.getContext();
        mo12762J().setText(context.getString(R.string.report_user_block_title, new Object[]{this.f13762P}));
        mo12759G().setText(context.getString(R.string.report_user_block_message, new Object[]{this.f13762P, this.f13762P}));
        mo12765a((Callback) new C6325b(this, context));
        mo12760H().setText(context.getString(R.string.report_user_block_yesbutton, new Object[]{this.f13762P}));
        mo12761I().setText(context.getString(R.string.report_user_block_nobutton, new Object[]{this.f13762P}));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        mo12768e(false);
        this.f15857d0.mo36401a();
        super.mo7066c(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14172a(Context context, boolean z) {
        this.f13764R.mo22226a(z);
        mo12768e(true);
        this.f15857d0.add(mo12763a(this.f13764R.getIsTargetBlocked(), C1713b.m7059a(C6334b.m17414a(this.f13764R.getReason()))).mo36341a((CompletableSource) C5448c.m15478a().userReport((C8262r5) this.f13764R.build()).mo36498h()).mo36342a(C12295a.m32802a()).mo36345a(new C6326c(this), new C6324a(this, context)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14171a(Context context, Throwable th) throws Exception {
        mo12768e(false);
        Toast.makeText(context, R.string.commons_content_oopserror, 0).show();
    }
}
