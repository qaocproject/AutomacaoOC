package pages;

import core.Driver;
import maps.LoginMaps;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    private LoginMaps loginMaps;

    public LoginPage() {

        loginMaps = new LoginMaps();
        PageFactory.initElements(Driver.getDriver(),loginMaps);
    }

    public void realizaLogin(String usuario, String senha){

        loginMaps.inpUsuario.sendKeys("felipe.rocha");
        loginMaps.inpSenha.sendKeys("239239");
        loginMaps.btnLogin.click();
    }

    public String getlinkTituloTelaInicial(){
        return loginMaps.linkTituloTelaInicial.getText();
    }

    public void clicanobotaocontinuar(){

     Driver.esperaelemento(loginMaps.btnContinuar);
     loginMaps.btnContinuar.click();

    }

    public void selecionaempresa(){

        Driver.esperaelemento(loginMaps.selectEmpresa);
        Select select = new Select(loginMaps.selectEmpresa);
        select.selectByValue("001");

    }

    public  void clicanobotaook(){
        Driver.esperaelemento(loginMaps.btnOk);
        loginMaps.btnOk.click();
    }

    public void validaPaginaInicial(){

        Driver.esperaelemento(loginMaps.tituloPaginaInicial);
        Assert.assertEquals("OC",loginMaps.tituloPaginaInicial.getText());

    }


}
