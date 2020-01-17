package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12139i;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.ImageStream;
import zendesk.belvedere.KeyboardHelper;
import zendesk.suas.C13605d;
import zendesk.suas.Listener;
import zendesk.suas.Store;
import zendesk.suas.Subscription;

public class RequestViewConversationsDisabled extends FrameLayout implements RequestView {
    private AppCompatActivity activity;

    /* renamed from: af */
    ActionFactory f35238af;
    private AttachmentHelper attachmentHelper;
    private ImageStream imageStream;
    private ComponentInputForm inputFormComponent;
    private List<MenuItemsDelegate> menuItemsDelegates = new ArrayList();
    Picasso picasso;
    Store store;
    private Subscription subscription;

    interface MenuItemsDelegate {
        void onMenuItemsClicked(MenuItem menuItem);

        void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2);
    }

    public RequestViewConversationsDisabled(Context context) {
        super(context);
        viewInit(context);
    }

    private Subscription bindAttachmentCarousel(Store store2, ActionFactory actionFactory) {
        RecyclerView recyclerView = (RecyclerView) this.activity.findViewById(C12136f.request_attachment_carousel);
        AdapterAttachmentCarousel adapterAttachmentCarousel = new AdapterAttachmentCarousel(this.attachmentHelper, this.picasso, actionFactory, store2);
        ComponentAttachmentCarousel componentAttachmentCarousel = new ComponentAttachmentCarousel(store2, actionFactory, this.imageStream, this.activity, this.attachmentHelper, recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.activity, 0, false));
        recyclerView.setAdapter(adapterAttachmentCarousel);
        this.menuItemsDelegates.add(componentAttachmentCarousel);
        return store2.addListener(componentAttachmentCarousel.getSelector(), (Listener<E>) componentAttachmentCarousel);
    }

    private Subscription bindComponents(Store store2, ActionFactory actionFactory) {
        return C13605d.m35914a(bindInput(store2), bindAttachmentCarousel(store2, actionFactory));
    }

    private Subscription bindInput(Store store2) {
        this.inputFormComponent = ComponentInputForm.create(this, store2, this.f35238af, this.attachmentHelper);
        this.menuItemsDelegates.add(this.inputFormComponent);
        this.imageStream.mo38776b().mo38812a((KeyboardHelper.Listener) this.inputFormComponent);
        return store2.addListener(this.inputFormComponent.getSelector(), (Listener<E>) this.inputFormComponent);
    }

    private void viewInit(Context context) {
        FrameLayout.inflate(context, C12138h.zs_view_request_conversations_disabled, this);
        this.activity = (AppCompatActivity) context;
    }

    public boolean hasUnsavedInput() {
        ComponentInputForm componentInputForm = this.inputFormComponent;
        return componentInputForm != null && componentInputForm.hasUnsavedInput();
    }

    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(C12139i.zs_view_request_conversations_disabled_menu, menu);
        MenuItem findItem = menu.findItem(C12136f.request_conversations_disabled_menu_ic_send);
        MenuItem findItem2 = menu.findItem(C12136f.request_conversations_disabled_menu_ic_add_attachments);
        for (MenuItemsDelegate onMenuItemsInflated : this.menuItemsDelegates) {
            onMenuItemsInflated.onMenuItemsInflated(findItem, findItem2);
        }
        return true;
    }

    public void init(RequestComponent requestComponent) {
        requestComponent.inject(this);
        this.imageStream = BelvedereUi.m35621a(this.activity);
        this.attachmentHelper = new AttachmentHelper(new int[0]);
        this.subscription = bindComponents(this.store, this.f35238af);
        this.subscription.informWithCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription2 = this.subscription;
        if (subscription2 != null) {
            subscription2.removeListener();
        }
    }

    public boolean onOptionsItemClicked(MenuItem menuItem) {
        for (MenuItemsDelegate onMenuItemsClicked : this.menuItemsDelegates) {
            onMenuItemsClicked.onMenuItemsClicked(menuItem);
        }
        return true;
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }
}
