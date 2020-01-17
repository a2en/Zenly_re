package zendesk.belvedere;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.BelvedereUi.UiConfig;
import zendesk.belvedere.p428s.C13541i;

/* renamed from: zendesk.belvedere.g */
class C13507g implements ImageStreamMvp$Presenter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ImageStreamMvp$Model f35027a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ImageStreamMvp$View f35028b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ImageStream f35029c;

    /* renamed from: d */
    private final C13496b f35030d = new C13510c();

    /* renamed from: zendesk.belvedere.g$a */
    class C13508a implements OnClickListener {
        C13508a() {
        }

        public void onClick(View view) {
            C13507g.this.f35028b.openMediaIntent(C13507g.this.f35027a.getGooglePhotosIntent(), C13507g.this.f35029c);
        }
    }

    /* renamed from: zendesk.belvedere.g$b */
    class C13509b implements OnClickListener {
        C13509b() {
        }

        public void onClick(View view) {
            C13507g.this.f35028b.openMediaIntent(C13507g.this.f35027a.getDocumentIntent(), C13507g.this.f35029c);
        }
    }

    /* renamed from: zendesk.belvedere.g$c */
    class C13510c implements C13496b {
        C13510c() {
        }

        /* renamed from: a */
        public void mo38875a() {
            if (C13507g.this.f35027a.hasCameraIntent()) {
                C13507g.this.f35028b.openMediaIntent(C13507g.this.f35027a.getCameraIntent(), C13507g.this.f35029c);
            }
        }

        /* renamed from: a */
        public boolean mo38876a(C13499b bVar) {
            MediaResult c = bVar.mo38882c();
            long maxFileSize = C13507g.this.f35027a.getMaxFileSize();
            if ((c == null || c.mo38848f() > maxFileSize) && maxFileSize != -1) {
                C13507g.this.f35028b.showToast(C13541i.belvedere_image_stream_file_too_large);
                return false;
            }
            bVar.mo38880a(!bVar.mo38883d());
            C13507g.this.f35028b.updateToolbarTitle(C13507g.this.m35770a(c, bVar.mo38883d()).size());
            ArrayList arrayList = new ArrayList();
            arrayList.add(c);
            if (bVar.mo38883d()) {
                C13507g.this.f35029c.mo38777b(arrayList);
                return true;
            }
            C13507g.this.f35029c.mo38770a((List<MediaResult>) arrayList);
            return true;
        }
    }

    C13507g(ImageStreamMvp$Model imageStreamMvp$Model, ImageStreamMvp$View imageStreamMvp$View, ImageStream imageStream) {
        this.f35027a = imageStreamMvp$Model;
        this.f35028b = imageStreamMvp$View;
        this.f35029c = imageStream;
    }

    public void dismiss() {
        this.f35029c.mo38775a((C13512i) null, (UiConfig) null);
        this.f35029c.mo38769a(0, 0, 0.0f);
        this.f35029c.mo38779d();
    }

    public void init() {
        m35775b();
        m35773a();
        this.f35028b.updateToolbarTitle(this.f35027a.getSelectedMediaResults().size());
    }

    public void onImageStreamScrolled(int i, int i2, float f) {
        if (f >= 0.0f) {
            this.f35029c.mo38769a(i, i2, f);
        }
    }

    /* renamed from: b */
    private void m35775b() {
        boolean z = this.f35027a.showFullScreenOnly() || this.f35028b.shouldShowFullScreen();
        this.f35028b.initViews(z);
        this.f35028b.showImageStream(this.f35027a.getLatestImages(), this.f35027a.getSelectedMediaResults(), z, this.f35027a.hasCameraIntent(), this.f35030d);
        this.f35029c.mo38780e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<MediaResult> m35770a(MediaResult mediaResult, boolean z) {
        if (z) {
            return this.f35027a.addToSelectedItems(mediaResult);
        }
        return this.f35027a.removeFromSelectedItems(mediaResult);
    }

    /* renamed from: a */
    private void m35773a() {
        if (this.f35027a.hasGooglePhotosIntent()) {
            this.f35028b.showGooglePhotosMenuItem(new C13508a());
        }
        if (this.f35027a.hasDocumentIntent()) {
            this.f35028b.showDocumentMenuItem(new C13509b());
        }
    }
}
