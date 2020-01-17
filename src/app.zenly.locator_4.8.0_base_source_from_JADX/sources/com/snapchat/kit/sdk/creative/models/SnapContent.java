package com.snapchat.kit.sdk.creative.models;

import com.snapchat.kit.sdk.creative.media.SnapSticker;
import java.io.File;

public abstract class SnapContent {

    /* renamed from: a */
    protected SnapSticker f30623a;

    /* renamed from: b */
    private String f30624b;

    /* renamed from: c */
    private String f30625c;

    public String getAttachmentUrl() {
        return this.f30624b;
    }

    public String getCaptionText() {
        return this.f30625c;
    }

    public abstract String getDeeplinkUrlPath();

    public abstract String getIntentType();

    public abstract File getMediaFile();

    public SnapSticker getSnapSticker() {
        return this.f30623a;
    }

    public void setAttachmentUrl(String str) {
        this.f30624b = str;
    }

    public void setCaptionText(String str) {
        this.f30625c = str;
    }

    public void setSnapSticker(SnapSticker snapSticker) {
        this.f30623a = snapSticker;
    }
}
