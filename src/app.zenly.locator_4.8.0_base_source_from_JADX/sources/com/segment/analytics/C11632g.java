package com.segment.analytics;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings.Secure;
import android.util.Pair;
import com.appsflyer.share.Constants;
import com.segment.analytics.C11616a.C11617a;
import com.segment.analytics.integrations.C11657e;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.segment.analytics.g */
class C11632g extends AsyncTask<Context, Void, Pair<String, Boolean>> {

    /* renamed from: a */
    private final C11616a f30201a;

    /* renamed from: b */
    private final CountDownLatch f30202b;

    /* renamed from: c */
    private final C11657e f30203c;

    C11632g(C11616a aVar, CountDownLatch countDownLatch, C11657e eVar) {
        this.f30201a = aVar;
        this.f30202b = countDownLatch;
        this.f30203c = eVar;
    }

    /* renamed from: a */
    private Pair<String, Boolean> m30489a(Context context) throws Exception {
        ContentResolver contentResolver = context.getContentResolver();
        if (!(Secure.getInt(contentResolver, "limit_ad_tracking") != 0)) {
            return Pair.create(Secure.getString(contentResolver, Constants.URL_ADVERTISING_ID), Boolean.valueOf(true));
        }
        this.f30203c.mo34347a("Not collecting advertising ID because limit_ad_tracking (Amazon Fire OS) is true.", new Object[0]);
        return Pair.create(null, Boolean.valueOf(false));
    }

    /* renamed from: b */
    private Pair<String, Boolean> m30490b(Context context) throws Exception {
        Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{context});
        if (((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])).booleanValue()) {
            this.f30203c.mo34347a("Not collecting advertising ID because isLimitAdTrackingEnabled (Google Play Services) is true.", new Object[0]);
            return Pair.create(null, Boolean.valueOf(false));
        }
        return Pair.create((String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]), Boolean.valueOf(true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<String, Boolean> doInBackground(Context... contextArr) {
        Context context = contextArr[0];
        try {
            return m30490b(context);
        } catch (Exception e) {
            this.f30203c.mo34348a(e, "Unable to collect advertising ID from Google Play Services.", new Object[0]);
            try {
                return m30489a(context);
            } catch (Exception e2) {
                this.f30203c.mo34348a(e2, "Unable to collect advertising ID from Amazon Fire OS.", new Object[0]);
                this.f30203c.mo34347a("Unable to collect advertising ID from Amazon Fire OS and Google Play Services.", new Object[0]);
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Pair<String, Boolean> pair) {
        super.onPostExecute(pair);
        if (pair != null) {
            try {
                C11617a b = this.f30201a.mo34264b();
                if (b == null) {
                    this.f30203c.mo34347a("Not collecting advertising ID because context.device is null.", new Object[0]);
                } else {
                    b.mo34272b((String) pair.first, ((Boolean) pair.second).booleanValue());
                    return;
                }
            } finally {
                this.f30202b.countDown();
            }
        }
        this.f30202b.countDown();
    }
}
