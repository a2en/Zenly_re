package com.snapchat.kit.sdk.creative.models;

import com.snapchat.kit.sdk.creative.media.SnapPhotoFile;
import java.io.File;

public final class SnapPhotoContent extends SnapContent {

    /* renamed from: d */
    private SnapPhotoFile f30626d;

    public SnapPhotoContent(SnapPhotoFile snapPhotoFile) {
        this.f30626d = snapPhotoFile;
    }

    public String getDeeplinkUrlPath() {
        return "preview";
    }

    public String getIntentType() {
        return "image/*";
    }

    public File getMediaFile() {
        return this.f30626d.getPhotoFile();
    }
}
