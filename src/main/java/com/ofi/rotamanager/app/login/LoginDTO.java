package com.ofi.rotamanager.app.login;

/**
 * Created by Omar Farooq Ilyas on 12.06.2015.
 */
public class LoginDTO {

    private String shopId;
    private String password;
    private boolean authenticated;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }


}
