package androidx.emoji.widget;

import android.os.Build.VERSION;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C0607i;

/* renamed from: androidx.emoji.widget.b */
public final class C0761b {

    /* renamed from: a */
    private final C0763b f3115a;

    /* renamed from: b */
    private int f3116b = Integer.MAX_VALUE;

    /* renamed from: c */
    private int f3117c = 0;

    /* renamed from: androidx.emoji.widget.b$a */
    private static class C0762a extends C0763b {

        /* renamed from: a */
        private final EditText f3118a;

        /* renamed from: b */
        private final C0768g f3119b = new C0768g(this.f3118a);

        C0762a(EditText editText) {
            this.f3118a = editText;
            this.f3118a.addTextChangedListener(this.f3119b);
            this.f3118a.setEditableFactory(C0764c.getInstance());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3774a(int i) {
            this.f3119b.mo3784a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3775b(int i) {
            this.f3119b.mo3786b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public KeyListener mo3772a(KeyListener keyListener) {
            if (keyListener instanceof C0767f) {
                return keyListener;
            }
            return new C0767f(keyListener);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public InputConnection mo3773a(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C0765d) {
                return inputConnection;
            }
            return new C0765d(this.f3118a, inputConnection, editorInfo);
        }
    }

    /* renamed from: androidx.emoji.widget.b$b */
    static class C0763b {
        C0763b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public KeyListener mo3772a(KeyListener keyListener) {
            return keyListener;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public InputConnection mo3773a(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3774a(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3775b(int i) {
        }
    }

    public C0761b(EditText editText) {
        C0607i.m2774a(editText, (Object) "editText cannot be null");
        this.f3115a = VERSION.SDK_INT >= 19 ? new C0762a(editText) : new C0763b();
    }

    /* renamed from: a */
    public KeyListener mo3767a(KeyListener keyListener) {
        C0607i.m2774a(keyListener, (Object) "keyListener cannot be null");
        return this.f3115a.mo3772a(keyListener);
    }

    /* renamed from: b */
    public void mo3771b(int i) {
        C0607i.m2772a(i, "maxEmojiCount should be greater than 0");
        this.f3116b = i;
        this.f3115a.mo3775b(i);
    }

    /* renamed from: a */
    public InputConnection mo3768a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f3115a.mo3773a(inputConnection, editorInfo);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3769a(int i) {
        this.f3117c = i;
        this.f3115a.mo3774a(i);
    }

    /* renamed from: b */
    public int mo3770b() {
        return this.f3116b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3766a() {
        return this.f3117c;
    }
}
