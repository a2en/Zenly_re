package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AppsFlyerTrackingRequestListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.appsflyer.internal.h */
public final class C8772h {

    /* renamed from: ʻ */
    public String f22712;

    /* renamed from: ʻॱ */
    public boolean f22713;

    /* renamed from: ʼ */
    public String f22714;

    /* renamed from: ʽ */
    public String f22715;

    /* renamed from: ˊ */
    public Intent f22716;

    /* renamed from: ˊॱ */
    public int f22717;

    /* renamed from: ˋ */
    public Map<String, Object> f22718;

    /* renamed from: ˋॱ */
    public String f22719;

    /* renamed from: ˎ */
    public Context f22720;

    /* renamed from: ˏ */
    public WeakReference<Context> f22721;

    /* renamed from: ˏॱ */
    public boolean f22722;

    /* renamed from: ͺ */
    public String f22723;

    /* renamed from: ॱ */
    public AppsFlyerTrackingRequestListener f22724;

    /* renamed from: ॱˊ */
    public String f22725;

    /* renamed from: ॱॱ */
    public String f22726;

    /* renamed from: ᐝ */
    public Map<String, Object> f22727;

    /* renamed from: ˏ */
    public final C8772h mo23792() {
        Context context = this.f22720;
        Context context2 = null;
        if (context == null) {
            WeakReference<Context> weakReference = this.f22721;
            context = weakReference != null ? (Context) weakReference.get() : null;
        }
        if (context != null) {
            Context context3 = this.f22720;
            if (context3 != null) {
                context2 = context3;
            } else {
                WeakReference<Context> weakReference2 = this.f22721;
                if (weakReference2 != null) {
                    context2 = (Context) weakReference2.get();
                }
            }
            this.f22720 = context2.getApplicationContext();
        }
        return this;
    }
}
