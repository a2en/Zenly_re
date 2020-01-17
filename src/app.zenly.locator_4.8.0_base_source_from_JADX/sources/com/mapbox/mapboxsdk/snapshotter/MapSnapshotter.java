package com.mapbox.mapboxsdk.snapshotter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.core.content.res.C0554e;
import com.mapbox.mapboxsdk.C11453f;
import com.mapbox.mapboxsdk.C11462h;
import com.mapbox.mapboxsdk.attribution.AttributionMeasure;
import com.mapbox.mapboxsdk.attribution.AttributionMeasure.C11432b;
import com.mapbox.mapboxsdk.attribution.C11442b;
import com.mapbox.mapboxsdk.attribution.C11443c.C11444a;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.storage.FileSource;

public class MapSnapshotter {

    /* renamed from: a */
    private final Context f30048a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SnapshotReadyCallback f30049b;

    /* renamed from: c */
    private ErrorHandler f30050c;
    @Keep
    private long nativePtr;

    public interface ErrorHandler {
        void onError(String str);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(MapSnapshot mapSnapshot);
    }

    /* renamed from: com.mapbox.mapboxsdk.snapshotter.MapSnapshotter$a */
    class C11586a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ MapSnapshot f30051e;

        C11586a(MapSnapshot mapSnapshot) {
            this.f30051e = mapSnapshot;
        }

        public void run() {
            if (MapSnapshotter.this.f30049b != null) {
                MapSnapshotter.this.mo34086a(this.f30051e);
                MapSnapshotter.this.f30049b.onSnapshotReady(this.f30051e);
                MapSnapshotter.this.mo34085a();
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.snapshotter.MapSnapshotter$b */
    private class C11587b {

        /* renamed from: a */
        private Bitmap f30053a;

        /* renamed from: b */
        private Bitmap f30054b;

        /* renamed from: c */
        private float f30055c;

        public C11587b(MapSnapshotter mapSnapshotter, Bitmap bitmap, Bitmap bitmap2, float f) {
            this.f30053a = bitmap;
            this.f30054b = bitmap2;
            this.f30055c = f;
        }

        /* renamed from: a */
        public Bitmap mo34101a() {
            return this.f30053a;
        }

        /* renamed from: b */
        public float mo34102b() {
            return this.f30055c;
        }

        /* renamed from: c */
        public Bitmap mo34103c() {
            return this.f30054b;
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeCancel();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeInitialize(MapSnapshotter mapSnapshotter, FileSource fileSource, float f, int i, int i2, String str, String str2, LatLngBounds latLngBounds, CameraPosition cameraPosition, boolean z, String str3, String str4);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeStart();

    /* access modifiers changed from: protected */
    @Keep
    public void onSnapshotFailed(String str) {
        ErrorHandler errorHandler = this.f30050c;
        if (errorHandler != null) {
            errorHandler.onError(str);
            mo34085a();
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void onSnapshotReady(MapSnapshot mapSnapshot) {
        new Handler().post(new C11586a(mapSnapshot));
    }

    @Keep
    public native void setCameraPosition(CameraPosition cameraPosition);

    @Keep
    public native void setRegion(LatLngBounds latLngBounds);

    @Keep
    public native void setSize(int i, int i2);

    @Keep
    public native void setStyleJson(String str);

    @Keep
    public native void setStyleUrl(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34086a(MapSnapshot mapSnapshot) {
        Bitmap b = mapSnapshot.mo34080b();
        m30329a(mapSnapshot, b, new Canvas(b), ((int) this.f30048a.getResources().getDisplayMetrics().density) * 4);
    }

    /* renamed from: a */
    private void m30329a(MapSnapshot mapSnapshot, Bitmap bitmap, Canvas canvas, int i) {
        AttributionMeasure a = m30323a(mapSnapshot, bitmap, i);
        C11442b b = a.mo33285b();
        m30330a(mapSnapshot, canvas, i, b);
        m30331a(mapSnapshot, canvas, a, b);
    }

    /* renamed from: a */
    private AttributionMeasure m30323a(MapSnapshot mapSnapshot, Bitmap bitmap, int i) {
        C11587b a = m30325a(bitmap);
        TextView a2 = m30322a(mapSnapshot, false, a.mo34102b());
        TextView a3 = m30322a(mapSnapshot, true, a.mo34102b());
        C11432b bVar = new C11432b();
        bVar.mo33293c(bitmap);
        bVar.mo33288a(a.mo34101a());
        bVar.mo33291b(a.mo34103c());
        bVar.mo33289a(a2);
        bVar.mo33292b(a3);
        bVar.mo33287a((float) i);
        return bVar.mo33290a();
    }

    /* renamed from: a */
    private void m30330a(MapSnapshot mapSnapshot, Canvas canvas, int i, C11442b bVar) {
        if (mapSnapshot.mo34081c()) {
            m30327a(mapSnapshot.mo34080b(), canvas, i, bVar);
        }
    }

    /* renamed from: a */
    private void m30327a(Bitmap bitmap, Canvas canvas, int i, C11442b bVar) {
        Bitmap b = bVar.mo33301b();
        if (b != null) {
            canvas.drawBitmap(b, (float) i, (float) ((bitmap.getHeight() - b.getHeight()) - i), null);
        }
    }

    /* renamed from: a */
    private void m30331a(MapSnapshot mapSnapshot, Canvas canvas, AttributionMeasure attributionMeasure, C11442b bVar) {
        PointF a = bVar.mo33300a();
        if (a != null) {
            m30328a(canvas, attributionMeasure, a);
            return;
        }
        Bitmap b = mapSnapshot.mo34080b();
        Object[] objArr = {Integer.valueOf(b.getWidth()), Integer.valueOf(b.getHeight()), mapSnapshot.mo34079a()};
        Logger.m29680e("Mbgl-MapSnapshotter", String.format("Could not generate attribution for snapshot size: %s x %s. You are required to provide your own attribution for the used sources: %s", objArr));
    }

    /* renamed from: a */
    private void m30328a(Canvas canvas, AttributionMeasure attributionMeasure, PointF pointF) {
        canvas.save();
        canvas.translate(pointF.x, pointF.y);
        attributionMeasure.mo33284a().draw(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    private TextView m30322a(MapSnapshot mapSnapshot, boolean z, float f) {
        int a = C0554e.m2604a(this.f30048a.getResources(), C11453f.mapbox_gray_dark, this.f30048a.getTheme());
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = new TextView(this.f30048a);
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setSingleLine(true);
        textView.setTextSize(f * 10.0f);
        textView.setTextColor(a);
        textView.setBackgroundResource(C11462h.mapbox_rounded_corner);
        textView.setText(Html.fromHtml(m30326a(mapSnapshot, z)));
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        return textView;
    }

    /* renamed from: a */
    private String m30326a(MapSnapshot mapSnapshot, boolean z) {
        C11444a aVar = new C11444a(this.f30048a);
        aVar.mo33310a(mapSnapshot.mo34079a());
        aVar.mo33309a(false);
        aVar.mo33312b(false);
        return aVar.mo33311a().mo33306a(z);
    }

    /* renamed from: a */
    private C11587b m30325a(Bitmap bitmap) {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f30048a.getResources(), C11462h.mapbox_logo_icon, null);
        float a = m30321a(bitmap, decodeResource);
        Matrix matrix = new Matrix();
        matrix.postScale(a, a);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(this.f30048a.getResources(), C11462h.mapbox_logo_helmet, null);
        return new C11587b(this, Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true), Bitmap.createBitmap(decodeResource2, 0, 0, decodeResource2.getWidth(), decodeResource2.getHeight(), matrix, true), a);
    }

    /* renamed from: a */
    private float m30321a(Bitmap bitmap, Bitmap bitmap2) {
        DisplayMetrics displayMetrics = this.f30048a.getResources().getDisplayMetrics();
        float width = (float) (displayMetrics.widthPixels / bitmap.getWidth());
        float height = (float) (displayMetrics.heightPixels / bitmap.getHeight());
        float min = Math.min((((float) bitmap2.getWidth()) / width) / ((float) bitmap2.getWidth()), (((float) bitmap2.getHeight()) / height) / ((float) bitmap2.getHeight())) * 2.0f;
        if (min > 1.0f) {
            return 1.0f;
        }
        if (min < 0.6f) {
            return 0.6f;
        }
        return min;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34085a() {
        this.f30049b = null;
        this.f30050c = null;
    }
}
