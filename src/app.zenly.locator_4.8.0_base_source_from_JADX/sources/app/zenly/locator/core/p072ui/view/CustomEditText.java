package app.zenly.locator.core.p072ui.view;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: app.zenly.locator.core.ui.view.CustomEditText */
public class CustomEditText extends AppCompatEditText {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f8616h = true;

    /* renamed from: i */
    private int f8617i;

    /* renamed from: j */
    private int f8618j = 0;

    /* renamed from: k */
    private OnDelPressedListener f8619k;

    /* renamed from: app.zenly.locator.core.ui.view.CustomEditText$OnDelPressedListener */
    public interface OnDelPressedListener {
        void onDelPressed();
    }

    /* renamed from: app.zenly.locator.core.ui.view.CustomEditText$a */
    private class C3120a extends InputConnectionWrapper {
        public C3120a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        public boolean deleteSurroundingText(int i, int i2) {
            if (!CustomEditText.this.f8616h) {
                return true;
            }
            return super.deleteSurroundingText(i, i2);
        }

        public boolean performEditorAction(int i) {
            if (!CustomEditText.this.f8616h) {
                return true;
            }
            return super.performEditorAction(i);
        }

        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (!CustomEditText.this.f8616h) {
                return true;
            }
            return super.sendKeyEvent(keyEvent);
        }
    }

    public CustomEditText(Context context) {
        super(context);
    }

    public int getMaxLength() {
        return this.f8617i;
    }

    public int getMinValidLength() {
        return this.f8618j;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C3120a(super.onCreateInputConnection(editorInfo), true);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67 && getText().length() == 0) {
            OnDelPressedListener onDelPressedListener = this.f8619k;
            if (onDelPressedListener != null) {
                onDelPressedListener.onDelPressed();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setCustomEnabled(boolean z) {
        setCursorVisible(z);
        this.f8616h = z;
    }

    public void setMaxLength(int i) {
        this.f8617i = i;
        setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void setMinValidLength(int i) {
        this.f8618j = i;
    }

    public void setOnDelPressedListener(OnDelPressedListener onDelPressedListener) {
        this.f8619k = onDelPressedListener;
    }

    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
