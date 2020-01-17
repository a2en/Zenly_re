package com.android.volley.toolbox;

import com.android.volley.C8715f;
import com.android.volley.C8716g;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.l */
public abstract class C8735l<T> extends Request<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[]{PROTOCOL_CHARSET});
    private Listener<T> mListener;
    private final Object mLock;
    private final String mRequestBody;

    @Deprecated
    public C8735l(String str, String str2, Listener<T> listener, ErrorListener errorListener) {
        this(-1, str, str2, listener, errorListener);
    }

    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(T t) {
        Listener<T> listener;
        synchronized (this.mLock) {
            listener = this.mListener;
        }
        if (listener != null) {
            listener.onResponse(t);
        }
    }

    public byte[] getBody() {
        String str = PROTOCOL_CHARSET;
        byte[] bArr = null;
        try {
            if (this.mRequestBody != null) {
                bArr = this.mRequestBody.getBytes(str);
            }
            return bArr;
        } catch (UnsupportedEncodingException unused) {
            C8716g.m20510e("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, str);
            return null;
        }
    }

    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    public abstract Response<T> parseNetworkResponse(C8715f fVar);

    public C8735l(int i, String str, String str2, Listener<T> listener, ErrorListener errorListener) {
        super(i, str, errorListener);
        this.mLock = new Object();
        this.mListener = listener;
        this.mRequestBody = str2;
    }
}
