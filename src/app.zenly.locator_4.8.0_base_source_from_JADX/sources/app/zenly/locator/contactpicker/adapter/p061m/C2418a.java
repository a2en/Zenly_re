package app.zenly.locator.contactpicker.adapter.p061m;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.LoadingTextView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Arrays;
import java.util.List;

/* renamed from: app.zenly.locator.contactpicker.adapter.m.a */
public class C2418a extends C1085v {

    /* renamed from: a */
    public final TextView f7259a;

    /* renamed from: b */
    public final CheckBox f7260b;

    /* renamed from: c */
    public final ImageView f7261c;

    /* renamed from: d */
    public final TextView f7262d;

    /* renamed from: e */
    public final TextView f7263e;

    /* renamed from: f */
    public final LoadingTextView f7264f;

    /* renamed from: g */
    public final ImageButton f7265g;

    /* renamed from: h */
    public final ProgressBar f7266h;

    /* renamed from: i */
    public final TextView f7267i;

    /* renamed from: j */
    public final ImageView f7268j;

    /* renamed from: k */
    public final TextView f7269k;

    /* renamed from: l */
    public final LottieAnimationView f7270l;

    /* renamed from: m */
    public final List<View> f7271m;

    /* renamed from: n */
    public final View f7272n;

    public C2418a(View view) {
        super(view);
        this.f7259a = (TextView) view.findViewById(R.id.title);
        this.f7260b = (CheckBox) view.findViewById(R.id.checkbox_select_user);
        this.f7261c = (ImageView) view.findViewById(R.id.contact_avatar);
        this.f7262d = (TextView) view.findViewById(R.id.contact_name);
        this.f7263e = (TextView) view.findViewById(R.id.contact_friends_count);
        this.f7264f = (LoadingTextView) view.findViewById(R.id.contact_invite_button);
        this.f7265g = (ImageButton) view.findViewById(R.id.contact_dismiss_button);
        this.f7266h = (ProgressBar) view.findViewById(R.id.contact_dismiss_progress);
        this.f7267i = (TextView) view.findViewById(R.id.contact_status);
        this.f7268j = (ImageView) view.findViewById(R.id.add_icon);
        this.f7269k = (TextView) view.findViewById(R.id.add_title);
        this.f7270l = (LottieAnimationView) view.findViewById(R.id.success_animation);
        this.f7271m = Arrays.asList(new View[]{view.findViewById(R.id.container_1), view.findViewById(R.id.container_2), view.findViewById(R.id.container_3), view.findViewById(R.id.container_4), view.findViewById(R.id.container_5)});
        this.f7272n = view.findViewById(R.id.highlight_bg);
    }
}
