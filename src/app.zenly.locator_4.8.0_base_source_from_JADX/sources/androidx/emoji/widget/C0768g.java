package androidx.emoji.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.EmojiCompat.C0736d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: androidx.emoji.widget.g */
final class C0768g implements TextWatcher {

    /* renamed from: e */
    private final EditText f3125e;

    /* renamed from: f */
    private C0736d f3126f;

    /* renamed from: g */
    private int f3127g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f3128h = 0;

    /* renamed from: androidx.emoji.widget.g$a */
    private static class C0769a extends C0736d {

        /* renamed from: a */
        private final Reference<EditText> f3129a;

        C0769a(EditText editText) {
            this.f3129a = new WeakReference(editText);
        }

        /* renamed from: a */
        public void mo3706a() {
            super.mo3706a();
            EditText editText = (EditText) this.f3129a.get();
            if (editText != null && editText.isAttachedToWindow()) {
                Editable editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                EmojiCompat.m3433e().mo3694b(editableText);
                C0766e.m3548a(editableText, selectionStart, selectionEnd);
            }
        }
    }

    C0768g(EditText editText) {
        this.f3125e = editText;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3784a(int i) {
        this.f3128h = i;
    }

    public void afterTextChanged(Editable editable) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3786b(int i) {
        this.f3127g = i;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r9 != 3) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            android.widget.EditText r0 = r6.f3125e
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            if (r9 > r10) goto L_0x003d
            boolean r9 = r7 instanceof android.text.Spannable
            if (r9 == 0) goto L_0x003d
            androidx.emoji.text.EmojiCompat r9 = androidx.emoji.text.EmojiCompat.m3433e()
            int r9 = r9.mo3693b()
            if (r9 == 0) goto L_0x0032
            r0 = 1
            if (r9 == r0) goto L_0x0020
            r7 = 3
            if (r9 == r7) goto L_0x0032
            goto L_0x003d
        L_0x0020:
            r1 = r7
            android.text.Spannable r1 = (android.text.Spannable) r1
            androidx.emoji.text.EmojiCompat r0 = androidx.emoji.text.EmojiCompat.m3433e()
            int r3 = r8 + r10
            int r4 = r6.f3127g
            int r5 = r6.f3128h
            r2 = r8
            r0.mo3688a(r1, r2, r3, r4, r5)
            goto L_0x003d
        L_0x0032:
            androidx.emoji.text.EmojiCompat r7 = androidx.emoji.text.EmojiCompat.m3433e()
            androidx.emoji.text.EmojiCompat$d r8 = r6.m3549a()
            r7.mo3690a(r8)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.widget.C0768g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    /* renamed from: a */
    private C0736d m3549a() {
        if (this.f3126f == null) {
            this.f3126f = new C0769a(this.f3125e);
        }
        return this.f3126f;
    }
}
