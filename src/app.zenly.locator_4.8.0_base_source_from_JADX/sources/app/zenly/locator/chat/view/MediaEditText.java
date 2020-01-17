package app.zenly.locator.chat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.inputmethod.C0650a;
import androidx.core.view.inputmethod.C0651b;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import com.bumptech.glide.load.engine.C8978i;
import java.io.File;
import java.io.FileOutputStream;

public class MediaEditText extends AppCompatEditText {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageListener f7147h;

    public interface ImageListener {
        void onImageSelected(String str, int i, int i2);
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: app.zenly.locator.chat.view.MediaEditText$a */
    private class C2359a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private final C0651b f7148a;

        C2359a(C0651b bVar) {
            this.f7148a = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            String str = null;
            try {
                byte[] bArr = (byte[]) C2476d.m8582a(MediaEditText.this.getContext()).m8716a(byte[].class).m8678a(this.f7148a.mo3417a()).m8691a(C8978i.f23424b).m8695a(true).mo8542f().mo24175c(ItemAnimator.FLAG_MOVED, ItemAnimator.FLAG_MOVED).get();
                File a = C3231q.m10235a(MediaEditText.this.getContext(), C3232a.PICTURES);
                if (a == null) {
                    return null;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(a);
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
                str = a.getAbsolutePath();
                return str;
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                this.f7148a.mo3418b();
            } catch (Exception unused) {
            }
            if (str != null) {
                C2476d.m8582a(MediaEditText.this.getContext()).mo8550a(str).mo24170M().getSize(new C2368i(this, str));
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo8302a(String str, int i, int i2) {
            if (MediaEditText.this.f7147h != null) {
                MediaEditText.this.f7147h.onImageSelected(str, i, i2);
            }
        }
    }

    public MediaEditText(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0650a.m3037a(editorInfo, new String[]{"image/jpg", "image/png"});
        return InputConnectionCompat.m3035a(onCreateInputConnection, editorInfo, (OnCommitContentListener) new C2369j(this));
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        clearFocus();
        return false;
    }

    public void setImageListener(ImageListener imageListener) {
        this.f7147h = imageListener;
    }

    public MediaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo8297a(C0651b bVar, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                bVar.mo3419c();
            } catch (Exception unused) {
                return false;
            }
        }
        new C2359a(bVar).execute(new Void[0]);
        return true;
    }

    public MediaEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
