package zendesk.belvedere;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.C1101f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.BelvedereUi.UiConfig;
import zendesk.belvedere.p428s.C13534b;
import zendesk.belvedere.p428s.C13535c;
import zendesk.belvedere.p428s.C13536d;
import zendesk.belvedere.p428s.C13537e;
import zendesk.belvedere.p428s.C13538f;
import zendesk.belvedere.p428s.C13539g;
import zendesk.belvedere.p428s.C13540h;
import zendesk.belvedere.p428s.C13541i;

/* renamed from: zendesk.belvedere.i */
class C13512i extends PopupWindow implements ImageStreamMvp$View {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13507g f35036a;

    /* renamed from: b */
    private final C13494d f35037b = new C13494d();

    /* renamed from: c */
    private final List<Integer> f35038c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public KeyboardHelper f35039d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View f35040e;

    /* renamed from: f */
    private View f35041f;

    /* renamed from: g */
    private View f35042g;

    /* renamed from: h */
    private View f35043h;

    /* renamed from: i */
    private FloatingActionMenu f35044i;

    /* renamed from: j */
    private RecyclerView f35045j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Toolbar f35046k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public BottomSheetBehavior<View> f35047l;

    /* renamed from: m */
    private Activity f35048m;

    /* renamed from: zendesk.belvedere.i$a */
    class C13513a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ boolean f35049e;

        C13513a(boolean z) {
            this.f35049e = z;
        }

        public void onClick(View view) {
            if (!this.f35049e) {
                C13512i.this.f35047l.mo30690c(4);
            } else {
                C13512i.this.dismiss();
            }
        }
    }

    /* renamed from: zendesk.belvedere.i$b */
    class C13514b extends C10744c {
        C13514b() {
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            if (i == 5) {
                C13512i.this.dismiss();
            }
        }
    }

    /* renamed from: zendesk.belvedere.i$c */
    class C13515c implements C13479c {
        C13515c() {
        }

        /* renamed from: a */
        public void mo38820a(int i) {
            if (i != C13512i.this.f35047l.mo30680a()) {
                C13512i.this.f35047l.mo30686b(C13512i.this.f35040e.getPaddingTop() + C13512i.this.f35039d.getKeyboardHeight());
            }
        }
    }

    /* renamed from: zendesk.belvedere.i$d */
    class C13516d implements OnTouchListener {

        /* renamed from: e */
        final /* synthetic */ List f35053e;

        /* renamed from: f */
        final /* synthetic */ Activity f35054f;

        C13516d(List list, Activity activity) {
            this.f35053e = list;
            this.f35054f = activity;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            Iterator it = this.f35053e.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                View findViewById = this.f35054f.findViewById(((Integer) it.next()).intValue());
                if (findViewById != null) {
                    Rect rect = new Rect();
                    findViewById.getGlobalVisibleRect(rect);
                    boolean z2 = rawX >= rect.left && rawX <= rect.right;
                    boolean z3 = rawY >= rect.top && rawY <= rect.bottom;
                    if (z2 && z3) {
                        this.f35054f.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
                        break;
                    }
                }
            }
            if (z) {
                C13512i.this.dismiss();
            }
            return true;
        }
    }

    /* renamed from: zendesk.belvedere.i$e */
    class C13517e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Window f35056a;

        /* renamed from: b */
        final /* synthetic */ ValueAnimator f35057b;

        C13517e(C13512i iVar, Window window, ValueAnimator valueAnimator) {
            this.f35056a = window;
            this.f35057b = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35056a.setStatusBarColor(((Integer) this.f35057b.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: zendesk.belvedere.i$f */
    private class C13518f extends Behavior<View> {

        /* renamed from: a */
        private final boolean f35058a;

        /* synthetic */ C13518f(C13512i iVar, boolean z, C13513a aVar) {
            this(z);
        }

        /* renamed from: a */
        private void m35797a(int i, float f, int i2, View view) {
            float f2 = (float) i;
            float f3 = f2 - (f * f2);
            float f4 = (float) i2;
            if (f3 <= f4) {
                C13531r.m35853a(C13512i.this.getContentView(), true);
                view.setAlpha(1.0f - (f3 / f4));
                view.setY(f3);
            } else {
                C13531r.m35853a(C13512i.this.getContentView(), false);
            }
            C13512i.this.m35783a(f);
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2.getId() == C13538f.bottom_sheet;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int height = coordinatorLayout.getHeight() - C13512i.this.f35047l.mo30680a();
            float height2 = ((((float) coordinatorLayout.getHeight()) - view2.getY()) - ((float) C13512i.this.f35047l.mo30680a())) / ((float) height);
            m35797a(height, height2, ViewCompat.m2863p(C13512i.this.f35046k), view);
            if (this.f35058a) {
                C13512i.this.f35036a.onImageStreamScrolled(coordinatorLayout.getHeight(), height, height2);
            }
            return true;
        }

        private C13518f(boolean z) {
            this.f35058a = z;
        }
    }

    private C13512i(Activity activity, View view, ImageStream imageStream, UiConfig uiConfig) {
        super(view, -1, -1, false);
        setInputMethodMode(2);
        setFocusable(true);
        setTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        m35785a(view);
        this.f35048m = activity;
        this.f35039d = imageStream.mo38776b();
        this.f35038c = uiConfig.mo38740e();
        this.f35036a = new C13507g(new C13506f(view.getContext(), uiConfig), this, imageStream);
        this.f35036a.init();
    }

    public void dismiss() {
        super.dismiss();
        m35783a(0.0f);
        this.f35036a.dismiss();
    }

    public void initViews(boolean z) {
        m35786a(this.f35037b);
        m35790b(z);
        m35788a(z);
        m35784a(this.f35048m, this.f35038c);
    }

    public void openMediaIntent(MediaIntent mediaIntent, ImageStream imageStream) {
        mediaIntent.mo38827a(imageStream);
    }

    public boolean shouldShowFullScreen() {
        if (VERSION.SDK_INT >= 24 && (this.f35048m.isInMultiWindowMode() || this.f35048m.isInPictureInPictureMode())) {
            return true;
        }
        if (this.f35048m.getResources().getConfiguration().keyboard != 1) {
            return true;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f35048m.getSystemService("accessibility");
        if (accessibilityManager != null) {
            List enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(47);
            if (enabledAccessibilityServiceList == null || enabledAccessibilityServiceList.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void showDocumentMenuItem(OnClickListener onClickListener) {
        FloatingActionMenu floatingActionMenu = this.f35044i;
        if (floatingActionMenu != null) {
            floatingActionMenu.mo38762a(C13537e.belvedere_ic_file, C13538f.belvedere_fam_item_documents, C13541i.belvedere_fam_desc_open_gallery, onClickListener);
        }
    }

    public void showGooglePhotosMenuItem(OnClickListener onClickListener) {
        FloatingActionMenu floatingActionMenu = this.f35044i;
        if (floatingActionMenu != null) {
            floatingActionMenu.mo38762a(C13537e.belvedere_ic_collections, C13538f.belvedere_fam_item_google_photos, C13541i.belvedere_fam_desc_open_google_photos, onClickListener);
        }
    }

    public void showImageStream(List<MediaResult> list, List<MediaResult> list2, boolean z, boolean z2, C13496b bVar) {
        if (!z) {
            KeyboardHelper.m35681a(this.f35039d.getInputTrap());
        }
        LayoutParams layoutParams = this.f35040e.getLayoutParams();
        layoutParams.height = -1;
        this.f35040e.setLayoutParams(layoutParams);
        if (z2) {
            this.f35037b.mo38873a((C13499b) C13497e.m35751a(bVar));
        }
        this.f35037b.mo38872a(C13497e.m35750a(list, bVar, this.f35040e.getContext()));
        this.f35037b.mo38874b(list2);
        this.f35037b.notifyDataSetChanged();
    }

    public void showToast(int i) {
        Toast.makeText(this.f35048m, i, 0).show();
    }

    public void updateToolbarTitle(int i) {
        if (i > 0) {
            String string = this.f35048m.getString(C13541i.belvedere_image_stream_title);
            this.f35046k.setTitle((CharSequence) String.format(Locale.getDefault(), "%s (%d)", new Object[]{string, Integer.valueOf(i)}));
            return;
        }
        this.f35046k.setTitle(C13541i.belvedere_image_stream_title);
    }

    /* renamed from: b */
    private void m35790b(boolean z) {
        this.f35046k.setNavigationIcon(C13537e.belvedere_ic_close);
        this.f35046k.setNavigationContentDescription(C13541i.belvedere_toolbar_desc_collapse);
        this.f35046k.setBackgroundColor(-1);
        this.f35046k.setNavigationOnClickListener(new C13513a(z));
        if (VERSION.SDK_INT < 21) {
            this.f35043h.setVisibility(0);
        }
        C0489d dVar = (C0489d) this.f35042g.getLayoutParams();
        if (dVar != null) {
            dVar.mo2892a((Behavior) new C13518f(this, !z, null));
        }
    }

    /* renamed from: a */
    static C13512i m35782a(Activity activity, ViewGroup viewGroup, ImageStream imageStream, UiConfig uiConfig) {
        C13512i iVar = new C13512i(activity, LayoutInflater.from(activity).inflate(C13540h.belvedere_image_stream, viewGroup, false), imageStream, uiConfig);
        iVar.showAtLocation(viewGroup, 48, 0, 0);
        return iVar;
    }

    /* renamed from: a */
    private void m35785a(View view) {
        this.f35040e = view.findViewById(C13538f.bottom_sheet);
        this.f35041f = view.findViewById(C13538f.dismiss_area);
        this.f35045j = (RecyclerView) view.findViewById(C13538f.image_list);
        this.f35046k = (Toolbar) view.findViewById(C13538f.image_stream_toolbar);
        this.f35042g = view.findViewById(C13538f.image_stream_toolbar_container);
        this.f35043h = view.findViewById(C13538f.image_stream_compat_shadow);
        this.f35044i = (FloatingActionMenu) view.findViewById(C13538f.floating_action_menu);
    }

    /* renamed from: a */
    private void m35786a(C13494d dVar) {
        this.f35045j.setLayoutManager(new StaggeredGridLayoutManager(this.f35040e.getContext().getResources().getInteger(C13539g.belvedere_image_stream_column_count), 1));
        this.f35045j.setHasFixedSize(true);
        this.f35045j.setDrawingCacheEnabled(true);
        this.f35045j.setDrawingCacheQuality(1048576);
        C1101f fVar = new C1101f();
        fVar.setSupportsChangeAnimations(false);
        this.f35045j.setItemAnimator(fVar);
        this.f35045j.setAdapter(dVar);
    }

    /* renamed from: a */
    private void m35788a(boolean z) {
        ViewCompat.m2835b((View) this.f35045j, (float) this.f35040e.getContext().getResources().getDimensionPixelSize(C13536d.belvedere_bottom_sheet_elevation));
        this.f35047l = BottomSheetBehavior.m27416b(this.f35040e);
        this.f35047l.mo14019a((C10744c) new C13514b());
        C13531r.m35853a(getContentView(), false);
        if (!z) {
            this.f35047l.mo30686b(this.f35040e.getPaddingTop() + this.f35039d.getKeyboardHeight());
            this.f35047l.mo30690c(4);
            this.f35039d.setKeyboardHeightListener(new C13515c());
        } else {
            this.f35047l.mo30691c(true);
            this.f35047l.mo30690c(3);
            KeyboardHelper.m35685b(this.f35048m);
        }
        this.f35045j.setClickable(true);
        this.f35040e.setVisibility(0);
    }

    /* renamed from: a */
    private void m35784a(Activity activity, List<Integer> list) {
        this.f35041f.setOnTouchListener(new C13516d(list, activity));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35783a(float f) {
        int color = this.f35046k.getResources().getColor(C13535c.belvedere_image_stream_status_bar_color);
        int a = C13531r.m35852a(this.f35046k.getContext(), C13534b.colorPrimaryDark);
        boolean z = f == 1.0f;
        Window window = this.f35048m.getWindow();
        if (VERSION.SDK_INT >= 21) {
            if (!z) {
                window.setStatusBarColor(a);
            } else if (window.getStatusBarColor() == a) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(a), Integer.valueOf(color)});
                ofObject.setDuration(100);
                ofObject.addUpdateListener(new C13517e(this, window, ofObject));
                ofObject.start();
            }
        }
        if (VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            if (z) {
                decorView.setSystemUiVisibility(8192);
            } else {
                decorView.setSystemUiVisibility(0);
            }
        }
    }
}
