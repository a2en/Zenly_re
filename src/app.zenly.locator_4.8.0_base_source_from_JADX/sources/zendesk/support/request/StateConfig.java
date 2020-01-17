package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import zendesk.suas.C13622i;

class StateConfig implements Serializable {
    private final StateSettings settings;
    private final String subject;
    private final List<String> tags;
    private final StateRequestTicketForm ticketForm;

    static class Builder {
        private StateSettings settings;
        private String subject;
        private List<String> tags;
        private StateRequestTicketForm ticketForm;

        /* access modifiers changed from: 0000 */
        public StateConfig build() {
            StateConfig stateConfig = new StateConfig(this.settings, this.tags, this.subject, this.ticketForm);
            return stateConfig;
        }

        /* access modifiers changed from: 0000 */
        public Builder setSettings(StateSettings stateSettings) {
            this.settings = stateSettings;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setSubject(String str) {
            this.subject = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setTags(List<String> list) {
            this.tags = list;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setTicketForm(StateRequestTicketForm stateRequestTicketForm) {
            this.ticketForm = stateRequestTicketForm;
            return this;
        }

        private Builder(StateSettings stateSettings, List<String> list, String str, StateRequestTicketForm stateRequestTicketForm) {
            this.settings = stateSettings;
            this.tags = list;
            this.subject = str;
            this.ticketForm = stateRequestTicketForm;
        }
    }

    static StateConfig fromState(C13622i iVar) {
        StateConfig stateConfig = (StateConfig) iVar.mo39263a(StateConfig.class);
        if (stateConfig != null) {
            return stateConfig;
        }
        return new StateConfig();
    }

    /* access modifiers changed from: 0000 */
    public StateSettings getSettings() {
        return this.settings;
    }

    /* access modifiers changed from: 0000 */
    public String getSubject() {
        return this.subject;
    }

    /* access modifiers changed from: 0000 */
    public List<String> getTags() {
        return this.tags;
    }

    /* access modifiers changed from: 0000 */
    public StateRequestTicketForm getTicketForm() {
        return this.ticketForm;
    }

    /* access modifiers changed from: 0000 */
    public Builder newBuilder() {
        Builder builder = new Builder(this.settings, this.tags, this.subject, this.ticketForm);
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Config{settings=");
        sb.append(this.settings);
        sb.append(", subject='");
        sb.append(this.subject);
        sb.append('\'');
        sb.append(", ticketForm=");
        sb.append(this.ticketForm);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append('}');
        return sb.toString();
    }

    private StateConfig(StateSettings stateSettings, List<String> list, String str, StateRequestTicketForm stateRequestTicketForm) {
        this.settings = stateSettings;
        this.tags = list;
        this.subject = str;
        this.ticketForm = stateRequestTicketForm;
    }

    StateConfig() {
        this.settings = new StateSettings();
        this.tags = new ArrayList();
        this.subject = "";
        this.ticketForm = null;
    }
}
