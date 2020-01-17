package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import androidx.core.content.C0540a;
import androidx.core.content.res.C0554e;
import com.mapbox.mapboxsdk.C11453f;
import com.mapbox.mapboxsdk.C11454g;
import com.mapbox.mapboxsdk.C11462h;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.utils.C11594a;
import com.mapbox.mapboxsdk.utils.C11595b;

/* renamed from: com.mapbox.mapboxsdk.maps.v */
public final class C11573v {

    /* renamed from: a */
    private final FocalPointChangeListener f30001a;

    /* renamed from: b */
    private final C11555r f30002b;

    /* renamed from: c */
    private final CompassView f30003c;

    /* renamed from: d */
    private final int[] f30004d = new int[4];

    /* renamed from: e */
    private final ImageView f30005e;

    /* renamed from: f */
    private final int[] f30006f = new int[4];

    /* renamed from: g */
    private C11524d f30007g;

    /* renamed from: h */
    private final View f30008h;

    /* renamed from: i */
    private final int[] f30009i = new int[4];

    /* renamed from: j */
    private final float f30010j;

    /* renamed from: k */
    private boolean f30011k = true;

    /* renamed from: l */
    private boolean f30012l = true;

    /* renamed from: m */
    private boolean f30013m = true;

    /* renamed from: n */
    private boolean f30014n = true;

    /* renamed from: o */
    private boolean f30015o = true;

    /* renamed from: p */
    private boolean f30016p = true;

    /* renamed from: q */
    private boolean f30017q = true;

    /* renamed from: r */
    private boolean f30018r = true;

    /* renamed from: s */
    private boolean f30019s = true;

    /* renamed from: t */
    private boolean f30020t = true;

    /* renamed from: u */
    private boolean f30021u = true;

    /* renamed from: v */
    private boolean f30022v = true;

    /* renamed from: w */
    private PointF f30023w;

    C11573v(C11555r rVar, FocalPointChangeListener focalPointChangeListener, CompassView compassView, ImageView imageView, View view, float f) {
        this.f30002b = rVar;
        this.f30001a = focalPointChangeListener;
        this.f30003c = compassView;
        this.f30005e = imageView;
        this.f30008h = view;
        this.f30010j = f;
    }

    /* renamed from: c */
    private void m30216c(Bundle bundle) {
        mo33973a(bundle.getBoolean("mapbox_atrrEnabled"));
        mo33966a(bundle.getInt("mapbox_attrGravity"));
        mo33967a(bundle.getInt("mapbox_attrMarginLeft"), bundle.getInt("mapbox_attrMarginTop"), bundle.getInt("mapbox_attrMarginRight"), bundle.getInt("mapbox_atrrMarginBottom"));
    }

    /* renamed from: d */
    private void m30217d(Bundle bundle) {
        mo33978b(bundle.getBoolean("mapbox_compassEnabled"));
        mo33980c(bundle.getInt("mapbox_compassGravity"));
        mo33976b(bundle.getInt("mapbox_compassMarginLeft"), bundle.getInt("mapbox_compassMarginTop"), bundle.getInt("mapbox_compassMarginRight"), bundle.getInt("mapbox_compassMarginBottom"));
        mo33982c(bundle.getBoolean("mapbox_compassFade"));
        mo33970a(C11594a.m30371a(this.f30003c.getContext(), bundle.getByteArray("mapbox_compassImage")));
    }

    /* renamed from: g */
    private void m30220g(Bundle bundle) {
        mo34009p(bundle.getBoolean("mapbox_zoomEnabled"));
        mo34005n(bundle.getBoolean("mapbox_scrollEnabled"));
        mo33999k(bundle.getBoolean("mapbox_rotateEnabled"));
        mo34007o(bundle.getBoolean("mapbox_tiltEnabled"));
        mo33987e(bundle.getBoolean("mapbox_doubleTapEnabled"));
        mo34003m(bundle.getBoolean("mapbox_scaleAnimationEnabled"));
        mo34001l(bundle.getBoolean("mapbox_rotateAnimationEnabled"));
        mo33989f(bundle.getBoolean("mapbox_flingAnimationEnabled"));
        mo33991g(bundle.getBoolean("mapbox_increaseRotateThreshold"));
        mo33993h(bundle.getBoolean("mapbox_increaseScaleThreshold"));
        mo33997j(bundle.getBoolean("mapbox_quickZoom"));
    }

    /* renamed from: h */
    private void m30221h(Bundle bundle) {
        mo33995i(bundle.getBoolean("mapbox_logoEnabled"));
        mo33984d(bundle.getInt("mapbox_logoGravity"));
        mo33981c(bundle.getInt("mapbox_logoMarginLeft"), bundle.getInt("mapbox_logoMarginTop"), bundle.getInt("mapbox_logoMarginRight"), bundle.getInt("mapbox_logoMarginBottom"));
    }

    /* renamed from: i */
    private void m30222i(Bundle bundle) {
        bundle.putInt("mapbox_attrGravity", mo33974b());
        bundle.putInt("mapbox_attrMarginLeft", mo33983d());
        bundle.putInt("mapbox_attrMarginTop", mo33988f());
        bundle.putInt("mapbox_attrMarginRight", mo33986e());
        bundle.putInt("mapbox_atrrMarginBottom", mo33979c());
        bundle.putBoolean("mapbox_atrrEnabled", mo34016w());
    }

    /* renamed from: j */
    private void m30223j(Bundle bundle) {
        bundle.putBoolean("mapbox_compassEnabled", mo34017x());
        bundle.putInt("mapbox_compassGravity", mo33990g());
        bundle.putInt("mapbox_compassMarginLeft", mo33996j());
        bundle.putInt("mapbox_compassMarginTop", mo34000l());
        bundle.putInt("mapbox_compassMarginBottom", mo33994i());
        bundle.putInt("mapbox_compassMarginRight", mo33998k());
        bundle.putBoolean("mapbox_compassFade", mo34018y());
        bundle.putByteArray("mapbox_compassImage", C11594a.m30372b(mo33992h()));
    }

    /* renamed from: m */
    private void m30226m(Bundle bundle) {
        bundle.putBoolean("mapbox_zoomEnabled", mo33964L());
        bundle.putBoolean("mapbox_scrollEnabled", mo33962J());
        bundle.putBoolean("mapbox_rotateEnabled", mo33959G());
        bundle.putBoolean("mapbox_tiltEnabled", mo33963K());
        bundle.putBoolean("mapbox_doubleTapEnabled", mo33953A());
        bundle.putBoolean("mapbox_scaleAnimationEnabled", mo33961I());
        bundle.putBoolean("mapbox_rotateAnimationEnabled", mo33960H());
        bundle.putBoolean("mapbox_flingAnimationEnabled", mo33954B());
        bundle.putBoolean("mapbox_increaseRotateThreshold", mo33955C());
        bundle.putBoolean("mapbox_increaseScaleThreshold", mo33956D());
        bundle.putBoolean("mapbox_quickZoom", mo33958F());
    }

    /* renamed from: n */
    private void m30227n(Bundle bundle) {
        bundle.putInt("mapbox_logoGravity", mo34006o());
        bundle.putInt("mapbox_logoMarginLeft", mo34010q());
        bundle.putInt("mapbox_logoMarginTop", mo34012s());
        bundle.putInt("mapbox_logoMarginRight", mo34011r());
        bundle.putInt("mapbox_logoMarginBottom", mo34008p());
        bundle.putBoolean("mapbox_logoEnabled", mo33957E());
    }

    /* renamed from: A */
    public boolean mo33953A() {
        return this.f30015o;
    }

    /* renamed from: B */
    public boolean mo33954B() {
        return this.f30019s;
    }

    /* renamed from: C */
    public boolean mo33955C() {
        return this.f30020t;
    }

    /* renamed from: D */
    public boolean mo33956D() {
        return this.f30021u;
    }

    /* renamed from: E */
    public boolean mo33957E() {
        return this.f30008h.getVisibility() == 0;
    }

    /* renamed from: F */
    public boolean mo33958F() {
        return this.f30016p;
    }

    /* renamed from: G */
    public boolean mo33959G() {
        return this.f30011k;
    }

    /* renamed from: H */
    public boolean mo33960H() {
        return this.f30018r;
    }

    /* renamed from: I */
    public boolean mo33961I() {
        return this.f30017q;
    }

    /* renamed from: J */
    public boolean mo33962J() {
        return this.f30014n;
    }

    /* renamed from: K */
    public boolean mo33963K() {
        return this.f30012l;
    }

    /* renamed from: L */
    public boolean mo33964L() {
        return this.f30013m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33968a(Context context, MapboxMapOptions mapboxMapOptions) {
        Resources resources = context.getResources();
        m30212a(mapboxMapOptions);
        m30213a(mapboxMapOptions, resources);
        m30215b(mapboxMapOptions, resources);
        m30214b(context, mapboxMapOptions);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33977b(Bundle bundle) {
        m30226m(bundle);
        m30223j(bundle);
        m30227n(bundle);
        m30222i(bundle);
        m30224k(bundle);
        m30225l(bundle);
    }

    /* renamed from: e */
    public int mo33986e() {
        return this.f30006f[2];
    }

    /* renamed from: f */
    public int mo33988f() {
        return this.f30006f[1];
    }

    /* renamed from: k */
    public int mo33998k() {
        return this.f30004d[2];
    }

    /* renamed from: l */
    public int mo34000l() {
        return this.f30004d[1];
    }

    /* renamed from: o */
    public int mo34006o() {
        return ((LayoutParams) this.f30008h.getLayoutParams()).gravity;
    }

    /* renamed from: p */
    public int mo34008p() {
        return this.f30009i[3];
    }

    /* renamed from: q */
    public int mo34010q() {
        return this.f30009i[0];
    }

    /* renamed from: r */
    public int mo34011r() {
        return this.f30009i[2];
    }

    /* renamed from: s */
    public int mo34012s() {
        return this.f30009i[1];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public float mo34013t() {
        return this.f30010j;
    }

    /* renamed from: u */
    public float mo34014u() {
        return this.f30002b.mo33891b();
    }

    /* renamed from: v */
    public void mo34015v() {
        mo33981c(mo34010q(), mo34012s(), mo34011r(), mo34008p());
        mo33976b(mo33996j(), mo34000l(), mo33998k(), mo33994i());
        mo33967a(mo33983d(), mo33988f(), mo33986e(), mo33979c());
    }

    /* renamed from: w */
    public boolean mo34016w() {
        return this.f30005e.getVisibility() == 0;
    }

    /* renamed from: x */
    public boolean mo34017x() {
        return this.f30003c.isEnabled();
    }

    /* renamed from: y */
    public boolean mo34018y() {
        return this.f30003c.mo34025b();
    }

    /* renamed from: z */
    public boolean mo34019z() {
        return this.f30022v;
    }

    /* renamed from: e */
    public void mo33987e(boolean z) {
        this.f30015o = z;
    }

    /* renamed from: f */
    public void mo33989f(boolean z) {
        this.f30019s = z;
    }

    /* renamed from: k */
    public void mo33999k(boolean z) {
        this.f30011k = z;
    }

    /* renamed from: l */
    public void mo34001l(boolean z) {
        this.f30018r = z;
    }

    /* renamed from: o */
    public void mo34007o(boolean z) {
        this.f30012l = z;
    }

    /* renamed from: p */
    public void mo34009p(boolean z) {
        this.f30013m = z;
    }

    /* renamed from: e */
    private void m30218e(Bundle bundle) {
        mo33985d(bundle.getBoolean("mapbox_deselectMarkerOnTap"));
    }

    /* renamed from: f */
    private void m30219f(Bundle bundle) {
        PointF pointF = (PointF) bundle.getParcelable("mapbox_userFocalPoint");
        if (pointF != null) {
            mo33969a(pointF);
        }
    }

    /* renamed from: k */
    private void m30224k(Bundle bundle) {
        bundle.putBoolean("mapbox_deselectMarkerOnTap", mo34019z());
    }

    /* renamed from: l */
    private void m30225l(Bundle bundle) {
        bundle.putParcelable("mapbox_userFocalPoint", mo34002m());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33971a(Bundle bundle) {
        m30220g(bundle);
        m30217d(bundle);
        m30221h(bundle);
        m30216c(bundle);
        m30218e(bundle);
        m30219f(bundle);
    }

    /* renamed from: b */
    private void m30215b(MapboxMapOptions mapboxMapOptions, Resources resources) {
        mo33995i(mapboxMapOptions.mo33663q());
        mo33984d(mapboxMapOptions.mo33664r());
        m30209a(resources, mapboxMapOptions.mo33665s());
    }

    /* renamed from: i */
    public int mo33994i() {
        return this.f30004d[3];
    }

    /* renamed from: n */
    public void mo34005n(boolean z) {
        this.f30014n = z;
    }

    /* renamed from: c */
    public void mo33980c(int i) {
        m30210a((View) this.f30003c, i);
    }

    /* renamed from: h */
    public Drawable mo33992h() {
        return this.f30003c.getCompassImage();
    }

    /* renamed from: i */
    public void mo33995i(boolean z) {
        this.f30008h.setVisibility(z ? 0 : 8);
    }

    /* renamed from: n */
    public float mo34004n() {
        return this.f30002b.mo33887a();
    }

    /* renamed from: c */
    public void mo33982c(boolean z) {
        this.f30003c.mo34022a(z);
    }

    /* renamed from: h */
    public void mo33993h(boolean z) {
        this.f30021u = z;
    }

    /* renamed from: b */
    private void m30214b(Context context, MapboxMapOptions mapboxMapOptions) {
        mo33973a(mapboxMapOptions.mo33627b());
        mo33966a(mapboxMapOptions.mo33628c());
        m30208a(context, mapboxMapOptions.mo33634d());
        int e = mapboxMapOptions.mo33636e();
        if (e == -1) {
            e = C11595b.m30373a(context);
        }
        mo33975b(e);
    }

    /* renamed from: c */
    public void mo33981c(int i, int i2, int i3, int i4) {
        m30211a(this.f30008h, this.f30009i, i, i2, i3, i4);
    }

    /* renamed from: j */
    public int mo33996j() {
        return this.f30004d[0];
    }

    /* renamed from: c */
    public int mo33979c() {
        return this.f30006f[3];
    }

    /* renamed from: j */
    public void mo33997j(boolean z) {
        this.f30016p = z;
    }

    /* renamed from: a */
    private void m30212a(MapboxMapOptions mapboxMapOptions) {
        mo34009p(mapboxMapOptions.mo33612D());
        mo34005n(mapboxMapOptions.mo33673z());
        mo33999k(mapboxMapOptions.mo33672y());
        mo34007o(mapboxMapOptions.mo33610B());
        mo33987e(mapboxMapOptions.mo33659n());
        mo33997j(mapboxMapOptions.mo33669w());
    }

    /* renamed from: d */
    public void mo33984d(int i) {
        m30210a(this.f30008h, i);
    }

    /* renamed from: m */
    public void mo34003m(boolean z) {
        this.f30017q = z;
    }

    /* renamed from: d */
    public int mo33983d() {
        return this.f30006f[0];
    }

    /* renamed from: m */
    public PointF mo34002m() {
        return this.f30023w;
    }

    /* renamed from: d */
    public void mo33985d(boolean z) {
        this.f30022v = z;
    }

    /* renamed from: g */
    public int mo33990g() {
        return ((LayoutParams) this.f30003c.getLayoutParams()).gravity;
    }

    /* renamed from: g */
    public void mo33991g(boolean z) {
        this.f30020t = z;
    }

    /* renamed from: b */
    public void mo33978b(boolean z) {
        this.f30003c.setEnabled(z);
    }

    /* renamed from: b */
    public void mo33976b(int i, int i2, int i3, int i4) {
        m30211a(this.f30003c, this.f30004d, i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m30213a(MapboxMapOptions mapboxMapOptions, Resources resources) {
        mo33978b(mapboxMapOptions.mo33643g());
        mo33980c(mapboxMapOptions.mo33648i());
        int[] k = mapboxMapOptions.mo33653k();
        if (k != null) {
            mo33976b(k[0], k[1], k[2], k[3]);
        } else {
            int dimension = (int) resources.getDimension(C11454g.mapbox_four_dp);
            mo33976b(dimension, dimension, dimension, dimension);
        }
        mo33982c(mapboxMapOptions.mo33646h());
        if (mapboxMapOptions.mo33650j() == null) {
            mapboxMapOptions.mo33616a(C0554e.m2609b(resources, C11462h.mapbox_compass_icon, null));
        }
        mo33970a(mapboxMapOptions.mo33650j());
    }

    /* renamed from: b */
    public int mo33974b() {
        return ((LayoutParams) this.f30005e.getLayoutParams()).gravity;
    }

    /* renamed from: b */
    public void mo33975b(int i) {
        if (Color.alpha(i) == 0) {
            ImageView imageView = this.f30005e;
            C11595b.m30377a(imageView, C0540a.m2536a(imageView.getContext(), C11453f.mapbox_blue));
            return;
        }
        C11595b.m30377a(this.f30005e, i);
    }

    /* renamed from: a */
    private void m30209a(Resources resources, int[] iArr) {
        if (iArr != null) {
            mo33981c(iArr[0], iArr[1], iArr[2], iArr[3]);
            return;
        }
        int dimension = (int) resources.getDimension(C11454g.mapbox_four_dp);
        mo33981c(dimension, dimension, dimension, dimension);
    }

    /* renamed from: a */
    private void m30208a(Context context, int[] iArr) {
        if (iArr != null) {
            mo33967a(iArr[0], iArr[1], iArr[2], iArr[3]);
            return;
        }
        Resources resources = context.getResources();
        int dimension = (int) resources.getDimension(C11454g.mapbox_four_dp);
        mo33967a((int) resources.getDimension(C11454g.mapbox_ninety_two_dp), dimension, dimension, dimension);
    }

    /* renamed from: a */
    public void mo33970a(Drawable drawable) {
        this.f30003c.setCompassImage(drawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33972a(CameraPosition cameraPosition) {
        if (mo34017x()) {
            this.f30003c.mo34020a(-cameraPosition.bearing);
        }
    }

    /* renamed from: a */
    public void mo33973a(boolean z) {
        this.f30005e.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a */
    public C11524d mo33965a() {
        return this.f30007g;
    }

    /* renamed from: a */
    public void mo33966a(int i) {
        m30210a((View) this.f30005e, i);
    }

    /* renamed from: a */
    public void mo33967a(int i, int i2, int i3, int i4) {
        m30211a(this.f30005e, this.f30006f, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo33969a(PointF pointF) {
        this.f30023w = pointF;
        this.f30001a.onFocalPointChanged(pointF);
    }

    /* renamed from: a */
    private void m30210a(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m30211a(View view, int[] iArr, int i, int i2, int i3, int i4) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i);
            layoutParams.setMarginEnd(i3);
        }
        view.setLayoutParams(layoutParams);
    }
}
