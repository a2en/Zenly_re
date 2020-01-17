package app.zenly.locator.media;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.media.PicResponse.Text;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.core.C7234v;

/* renamed from: app.zenly.locator.media.p0 */
public class C4457p0 extends C4455o0 {

    /* renamed from: f */
    private View f12007f;

    /* renamed from: g */
    private TextView f12008g;

    /* renamed from: h */
    private ImageView f12009h;

    /* renamed from: i */
    private TextView f12010i;

    /* renamed from: j */
    private TextView f12011j;

    /* renamed from: k */
    private String f12012k;

    /* renamed from: l */
    private C7234v f12013l;

    /* renamed from: m */
    private String f12014m;

    /* renamed from: n */
    private C2718k5 f12015n;

    /* renamed from: a */
    public static C4457p0 m13226a(String str, byte[] bArr) {
        C4457p0 p0Var = new C4457p0();
        Bundle bundle = new Bundle();
        bundle.putString("FRIEND_UUID", str);
        bundle.putByteArray("REQUEST", bArr);
        p0Var.setArguments(bundle);
        return p0Var;
    }

    /* renamed from: b */
    public void mo11627b(int i) {
        this.f12007f.setPadding(0, i, 0, 0);
    }

    /* renamed from: c */
    public void mo11628c() {
        this.f12010i.setVisibility(4);
        this.f12011j.setTranslationY(0.0f);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f12015n = C2666b.m9049a(context).mo8763a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12012k = getArguments().getString("FRIEND_UUID");
        byte[] byteArray = getArguments().getByteArray("REQUEST");
        if (byteArray != null) {
            try {
                this.f12013l = C7234v.parseFrom(byteArray);
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_camera_overlay_header, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        C2896p a = this.f12015n.mo8779a(this.f12012k);
        if (a != null) {
            this.f12008g.setText(a.f8198b.mo8942e());
            new C2477e(requireContext()).load(C2884f.m9353a(a.f8198b)).into(this.f12009h);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f12007f = view;
        this.f12008g = (TextView) view.findViewById(R.id.name);
        this.f12009h = (ImageView) view.findViewById(R.id.avatar);
        this.f12011j = (TextView) view.findViewById(R.id.counter_old);
        this.f12010i = (TextView) view.findViewById(R.id.counter_new);
        if (this.f12013l != null) {
            TextView textView = (TextView) view.findViewById(R.id.time);
            textView.setText(DateUtils.getRelativeTimeSpanString(this.f12013l.getCreatedAt().getSeconds() * 1000, System.currentTimeMillis(), 1000));
            textView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo6614b() {
        TextView textView = this.f12010i;
        textView.setTranslationY((float) textView.getHeight());
        this.f12010i.setVisibility(0);
        this.f12010i.animate().setDuration(400).translationY(0.0f);
        this.f12011j.animate().setDuration(400).translationY((float) (-this.f12011j.getHeight()));
    }

    /* renamed from: a */
    public void mo11626a(PicResponse picResponse) {
        Text text = picResponse.metadata.counter;
        text.text = this.f12014m;
        text.textConfig = C4475w0.DEFAULT.mo11638a();
    }
}
