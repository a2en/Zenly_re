package com.snapchat.kit.sdk.creative.models;

import java.io.File;

public final class SnapLiveCameraContent extends SnapContent {
    public String getDeeplinkUrlPath() {
        return "camera";
    }

    public String getIntentType() {
        return "*/*";
    }

    public File getMediaFile() {
        return null;
    }
}
