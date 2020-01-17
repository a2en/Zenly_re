package app.zenly.locator.media;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0540a;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.base.view.C1363a;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import app.zenly.locator.core.util.C3236s;
import app.zenly.locator.core.widget.OneTouchZoomLayout;
import app.zenly.locator.core.widget.OneTouchZoomLayout.OneTouchZoomListener;
import app.zenly.locator.core.widget.OneTouchZoomLayout.OneTouchZoomeable;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.resource.bitmap.C9113i;
import com.bumptech.glide.load.resource.bitmap.C9133q;
import com.bumptech.glide.request.target.C9237h;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.wonderkiln.camerakit.C11971f;
import com.wonderkiln.camerakit.C11972g;
import com.wonderkiln.camerakit.CameraKitEventListener;
import com.wonderkiln.camerakit.CameraView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p213co.znly.models.C7354j0.C7360e;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p275c.C7731b;
import p250f.p251a.p252a.p263b.p275c.C7744d;
import p250f.p251a.p252a.p263b.p275c.p277m.C7763a;
import p333g.p382g.p383a.C12125b;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

public final class TakePictureActivity extends BaseActivity {

    /* renamed from: A */
    private ImageButton f11937A;

    /* renamed from: B */
    private ImageButton f11938B;

    /* renamed from: C */
    private View f11939C;

    /* renamed from: D */
    private View f11940D;

    /* renamed from: E */
    private View f11941E;

    /* renamed from: F */
    private EmptyView f11942F;

    /* renamed from: G */
    private String f11943G;

    /* renamed from: H */
    private File f11944H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f11945I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f11946J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public double f11947K = 1.0d;

    /* renamed from: L */
    private boolean f11948L;

    /* renamed from: M */
    private int f11949M;

    /* renamed from: N */
    private int f11950N;

    /* renamed from: O */
    private final CameraKitEventListener f11951O = new C4425e();

    /* renamed from: n */
    private final ZenlySchedulers f11952n = C1351e.m6372a(C4469t0.f12039b.mo19916a("takePictureActivity"));
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final ArrayList<C4455o0> f11953o = new ArrayList<>();

    /* renamed from: p */
    private final C12275b f11954p = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Target<byte[]> f11955q = null;

    /* renamed from: r */
    private Disposable f11956r;

    /* renamed from: s */
    private ProgressBar f11957s;

    /* renamed from: t */
    private ImageView f11958t;

    /* renamed from: u */
    private View f11959u;

    /* renamed from: v */
    private View f11960v;

    /* renamed from: w */
    private View f11961w;

    /* renamed from: x */
    private View f11962x;

    /* renamed from: y */
    private View f11963y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public CameraView f11964z;

    /* renamed from: app.zenly.locator.media.TakePictureActivity$a */
    class C4421a implements OneTouchZoomeable {
        C4421a() {
        }

        public double getCurrentZoom() {
            return TakePictureActivity.this.f11947K;
        }

        public double getMaxZoom() {
            return 10.0d;
        }

        public double getMinZoom() {
            return 1.0d;
        }

        public boolean isAvailable() {
            return TakePictureActivity.this.f11964z.getVisibility() == 0;
        }
    }

    /* renamed from: app.zenly.locator.media.TakePictureActivity$b */
    class C4422b implements OneTouchZoomListener {
        C4422b() {
        }

        public void onZoomLevelChanged(float f) {
            TakePictureActivity.this.f11947K = (double) f;
            TakePictureActivity.this.f11964z.setZoom(f);
        }

        public void onZoomStarted() {
        }

        public void onZoomStopped() {
        }
    }

    /* renamed from: app.zenly.locator.media.TakePictureActivity$c */
    class C4423c extends C9237h<byte[]> {
        C4423c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void onResourceReady(byte[] bArr, Transition transition) {
            TakePictureActivity.this.f11955q = null;
            TakePictureActivity.this.m13179b(bArr);
        }

        public void onLoadFailed(Drawable drawable) {
            TakePictureActivity.this.f11955q = null;
            Toast.makeText(TakePictureActivity.this, R.string.commons_content_oopserror, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.media.TakePictureActivity$d */
    class C4424d extends C9237h<byte[]> {
        C4424d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void onResourceReady(byte[] bArr, Transition transition) {
            TakePictureActivity.this.f11955q = null;
            TakePictureActivity.this.m13179b(bArr);
        }
    }

    /* renamed from: app.zenly.locator.media.TakePictureActivity$e */
    class C4425e extends C11971f {
        C4425e() {
        }

        public void onImage(C11972g gVar) {
            if (!TakePictureActivity.this.isDestroyed()) {
                TakePictureActivity.this.m13173a(gVar.mo35560e());
                TakePictureActivity.this.f11945I = gVar.mo35559d().getWidth();
                TakePictureActivity.this.f11946J = gVar.mo35559d().getHeight();
                Iterator it = TakePictureActivity.this.f11953o.iterator();
                while (it.hasNext()) {
                    ((C4455o0) it.next()).mo6614b();
                }
            }
        }
    }

    /* renamed from: d */
    public static int m13184d(Intent intent) {
        return intent.getIntExtra("app.zenly.locator.extra.PICTURE_WIDTH", 0);
    }

    /* renamed from: j */
    private void m13190j() {
        if (this.f11955q != null) {
            C2476d.m8585a((FragmentActivity) this).mo24177a(this.f11955q);
            this.f11955q = null;
        }
        Disposable disposable = this.f11956r;
        if (disposable != null) {
            disposable.dispose();
            this.f11956r = null;
        }
        this.f11948L = false;
        m13194n();
        Iterator it = this.f11953o.iterator();
        while (it.hasNext()) {
            ((C4455o0) it.next()).mo11628c();
        }
    }

    /* renamed from: k */
    private void m13191k() {
        this.f11964z.mo35482e();
        C5407g a = C5407g.m15386a((Context) this);
        int i = 1;
        if (this.f11964z.getFacing() == 1) {
            i = 0;
        }
        a.mo12975b(i);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: l */
    private void m13192l() {
        new C12125b(this).mo35910c("android.permission.WRITE_EXTERNAL_STORAGE").mo36459b((Predicate<? super T>) C4437f0.f11981e).mo36428a((C12286f) this.f11952n.getMainThread()).mo36501i(new C4477y(this)).mo36428a((C12286f) this.f11952n.getDisk()).mo36501i(new C4451m0(m13186f())).mo36428a((C12286f) this.f11952n.getMainThread()).mo36412a((Consumer<? super T>) new C4462s<Object>(this), (Consumer<? super Throwable>) C4429b0.f11973e);
    }

    /* renamed from: m */
    private void m13193m() {
        Intent intent = new Intent();
        intent.putExtra("app.zenly.locator.extra.PICTURE_PATH", this.f11944H.getAbsolutePath());
        intent.putExtra("app.zenly.locator.extra.PICTURE_WIDTH", this.f11945I);
        intent.putExtra("app.zenly.locator.extra.PICTURE_HEIGHT", this.f11946J);
        intent.putExtra("app.zenly.locator.extra.MEDIA_SOURCE", this.f11948L ? "library" : "camera");
        PicResponse picResponse = new PicResponse();
        picResponse.timestamp = C5448c.m15478a().timeNow().getTime();
        picResponse.author = C5447b.m15477d(C5448c.m15478a());
        Iterator it = this.f11953o.iterator();
        while (it.hasNext()) {
            ((C4455o0) it.next()).mo11626a(picResponse);
        }
        intent.putExtra("app.zenly.locator.extra.RESPONSE", picResponse);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: n */
    private void m13194n() {
        this.f11959u.setVisibility(8);
        this.f11961w.setVisibility(8);
        this.f11957s.setVisibility(8);
        this.f11960v.setVisibility(0);
        this.f11962x.setVisibility(0);
        this.f11937A.setVisibility(0);
        this.f11938B.setVisibility(8);
        this.f11963y.setVisibility(0);
        this.f11964z.setVisibility(0);
        C2476d.m8585a((FragmentActivity) this).mo24176a((View) this.f11958t);
        this.f11958t.setImageDrawable(null);
    }

    /* renamed from: o */
    private void m13195o() {
        this.f11959u.setVisibility(4);
        this.f11961w.setVisibility(0);
        this.f11957s.setVisibility(0);
        this.f11960v.setVisibility(8);
        this.f11962x.setVisibility(8);
        this.f11937A.setVisibility(8);
        this.f11938B.setVisibility(8);
        this.f11963y.setVisibility(8);
        this.f11964z.setVisibility(8);
    }

    /* renamed from: p */
    private void m13196p() {
        if (this.f11964z.getFlash() == 1) {
            this.f11937A.setImageResource(2131231451);
            this.f11964z.setFlash(0);
            return;
        }
        this.f11937A.setImageResource(2131231454);
        this.f11964z.setFlash(1);
    }

    /* renamed from: q */
    private void m13197q() {
        if (this.f11939C.getMeasuredHeight() != 0 && this.f11949M != 0) {
            if (this.f11939C.getMeasuredHeight() < (this.f11940D.getHeight() - this.f11949M) - this.f11950N) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f11939C.getLayoutParams();
                marginLayoutParams.topMargin = this.f11949M;
                this.f11939C.setLayoutParams(marginLayoutParams);
                return;
            }
            Iterator it = this.f11953o.iterator();
            while (it.hasNext()) {
                ((C4455o0) it.next()).mo11627b(this.f11949M);
            }
            if (this.f11939C.getMeasuredHeight() > this.f11940D.getHeight() - this.f11950N) {
                Iterator it2 = this.f11953o.iterator();
                while (it2.hasNext()) {
                    ((C4455o0) it2.next()).mo11625a(this.f11950N);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    /* renamed from: e */
    public /* synthetic */ void mo11604e(View view) {
        m13196p();
    }

    /* renamed from: f */
    public /* synthetic */ void mo11605f(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m13189i();
    }

    /* renamed from: g */
    public /* synthetic */ void mo11606g(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f11964z.mo35479b();
        C5343a.m15160U().mo12845a(this.f11943G, "camera", "image");
    }

    /* renamed from: h */
    public /* synthetic */ void mo11607h(View view) {
        C3236s.m10263b((Context) this);
    }

    /* renamed from: i */
    public /* synthetic */ void mo11608i(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m13192l();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_take_picture);
        Intent intent = getIntent();
        this.f11943G = intent.getStringExtra("app.zenly.locator.extra.CAMERA_TYPE");
        int i = 0;
        boolean booleanExtra = intent.getBooleanExtra("app.zenly.locator.extra.WITH_METADATA", false);
        this.f11957s = (ProgressBar) findViewById(R.id.progress_load);
        this.f11958t = (ImageView) findViewById(R.id.image);
        this.f11959u = findViewById(R.id.send);
        this.f11960v = findViewById(R.id.camera);
        this.f11961w = findViewById(R.id.retake);
        this.f11962x = findViewById(R.id.rotate);
        this.f11937A = (ImageButton) findViewById(R.id.flash);
        this.f11938B = (ImageButton) findViewById(R.id.save);
        this.f11963y = findViewById(R.id.gallery);
        this.f11939C = findViewById(R.id.camera_frame);
        this.f11940D = findViewById(R.id.layout);
        this.f11941E = findViewById(R.id.controls_layout);
        this.f11942F = (EmptyView) findViewById(R.id.empty_view);
        if (!m13188h()) {
            this.f11942F.setVisibility(0);
            this.f11942F.setOnActionClickListener(new C4435e0(this));
        }
        this.f11964z = (CameraView) findViewById(R.id.camera_view);
        this.f11964z.mo35478a(this.f11951O);
        this.f11959u.setOnClickListener(new C4468t(this));
        this.f11961w.setOnClickListener(new C4439g0(this));
        this.f11962x.setOnClickListener(new C4433d0(this));
        this.f11937A.setOnClickListener(new C4427a0(this));
        if (booleanExtra) {
            this.f11963y.setVisibility(8);
        } else {
            this.f11963y.setVisibility(0);
            this.f11963y.setOnClickListener(new C4478z(this));
        }
        OneTouchZoomLayout oneTouchZoomLayout = (OneTouchZoomLayout) findViewById(R.id.one_touch);
        oneTouchZoomLayout.setZoomeable(new C4421a());
        oneTouchZoomLayout.mo9691a((OneTouchZoomListener) new C4422b());
        C1363a.m6387a(this.f11940D, new C4470u(this));
        this.f11940D.addOnLayoutChangeListener(new C4449l0(this));
        File file = null;
        if (bundle != null) {
            String string = bundle.getString("TakePictureActivity.SelectedImagePath");
            if (string != null) {
                file = new File(string);
            }
        }
        if (file == null) {
            this.f11960v.setVisibility(0);
        } else {
            m13183c(file);
        }
        this.f11960v.setOnClickListener(new C4447k0(this));
        int d = C5407g.m15386a((Context) this).mo12979d();
        CameraView cameraView = this.f11964z;
        if (d != 1) {
            i = 1;
        }
        cameraView.setFacing(i);
        this.f11953o.clear();
        if (booleanExtra) {
            String str = "app.zenly.locator.extra.FRIEND_UUID";
            if (intent.hasExtra(str)) {
                String stringExtra = intent.getStringExtra(str);
                this.f11953o.add(m13166a(R.id.overlay_header, "Header", new C4443i0(this, stringExtra)));
            }
            this.f11953o.add(m13166a(R.id.overlay_metadata, "Metadata", C4453n0.f12004e));
            this.f11953o.add(m13166a(R.id.overlay_weather, "Weather", C4440h.f11984e));
        }
        C7744d dVar = (C7744d) new ViewModelProvider(this).mo4415a(C7744d.class);
        dVar.mo19955d().mo4391a(this, new C4474w(this, dVar));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f11955q != null) {
            C2476d.m8585a((FragmentActivity) this).mo24177a(this.f11955q);
            this.f11955q = null;
        }
        Disposable disposable = this.f11956r;
        if (disposable != null) {
            disposable.dispose();
            this.f11956r = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((i != 25 && i != 24) || this.f11964z.getVisibility() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f11964z.mo35479b();
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 100) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            this.f11942F.setVisibility(8);
            this.f11964z.setVisibility(0);
            this.f11964z.mo35480c();
        } else if (ActivityCompat.m2351a((Activity) this, "android.permission.CAMERA")) {
            this.f11942F.setTitle((CharSequence) C7709b.m18762a(this, R.string.permission_picturesent_title));
            this.f11942F.setSubtitle((CharSequence) C7709b.m18762a(this, R.string.permission_picturesent_message));
        } else {
            this.f11942F.setActionText((int) R.string.onboarding_open_settings);
            this.f11942F.setOnActionClickListener(new C4441h0(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        File file = this.f11944H;
        if (file != null) {
            bundle.putString("TakePictureActivity.SelectedImagePath", file.getAbsolutePath());
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (m13188h()) {
            this.f11942F.setVisibility(8);
            this.f11964z.setVisibility(0);
            this.f11964z.mo35480c();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f11964z.mo35481d();
        this.f11954p.mo36401a();
        super.onStop();
    }

    /* renamed from: c */
    public static String m13181c(Intent intent) {
        return intent.getStringExtra("app.zenly.locator.extra.PICTURE_PATH");
    }

    /* renamed from: e */
    private void m13185e() {
        C7731b g = m13187g();
        if (g != null) {
            g.mo19938c();
        }
    }

    /* renamed from: h */
    private boolean m13188h() {
        return C0540a.m2537a((Context) this, "android.permission.CAMERA") == 0;
    }

    /* renamed from: d */
    public /* synthetic */ void mo11603d(View view) {
        m13191k();
    }

    /* renamed from: f */
    private ByteArrayOutputStream m13186f() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap createBitmap = Bitmap.createBitmap(this.f11958t.getWidth(), this.f11958t.getHeight(), Config.ARGB_8888);
        this.f11958t.draw(new Canvas(createBitmap));
        createBitmap.compress(CompressFormat.JPEG, 60, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* renamed from: i */
    private void m13189i() {
        C7731b g = m13187g();
        if (g == null) {
            g = new C7731b();
            g.mo19937b(1);
            C0819o b = getSupportFragmentManager().mo4084b();
            b.mo4321b(R.id.media_picker_bottom_sheet, g, "fragment:media_picker");
            b.mo4176a();
        }
        g.mo19940e();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11602c(View view) {
        m13190j();
    }

    /* renamed from: d */
    public boolean mo6993d() {
        C7731b g = m13187g();
        if (g != null && g.mo19939d()) {
            g.mo19938c();
        } else if (!m13188h() || this.f11964z.getVisibility() == 0) {
            return false;
        } else {
            m13194n();
        }
        return true;
    }

    /* renamed from: b */
    public static int m13175b(Intent intent) {
        return intent.getIntExtra("app.zenly.locator.extra.PICTURE_HEIGHT", 0);
    }

    /* renamed from: c */
    private void m13183c(File file) {
        this.f11944H = file;
        int i = 0;
        this.f11959u.setVisibility(0);
        this.f11961w.setVisibility(0);
        this.f11957s.setVisibility(0);
        this.f11960v.setVisibility(8);
        this.f11962x.setVisibility(8);
        this.f11937A.setVisibility(8);
        ImageButton imageButton = this.f11938B;
        if (this.f11948L) {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f11938B.setOnClickListener(new C4472v(this));
        this.f11963y.setVisibility(8);
        this.f11964z.setVisibility(8);
        C2476d.m8585a((FragmentActivity) this).mo8546a(file).m8691a(C8978i.f23424b).m8695a(true).m8690a(this.f11948L ? new C9133q<>() : new C9113i<>()).mo24173a(this.f11958t);
    }

    /* renamed from: g */
    private C7731b m13187g() {
        return (C7731b) getSupportFragmentManager().mo4083b("fragment:media_picker");
    }

    /* renamed from: b */
    public /* synthetic */ void mo11600b(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m13193m();
    }

    /* renamed from: a */
    public static Intent m13165a(Context context) {
        return new Intent(context, TakePictureActivity.class).putExtra("app.zenly.locator.extra.CAMERA_TYPE", "chat");
    }

    /* renamed from: a */
    public static String m13170a(Intent intent) {
        return intent.getStringExtra("app.zenly.locator.extra.MEDIA_SOURCE");
    }

    /* renamed from: b */
    public /* synthetic */ void mo11601b(File file) throws Exception {
        this.f11938B.setImageResource(2131231561);
        this.f11938B.setOnClickListener(null);
        if (file != null) {
            MediaScannerConnection.scanFile(this, new String[]{file.toString()}, null, null);
            C5343a.m15160U().mo12834a(C7360e.TYPE_IMAGE);
            return;
        }
        Toast.makeText(this, R.string.commons_content_oopserror, 0).show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11594a(View view) {
        ActivityCompat.m2350a(this, new String[]{"android.permission.CAMERA"}, 100);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11596a(View view, Rect rect) {
        this.f11949M = rect.top;
        this.f11950N = rect.bottom;
        m13197q();
        this.f11941E.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13179b(byte[] bArr) {
        Disposable disposable = this.f11956r;
        if (disposable != null) {
            disposable.dispose();
            this.f11956r = null;
        }
        m13195o();
        this.f11956r = C12291g.m32767b(bArr).mo36544b((C12286f) this.f11952n.getDisk()).mo36552d((Function<? super T, ? extends R>) new C4445j0<Object,Object>(this, bArr)).mo36535a((C12286f) this.f11952n.getMainThread()).mo36533a((Consumer<? super T>) new C4431c0<Object>(this), (Consumer<? super Throwable>) new C4476x<Object>(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11595a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m13197q();
    }

    /* renamed from: a */
    public /* synthetic */ C4455o0 mo11591a(String str) {
        return C4457p0.m13226a(str, getIntent().getByteArrayExtra("app.zenly.locator.extra.REQUEST"));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11597a(C7744d dVar, List list) {
        if (list.size() > 0) {
            this.f11948L = true;
            m13171a(((C7763a) list.get(0)).mo19974c());
            C5343a.m15160U().mo12845a(this.f11943G, "library", "image");
            m13185e();
            dVar.mo19954c();
        }
    }

    /* renamed from: a */
    private C4455o0 m13166a(int i, String str, Function0<C4455o0> function0) {
        C4455o0 o0Var = (C4455o0) getSupportFragmentManager().mo4083b(str);
        if (o0Var != null) {
            return o0Var;
        }
        C4455o0 o0Var2 = (C4455o0) function0.invoke();
        C0819o b = getSupportFragmentManager().mo4084b();
        b.mo4321b(i, o0Var2, str);
        b.mo4176a();
        return o0Var2;
    }

    /* renamed from: a */
    private void m13171a(Uri uri) {
        if (this.f11955q != null) {
            C2476d.m8585a((FragmentActivity) this).mo24177a(this.f11955q);
        }
        this.f11955q = new C4423c(ItemAnimator.FLAG_MOVED, ItemAnimator.FLAG_MOVED);
        m13195o();
        C2476d.m8585a((FragmentActivity) this).m8716a(byte[].class).m8678a(uri).mo8542f().m8691a(C8978i.f23424b).m8695a(true).mo24171a(this.f11955q);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13173a(byte[] bArr) {
        if (this.f11955q != null) {
            C2476d.m8585a((FragmentActivity) this).mo24177a(this.f11955q);
        }
        this.f11955q = new C4424d(ItemAnimator.FLAG_MOVED, ItemAnimator.FLAG_MOVED);
        m13195o();
        C2476d.m8585a((FragmentActivity) this).m8716a(byte[].class).mo8535a(bArr).mo8540c().mo8526a(75).mo24171a(this.f11955q);
    }

    /* renamed from: a */
    public /* synthetic */ File mo11592a(Boolean bool) throws Exception {
        this.f11938B.setImageResource(2131231427);
        return C3231q.m10239a(C3232a.PICTURES);
    }

    /* renamed from: a */
    static /* synthetic */ File m13169a(ByteArrayOutputStream byteArrayOutputStream, File file) throws Exception {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[SYNTHETIC, Splitter:B:12:0x001b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ java.io.File mo11593a(byte[] r3, byte[] r4) throws java.lang.Exception {
        /*
            r2 = this;
            app.zenly.locator.core.util.q$a r4 = app.zenly.locator.core.util.C3231q.C3232a.PICTURES
            java.io.File r4 = app.zenly.locator.core.util.C3231q.m10235a(r2, r4)
            if (r4 == 0) goto L_0x001f
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0018 }
            r1.<init>(r4)     // Catch:{ all -> 0x0018 }
            r1.write(r3)     // Catch:{ all -> 0x0015 }
            r1.close()     // Catch:{ all -> 0x0015 }
            return r4
        L_0x0015:
            r3 = move-exception
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r3 = move-exception
        L_0x0019:
            if (r0 == 0) goto L_0x001e
            r0.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            throw r3
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to create file"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.media.TakePictureActivity.mo11593a(byte[], byte[]):java.io.File");
    }

    /* renamed from: a */
    public /* synthetic */ void mo11598a(File file) throws Exception {
        m13183c(file);
        this.f11956r = null;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11599a(Throwable th) throws Exception {
        this.f11956r = null;
        C12143a.m32032b(th, "Enable to save image", new Object[0]);
        Toast.makeText(this, R.string.commons_content_oopserror, 0).show();
    }
}
