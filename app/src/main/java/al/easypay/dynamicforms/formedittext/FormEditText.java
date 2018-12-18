package al.easypay.dynamicforms.formedittext;

import android.text.TextUtils;
import android.widget.EditText;
import al.easypay.dynamicforms.FormElement;

public class FormEditText extends FormElement {

    private EditText mEditText;
    private Config config;

    public FormEditText(EditText editText,Config config) {
        super(config.label);
        this.mEditText = editText;
        this.config = config;
        mEditText.setHint(config.label);
    }

    @Override
    public String getValue() {
        return mEditText.getText().toString();
    }

    @Override
    public boolean isValid(boolean showIfError) {
        String value = mEditText.getText().toString();

        if (TextUtils.isEmpty(value)){
            if (showIfError){
                mEditText.setError(config.emptyStateErrorMsg);
            }
            return false;
        }

        for (Validation validation : config.validations){
            if (!validation.regex.matcher(mEditText.getText()).matches()){
                mEditText.setError(validation.errorMsg);
                return false;
            }
        }
        return true;
    }
}