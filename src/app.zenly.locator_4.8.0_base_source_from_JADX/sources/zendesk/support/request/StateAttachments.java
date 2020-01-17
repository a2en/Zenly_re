package zendesk.support.request;

import com.zendesk.util.C12010a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import zendesk.suas.C13622i;

class StateAttachments implements Serializable {
    private final Set<StateRequestAttachment> allSelectedAttachments;
    private final List<StateRequestAttachment> selectedAttachments;

    public static class Builder {
        private Set<StateRequestAttachment> attachmentNotSelectedButVisible;
        private List<StateRequestAttachment> selectedAttachments;

        /* access modifiers changed from: 0000 */
        public Builder addAllSelectedAttachments(List<StateRequestAttachment> list) {
            Collections.reverse(list);
            this.attachmentNotSelectedButVisible.addAll(list);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public StateAttachments build() {
            return new StateAttachments(this.selectedAttachments, this.attachmentNotSelectedButVisible);
        }

        /* access modifiers changed from: 0000 */
        public Builder setSelectedAttachments(List<StateRequestAttachment> list) {
            this.selectedAttachments = C12010a.m31632a(list);
            return this;
        }

        private Builder(StateAttachments stateAttachments) {
            this.selectedAttachments = C12010a.m31632a(stateAttachments.getSelectedAttachments());
            this.attachmentNotSelectedButVisible = new TreeSet(new UriComparator());
            this.attachmentNotSelectedButVisible.addAll(stateAttachments.getAllSelectedAttachments());
        }
    }

    static class UriComparator implements Comparator<StateRequestAttachment>, Serializable {
        UriComparator() {
        }

        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getLocalUri().compareTo(stateRequestAttachment2.getLocalUri());
        }
    }

    StateAttachments(List<StateRequestAttachment> list, Set<StateRequestAttachment> set) {
        this.selectedAttachments = list;
        this.allSelectedAttachments = set;
    }

    static StateAttachments fromState(C13622i iVar) {
        Object a = iVar.mo39264a(StateAttachments.class.getSimpleName());
        if (a instanceof StateAttachments) {
            return (StateAttachments) a;
        }
        return new StateAttachments();
    }

    /* access modifiers changed from: 0000 */
    public Set<StateRequestAttachment> getAllSelectedAttachments() {
        return this.allSelectedAttachments;
    }

    /* access modifiers changed from: 0000 */
    public List<StateRequestAttachment> getSelectedAttachments() {
        return this.selectedAttachments;
    }

    /* access modifiers changed from: 0000 */
    public Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Attachments{selectedAttachments=");
        sb.append(this.selectedAttachments);
        sb.append(", allSelectedAttachments=");
        sb.append(this.allSelectedAttachments);
        sb.append('}');
        return sb.toString();
    }

    StateAttachments() {
        this.selectedAttachments = new ArrayList();
        this.allSelectedAttachments = new TreeSet(new UriComparator());
    }
}
