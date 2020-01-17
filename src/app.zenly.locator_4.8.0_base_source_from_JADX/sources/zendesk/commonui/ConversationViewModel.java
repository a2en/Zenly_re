package zendesk.commonui;

import android.content.Intent;
import android.text.TextWatcher;
import androidx.lifecycle.LiveData;
import zendesk.commonui.InputBox.InputTextConsumer;

public interface ConversationViewModel {
    InputTextConsumer getInputTextConsumer();

    LiveData<Object> getLiveConversationState();

    TextWatcher getTextWatcher();

    void onActivityResult(int i, int i2, Intent intent);
}
