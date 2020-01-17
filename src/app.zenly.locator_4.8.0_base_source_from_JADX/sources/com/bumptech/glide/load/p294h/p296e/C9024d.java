package com.bumptech.glide.load.p294h.p296e;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.util.List;

/* renamed from: com.bumptech.glide.load.h.e.d */
public class C9024d implements ResourceDecoder<Uri, Drawable> {

    /* renamed from: a */
    private final Context f23558a;

    public C9024d(Context context) {
        this.f23558a = context.getApplicationContext();
    }

    /* renamed from: b */
    private int m21690b(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m21687a(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m21688a(uri);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized Uri format: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean handles(Uri uri, C9011f fVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* renamed from: a */
    public Resource<Drawable> decode(Uri uri, int i, int i2, C9011f fVar) {
        Context a = m21689a(uri, uri.getAuthority());
        return C9023c.m21686a(C9021a.m21682a(this.f23558a, a, m21690b(a, uri)));
    }

    /* renamed from: a */
    private Context m21689a(Uri uri, String str) {
        if (str.equals(this.f23558a.getPackageName())) {
            return this.f23558a;
        }
        try {
            return this.f23558a.createPackageContext(str, 0);
        } catch (NameNotFoundException e) {
            if (str.contains(this.f23558a.getPackageName())) {
                return this.f23558a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private int m21687a(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        String str = (String) pathSegments.get(0);
        String str2 = (String) pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, uri.getAuthority());
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to find resource id for: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private int m21688a(Uri uri) {
        try {
            return Integer.parseInt((String) uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized Uri format: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
