package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.C0603e;
import androidx.transition.C1236k;
import androidx.transition.Fade;
import androidx.transition.Transition;
import com.squareup.picasso.Picasso;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12140j;
import zendesk.suas.C13622i;
import zendesk.suas.Listener;
import zendesk.suas.StateSelector;

class ComponentToolbar implements Listener<ToolbarModel> {
    private final ViewToolbarAvatar avatarContainer;
    private final View container;
    private final Context context;
    private final Fade fadeTransition = new Fade();
    private final Picasso picasso;
    private final ViewAlmostRealProgressBar progressBar;
    private final TextView subTitle;
    private final TextView title;
    private final Toolbar toolbar;
    private ToolbarModel toolbarModel;
    private final ToolbarSelector toolbarSelector;

    static class ToolbarModel {
        static int STATE_AGENT_INFO = 3;
        static int STATE_LOADING = 1;
        static int STATE_TITLE = 2;
        private final List<StateRequestUser> agent;
        private final boolean isProgressEnabled;
        private final Date lastReply;
        private final int toolbarContentState;

        ToolbarModel(boolean z, int i, List<StateRequestUser> list, Date date) {
            this.isProgressEnabled = z;
            this.toolbarContentState = i;
            this.agent = list;
            this.lastReply = date;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || ToolbarModel.class != obj.getClass()) {
                return false;
            }
            ToolbarModel toolbarModel = (ToolbarModel) obj;
            if (this.isProgressEnabled != toolbarModel.isProgressEnabled || this.toolbarContentState != toolbarModel.toolbarContentState) {
                return false;
            }
            List<StateRequestUser> list = this.agent;
            if (list == null ? toolbarModel.agent != null : !list.equals(toolbarModel.agent)) {
                return false;
            }
            Date date = this.lastReply;
            Date date2 = toolbarModel.lastReply;
            if (date != null) {
                z = date.equals(date2);
            } else if (date2 != null) {
                z = false;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public List<C0603e<String, String>> getAvatarUrls() {
            ArrayList arrayList = new ArrayList();
            for (StateRequestUser stateRequestUser : this.agent) {
                arrayList.add(C0603e.m2769a(stateRequestUser.getAvatar(), stateRequestUser.getName()));
            }
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        public Date getLastReply() {
            return this.lastReply;
        }

        /* access modifiers changed from: 0000 */
        public String getNameOfFirstAgent() {
            return C12010a.m31639b((Collection<Type>) this.agent) ? ((StateRequestUser) this.agent.get(0)).getName() : "";
        }

        /* access modifiers changed from: 0000 */
        public int getToolbarContentState() {
            return this.toolbarContentState;
        }

        public int hashCode() {
            int i = (((this.isProgressEnabled ? 1 : 0) * true) + this.toolbarContentState) * 31;
            List<StateRequestUser> list = this.agent;
            int i2 = 0;
            int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
            Date date = this.lastReply;
            if (date != null) {
                i2 = date.hashCode();
            }
            return hashCode + i2;
        }

        /* access modifiers changed from: 0000 */
        public boolean isProgressEnabled() {
            return this.isProgressEnabled;
        }
    }

    static class ToolbarSelector implements StateSelector<ToolbarModel> {
        ToolbarSelector() {
        }

        private StateMessage findLastAgentReply(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = (StateMessage) list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    return stateMessage;
                }
            }
            return null;
        }

        private List<StateRequestUser> getInvolvedAgents(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = (StateMessage) list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    linkedHashSet.add(map.get(Long.valueOf(stateMessage.getUserId())));
                }
            }
            return new ArrayList(linkedHashSet);
        }

        private boolean isProgressEnabled(C13622i iVar) {
            return StateProgress.fomState(iVar).getRunningRequests() > 0;
        }

        @SuppressLint({"UseSparseArrays"})
        private Map<Long, StateRequestUser> mapAgents(List<StateRequestUser> list) {
            HashMap hashMap = new HashMap();
            for (StateRequestUser stateRequestUser : list) {
                if (stateRequestUser.isAgent()) {
                    hashMap.put(Long.valueOf(stateRequestUser.getId()), stateRequestUser);
                }
            }
            return hashMap;
        }

        public ToolbarModel selectData(C13622i iVar) {
            int i;
            boolean isProgressEnabled = isProgressEnabled(iVar);
            StateConversation fromState = StateConversation.fromState(iVar);
            Map mapAgents = mapAgents(fromState.getUsers());
            ArrayList arrayList = new ArrayList();
            Date date = null;
            if (!C12017g.m31658b(fromState.getLocalId()) && !C12017g.m31658b(fromState.getRemoteId())) {
                i = ToolbarModel.STATE_LOADING;
            } else if (fromState.hasAgentReplies() && mapAgents.size() == 0) {
                i = ToolbarModel.STATE_LOADING;
            } else if (!fromState.hasAgentReplies() || mapAgents.size() <= 0) {
                i = ToolbarModel.STATE_TITLE;
            } else {
                int i2 = ToolbarModel.STATE_AGENT_INFO;
                StateMessage findLastAgentReply = findLastAgentReply(fromState.getMessages(), mapAgents);
                if (findLastAgentReply != null) {
                    date = findLastAgentReply.getDate();
                }
                arrayList.addAll(getInvolvedAgents(fromState.getMessages(), mapAgents));
                i = i2;
            }
            return new ToolbarModel(isProgressEnabled, i, arrayList, date);
        }
    }

    ComponentToolbar(Picasso picasso2, Toolbar toolbar2, ViewAlmostRealProgressBar viewAlmostRealProgressBar) {
        this.picasso = picasso2;
        this.progressBar = viewAlmostRealProgressBar;
        this.toolbar = toolbar2;
        this.context = toolbar2.getContext();
        this.toolbarSelector = new ToolbarSelector();
        this.container = toolbar2.findViewById(C12136f.activity_request_toolbar_container);
        this.title = (TextView) toolbar2.findViewById(C12136f.activity_request_toolbar_custom_title);
        this.subTitle = (TextView) toolbar2.findViewById(C12136f.activity_request_toolbar_custom_sub_title);
        this.avatarContainer = (ViewToolbarAvatar) toolbar2.findViewById(C12136f.activity_request_toolbar_avatar_holder);
    }

    private void updateProgressBar(boolean z) {
        if (z) {
            this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
        } else {
            this.progressBar.stop(300);
        }
    }

    private void updateToolbar(ToolbarModel toolbarModel2) {
        String str = "";
        if (toolbarModel2.getToolbarContentState() == ToolbarModel.STATE_LOADING) {
            this.container.setVisibility(8);
            this.toolbar.setTitle((CharSequence) str);
        } else if (toolbarModel2.getToolbarContentState() == ToolbarModel.STATE_AGENT_INFO) {
            this.title.setText(toolbarModel2.getNameOfFirstAgent());
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(this.context, toolbarModel2.getLastReply().getTime(), true);
            this.subTitle.setText(this.context.getString(C12140j.request_toolbar_last_reply, new Object[]{relativeTimeSpanString}));
            this.toolbar.setTitle((CharSequence) str);
            this.avatarContainer.setImageUrls(this.picasso, toolbarModel2.getAvatarUrls());
            C1236k.m5968a((ViewGroup) this.toolbar, (Transition) this.fadeTransition);
            this.container.setVisibility(0);
            this.container.setContentDescription(this.container.getContext().getString(C12140j.zs_request_toolbar_accessibility, new Object[]{toolbarModel2.getNameOfFirstAgent(), relativeTimeSpanString}));
        } else if (toolbarModel2.getToolbarContentState() == ToolbarModel.STATE_TITLE) {
            this.container.setVisibility(8);
            this.toolbar.setTitle(C12140j.request_activity_title);
        }
    }

    /* access modifiers changed from: 0000 */
    public ToolbarSelector getToolbarSelector() {
        return this.toolbarSelector;
    }

    public void update(ToolbarModel toolbarModel2) {
        if (!toolbarModel2.equals(this.toolbarModel)) {
            this.toolbarModel = toolbarModel2;
            updateProgressBar(toolbarModel2.isProgressEnabled());
            updateToolbar(toolbarModel2);
        }
    }
}
