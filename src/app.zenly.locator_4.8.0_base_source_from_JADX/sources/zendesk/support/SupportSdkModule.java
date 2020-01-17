package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.C11125d;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.C11844b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.C13325v;
import p333g.p369e.p370a.C12095a;
import p333g.p369e.p371b.C12105a;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.SessionStorage;
import zendesk.support.ZendeskDeepLinkParser.Module;
import zendesk.support.requestlist.RequestInfoDataSource.Disk;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;

class SupportSdkModule {
    SupportSdkModule() {
    }

    /* access modifiers changed from: 0000 */
    public Executor mainThreadExecutor() {
        return new Executor(this) {
            Handler handler = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public C11125d provides() {
        return new C11125d();
    }

    /* access modifiers changed from: 0000 */
    public List<ActionHandler> providesActionHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ViewArticleActionHandler());
        arrayList.add(new DeepLinkToRequestActionHandler());
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public ZendeskDeepLinkHelper providesDeepLinkHelper(ActionHandlerRegistry actionHandlerRegistry, ZendeskDeepLinkParser zendeskDeepLinkParser) {
        return new ZendeskDeepLinkHelper(actionHandlerRegistry, zendeskDeepLinkParser);
    }

    /* access modifiers changed from: 0000 */
    public ZendeskDeepLinkParser providesDeepLinkParser(String str, List<Module> list) {
        return new ZendeskDeepLinkParser(str, list);
    }

    /* access modifiers changed from: 0000 */
    public List<Module> providesParserModule() {
        return Collections.singletonList(new ViewArticleDeepLinkParser());
    }

    /* access modifiers changed from: 0000 */
    public Picasso providesPicasso(Context context, C13325v vVar, ExecutorService executorService) {
        C11844b bVar = new C11844b(context);
        bVar.mo35043a(executorService);
        bVar.mo35041a(Config.RGB_565);
        bVar.mo35042a((Downloader) new C12105a(vVar));
        return bVar.mo35044a();
    }

    /* access modifiers changed from: 0000 */
    public C12095a providesRequestDiskLruCache(SessionStorage sessionStorage) {
        try {
            return C12095a.m31914a(new File(sessionStorage.getZendeskDataDir(), "request"), 1, 1, 20971520);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"RestrictedApi"})
    public String providesZendeskUrl(ApplicationConfiguration applicationConfiguration) {
        return applicationConfiguration.getZendeskUrl();
    }

    /* access modifiers changed from: 0000 */
    public LocalDataSource requestInfoDataSource(SupportUiStorage supportUiStorage, Executor executor, ExecutorService executorService) {
        return new LocalDataSource(new Disk(executor, executorService, supportUiStorage, "local_request_infos"));
    }

    /* access modifiers changed from: 0000 */
    public SupportUiStorage supportUIStorage(C12095a aVar, C11125d dVar) {
        return new SupportUiStorage(aVar, dVar);
    }
}
