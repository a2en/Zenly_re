package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.f */
public class C8893f extends C8887b<ParcelFileDescriptor> {
    public C8893f(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<ParcelFileDescriptor> getDataClass() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor m21341a(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24248a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}
