package app.zenly.locator.modals.p121o2;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.locator.R;
import app.zenly.locator.core.widget.C3275i;
import com.airbnb.lottie.LottieAnimationView;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.modals.o2.c */
public abstract class C4644c extends C4655h {

    /* renamed from: e */
    protected final LottieAnimationView f12354e = ((LottieAnimationView) findViewById(R.id.image_view));

    /* renamed from: f */
    private final ImageView f12355f = ((ImageView) findViewById(R.id.btn_close));

    /* renamed from: g */
    private final TextView f12356g = ((TextView) findViewById(R.id.btn_primary_action));

    /* renamed from: h */
    private final TextView f12357h = ((TextView) findViewById(R.id.btn_secondary_action));

    /* renamed from: i */
    private final TextView f12358i = ((TextView) findViewById(R.id.title));

    /* renamed from: j */
    private final TextView f12359j = ((TextView) findViewById(R.id.summary));

    /* renamed from: k */
    private final TextView f12360k = ((TextView) findViewById(R.id.info));

    /* renamed from: l */
    private final LottieAnimationView f12361l = ((LottieAnimationView) findViewById(R.id.sparkles));

    public C4644c(Context context) {
        super(context);
        setClickable(true);
        setBackgroundColor(C7678c.m18702a(getContext(), (int) R.attr.zenlyColorBackground));
        FrameLayout.inflate(getContext(), R.layout.modal_view_default, this);
    }

    /* renamed from: a */
    public void mo11815a(boolean z) {
        this.f12355f.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo11816b() {
        this.f12361l.mo22797a();
        this.f12361l.setVisibility(8);
    }

    public void setCloseButtonClickListener(OnClickListener onClickListener) {
        this.f12355f.setOnClickListener(onClickListener);
    }

    public void setInfo(int i) {
        setInfo((CharSequence) getContext().getString(i));
    }

    public void setPrimaryActionButtonClickListener(OnClickListener onClickListener) {
        this.f12356g.setOnClickListener(onClickListener);
    }

    public void setPrimaryActionTitle(int i) {
        setPrimaryActionTitle((CharSequence) getContext().getString(i));
    }

    public void setSecondaryActionButtonClickListener(OnClickListener onClickListener) {
        this.f12357h.setOnClickListener(onClickListener);
    }

    public void setSecondaryActionTitle(int i) {
        setSecondaryActionTitle((CharSequence) getContext().getString(i));
    }

    public void setSummary(int i) {
        setSummary((CharSequence) getContext().getString(i));
    }

    public void setTitle(int i) {
        setTitle((CharSequence) getContext().getString(i));
    }

    /* renamed from: a */
    public void mo11814a() {
        this.f12361l.setVisibility(0);
        this.f12361l.mo22807d();
    }

    public void setInfo(CharSequence charSequence) {
        C3275i.m10386a(this.f12360k, charSequence);
    }

    public void setPrimaryActionTitle(CharSequence charSequence) {
        C3275i.m10386a(this.f12356g, charSequence);
    }

    public void setSecondaryActionTitle(CharSequence charSequence) {
        C3275i.m10386a(this.f12357h, charSequence);
    }

    public void setSummary(CharSequence charSequence) {
        C3275i.m10386a(this.f12359j, charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        C3275i.m10386a(this.f12358i, charSequence);
    }
}
