package app.zenly.locator.media;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.helper.C2515f;
import app.zenly.locator.core.widget.ElasticDragDismissFrameLayout;
import app.zenly.locator.core.widget.ElasticDragDismissFrameLayout.C3253a;
import app.zenly.locator.media.PictureFragment.Callbacks;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.C7354j0;

public final class MediaViewerActivity extends BaseActivity {

    /* renamed from: n */
    private C7354j0 f11897n;

    /* renamed from: o */
    private ElasticDragDismissFrameLayout f11898o;

    /* renamed from: p */
    private final C3253a f11899p = new C4410a();

    /* renamed from: q */
    private final Callbacks f11900q = new C4411b();

    /* renamed from: app.zenly.locator.media.MediaViewerActivity$a */
    class C4410a extends C3253a {
        C4410a() {
        }

        /* renamed from: a */
        public void mo9684a() {
            MediaViewerActivity.this.supportFinishAfterTransition();
        }
    }

    /* renamed from: app.zenly.locator.media.MediaViewerActivity$b */
    class C4411b implements Callbacks {
        C4411b() {
        }

        public void onImmersiveModeStarted() {
            MediaViewerActivity.this.mo6504a(true);
        }

        public void onImmersiveModeStopped() {
            MediaViewerActivity.this.mo6504a(false);
        }

        public void onNext() {
        }

        public void onPrevious() {
        }
    }

    /* renamed from: a */
    public static Intent m13119a(Context context, C7354j0 j0Var) {
        return new Intent(context, MediaViewerActivity.class).putExtra("app.zenly.locator.extra.MEDIA", j0Var.toByteArray());
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof PictureFragment) {
            ((PictureFragment) fragment).mo11569a(this.f11900q);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_media_viewer);
        C2515f.m8773a(this);
        try {
            this.f11897n = C7354j0.parseFrom(getIntent().getByteArrayExtra("app.zenly.locator.extra.MEDIA"));
        } catch (InvalidProtocolBufferException unused) {
        }
        this.f11898o = (ElasticDragDismissFrameLayout) findViewById(R.id.draggable_frame);
        C0819o b = getSupportFragmentManager().mo4084b();
        b.mo4320b(R.id.container, PictureFragment.m13136c(this.f11897n));
        b.mo4191c();
        supportPostponeEnterTransition();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ElasticDragDismissFrameLayout elasticDragDismissFrameLayout = this.f11898o;
        if (elasticDragDismissFrameLayout != null) {
            elasticDragDismissFrameLayout.mo9677b(this.f11899p);
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        ElasticDragDismissFrameLayout elasticDragDismissFrameLayout = this.f11898o;
        if (elasticDragDismissFrameLayout != null) {
            elasticDragDismissFrameLayout.mo9676a(this.f11899p);
        }
    }
}
