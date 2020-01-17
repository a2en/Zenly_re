package com.snapchat.kit.sdk.creative.models;

import com.snapchat.kit.sdk.creative.media.SnapVideoFile;
import java.io.File;

public final class SnapVideoContent extends SnapContent {

    /* renamed from: d */
    private SnapVideoFile f30627d;

    public SnapVideoContent(SnapVideoFile snapVideoFile) {
        this.f30627d = snapVideoFile;
    }

    public String getDeeplinkUrlPath() {
        return "preview";
    }

    public String getIntentType() {
        return "snapvideo/*";
    }

    public File getMediaFile() {
        return this.f30627d.getVideoFile();
    }
}
