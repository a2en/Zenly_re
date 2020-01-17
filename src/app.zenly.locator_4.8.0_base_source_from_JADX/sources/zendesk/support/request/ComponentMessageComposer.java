package zendesk.support.request;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p333g.p384h.p385a.C12136f;
import zendesk.belvedere.ImageStream;
import zendesk.belvedere.MediaResult;
import zendesk.suas.C13622i;
import zendesk.suas.Dispatcher;
import zendesk.suas.Listener;
import zendesk.suas.StateSelector;
import zendesk.support.RequestStatus;
import zendesk.support.UiUtils;

class ComponentMessageComposer implements Listener<MessageComposerModel>, InputListener, ImageStream.Listener {
    private final ActionFactory actionFactory;
    private final AppCompatActivity activity;
    private final AttachmentHelper attachmentHelper = new AttachmentHelper(C12136f.attachments_indicator_icon, C12136f.message_composer_send_btn);
    private final Dispatcher dispatcher;
    private final ImageStream imageStream;
    /* access modifiers changed from: private */
    public final ViewMessageComposer messageComposerView;
    private final MessageComposerSelector messageFieldSelector = new MessageComposerSelector();

    static class MessageComposerModel {
        private final boolean attachmentsButtonEnabled;
        private final List<StateRequestAttachment> extraAttachments;
        private final long maxFileSize;
        private final boolean messageComposerVisible;
        private final List<StateRequestAttachment> requestAttachments;
        private final boolean sendButtonEnabled;

        MessageComposerModel(List<StateRequestAttachment> list, List<StateRequestAttachment> list2, long j, boolean z, boolean z2, boolean z3) {
            this.requestAttachments = list;
            this.extraAttachments = list2;
            this.maxFileSize = j;
            this.sendButtonEnabled = z;
            this.attachmentsButtonEnabled = z2;
            this.messageComposerVisible = z3;
        }

        /* access modifiers changed from: 0000 */
        public List<StateRequestAttachment> getExtraAttachments() {
            return this.extraAttachments;
        }

        /* access modifiers changed from: 0000 */
        public long getMaxFileSize() {
            return this.maxFileSize;
        }

        /* access modifiers changed from: 0000 */
        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAttachmentsButtonEnabled() {
            return this.attachmentsButtonEnabled;
        }

        /* access modifiers changed from: 0000 */
        public boolean isMessageComposerVisible() {
            return this.messageComposerVisible;
        }

        /* access modifiers changed from: 0000 */
        public boolean isSendButtonEnabled() {
            return this.sendButtonEnabled;
        }
    }

    static class MessageComposerSelector implements StateSelector<MessageComposerModel> {
        MessageComposerSelector() {
        }

        public MessageComposerModel selectData(C13622i iVar) {
            StateAttachments fromState = StateAttachments.fromState(iVar);
            StateConfig fromState2 = StateConfig.fromState(iVar);
            StateConversation fromState3 = StateConversation.fromState(iVar);
            MessageComposerModel messageComposerModel = new MessageComposerModel(C12010a.m31632a(fromState.getSelectedAttachments()), new ArrayList(fromState.getAllSelectedAttachments()), fromState2.getSettings().getMaxAttachmentSize(), C12017g.m31658b(fromState3.getRemoteId()), fromState2.getSettings().isAttachmentsEnabled(), fromState3.getStatus() != RequestStatus.Closed);
            return messageComposerModel;
        }
    }

    ComponentMessageComposer(AppCompatActivity appCompatActivity, ImageStream imageStream2, ViewMessageComposer viewMessageComposer, Dispatcher dispatcher2, ActionFactory actionFactory2) {
        this.activity = appCompatActivity;
        this.messageComposerView = viewMessageComposer;
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.imageStream = imageStream2;
        viewMessageComposer.addListener(this);
        initImagePicker();
    }

    private void initImagePicker() {
        this.imageStream.mo38772a((ImageStream.Listener) this);
        if (this.imageStream.mo38776b().getInputTrap().hasFocus()) {
            this.messageComposerView.requestFocusForInput();
        }
        if (this.imageStream.mo38781f()) {
            this.messageComposerView.post(new Runnable() {
                public void run() {
                    ComponentMessageComposer.this.onAddAttachmentsRequested();
                }
            });
        }
    }

    public StateSelector<MessageComposerModel> getSelector() {
        return this.messageFieldSelector;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasUnsavedInput() {
        return C12017g.m31658b(this.messageComposerView.getMessage()) || C12010a.m31639b((Collection<Type>) this.attachmentHelper.getSelectedAttachments());
    }

    public void onAddAttachmentsRequested() {
        if (!this.imageStream.mo38778c()) {
            this.attachmentHelper.showImagePicker(this.activity);
        } else {
            this.imageStream.mo38768a();
        }
    }

    public void onDismissed() {
        this.messageComposerView.requestFocusForInput();
    }

    public void onMediaDeselected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.deselectAttachment(list));
        if (!this.imageStream.mo38778c()) {
            onAddAttachmentsRequested();
        }
    }

    public void onMediaSelected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.selectAttachment(list));
        if (!this.imageStream.mo38778c()) {
            onAddAttachmentsRequested();
        }
    }

    public void onSendMessageRequested(String str) {
        if (this.imageStream.mo38778c()) {
            this.imageStream.mo38768a();
        }
        this.dispatcher.dispatch(this.actionFactory.createCommentAsync(str, this.attachmentHelper.getSelectedAttachments()));
        this.dispatcher.dispatch(this.actionFactory.clearAttachments());
        this.dispatcher.dispatch(this.actionFactory.updateCommentsAsync());
    }

    public void onVisible() {
        this.messageComposerView.post(new Runnable() {
            public void run() {
                ComponentMessageComposer.this.messageComposerView.triggerStateUpdate();
            }
        });
    }

    public void update(MessageComposerModel messageComposerModel) {
        this.attachmentHelper.updateMaxFileSize(messageComposerModel.getMaxFileSize());
        this.attachmentHelper.updateAttachments(messageComposerModel.getRequestAttachments(), messageComposerModel.getExtraAttachments());
        this.messageComposerView.setAttachmentsCount(messageComposerModel.getRequestAttachments().size());
        this.messageComposerView.enableSendButton(messageComposerModel.isSendButtonEnabled());
        this.messageComposerView.enableAttachmentsButton(messageComposerModel.isAttachmentsButtonEnabled());
        this.messageComposerView.hide(!messageComposerModel.isMessageComposerVisible());
        if (!messageComposerModel.isMessageComposerVisible()) {
            UiUtils.dismissKeyboard((View) this.messageComposerView);
        }
    }
}
