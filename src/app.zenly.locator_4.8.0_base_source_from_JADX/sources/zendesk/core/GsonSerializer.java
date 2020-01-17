package zendesk.core;

import com.google.gson.C11125d;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;

class GsonSerializer implements Serializer {
    private final C11125d gson;

    GsonSerializer(C11125d dVar) {
        this.gson = dVar;
    }

    public <E> E deserialize(Object obj, Class<E> cls) {
        String str = "GsonSerializer";
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (C12017g.m31658b(str2)) {
                try {
                    return this.gson.mo32457a(str2, cls);
                } catch (JsonSyntaxException unused) {
                    Logger.m31608a(str, "Unable to deserialize String into object of type %s", cls.getSimpleName());
                }
            }
        } else if (obj instanceof JsonElement) {
            try {
                return this.gson.mo32452a((JsonElement) obj, cls);
            } catch (JsonSyntaxException e) {
                Logger.m31608a(str, "Unable to deserialize JsonElement into object of type %s", cls.getSimpleName(), e);
            }
        } else {
            Logger.m31608a(str, "Unable to deserialize the provided object into %s", cls.getSimpleName());
        }
        return null;
    }

    public String serialize(Object obj) {
        return this.gson.mo32460a(obj);
    }
}
