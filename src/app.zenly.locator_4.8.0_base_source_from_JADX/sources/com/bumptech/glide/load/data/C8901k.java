package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.k */
public class C8901k extends C8887b<InputStream> {
    public C8901k(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m21358a(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24248a(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}
