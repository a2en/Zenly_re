package app.zenly.locator.powermoves.p133ui.gift;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import app.zenly.android.feature.base.app.C1320a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.powermoves.p128c.C4993a;
import com.bumptech.glide.C8865i;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.C9140w;
import com.bumptech.glide.request.C9220a;
import com.bumptech.glide.request.C9224d;
import com.bumptech.glide.request.target.C9231d;
import com.bumptech.glide.request.transition.Transition;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p333g.p382g.p383a.C12125b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.powermoves.ui.gift.GiftWallpaperDialogFragment */
public final class GiftWallpaperDialogFragment extends C1320a {

    /* renamed from: r */
    private C12125b f13092r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Disposable f13093s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Bitmap f13094t;

    /* renamed from: u */
    private HashMap f13095u;

    /* renamed from: app.zenly.locator.powermoves.ui.gift.GiftWallpaperDialogFragment$a */
    public static final class C5037a extends C9231d<ImageView, Bitmap> {

        /* renamed from: k */
        final /* synthetic */ GiftWallpaperDialogFragment f13096k;

        C5037a(GiftWallpaperDialogFragment giftWallpaperDialogFragment, View view) {
            this.f13096k = giftWallpaperDialogFragment;
            super(view);
        }

        /* renamed from: a */
        public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
            C12932j.m33818b(bitmap, "resource");
            this.f13096k.f13094t = bitmap;
            ((ImageView) this.f13096k.mo12292a(C3891l.wallpaperImageView)).setImageBitmap(bitmap);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8503a(Drawable drawable) {
        }

        public void onLoadFailed(Drawable drawable) {
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.gift.GiftWallpaperDialogFragment$b */
    static final class C5038b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ GiftWallpaperDialogFragment f13097e;

        /* renamed from: app.zenly.locator.powermoves.ui.gift.GiftWallpaperDialogFragment$b$a */
        static final class C5039a<T> implements Predicate<Boolean> {

            /* renamed from: e */
            public static final C5039a f13098e = new C5039a();

            C5039a() {
            }

            /* renamed from: a */
            public final Boolean mo12295a(Boolean bool) {
                C12932j.m33818b(bool, "granted");
                return bool;
            }

            public /* bridge */ /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                mo12295a(bool);
                return bool.booleanValue();
            }
        }

        /* renamed from: app.zenly.locator.powermoves.ui.gift.GiftWallpaperDialogFragment$b$b */
        static final class C5040b<T, R> implements Function<T, R> {

            /* renamed from: e */
            final /* synthetic */ C5038b f13099e;

            C5040b(C5038b bVar) {
                this.f13099e = bVar;
            }

            /* renamed from: a */
            public final Boolean mo12296a(Boolean bool) {
                C12932j.m33818b(bool, "granted");
                Bitmap b = this.f13099e.f13097e.f13094t;
                if (b != null) {
                    Context requireContext = this.f13099e.f13097e.requireContext();
                    C12932j.m33815a((Object) requireContext, "requireContext()");
                    String str = "Zenly Wallpaper";
                    Media.insertImage(requireContext.getContentResolver(), b, str, str);
                }
                return bool;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                mo12296a(bool);
                return bool;
            }
        }

        /* renamed from: app.zenly.locator.powermoves.ui.gift.GiftWallpaperDialogFragment$b$c */
        static final class C5041c<T> implements Consumer<Boolean> {

            /* renamed from: e */
            final /* synthetic */ C5038b f13100e;

            C5041c(C5038b bVar) {
                this.f13100e = bVar;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                Button button = (Button) this.f13100e.f13097e.mo12292a(C3891l.setWallpaperButton);
                C12932j.m33815a((Object) button, "setWallpaperButton");
                button.setVisibility(4);
                Group group = (Group) this.f13100e.f13097e.mo12292a(C3891l.savedWallpaperGroup);
                C12932j.m33815a((Object) group, "savedWallpaperGroup");
                group.setVisibility(0);
            }
        }

        C5038b(GiftWallpaperDialogFragment giftWallpaperDialogFragment) {
            this.f13097e = giftWallpaperDialogFragment;
        }

        public final void onClick(View view) {
            GiftWallpaperDialogFragment giftWallpaperDialogFragment = this.f13097e;
            giftWallpaperDialogFragment.f13093s = GiftWallpaperDialogFragment.m14427a(giftWallpaperDialogFragment).mo35910c("android.permission.WRITE_EXTERNAL_STORAGE").mo36459b((Predicate<? super T>) C5039a.f13098e).mo36501i(new C5040b(this)).mo36455b((Consumer<? super T>) new C5041c<Object>(this)).mo36508m();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C12125b m14427a(GiftWallpaperDialogFragment giftWallpaperDialogFragment) {
        C12125b bVar = giftWallpaperDialogFragment.f13092r;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("rxPermissions");
        throw null;
    }

    /* renamed from: f */
    private final void m14431f() {
        ((C8865i) Glide.m21131a((Fragment) this).mo8543a().mo8528a(Uri.parse("file:///android_asset/wallpaper.jpg")).mo8537b()).m21234a((C9220a<?>) C9224d.m22184b((Transformation<Bitmap>) new C9140w<Bitmap>(64))).mo24171a(new C5037a(this, (ImageView) mo12292a(C3891l.wallpaperImageView)));
        ((Button) mo12292a(C3891l.setWallpaperButton)).setOnClickListener(new C5038b(this));
    }

    /* renamed from: a */
    public View mo12292a(int i) {
        if (this.f13095u == null) {
            this.f13095u = new HashMap();
        }
        View view = (View) this.f13095u.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13095u.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: c */
    public int mo4208c() {
        return 2132083176;
    }

    /* renamed from: e */
    public void mo6506e() {
        HashMap hashMap = this.f13095u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13092r = new C12125b(requireActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.dialog_fragment_gift_wallpaper, viewGroup, false);
    }

    public void onDestroyView() {
        Disposable disposable = this.f13093s;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroyView();
        mo6506e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        m14431f();
        C4993a aVar = C4993a.f13022a;
        ImageView imageView = (ImageView) mo12292a(C3891l.wallpaperImageView);
        C12932j.m33815a((Object) imageView, "wallpaperImageView");
        aVar.mo12236a(imageView, 200.0f).mo3622d();
        C4993a aVar2 = C4993a.f13022a;
        Button button = (Button) mo12292a(C3891l.setWallpaperButton);
        C12932j.m33815a((Object) button, "setWallpaperButton");
        aVar2.mo12236a(button, 350.0f).mo3622d();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
