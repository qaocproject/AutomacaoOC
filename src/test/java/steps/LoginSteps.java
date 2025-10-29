package steps;

import core.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
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
    Driver.getDriver().get("http://140.1.254.171:3030/portal2OC/faces/ocindex.jsp");
    Driver.mudarjanela(1);
    loginPage = new LoginPage();
    }

    @Quando("o login for realizado com os seguintes dados")
    public void oLoginForRealizadoComOsSeguintesDados(Map<String,String> map) {

        loginPage.realizaLogin(map.get("frmcaindex:NOME_USUARIO"),map.get("frmcaindex:SENHA_ATUAL"));
        usuario = map.get("frmcaindex:NOME_USUARIO");

    }

    @Entao("valido que o login foi realizado")
    public void validoQueOLoginFoiRealizado() {
        assertEquals("Mensagens do sistema",loginPage.getlinkTituloTelaInicial());
    }
}

