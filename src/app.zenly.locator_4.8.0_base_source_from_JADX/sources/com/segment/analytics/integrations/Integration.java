package com.segment.analytics.integrations;

import android.app.Activity;
import android.os.Bundle;
import com.segment.analytics.Analytics;
import com.segment.analytics.C11685r;

public abstract class Integration<T> {

    public interface Factory {
        Integration<?> create(C11685r rVar, Analytics analytics);

        String key();
    }

    /* renamed from: a */
    public void mo34319a() {
    }

    /* renamed from: a */
    public void mo34320a(Activity activity) {
    }

    /* renamed from: a */
    public void mo34273a(Activity activity, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo34321a(C11649a aVar) {
    }

    /* renamed from: a */
    public void mo34322a(C11654c cVar) {
    }

    /* renamed from: a */
    public void mo34274a(C11655d dVar) {
    }

    /* renamed from: a */
    public void mo34323a(C11658f fVar) {
    }

    /* renamed from: a */
    public void mo34275a(C11660g gVar) {
    }

    /* renamed from: b */
    public void mo34324b() {
    }

    /* renamed from: b */
    public void mo34325b(Activity activity) {
    }

    /* renamed from: b */
    public void mo34326b(Activity activity, Bundle bundle) {
    }

    /* renamed from: c */
    public void mo34327c(Activity activity) {
    }

    /* renamed from: d */
    public void mo34328d(Activity activity) {
    }

    /* renamed from: e */
    public void mo34329e(Activity activity) {
    }
}
