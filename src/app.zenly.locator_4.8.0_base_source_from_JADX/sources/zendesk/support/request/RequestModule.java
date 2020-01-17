package zendesk.support.request;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.C13325v;
import zendesk.belvedere.C13489a;
import zendesk.commonui.UiConfig;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;
import zendesk.suas.C13609f;
import zendesk.suas.C13621h;
import zendesk.suas.C13623j;
import zendesk.suas.C13623j.C13624a;
import zendesk.suas.Dispatcher;
import zendesk.suas.Store;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
import zendesk.support.ZendeskDeepLinkHelper;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;

public class RequestModule {
    private final UiConfig uiConfig;

    RequestModule(UiConfig uiConfig2) {
        this.uiConfig = uiConfig2;
    }

    static ActionFactory providesActionFactory(RequestProvider requestProvider, SupportSettingsProvider supportSettingsProvider, UploadProvider uploadProvider, C13489a aVar, SupportUiStorage supportUiStorage, ExecutorService executorService, Executor executor, AuthenticationProvider authenticationProvider, SupportBlipsProvider supportBlipsProvider) {
        RequestProvider requestProvider2 = requestProvider;
        UploadProvider uploadProvider2 = uploadProvider;
        SupportSettingsProvider supportSettingsProvider2 = supportSettingsProvider;
        C13489a aVar2 = aVar;
        SupportUiStorage supportUiStorage2 = supportUiStorage;
        ExecutorService executorService2 = executorService;
        ActionFactory actionFactory = new ActionFactory(requestProvider2, uploadProvider2, supportSettingsProvider2, aVar2, supportUiStorage2, executorService2, "2.2.1", authenticationProvider, Zendesk.INSTANCE, supportBlipsProvider, executor);
        return actionFactory;
    }

    static AsyncMiddleware providesAsyncMiddleware() {
        return new AsyncMiddleware(new Queue());
    }

    static AttachmentDownloader providesAttachmentDownloader(C13489a aVar, AttachmentDownloadService attachmentDownloadService) {
        return new AttachmentDownloader(aVar, attachmentDownloadService);
    }

    static AttachmentDownloaderComponent providesAttachmentDownloaderComponent(Dispatcher dispatcher, ActionFactory actionFactory, AttachmentDownloader attachmentDownloader) {
        return new AttachmentDownloaderComponent(dispatcher, actionFactory, attachmentDownloader);
    }

    static AttachmentDownloadService providesAttachmentToDiskService(C13325v vVar, ExecutorService executorService) {
        return new AttachmentDownloadService(vVar, executorService);
    }

    static C13489a providesBelvedere(Context context) {
        return C13489a.m35734a(context);
    }

    static ComponentUpdateActionHandlers providesConversationsUpdatesComponent(Context context, ActionHandlerRegistry actionHandlerRegistry, LocalDataSource localDataSource) {
        return new ComponentUpdateActionHandlers(context, actionHandlerRegistry, localDataSource);
    }

    static PersistenceQueue providesDiskQueue(ExecutorService executorService) {
        return new PersistenceQueue(executorService);
    }

    static Dispatcher providesDispatcher(Store store) {
        return store;
    }

    static HeadlessComponentListener providesHeadlessComponentListener(ComponentPersistence componentPersistence, AttachmentDownloaderComponent attachmentDownloaderComponent, ComponentUpdateActionHandlers componentUpdateActionHandlers) {
        return new HeadlessComponentListener(componentPersistence, attachmentDownloaderComponent, componentUpdateActionHandlers);
    }

    static ComponentPersistence providesPersistenceComponent(SupportUiStorage supportUiStorage, PersistenceQueue persistenceQueue, ExecutorService executorService) {
        return new ComponentPersistence(supportUiStorage, persistenceQueue, executorService);
    }

    static List<C13621h> providesReducer() {
        return Arrays.asList(new C13621h[]{new ReducerProgress(), new ReducerConfiguration(), new ReducerConversation(), new ReducerAttachments(), new ReducerAndroidLifecycle(), new ReducerUiState(), new ReducerError()});
    }

    static Store providesStore(List<C13621h> list, AsyncMiddleware asyncMiddleware) {
        C13624a a = C13623j.m35945a(list);
        a.mo39273a(asyncMiddleware);
        a.mo39272a(C13609f.f35144b);
        return a.mo39271a();
    }

    /* access modifiers changed from: 0000 */
    public CellFactory providesMessageFactory(Context context, Picasso picasso, ActionFactory actionFactory, Dispatcher dispatcher, ZendeskDeepLinkHelper zendeskDeepLinkHelper) {
        CellFactory cellFactory = new CellFactory(context.getApplicationContext(), picasso, actionFactory, dispatcher, zendeskDeepLinkHelper, this.uiConfig);
        return cellFactory;
    }
}
