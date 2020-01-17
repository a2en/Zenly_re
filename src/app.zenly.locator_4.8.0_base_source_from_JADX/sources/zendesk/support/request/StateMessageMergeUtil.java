package zendesk.support.request;

import android.annotation.SuppressLint;
import androidx.core.util.C0603e;
import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

class StateMessageMergeUtil {
    static List<StateMessage> mergeMessages(List<StateMessage> list, List<StateMessage> list2) {
        C0603e mergeRemoteMessagesById = mergeRemoteMessagesById(list, list2);
        if (C12010a.m31635a((Collection) mergeRemoteMessagesById.f2730b)) {
            return (List) mergeRemoteMessagesById.f2729a;
        }
        return mergeRemoteMessagesBySortOrder((List) mergeRemoteMessagesById.f2729a, (List) mergeRemoteMessagesById.f2730b);
    }

    @SuppressLint({"UseSparseArrays"})
    private static C0603e<List<StateMessage>, List<StateMessage>> mergeRemoteMessagesById(List<StateMessage> list, List<StateMessage> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (StateMessage stateMessage : list2) {
            linkedHashMap.put(Long.valueOf(stateMessage.getId()), stateMessage);
        }
        ArrayList arrayList = new ArrayList();
        for (StateMessage stateMessage2 : list) {
            if (linkedHashMap.containsKey(Long.valueOf(stateMessage2.getId()))) {
                arrayList.add(synchronizeAttachmentOrder(stateMessage2, (StateMessage) linkedHashMap.remove(Long.valueOf(stateMessage2.getId()))));
            } else {
                arrayList.add(stateMessage2);
            }
        }
        return C0603e.m2769a(arrayList, new ArrayList(linkedHashMap.values()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<zendesk.support.request.StateMessage> mergeRemoteMessagesBySortOrder(java.util.List<zendesk.support.request.StateMessage> r12, java.util.List<zendesk.support.request.StateMessage> r13) {
        /*
            int r0 = r12.size()
            int r1 = r13.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0 + r1
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L_0x0011:
            if (r3 < r0) goto L_0x0016
            if (r4 < r1) goto L_0x0016
            goto L_0x0068
        L_0x0016:
            if (r3 >= r0) goto L_0x0057
            if (r4 < r1) goto L_0x001b
            goto L_0x0057
        L_0x001b:
            java.lang.Object r5 = r12.get(r3)
            zendesk.support.request.StateMessage r5 = (zendesk.support.request.StateMessage) r5
            java.lang.Object r6 = r13.get(r4)
            zendesk.support.request.StateMessage r6 = (zendesk.support.request.StateMessage) r6
            long r7 = r5.getId()
            long r9 = r6.getId()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x003f
            zendesk.support.request.StateMessage r5 = synchronizeAttachmentOrder(r5, r6)
            r2.add(r5)
            int r3 = r3 + 1
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x003f:
            java.util.Date r7 = r5.getDate()
            java.util.Date r8 = r6.getDate()
            boolean r7 = r7.before(r8)
            if (r7 == 0) goto L_0x0053
            r2.add(r5)
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0053:
            r2.add(r6)
            goto L_0x003c
        L_0x0057:
            if (r3 >= r0) goto L_0x0061
            java.util.List r12 = r12.subList(r3, r0)
            r2.addAll(r12)
            goto L_0x0068
        L_0x0061:
            java.util.List r12 = r13.subList(r4, r1)
            r2.addAll(r12)
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.StateMessageMergeUtil.mergeRemoteMessagesBySortOrder(java.util.List, java.util.List):java.util.List");
    }

    static List<StateRequestUser> mergeUsers(List<StateRequestUser> list, List<StateRequestUser> list2) {
        TreeSet treeSet = new TreeSet(new Comparator<StateRequestUser>() {
            public int compare(StateRequestUser stateRequestUser, StateRequestUser stateRequestUser2) {
                return (int) (stateRequestUser.getId() - stateRequestUser2.getId());
            }
        });
        treeSet.addAll(list2);
        treeSet.addAll(list);
        return new ArrayList(treeSet);
    }

    static List<StateMessage> removeMessageById(long j, List<StateMessage> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (StateMessage stateMessage : list) {
            if (stateMessage.getId() != j) {
                arrayList.add(stateMessage);
            }
        }
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    static StateMessage synchronizeAttachmentOrder(StateMessage stateMessage, StateMessage stateMessage2) {
        if (C12010a.m31635a((Collection<Type>) stateMessage2.getAttachments())) {
            return stateMessage2;
        }
        final HashMap hashMap = new HashMap();
        int size = stateMessage.getAttachments().size();
        for (int i = 0; i < size; i++) {
            hashMap.put(Long.valueOf(((StateRequestAttachment) stateMessage.getAttachments().get(i)).getId()), Integer.valueOf(i));
        }
        ArrayList arrayList = new ArrayList(stateMessage2.getAttachments());
        Collections.sort(arrayList, new Comparator<StateRequestAttachment>() {
            public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
                return ((Integer) hashMap.get(Long.valueOf(stateRequestAttachment.getId()))).intValue() - ((Integer) hashMap.get(Long.valueOf(stateRequestAttachment2.getId()))).intValue();
            }
        });
        return stateMessage2.withAttachments(arrayList);
    }
}
