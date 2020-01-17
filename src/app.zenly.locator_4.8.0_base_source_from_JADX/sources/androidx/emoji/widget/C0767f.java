package androidx.emoji.widget;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji.text.EmojiCompat;

/* renamed from: androidx.emoji.widget.f */
final class C0767f implements KeyListener {

    /* renamed from: e */
    private final KeyListener f3124e;

    C0767f(KeyListener keyListener) {
        this.f3124e = keyListener;
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f3124e.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f3124e.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return EmojiCompat.m3431a(editable, i, keyEvent) || this.f3124e.onKeyDown(view, editable, i, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3124e.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f3124e.onKeyUp(view, editable, i, keyEvent);
    }
}
