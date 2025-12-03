package Resource;

import pojo.LoginRequestPayload;

public class TestData {

    public LoginRequestPayload loginData(){

        LoginRequestPayload login= new LoginRequestPayload();
        login.setUserEmail("vinit12@gmail.com");
        login.setUserPassword("Vinit@123");
        return login;
    }
}
