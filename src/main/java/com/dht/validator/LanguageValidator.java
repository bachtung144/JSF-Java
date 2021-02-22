package com.dht.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectMany;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("LanguageValidator")
public class LanguageValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        UISelectMany lng = (UISelectMany) uiComponent.findComponent("chkNgonNgu");
        if (o.toString().isEmpty() && lng.getSelectedValues().length == 0) {
            FacesMessage m = new FacesMessage("Vui long chon it nhat 1 ngon ngu");
            m.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(m);
        }
    }
}
