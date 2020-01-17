package androidx.emoji.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p214e.p240i.C7633a;

/* renamed from: androidx.emoji.widget.a */
public class C0760a {

    /* renamed from: a */
    private int f3114a;

    public C0760a(View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C7633a.EmojiEditText, i, i2);
            this.f3114a = obtainStyledAttributes.getInteger(C7633a.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public int mo3765a() {
        return this.f3114a;
    }
}
