package androidx.transition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.h */
public class C1233h {

    /* renamed from: a */
    private Context f4627a;

    /* renamed from: b */
    private int f4628b = -1;

    /* renamed from: c */
    private ViewGroup f4629c;

    /* renamed from: d */
    private View f4630d;

    /* renamed from: e */
    private Runnable f4631e;

    /* renamed from: f */
    private Runnable f4632f;

    public C1233h(ViewGroup viewGroup, View view) {
        this.f4629c = viewGroup;
        this.f4630d = view;
    }

    /* renamed from: a */
    public void mo6087a() {
        if (this.f4628b > 0 || this.f4630d != null) {
            mo6089c().removeAllViews();
            if (this.f4628b > 0) {
                LayoutInflater.from(this.f4627a).inflate(this.f4628b, this.f4629c);
            } else {
                this.f4629c.addView(this.f4630d);
            }
        }
        Runnable runnable = this.f4631e;
        if (runnable != null) {
            runnable.run();
        }
        m5956a(this.f4629c, this);
    }

    /* renamed from: b */
    public void mo6088b() {
        if (m5955a(this.f4629c) == this) {
            Runnable runnable = this.f4632f;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: c */
    public ViewGroup mo6089c() {
        return this.f4629c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo6090d() {
        return this.f4628b > 0;
    }

    /* renamed from: a */
    static void m5956a(View view, C1233h hVar) {
        view.setTag(C1229f.transition_current_scene, hVar);
    }

    /* renamed from: a */
    static C1233h m5955a(View view) {
        return (C1233h) view.getTag(C1229f.transition_current_scene);
    }
}
