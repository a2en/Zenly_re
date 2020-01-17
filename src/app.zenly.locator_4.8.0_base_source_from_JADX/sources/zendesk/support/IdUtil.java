package zendesk.support;

import java.util.UUID;

public class IdUtil {
    private static UUID generateUniqueId() {
        return UUID.randomUUID();
    }

    public static long newLongId() {
        return generateUniqueId().getMostSignificantBits() & Long.MAX_VALUE;
    }

    public static String newStringId() {
        return generateUniqueId().toString();
    }
}
