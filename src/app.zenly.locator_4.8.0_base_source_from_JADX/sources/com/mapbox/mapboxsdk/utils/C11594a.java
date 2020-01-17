package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.view.View;
import java.io.ByteArrayOutputStream;
import p214e.p215a.p216k.p217a.C7531a;

/* renamed from: com.mapbox.mapboxsdk.utils.a */
public class C11594a {
    /* renamed from: a */
    public static Bitmap m30368a(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(524288);
        view.buildDrawingCache();
        if (view.getDrawingCache() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createBitmap;
    }

    /* renamed from: b */
    public static byte[] m30372b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap a = m30367a(drawable);
        if (a == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static Bitmap m30366a(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(bitmap2, 10.0f, 10.0f, null);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m30367a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return null;
        }
        Drawable mutate = constantState.newDrawable().mutate();
        Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        mutate.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static Drawable m30371a(Context context, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    /* renamed from: a */
    public static Drawable m30369a(Context context, int i) {
        return m30370a(context, i, null);
    }

    /* renamed from: a */
    public static Drawable m30370a(Context context, int i, Integer num) {
        Drawable c = C7531a.m18133c(context, i);
        if (c == null) {
            return null;
        }
        if (num == null) {
            return c;
        }
        if (VERSION.SDK_INT >= 21) {
            c.setTint(num.intValue());
        } else {
            c.mutate().setColorFilter(num.intValue(), Mode.SRC_IN);
        }
        return c;
    }
}
