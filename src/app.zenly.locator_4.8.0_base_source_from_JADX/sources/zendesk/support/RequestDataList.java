package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class RequestDataList {
    final List<RequestData> requestDataList = new ArrayList(0);

    RequestDataList(List<RequestData> list) {
        if (C12010a.m31639b((Collection<Type>) list)) {
            this.requestDataList.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestDataList.class != obj.getClass()) {
            return false;
        }
        return this.requestDataList.equals(((RequestDataList) obj).requestDataList);
    }

    public int hashCode() {
        return this.requestDataList.hashCode();
    }
}
