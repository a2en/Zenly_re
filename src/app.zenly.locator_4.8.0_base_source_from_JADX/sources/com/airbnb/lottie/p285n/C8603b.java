package com.airbnb.lottie.p285n;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C8531f;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.p289q.C8654d;
import com.airbnb.lottie.p289q.C8658h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.n.b */
public class C8603b {

    /* renamed from: e */
    private static final Object f22119e = new Object();

    /* renamed from: a */
    private final Context f22120a;

    /* renamed from: b */
    private String f22121b;

    /* renamed from: c */
    private ImageAssetDelegate f22122c;

    /* renamed from: d */
    private final Map<String, C8531f> f22123d;

    public C8603b(Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, C8531f> map) {
        this.f22121b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f22121b;
            if (str2.charAt(str2.length() - 1) != '/') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22121b);
                sb.append('/');
                this.f22121b = sb.toString();
            }
        }
        if (!(callback instanceof View)) {
            C8654d.m20155b("LottieDrawable must be inside of a view for images to work.");
            this.f22123d = new HashMap();
            this.f22120a = null;
            return;
        }
        this.f22120a = ((View) callback).getContext();
        this.f22123d = map;
        mo23216a(imageAssetDelegate);
    }

    /* renamed from: a */
    public void mo23216a(ImageAssetDelegate imageAssetDelegate) {
        this.f22122c = imageAssetDelegate;
    }

    /* renamed from: a */
    public Bitmap mo23215a(String str) {
        C8531f fVar = (C8531f) this.f22123d.get(str);
        if (fVar == null) {
            return null;
        }
        Bitmap a = fVar.mo23021a();
        if (a != null) {
            return a;
        }
        ImageAssetDelegate imageAssetDelegate = this.f22122c;
        if (imageAssetDelegate != null) {
            Bitmap fetchBitmap = imageAssetDelegate.fetchBitmap(fVar);
            if (fetchBitmap != null) {
                m19997a(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        String b = fVar.mo23023b();
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f22121b)) {
                    AssetManager assets = this.f22120a.getAssets();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f22121b);
                    sb.append(b);
                    Bitmap a2 = C8658h.m20196a(BitmapFactory.decodeStream(assets.open(sb.toString()), null, options), fVar.mo23026e(), fVar.mo23024c());
                    m19997a(str, a2);
                    return a2;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e) {
                C8654d.m20154a("Unable to open asset.", e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                m19997a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                C8654d.m20154a("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo23217a(Context context) {
        return (context == null && this.f22120a == null) || this.f22120a.equals(context);
    }

    /* renamed from: a */
    private Bitmap m19997a(String str, Bitmap bitmap) {
        synchronized (f22119e) {
            ((C8531f) this.f22123d.get(str)).mo23022a(bitmap);
        }
        return bitmap;
    }
}
