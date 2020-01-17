package zendesk.support.request;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import zendesk.commonui.UiConfig;
import zendesk.suas.Dispatcher;
import zendesk.support.RequestStatus;
import zendesk.support.ZendeskDeepLinkHelper;

class CellFactory {
    private final DocumentRenderer documentRenderer;
    private final HtmlParser htmlParser = new HtmlParser();
    private final CellBindHelper utils;

    CellFactory(Context context, Picasso picasso, ActionFactory actionFactory, Dispatcher dispatcher, ZendeskDeepLinkHelper zendeskDeepLinkHelper, UiConfig uiConfig) {
        this.utils = new CellBindHelper(context, picasso, actionFactory, dispatcher);
        this.documentRenderer = new DocumentRenderer(context, zendeskDeepLinkHelper, uiConfig);
    }

    private CharSequence generateRichText(String str, String str2) {
        return this.documentRenderer.render(this.htmlParser.parse(str, str2));
    }

    private List<CellType$Base> markMessagesAsErrored(Collection<CellType$Stateful> collection, Collection<StateMessage> collection2) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CellType$Stateful) it.next()).markAsErrored(new ArrayList(collection2), !it.hasNext()));
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> calculatePositionTypes(List<CellType$Base> list) {
        if (C12010a.m31635a((Collection<Type>) list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        long j = -1;
        for (int i = 0; i < list.size(); i++) {
            CellType$Base cellType$Base = (CellType$Base) list.get(i);
            if (i == 0 || cellType$Base.getGroupId() != j) {
                cellType$Base.setPositionType(2);
            }
            if (cellType$Base instanceof CellType$Stateful) {
                CellType$Stateful cellType$Stateful = (CellType$Stateful) cellType$Base;
                if (cellType$Stateful.isMarkedAsDelivered() || cellType$Stateful.isLastErrorCellOfBlock()) {
                    cellType$Base.setPositionType(8);
                }
            }
            j = cellType$Base.getGroupId();
            arrayList.add(cellType$Base);
        }
        ((CellType$Base) arrayList.get(arrayList.size() - 1)).setPositionType(16);
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public StateMessage findFirstDelivered(List<StateMessage> list) {
        for (StateMessage stateMessage : list) {
            if (stateMessage.getState().getStatus() == 2) {
                return stateMessage;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public StateRequestUser findUserForId(List<StateRequestUser> list, long j) {
        for (StateRequestUser stateRequestUser : list) {
            if (stateRequestUser.getId() == j) {
                return stateRequestUser;
            }
        }
        return null;
    }

    public List<CellType$Base> generateCells(List<StateMessage> list, List<StateRequestUser> list2, RequestStatus requestStatus, String str) {
        ArrayList arrayList = new ArrayList();
        StateMessage findFirstDelivered = findFirstDelivered(list);
        for (StateMessage stateMessage : list) {
            StateRequestUser findUserForId = findUserForId(list2, stateMessage.getUserId());
            List viewModelsForMessage = getViewModelsForMessage(stateMessage, isUserAgent(findUserForId), findUserForId);
            insertSystemMessage(findFirstDelivered, stateMessage, viewModelsForMessage, str);
            arrayList.addAll(viewModelsForMessage);
        }
        List insertDateCells = insertDateCells(markLastDeliveredCell(markCellsErrored(arrayList)));
        insertRequestStatus(insertDateCells, requestStatus);
        markAgentCells(insertDateCells);
        return calculatePositionTypes(insertDateCells);
    }

    /* access modifiers changed from: 0000 */
    public CellType$Base getAgentAttachment(StateRequestAttachment stateRequestAttachment, StateRequestUser stateRequestUser, Date date) {
        if (UtilsAttachment.isImageAttachment(stateRequestAttachment)) {
            return new CellAgentAttachmentImage(this.utils, stateRequestAttachment, stateRequestUser, date);
        }
        return new CellAgentAttachmentGeneric(this.utils, stateRequestAttachment, stateRequestUser, date);
    }

    /* access modifiers changed from: 0000 */
    public CellType$Base getAgentMessage(StateMessage stateMessage, StateRequestUser stateRequestUser) {
        return new CellAgentMessage(this.utils, stateMessage, generateRichText(stateMessage.getHtmlBody(), stateMessage.getPlainBody()), stateRequestUser);
    }

    /* access modifiers changed from: 0000 */
    public CellType$Base getUserAttachment(StateMessage stateMessage, StateRequestAttachment stateRequestAttachment, Date date) {
        if (UtilsAttachment.isImageAttachment(stateRequestAttachment)) {
            CellUserAttachmentImage cellUserAttachmentImage = new CellUserAttachmentImage(this.utils, stateMessage, stateRequestAttachment, date, false, false, new ArrayList(0), false);
            return cellUserAttachmentImage;
        }
        CellUserAttachmentGeneric cellUserAttachmentGeneric = new CellUserAttachmentGeneric(this.utils, stateMessage, stateRequestAttachment, date, false, false, new ArrayList(0), false);
        return cellUserAttachmentGeneric;
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> getUserMessage(StateMessage stateMessage) {
        if (UtilsAttachment.hasAttachmentBody(stateMessage)) {
            return new ArrayList();
        }
        StateMessage stateMessage2 = stateMessage;
        CellUserMessage cellUserMessage = new CellUserMessage(this.utils, stateMessage2, false, false, generateRichText(stateMessage.getHtmlBody(), stateMessage.getPlainBody()), new ArrayList(0), false);
        return Collections.singletonList(cellUserMessage);
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> getViewModelsForMessage(StateMessage stateMessage, boolean z, StateRequestUser stateRequestUser) {
        List attachments = stateMessage.getAttachments();
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getAgentMessage(stateMessage, stateRequestUser));
        } else {
            arrayList.addAll(getUserMessage(stateMessage));
        }
        int size = attachments.size();
        for (int i = 0; i < size; i++) {
            StateRequestAttachment stateRequestAttachment = (StateRequestAttachment) attachments.get(i);
            if (z) {
                arrayList.add(getAgentAttachment(stateRequestAttachment, stateRequestUser, stateMessage.getDate()));
            } else {
                arrayList.add(getUserAttachment(stateMessage, stateRequestAttachment, stateMessage.getDate()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> insertDateCells(List<CellType$Base> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Date date = new Date(0);
        for (CellType$Base cellType$Base : list) {
            if (!UtilsDate.isSameDay(date, cellType$Base.getTimeStamp())) {
                date = cellType$Base.getTimeStamp();
                arrayList.add(new CellSystemMessages$CellDateMessage(this.utils, UtilsDate.getBeginOfDay(date).getTime(), date));
            }
            arrayList.add(cellType$Base);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> insertRequestStatus(List<CellType$Base> list, RequestStatus requestStatus) {
        if (requestStatus == RequestStatus.Closed && list.size() > 0) {
            list.add(new CellSystemMessages$CellRequestStatus(this.utils, requestStatus));
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> insertSystemMessage(StateMessage stateMessage, StateMessage stateMessage2, List<CellType$Base> list, String str) {
        if (stateMessage2 == stateMessage && C12017g.m31658b(str)) {
            list.add(new CellSystemMessages$CellSystemMessage(stateMessage2.getDate(), str));
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    public boolean isUserAgent(StateRequestUser stateRequestUser) {
        return stateRequestUser != null && stateRequestUser.isAgent();
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> markAgentCells(List<CellType$Base> list) {
        long j = Long.MIN_VALUE;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size) instanceof CellType$Agent) {
                CellType$Agent cellType$Agent = (CellType$Agent) list.get(size);
                if (j != cellType$Agent.getAgent().getId()) {
                    cellType$Agent.showAgentName(true);
                    j = cellType$Agent.getAgent().getId();
                } else {
                    cellType$Agent.showAgentName(false);
                }
            } else {
                j = Long.MIN_VALUE;
            }
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> markCellsErrored(List<CellType$Base> list) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        for (CellType$Base cellType$Base : list) {
            if (cellType$Base instanceof CellType$Stateful) {
                CellType$Stateful cellType$Stateful = (CellType$Stateful) cellType$Base;
                if (cellType$Stateful.getStateMessage().getState().getStatus() == 1) {
                    arrayList.add(cellType$Stateful);
                    linkedHashSet.add(cellType$Stateful.getStateMessage());
                } else {
                    arrayList2.addAll(markMessagesAsErrored(arrayList, linkedHashSet));
                    arrayList2.add(cellType$Base);
                    arrayList.clear();
                    linkedHashSet.clear();
                }
            } else {
                arrayList2.addAll(markMessagesAsErrored(arrayList, linkedHashSet));
                arrayList2.add(cellType$Base);
                arrayList.clear();
                linkedHashSet.clear();
            }
        }
        arrayList2.addAll(markMessagesAsErrored(arrayList, linkedHashSet));
        return arrayList2;
    }

    /* access modifiers changed from: 0000 */
    public List<CellType$Base> markLastDeliveredCell(List<CellType$Base> list) {
        boolean z;
        boolean z2;
        Iterator it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            CellType$Base cellType$Base = (CellType$Base) it.next();
            if ((cellType$Base instanceof CellType$Stateful) && ((CellType$Stateful) cellType$Base).getStateMessage().getState().getStatus() == 3) {
                z2 = true;
                break;
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Object obj = (CellType$Base) list.get(size);
                if ((obj instanceof CellType$Stateful) && !z) {
                    CellType$Stateful cellType$Stateful = (CellType$Stateful) obj;
                    if (cellType$Stateful.getStateMessage().getState().getStatus() == 2) {
                        obj = cellType$Stateful.markAsDelivered();
                    }
                    z = true;
                }
                arrayList.add(obj);
            }
            Collections.reverse(arrayList);
        } else {
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
