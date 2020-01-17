package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.C0143b;
import androidx.appcompat.view.C0145d.C0146a;
import androidx.appcompat.view.C0147e;
import androidx.appcompat.view.C0152g;
import androidx.appcompat.view.menu.C0164e;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0250e;
import androidx.appcompat.widget.C0252e0;
import androidx.appcompat.widget.C0254f0;
import androidx.appcompat.widget.C0291z;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.OnAttachListener;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.C0524e;
import androidx.core.view.C0642d;
import androidx.core.view.C0661n;
import androidx.core.view.C0665o;
import androidx.core.view.C0666p;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p214e.p215a.C7521a;
import p214e.p215a.C7523c;
import p214e.p215a.C7526f;
import p214e.p215a.C7527g;
import p214e.p215a.C7529i;
import p214e.p215a.C7530j;
import p214e.p215a.p216k.p217a.C7531a;
import p214e.p228e.C7571a;

class AppCompatDelegateImpl extends C0124b implements Callback, Factory2 {

    /* renamed from: d0 */
    private static final Map<Class<?>, Integer> f260d0 = new C7571a();

    /* renamed from: e0 */
    private static final boolean f261e0 = (VERSION.SDK_INT < 21);

    /* renamed from: f0 */
    private static final int[] f262f0 = {16842836};

    /* renamed from: g0 */
    private static boolean f263g0 = true;

    /* renamed from: A */
    private TextView f264A;

    /* renamed from: B */
    private View f265B;

    /* renamed from: C */
    private boolean f266C;

    /* renamed from: D */
    private boolean f267D;

    /* renamed from: E */
    boolean f268E;

    /* renamed from: F */
    boolean f269F;

    /* renamed from: G */
    boolean f270G;

    /* renamed from: H */
    boolean f271H;

    /* renamed from: I */
    boolean f272I;

    /* renamed from: J */
    private boolean f273J;

    /* renamed from: K */
    private PanelFeatureState[] f274K;

    /* renamed from: L */
    private PanelFeatureState f275L;

    /* renamed from: M */
    private boolean f276M;

    /* renamed from: N */
    private boolean f277N;

    /* renamed from: O */
    private boolean f278O;

    /* renamed from: P */
    boolean f279P;

    /* renamed from: Q */
    private int f280Q;

    /* renamed from: R */
    private int f281R;

    /* renamed from: S */
    private boolean f282S;

    /* renamed from: T */
    private boolean f283T;

    /* renamed from: U */
    private C0116m f284U;

    /* renamed from: V */
    private C0116m f285V;

    /* renamed from: W */
    boolean f286W;

    /* renamed from: X */
    int f287X;

    /* renamed from: Y */
    private final Runnable f288Y;

    /* renamed from: Z */
    private boolean f289Z;

    /* renamed from: a0 */
    private Rect f290a0;

    /* renamed from: b0 */
    private Rect f291b0;

    /* renamed from: c0 */
    private AppCompatViewInflater f292c0;

    /* renamed from: h */
    final Object f293h;

    /* renamed from: i */
    final Context f294i;

    /* renamed from: j */
    Window f295j;

    /* renamed from: k */
    private C0114k f296k;

    /* renamed from: l */
    final AppCompatCallback f297l;

    /* renamed from: m */
    ActionBar f298m;

    /* renamed from: n */
    MenuInflater f299n;

    /* renamed from: o */
    private CharSequence f300o;

    /* renamed from: p */
    private DecorContentParent f301p;

    /* renamed from: q */
    private C0111i f302q;

    /* renamed from: r */
    private C0120p f303r;

    /* renamed from: s */
    ActionMode f304s;

    /* renamed from: t */
    ActionBarContextView f305t;

    /* renamed from: u */
    PopupWindow f306u;

    /* renamed from: v */
    Runnable f307v;

    /* renamed from: w */
    C0661n f308w;

    /* renamed from: x */
    private boolean f309x;

    /* renamed from: y */
    private boolean f310y;

    /* renamed from: z */
    private ViewGroup f311z;

    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f312a;

        /* renamed from: b */
        int f313b;

        /* renamed from: c */
        int f314c;

        /* renamed from: d */
        int f315d;

        /* renamed from: e */
        int f316e;

        /* renamed from: f */
        int f317f;

        /* renamed from: g */
        ViewGroup f318g;

        /* renamed from: h */
        View f319h;

        /* renamed from: i */
        View f320i;

        /* renamed from: j */
        MenuBuilder f321j;

        /* renamed from: k */
        C0164e f322k;

        /* renamed from: l */
        Context f323l;

        /* renamed from: m */
        boolean f324m;

        /* renamed from: n */
        boolean f325n;

        /* renamed from: o */
        boolean f326o;

        /* renamed from: p */
        public boolean f327p;

        /* renamed from: q */
        boolean f328q = false;

        /* renamed from: r */
        boolean f329r;

        /* renamed from: s */
        Bundle f330s;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new C0101a();

            /* renamed from: e */
            int f331e;

            /* renamed from: f */
            boolean f332f;

            /* renamed from: g */
            Bundle f333g;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            static class C0101a implements ClassLoaderCreator<SavedState> {
                C0101a() {
                }

                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m322a(parcel, classLoader);
                }

                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m322a(parcel, null);
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m322a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f331e = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f332f = z;
                if (savedState.f332f) {
                    savedState.f333g = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f331e);
                parcel.writeInt(this.f332f ? 1 : 0);
                if (this.f332f) {
                    parcel.writeBundle(this.f333g);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f312a = i;
        }

        /* renamed from: a */
        public boolean mo464a() {
            boolean z = false;
            if (this.f319h == null) {
                return false;
            }
            if (this.f320i != null) {
                return true;
            }
            if (this.f322k.mo888a().getCount() > 0) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo462a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C7521a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C7521a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C7529i.Theme_AppCompat_CompactMenu, true);
            }
            C0143b bVar = new C0143b(context, 0);
            bVar.getTheme().setTo(newTheme);
            this.f323l = bVar;
            TypedArray obtainStyledAttributes = bVar.obtainStyledAttributes(C7530j.AppCompatTheme);
            this.f313b = obtainStyledAttributes.getResourceId(C7530j.AppCompatTheme_panelBackground, 0);
            this.f317f = obtainStyledAttributes.getResourceId(C7530j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo463a(MenuBuilder menuBuilder) {
            MenuBuilder menuBuilder2 = this.f321j;
            if (menuBuilder != menuBuilder2) {
                if (menuBuilder2 != null) {
                    menuBuilder2.mo739b((MenuPresenter) this.f322k);
                }
                this.f321j = menuBuilder;
                if (menuBuilder != null) {
                    C0164e eVar = this.f322k;
                    if (eVar != null) {
                        menuBuilder.mo719a((MenuPresenter) eVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MenuView mo461a(MenuPresenter.Callback callback) {
            if (this.f321j == null) {
                return null;
            }
            if (this.f322k == null) {
                this.f322k = new C0164e(this.f323l, C7527g.abc_list_menu_item_layout);
                this.f322k.setCallback(callback);
                this.f321j.mo719a((MenuPresenter) this.f322k);
            }
            return this.f322k.getMenuView(this.f318g);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    static class C0102a implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ UncaughtExceptionHandler f334a;

        C0102a(UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f334a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m323a(Throwable th) {
            if (!(th instanceof NotFoundException)) {
                return false;
            }
            String message = th.getMessage();
            if (message == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m323a(th)) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                NotFoundException notFoundException = new NotFoundException(sb.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f334a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f334a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    class C0103b implements Runnable {
        C0103b() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f287X & 1) != 0) {
                appCompatDelegateImpl.mo437f(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f287X & 4096) != 0) {
                appCompatDelegateImpl2.mo437f(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f286W = false;
            appCompatDelegateImpl3.f287X = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    class C0104c implements OnApplyWindowInsetsListener {
        C0104c() {
        }

        public C0666p onApplyWindowInsets(View view, C0666p pVar) {
            int d = pVar.mo3446d();
            int j = AppCompatDelegateImpl.this.mo444j(d);
            if (d != j) {
                pVar = pVar.mo3443a(pVar.mo3444b(), j, pVar.mo3445c(), pVar.mo3442a());
            }
            return ViewCompat.m2834b(view, pVar);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    class C0105d implements OnFitSystemWindowsListener {
        C0105d() {
        }

        public void onFitSystemWindows(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.mo444j(rect.top);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    class C0106e implements OnAttachListener {
        C0106e() {
        }

        public void onAttachedFromWindow() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo447m();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    class C0107f implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f$a */
        class C0108a extends C0665o {
            C0108a() {
            }

            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f305t.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f308w.mo3430a((ViewPropertyAnimatorListener) null);
                AppCompatDelegateImpl.this.f308w = null;
            }

            public void onAnimationStart(View view) {
                AppCompatDelegateImpl.this.f305t.setVisibility(0);
            }
        }

        C0107f() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f306u.showAtLocation(appCompatDelegateImpl.f305t, 55, 0, 0);
            AppCompatDelegateImpl.this.mo448n();
            if (AppCompatDelegateImpl.this.mo460v()) {
                AppCompatDelegateImpl.this.f305t.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                C0661n a = ViewCompat.m2813a(appCompatDelegateImpl2.f305t);
                a.mo3427a(1.0f);
                appCompatDelegateImpl2.f308w = a;
                AppCompatDelegateImpl.this.f308w.mo3430a((ViewPropertyAnimatorListener) new C0108a());
                return;
            }
            AppCompatDelegateImpl.this.f305t.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f305t.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    class C0109g extends C0665o {
        C0109g() {
        }

        public void onAnimationEnd(View view) {
            AppCompatDelegateImpl.this.f305t.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f308w.mo3430a((ViewPropertyAnimatorListener) null);
            AppCompatDelegateImpl.this.f308w = null;
        }

        public void onAnimationStart(View view) {
            AppCompatDelegateImpl.this.f305t.setVisibility(0);
            AppCompatDelegateImpl.this.f305t.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f305t.getParent() instanceof View) {
                ViewCompat.m2809I((View) AppCompatDelegateImpl.this.f305t.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    private class C0110h implements ActionBarDrawerToggle$Delegate {
        C0110h() {
        }

        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.mo449o();
        }

        public Drawable getThemeUpIndicator() {
            C0291z a = C0291z.m1195a(getActionBarThemedContext(), (AttributeSet) null, new int[]{C7521a.homeAsUpIndicator});
            Drawable b = a.mo2106b(0);
            a.mo2102a();
            return b;
        }

        public boolean isNavigationVisible() {
            ActionBar d = AppCompatDelegateImpl.this.mo432d();
            return (d == null || (d.mo303c() & 4) == 0) ? false : true;
        }

        public void setActionBarDescription(int i) {
            ActionBar d = AppCompatDelegateImpl.this.mo432d();
            if (d != null) {
                d.mo292a(i);
            }
        }

        public void setActionBarUpIndicator(Drawable drawable, int i) {
            ActionBar d = AppCompatDelegateImpl.this.mo432d();
            if (d != null) {
                d.mo294a(drawable);
                d.mo292a(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    private final class C0111i implements MenuPresenter.Callback {
        C0111i() {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.mo417a(menuBuilder);
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback r = AppCompatDelegateImpl.this.mo456r();
            if (r != null) {
                r.onMenuOpened(108, menuBuilder);
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    class C0112j implements ActionMode.Callback {

        /* renamed from: a */
        private ActionMode.Callback f344a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j$a */
        class C0113a extends C0665o {
            C0113a() {
            }

            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f305t.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f306u;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f305t.getParent() instanceof View) {
                    ViewCompat.m2809I((View) AppCompatDelegateImpl.this.f305t.getParent());
                }
                AppCompatDelegateImpl.this.f305t.removeAllViews();
                AppCompatDelegateImpl.this.f308w.mo3430a((ViewPropertyAnimatorListener) null);
                AppCompatDelegateImpl.this.f308w = null;
            }
        }

        public C0112j(ActionMode.Callback callback) {
            this.f344a = callback;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f344a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f344a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f344a.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f306u != null) {
                appCompatDelegateImpl.f295j.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f307v);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f305t != null) {
                appCompatDelegateImpl2.mo448n();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                C0661n a = ViewCompat.m2813a(appCompatDelegateImpl3.f305t);
                a.mo3427a(0.0f);
                appCompatDelegateImpl3.f308w = a;
                AppCompatDelegateImpl.this.f308w.mo3430a((ViewPropertyAnimatorListener) new C0113a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.f297l;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.f304s);
            }
            AppCompatDelegateImpl.this.f304s = null;
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f344a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    class C0114k extends C0152g {
        C0114k(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final android.view.ActionMode mo485a(android.view.ActionMode.Callback callback) {
            C0146a aVar = new C0146a(AppCompatDelegateImpl.this.f294i, callback);
            ActionMode a = AppCompatDelegateImpl.this.mo408a((ActionMode.Callback) aVar);
            if (a != null) {
                return aVar.mo640a(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo421a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo427b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo441h(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo443i(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.mo745c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.mo745c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState a = AppCompatDelegateImpl.this.mo406a(0, true);
            if (a != null) {
                MenuBuilder menuBuilder = a.f321j;
                if (menuBuilder != null) {
                    super.onProvideKeyboardShortcuts(list, menuBuilder, i);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }

        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo457s()) {
                return mo485a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo457s() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo485a(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    private class C0115l extends C0116m {

        /* renamed from: c */
        private final PowerManager f348c;

        C0115l(Context context) {
            super();
            this.f348c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo496b() {
            if (VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo497c() {
            if (VERSION.SDK_INT < 21 || !this.f348c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo498d() {
            AppCompatDelegateImpl.this.mo446l();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    abstract class C0116m {

        /* renamed from: a */
        private BroadcastReceiver f350a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m$a */
        class C0117a extends BroadcastReceiver {
            C0117a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0116m.this.mo498d();
            }
        }

        C0116m() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo499a() {
            BroadcastReceiver broadcastReceiver = this.f350a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f294i.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f350a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract IntentFilter mo496b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract int mo497c();

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo498d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo500e() {
            mo499a();
            IntentFilter b = mo496b();
            if (b != null && b.countActions() != 0) {
                if (this.f350a == null) {
                    this.f350a = new C0117a();
                }
                AppCompatDelegateImpl.this.f294i.registerReceiver(this.f350a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    private class C0118n extends C0116m {

        /* renamed from: c */
        private final C0135g f353c;

        C0118n(C0135g gVar) {
            super();
            this.f353c = gVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo496b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo497c() {
            return this.f353c.mo571a() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo498d() {
            AppCompatDelegateImpl.this.mo446l();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    private class C0119o extends ContentFrameLayout {
        public C0119o(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m336a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo421a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m336a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo435e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C7531a.m18133c(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    private final class C0120p implements MenuPresenter.Callback {
        C0120p() {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder m = menuBuilder.mo765m();
            boolean z2 = m != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = m;
            }
            PanelFeatureState a = appCompatDelegateImpl.mo407a((Menu) menuBuilder);
            if (a == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo409a(a.f312a, a, m);
                AppCompatDelegateImpl.this.mo416a(a, true);
                return;
            }
            AppCompatDelegateImpl.this.mo416a(a, z);
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (menuBuilder == null) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f268E) {
                    Window.Callback r = appCompatDelegateImpl.mo456r();
                    if (r != null && !AppCompatDelegateImpl.this.f279P) {
                        r.onMenuOpened(108, menuBuilder);
                    }
                }
            }
            return true;
        }
    }

    static {
        if (f261e0 && !f263g0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0102a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    /* renamed from: A */
    private void m237A() {
        if (!this.f310y) {
            this.f311z = m263z();
            CharSequence q = mo455q();
            if (!TextUtils.isEmpty(q)) {
                DecorContentParent decorContentParent = this.f301p;
                if (decorContentParent != null) {
                    decorContentParent.setWindowTitle(q);
                } else if (mo459u() != null) {
                    mo459u().mo300b(q);
                } else {
                    TextView textView = this.f264A;
                    if (textView != null) {
                        textView.setText(q);
                    }
                }
            }
            m260w();
            mo415a(this.f311z);
            this.f310y = true;
            PanelFeatureState a = mo406a(0, false);
            if (this.f279P) {
                return;
            }
            if (a == null || a.f321j == null) {
                m257k(108);
            }
        }
    }

    /* renamed from: B */
    private void m238B() {
        if (this.f295j == null) {
            Object obj = this.f293h;
            if (obj instanceof Activity) {
                m244a(((Activity) obj).getWindow());
            }
        }
        if (this.f295j == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: C */
    private C0116m m239C() {
        if (this.f285V == null) {
            this.f285V = new C0115l(this.f294i);
        }
        return this.f285V;
    }

    /* renamed from: D */
    private void m240D() {
        m237A();
        if (this.f268E && this.f298m == null) {
            Object obj = this.f293h;
            if (obj instanceof Activity) {
                this.f298m = new C0137h((Activity) obj, this.f269F);
            } else if (obj instanceof Dialog) {
                this.f298m = new C0137h((Dialog) obj);
            }
            ActionBar actionBar = this.f298m;
            if (actionBar != null) {
                actionBar.mo301b(this.f289Z);
            }
        }
    }

    /* renamed from: E */
    private boolean m241E() {
        if (!this.f283T && (this.f293h instanceof Activity)) {
            PackageManager packageManager = this.f294i.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f294i, this.f293h.getClass()), 0);
                this.f282S = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f282S = false;
            }
        }
        this.f283T = true;
        return this.f282S;
    }

    /* renamed from: F */
    private void m242F() {
        if (this.f310y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: G */
    private AppCompatActivity m243G() {
        Context context = this.f294i;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    /* renamed from: k */
    private void m257k(int i) {
        this.f287X = (1 << i) | this.f287X;
        if (!this.f286W) {
            ViewCompat.m2826a(this.f295j.getDecorView(), this.f288Y);
            this.f286W = true;
        }
    }

    /* renamed from: l */
    private int m258l(int i) {
        String str = "AppCompatDelegate";
        if (i == 8) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i == 9) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        return i;
    }

    /* renamed from: w */
    private void m260w() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f311z.findViewById(16908290);
        View decorView = this.f295j.getDecorView();
        contentFrameLayout.mo1443a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f294i.obtainStyledAttributes(C7530j.AppCompatTheme);
        obtainStyledAttributes.getValue(C7530j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C7530j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C7530j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C7530j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C7530j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C7530j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C7530j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C7530j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C7530j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C7530j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: x */
    private int m261x() {
        int i = this.f280Q;
        return i != -100 ? i : C0124b.m369k();
    }

    /* renamed from: y */
    private void m262y() {
        C0116m mVar = this.f284U;
        if (mVar != null) {
            mVar.mo499a();
        }
        C0116m mVar2 = this.f285V;
        if (mVar2 != null) {
            mVar2.mo499a();
        }
    }

    /* renamed from: z */
    private ViewGroup m263z() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f294i.obtainStyledAttributes(C7530j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C7530j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C7530j.AppCompatTheme_windowNoTitle, false)) {
                mo426b(1);
            } else if (obtainStyledAttributes.getBoolean(C7530j.AppCompatTheme_windowActionBar, false)) {
                mo426b(108);
            }
            if (obtainStyledAttributes.getBoolean(C7530j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo426b(109);
            }
            if (obtainStyledAttributes.getBoolean(C7530j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo426b(10);
            }
            this.f271H = obtainStyledAttributes.getBoolean(C7530j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m238B();
            this.f295j.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f294i);
            if (this.f272I) {
                if (this.f270G) {
                    viewGroup = (ViewGroup) from.inflate(C7527g.abc_screen_simple_overlay_action_mode, null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(C7527g.abc_screen_simple, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    ViewCompat.m2823a((View) viewGroup, (OnApplyWindowInsetsListener) new C0104c());
                } else {
                    ((FitWindowsViewGroup) viewGroup).setOnFitSystemWindowsListener(new C0105d());
                }
            } else if (this.f271H) {
                viewGroup = (ViewGroup) from.inflate(C7527g.abc_dialog_title_material, null);
                this.f269F = false;
                this.f268E = false;
            } else if (this.f268E) {
                TypedValue typedValue = new TypedValue();
                this.f294i.getTheme().resolveAttribute(C7521a.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    context = new C0143b(this.f294i, i);
                } else {
                    context = this.f294i;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C7527g.abc_screen_toolbar, null);
                this.f301p = (DecorContentParent) viewGroup.findViewById(C7526f.decor_content_parent);
                this.f301p.setWindowCallback(mo456r());
                if (this.f269F) {
                    this.f301p.initFeature(109);
                }
                if (this.f266C) {
                    this.f301p.initFeature(2);
                }
                if (this.f267D) {
                    this.f301p.initFeature(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f301p == null) {
                    this.f264A = (TextView) viewGroup.findViewById(C7526f.title);
                }
                C0254f0.m993b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C7526f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f295j.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f295j.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0106e());
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f268E);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f269F);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f271H);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f270G);
            sb.append(", windowNoTitle: ");
            sb.append(this.f272I);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: a */
    public void mo410a(Context context) {
        m250a(false);
        this.f277N = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo415a(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public void mo424b(Bundle bundle) {
        m237A();
    }

    /* renamed from: c */
    public MenuInflater mo428c() {
        if (this.f299n == null) {
            m240D();
            ActionBar actionBar = this.f298m;
            this.f299n = new C0147e(actionBar != null ? actionBar.mo305d() : this.f294i);
        }
        return this.f299n;
    }

    /* renamed from: d */
    public ActionBar mo432d() {
        m240D();
        return this.f298m;
    }

    /* renamed from: e */
    public void mo434e() {
        LayoutInflater from = LayoutInflater.from(this.f294i);
        if (from.getFactory() == null) {
            C0642d.m3005b(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: f */
    public void mo436f() {
        ActionBar d = mo432d();
        if (d == null || !d.mo307e()) {
            m257k(0);
        }
    }

    /* renamed from: g */
    public void mo439g() {
        C0124b.m367b((C0124b) this);
        if (this.f286W) {
            this.f295j.getDecorView().removeCallbacks(this.f288Y);
        }
        this.f279P = true;
        ActionBar actionBar = this.f298m;
        if (actionBar != null) {
            actionBar.mo308f();
        }
        m262y();
    }

    /* renamed from: h */
    public void mo440h() {
        ActionBar d = mo432d();
        if (d != null) {
            d.mo306d(true);
        }
    }

    /* renamed from: i */
    public void mo442i() {
        mo446l();
        C0124b.m366a((C0124b) this);
    }

    /* renamed from: j */
    public void mo445j() {
        C0124b.m367b((C0124b) this);
        ActionBar d = mo432d();
        if (d != null) {
            d.mo306d(false);
        }
        if (this.f293h instanceof Dialog) {
            m262y();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo447m() {
        DecorContentParent decorContentParent = this.f301p;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.f306u != null) {
            this.f295j.getDecorView().removeCallbacks(this.f307v);
            if (this.f306u.isShowing()) {
                try {
                    this.f306u.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f306u = null;
        }
        mo448n();
        PanelFeatureState a = mo406a(0, false);
        if (a != null) {
            MenuBuilder menuBuilder = a.f321j;
            if (menuBuilder != null) {
                menuBuilder.close();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo448n() {
        C0661n nVar = this.f308w;
        if (nVar != null) {
            nVar.mo3432a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final Context mo449o() {
        ActionBar d = mo432d();
        Context d2 = d != null ? d.mo305d() : null;
        return d2 == null ? this.f294i : d2;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo404a(view, str, context, attributeSet);
    }

    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        Window.Callback r = mo456r();
        if (r != null && !this.f279P) {
            PanelFeatureState a = mo407a((Menu) menuBuilder.mo765m());
            if (a != null) {
                return r.onMenuItemSelected(a.f312a, menuItem);
            }
        }
        return false;
    }

    public void onMenuModeChange(MenuBuilder menuBuilder) {
        m246a(menuBuilder, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final C0116m mo454p() {
        if (this.f284U == null) {
            this.f284U = new C0118n(C0135g.m425a(this.f294i));
        }
        return this.f284U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final CharSequence mo455q() {
        Object obj = this.f293h;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f300o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final Window.Callback mo456r() {
        return this.f295j.getCallback();
    }

    /* renamed from: s */
    public boolean mo457s() {
        return this.f309x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo458t() {
        ActionMode actionMode = this.f304s;
        if (actionMode != null) {
            actionMode.mo588a();
            return true;
        }
        ActionBar d = mo432d();
        if (d == null || !d.mo302b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final ActionBar mo459u() {
        return this.f298m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final boolean mo460v() {
        if (this.f310y) {
            ViewGroup viewGroup = this.f311z;
            if (viewGroup != null && ViewCompat.m2804D(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    /* renamed from: b */
    public void mo425b(View view, LayoutParams layoutParams) {
        m237A();
        ViewGroup viewGroup = (ViewGroup) this.f311z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f296k.mo659a().onContentChanged();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        this.f308w = null;
        this.f309x = true;
        this.f280Q = -100;
        this.f288Y = new C0103b();
        this.f294i = context;
        this.f297l = appCompatCallback;
        this.f293h = obj;
        if (this.f280Q == -100 && (this.f293h instanceof Dialog)) {
            AppCompatActivity G = m243G();
            if (G != null) {
                this.f280Q = G.getDelegate().mo422b();
            }
        }
        if (this.f280Q == -100) {
            Integer num = (Integer) f260d0.get(this.f293h.getClass());
            if (num != null) {
                this.f280Q = num.intValue();
                f260d0.remove(this.f293h.getClass());
            }
        }
        if (window != null) {
            m244a(window);
        }
        C0250e.m970c();
    }

    /* renamed from: a */
    public void mo412a(Bundle bundle) {
        this.f277N = true;
        m250a(false);
        m238B();
        Object obj = this.f293h;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0524e.m2472b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar u = mo459u();
                if (u == null) {
                    this.f289Z = true;
                } else {
                    u.mo301b(true);
                }
            }
        }
        this.f278O = true;
    }

    /* renamed from: d */
    public void mo433d(int i) {
        this.f281R = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo441h(int i) {
        if (i == 108) {
            ActionBar d = mo432d();
            if (d != null) {
                d.mo296a(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo443i(int i) {
        if (i == 108) {
            ActionBar d = mo432d();
            if (d != null) {
                d.mo296a(false);
            }
        } else if (i == 0) {
            PanelFeatureState a = mo406a(i, true);
            if (a.f326o) {
                mo416a(a, false);
            }
        }
    }

    /* renamed from: l */
    public boolean mo446l() {
        return m250a(true);
    }

    /* renamed from: d */
    private boolean m255d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState a = mo406a(i, true);
            if (!a.f326o) {
                return m253b(a, keyEvent);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo437f(int i) {
        PanelFeatureState a = mo406a(i, true);
        if (a.f321j != null) {
            Bundle bundle = new Bundle();
            a.f321j.mo738b(bundle);
            if (bundle.size() > 0) {
                a.f330s = bundle;
            }
            a.f321j.mo775s();
            a.f321j.clear();
        }
        a.f329r = true;
        a.f328q = true;
        if ((i == 108 || i == 0) && this.f301p != null) {
            PanelFeatureState a2 = mo406a(0, false);
            if (a2 != null) {
                a2.f324m = false;
                m253b(a2, (KeyEvent) null);
            }
        }
    }

    /* renamed from: c */
    public void mo429c(int i) {
        m237A();
        ViewGroup viewGroup = (ViewGroup) this.f311z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f294i).inflate(i, viewGroup);
        this.f296k.mo659a().onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo435e(int i) {
        mo416a(mo406a(i, true), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo444j(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f305t;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f305t.getLayoutParams();
            z = true;
            if (this.f305t.isShown()) {
                if (this.f290a0 == null) {
                    this.f290a0 = new Rect();
                    this.f291b0 = new Rect();
                }
                Rect rect = this.f290a0;
                Rect rect2 = this.f291b0;
                rect.set(0, i, 0, 0);
                C0254f0.m991a(this.f311z, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f265B;
                    if (view == null) {
                        this.f265B = new View(this.f294i);
                        this.f265B.setBackgroundColor(this.f294i.getResources().getColor(C7523c.abc_input_method_navigation_guard));
                        this.f311z.addView(this.f265B, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f265B.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f265B == null) {
                    z = false;
                }
                if (!this.f270G && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f305t.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f265B;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m256e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            androidx.appcompat.view.ActionMode r0 = r3.f304s
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r3.mo406a(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.DecorContentParent r4 = r3.f301p
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.canShowOverflowMenu()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f294i
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.DecorContentParent r4 = r3.f301p
            boolean r4 = r4.isOverflowMenuShowing()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f279P
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m253b(r2, r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.DecorContentParent r4 = r3.f301p
            boolean r4 = r4.showOverflowMenu()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.DecorContentParent r4 = r3.f301p
            boolean r4 = r4.hideOverflowMenu()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f326o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f325n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f324m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f329r
            if (r4 == 0) goto L_0x005b
            r2.f324m = r1
            boolean r4 = r3.m253b(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m245a(r2, r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f326o
            r3.mo416a(r2, r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f294i
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m256e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: b */
    public boolean mo426b(int i) {
        int l = m258l(i);
        if (this.f272I && l == 108) {
            return false;
        }
        if (this.f268E && l == 1) {
            this.f268E = false;
        }
        if (l == 1) {
            m242F();
            this.f272I = true;
            return true;
        } else if (l == 2) {
            m242F();
            this.f266C = true;
            return true;
        } else if (l == 5) {
            m242F();
            this.f267D = true;
            return true;
        } else if (l == 10) {
            m242F();
            this.f270G = true;
            return true;
        } else if (l == 108) {
            m242F();
            this.f268E = true;
            return true;
        } else if (l != 109) {
            return this.f295j.requestFeature(l);
        } else {
            m242F();
            this.f269F = true;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo438g(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m239C().mo497c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f294i.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                i = mo454p().mo497c();
            }
        }
        return i;
    }

    /* renamed from: c */
    public void mo430c(Bundle bundle) {
        if (this.f280Q != -100) {
            f260d0.put(this.f293h.getClass(), Integer.valueOf(this.f280Q));
        }
    }

    /* renamed from: m */
    private void m259m(int i) {
        Resources resources = this.f294i.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, null);
        if (VERSION.SDK_INT < 26) {
            C0127d.m395a(resources);
        }
        int i2 = this.f281R;
        if (i2 != 0) {
            this.f294i.setTheme(i2);
            if (VERSION.SDK_INT >= 23) {
                this.f294i.getTheme().applyStyle(this.f281R, true);
            }
        }
    }

    /* renamed from: a */
    public void mo418a(Toolbar toolbar) {
        if (this.f293h instanceof Activity) {
            ActionBar d = mo432d();
            if (!(d instanceof C0137h)) {
                this.f299n = null;
                if (d != null) {
                    d.mo308f();
                }
                if (toolbar != null) {
                    C0128e eVar = new C0128e(toolbar, mo455q(), this.f296k);
                    this.f298m = eVar;
                    this.f295j.setCallback(eVar.mo565h());
                } else {
                    this.f298m = null;
                    this.f295j.setCallback(this.f296k);
                }
                mo436f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo431c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f276M;
            this.f276M = false;
            PanelFeatureState a = mo406a(0, false);
            if (a != null && a.f326o) {
                if (!z) {
                    mo416a(a, true);
                }
                return true;
            } else if (mo458t()) {
                return true;
            }
        } else if (i == 82) {
            m256e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m254c(PanelFeatureState panelFeatureState) {
        Context context = this.f294i;
        int i = panelFeatureState.f312a;
        if ((i == 0 || i == 108) && this.f301p != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C7521a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C7521a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C7521a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0143b bVar = new C0143b(context, 0);
                bVar.getTheme().setTo(theme2);
                context = bVar;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.mo718a((Callback) this);
        panelFeatureState.mo463a(menuBuilder);
        return true;
    }

    /* renamed from: a */
    public <T extends View> T mo403a(int i) {
        m237A();
        return this.f295j.findViewById(i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0169  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.ActionMode mo423b(androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            r7 = this;
            r7.mo448n()
            androidx.appcompat.view.ActionMode r0 = r7.f304s
            if (r0 == 0) goto L_0x000a
            r0.mo588a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0112j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$j r0 = new androidx.appcompat.app.AppCompatDelegateImpl$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.AppCompatCallback r0 = r7.f297l
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f279P
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.ActionMode r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f304s = r0
            goto L_0x0165
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f305t
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f271H
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f294i
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p214e.p215a.C7521a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f294i
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.b r4 = new androidx.appcompat.view.b
            android.content.Context r6 = r7.f294i
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f294i
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f305t = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p214e.p215a.C7521a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f306u = r5
            android.widget.PopupWindow r5 = r7.f306u
            r6 = 2
            androidx.core.widget.C0679g.m3172a(r5, r6)
            android.widget.PopupWindow r5 = r7.f306u
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f305t
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f306u
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p214e.p215a.C7521a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f305t
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f306u
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = new androidx.appcompat.app.AppCompatDelegateImpl$f
            r0.<init>()
            r7.f307v = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f311z
            int r4 = p214e.p215a.C7526f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.mo449o()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1838a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f305t = r0
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f305t
            if (r0 == 0) goto L_0x0165
            r7.mo448n()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f305t
            r0.mo1118c()
            androidx.appcompat.view.c r0 = new androidx.appcompat.view.c
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f305t
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f305t
            android.widget.PopupWindow r6 = r7.f306u
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo596c()
            boolean r8 = r8.onCreateActionMode(r0, r3)
            if (r8 == 0) goto L_0x0163
            r0.mo600i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            r8.mo1116a(r0)
            r7.f304s = r0
            boolean r8 = r7.mo460v()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012d
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            androidx.core.view.n r8 = androidx.core.view.ViewCompat.m2813a(r8)
            r8.mo3427a(r0)
            r7.f308w = r8
            androidx.core.view.n r8 = r7.f308w
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            r0.<init>()
            r8.mo3430a(r0)
            goto L_0x0153
        L_0x012d:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0153
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305t
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.ViewCompat.m2809I(r8)
        L_0x0153:
            android.widget.PopupWindow r8 = r7.f306u
            if (r8 == 0) goto L_0x0165
            android.view.Window r8 = r7.f295j
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f307v
            r8.post(r0)
            goto L_0x0165
        L_0x0163:
            r7.f304s = r1
        L_0x0165:
            androidx.appcompat.view.ActionMode r8 = r7.f304s
            if (r8 == 0) goto L_0x0170
            androidx.appcompat.app.AppCompatCallback r0 = r7.f297l
            if (r0 == 0) goto L_0x0170
            r0.onSupportActionModeStarted(r8)
        L_0x0170:
            androidx.appcompat.view.ActionMode r8 = r7.f304s
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo423b(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* renamed from: a */
    public void mo411a(Configuration configuration) {
        if (this.f268E && this.f310y) {
            ActionBar d = mo432d();
            if (d != null) {
                d.mo293a(configuration);
            }
        }
        C0250e.m969b().mo1896a(this.f294i);
        m250a(false);
    }

    /* renamed from: a */
    public void mo413a(View view) {
        m237A();
        ViewGroup viewGroup = (ViewGroup) this.f311z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f296k.mo659a().onContentChanged();
    }

    /* renamed from: a */
    public void mo414a(View view, LayoutParams layoutParams) {
        m237A();
        ((ViewGroup) this.f311z.findViewById(16908290)).addView(view, layoutParams);
        this.f296k.mo659a().onContentChanged();
    }

    /* renamed from: a */
    private void m244a(Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.f295j == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0114k)) {
                this.f296k = new C0114k(callback);
                window.setCallback(this.f296k);
                C0291z a = C0291z.m1195a(this.f294i, (AttributeSet) null, f262f0);
                Drawable c = a.mo2108c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.mo2102a();
                this.f295j = window;
                return;
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public final void mo419a(CharSequence charSequence) {
        this.f300o = charSequence;
        DecorContentParent decorContentParent = this.f301p;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (mo459u() != null) {
            mo459u().mo300b(charSequence);
        } else {
            TextView textView = this.f264A;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public ActionMode mo408a(ActionMode.Callback callback) {
        if (callback != null) {
            ActionMode actionMode = this.f304s;
            if (actionMode != null) {
                actionMode.mo588a();
            }
            C0112j jVar = new C0112j(callback);
            ActionBar d = mo432d();
            if (d != null) {
                this.f304s = d.mo291a((ActionMode.Callback) jVar);
                ActionMode actionMode2 = this.f304s;
                if (actionMode2 != null) {
                    AppCompatCallback appCompatCallback = this.f297l;
                    if (appCompatCallback != null) {
                        appCompatCallback.onSupportActionModeStarted(actionMode2);
                    }
                }
            }
            if (this.f304s == null) {
                this.f304s = mo423b((ActionMode.Callback) jVar);
            }
            return this.f304s;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo421a(KeyEvent keyEvent) {
        Object obj = this.f293h;
        boolean z = true;
        if ((obj instanceof Component) || (obj instanceof C0125c)) {
            View decorView = this.f295j.getDecorView();
            if (decorView != null && KeyEventDispatcher.m2792a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f296k.mo659a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo420a(keyCode, keyEvent) : mo431c(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo420a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f276M = z;
        } else if (i == 82) {
            m255d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo404a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f292c0 == null) {
            String string = this.f294i.obtainStyledAttributes(C7530j.AppCompatTheme).getString(C7530j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f292c0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f292c0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    this.f292c0 = new AppCompatViewInflater();
                }
            }
        }
        if (f261e0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m247a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f292c0.createView(view, str, context, attributeSet, z, f261e0, true, C0252e0.m988b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo427b(int i, KeyEvent keyEvent) {
        ActionBar d = mo432d();
        if (d != null && d.mo298a(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f275L;
        if (panelFeatureState == null || !m249a(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f275L == null) {
                PanelFeatureState a = mo406a(0, true);
                m253b(a, keyEvent);
                boolean a2 = m249a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f324m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f275L;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f325n = true;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m252b(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo462a(mo449o());
        panelFeatureState.f318g = new C0119o(panelFeatureState.f323l);
        panelFeatureState.f314c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m253b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.f279P) {
            return false;
        }
        if (panelFeatureState.f324m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f275L;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo416a(panelFeatureState2, false);
        }
        Window.Callback r = mo456r();
        if (r != null) {
            panelFeatureState.f320i = r.onCreatePanelView(panelFeatureState.f312a);
        }
        int i = panelFeatureState.f312a;
        boolean z = i == 0 || i == 108;
        if (z) {
            DecorContentParent decorContentParent = this.f301p;
            if (decorContentParent != null) {
                decorContentParent.setMenuPrepared();
            }
        }
        if (panelFeatureState.f320i == null && (!z || !(mo459u() instanceof C0128e))) {
            if (panelFeatureState.f321j == null || panelFeatureState.f329r) {
                if (panelFeatureState.f321j == null && (!m254c(panelFeatureState) || panelFeatureState.f321j == null)) {
                    return false;
                }
                if (z && this.f301p != null) {
                    if (this.f302q == null) {
                        this.f302q = new C0111i();
                    }
                    this.f301p.setMenu(panelFeatureState.f321j, this.f302q);
                }
                panelFeatureState.f321j.mo775s();
                if (!r.onCreatePanelMenu(panelFeatureState.f312a, panelFeatureState.f321j)) {
                    panelFeatureState.mo463a((MenuBuilder) null);
                    if (z) {
                        DecorContentParent decorContentParent2 = this.f301p;
                        if (decorContentParent2 != null) {
                            decorContentParent2.setMenu(null, this.f302q);
                        }
                    }
                    return false;
                }
                panelFeatureState.f329r = false;
            }
            panelFeatureState.f321j.mo775s();
            Bundle bundle = panelFeatureState.f330s;
            if (bundle != null) {
                panelFeatureState.f321j.mo716a(bundle);
                panelFeatureState.f330s = null;
            }
            if (!r.onPreparePanel(0, panelFeatureState.f320i, panelFeatureState.f321j)) {
                if (z) {
                    DecorContentParent decorContentParent3 = this.f301p;
                    if (decorContentParent3 != null) {
                        decorContentParent3.setMenu(null, this.f302q);
                    }
                }
                panelFeatureState.f321j.mo772r();
                return false;
            }
            panelFeatureState.f327p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f321j.setQwertyMode(panelFeatureState.f327p);
            panelFeatureState.f321j.mo772r();
        }
        panelFeatureState.f324m = true;
        panelFeatureState.f325n = false;
        this.f275L = panelFeatureState;
        return true;
    }

    /* renamed from: a */
    private boolean m247a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f295j.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.m2802B((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private void m245a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        if (!panelFeatureState.f326o && !this.f279P) {
            if (panelFeatureState.f312a == 0) {
                if ((this.f294i.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback r = mo456r();
            if (r == null || r.onMenuOpened(panelFeatureState.f312a, panelFeatureState.f321j)) {
                WindowManager windowManager = (WindowManager) this.f294i.getSystemService("window");
                if (windowManager != null && m253b(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.f318g == null || panelFeatureState.f328q) {
                        ViewGroup viewGroup = panelFeatureState.f318g;
                        if (viewGroup == null) {
                            if (!m252b(panelFeatureState) || panelFeatureState.f318g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f328q && viewGroup.getChildCount() > 0) {
                            panelFeatureState.f318g.removeAllViews();
                        }
                        if (m248a(panelFeatureState) && panelFeatureState.mo464a()) {
                            LayoutParams layoutParams = panelFeatureState.f319h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            panelFeatureState.f318g.setBackgroundResource(panelFeatureState.f313b);
                            ViewParent parent = panelFeatureState.f319h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f319h);
                            }
                            panelFeatureState.f318g.addView(panelFeatureState.f319h, layoutParams);
                            if (!panelFeatureState.f319h.hasFocus()) {
                                panelFeatureState.f319h.requestFocus();
                            }
                        }
                    } else {
                        View view = panelFeatureState.f320i;
                        if (view != null) {
                            LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                i = -1;
                                panelFeatureState.f325n = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f315d, panelFeatureState.f316e, 1002, 8519680, -3);
                                layoutParams3.gravity = panelFeatureState.f314c;
                                layoutParams3.windowAnimations = panelFeatureState.f317f;
                                windowManager.addView(panelFeatureState.f318g, layoutParams3);
                                panelFeatureState.f326o = true;
                            }
                        }
                    }
                    i = -2;
                    panelFeatureState.f325n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f315d, panelFeatureState.f316e, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f314c;
                    layoutParams32.windowAnimations = panelFeatureState.f317f;
                    windowManager.addView(panelFeatureState.f318g, layoutParams32);
                    panelFeatureState.f326o = true;
                }
            } else {
                mo416a(panelFeatureState, true);
            }
        }
    }

    /* renamed from: a */
    private void m246a(MenuBuilder menuBuilder, boolean z) {
        DecorContentParent decorContentParent = this.f301p;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.f294i).hasPermanentMenuKey() && !this.f301p.isOverflowMenuShowPending())) {
            PanelFeatureState a = mo406a(0, true);
            a.f328q = true;
            mo416a(a, false);
            m245a(a, (KeyEvent) null);
            return;
        }
        Window.Callback r = mo456r();
        if (this.f301p.isOverflowMenuShowing() && z) {
            this.f301p.hideOverflowMenu();
            if (!this.f279P) {
                r.onPanelClosed(108, mo406a(0, true).f321j);
            }
        } else if (r != null && !this.f279P) {
            if (this.f286W && (this.f287X & 1) != 0) {
                this.f295j.getDecorView().removeCallbacks(this.f288Y);
                this.f288Y.run();
            }
            PanelFeatureState a2 = mo406a(0, true);
            MenuBuilder menuBuilder2 = a2.f321j;
            if (menuBuilder2 != null && !a2.f329r && r.onPreparePanel(0, a2.f320i, menuBuilder2)) {
                r.onMenuOpened(108, a2.f321j);
                this.f301p.showOverflowMenu();
            }
        }
    }

    /* renamed from: b */
    public int mo422b() {
        return this.f280Q;
    }

    /* renamed from: b */
    private boolean m251b(int i, boolean z) {
        int i2 = this.f294i.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean E = m241E();
        boolean z2 = false;
        if (i3 != i2 && !E && VERSION.SDK_INT >= 17 && !this.f277N && (this.f293h instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i3;
            try {
                ((ContextThemeWrapper) this.f293h).applyOverrideConfiguration(configuration);
                z2 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        if (!z2 && !E && (this.f294i.getResources().getConfiguration().uiMode & 48) != i3) {
            if (z && this.f277N && (VERSION.SDK_INT >= 17 || this.f278O)) {
                Object obj = this.f293h;
                if (obj instanceof Activity) {
                    ActivityCompat.m2356e((Activity) obj);
                    z2 = true;
                }
            }
            if (!z2) {
                m259m(i3);
                z2 = true;
            }
        }
        if (z2 || E) {
            Object obj2 = this.f293h;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).onNightModeChanged(i);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m248a(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f320i;
        boolean z = true;
        if (view != null) {
            panelFeatureState.f319h = view;
            return true;
        } else if (panelFeatureState.f321j == null) {
            return false;
        } else {
            if (this.f303r == null) {
                this.f303r = new C0120p();
            }
            panelFeatureState.f319h = (View) panelFeatureState.mo461a((MenuPresenter.Callback) this.f303r);
            if (panelFeatureState.f319h == null) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo417a(MenuBuilder menuBuilder) {
        if (!this.f273J) {
            this.f273J = true;
            this.f301p.dismissPopups();
            Window.Callback r = mo456r();
            if (r != null && !this.f279P) {
                r.onPanelClosed(108, menuBuilder);
            }
            this.f273J = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo416a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.f312a == 0) {
            DecorContentParent decorContentParent = this.f301p;
            if (decorContentParent != null && decorContentParent.isOverflowMenuShowing()) {
                mo417a(panelFeatureState.f321j);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f294i.getSystemService("window");
        if (windowManager != null && panelFeatureState.f326o) {
            ViewGroup viewGroup = panelFeatureState.f318g;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo409a(panelFeatureState.f312a, panelFeatureState, null);
                }
            }
        }
        panelFeatureState.f324m = false;
        panelFeatureState.f325n = false;
        panelFeatureState.f326o = false;
        panelFeatureState.f319h = null;
        panelFeatureState.f328q = true;
        if (this.f275L == panelFeatureState) {
            this.f275L = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo409a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f274K;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f321j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f326o) && !this.f279P) {
            this.f296k.mo659a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PanelFeatureState mo407a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f274K;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f321j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PanelFeatureState mo406a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f274K;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f274K = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: a */
    private boolean m249a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (panelFeatureState.f324m || m253b(panelFeatureState, keyEvent)) {
            MenuBuilder menuBuilder = panelFeatureState.f321j;
            if (menuBuilder != null) {
                z = menuBuilder.performShortcut(i, keyEvent, i2);
            }
        }
        if (z && (i2 & 1) == 0 && this.f301p == null) {
            mo416a(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m250a(boolean z) {
        if (this.f279P) {
            return false;
        }
        int x = m261x();
        boolean b = m251b(mo438g(x), z);
        if (x == 0) {
            mo454p().mo500e();
        } else {
            C0116m mVar = this.f284U;
            if (mVar != null) {
                mVar.mo499a();
            }
        }
        if (x == 3) {
            m239C().mo500e();
        } else {
            C0116m mVar2 = this.f285V;
            if (mVar2 != null) {
                mVar2.mo499a();
            }
        }
        return b;
    }

    /* renamed from: a */
    public final ActionBarDrawerToggle$Delegate mo405a() {
        return new C0110h();
    }
}
