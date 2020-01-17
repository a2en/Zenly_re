package app.zenly.locator.core.p072ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.MediaHelper;
import app.zenly.locator.core.helper.MediaHelper.C2498b;
import app.zenly.locator.core.helper.MediaHelper.Callback;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.util.C3195c;
import app.zenly.locator.p143s.C5423h;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.CropImageView.C11923b;
import com.theartofdev.edmodo.cropper.CropImageView.OnCropImageCompleteListener;
import com.theartofdev.edmodo.cropper.CropImageView.OnSetImageUriCompleteListener;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.core.ui.activity.a */
public final class C3073a extends C1321b implements Callback {

    /* renamed from: f */
    private MediaHelper f8489f;

    /* renamed from: g */
    private C2498b f8490g = new C2498b(0, null, 3, null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12275b f8491h = new C12275b();

    /* renamed from: i */
    private BottomSheetBehavior<View> f8492i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f8493j;

    /* renamed from: k */
    private HashMap f8494k;

    /* renamed from: app.zenly.locator.core.ui.activity.a$a */
    public static final class C3074a {
        private C3074a() {
        }

        public /* synthetic */ C3074a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$b */
    static final class C3075b implements OnSetImageUriCompleteListener {

        /* renamed from: e */
        final /* synthetic */ C3073a f8495e;

        C3075b(C3073a aVar) {
            this.f8495e = aVar;
        }

        public final void onSetImageUriComplete(CropImageView cropImageView, Uri uri, Exception exc) {
            if (this.f8495e.getView() == null) {
                return;
            }
            if (exc == null) {
                FrameLayout frameLayout = (FrameLayout) this.f8495e.mo9277a(C3891l.progress);
                C12932j.m33815a((Object) frameLayout, "progress");
                frameLayout.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) this.f8495e.mo9277a(C3891l.layout_preview);
                C12932j.m33815a((Object) linearLayout, "layout_preview");
                linearLayout.setVisibility(0);
                return;
            }
            this.f8495e.m9616a((Throwable) exc);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$c */
    static final class C3076c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C3073a f8496e;

        C3076c(C3073a aVar) {
            this.f8496e = aVar;
        }

        public final void run() {
            C3073a.m9619b(this.f8496e).mo30690c(4);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$d */
    public static final class C3077d extends C10744c {

        /* renamed from: a */
        final /* synthetic */ C3073a f8497a;

        C3077d(C3073a aVar) {
            this.f8497a = aVar;
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            C12932j.m33818b(view, "bottomSheet");
            if (i == 5) {
                this.f8497a.requireActivity().setResult(this.f8497a.f8493j ? 0 : -1);
                this.f8497a.requireActivity().finish();
            }
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            C12932j.m33818b(view, "bottomSheet");
            float c = C12973l.m33892c(C12973l.m33889b(f, -1.0f), 1.0f);
            View a = this.f8497a.mo9277a(C3891l.background);
            C12932j.m33815a((Object) a, "background");
            a.setAlpha(((float) 1) + c);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$e */
    static final class C3078e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3073a f8498e;

        C3078e(C3073a aVar) {
            this.f8498e = aVar;
        }

        public final void onClick(View view) {
            this.f8498e.m9625e();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$f */
    static final class C3079f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3073a f8499e;

        C3079f(C3073a aVar) {
            this.f8499e = aVar;
        }

        public final void onClick(View view) {
            this.f8499e.m9620b();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$g */
    static final class C3080g implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3073a f8500e;

        C3080g(C3073a aVar) {
            this.f8500e = aVar;
        }

        public final void onClick(View view) {
            this.f8500e.m9622c();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$h */
    static final class C3081h implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3073a f8501e;

        C3081h(C3073a aVar) {
            this.f8501e = aVar;
        }

        public final void onClick(View view) {
            this.f8501e.m9623d();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$i */
    static final class C3082i implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3073a f8502e;

        C3082i(C3073a aVar) {
            this.f8502e = aVar;
        }

        public final void onClick(View view) {
            this.f8502e.m9617a(false);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.activity.a$j */
    static final class C3083j implements OnCropImageCompleteListener {

        /* renamed from: e */
        final /* synthetic */ C3073a f8503e;

        /* renamed from: app.zenly.locator.core.ui.activity.a$j$a */
        static final class C3084a<V> implements Callable<T> {

            /* renamed from: e */
            final /* synthetic */ C3083j f8504e;

            /* renamed from: f */
            final /* synthetic */ C11923b f8505f;

            C3084a(C3083j jVar, C11923b bVar) {
                this.f8504e = jVar;
                this.f8505f = bVar;
            }

            public final byte[] call() {
                Context requireContext = this.f8504e.f8503e.requireContext();
                C11923b bVar = this.f8505f;
                C12932j.m33815a((Object) bVar, "result");
                return C3195c.m10166a(requireContext, bVar.mo35394g());
            }
        }

        /* renamed from: app.zenly.locator.core.ui.activity.a$j$b */
        static final /* synthetic */ class C3085b extends C12931i implements Function1<byte[], C12956q> {
            C3085b(C3073a aVar) {
                super(1, aVar);
            }

            /* renamed from: a */
            public final void mo9287a(byte[] bArr) {
                C12932j.m33818b(bArr, "p1");
                ((C3073a) this.f33505f).m9618a(bArr);
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C3073a.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "onPictureSelected([B)V";
            }

            public final String getName() {
                return "onPictureSelected";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9287a((byte[]) obj);
                return C12956q.f33541a;
            }
        }

        /* renamed from: app.zenly.locator.core.ui.activity.a$j$c */
        static final /* synthetic */ class C3086c extends C12931i implements Function1<Throwable, C12956q> {
            C3086c(C3073a aVar) {
                super(1, aVar);
            }

            /* renamed from: a */
            public final void mo9288a(Throwable th) {
                ((C3073a) this.f33505f).m9616a(th);
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C3073a.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "onPictureSelectionError(Ljava/lang/Throwable;)V";
            }

            public final String getName() {
                return "onPictureSelectionError";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9288a((Throwable) obj);
                return C12956q.f33541a;
            }
        }

        /* renamed from: app.zenly.locator.core.ui.activity.a$j$d */
        static final class C3087d implements Action {

            /* renamed from: a */
            public static final C3087d f8506a = new C3087d();

            C3087d() {
            }

            public final void run() {
                C12143a.m32033c("CHANGE_USER_AVATAR_FROM_PROFILE onComplete", new Object[0]);
            }
        }

        C3083j(C3073a aVar) {
            this.f8503e = aVar;
        }

        public final void onCropImageComplete(CropImageView cropImageView, C11923b bVar) {
            Disposable a = C12279e.m32616a((Callable<? extends T>) new C3084a<Object>(this, bVar)).mo36452b(C12802a.m33491b()).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) new C3088b<Object>(new C3085b(this.f8503e)), (Consumer<? super Throwable>) new C3088b<Object>(new C3086c(this.f8503e)), (Action) C3087d.f8506a);
            C12932j.m33815a((Object) a, "Observable.fromCallable …ete\") }\n                )");
            C12773a.m33432a(a, this.f8503e.f8491h);
        }
    }

    static {
        new C3074a(null);
    }

    /* renamed from: b */
    public static final /* synthetic */ BottomSheetBehavior m9619b(C3073a aVar) {
        BottomSheetBehavior<View> bottomSheetBehavior = aVar.f8492i;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        C12932j.m33820c("bottomSheet");
        throw null;
    }

    /* renamed from: a */
    public View mo9277a(int i) {
        if (this.f8494k == null) {
            this.f8494k = new HashMap();
        }
        View view = (View) this.f8494k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8494k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f8494k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == C5423h.f13974a) {
            MediaHelper mediaHelper = this.f8489f;
            if (mediaHelper != null) {
                mediaHelper.mo8565a(this.f8490g, i2, intent);
            } else {
                C12932j.m33820c("mediaHelper");
                throw null;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_change_avatar, viewGroup, false);
    }

    public void onDestroyView() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f8492i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo14019a((C10744c) null);
            super.onDestroyView();
            mo6508a();
            return;
        }
        C12932j.m33820c("bottomSheet");
        throw null;
    }

    public void onPictureCanceled(C2498b bVar) {
        C12932j.m33818b(bVar, "shuttle");
        FragmentActivity requireActivity = requireActivity();
        C12932j.m33815a((Object) requireActivity, "requireActivity()");
        if (!requireActivity.isFinishing()) {
            m9613a(this, null, 1, null);
        }
    }

    public void onPictureLoaded(C2498b bVar) {
        C12932j.m33818b(bVar, "shuttle");
        FragmentActivity requireActivity = requireActivity();
        C12932j.m33815a((Object) requireActivity, "requireActivity()");
        if (!requireActivity.isFinishing()) {
            ((CropImageView) mo9277a(C3891l.preview_image_view)).setOnSetImageUriCompleteListener(new C3075b(this));
            ((CropImageView) mo9277a(C3891l.preview_image_view)).setImageUriAsync(Uri.fromFile(new File(bVar.mo8570a())));
        }
    }

    public void onPictureLoading(C2498b bVar) {
        C12932j.m33818b(bVar, "shuttle");
        FrameLayout frameLayout = (FrameLayout) mo9277a(C3891l.progress);
        C12932j.m33815a((Object) frameLayout, "progress");
        frameLayout.setVisibility(0);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C12932j.m33818b(bundle, "outState");
        bundle.putSerializable("MediaHelperShuttle", this.f8490g);
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        this.f8491h.mo36401a();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        BottomSheetBehavior<View> b = BottomSheetBehavior.m27416b((LinearLayout) mo9277a(C3891l.layout_menu));
        C12932j.m33815a((Object) b, "BottomSheetBehavior.from(layout_menu)");
        this.f8492i = b;
        BottomSheetBehavior<View> bottomSheetBehavior = this.f8492i;
        String str = "bottomSheet";
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo30687b(true);
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.f8492i;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.mo30690c(5);
                ((LinearLayout) mo9277a(C3891l.layout_menu)).post(new C3076c(this));
                BottomSheetBehavior<View> bottomSheetBehavior3 = this.f8492i;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.mo14019a((C10744c) new C3077d(this));
                    ((LinearLayout) mo9277a(C3891l.capture)).setOnClickListener(new C3078e(this));
                    ((LinearLayout) mo9277a(C3891l.gallery)).setOnClickListener(new C3079f(this));
                    ((ImageView) mo9277a(C3891l.btn_rotate)).setOnClickListener(new C3080g(this));
                    ((AppCompatImageButton) mo9277a(C3891l.btn_save)).setOnClickListener(new C3081h(this));
                    ((CoordinatorLayout) mo9277a(C3891l.root_container)).setOnClickListener(new C3082i(this));
                    FragmentActivity requireActivity = requireActivity();
                    C12932j.m33815a((Object) requireActivity, "requireActivity()");
                    this.f8489f = new MediaHelper(requireActivity, C5423h.f13974a, this);
                    if (bundle != null) {
                        String str2 = "MediaHelperShuttle";
                        if (bundle.containsKey(str2)) {
                            Serializable serializable = bundle.getSerializable(str2);
                            if (serializable != null) {
                                this.f8490g = (C2498b) serializable;
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.helper.MediaHelper.Shuttle");
                        }
                        return;
                    }
                    return;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        LinearLayout linearLayout = (LinearLayout) mo9277a(C3891l.layout_menu);
        C12932j.m33815a((Object) linearLayout, "layout_menu");
        linearLayout.setPadding(rect.left, linearLayout.getPaddingTop(), rect.right, rect.bottom);
        LinearLayout linearLayout2 = (LinearLayout) mo9277a(C3891l.layout_preview);
        C12932j.m33815a((Object) linearLayout2, "layout_preview");
        linearLayout2.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m9620b() {
        MediaHelper mediaHelper = this.f8489f;
        if (mediaHelper != null) {
            mediaHelper.mo8564a(this.f8490g);
        } else {
            C12932j.m33820c("mediaHelper");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m9622c() {
        ((CropImageView) mo9277a(C3891l.preview_image_view)).mo35333a(90);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m9623d() {
        FrameLayout frameLayout = (FrameLayout) mo9277a(C3891l.progress);
        C12932j.m33815a((Object) frameLayout, "progress");
        frameLayout.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) mo9277a(C3891l.layout_preview);
        C12932j.m33815a((Object) linearLayout, "layout_preview");
        linearLayout.setVisibility(8);
        ((CropImageView) mo9277a(C3891l.preview_image_view)).mo35334a(512, 512);
        ((CropImageView) mo9277a(C3891l.preview_image_view)).setOnCropImageCompleteListener(new C3083j(this));
        ((CropImageView) mo9277a(C3891l.preview_image_view)).mo35336a(Uri.fromFile(new File(this.f8490g.mo8570a())));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m9625e() {
        MediaHelper mediaHelper = this.f8489f;
        if (mediaHelper != null) {
            mediaHelper.mo8566b(this.f8490g);
        } else {
            C12932j.m33820c("mediaHelper");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9617a(boolean z) {
        this.f8493j = z;
        BottomSheetBehavior<View> bottomSheetBehavior = this.f8492i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo30690c(5);
        } else {
            C12932j.m33820c("bottomSheet");
            throw null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m9613a(C3073a aVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        aVar.m9616a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9616a(Throwable th) {
        Toast.makeText(requireContext(), R.string.commons_content_oopserror, 0).show();
        if (th != null) {
            C12143a.m32032b(th, "failed to generate avatar picture", new Object[0]);
        }
        m9617a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9618a(byte[] bArr) {
        Context requireContext = requireContext();
        String str = "requireContext()";
        C12932j.m33815a((Object) requireContext, str);
        C2666b.m9049a(requireContext).mo8765c().mo8844a(bArr);
        C5499a aVar = C5498a.f14119e;
        Context requireContext2 = requireContext();
        C12932j.m33815a((Object) requireContext2, str);
        C5498a.m15602a(aVar.mo13125a(requireContext2), C5501c.HEAVY, C5500b.POSITIVE, 0, 4, null);
        m9617a(true);
    }
}
