package zendesk.core;

import com.zendesk.service.C12008e;
import java.util.List;
import java.util.Map;

public interface UserProvider {
    void addTags(List<String> list, C12008e<List<String>> eVar);

    void deleteTags(List<String> list, C12008e<List<String>> eVar);

    void getUser(C12008e<User> eVar);

    void getUserFields(C12008e<List<Object>> eVar);

    void setUserFields(Map<String, String> map, C12008e<Map<String, String>> eVar);
}
