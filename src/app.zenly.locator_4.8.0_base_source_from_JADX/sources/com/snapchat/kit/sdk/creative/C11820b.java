package com.snapchat.kit.sdk.creative;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi_Factory;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory_Factory;
import com.snapchat.kit.sdk.creative.media.SnapSticker;
import com.snapchat.kit.sdk.creative.models.SnapContent;
import com.snapchat.kit.sdk.creative.p331c.C11825a;
import com.snapchat.kit.sdk.creative.p331c.C11826b;
import com.snapchat.kit.sdk.creative.p331c.C11827c;
import com.snapchat.kit.sdk.creative.p331c.C11828d;
import com.snapchat.kit.sdk.util.SnapUtils;
import dagger.internal.C12020b;
import dagger.internal.C12021c;
import java.util.ArrayList;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.creative.b */
public final class C11820b implements CreativeComponent {

    /* renamed from: a */
    private SnapKitComponent f30601a;

    /* renamed from: b */
    private Provider<MetricQueue<OpMetric>> f30602b;

    /* renamed from: c */
    private Provider<C11827c> f30603c;

    /* renamed from: com.snapchat.kit.sdk.creative.b$b */
    public static final class C11822b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public SnapKitComponent f30604a;

        private C11822b() {
        }

        /* renamed from: a */
        public CreativeComponent mo34962a() {
            if (this.f30604a != null) {
                return new C11820b(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(SnapKitComponent.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public C11822b mo34963a(SnapKitComponent snapKitComponent) {
            C12021c.m31670a(snapKitComponent);
            this.f30604a = snapKitComponent;
            return this;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.creative.b$c */
    private static class C11823c implements Provider<MetricQueue<OpMetric>> {

        /* renamed from: a */
        private final SnapKitComponent f30605a;

        C11823c(SnapKitComponent snapKitComponent) {
            this.f30605a = snapKitComponent;
        }

        /* renamed from: a */
        public MetricQueue<OpMetric> get() {
            MetricQueue<OpMetric> operationalMetricsQueue = this.f30605a.operationalMetricsQueue();
            C12021c.m31671a(operationalMetricsQueue, "Cannot return null from a non-@Nullable component method");
            return operationalMetricsQueue;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.creative.b$d */
    public class C11824d {

        /* renamed from: a */
        private final SnapContent f30606a;

        /* renamed from: b */
        private final String f30607b;

        public C11824d(String str, SnapContent snapContent) {
            this.f30607b = str;
            this.f30606a = snapContent;
        }

        /* renamed from: a */
        public Intent mo34965a(Context context) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setDataAndType(Uri.parse(String.format("snapchat://%s?link=%s", new Object[]{this.f30606a.getDeeplinkUrlPath(), this.f30607b})), this.f30606a.getIntentType());
            Uri fileProviderUri = SnapUtils.getFileProviderUri(context, this.f30606a.getMediaFile());
            SnapSticker snapSticker = this.f30606a.getSnapSticker();
            String str = "android.intent.extra.STREAM";
            if (snapSticker != null) {
                Uri fileProviderUri2 = SnapUtils.getFileProviderUri(context, snapSticker.getStickerFile());
                intent.putExtra("sticker", snapSticker.getJsonForm(fileProviderUri2).toString());
                ArrayList arrayList = new ArrayList();
                if (fileProviderUri != null) {
                    arrayList.add(fileProviderUri);
                }
                arrayList.add(fileProviderUri2);
                if (arrayList.size() > 1) {
                    intent.putParcelableArrayListExtra(str, arrayList);
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                } else if (!arrayList.isEmpty()) {
                    intent.putExtra(str, (Parcelable) arrayList.get(0));
                }
            } else if (fileProviderUri != null) {
                intent.putExtra(str, fileProviderUri);
            }
            String attachmentUrl = this.f30606a.getAttachmentUrl();
            if (!TextUtils.isEmpty(attachmentUrl)) {
                intent.putExtra("attachmentUrl", attachmentUrl);
            }
            String captionText = this.f30606a.getCaptionText();
            if (!TextUtils.isEmpty(captionText)) {
                intent.putExtra("captionText", captionText);
            }
            return intent;
        }
    }

    /* renamed from: a */
    public static C11822b m31012a() {
        return new C11822b();
    }

    /* renamed from: b */
    private C11825a m31014b() {
        KitEventBaseFactory kitEventBaseFactory = this.f30601a.kitEventBaseFactory();
        C12021c.m31671a(kitEventBaseFactory, "Cannot return null from a non-@Nullable component method");
        return C11826b.m31023a(kitEventBaseFactory);
    }

    public SnapCreativeKitApi getApi() {
        Context context = this.f30601a.context();
        String str = "Cannot return null from a non-@Nullable component method";
        C12021c.m31671a(context, str);
        Context context2 = context;
        String clientId = this.f30601a.clientId();
        C12021c.m31671a(clientId, str);
        String str2 = clientId;
        String redirectUrl = this.f30601a.redirectUrl();
        C12021c.m31671a(redirectUrl, str);
        String str3 = redirectUrl;
        C11827c cVar = (C11827c) this.f30603c.get();
        MetricQueue analyticsEventQueue = this.f30601a.analyticsEventQueue();
        C12021c.m31671a(analyticsEventQueue, str);
        return SnapCreativeKitApi_Factory.newSnapCreativeKitApi(context2, str2, str3, cVar, analyticsEventQueue, m31014b());
    }

    public SnapMediaFactory getMediaFactory() {
        return SnapMediaFactory_Factory.newSnapMediaFactory((C11827c) this.f30603c.get());
    }

    private C11820b(C11822b bVar) {
        m31013a(bVar);
    }

    /* renamed from: a */
    private void m31013a(C11822b bVar) {
        this.f30601a = bVar.f30604a;
        this.f30602b = new C11823c(bVar.f30604a);
        this.f30603c = C12020b.m31669b(C11828d.m31027a(this.f30602b));
    }
}
