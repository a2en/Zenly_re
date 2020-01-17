package app.zenly.locator.p210z.p211b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.block.C1713b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p210z.p211b.C6321l.C6323b;
import app.zenly.locator.report.base.ReportBlockController;
import p213co.znly.models.services.C8137k1;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.z.b.h */
public final class C6317h extends ReportBlockController {

    /* renamed from: d0 */
    private final C12275b f15841d0 = new C12275b();

    public C6317h(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: K */
    public /* synthetic */ void mo14163K() throws Exception {
        mo12768e(false);
        mo12758F();
        mo12767c(new C6318i(mo12756D()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.mo7054a(layoutInflater, viewGroup);
        Context context = a.getContext();
        mo12762J().setText(context.getString(R.string.report_user_block_title, new Object[]{this.f13762P}));
        mo12759G().setText(context.getString(R.string.report_user_block_message, new Object[]{this.f13762P, this.f13762P}));
        mo12765a((Callback) new C6313d(this, context));
        this.f15841d0.add(this.f13736b0.mo36412a((Consumer<? super T>) new C6314e<Object>(this, context), (Consumer<? super Throwable>) new C6310a<Object>(this, context)));
        mo12761I().setText(context.getString(R.string.report_user_block_nobutton, new Object[]{this.f13762P}));
        return a;
    }

    /* renamed from: b */
    public /* synthetic */ void mo14167b(Context context, Throwable th) throws Exception {
        mo12760H().setText(context.getString(R.string.report_user_block_yesbutton, new Object[]{this.f13762P}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        mo12768e(false);
        this.f15841d0.mo36401a();
        super.mo7066c(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14166a(Context context, boolean z) {
        this.f13765S.mo22151a(z);
        mo12768e(true);
        this.f15841d0.add(mo12763a(this.f13765S.getIsTargetBlocked(), C1713b.m7058a(C6323b.m17397a(this.f13765S.getReason()))).mo36341a((CompletableSource) C5448c.m15478a().chatReportMessage((C8137k1) this.f13765S.build()).mo36498h()).mo36342a(C12295a.m32802a()).mo36345a(new C6312c(this), new C6311b(this, context)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14165a(Context context, Throwable th) throws Exception {
        mo12768e(false);
        Toast.makeText(context, R.string.commons_content_oopserror, 0).show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14164a(Context context, Boolean bool) throws Exception {
        mo12760H().setText(context.getString(bool.booleanValue() ? R.string.report_user_unfriendAndBlock_yesbutton : R.string.report_user_block_yesbutton, new Object[]{this.f13762P}));
    }
}
