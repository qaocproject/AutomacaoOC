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

    public void realizaLogin(String usuario, String senha) {
        Driver.esperaelemento(loginMaps.inpUsuario);
        loginMaps.inpUsuario.sendKeys("felipe.rocha");
        loginMaps.inpSenha.sendKeys("239239");
        loginMaps.btnLogin.click();
        Driver.mudarjanela(1);
    }



    public String getlinkTituloTelaInicial(){
        return loginMaps.linkTituloTelaInicial.getText();
    }

    public void clicanobotaocontinuar(){

        Driver.identificajanela("main");
        Driver.esperaelemento(loginMaps.btnContinuar);
        loginMaps.btnContinuar.click();
    }

    public void selecionaempresa(){

        Driver.mudarjanela(1);
        Driver.identificajanela("main");
        Driver.esperaelemento(loginMaps.selectEmpresa);
        Select select = new Select(loginMaps.selectEmpresa);
        select.selectByValue("001");

    }

    public  void clicanobotaook(){


        Driver.esperaelemento(loginMaps.btnOk);
        loginMaps.btnOk.click();
    }

    public void validaPaginaInicial(){
        Driver.titulo();
        Driver.esperaelemento(loginMaps.divtelainicial);
        Assert.assertEquals("OC",loginMaps.divtelainicial.getText());

    }


}
