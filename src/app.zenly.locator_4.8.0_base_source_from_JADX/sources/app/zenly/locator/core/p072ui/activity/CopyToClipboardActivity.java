package app.zenly.locator.core.p072ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import app.zenly.locator.core.util.C3199e;

/* renamed from: app.zenly.locator.core.ui.activity.CopyToClipboardActivity */
public final class CopyToClipboardActivity extends Activity {
    /* renamed from: a */
    public static Intent m9607a(Context context, String str) {
        return new Intent(context, CopyToClipboardActivity.class).putExtra("android.intent.extra.TEXT", str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3199e.m10178a(this, getIntent().getStringExtra("android.intent.extra.TEXT"));
        finish();
    }
}
