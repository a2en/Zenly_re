package com.mapbox.mapboxsdk.http;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.http.LocalRequestTask.OnLocalRequestResponse;
import java.util.concurrent.locks.ReentrantLock;

@Keep
public class NativeHttpRequest implements HttpResponder {
    private final HttpRequest httpRequest = C11451d.m29568c().createHttpRequest();
    /* access modifiers changed from: private */
    public final ReentrantLock lock = new ReentrantLock();
    /* access modifiers changed from: private */
    @Keep
    public long nativePtr;

    /* renamed from: com.mapbox.mapboxsdk.http.NativeHttpRequest$a */
    class C11463a implements OnLocalRequestResponse {
        C11463a() {
        }

        public void onResponse(byte[] bArr) {
            if (bArr != null) {
                NativeHttpRequest.this.lock.lock();
                if (NativeHttpRequest.this.nativePtr != 0) {
                    NativeHttpRequest.this.nativeOnResponse(200, null, null, null, null, null, null, bArr);
                }
                NativeHttpRequest.this.lock.unlock();
            }
        }
    }

    @Keep
    private NativeHttpRequest(long j, String str, String str2, String str3) {
        this.nativePtr = j;
        if (str.startsWith("local://")) {
            executeLocalRequest(str);
        } else {
            this.httpRequest.executeRequest(this, j, str, str2, str3);
        }
    }

    private void executeLocalRequest(String str) {
        new LocalRequestTask(new C11463a()).execute(new String[]{str});
    }

    @Keep
    private native void nativeOnFailure(int i, String str);

    /* access modifiers changed from: private */
    @Keep
    public native void nativeOnResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    public void cancel() {
        this.httpRequest.cancelRequest();
        this.lock.lock();
        this.nativePtr = 0;
        this.lock.unlock();
    }

    public void handleFailure(int i, String str) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnFailure(i, str);
        }
        this.lock.unlock();
    }

    public void onResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnResponse(i, str, str2, str3, str4, str5, str6, bArr);
        }
        this.lock.unlock();
    }
}
