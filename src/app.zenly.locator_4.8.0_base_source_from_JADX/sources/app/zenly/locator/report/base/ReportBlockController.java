package app.zenly.locator.report.base;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import app.zenly.locator.R;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.p143s.p148l.C5448c;
import com.bluelinelabs.conductor.C8819d;
import java.util.Map;
import p213co.znly.models.services.C8189n5;
import p213co.znly.models.services.C8189n5.C8190a;
import p213co.znly.models.services.C8189n5.C8191b;
import p213co.znly.models.services.C8271s2;
import p213co.znly.models.services.C8271s2.C8272a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p392c.C12295a;

public abstract class ReportBlockController extends C5341j {

    /* renamed from: U */
    private TextView f13729U;

    /* renamed from: V */
    private TextView f13730V;

    /* renamed from: W */
    private RadioGroup f13731W;

    /* renamed from: X */
    private RadioButton f13732X;

    /* renamed from: Y */
    private RadioButton f13733Y;

    /* renamed from: Z */
    private View f13734Z;

    /* renamed from: a0 */
    private View f13735a0;

    /* renamed from: b0 */
    protected C12279e<Boolean> f13736b0;

    /* renamed from: c0 */
    private FriendStore f13737c0;

    protected interface Callback {
        void onBlockChanged(boolean z);
    }

    public ReportBlockController(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public /* bridge */ /* synthetic */ Bundle mo12756D() {
        return super.mo12756D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public /* bridge */ /* synthetic */ Bundle mo12757E() {
        return super.mo12757E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public /* bridge */ /* synthetic */ void mo12758F() {
        super.mo12758F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public TextView mo12759G() {
        return this.f13730V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public RadioButton mo12760H() {
        return this.f13732X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public RadioButton mo12761I() {
        return this.f13733Y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public TextView mo12762J() {
        return this.f13729U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f13737c0 = C3015a.m9526a(context).provideFriendStore();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo12767c(C8819d dVar) {
        super.mo12767c(dVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        mo7192B();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_report_block, viewGroup, false);
        this.f13729U = (TextView) inflate.findViewById(R.id.report_block_title);
        this.f13730V = (TextView) inflate.findViewById(R.id.report_block_content);
        this.f13731W = (RadioGroup) inflate.findViewById(R.id.report_block_radio_group);
        this.f13732X = (RadioButton) inflate.findViewById(R.id.report_block_do_block);
        this.f13733Y = (RadioButton) inflate.findViewById(R.id.report_block_dont_block);
        this.f13734Z = inflate.findViewById(R.id.report_feedback_next);
        this.f13735a0 = inflate.findViewById(R.id.report_feedback_next_progress_bar);
        this.f13736b0 = this.f13737c0.friendsMap().mo36501i(new C5331a(this)).mo36477d().mo36506l().mo36428a(C12295a.m32802a());
        inflate.findViewById(R.id.report_feedback_previous).setOnClickListener(new C5333c(this));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo12768e(boolean z) {
        int i = 8;
        this.f13734Z.setVisibility(z ? 8 : 0);
        View view = this.f13735a0;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo12764a(Map map) throws Exception {
        return Boolean.valueOf(map.containsKey(this.f13763Q));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12765a(Callback callback) {
        this.f13731W.setOnCheckedChangeListener(new C5335e(this, callback));
        if (this.f13731W.getCheckedRadioButtonId() == -1) {
            this.f13732X.setChecked(true);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12766a(Callback callback, RadioGroup radioGroup, int i) {
        this.f13734Z.setOnClickListener(new C5338h(this, callback, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12271b mo12763a(boolean z, C8191b bVar) {
        if (!z) {
            return C12271b.m32508c();
        }
        C8190a newBuilder = C8189n5.newBuilder();
        newBuilder.mo22166a(this.f13763Q);
        newBuilder.mo22165a(bVar);
        C8189n5 n5Var = (C8189n5) newBuilder.build();
        if (!(this.f13737c0.friendCache(this.f13763Q) != null)) {
            return C5448c.m15478a().userBlock(n5Var).mo36498h();
        }
        C8272a newBuilder2 = C8271s2.newBuilder();
        newBuilder2.setUuid(this.f13763Q);
        return C5448c.m15478a().friendDelete((C8271s2) newBuilder2.build()).mo36455b((Consumer<? super T>) C5332b.f13750e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C5334d<Object,Object>(n5Var)).mo36498h();
    }
}
