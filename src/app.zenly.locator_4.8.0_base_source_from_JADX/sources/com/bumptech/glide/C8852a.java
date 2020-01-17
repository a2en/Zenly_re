package com.bumptech.glide;

import android.content.Context;
import app.zenly.locator.core.glide.C2485i;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.bumptech.glide.manager.RequestManagerTreeNode;

/* renamed from: com.bumptech.glide.a */
final class C8852a implements RequestManagerFactory {
    C8852a() {
    }

    public C8867j build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        return new C2485i(glide, lifecycle, requestManagerTreeNode, context);
    }
}
