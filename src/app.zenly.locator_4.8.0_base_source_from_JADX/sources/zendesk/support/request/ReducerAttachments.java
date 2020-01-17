package zendesk.support.request;

import zendesk.suas.C13621h;

class ReducerAttachments extends C13621h<StateAttachments> {
    ReducerAttachments() {
    }

    public StateAttachments getInitialState() {
        return new StateAttachments();
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zendesk.support.request.StateAttachments reduce(zendesk.support.request.StateAttachments r13, zendesk.suas.C13600a<?> r14) {
        /*
            r12 = this;
            java.lang.String r0 = r14.getActionType()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1326172566: goto L_0x0039;
                case -635275733: goto L_0x002f;
                case -91317760: goto L_0x0025;
                case 207206879: goto L_0x001b;
                case 979542142: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0043
        L_0x0011:
            java.lang.String r1 = "CLEAR_ATTACHMENTS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 4
            goto L_0x0044
        L_0x001b:
            java.lang.String r1 = "START_CONFIG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "LOAD_SETTINGS_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 3
            goto L_0x0044
        L_0x002f:
            java.lang.String r1 = "ATTACHMENTS_DESELECTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 2
            goto L_0x0044
        L_0x0039:
            java.lang.String r1 = "ATTACHMENTS_SELECTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = -1
        L_0x0044:
            if (r0 == 0) goto L_0x0133
            if (r0 == r6) goto L_0x011a
            if (r0 == r5) goto L_0x00c4
            if (r0 == r3) goto L_0x0056
            if (r0 == r2) goto L_0x0050
            r13 = 0
            return r13
        L_0x0050:
            zendesk.support.request.StateAttachments r13 = new zendesk.support.request.StateAttachments
            r13.<init>()
            return r13
        L_0x0056:
            java.lang.Object r14 = r14.getData()
            zendesk.support.request.StateSettings r14 = (zendesk.support.request.StateSettings) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r14.isAttachmentsEnabled()
            java.lang.String r2 = "RequestActivity"
            if (r1 == 0) goto L_0x00b7
            long r7 = r14.getMaxAttachmentSize()
            java.util.List r14 = r13.getSelectedAttachments()
            java.util.Iterator r14 = r14.iterator()
        L_0x0075:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r14.next()
            zendesk.support.request.StateRequestAttachment r1 = (zendesk.support.request.StateRequestAttachment) r1
            long r9 = r1.getSize()
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a7
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r10 = r1.getName()
            r9[r4] = r10
            long r10 = r1.getSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r9[r6] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r9[r5] = r1
            java.lang.String r1 = "Cannot add attachment %s. Size is %d, max attachment size is %d."
            com.zendesk.logger.Logger.m31608a(r2, r1, r9)
            goto L_0x0075
        L_0x00a7:
            r0.add(r1)
            goto L_0x0075
        L_0x00ab:
            zendesk.support.request.StateAttachments$Builder r13 = r13.newBuilder()
            r13.setSelectedAttachments(r0)
            zendesk.support.request.StateAttachments r13 = r13.build()
            return r13
        L_0x00b7:
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r14 = "Cannot add attachments, they are disabled in your Zendesk settings."
            com.zendesk.logger.Logger.m31614d(r2, r14, r13)
            zendesk.support.request.StateAttachments r13 = new zendesk.support.request.StateAttachments
            r13.<init>()
            return r13
        L_0x00c4:
            java.lang.Object r14 = r14.getData()
            java.util.List r14 = (java.util.List) r14
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00d3:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r14.next()
            zendesk.belvedere.MediaResult r1 = (zendesk.belvedere.MediaResult) r1
            android.net.Uri r1 = r1.mo38846e()
            r0.add(r1)
            goto L_0x00d3
        L_0x00e7:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List r1 = r13.getSelectedAttachments()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010e
            java.lang.Object r2 = r1.next()
            zendesk.support.request.StateRequestAttachment r2 = (zendesk.support.request.StateRequestAttachment) r2
            android.net.Uri r3 = r2.getParsedLocalUri()
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x00f4
            r14.add(r2)
            goto L_0x00f4
        L_0x010e:
            zendesk.support.request.StateAttachments$Builder r13 = r13.newBuilder()
            r13.setSelectedAttachments(r14)
            zendesk.support.request.StateAttachments r13 = r13.build()
            return r13
        L_0x011a:
            java.lang.Object r14 = r14.getData()
            zendesk.support.request.RequestUiConfig r14 = (zendesk.support.request.RequestUiConfig) r14
            java.util.List r14 = r14.getFiles()
            zendesk.support.request.StateAttachments$Builder r13 = r13.newBuilder()
            r13.addAllSelectedAttachments(r14)
            r13.setSelectedAttachments(r14)
            zendesk.support.request.StateAttachments r13 = r13.build()
            return r13
        L_0x0133:
            java.lang.Object r14 = r14.getData()
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0142:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0156
            java.lang.Object r1 = r14.next()
            zendesk.belvedere.MediaResult r1 = (zendesk.belvedere.MediaResult) r1
            zendesk.support.request.StateRequestAttachment r1 = zendesk.support.request.StateRequestAttachment.convert(r1)
            r0.add(r1)
            goto L_0x0142
        L_0x0156:
            java.util.List[] r14 = new java.util.List[r5]
            r14[r4] = r0
            java.util.List r1 = r13.getSelectedAttachments()
            r14[r6] = r1
            java.util.List r14 = com.zendesk.util.C12010a.m31633a((java.util.List<Type>[]) r14)
            zendesk.support.request.StateAttachments$Builder r13 = r13.newBuilder()
            r13.addAllSelectedAttachments(r0)
            r13.setSelectedAttachments(r14)
            zendesk.support.request.StateAttachments r13 = r13.build()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ReducerAttachments.reduce(zendesk.support.request.StateAttachments, zendesk.suas.a):zendesk.support.request.StateAttachments");
    }
}
