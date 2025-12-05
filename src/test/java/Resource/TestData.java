package Resource;

import pojo.LoginRequestPayload;

public class TestData {

    public LoginRequestPayload loginData(String userEmail, String userPassword){

        LoginRequestPayload login= new LoginRequestPayload();
        login.setUserEmail(userEmail);
        login.setUserPassword(userPassword);
        return login;
    }
}
