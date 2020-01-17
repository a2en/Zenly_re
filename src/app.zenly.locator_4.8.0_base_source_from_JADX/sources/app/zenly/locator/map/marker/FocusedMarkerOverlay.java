package app.zenly.locator.map.marker;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.locator.map.base.Map;
import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.p143s.p150n.C5464h;

public abstract class FocusedMarkerOverlay<T extends C4178e0> extends ConstraintLayout {

    /* renamed from: A */
    protected T f10911A;

    /* renamed from: B */
    private Listener<T> f10912B;

    /* renamed from: z */
    protected Map f10913z;

    public interface Listener<T> {
        void onMarkerIsAttached(T t);

        void onMarkerIsDetached(T t);
    }

    public FocusedMarkerOverlay(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo10858a(T t) {
        if (this.f10911A != null) {
            mo2248a();
        }
        this.f10911A = t;
        getMarkerContainer().addView(this.f10911A.mo11112g(), 0);
        mo10861c(t);
        Listener<T> listener = this.f10912B;
        if (listener != null) {
            listener.onMarkerIsAttached(t);
        }
    }

    /* renamed from: a */
    public void mo10859a(C5464h hVar) {
    }

    /* renamed from: b */
    public boolean mo10860b(T t) {
        return this.f10911A == t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo10861c(T t);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo10862d(T t);

    public T getMarker() {
        return this.f10911A;
    }

    public abstract Class<T> getMarkerClass();

    /* access modifiers changed from: protected */
    public abstract ViewGroup getMarkerContainer();

    public void setListener(Listener<T> listener) {
        this.f10912B = listener;
    }

    public void setMap(Map map) {
        this.f10913z = map;
    }

    /* renamed from: a */
    public void mo2248a() {
        if (this.f10911A != null) {
            getMarkerContainer().removeView(this.f10911A.mo11112g());
            T t = this.f10911A;
            this.f10911A = null;
            mo10862d(t);
            Listener<T> listener = this.f10912B;
            if (listener != null) {
                listener.onMarkerIsDetached(t);
            }
        }
    }
}
