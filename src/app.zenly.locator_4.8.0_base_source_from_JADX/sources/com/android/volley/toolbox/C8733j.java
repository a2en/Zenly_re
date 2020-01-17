package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;
import com.android.volley.C8709b;
import com.android.volley.C8715f;
import com.android.volley.C8716g;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Request.C8705c;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;

/* renamed from: com.android.volley.toolbox.j */
public class C8733j extends Request<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Config mDecodeConfig;
    private Listener<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ScaleType mScaleType;

    public C8733j(String str, Listener<Bitmap> listener, int i, int i2, ScaleType scaleType, Config config, ErrorListener errorListener) {
        super(0, str, errorListener);
        this.mLock = new Object();
        setRetryPolicy(new C8709b(DEFAULT_IMAGE_TIMEOUT_MS, 2, 2.0f));
        this.mListener = listener;
        this.mDecodeConfig = config;
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
        this.mScaleType = scaleType;
    }

    private Response<Bitmap> doParse(C8715f fVar) {
        Bitmap bitmap;
        byte[] bArr = fVar.f22456b;
        Options options = new Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i, i2, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i2, i, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i, i2, resizedDimension, resizedDimension2);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmap != null && (bitmap.getWidth() > resizedDimension || bitmap.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, resizedDimension, resizedDimension2, true);
                bitmap.recycle();
                bitmap = createScaledBitmap;
            }
        }
        if (bitmap == null) {
            return Response.m20482a(new ParseError(fVar));
        }
        return Response.m20483a(bitmap, C8730g.m20562a(fVar));
    }

    static int findBestSampleSize(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int getResizedDimension(int i, int i2, int i3, int i4, ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ScaleType.CENTER_CROP) {
                double d2 = (double) i2;
                if (((double) i) * d < d2) {
                    i = (int) (d2 / d);
                }
                return i;
            }
            double d3 = (double) i2;
            if (((double) i) * d > d3) {
                i = (int) (d3 / d);
            }
            return i;
        }
    }

    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    public C8705c getPriority() {
        return C8705c.LOW;
    }

    /* access modifiers changed from: protected */
    public Response<Bitmap> parseNetworkResponse(C8715f fVar) {
        Response<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                doParse = doParse(fVar);
            } catch (OutOfMemoryError e) {
                C8716g.m20508c("Caught OOM for %d byte image, url=%s", Integer.valueOf(fVar.f22456b.length), getUrl());
                return Response.m20482a(new ParseError((Throwable) e));
            } catch (Throwable th) {
                throw th;
            }
        }
        return doParse;
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(Bitmap bitmap) {
        Listener<Bitmap> listener;
        synchronized (this.mLock) {
            listener = this.mListener;
        }
        if (listener != null) {
            listener.onResponse(bitmap);
        }
    }

    @Deprecated
    public C8733j(String str, Listener<Bitmap> listener, int i, int i2, Config config, ErrorListener errorListener) {
        this(str, listener, i, i2, ScaleType.CENTER_INSIDE, config, errorListener);
    }
}
