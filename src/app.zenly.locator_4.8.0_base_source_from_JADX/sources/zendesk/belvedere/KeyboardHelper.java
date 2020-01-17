package zendesk.belvedere;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public class KeyboardHelper extends FrameLayout {

    /* renamed from: e */
    private final int f34951e = getStatusBarHeight();

    /* renamed from: f */
    private int f34952f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f34953g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f34954h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<WeakReference<Listener>> f34955i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C13479c f34956j;

    /* renamed from: k */
    private EditText f34957k;

    public interface Listener {
        void onKeyboardDismissed();

        void onKeyboardVisible();
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$a */
    static class C13477a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ EditText f34958e;

        C13477a(EditText editText) {
            this.f34958e = editText;
        }

        public void run() {
            if (this.f34958e.requestFocus()) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f34958e.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(this.f34958e, 1);
                }
            }
        }
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$b */
    private class C13478b implements OnGlobalLayoutListener {

        /* renamed from: e */
        private final Activity f34959e;

        /* synthetic */ C13478b(KeyboardHelper keyboardHelper, Activity activity, C13477a aVar) {
            this(activity);
        }

        public void onGlobalLayout() {
            int a = KeyboardHelper.this.m35676a(this.f34959e);
            KeyboardHelper.this.f34954h = a > 0;
            if (a > 0 && KeyboardHelper.this.f34953g != a) {
                KeyboardHelper.this.f34953g = a;
                if (KeyboardHelper.this.f34956j != null) {
                    KeyboardHelper.this.f34956j.mo38820a(a);
                }
            }
            if (KeyboardHelper.this.f34955i == null || a <= 0) {
                KeyboardHelper.this.m35680a();
            } else {
                KeyboardHelper.this.m35684b();
            }
        }

        private C13478b(Activity activity) {
            this.f34959e = activity;
        }
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$c */
    interface C13479c {
        /* renamed from: a */
        void mo38820a(int i);
    }

    private KeyboardHelper(Activity activity) {
        super(activity);
        setLayoutParams(new LayoutParams(0, 0));
        this.f34957k = new EditText(activity);
        this.f34957k.setFocusable(true);
        this.f34957k.setFocusableInTouchMode(true);
        this.f34957k.setVisibility(0);
        this.f34957k.setImeOptions(268435456);
        this.f34957k.setInputType(16384);
        addView(this.f34957k);
        activity.getWindow().getDecorView().findViewById(16908290).getViewTreeObserver().addOnGlobalLayoutListener(new C13478b(this, activity, null));
    }

    private int getCachedInset() {
        if (this.f34952f == -1) {
            this.f34952f = getViewInset();
        }
        return this.f34952f;
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private int getViewInset() {
        if (VERSION.SDK_INT >= 21) {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj != null) {
                    Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
                    declaredField2.setAccessible(true);
                    return ((Rect) declaredField2.get(obj)).bottom;
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    private int getViewPortHeight() {
        return (getRootView().getHeight() - this.f34951e) - getCachedInset();
    }

    public EditText getInputTrap() {
        return this.f34957k;
    }

    public int getKeyboardHeight() {
        return this.f34953g;
    }

    /* access modifiers changed from: 0000 */
    public void setKeyboardHeightListener(C13479c cVar) {
        this.f34956j = cVar;
    }

    /* renamed from: b */
    static void m35685b(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: c */
    public static KeyboardHelper m35687c(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof KeyboardHelper) {
                return (KeyboardHelper) viewGroup.getChildAt(i);
            }
        }
        KeyboardHelper keyboardHelper = new KeyboardHelper(activity);
        viewGroup.addView(keyboardHelper);
        return keyboardHelper;
    }

    /* renamed from: a */
    static void m35681a(EditText editText) {
        editText.post(new C13477a(editText));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m35684b() {
        for (WeakReference weakReference : this.f34955i) {
            if (weakReference.get() != null) {
                ((Listener) weakReference.get()).onKeyboardVisible();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m35676a(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return getViewPortHeight() - (rect.bottom - rect.top);
    }

    /* renamed from: a */
    public void mo38812a(Listener listener) {
        this.f34955i.add(new WeakReference(listener));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35680a() {
        for (WeakReference weakReference : this.f34955i) {
            if (weakReference.get() != null) {
                ((Listener) weakReference.get()).onKeyboardDismissed();
            }
        }
    }
}
