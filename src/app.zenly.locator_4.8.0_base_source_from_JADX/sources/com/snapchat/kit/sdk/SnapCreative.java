package com.snapchat.kit.sdk;

import android.content.Context;
import com.snapchat.kit.sdk.creative.C11820b;
import com.snapchat.kit.sdk.creative.C11820b.C11822b;
import com.snapchat.kit.sdk.creative.CreativeComponent;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;

public class SnapCreative {

    /* renamed from: a */
    static CreativeComponent f30463a;

    /* renamed from: a */
    static synchronized CreativeComponent m30896a(Context context) {
        CreativeComponent creativeComponent;
        synchronized (SnapCreative.class) {
            if (f30463a == null) {
                C11822b a = C11820b.m31012a();
                a.mo34963a(SnapKit.getComponent(context));
                f30463a = a.mo34962a();
            }
            creativeComponent = f30463a;
        }
        return creativeComponent;
    }

    public static SnapCreativeKitApi getApi(Context context) {
        return m30896a(context).getApi();
    }

    public static SnapMediaFactory getMediaFactory(Context context) {
        return m30896a(context).getMediaFactory();
    }
}
