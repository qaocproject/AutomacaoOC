package steps;

import core.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import maps.LoginMaps;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginSteps{

private LoginPage loginPage;

private String usuario;

@Before
public void inicializaTeste(){
    Driver.inicializaNavegador();
}


    @Dado("que esteja na pagina do OC")
    public void queEstejaNaPaginaDoOC() {
    Driver.getDriver().get("http://140.1.254.171:3030/portal2OC/");
    loginPage = new LoginPage();

    }

    @Quando("o login for realizado com os seguintes dados")
    public void oLoginForRealizadoComOsSeguintesDados(Map<String,String> map) {

        Driver.selecionajanela();
        loginPage.realizaLogin(map.get("frmcaindex:NOME_USUARIO"),map.get("frmcaindex:SENHA_ATUAL"));
        usuario = map.get("frmcaindex:NOME_USUARIO");
    }



    @E("clicar no botao continuar")
    public void clicarNoBotaoContinuar() {
        loginPage.clicanobotaocontinuar();
    }


    @E("selecionar Empresa")
    public void selecionarEmpresa() {

       loginPage.selecionaempresa();
    }

    @E("clicar no botao Ok")
    public void clicarNoBotaoOk() {

    loginPage.clicanobotaook();
    }

    @Entao("valido que a pagina incial e exibida")
    public void validoQueAPaginaIncialEExibida() {

    loginPage.validaPaginaInicial();

    }



}

