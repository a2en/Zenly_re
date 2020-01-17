package com.crashlytics.android.core;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;
import p389io.fabric.sdk.android.services.settings.C12263o;

/* renamed from: com.crashlytics.android.core.i */
class C9324i {

    /* renamed from: a */
    private final C9329e f24191a;

    /* renamed from: b */
    private final Builder f24192b;

    /* renamed from: com.crashlytics.android.core.i$a */
    static class C9325a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C9329e f24193e;

        C9325a(C9329e eVar) {
            this.f24193e = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f24193e.mo25124a(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.crashlytics.android.core.i$b */
    static class C9326b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C9329e f24194e;

        C9326b(C9329e eVar) {
            this.f24194e = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f24194e.mo25124a(false);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.crashlytics.android.core.i$c */
    static class C9327c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C9328d f24195e;

        /* renamed from: f */
        final /* synthetic */ C9329e f24196f;

        C9327c(C9328d dVar, C9329e eVar) {
            this.f24195e = dVar;
            this.f24196f = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f24195e.mo25122a(true);
            this.f24196f.mo25124a(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.crashlytics.android.core.i$d */
    interface C9328d {
        /* renamed from: a */
        void mo25122a(boolean z);
    }

    /* renamed from: com.crashlytics.android.core.i$e */
    private static class C9329e {

        /* renamed from: a */
        private boolean f24197a;

        /* renamed from: b */
        private final CountDownLatch f24198b;

        private C9329e() {
            this.f24197a = false;
            this.f24198b = new CountDownLatch(1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo25124a(boolean z) {
            this.f24197a = z;
            this.f24198b.countDown();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo25125b() {
            return this.f24197a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo25123a() {
            try {
                this.f24198b.await();
            } catch (InterruptedException unused) {
            }
        }

        /* synthetic */ C9329e(C9325a aVar) {
            this();
        }
    }

    private C9324i(Builder builder, C9329e eVar) {
        this.f24191a = eVar;
        this.f24192b = builder;
    }

    /* renamed from: a */
    private static int m22529a(float f, int i) {
        return (int) (f * ((float) i));
    }

    /* renamed from: a */
    public static C9324i m22531a(Activity activity, C12263o oVar, C9328d dVar) {
        C9329e eVar = new C9329e(null);
        C9421w wVar = new C9421w(activity, oVar);
        Builder builder = new Builder(activity);
        ScrollView a = m22530a(activity, wVar.mo25235c());
        builder.setView(a).setTitle(wVar.mo25237e()).setCancelable(false).setNeutralButton(wVar.mo25236d(), new C9325a(eVar));
        if (oVar.f31901d) {
            builder.setNegativeButton(wVar.mo25234b(), new C9326b(eVar));
        }
        if (oVar.f31903f) {
            builder.setPositiveButton(wVar.mo25233a(), new C9327c(dVar, eVar));
        }
        return new C9324i(builder, eVar);
    }

    /* renamed from: b */
    public boolean mo25117b() {
        return this.f24191a.mo25125b();
    }

    /* renamed from: c */
    public void mo25118c() {
        this.f24192b.show();
    }

    /* renamed from: a */
    private static ScrollView m22530a(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int a = m22529a(f, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a, a, a, a);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(m22529a(f, 14), m22529a(f, 2), m22529a(f, 10), m22529a(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    /* renamed from: a */
    public void mo25116a() {
        this.f24191a.mo25123a();
    }
}
