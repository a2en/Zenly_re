package com.snapchat.kit.sdk.creative;

import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;

public interface CreativeComponent {
    SnapCreativeKitApi getApi();

    SnapMediaFactory getMediaFactory();
}
