package zendesk.belvedere;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.squareup.picasso.C11892t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.C11847d;
import com.squareup.picasso.Target;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.belvedere.p428s.C13536d;

public class FixedWidthImageView extends AppCompatImageView implements Target {

    /* renamed from: g */
    private int f34920g = -1;

    /* renamed from: h */
    private int f34921h = -1;

    /* renamed from: i */
    private int f34922i;

    /* renamed from: j */
    private int f34923j;

    /* renamed from: k */
    private Uri f34924k = null;

    /* renamed from: l */
    private Picasso f34925l;

    /* renamed from: m */
    private final AtomicBoolean f34926m = new AtomicBoolean(false);

    /* renamed from: n */
    private C13472c f34927n;

    /* renamed from: zendesk.belvedere.FixedWidthImageView$a */
    class C13470a implements Runnable {
        C13470a() {
        }

        public void run() {
            FixedWidthImageView.this.requestLayout();
        }
    }

    /* renamed from: zendesk.belvedere.FixedWidthImageView$b */
    static class C13471b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f34929a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f34930b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f34931c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f34932d;

        C13471b(int i, int i2, int i3, int i4) {
            this.f34929a = i;
            this.f34930b = i2;
            this.f34931c = i3;
            this.f34932d = i4;
        }
    }

    /* renamed from: zendesk.belvedere.FixedWidthImageView$c */
    interface C13472c {
        /* renamed from: a */
        void mo38761a(C13471b bVar);
    }

    public FixedWidthImageView(Context context) {
        super(context);
        mo38756a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38756a() {
        this.f34921h = getResources().getDimensionPixelOffset(C13536d.belvedere_image_stream_image_height);
    }

    public void onBitmapFailed(Drawable drawable) {
    }

    public void onBitmapLoaded(Bitmap bitmap, C11847d dVar) {
        this.f34923j = bitmap.getHeight();
        this.f34922i = bitmap.getWidth();
        Pair a = m35644a(this.f34920g, this.f34922i, this.f34923j);
        m35645a(this.f34925l, ((Integer) a.first).intValue(), ((Integer) a.second).intValue(), this.f34924k);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f34921h, 1073741824);
        if (this.f34920g == -1) {
            this.f34920g = size;
        }
        int i3 = this.f34920g;
        if (i3 > 0) {
            i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
            if (this.f34926m.compareAndSet(true, false)) {
                m35646a(this.f34925l, this.f34924k, this.f34920g, this.f34922i, this.f34923j);
            }
        }
        super.onMeasure(i, makeMeasureSpec);
    }

    public void onPrepareLoad(Drawable drawable) {
    }

    /* renamed from: a */
    public void mo38758a(Picasso picasso, Uri uri, C13471b bVar) {
        if (uri == null || uri.equals(this.f34924k)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Image already loaded. ");
            sb.append(uri);
            C13480L.m35692a("FixedWidthImageView", sb.toString());
            return;
        }
        Picasso picasso2 = this.f34925l;
        if (picasso2 != null) {
            picasso2.mo35032a((Target) this);
            this.f34925l.mo35030a((ImageView) this);
        }
        this.f34924k = uri;
        this.f34925l = picasso;
        this.f34922i = bVar.f34930b;
        this.f34923j = bVar.f34929a;
        this.f34921h = bVar.f34931c;
        this.f34920g = bVar.f34932d;
        m35646a(picasso, uri, this.f34920g, this.f34922i, this.f34923j);
    }

    public FixedWidthImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo38756a();
    }

    public FixedWidthImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo38756a();
    }

    /* renamed from: a */
    public void mo38757a(Picasso picasso, Uri uri, long j, long j2, C13472c cVar) {
        if (uri == null || uri.equals(this.f34924k)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Image already loaded. ");
            sb.append(uri);
            C13480L.m35692a("FixedWidthImageView", sb.toString());
            return;
        }
        Picasso picasso2 = this.f34925l;
        if (picasso2 != null) {
            picasso2.mo35032a((Target) this);
            this.f34925l.mo35030a((ImageView) this);
        }
        this.f34924k = uri;
        this.f34925l = picasso;
        this.f34922i = (int) j;
        this.f34923j = (int) j2;
        this.f34927n = cVar;
        int i = this.f34920g;
        if (i > 0) {
            m35646a(picasso, uri, i, this.f34922i, this.f34923j);
        } else {
            this.f34926m.set(true);
        }
    }

    /* renamed from: a */
    private Pair<Integer, Integer> m35644a(int i, int i2, int i3) {
        return Pair.create(Integer.valueOf(i), Integer.valueOf((int) (((float) i3) * (((float) i) / ((float) i2)))));
    }

    /* renamed from: a */
    private void m35646a(Picasso picasso, Uri uri, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Start loading image: ");
        sb.append(i);
        String str = " ";
        sb.append(str);
        sb.append(i2);
        sb.append(str);
        sb.append(i3);
        C13480L.m35692a("FixedWidthImageView", sb.toString());
        if (i2 <= 0 || i3 <= 0) {
            picasso.mo35026a(uri).mo35160a((Target) this);
            return;
        }
        Pair a = m35644a(i, i2, i3);
        m35645a(picasso, ((Integer) a.first).intValue(), ((Integer) a.second).intValue(), uri);
    }

    /* renamed from: a */
    private void m35645a(Picasso picasso, int i, int i2, Uri uri) {
        this.f34921h = i2;
        post(new C13470a());
        C13472c cVar = this.f34927n;
        if (cVar != null) {
            cVar.mo38761a(new C13471b(this.f34923j, this.f34922i, this.f34921h, this.f34920g));
            this.f34927n = null;
        }
        C11892t a = picasso.mo35026a(uri);
        a.mo35156a(i, i2);
        a.mo35157a(C13531r.m35856b(getContext(), C13536d.belvedere_image_stream_item_radius));
        a.mo35158a((ImageView) this);
    }
}
