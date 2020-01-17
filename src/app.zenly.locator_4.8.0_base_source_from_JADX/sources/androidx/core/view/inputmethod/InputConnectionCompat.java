package androidx.core.view.inputmethod;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class InputConnectionCompat {

    public interface OnCommitContentListener {
        boolean onCommitContent(C0651b bVar, int i, Bundle bundle);
    }

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$a */
    static class C0648a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ OnCommitContentListener f2821a;

        C0648a(InputConnection inputConnection, boolean z, OnCommitContentListener onCommitContentListener) {
            this.f2821a = onCommitContentListener;
            super(inputConnection, z);
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f2821a.onCommitContent(C0651b.m3039a(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$b */
    static class C0649b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ OnCommitContentListener f2822a;

        C0649b(InputConnection inputConnection, boolean z, OnCommitContentListener onCommitContentListener) {
            this.f2822a = onCommitContentListener;
            super(inputConnection, z);
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (InputConnectionCompat.m3036a(str, bundle, this.f2822a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m3036a(java.lang.String r7, android.os.Bundle r8, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r9) {
        /*
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r0, r7)
            r0 = 0
            if (r7 != 0) goto L_0x000a
            return r0
        L_0x000a:
            if (r8 != 0) goto L_0x000d
            return r0
        L_0x000d:
            r7 = 0
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            android.os.Parcelable r1 = r8.getParcelable(r1)     // Catch:{ all -> 0x004d }
            android.os.ResultReceiver r1 = (android.os.ResultReceiver) r1     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x004b }
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ all -> 0x004b }
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x004b }
            android.content.ClipDescription r3 = (android.content.ClipDescription) r3     // Catch:{ all -> 0x004b }
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x004b }
            android.net.Uri r4 = (android.net.Uri) r4     // Catch:{ all -> 0x004b }
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            int r5 = r8.getInt(r5)     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            android.os.Parcelable r8 = r8.getParcelable(r6)     // Catch:{ all -> 0x004b }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ all -> 0x004b }
            androidx.core.view.inputmethod.b r6 = new androidx.core.view.inputmethod.b     // Catch:{ all -> 0x004b }
            r6.<init>(r2, r3, r4)     // Catch:{ all -> 0x004b }
            boolean r8 = r9.onCommitContent(r6, r5, r8)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a
            r1.send(r8, r7)
        L_0x004a:
            return r8
        L_0x004b:
            r8 = move-exception
            goto L_0x004f
        L_0x004d:
            r8 = move-exception
            r1 = r7
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.send(r0, r7)
        L_0x0054:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.inputmethod.InputConnectionCompat.m3036a(java.lang.String, android.os.Bundle, androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener):boolean");
    }

    /* renamed from: a */
    public static InputConnection m3035a(InputConnection inputConnection, EditorInfo editorInfo, OnCommitContentListener onCommitContentListener) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (onCommitContentListener == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        } else if (VERSION.SDK_INT >= 25) {
            return new C0648a(inputConnection, false, onCommitContentListener);
        } else {
            if (C0650a.m3038a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new C0649b(inputConnection, false, onCommitContentListener);
        }
    }
}
