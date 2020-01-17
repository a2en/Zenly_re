package p333g.p369e.p371b;

import android.net.Uri;
import com.squareup.picasso.C11882n;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Downloader.C11841a;
import com.squareup.picasso.Downloader.ResponseException;
import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13170b0;
import okhttp3.C13204g;
import okhttp3.C13211h;
import okhttp3.C13211h.C13212a;
import okhttp3.C13325v;
import okhttp3.C13331y.C13332a;
import okhttp3.Call.Factory;

/* renamed from: g.e.b.a */
public final class C12105a implements Downloader {

    /* renamed from: a */
    private final Factory f31529a;

    /* renamed from: b */
    private final C13204g f31530b;

    public C12105a(C13325v vVar) {
        this.f31529a = vVar;
        this.f31530b = vVar.mo38331b();
    }

    public C11841a load(Uri uri, int i) throws IOException {
        C13211h hVar;
        if (i == 0) {
            hVar = null;
        } else if (C11882n.m31204a(i)) {
            hVar = C13211h.f33947n;
        } else {
            C13212a aVar = new C13212a();
            if (!C11882n.m31205b(i)) {
                aVar.mo37954b();
            }
            if (!C11882n.m31206c(i)) {
                aVar.mo37955c();
            }
            hVar = aVar.mo37953a();
        }
        C13332a aVar2 = new C13332a();
        aVar2.mo38402b(uri.toString());
        if (hVar != null) {
            aVar2.mo38396a(hVar);
        }
        C13167a0 execute = this.f31529a.newCall(aVar2.mo38400a()).execute();
        int d = execute.mo37793d();
        if (d < 300) {
            boolean z = execute.mo37791c() != null;
            C13170b0 a = execute.mo37789a();
            return new C11841a(a.mo37823a(), z, a.mo37827d());
        }
        execute.mo37789a().close();
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(" ");
        sb.append(execute.mo37797h());
        throw new ResponseException(sb.toString(), i, d);
    }

    public void shutdown() {
        C13204g gVar = this.f31530b;
        if (gVar != null) {
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
