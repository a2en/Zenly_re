package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C10067c;
import com.google.android.gms.common.internal.C10107e;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
public abstract class C10184a<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f26739a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bundle f26740b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinkedList<C10185a> f26741c;

    /* renamed from: d */
    private final OnDelegateCreatedListener<T> f26742d = new C10187c(this);

    /* renamed from: com.google.android.gms.dynamic.a$a */
    private interface C10185a {
        /* renamed from: a */
        void mo27649a(LifecycleDelegate lifecycleDelegate);

        int getState();
    }

    /* renamed from: a */
    public T mo27639a() {
        return this.f26739a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27641a(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    /* renamed from: b */
    public void mo27642b() {
        T t = this.f26739a;
        if (t != null) {
            t.onDestroy();
        } else {
            m25700a(1);
        }
    }

    /* renamed from: c */
    public void mo27644c() {
        T t = this.f26739a;
        if (t != null) {
            t.onLowMemory();
        }
    }

    /* renamed from: d */
    public void mo27645d() {
        T t = this.f26739a;
        if (t != null) {
            t.onPause();
        } else {
            m25700a(5);
        }
    }

    /* renamed from: e */
    public void mo27646e() {
        m25701a((Bundle) null, (C10185a) new C10190f(this));
    }

    /* renamed from: f */
    public void mo27647f() {
        m25701a((Bundle) null, (C10185a) new C10191g(this));
    }

    /* renamed from: g */
    public void mo27648g() {
        T t = this.f26739a;
        if (t != null) {
            t.onStop();
        } else {
            m25700a(4);
        }
    }

    /* renamed from: a */
    private final void m25700a(int i) {
        while (!this.f26741c.isEmpty() && ((C10185a) this.f26741c.getLast()).getState() >= i) {
            this.f26741c.removeLast();
        }
    }

    /* renamed from: a */
    private final void m25701a(Bundle bundle, C10185a aVar) {
        T t = this.f26739a;
        if (t != null) {
            aVar.mo27649a(t);
            return;
        }
        if (this.f26741c == null) {
            this.f26741c = new LinkedList<>();
        }
        this.f26741c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f26740b;
            if (bundle2 == null) {
                this.f26740b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo27641a(this.f26742d);
    }

    /* renamed from: b */
    public void mo27643b(Bundle bundle) {
        T t = this.f26739a;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f26740b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    /* renamed from: a */
    public void mo27640a(Bundle bundle) {
        m25701a(bundle, (C10185a) new C10188d(this, bundle));
    }

    /* renamed from: a */
    public static void m25702a(FrameLayout frameLayout) {
        C10067c a = C10067c.m25293a();
        Context context = frameLayout.getContext();
        int a2 = a.mo27284a(context);
        String b = C10107e.m25451b(context, a2);
        String a3 = C10107e.m25447a(context, a2);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a4 = a.mo27289a(context, a2, (String) null);
        if (a4 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(a3);
            linearLayout.addView(button);
            button.setOnClickListener(new C10189e(context, a4));
        }
    }
}
