package zendesk.support.request;

import com.zendesk.service.C12004a;
import com.zendesk.service.C12008e;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.C13167a0;
import okhttp3.C13170b0;
import okhttp3.C13325v;
import okhttp3.C13331y.C13332a;
import okhttp3.Call;
import okhttp3.Callback;
import zendesk.belvedere.MediaResult;

class AttachmentDownloadService {
    private final Executor executor;
    private final C13325v okHttpClient;

    private static class SaveToFileTask implements Runnable {
        private final C12008e<MediaResult> callback;
        private final MediaResult destFile;
        private final C13170b0 responseBody;

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [com.zendesk.service.ErrorResponse] */
        /* JADX WARNING: type inference failed for: r0v5, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r2v1, types: [com.zendesk.service.a] */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r7v0 */
        /* JADX WARNING: type inference failed for: r0v9 */
        /* JADX WARNING: type inference failed for: r7v1 */
        /* JADX WARNING: type inference failed for: r0v11 */
        /* JADX WARNING: type inference failed for: r0v12 */
        /* JADX WARNING: type inference failed for: r0v13 */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                r0 = 0
                zendesk.belvedere.MediaResult r1 = r8.destFile     // Catch:{ IOException -> 0x002d }
                java.io.File r1 = r1.mo38840a()     // Catch:{ IOException -> 0x002d }
                okio.Sink r1 = okio.C13354l.m35384b(r1)     // Catch:{ IOException -> 0x002d }
                okio.BufferedSink r1 = okio.C13354l.m35374a(r1)     // Catch:{ IOException -> 0x002d }
                okhttp3.b0 r2 = r8.responseBody     // Catch:{ IOException -> 0x0026, all -> 0x0021 }
                okio.BufferedSource r2 = r2.mo37829f()     // Catch:{ IOException -> 0x0026, all -> 0x0021 }
                r1.writeAll(r2)     // Catch:{ IOException -> 0x0026, all -> 0x0021 }
                zendesk.support.Streams.closeQuietly(r1)
                okhttp3.b0 r1 = r8.responseBody
                zendesk.support.Streams.closeQuietly(r1)
                goto L_0x0051
            L_0x0021:
                r0 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x0061
            L_0x0026:
                r0 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x002e
            L_0x002b:
                r1 = move-exception
                goto L_0x0061
            L_0x002d:
                r1 = move-exception
            L_0x002e:
                java.lang.String r2 = "RequestActivity"
                java.lang.String r3 = "Unable to save attachment to disk. Error: '%s'"
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x002b }
                r5 = 0
                java.lang.String r6 = r1.getMessage()     // Catch:{ all -> 0x002b }
                r4[r5] = r6     // Catch:{ all -> 0x002b }
                com.zendesk.logger.Logger.m31610b(r2, r3, r4)     // Catch:{ all -> 0x002b }
                com.zendesk.service.a r2 = new com.zendesk.service.a     // Catch:{ all -> 0x002b }
                java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x002b }
                r2.<init>(r1)     // Catch:{ all -> 0x002b }
                zendesk.support.Streams.closeQuietly(r0)
                okhttp3.b0 r0 = r8.responseBody
                zendesk.support.Streams.closeQuietly(r0)
                r0 = r2
            L_0x0051:
                com.zendesk.service.e<zendesk.belvedere.MediaResult> r1 = r8.callback
                if (r1 == 0) goto L_0x0060
                if (r0 != 0) goto L_0x005d
                zendesk.belvedere.MediaResult r0 = r8.destFile
                r1.onSuccess(r0)
                goto L_0x0060
            L_0x005d:
                r1.onError(r0)
            L_0x0060:
                return
            L_0x0061:
                zendesk.support.Streams.closeQuietly(r0)
                okhttp3.b0 r0 = r8.responseBody
                zendesk.support.Streams.closeQuietly(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.AttachmentDownloadService.SaveToFileTask.run():void");
        }

        private SaveToFileTask(C13170b0 b0Var, MediaResult mediaResult, C12008e<MediaResult> eVar) {
            this.responseBody = b0Var;
            this.destFile = mediaResult;
            this.callback = eVar;
        }
    }

    AttachmentDownloadService(C13325v vVar, Executor executor2) {
        this.okHttpClient = vVar;
        this.executor = executor2;
    }

    /* access modifiers changed from: 0000 */
    public void downloadAttachment(String str, final C12008e<C13170b0> eVar) {
        C13332a aVar = new C13332a();
        aVar.mo38401b();
        aVar.mo38402b(str);
        this.okHttpClient.newCall(aVar.mo38400a()).enqueue(new Callback(this) {
            public void onFailure(Call call, IOException iOException) {
                eVar.onError(new C12004a(iOException.getMessage()));
            }

            public void onResponse(Call call, C13167a0 a0Var) throws IOException {
                if (a0Var.mo37796g()) {
                    eVar.onSuccess(a0Var.mo37789a());
                } else {
                    eVar.onError(new C12004a(a0Var.mo37797h()));
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void storeAttachment(C13170b0 b0Var, MediaResult mediaResult, C12008e<MediaResult> eVar) {
        this.executor.execute(new SaveToFileTask(b0Var, mediaResult, eVar));
    }
}
