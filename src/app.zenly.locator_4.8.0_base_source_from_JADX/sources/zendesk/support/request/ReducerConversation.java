package zendesk.support.request;

import zendesk.suas.C13621h;

class ReducerConversation extends C13621h<StateConversation> {
    ReducerConversation() {
    }

    public StateConversation getInitialState() {
        return new StateConversation();
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zendesk.support.request.StateConversation reduce(zendesk.support.request.StateConversation r6, zendesk.suas.C13600a<?> r7) {
        /*
            r5 = this;
            java.lang.String r0 = r7.getActionType()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1720252100: goto L_0x00a4;
                case -1679314784: goto L_0x0099;
                case -1319777819: goto L_0x008f;
                case -1193398337: goto L_0x0085;
                case -1049833133: goto L_0x007a;
                case -903772976: goto L_0x006f;
                case -16010570: goto L_0x0065;
                case 207206879: goto L_0x005b;
                case 397298627: goto L_0x0050;
                case 619382558: goto L_0x0045;
                case 962828474: goto L_0x0039;
                case 1532422677: goto L_0x002e;
                case 1712998531: goto L_0x0023;
                case 1921186300: goto L_0x0018;
                case 2066480684: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x00af
        L_0x000d:
            java.lang.String r1 = "CREATE_REQUEST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 4
            goto L_0x00b0
        L_0x0018:
            java.lang.String r1 = "CREATE_COMMENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 5
            goto L_0x00b0
        L_0x0023:
            java.lang.String r1 = "LOAD_COMMENTS_FROM_CACHE_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 3
            goto L_0x00b0
        L_0x002e:
            java.lang.String r1 = "CREATE_REQUEST_ERROR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 6
            goto L_0x00b0
        L_0x0039:
            java.lang.String r1 = "LOAD_REQUEST_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 12
            goto L_0x00b0
        L_0x0045:
            java.lang.String r1 = "CLEAR_MESSAGES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 14
            goto L_0x00b0
        L_0x0050:
            java.lang.String r1 = "ATTACHMENT_DOWNLOADED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 11
            goto L_0x00b0
        L_0x005b:
            java.lang.String r1 = "START_CONFIG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 0
            goto L_0x00b0
        L_0x0065:
            java.lang.String r1 = "LOAD_COMMENTS_INITIAL_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 1
            goto L_0x00b0
        L_0x006f:
            java.lang.String r1 = "CREATE_REQUEST_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 9
            goto L_0x00b0
        L_0x007a:
            java.lang.String r1 = "DELETE_MESSAGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 10
            goto L_0x00b0
        L_0x0085:
            java.lang.String r1 = "LOAD_COMMENTS_UPDATE_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 2
            goto L_0x00b0
        L_0x008f:
            java.lang.String r1 = "CREATE_COMMENT_ERROR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 7
            goto L_0x00b0
        L_0x0099:
            java.lang.String r1 = "CREATE_COMMENT_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 8
            goto L_0x00b0
        L_0x00a4:
            java.lang.String r1 = "REQUEST_CLOSED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r0 = 13
            goto L_0x00b0
        L_0x00af:
            r0 = -1
        L_0x00b0:
            switch(r0) {
                case 0: goto L_0x02cb;
                case 1: goto L_0x025d;
                case 2: goto L_0x025d;
                case 3: goto L_0x0232;
                case 4: goto L_0x0215;
                case 5: goto L_0x0215;
                case 6: goto L_0x01f7;
                case 7: goto L_0x01f7;
                case 8: goto L_0x017b;
                case 9: goto L_0x017b;
                case 10: goto L_0x015d;
                case 11: goto L_0x0104;
                case 12: goto L_0x00e3;
                case 13: goto L_0x00d5;
                case 14: goto L_0x00b5;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r6 = 0
            return r6
        L_0x00b5:
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            java.util.List r7 = java.util.Collections.emptyList()
            r6.setMessages(r7)
            zendesk.support.request.StateIdMapper r7 = new zendesk.support.request.StateIdMapper
            r7.<init>()
            r6.setMessageIdMapper(r7)
            zendesk.support.request.StateIdMapper r7 = new zendesk.support.request.StateIdMapper
            r7.<init>()
            r6.setAttachmentIdMapper(r7)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x00d5:
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            zendesk.support.RequestStatus r7 = zendesk.support.RequestStatus.Closed
            r6.setStatus(r7)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x00e3:
            java.lang.Object r7 = r7.getData()
            zendesk.support.Request r7 = (zendesk.support.Request) r7
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            zendesk.support.RequestStatus r0 = r7.getStatus()
            r6.setStatus(r0)
            java.util.List r7 = r7.getLastCommentingAgents()
            boolean r7 = com.zendesk.util.C12010a.m31639b(r7)
            r6.setHasAgentReplies(r7)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x0104:
            java.lang.Object r7 = r7.getData()
            androidx.core.util.e r7 = (androidx.core.util.C0603e) r7
            F r0 = r7.f2729a
            zendesk.support.request.StateRequestAttachment r0 = (zendesk.support.request.StateRequestAttachment) r0
            S r7 = r7.f2730b
            zendesk.belvedere.MediaResult r7 = (zendesk.belvedere.MediaResult) r7
            zendesk.support.request.StateRequestAttachment$Builder r0 = r0.newBuilder()
            java.io.File r1 = r7.mo38840a()
            r0.setLocalFile(r1)
            android.net.Uri r7 = r7.mo38849g()
            java.lang.String r7 = r7.toString()
            r0.setLocalUri(r7)
            zendesk.support.request.StateRequestAttachment r7 = r0.build()
            java.util.List r0 = r6.getMessages()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x013d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0151
            java.lang.Object r2 = r0.next()
            zendesk.support.request.StateMessage r2 = (zendesk.support.request.StateMessage) r2
            zendesk.support.request.StateMessage r2 = r2.withUpdatedAttachment(r7)
            r1.add(r2)
            goto L_0x013d
        L_0x0151:
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            r6.setMessages(r1)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x015d:
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.StateMessage r7 = (zendesk.support.request.StateMessage) r7
            long r0 = r7.getId()
            java.util.List r7 = r6.getMessages()
            java.util.List r7 = zendesk.support.request.StateMessageMergeUtil.removeMessageById(r0, r7)
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            r6.setMessages(r7)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x017b:
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.ActionCreateComment$CreateCommentResult r7 = (zendesk.support.request.ActionCreateComment.CreateCommentResult) r7
            zendesk.support.request.StateIdMapper r0 = r6.getMessageIdMapper()
            long r1 = r7.getCommentRemoteId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            zendesk.support.request.StateMessage r2 = r7.getMessage()
            long r2 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            zendesk.support.request.StateIdMapper r0 = r0.addIdMapping(r1, r2)
            zendesk.support.request.StateIdMapper r1 = r6.getAttachmentIdMapper()
            zendesk.support.request.AttachmentUploadService$AttachmentUploadResult r2 = r7.getLocalToRemoteAttachments()
            java.util.Map r2 = r2.getLocalToRemoteIdMap()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x01b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ce
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r3 = r3.getKey()
            java.lang.Long r3 = (java.lang.Long) r3
            zendesk.support.request.StateIdMapper r1 = r1.addIdMapping(r4, r3)
            goto L_0x01b1
        L_0x01ce:
            java.util.List r2 = r6.getMessages()
            zendesk.support.request.StateMessage r3 = r7.getMessage()
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.util.List r2 = zendesk.support.request.StateMessageMergeUtil.mergeMessages(r2, r3)
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            java.lang.String r7 = r7.getRequestId()
            r6.setRemoteId(r7)
            r6.setMessageIdMapper(r0)
            r6.setAttachmentIdMapper(r1)
            r6.setMessages(r2)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x01f7:
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.StateMessage r7 = (zendesk.support.request.StateMessage) r7
            java.util.List r0 = r6.getMessages()
            java.util.List r7 = java.util.Collections.singletonList(r7)
            java.util.List r7 = zendesk.support.request.StateMessageMergeUtil.mergeMessages(r0, r7)
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            r6.setMessages(r7)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x0215:
            zendesk.support.request.StateConversation$Builder r0 = r6.newBuilder()
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.StateMessage r7 = (zendesk.support.request.StateMessage) r7
            java.util.List r6 = r6.getMessages()
            java.util.List r6 = com.zendesk.util.C12010a.m31632a(r6)
            r6.add(r7)
            r0.setMessages(r6)
            zendesk.support.request.StateConversation r6 = r0.build()
            return r6
        L_0x0232:
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.StateConversation r7 = (zendesk.support.request.StateConversation) r7
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            java.util.List r0 = r7.getMessages()
            r6.setMessages(r0)
            zendesk.support.request.StateIdMapper r0 = r7.getAttachmentIdMapper()
            r6.setAttachmentIdMapper(r0)
            zendesk.support.request.StateIdMapper r0 = r7.getMessageIdMapper()
            r6.setMessageIdMapper(r0)
            java.util.List r7 = r7.getUsers()
            r6.setUsers(r7)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        L_0x025d:
            java.lang.Object r7 = r7.getData()
            androidx.core.util.e r7 = (androidx.core.util.C0603e) r7
            F r0 = r7.f2729a
            zendesk.support.CommentsResponse r0 = (zendesk.support.CommentsResponse) r0
            java.util.List r0 = r0.getComments()
            java.util.Collections.reverse(r0)
            S r1 = r7.f2730b
            java.util.Map r1 = (java.util.Map) r1
            zendesk.support.request.StateIdMapper r2 = r6.getAttachmentIdMapper()
            androidx.core.util.e r1 = zendesk.support.request.StateRequestAttachment.convert(r0, r1, r2)
            zendesk.support.request.StateIdMapper r2 = r6.getMessageIdMapper()
            F r3 = r1.f2729a
            java.util.Map r3 = (java.util.Map) r3
            androidx.core.util.e r0 = zendesk.support.request.StateMessage.convert(r0, r2, r3)
            java.util.List r2 = r6.getMessages()
            F r3 = r0.f2729a
            java.util.List r3 = (java.util.List) r3
            java.util.List r2 = zendesk.support.request.StateMessageMergeUtil.mergeMessages(r2, r3)
            F r7 = r7.f2729a
            zendesk.support.CommentsResponse r7 = (zendesk.support.CommentsResponse) r7
            java.util.List r7 = r7.getUsers()
            java.util.List r7 = zendesk.support.request.StateRequestUser.convert(r7)
            zendesk.support.request.StateConversation$Builder r3 = r6.newBuilder()
            r3.setMessages(r2)
            S r1 = r1.f2730b
            zendesk.support.request.StateIdMapper r1 = (zendesk.support.request.StateIdMapper) r1
            zendesk.support.request.StateIdMapper r1 = r1.copy()
            r3.setAttachmentIdMapper(r1)
            S r0 = r0.f2730b
            zendesk.support.request.StateIdMapper r0 = (zendesk.support.request.StateIdMapper) r0
            zendesk.support.request.StateIdMapper r0 = r0.copy()
            r3.setMessageIdMapper(r0)
            java.util.List r6 = r6.getUsers()
            java.util.List r6 = zendesk.support.request.StateMessageMergeUtil.mergeUsers(r6, r7)
            r3.setUsers(r6)
            zendesk.support.request.StateConversation r6 = r3.build()
            return r6
        L_0x02cb:
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.RequestUiConfig r7 = (zendesk.support.request.RequestUiConfig) r7
            zendesk.support.request.StateConversation$Builder r6 = r6.newBuilder()
            java.lang.String r0 = r7.getLocalRequestId()
            r6.setLocalId(r0)
            java.lang.String r0 = r7.getRequestId()
            r6.setRemoteId(r0)
            zendesk.support.RequestStatus r0 = r7.getRequestStatus()
            r6.setStatus(r0)
            boolean r7 = r7.hasAgentReplies()
            r6.setHasAgentReplies(r7)
            zendesk.support.request.StateConversation r6 = r6.build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ReducerConversation.reduce(zendesk.support.request.StateConversation, zendesk.suas.a):zendesk.support.request.StateConversation");
    }
}
