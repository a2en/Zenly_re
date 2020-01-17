package zendesk.support.request;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import androidx.core.util.C0604f;
import com.google.android.material.textfield.TextInputLayout;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.Collection;
import java.util.List;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12137g;
import p333g.p384h.p385a.C12140j;
import zendesk.belvedere.KeyboardHelper;
import zendesk.suas.C13622i;
import zendesk.suas.Dispatcher;
import zendesk.suas.Listener;
import zendesk.suas.StateSelector;

class ComponentInputForm implements Listener<InputFormModel>, MenuItemsDelegate, KeyboardHelper.Listener {
    private final ActionFactory actionFactory;
    private final AttachmentHelper attachmentHelper;
    private final Dispatcher dispatcher;
    private final EditText emailField;
    private final TextInputLayout emailLayout;
    private final Validator<String> emailValidator;
    /* access modifiers changed from: private */
    public boolean inlineValidation = false;
    /* access modifiers changed from: private */
    public final View logo;
    private final EditText messageField;
    private final TextInputLayout messageLayout;
    private final EditText nameField;
    private final TextInputLayout nameLayout;
    private MenuItem sendButton;

    private static class EditTextTextWatcher implements TextWatcher {
        private final ComponentInputForm componentInputForm;

        private EditTextTextWatcher(ComponentInputForm componentInputForm2) {
            this.componentInputForm = componentInputForm2;
        }

        static void install(ComponentInputForm componentInputForm2, EditText... editTextArr) {
            for (EditText addTextChangedListener : editTextArr) {
                addTextChangedListener.addTextChangedListener(new EditTextTextWatcher(componentInputForm2));
            }
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.componentInputForm.inlineValidation) {
                this.componentInputForm.updateEmailValidation();
            }
            this.componentInputForm.updateSendButton();
        }
    }

    private static class EmailFieldFocusListener implements OnFocusChangeListener {
        private final ComponentInputForm componentInputForm;
        private final EditText editText;

        private EmailFieldFocusListener(ComponentInputForm componentInputForm2, EditText editText2) {
            this.componentInputForm = componentInputForm2;
            this.editText = editText2;
        }

        static void install(ComponentInputForm componentInputForm2, EditText editText2) {
            editText2.setOnFocusChangeListener(new EmailFieldFocusListener(componentInputForm2, editText2));
        }

        public void onFocusChange(View view, boolean z) {
            if (!z && C12017g.m31658b(this.editText.getText().toString())) {
                this.componentInputForm.updateEmailValidation();
                this.componentInputForm.updateSendButton();
            }
        }
    }

    static class InputFormModel {
        private final boolean hasIdentityEmailAddress;
        private final boolean hasIdentityName;
        private final boolean isLoading;
        private final boolean neverRequestEmail;
        private final String referrerUrl;
        private final boolean showZendeskLogo;

        InputFormModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
            this.neverRequestEmail = z;
            this.hasIdentityEmailAddress = z2;
            this.hasIdentityName = z3;
            this.isLoading = z4;
            this.showZendeskLogo = z5;
            this.referrerUrl = str;
        }

        private boolean isEmailFieldEnabled() {
            return !this.hasIdentityEmailAddress && !this.neverRequestEmail;
        }

        private boolean isNameFieldEnabled() {
            return !this.hasIdentityName;
        }

        /* access modifiers changed from: 0000 */
        public int getEmailFieldVisibility() {
            return isEmailFieldEnabled() ? 0 : 8;
        }

        /* access modifiers changed from: 0000 */
        public int getLogoVisibility() {
            return isLogoEnabled() ? 0 : 8;
        }

        /* access modifiers changed from: 0000 */
        public int getMessageFieldVisibility() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public int getNameFieldVisibility() {
            return isNameFieldEnabled() ? 0 : 8;
        }

        /* access modifiers changed from: 0000 */
        public String getReferrerUrl() {
            return this.referrerUrl;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        /* access modifiers changed from: 0000 */
        public boolean isLogoEnabled() {
            return this.showZendeskLogo;
        }
    }

    static class InputFormSelector implements StateSelector<InputFormModel> {
        InputFormSelector() {
        }

        public InputFormModel selectData(C13622i iVar) {
            StateSettings settings = StateConfig.fromState(iVar).getSettings();
            InputFormModel inputFormModel = new InputFormModel(settings.isNeverRequestEmailOn(), settings.hasIdentityEmailAddress(), settings.hasIdentityName(), StateProgress.fomState(iVar).getRunningRequests() > 0, settings.isShowZendeskLogo(), settings.getReferrerUrl());
            return inputFormModel;
        }
    }

    interface Validator<T> {
        boolean isValid(T t);
    }

    ComponentInputForm(View view, EditText editText, TextInputLayout textInputLayout, EditText editText2, TextInputLayout textInputLayout2, Validator<String> validator, EditText editText3, TextInputLayout textInputLayout3, Dispatcher dispatcher2, ActionFactory actionFactory2, AttachmentHelper attachmentHelper2) {
        this.logo = view;
        this.nameField = editText;
        this.emailField = editText2;
        this.messageField = editText3;
        this.nameLayout = textInputLayout;
        this.emailLayout = textInputLayout2;
        this.messageLayout = textInputLayout3;
        this.emailValidator = validator;
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.attachmentHelper = attachmentHelper2;
        EditTextTextWatcher.install(this, editText, editText2, editText3);
        EmailFieldFocusListener.install(this, editText2);
    }

    static ComponentInputForm create(View view, Dispatcher dispatcher2, ActionFactory actionFactory2, AttachmentHelper attachmentHelper2) {
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C12136f.request_name_layout);
        EditText editText = (EditText) view.findViewById(C12136f.request_name_field);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(C12136f.request_email_layout);
        EditText editText2 = (EditText) view.findViewById(C12136f.request_email_field);
        EditText editText3 = (EditText) view.findViewById(C12136f.request_message_field);
        ComponentInputForm componentInputForm = new ComponentInputForm(view.findViewById(C12136f.request_zendesk_logo), editText, textInputLayout, editText2, textInputLayout2, new Validator<String>() {
            public boolean isValid(String str) {
                return C0604f.f2737g.matcher(str).matches();
            }
        }, editText3, (TextInputLayout) view.findViewById(C12136f.request_message_layout), dispatcher2, actionFactory2, attachmentHelper2);
        return componentInputForm;
    }

    private boolean doFieldsContainText() {
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        boolean z = !isNameFieldVisible() || C12017g.m31658b(obj);
        boolean z2 = !isEmailFieldVisible() || C12017g.m31658b(obj2);
        boolean b = C12017g.m31658b(obj3);
        if (!z || !z2 || !b) {
            return false;
        }
        return true;
    }

    private boolean isEmailFieldVisible() {
        return this.emailLayout.getVisibility() == 0;
    }

    private boolean isEmailInputValid() {
        return !isEmailFieldVisible() || this.emailValidator.isValid(this.emailField.getText().toString());
    }

    private boolean isNameFieldVisible() {
        return this.nameLayout.getVisibility() == 0;
    }

    private void setSendButtonEnabled(boolean z) {
        if (this.sendButton != null) {
            int i = 255;
            if (!z) {
                i = (this.messageLayout.getContext().getResources().getInteger(C12137g.zs_request_menu_send_btn_alpha_inactive) * 255) / 100;
            }
            this.sendButton.getIcon().setAlpha(i);
            this.sendButton.setEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    public void updateEmailValidation() {
        if (isEmailInputValid()) {
            this.emailLayout.setError(null);
            return;
        }
        this.inlineValidation = true;
        this.emailLayout.setError(this.emailField.getContext().getString(C12140j.error_msg_invalid_email));
    }

    /* access modifiers changed from: private */
    public void updateSendButton() {
        boolean z = this.inlineValidation ? doFieldsContainText() && isEmailInputValid() : doFieldsContainText();
        setSendButtonEnabled(z);
    }

    /* access modifiers changed from: 0000 */
    public StateSelector<InputFormModel> getSelector() {
        return new InputFormSelector();
    }

    /* access modifiers changed from: 0000 */
    public boolean hasUnsavedInput() {
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        boolean z = true;
        if (this.nameField.isEnabled() && C12017g.m31658b(obj)) {
            return true;
        }
        if (this.emailField.isEnabled() && C12017g.m31658b(obj2)) {
            return true;
        }
        if (!C12017g.m31658b(obj3) && !C12010a.m31639b((Collection<Type>) this.attachmentHelper.getSelectedAttachments())) {
            z = false;
        }
        return z;
    }

    public void onKeyboardDismissed() {
        if (this.logo.getVisibility() != 8) {
            this.logo.post(new Runnable() {
                public void run() {
                    ComponentInputForm.this.logo.setVisibility(0);
                }
            });
        }
    }

    public void onKeyboardVisible() {
        if (this.logo.getVisibility() != 8) {
            this.logo.setVisibility(4);
        }
    }

    public void onMenuItemsClicked(MenuItem menuItem) {
        if (menuItem.getItemId() == C12136f.request_conversations_disabled_menu_ic_send) {
            onSendMessageRequested();
        }
    }

    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.sendButton = menuItem;
        updateSendButton();
    }

    /* access modifiers changed from: 0000 */
    public void onSendMessageRequested() {
        if (!doFieldsContainText() || !isEmailInputValid()) {
            updateEmailValidation();
            updateSendButton();
            return;
        }
        if (isNameFieldVisible() || isEmailFieldVisible()) {
            this.dispatcher.dispatch(this.actionFactory.updateNameEmailAsync(this.nameField.getText().toString(), this.emailField.getText().toString()));
        }
        String obj = this.messageField.getText().toString();
        List b = C12010a.m31638b(this.attachmentHelper.getSelectedAttachments());
        this.dispatcher.dispatch(this.actionFactory.clearMessages());
        this.dispatcher.dispatch(this.actionFactory.createCommentAsync(obj, b));
    }

    public void update(final InputFormModel inputFormModel) {
        this.logo.setVisibility(inputFormModel.getLogoVisibility());
        this.nameLayout.setVisibility(inputFormModel.getNameFieldVisibility());
        this.emailLayout.setVisibility(inputFormModel.getEmailFieldVisibility());
        this.messageLayout.setVisibility(inputFormModel.getMessageFieldVisibility());
        this.nameLayout.setEnabled(!inputFormModel.isLoading());
        this.emailLayout.setEnabled(!inputFormModel.isLoading());
        this.messageLayout.setEnabled(!inputFormModel.isLoading());
        if (inputFormModel.isLoading()) {
            setSendButtonEnabled(false);
            return;
        }
        C137622 r0 = null;
        if (inputFormModel.isLogoEnabled() && C12017g.m31658b(inputFormModel.getReferrerUrl())) {
            r0 = new OnClickListener(this) {
                public void onClick(View view) {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(inputFormModel.getReferrerUrl())));
                }
            };
        }
        this.logo.setOnClickListener(r0);
        updateSendButton();
    }
}
