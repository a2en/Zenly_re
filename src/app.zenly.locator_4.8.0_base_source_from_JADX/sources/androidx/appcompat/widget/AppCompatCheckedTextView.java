package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.C0680h;
import p214e.p215a.p216k.p217a.C7531a;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: f */
    private static final int[] f854f = {16843016};

    /* renamed from: e */
    private final C0259k f855e;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0259k kVar = this.f855e;
        if (kVar != null) {
            kVar.mo1921a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0253f.m990a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C7531a.m18133c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0259k kVar = this.f855e;
        if (kVar != null) {
            kVar.mo1925a(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        this.f855e = new C0259k(this);
        this.f855e.mo1928a(attributeSet, i);
        this.f855e.mo1921a();
        C0291z a = C0291z.m1196a(getContext(), attributeSet, f854f, i, 0);
        setCheckMarkDrawable(a.mo2106b(0));
        a.mo2102a();
    }
}
