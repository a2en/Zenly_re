package app.zenly.locator.chat.content;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2475c;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.media.C4471u0;
import com.bumptech.glide.C8865i;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import p213co.znly.models.C7354j0;

/* renamed from: app.zenly.locator.chat.content.c */
public class C1946c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f6299a = new Handler();

    /* renamed from: b */
    private final ImageView f6300b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ProgressBar f6301c;

    /* renamed from: d */
    private final C2485i f6302d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6303e;

    /* renamed from: app.zenly.locator.chat.content.c$a */
    class C1947a implements RequestListener<Drawable> {

        /* renamed from: e */
        final /* synthetic */ C7354j0 f6304e;

        C1947a(C7354j0 j0Var) {
            this.f6304e = j0Var;
        }

        /* renamed from: a */
        public /* synthetic */ void mo7700a(C7354j0 j0Var) {
            C1946c.this.mo7699a(j0Var);
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            C1946c.this.f6299a.postDelayed(new C1944a(this, this.f6304e), 1000);
            return true;
        }

        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, C8882a aVar, boolean z) {
            C1946c.this.f6303e = true;
            C1946c.this.f6301c.setVisibility(8);
            return false;
        }
    }

    /* renamed from: app.zenly.locator.chat.content.c$b */
    class C1948b implements RequestListener<Drawable> {

        /* renamed from: e */
        final /* synthetic */ C7354j0 f6306e;

        C1948b(C7354j0 j0Var) {
            this.f6306e = j0Var;
        }

        /* renamed from: a */
        public /* synthetic */ void mo7704a(C7354j0 j0Var) {
            C1946c.this.mo7699a(j0Var);
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            C1946c.this.f6299a.postDelayed(new C1945b(this, this.f6306e), 1000);
            return true;
        }

        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, C8882a aVar, boolean z) {
            C1946c.this.f6301c.setVisibility(8);
            return false;
        }
    }

    public C1946c(ImageView imageView, ProgressBar progressBar) {
        this.f6300b = imageView;
        this.f6301c = progressBar;
        this.f6302d = C2476d.m8582a(imageView.getContext());
    }

    /* renamed from: a */
    public void mo7699a(C7354j0 j0Var) {
        if (!TextUtils.isEmpty(j0Var.getUploadFilepath())) {
            this.f6301c.setVisibility(0);
            this.f6302d.mo8549a((Object) C2475c.m8579a(j0Var.getUploadFilepath())).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a((float) this.f6300b.getResources().getDimensionPixelSize(R.dimen.corner_radius_200)))).m8691a(C8978i.f23426d).mo8539b((RequestListener<TranscodeType>) new C1947a<TranscodeType>(j0Var)).mo24173a(this.f6300b);
        } else if (!this.f6303e) {
            String c = C4471u0.m13253c(j0Var);
            String b = C4471u0.m13252b(j0Var);
            if (c != null && b != null) {
                this.f6301c.setVisibility(0);
                this.f6302d.mo8549a((Object) C2475c.m8579a(c)).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a((float) this.f6300b.getResources().getDimensionPixelSize(R.dimen.corner_radius_200)))).m8691a(C8978i.f23426d).mo8538b((C8865i<TranscodeType>) this.f6302d.mo8549a((Object) C2475c.m8579a(b)).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a((float) this.f6300b.getResources().getDimensionPixelSize(R.dimen.corner_radius_200)))).m8691a(C8978i.f23426d)).mo8539b((RequestListener<TranscodeType>) new C1948b<TranscodeType>(j0Var)).mo24173a(this.f6300b);
            }
        }
    }

    /* renamed from: a */
    public void mo7698a() {
        this.f6303e = false;
        this.f6302d.mo24176a((View) this.f6300b);
        this.f6300b.setImageDrawable(null);
        this.f6301c.setVisibility(8);
        this.f6299a.removeCallbacksAndMessages(null);
    }
}
