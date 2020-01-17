package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: j */
    private static final StackTraceElement[] f23225j = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    private final List<Throwable> f23226e;

    /* renamed from: f */
    private Key f23227f;

    /* renamed from: g */
    private C8882a f23228g;

    /* renamed from: h */
    private Class<?> f23229h;

    /* renamed from: i */
    private String f23230i;

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C8911a implements Appendable {

        /* renamed from: e */
        private final Appendable f23231e;

        /* renamed from: f */
        private boolean f23232f = true;

        C8911a(Appendable appendable) {
            this.f23231e = appendable;
        }

        /* renamed from: a */
        private CharSequence m21398a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f23232f) {
                this.f23232f = false;
                this.f23231e.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f23232f = z;
            this.f23231e.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m21398a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m21398a(charSequence);
            boolean z = false;
            if (this.f23232f) {
                this.f23232f = false;
                this.f23231e.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f23232f = z;
            this.f23231e.append(a, i, i2);
            return this;
        }
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24280a(Key key, C8882a aVar) {
        mo24281a(key, aVar, null);
    }

    /* renamed from: a */
    public void mo24282a(Exception exc) {
    }

    /* renamed from: b */
    public List<Throwable> mo24284b() {
        ArrayList arrayList = new ArrayList();
        m21389a((Throwable) this, (List<Throwable>) arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f23230i);
        String str3 = ", ";
        String str4 = "";
        if (this.f23229h != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f23229h);
            str = sb2.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f23228g != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(this.f23228g);
            str2 = sb3.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f23227f != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.f23227f);
            str4 = sb4.toString();
        }
        sb.append(str4);
        List<Throwable> b = mo24284b();
        if (b.isEmpty()) {
            return sb.toString();
        }
        if (b.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(b.size());
            sb.append(" causes:");
        }
        for (Throwable th : b) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24281a(Key key, C8882a aVar, Class<?> cls) {
        this.f23227f = key;
        this.f23228g = aVar;
        this.f23229h = cls;
    }

    public void printStackTrace(PrintStream printStream) {
        m21387a((Appendable) printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f23230i = str;
        setStackTrace(f23225j);
        this.f23226e = list;
    }

    /* renamed from: b */
    private static void m21391b(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m21387a(appendable);
            } else {
                m21388a(th, appendable);
            }
            i = i2;
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        m21387a((Appendable) printWriter);
    }

    /* renamed from: a */
    public List<Throwable> mo24279a() {
        return this.f23226e;
    }

    /* renamed from: a */
    public void mo24283a(String str) {
        List b = mo24284b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) b.get(i));
            i = i2;
        }
    }

    /* renamed from: a */
    private void m21389a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).mo24279a()) {
                m21389a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    private void m21387a(Appendable appendable) {
        m21388a((Throwable) this, appendable);
        m21390a(mo24279a(), (Appendable) new C8911a(appendable));
    }

    /* renamed from: a */
    private static void m21388a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    private static void m21390a(List<Throwable> list, Appendable appendable) {
        try {
            m21391b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
