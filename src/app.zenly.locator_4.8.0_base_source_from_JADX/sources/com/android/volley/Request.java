package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Cache.C8702a;
import com.android.volley.Response.ErrorListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Request<T> implements Comparable<Request<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private C8702a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private ErrorListener mErrorListener;
    /* access modifiers changed from: private */
    public final C8717a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private C8704b mRequestCompleteListener;
    private RequestQueue mRequestQueue;
    private boolean mResponseDelivered;
    private RetryPolicy mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public interface Method {
    }

    /* renamed from: com.android.volley.Request$a */
    class C8703a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ String f22405e;

        /* renamed from: f */
        final /* synthetic */ long f22406f;

        C8703a(String str, long j) {
            this.f22405e = str;
            this.f22406f = j;
        }

        public void run() {
            Request.this.mEventLog.mo23580a(this.f22405e, this.f22406f);
            Request.this.mEventLog.mo23579a(Request.this.toString());
        }
    }

    /* renamed from: com.android.volley.Request$b */
    interface C8704b {
        /* renamed from: a */
        void mo23545a(Request<?> request);

        /* renamed from: a */
        void mo23546a(Request<?> request, Response<?> response);
    }

    /* renamed from: com.android.volley.Request$c */
    public enum C8705c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public Request(String str, ErrorListener errorListener) {
        this(-1, str, errorListener);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", new Object[]{entry.getKey(), entry.getValue()}));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Encoding not supported: ");
            sb2.append(str);
            throw new RuntimeException(sb2.toString(), e);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    return host.hashCode();
                }
            }
        }
        return 0;
    }

    public void addMarker(String str) {
        if (C8717a.f22463c) {
            this.mEventLog.mo23580a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public void deliverError(VolleyError volleyError) {
        ErrorListener errorListener;
        synchronized (this.mLock) {
            errorListener = this.mErrorListener;
        }
        if (errorListener != null) {
            errorListener.onErrorResponse(volleyError);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void deliverResponse(T t);

    /* access modifiers changed from: 0000 */
    public void finish(String str) {
        RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            requestQueue.mo23550b(this);
        }
        if (C8717a.f22463c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C8703a(str, id));
            } else {
                this.mEventLog.mo23580a(str, id);
                this.mEventLog.mo23579a(toString());
            }
        }
    }

    public byte[] getBody() throws AuthFailureError {
        Map params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        StringBuilder sb = new StringBuilder();
        sb.append("application/x-www-form-urlencoded; charset=");
        sb.append(getParamsEncoding());
        return sb.toString();
    }

    public C8702a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(method));
        sb.append('-');
        sb.append(url);
        return sb.toString();
    }

    public ErrorListener getErrorListener() {
        ErrorListener errorListener;
        synchronized (this.mLock) {
            errorListener = this.mErrorListener;
        }
        return errorListener;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() throws AuthFailureError {
        Map postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public C8705c getPriority() {
        return C8705c.NORMAL;
    }

    public RetryPolicy getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().getCurrentTimeout();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyListenerResponseNotUsable() {
        C8704b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.mo23545a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyListenerResponseReceived(Response<?> response) {
        C8704b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.mo23546a(this, response);
        }
    }

    /* access modifiers changed from: protected */
    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    /* access modifiers changed from: protected */
    public abstract Response<T> parseNetworkResponse(C8715f fVar);

    public Request<?> setCacheEntry(C8702a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void setNetworkRequestCompleteListener(C8704b bVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = bVar;
        }
    }

    public Request<?> setRequestQueue(RequestQueue requestQueue) {
        this.mRequestQueue = requestQueue;
        return this;
    }

    public Request<?> setRetryPolicy(RetryPolicy retryPolicy) {
        this.mRetryPolicy = retryPolicy;
        return this;
    }

    public final Request<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    public final Request<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    public final Request<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    public Request<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(getTrafficStatsTag()));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(isCanceled() ? "[X] " : "[ ] ");
        sb3.append(getUrl());
        String str = " ";
        sb3.append(str);
        sb3.append(sb2);
        sb3.append(str);
        sb3.append(getPriority());
        sb3.append(str);
        sb3.append(this.mSequence);
        return sb3.toString();
    }

    public Request(int i, String str, ErrorListener errorListener) {
        this.mEventLog = C8717a.f22463c ? new C8717a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = errorListener;
        setRetryPolicy(new C8709b());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int compareTo(Request<T> request) {
        C8705c priority = getPriority();
        C8705c priority2 = request.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - request.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }
}
