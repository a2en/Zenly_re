package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import app.zenly.locator.core.glide.ZenlyGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    private final ZenlyGlideModule f22984a = new ZenlyGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        String str = "Glide";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Discovered AppGlideModule from annotation: app.zenly.locator.core.glide.ZenlyGlideModule");
        }
    }

    /* renamed from: a */
    public void mo24084a(Context context, C8854c cVar) {
        this.f22984a.mo24084a(context, cVar);
    }

    /* renamed from: b */
    public Set<Class<?>> mo24082b() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public void mo8471a(Context context, Glide glide, Registry registry) {
        this.f22984a.mo8471a(context, glide, registry);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8852a m21127c() {
        return new C8852a();
    }

    /* renamed from: a */
    public boolean mo8472a() {
        return this.f22984a.mo8472a();
    }
}
