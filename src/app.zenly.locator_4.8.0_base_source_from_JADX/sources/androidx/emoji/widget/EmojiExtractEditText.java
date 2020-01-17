package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.widget.C0680h;

public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: e */
    private C0761b f3112e;

    /* renamed from: f */
    private boolean f3113f;

    public EmojiExtractEditText(Context context) {
        super(context);
        m3531a(null, 0, 0);
    }

    /* renamed from: a */
    private void m3531a(AttributeSet attributeSet, int i, int i2) {
        if (!this.f3113f) {
            this.f3113f = true;
            setMaxEmojiCount(new C0760a(this, attributeSet, i, i2).mo3765a());
            setKeyListener(super.getKeyListener());
        }
    }

    private C0761b getEmojiEditTextHelper() {
        if (this.f3112e == null) {
            this.f3112e = new C0761b(this);
        }
        return this.f3112e;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().mo3766a();
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().mo3770b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().mo3768a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public void setEmojiReplaceStrategy(int i) {
        getEmojiEditTextHelper().mo3769a(i);
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().mo3767a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        getEmojiEditTextHelper().mo3771b(i);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3531a(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3531a(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m3531a(attributeSet, i, i2);
    }
}
