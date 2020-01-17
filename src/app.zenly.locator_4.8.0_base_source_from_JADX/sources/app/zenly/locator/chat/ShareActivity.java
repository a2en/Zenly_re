package app.zenly.locator.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.app.C0535j.C0537b;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.locator.R;
import app.zenly.locator.chat.p053m5.C2097a;
import app.zenly.locator.chat.p059r5.C2303a;
import app.zenly.locator.core.app.ConductorActivity;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.sharesheet.ShareSheetController.C5595e;
import app.zenly.locator.sharesheet.ShareSheetController.OnTargetSelectedListener;
import com.bluelinelabs.conductor.C8819d;
import com.bumptech.glide.load.engine.C8978i;
import java.io.File;
import java.io.FileOutputStream;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7224u;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest;
import p389io.reactivex.functions.Consumer;

public class ShareActivity extends ConductorActivity implements OnTargetSelectedListener {

    /* renamed from: o */
    private String f6148o;

    /* renamed from: p */
    private Uri f6149p;

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: app.zenly.locator.chat.ShareActivity$a */
    private class C1872a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private final String[] f6150a;

        /* renamed from: b */
        private final Uri f6151b;

        C1872a(String[] strArr, Uri uri) {
            this.f6150a = strArr;
            this.f6151b = uri;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                byte[] bArr = (byte[]) C2476d.m8582a(ShareActivity.this.getApplicationContext()).m8716a(byte[].class).m8678a(this.f6151b).m8691a(C8978i.f23424b).m8695a(true).mo8542f().mo24175c(ItemAnimator.FLAG_MOVED, ItemAnimator.FLAG_MOVED).get();
                String[] strArr = this.f6150a;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    try {
                        File a = C3231q.m10235a((Context) ShareActivity.this, C3232a.PICTURES);
                        if (a == null) {
                            return Boolean.valueOf(false);
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(a);
                        fileOutputStream.write(bArr);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        ShareActivity.this.m7430a(str, C2097a.m7847a(a.getAbsolutePath(), 0, 0));
                        i++;
                    } catch (Exception unused) {
                        return Boolean.valueOf(false);
                    }
                }
                return Boolean.valueOf(true);
            } catch (Exception unused2) {
                return Boolean.valueOf(false);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            if (!bool.booleanValue()) {
                Toast.makeText(ShareActivity.this, R.string.commons_content_oopserror, 0).show();
            }
            ShareActivity.this.finish();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7429a(C7224u uVar) throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C8819d mo7317e() {
        C5595e eVar = new C5595e();
        eVar.mo13236a((int) R.string.media_send_to_button);
        return eVar.mo13238a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0537b a = C0537b.m2520a(this);
        if (!a.mo3062c()) {
            finish();
            return;
        }
        CharSequence b = a.mo3061b();
        if (b != null) {
            this.f6148o = b.toString();
        } else {
            this.f6149p = a.mo3060a();
            if (this.f6149p == null) {
                finish();
            }
        }
    }

    public void onTargetSelected(String[] strArr) {
        Uri uri = this.f6149p;
        if (uri != null) {
            new C1872a(strArr, uri).execute(new Void[0]);
            return;
        }
        C2097a a = C2097a.m7846a(this.f6148o);
        for (String a2 : strArr) {
            m7430a(a2, a);
        }
        finish();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public void m7430a(String str, C2097a aVar) {
        C7117i chatGetConversationCache = C5448c.m15478a().chatGetConversationCache(str);
        if (chatGetConversationCache == null) {
            Toast.makeText(this, R.string.commons_title_oopserror, 0).show();
            return;
        }
        C5448c.m15478a().chatSendMessage((ZenlyProto$ChatSendMessageMultiRequest) C2303a.m8210b(aVar, chatGetConversationCache.getInboxUuid()).build()).mo36412a((Consumer<? super T>) C2008i4.f6417e, (Consumer<? super Throwable>) new C2015j4<Object>(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7589a(Throwable th) throws Exception {
        Toast.makeText(this, R.string.commons_title_oopserror, 0).show();
    }
}
