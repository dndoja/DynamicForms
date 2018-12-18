package al.easypay.dynamicforms.formedittext;

import java.util.regex.Pattern;

import al.easypay.dynamicforms.FormConfig;

class Config extends FormConfig {

    Validation[] validations;
    String emptyStateErrorMsg;

    Config(String label, Validation[] validations, String emptyStateErrorMsg) {
        super(label);
        this.validations = validations;
        this.emptyStateErrorMsg = emptyStateErrorMsg;
    }
}

class Validation{
    Pattern regex;
    String errorMsg;

    public Validation(Pattern regex, String errorMsg) {
        this.regex = regex;
        this.errorMsg = errorMsg;
    }
}
