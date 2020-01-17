package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.g */
public class C8894g extends C8900j<ParcelFileDescriptor> {
    public C8894g(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public Class<ParcelFileDescriptor> getDataClass() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor m21345a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24246a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}
