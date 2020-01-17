package androidx.emoji.widget;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji.text.EmojiCompat;

/* renamed from: androidx.emoji.widget.d */
final class C0765d extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f3123a;

    C0765d(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f3123a = textView;
        EmojiCompat.m3433e().mo3689a(editorInfo);
    }

    /* renamed from: a */
    private Editable m3547a() {
        return this.f3123a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (EmojiCompat.m3432a((InputConnection) this, m3547a(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (EmojiCompat.m3432a((InputConnection) this, m3547a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
