package app.zenly.locator.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0540a;
import androidx.fragment.app.Fragment;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.polenta.widget.OutlinedTextView;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2475c;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.glide.C2484h;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.transition.C3065c;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import app.zenly.locator.core.util.FileUtil;
import app.zenly.locator.media.PreviousNextLayout.Listener;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bumptech.glide.C8865i;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.github.chrisbanes.photoview.PhotoView;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Future;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.C7354j0;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

public class PictureFragment extends C1321b {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f11903f = new Handler();

    /* renamed from: g */
    private final C12275b f11904g = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Callbacks f11905h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f11906i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public PhotoView f11907j;

    /* renamed from: k */
    private ImageView f11908k;

    /* renamed from: l */
    private View f11909l;

    /* renamed from: m */
    private TextView f11910m;

    /* renamed from: n */
    private TextView f11911n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ProgressBar f11912o;

    /* renamed from: p */
    private OutlinedTextView f11913p;

    /* renamed from: q */
    private OutlinedTextView f11914q;

    /* renamed from: r */
    private OutlinedTextView f11915r;

    /* renamed from: s */
    private TextView f11916s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ImageButton f11917t;

    /* renamed from: u */
    private ImageButton f11918u;

    /* renamed from: v */
    private String f11919v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C7354j0 f11920w;

    /* renamed from: x */
    private boolean f11921x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f11922y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f11923z;

    public interface Callbacks {
        void onImmersiveModeStarted();

        void onImmersiveModeStopped();

        void onNext();

        void onPrevious();
    }

    /* renamed from: app.zenly.locator.media.PictureFragment$a */
    class C4413a implements Listener {
        C4413a() {
        }

        public void onNext() {
            if (PictureFragment.this.f11905h != null) {
                PictureFragment.this.f11905h.onNext();
            }
        }

        public void onPrevious() {
            if (PictureFragment.this.f11905h != null) {
                PictureFragment.this.f11905h.onPrevious();
            }
        }
    }

    /* renamed from: app.zenly.locator.media.PictureFragment$b */
    class C4414b extends C3065c {
        C4414b() {
        }

        public void onTransitionEnd(Transition transition) {
            PictureFragment.this.f11922y = true;
            if (PictureFragment.this.f11923z) {
                PictureFragment pictureFragment = PictureFragment.this;
                pictureFragment.m13125a(pictureFragment.f11920w);
            }
        }
    }

    /* renamed from: app.zenly.locator.media.PictureFragment$c */
    class C4415c implements RequestListener<Drawable> {
        C4415c() {
        }

        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, C8882a aVar, boolean z) {
            PictureFragment.this.f11912o.setVisibility(8);
            return false;
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            return false;
        }
    }

    /* renamed from: app.zenly.locator.media.PictureFragment$d */
    class C4416d implements RequestListener<Drawable> {

        /* renamed from: e */
        final /* synthetic */ C7354j0 f11927e;

        C4416d(C7354j0 j0Var) {
            this.f11927e = j0Var;
        }

        /* renamed from: a */
        public /* synthetic */ void mo11576a(C7354j0 j0Var) {
            PictureFragment.this.m13132b(j0Var);
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            if (PictureFragment.this.getActivity() != null) {
                PictureFragment.this.getActivity().supportStartPostponedEnterTransition();
            }
            PictureFragment.this.f11903f.postDelayed(new C4442i(this, this.f11927e), 1000);
            return true;
        }

        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, C8882a aVar, boolean z) {
            PictureFragment.this.f11912o.setVisibility(8);
            if (PictureFragment.this.getActivity() != null) {
                PictureFragment.this.getActivity().supportStartPostponedEnterTransition();
            }
            PictureFragment.this.f11923z = true;
            if (PictureFragment.this.f11922y) {
                PictureFragment.this.m13125a(this.f11927e);
            }
            return false;
        }
    }

    /* renamed from: app.zenly.locator.media.PictureFragment$e */
    class C4417e implements RequestListener<Drawable> {

        /* renamed from: e */
        final /* synthetic */ C7354j0 f11929e;

        C4417e(C7354j0 j0Var) {
            this.f11929e = j0Var;
        }

        /* renamed from: a */
        public /* synthetic */ void mo11579a(C7354j0 j0Var) {
            PictureFragment.this.m13125a(j0Var);
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            PictureFragment.this.f11903f.postDelayed(new C4444j(this, this.f11929e), 1000);
            return true;
        }

        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, C8882a aVar, boolean z) {
            PictureFragment.this.f11903f.post(new C4446k(this, drawable));
            return false;
        }

        /* renamed from: a */
        public /* synthetic */ void mo11578a(Drawable drawable) {
            PictureFragment.this.f11917t.setVisibility(0);
            PictureFragment.this.m13139d();
            PictureFragment.this.f11906i.setVisibility(4);
            PictureFragment.this.f11907j.setVisibility(0);
            PictureFragment.this.f11907j.setImageDrawable(drawable);
        }
    }

    /* renamed from: app.zenly.locator.media.PictureFragment$f */
    private static class C4418f extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private final Future<File> f11931a;

        /* renamed from: b */
        private final File f11932b;

        /* renamed from: c */
        private final C4419a f11933c;

        /* renamed from: app.zenly.locator.media.PictureFragment$f$a */
        interface C4419a {
            /* renamed from: a */
            void mo11585a(boolean z);
        }

        /* synthetic */ C4418f(Future future, File file, C4419a aVar, C4413a aVar2) {
            this(future, file, aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                File file = (File) this.f11931a.get();
                if (file == null) {
                    return Boolean.valueOf(false);
                }
                try {
                    FileUtil.m10157a(file, this.f11932b);
                    return Boolean.valueOf(true);
                } catch (IOException unused) {
                    return Boolean.valueOf(false);
                }
            } catch (Exception unused2) {
                return Boolean.valueOf(false);
            }
        }

        private C4418f(Future<File> future, File file, C4419a aVar) {
            this.f11931a = future;
            this.f11932b = file;
            this.f11933c = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            this.f11933c.mo11585a(bool.booleanValue());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m13126a(Throwable th) throws Exception {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11919v = getArguments().getString("TARGET_UUID");
        byte[] byteArray = getArguments().getByteArray("MEDIA");
        if (byteArray != null) {
            try {
                this.f11920w = C7354j0.parseFrom(byteArray);
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_picture, viewGroup, false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return;
        }
        if (iArr.length == 1 && iArr[0] == 0) {
            m13123a(getContext());
        } else {
            m13139d();
        }
    }

    public void onStart() {
        super.onStart();
        if (C5447b.m15477d(C5448c.m15478a()) != null) {
            m13132b(this.f11920w);
            if (this.f11919v != null) {
                m13129b();
            }
        }
    }

    public void onStop() {
        this.f11904g.mo36401a();
        this.f11903f.removeCallbacksAndMessages(null);
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11906i = (ImageView) view.findViewById(R.id.image);
        this.f11907j = (PhotoView) view.findViewById(R.id.photo);
        this.f11907j.setOnClickListener(new C4458q(this));
        this.f11907j.setOnScaleChangeListener(new C4456p(this));
        this.f11908k = (ImageView) view.findViewById(R.id.avatar);
        this.f11909l = view.findViewById(R.id.sent_by);
        this.f11910m = (TextView) view.findViewById(R.id.name);
        this.f11911n = (TextView) view.findViewById(R.id.timestamp);
        this.f11912o = (ProgressBar) view.findViewById(R.id.progress);
        this.f11913p = (OutlinedTextView) view.findViewById(R.id.time);
        this.f11914q = (OutlinedTextView) view.findViewById(R.id.temperature);
        this.f11915r = (OutlinedTextView) view.findViewById(R.id.geo);
        this.f11916s = (TextView) view.findViewById(R.id.counter);
        this.f11917t = (ImageButton) view.findViewById(R.id.save);
        ParticleView particleView = (ParticleView) view.findViewById(R.id.particle_view);
        this.f11918u = (ImageButton) view.findViewById(R.id.reply_button);
        PreviousNextLayout previousNextLayout = (PreviousNextLayout) view.findViewById(R.id.previous_next);
        if (this.f11919v != null) {
            previousNextLayout.setListener(new C4413a());
        } else {
            previousNextLayout.setVisibility(8);
        }
        Transition sharedElementEnterTransition = getActivity().getWindow().getSharedElementEnterTransition();
        if (sharedElementEnterTransition != null) {
            sharedElementEnterTransition.addListener(new C4414b());
        } else {
            this.f11922y = true;
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        View findViewById = view.findViewById(R.id.top_space);
        View findViewById2 = view.findViewById(R.id.bottom_space);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.height = rect.top;
        findViewById.setLayoutParams(marginLayoutParams);
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) findViewById2.getLayoutParams();
        marginLayoutParams2.height = rect.bottom;
        findViewById2.setLayoutParams(marginLayoutParams2);
    }

    /* renamed from: c */
    public static PictureFragment m13136c(C7354j0 j0Var) {
        PictureFragment pictureFragment = new PictureFragment();
        Bundle bundle = new Bundle();
        bundle.putByteArray("MEDIA", j0Var.toByteArray());
        pictureFragment.setArguments(bundle);
        return pictureFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13139d() {
        this.f11917t.setImageResource(2131231427);
        this.f11917t.setOnClickListener(new C4454o(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11566a(float f, float f2, float f3) {
        m13127a(this.f11907j.getScale() > 1.05f);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11571b(View view) {
        if (this.f11907j.getScale() > 1.05f) {
            this.f11907j.mo26826a(1.0f, true);
        } else {
            m13127a(!this.f11921x);
        }
    }

    /* renamed from: a */
    public void mo11569a(Callbacks callbacks) {
        this.f11905h = callbacks;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13125a(C7354j0 j0Var) {
        C2476d.m8584a((Fragment) this).mo8549a((Object) C2475c.m8579a(C4471u0.m13251a(j0Var))).m8691a(C8978i.f23426d).mo8539b((RequestListener<TranscodeType>) new C4417e<TranscodeType>(j0Var)).mo24170M();
    }

    /* renamed from: c */
    private void m13137c() {
        if (this.f11919v != null) {
            startActivity(C4473v0.m13261b(getContext(), this.f11919v, this.f11920w));
            getActivity().finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13132b(C7354j0 j0Var) {
        String string = this.f11906i.getContext().getString(R.string.transition_image, new Object[]{j0Var.getUuid()});
        this.f11906i.setTransitionName(string);
        this.f11907j.setTransitionName(string);
        String c = C4471u0.m13253c(j0Var);
        String b = C4471u0.m13252b(j0Var);
        if (c != null) {
            C2484h a = C2476d.m8584a((Fragment) this).mo8549a((Object) C2475c.m8579a(c));
            if (b != null) {
                a = a.mo8538b((C8865i<TranscodeType>) C2476d.m8584a((Fragment) this).mo8549a((Object) C2475c.m8579a(b)).m8691a(C8978i.f23426d).mo8542f().mo8539b((RequestListener<TranscodeType>) new C4415c<TranscodeType>()));
            }
            a.mo8542f().m8691a(C8978i.f23426d).mo8539b((RequestListener<TranscodeType>) new C4416d<TranscodeType>(j0Var)).mo24173a(this.f11906i);
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo11572c(View view) {
        this.f11917t.setOnClickListener(null);
        C5498a.m15600a(requireContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f11917t.setImageResource(2131231427);
        m13130b(view.getContext());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11568a(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m13137c();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11570a(UserProto$User userProto$User) throws Exception {
        this.f11909l.setVisibility(0);
        this.f11910m.setVisibility(0);
        this.f11910m.setText(userProto$User.getName());
        new C2477e(requireContext()).load(C2884f.m9355a(userProto$User)).into(this.f11908k);
        this.f11911n.setVisibility(0);
        this.f11911n.setText(DateUtils.getRelativeTimeSpanString(this.f11920w.getCreatedAt().getSeconds() * 1000, System.currentTimeMillis(), 1000));
    }

    /* renamed from: a */
    private void m13127a(boolean z) {
        if (this.f11921x != z) {
            this.f11921x = z;
            boolean z2 = !z;
            ViewPropertyAnimator animate = this.f11915r.animate();
            float f = z2 ? 1.0f : 0.0f;
            animate.alpha(f);
            this.f11914q.animate().alpha(f);
            this.f11913p.animate().alpha(f);
            this.f11916s.animate().alpha(f);
            this.f11917t.animate().alpha(f);
            float f2 = (float) (z ? -this.f11908k.getHeight() : 0);
            this.f11908k.animate().translationY(f2);
            this.f11910m.animate().translationY(f2);
            this.f11918u.animate().translationY(f2);
            if (z) {
                this.f11905h.onImmersiveModeStarted();
            } else {
                this.f11905h.onImmersiveModeStopped();
            }
        }
    }

    /* renamed from: b */
    private void m13129b() {
        if (!C5447b.m15477d(C5448c.m15478a()).equals(this.f11920w.getUserUuid())) {
            if (getArguments().getBoolean("REPLIED")) {
                this.f11918u.setImageResource(2131231274);
                this.f11918u.setBackground(null);
                this.f11918u.setOnClickListener(null);
            } else {
                this.f11918u.setImageResource(2131231275);
                this.f11918u.setBackgroundResource(R.drawable.circle_pink);
                this.f11918u.setOnClickListener(new C4452n(this));
            }
            this.f11918u.setVisibility(0);
            this.f11904g.add(C5448c.m15478a().userPublicStream(this.f11920w.getUserUuid()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4450m<Object>(this), (Consumer<? super Throwable>) C4460r.f12027e));
        }
    }

    /* renamed from: a */
    private void m13123a(Context context) {
        File a = C3231q.m10239a(C3232a.PICTURES);
        if (a != null) {
            new C4418f(C2476d.m8584a((Fragment) this).mo8553c().m8684a(C4471u0.m13251a(this.f11920w)).mo24170M(), a, new C4448l(this, context, a), null).execute(new Void[0]);
        }
    }

    /* renamed from: b */
    private void m13130b(Context context) {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (C0540a.m2537a(context, str) == 0) {
            m13123a(context);
        } else {
            requestPermissions(new String[]{str}, 1);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11567a(Context context, File file, boolean z) {
        if (z) {
            this.f11917t.setImageResource(2131231561);
            MediaScannerConnection.scanFile(context, new String[]{file.toString()}, null, null);
            C5343a.m15160U().mo12834a(this.f11920w.getType());
            return;
        }
        m13139d();
        Toast.makeText(context, R.string.commons_title_oopserror, 0).show();
    }
}
