package app.zenly.locator.map.marker;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import app.zenly.locator.R;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;

/* renamed from: app.zenly.locator.map.marker.y */
public abstract class C4267y extends C4223k0<AvatarMarkerView> {

    /* renamed from: K */
    private final int f11441K = ((int) mo11110f().getResources().getDimension(R.dimen.avatar_marker_pivot_y));

    /* renamed from: L */
    private final int f11442L = ((int) mo11110f().getResources().getDimension(R.dimen.avatar_marker_container_size));

    public C4267y(Context context, String str) {
        super(context, str);
    }

    /* renamed from: l */
    private void mo11044l(boolean z) {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.mo10830a(mo11124y() && !mo11125z(), z);
        }
    }

    /* renamed from: I */
    public void mo11062I() {
        super.mo11062I();
        ((AvatarMarkerView) mo11112g()).mo10838e();
    }

    /* renamed from: a */
    public void mo11033a() {
        super.mo11033a();
        mo11044l(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11037c(boolean z) {
        super.mo11037c(z);
        mo11044l(true);
    }

    /* renamed from: d */
    public float mo11069d() {
        return 0.5f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11108d(boolean z) {
        super.mo11108d(z);
        mo11044l(true);
    }

    /* renamed from: e */
    public float mo11070e() {
        return ((float) this.f11441K) / ((float) this.f11442L);
    }

    /* renamed from: r */
    public AvatarMarkerView m12679r() {
        C7707a.m18760a("map:create:AvatarMarkerView");
        AvatarMarkerView avatarMarkerView = new AvatarMarkerView(mo11110f());
        avatarMarkerView.setLayoutParams(new LayoutParams(-2, -2));
        C7707a.m18759a();
        return avatarMarkerView;
    }
}
