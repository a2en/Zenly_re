package com.snapchat.kit.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SnapKitActivity extends Activity {

    /* renamed from: e */
    OAuth2Manager f30466e;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        SnapKitComponent component = SnapKit.getComponent(this);
        if (component == null) {
            finish();
            return;
        }
        component.inject(this);
        if (this.f30466e.mo34579a(intent)) {
            this.f30466e.mo34573a(intent.getData());
        }
        finish();
    }
}
