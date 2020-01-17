package app.zenly.android.feature.polenta.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.base.widget.p007c.p008a.C1319a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p279d.C7765a;
import p250f.p251a.p252a.p263b.p279d.C7768d;
import p250f.p251a.p252a.p263b.p279d.C7769e;
import p250f.p251a.p252a.p263b.p279d.C7771g;

@SuppressLint({"CustomViewStyleable"})
public final class SearchBar extends MotionLayout {
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public boolean f5239t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public List<TextWatcher> f5240u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public List<OnFocusChangeListener> f5241v0;

    /* renamed from: w0 */
    private OnCloseListener f5242w0;

    /* renamed from: x0 */
    private Function1<? super String, C12956q> f5243x0;

    /* renamed from: y0 */
    private final C1444h f5244y0;

    /* renamed from: z0 */
    private HashMap f5245z0;

    public interface OnCloseListener {
        void onClose();
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$a */
    public static final class C1437a extends C1319a {

        /* renamed from: a */
        final /* synthetic */ SearchBar f5246a;

        C1437a(SearchBar searchBar) {
            this.f5246a = searchBar;
        }

        public void onTransitionCompleted(MotionLayout motionLayout, int i) {
            C12932j.m33818b(motionLayout, "motionLayout");
            String str = "view_input";
            if (i == C7768d.unfocus) {
                EditText editText = (EditText) this.f5246a.mo6903d(C7768d.view_input);
                C12932j.m33815a((Object) editText, str);
                C1297b.m6240a(editText, false, 2, null);
            } else if (i == C7768d.focus_with_content || i == C7768d.focus) {
                ((EditText) this.f5246a.mo6903d(C7768d.view_input)).requestFocus();
                EditText editText2 = (EditText) this.f5246a.mo6903d(C7768d.view_input);
                C12932j.m33815a((Object) editText2, str);
                C1297b.m6241b(editText2);
            }
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$b */
    static final class C1438b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ SearchBar f5247e;

        C1438b(SearchBar searchBar) {
            this.f5247e = searchBar;
        }

        public final void onClick(View view) {
            EditText editText = (EditText) this.f5247e.mo6903d(C7768d.view_input);
            C12932j.m33815a((Object) editText, "view_input");
            editText.setText(null);
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$c */
    static final class C1439c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ SearchBar f5248e;

        C1439c(SearchBar searchBar) {
            this.f5248e = searchBar;
        }

        public final void onClick(View view) {
            Button button = (Button) this.f5248e.mo6903d(C7768d.btn_cancel);
            C12932j.m33815a((Object) button, "btn_cancel");
            if (button.getVisibility() == 4) {
                this.f5248e.performClick();
                return;
            }
            this.f5248e.m6535d();
            OnCloseListener closeListener = this.f5248e.getCloseListener();
            if (closeListener != null) {
                closeListener.onClose();
            }
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$d */
    static final class C1440d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ SearchBar f5249e;

        C1440d(SearchBar searchBar) {
            this.f5249e = searchBar;
        }

        public final void run() {
            Button button = (Button) this.f5249e.mo6903d(C7768d.btn_cancel);
            C12932j.m33815a((Object) button, "btn_cancel");
            LayoutParams layoutParams = button.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Rect rect = new Rect();
                ((Button) this.f5249e.mo6903d(C7768d.btn_cancel)).getHitRect(rect);
                rect.top -= marginLayoutParams.topMargin;
                rect.bottom += marginLayoutParams.bottomMargin;
                rect.left -= marginLayoutParams.leftMargin;
                rect.right += marginLayoutParams.rightMargin;
                SearchBar searchBar = this.f5249e;
                searchBar.setTouchDelegate(new TouchDelegate(rect, (Button) searchBar.mo6903d(C7768d.btn_cancel)));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$e */
    static final class C1441e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ SearchBar f5250e;

        C1441e(SearchBar searchBar) {
            this.f5250e = searchBar;
        }

        public final void onClick(View view) {
            int i;
            SearchBar searchBar = this.f5250e;
            EditText editText = (EditText) searchBar.mo6903d(C7768d.view_input);
            C12932j.m33815a((Object) editText, "view_input");
            Editable text = editText.getText();
            C12932j.m33815a((Object) text, "view_input.text");
            if (text.length() == 0) {
                i = C7768d.state_focus;
            } else {
                i = C7768d.state_focus_with_content;
            }
            searchBar.mo2261c(i);
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$f */
    static final class C1442f implements OnKeyListener {

        /* renamed from: e */
        final /* synthetic */ SearchBar f5251e;

        C1442f(SearchBar searchBar) {
            this.f5251e = searchBar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            C12932j.m33815a((Object) keyEvent, "event");
            if (keyEvent.getAction() == 0 && i == 66) {
                Function1 submitListener = this.f5251e.getSubmitListener();
                if (submitListener != null) {
                    EditText editText = (EditText) this.f5251e.mo6903d(C7768d.view_input);
                    C12932j.m33815a((Object) editText, "view_input");
                    Editable text = editText.getText();
                    C12932j.m33815a((Object) text, "view_input.text");
                    C12956q qVar = (C12956q) submitListener.invoke(C13029r.m34033f(text).toString());
                }
            }
            if (keyEvent.getAction() != 1 || i != 4) {
                return false;
            }
            this.f5251e.m6535d();
            return true;
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$g */
    static final class C1443g implements OnFocusChangeListener {

        /* renamed from: e */
        final /* synthetic */ SearchBar f5252e;

        C1443g(SearchBar searchBar) {
            this.f5252e = searchBar;
        }

        public final void onFocusChange(View view, boolean z) {
            for (OnFocusChangeListener onFocusChange : this.f5252e.f5241v0) {
                onFocusChange.onFocusChange(view, z);
            }
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SearchBar$h */
    public static final class C1444h implements TextWatcher {

        /* renamed from: e */
        final /* synthetic */ SearchBar f5253e;

        C1444h(SearchBar searchBar) {
            this.f5253e = searchBar;
        }

        public void afterTextChanged(Editable editable) {
            C12932j.m33818b(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            for (TextWatcher onTextChanged : this.f5253e.f5240u0) {
                onTextChanged.onTextChanged(charSequence, i, i2, i3);
            }
            if (!this.f5253e.f5239t0) {
                this.f5253e.mo2261c(charSequence.length() == 0 ? C7768d.state_focus : C7768d.state_focus_with_content);
            }
        }
    }

    public SearchBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SearchBar(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = C7765a.searchBarStyle;
        }
        this(context, attributeSet, i);
    }

    public void clearFocus() {
        m6535d();
        super.clearFocus();
    }

    /* renamed from: d */
    public View mo6903d(int i) {
        if (this.f5245z0 == null) {
            this.f5245z0 = new HashMap();
        }
        View view = (View) this.f5245z0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f5245z0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final CharSequence getCancelText() {
        Button button = (Button) mo6903d(C7768d.btn_cancel);
        C12932j.m33815a((Object) button, "btn_cancel");
        return button.getText();
    }

    public final OnCloseListener getCloseListener() {
        return this.f5242w0;
    }

    public final CharSequence getHint() {
        TextView textView = (TextView) mo6903d(C7768d.view_hint);
        C12932j.m33815a((Object) textView, "view_hint");
        return textView.getText();
    }

    public final int getImeOptions() {
        TextView textView = (TextView) mo6903d(C7768d.view_hint);
        C12932j.m33815a((Object) textView, "view_hint");
        return textView.getImeOptions();
    }

    public final int getInputType() {
        TextView textView = (TextView) mo6903d(C7768d.view_hint);
        C12932j.m33815a((Object) textView, "view_hint");
        return textView.getInputType();
    }

    public final Function1<String, C12956q> getSubmitListener() {
        return this.f5243x0;
    }

    public final CharSequence getText() {
        EditText editText = (EditText) mo6903d(C7768d.view_input);
        C12932j.m33815a((Object) editText, "view_input");
        return editText.getText();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setTransitionListener(new C1437a(this));
        ((ImageView) mo6903d(C7768d.btn_clear)).setOnClickListener(new C1438b(this));
        ((Button) mo6903d(C7768d.btn_cancel)).setOnClickListener(new C1439c(this));
        post(new C1440d(this));
        setOnClickListener(new C1441e(this));
        ((EditText) mo6903d(C7768d.view_input)).addTextChangedListener(this.f5244y0);
        ((EditText) mo6903d(C7768d.view_input)).setOnKeyListener(new C1442f(this));
        ((EditText) mo6903d(C7768d.view_input)).setOnFocusChangeListener(new C1443g(this));
    }

    public final void setCancelText(CharSequence charSequence) {
        Button button = (Button) mo6903d(C7768d.btn_cancel);
        C12932j.m33815a((Object) button, "btn_cancel");
        button.setText(charSequence);
    }

    public final void setCloseListener(OnCloseListener onCloseListener) {
        this.f5242w0 = onCloseListener;
    }

    public final void setHint(CharSequence charSequence) {
        TextView textView = (TextView) mo6903d(C7768d.view_hint);
        C12932j.m33815a((Object) textView, "view_hint");
        textView.setText(charSequence);
    }

    public final void setImeOptions(int i) {
        TextView textView = (TextView) mo6903d(C7768d.view_hint);
        C12932j.m33815a((Object) textView, "view_hint");
        textView.setImeOptions(i);
    }

    public final void setInputType(int i) {
        TextView textView = (TextView) mo6903d(C7768d.view_hint);
        C12932j.m33815a((Object) textView, "view_hint");
        textView.setInputType(i);
    }

    public final void setSubmitListener(Function1<? super String, C12956q> function1) {
        this.f5243x0 = function1;
    }

    public final void setText(CharSequence charSequence) {
        ((EditText) mo6903d(C7768d.view_input)).setText(charSequence);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f5240u0 = new ArrayList();
        this.f5241v0 = new ArrayList();
        LayoutInflater.from(context).inflate(C7769e.view_search_bar, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7771g.SearchBar, i, 0);
        setCancelText((CharSequence) obtainStyledAttributes.getString(C7771g.SearchBar_cancelText));
        setHint(obtainStyledAttributes.getString(C7771g.SearchBar_hint));
        int i2 = obtainStyledAttributes.getInt(C7771g.SearchBar_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = obtainStyledAttributes.getInt(C7771g.SearchBar_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        obtainStyledAttributes.recycle();
        this.f5244y0 = new C1444h(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m6535d() {
        this.f5239t0 = true;
        EditText editText = (EditText) mo6903d(C7768d.view_input);
        C12932j.m33815a((Object) editText, "view_input");
        editText.setText(null);
        this.f5239t0 = false;
        ((EditText) mo6903d(C7768d.view_input)).clearFocus();
        mo2261c(C7768d.state_unfocus);
    }

    /* renamed from: a */
    public final void mo6899a(OnFocusChangeListener onFocusChangeListener) {
        C12932j.m33818b(onFocusChangeListener, "onFocusChangeListener");
        if (!this.f5241v0.contains(onFocusChangeListener)) {
            this.f5241v0.add(onFocusChangeListener);
        }
    }

    /* renamed from: b */
    public final void mo6901b(OnFocusChangeListener onFocusChangeListener) {
        C12932j.m33818b(onFocusChangeListener, "onFocusChangeListener");
        this.f5241v0.remove(onFocusChangeListener);
    }

    public final void setCancelText(int i) {
        setCancelText((CharSequence) C7674a.m18692a(i) ? getContext().getString(i) : null);
    }

    /* renamed from: b */
    public final void mo6900b(TextWatcher textWatcher) {
        C12932j.m33818b(textWatcher, "textWatcher");
        this.f5240u0.remove(textWatcher);
    }

    /* renamed from: a */
    public final void mo6898a(TextWatcher textWatcher) {
        C12932j.m33818b(textWatcher, "textWatcher");
        if (!this.f5240u0.contains(textWatcher)) {
            this.f5240u0.add(textWatcher);
        }
    }
}
