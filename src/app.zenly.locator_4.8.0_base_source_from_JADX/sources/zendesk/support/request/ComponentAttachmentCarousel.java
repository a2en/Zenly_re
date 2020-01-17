package zendesk.support.request;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import p333g.p384h.p385a.C12136f;
import zendesk.belvedere.ImageStream;
import zendesk.belvedere.ImageStream.Listener;
import zendesk.belvedere.MediaResult;
import zendesk.suas.C13622i;
import zendesk.suas.Dispatcher;
import zendesk.suas.StateSelector;

class ComponentAttachmentCarousel implements Listener, zendesk.suas.Listener<AttachmentCarouselModel>, MenuItemsDelegate {
    private final ActionFactory actionFactory;
    private final AppCompatActivity activity;
    private MenuItem attachmentButton;
    private final AttachmentHelper attachmentHelper;
    private boolean attachmentSupportEnabled = false;
    private final Dispatcher dispatcher;
    private final ImageStream imageStream;
    private final RecyclerView recyclerView;
    /* access modifiers changed from: private */
    public final ScrollView scrollView;
    private final StateSelector<AttachmentCarouselModel> selector;

    static class AttachmentCarouselModel {
        private final Collection<StateRequestAttachment> additionalAttachments;
        private final boolean isAttachmentSupportEnabled;
        private final boolean isLoading;
        private final long maxAttachmentSize;
        private final Collection<StateRequestAttachment> selectedAttachments;

        AttachmentCarouselModel(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2, boolean z, boolean z2, long j) {
            this.selectedAttachments = collection;
            this.additionalAttachments = collection2;
            this.isLoading = z;
            this.isAttachmentSupportEnabled = z2;
            this.maxAttachmentSize = j;
        }

        /* access modifiers changed from: 0000 */
        public Collection<StateRequestAttachment> getAdditionalAttachments() {
            return this.additionalAttachments;
        }

        /* access modifiers changed from: 0000 */
        public long getMaxAttachmentSize() {
            return this.maxAttachmentSize;
        }

        /* access modifiers changed from: 0000 */
        public Collection<StateRequestAttachment> getSelectedAttachments() {
            return this.selectedAttachments;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAttachmentSupportEnabled() {
            return this.isAttachmentSupportEnabled;
        }

        /* access modifiers changed from: 0000 */
        public boolean isLoading() {
            return this.isLoading;
        }
    }

    static class AttachmentCarouselSelector implements StateSelector<AttachmentCarouselModel> {
        AttachmentCarouselSelector() {
        }

        public AttachmentCarouselModel selectData(C13622i iVar) {
            StateAttachments fromState = StateAttachments.fromState(iVar);
            StateConfig fromState2 = StateConfig.fromState(iVar);
            AttachmentCarouselModel attachmentCarouselModel = new AttachmentCarouselModel(fromState.getSelectedAttachments(), fromState.getAllSelectedAttachments(), StateProgress.fomState(iVar).getRunningRequests() > 0, fromState2.getSettings().isAttachmentsEnabled(), fromState2.getSettings().getMaxAttachmentSize());
            return attachmentCarouselModel;
        }
    }

    ComponentAttachmentCarousel(Dispatcher dispatcher2, ActionFactory actionFactory2, ImageStream imageStream2, AppCompatActivity appCompatActivity, AttachmentHelper attachmentHelper2, RecyclerView recyclerView2) {
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.imageStream = imageStream2;
        this.activity = appCompatActivity;
        this.attachmentHelper = attachmentHelper2;
        this.recyclerView = recyclerView2;
        this.scrollView = (ScrollView) appCompatActivity.findViewById(C12136f.request_conversations_disabled_scrollview);
        this.selector = new AttachmentCarouselSelector();
        initImagePicker();
    }

    private void attachmentButtonVisibility(boolean z, boolean z2) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            menuItem.setVisible(z);
            this.attachmentButton.getActionView().setEnabled(z2);
        }
    }

    private void attachmentCount(int i) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            ((ViewCellAttachmentMenuItem) menuItem.getActionView()).setBadgeCount(i);
        }
    }

    private void initImagePicker() {
        this.imageStream.mo38772a((Listener) this);
        if (this.imageStream.mo38776b().getInputTrap().hasFocus()) {
            this.scrollView.requestFocus();
        }
        if (this.imageStream.mo38781f()) {
            this.scrollView.post(new Runnable() {
                public void run() {
                    ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void onAddAttachmentsRequested(boolean z) {
        if (!this.imageStream.mo38778c()) {
            this.attachmentHelper.showImagePicker(this.activity);
        } else if (z) {
            this.imageStream.mo38768a();
        }
    }

    private void scroll(final int i) {
        this.scrollView.post(new Runnable() {
            public void run() {
                ComponentAttachmentCarousel.this.scrollView.fullScroll(i);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public StateSelector<AttachmentCarouselModel> getSelector() {
        return this.selector;
    }

    public void onDismissed() {
        this.scrollView.requestFocus();
        scroll(33);
    }

    public void onMediaDeselected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.deselectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    public void onMediaSelected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.selectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    public void onMenuItemsClicked(MenuItem menuItem) {
    }

    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.attachmentButton = menuItem2;
        menuItem2.getActionView().setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
            }
        });
        attachmentButtonVisibility(this.attachmentSupportEnabled, true);
    }

    public void onVisible() {
        scroll(130);
    }

    public void update(AttachmentCarouselModel attachmentCarouselModel) {
        this.attachmentSupportEnabled = attachmentCarouselModel.isAttachmentSupportEnabled();
        attachmentButtonVisibility(this.attachmentSupportEnabled, !attachmentCarouselModel.isLoading());
        if (!attachmentCarouselModel.isLoading()) {
            this.attachmentHelper.updateAttachments(attachmentCarouselModel.getSelectedAttachments(), attachmentCarouselModel.getAdditionalAttachments());
            this.attachmentHelper.updateMaxFileSize(attachmentCarouselModel.getMaxAttachmentSize());
            attachmentCount(this.attachmentHelper.getSelectedAttachments().size());
            if (this.attachmentHelper.getSelectedAttachments().size() > 0) {
                scroll(130);
            } else {
                scroll(33);
            }
            this.recyclerView.getAdapter().notifyDataSetChanged();
        }
    }
}
