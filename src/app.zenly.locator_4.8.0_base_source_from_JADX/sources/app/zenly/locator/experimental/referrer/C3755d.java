package app.zenly.locator.experimental.referrer;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1331a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.modals.p121o2.C4655h;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.experimental.referrer.d */
public final class C3755d extends C4655h {

    /* renamed from: e */
    private final C2477e f10046e;

    /* renamed from: f */
    private final ImageView f10047f;

    /* renamed from: g */
    private final TextView f10048g;

    /* renamed from: h */
    private HashMap f10049h;

    public C3755d(Context context) {
        C12932j.m33818b(context, "context");
        super(context);
        this.f10046e = new C2477e(context);
        setBackgroundColor(C7678c.m18702a(context, (int) R.attr.zenlyColorBackground));
        View.inflate(context, R.layout.z_track5exp1_install_referrer_modal, this);
        View findViewById = findViewById(R.id.modal_layout);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.modal_layout)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.avatar);
        C12932j.m33815a((Object) findViewById2, "findViewById(R.id.avatar)");
        this.f10047f = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.title);
        C12932j.m33815a((Object) findViewById3, "findViewById(R.id.title)");
        this.f10048g = (TextView) findViewById3;
    }

    /* renamed from: a */
    public View mo10307a(int i) {
        if (this.f10049h == null) {
            this.f10049h = new HashMap();
        }
        View view = (View) this.f10049h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f10049h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setAvatar(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "referrer");
        C1331a.m6343a(this.f10046e.load(C2884f.m9355a(userProto$User)), R.dimen.spacing_100, 0, 2, null).into(this.f10047f);
        this.f10048g.setText(getContext().getString(R.string.z_track5exp1var1_referrerModale_title, new Object[]{userProto$User.getName()}));
    }

    public void setCloseButtonClickListener(OnClickListener onClickListener) {
        ((AppCompatImageButton) mo10307a(C3891l.modal_close)).setOnClickListener(onClickListener);
    }

    public void setPrimaryActionButtonClickListener(OnClickListener onClickListener) {
        ((Button) mo10307a(C3891l.add_as_friend_button)).setOnClickListener(onClickListener);
    }

    public void setSecondaryActionButtonClickListener(OnClickListener onClickListener) {
    }
}
