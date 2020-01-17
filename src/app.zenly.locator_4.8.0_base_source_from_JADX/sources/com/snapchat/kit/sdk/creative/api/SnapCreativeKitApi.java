package com.snapchat.kit.sdk.creative.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.creative.C11819a;
import com.snapchat.kit.sdk.creative.C11820b.C11824d;
import com.snapchat.kit.sdk.creative.models.SnapContent;
import com.snapchat.kit.sdk.creative.p331c.C11825a;
import com.snapchat.kit.sdk.creative.p331c.C11827c;
import com.snapchat.kit.sdk.util.SnapUtils;

public class SnapCreativeKitApi {
    private static final String CLIENT_ID_EXTRA = "CLIENT_ID";
    private static final String DEEP_LINK_INTENT_EXTRA = "deep_link_intent";
    private static final String KIT_REDIRECT_URL_EXTRA = "KIT_REDIRECT_URL";
    private static final String KIT_VERSION_CODE_EXTRA = "KIT_VERSION_CODE";
    private static final String KIT_VERSION_EXTRA = "KIT_VERSION";
    private static final int REQUEST_CODE = 17;
    private static final String RESULT_INTENT_EXTRA = "RESULT_INTENT";
    private static final String TAG = "SnapCreativeKitApi";
    private final String mClientId;
    private final Context mContext;
    private final C11825a mEventFactory;
    private final MetricQueue<ServerEvent> mEventQueue;
    private C11827c mOpMetricsManager;
    private String mRedirectUrl;

    SnapCreativeKitApi(Context context, String str, String str2, C11827c cVar, MetricQueue<ServerEvent> metricQueue, C11825a aVar) {
        this.mContext = context;
        this.mClientId = str;
        this.mRedirectUrl = str2;
        this.mOpMetricsManager = cVar;
        this.mEventQueue = metricQueue;
        this.mEventFactory = aVar;
    }

    public void send(SnapContent snapContent) {
        sendWithCompletionHandler(snapContent, null);
    }

    public void sendWithCompletionHandler(SnapContent snapContent, SnapCreativeKitCompletionCallback snapCreativeKitCompletionCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        C11824d dVar = new C11824d(this.mClientId, snapContent);
        PackageManager packageManager = this.mContext.getPackageManager();
        String str = "com.snapchat.android";
        if (!SnapUtils.isSnapchatInstalled(packageManager, str)) {
            this.mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s", new Object[]{str}))));
            this.mOpMetricsManager.mo34967a("sendToPlayStore", 1);
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendFailed(SnapCreativeKitSendError.SNAPCHAT_NOT_INSTALLED);
            }
            return;
        }
        this.mOpMetricsManager.mo34967a("sendIntentToApp", 1);
        Intent a = dVar.mo34965a(this.mContext);
        a.setPackage(str);
        a.putExtra(CLIENT_ID_EXTRA, this.mClientId);
        a.putExtra(KIT_VERSION_EXTRA, "1.1.4");
        a.putExtra(KIT_VERSION_CODE_EXTRA, 11);
        a.putExtra(DEEP_LINK_INTENT_EXTRA, true);
        if (!TextUtils.isEmpty(this.mRedirectUrl)) {
            a.putExtra(KIT_REDIRECT_URL_EXTRA, this.mRedirectUrl);
        }
        a.putExtra(RESULT_INTENT_EXTRA, PendingIntent.getBroadcast(this.mContext, 17, new Intent(), 1073741824));
        a.setFlags(335544320);
        if (a.resolveActivity(packageManager) != null) {
            this.mEventQueue.push(this.mEventFactory.mo34966a());
            this.mContext.startActivity(a);
            this.mOpMetricsManager.mo34968b("sendLatency", System.currentTimeMillis() - currentTimeMillis);
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendSuccess();
            }
        } else {
            this.mOpMetricsManager.mo34967a("cannotShareContent", 1);
            Toast.makeText(this.mContext, C11819a.snap_connect_snap_error_cannot_share_content, 0).show();
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendFailed(SnapCreativeKitSendError.SNAPCHAT_CANNOT_SHARE_CONTENT);
            }
        }
    }
}
