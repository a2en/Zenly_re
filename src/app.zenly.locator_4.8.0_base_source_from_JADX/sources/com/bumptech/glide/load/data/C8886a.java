package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.a */
public final class C8886a extends C8900j<AssetFileDescriptor> {
    public C8886a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AssetFileDescriptor m21331a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24246a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }
}
