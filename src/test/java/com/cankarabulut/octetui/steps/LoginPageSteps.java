package com.cankarabulut.octetui.steps;

import com.cankarabulut.octetui.pageitems.LoginPage;

public class LoginPageSteps extends BaseSteps {

    public void fillEmailAndPasswordFieldAndlogin(String username, String password) {
        sendText(LoginPage.EMAIL_INPUT, username);
        sendText(LoginPage.PASSWORD_INPUT, password);

        clickElement(LoginPage.SUBMIT_BUTTON);
    }

    public void fill2FACodeAndLogin(int code) {
        sendText(LoginPage.TFA_FIELD, String.valueOf(code));
        clickElement(LoginPage.TFA_CONFIRM);
    }
}
