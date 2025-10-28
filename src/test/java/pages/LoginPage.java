package pages;

import core.Driver;
import maps.LoginMaps;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private LoginMaps loginMaps;

    public LoginPage() {

        loginMaps = new LoginMaps();
        PageFactory.initElements(Driver.getDriver(),loginMaps);
    }

    public void realizaLogin(String usuario, String senha){

        loginMaps.inpUsuario.sendKeys(usuario);
        loginMaps.inpSenha.sendKeys(senha);
        loginMaps.btnLogin.click();
    }

    public String getlinkTagHomologacao(){
        return loginMaps.linkTagHomologacao.getText();
    }
}
