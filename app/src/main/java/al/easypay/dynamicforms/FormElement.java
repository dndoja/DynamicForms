package al.easypay.dynamicforms;

public abstract class FormElement {

    private String label;

    public FormElement(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    public abstract boolean isValid(boolean showIfError);

    public abstract String getValue();
}
