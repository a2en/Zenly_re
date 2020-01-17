package com.mapbox.mapboxsdk.http;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.mapbox.mapboxsdk.C11445b;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.log.Logger;

class LocalRequestTask extends AsyncTask<String, Void, byte[]> {

    /* renamed from: a */
    private OnLocalRequestResponse f29646a;

    public interface OnLocalRequestResponse {
        void onResponse(byte[] bArr);
    }

    LocalRequestTask(OnLocalRequestResponse onLocalRequestResponse) {
        this.f29646a = onLocalRequestResponse;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] doInBackground(String... strArr) {
        AssetManager assets = C11451d.m29567b().getAssets();
        StringBuilder sb = new StringBuilder();
        sb.append("integration/");
        sb.append(strArr[0].substring(8).replaceAll("%20", " ").replaceAll("%2c", ","));
        return m29597a(assets, sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(byte[] bArr) {
        super.onPostExecute(bArr);
        if (bArr != null) {
            OnLocalRequestResponse onLocalRequestResponse = this.f29646a;
            if (onLocalRequestResponse != null) {
                onLocalRequestResponse.onResponse(bArr);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC, Splitter:B:21:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0036 A[SYNTHETIC, Splitter:B:26:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m29597a(android.content.res.AssetManager r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ IOException -> 0x0024 }
            int r3 = r2.available()     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            byte[] r0 = new byte[r3]     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            r2.read(r0)     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            if (r2 == 0) goto L_0x0018
            r2.close()     // Catch:{ IOException -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r2 = move-exception
            m29596a(r2)
        L_0x0018:
            r2 = r0
            goto L_0x0033
        L_0x001a:
            r3 = move-exception
            goto L_0x0034
        L_0x001c:
            r3 = move-exception
            r1 = r0
            r0 = r2
            r2 = r1
            goto L_0x0026
        L_0x0021:
            r3 = move-exception
            r2 = r0
            goto L_0x0034
        L_0x0024:
            r3 = move-exception
            r2 = r0
        L_0x0026:
            m29596a(r3)     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            m29596a(r3)
        L_0x0033:
            return r2
        L_0x0034:
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r2 = move-exception
            m29596a(r2)
        L_0x003e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.http.LocalRequestTask.m29597a(android.content.res.AssetManager, java.lang.String):byte[]");
    }

    /* renamed from: a */
    private static void m29596a(Exception exc) {
        String str = "Load file failed";
        Logger.m29681e("Mbgl-LocalRequestTask", str, exc);
        C11445b.m29551a(str, exc);
    }
}
