package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LoginMaps {

    @FindBy(id="frmcaindex:NOME_USUARIO")
    public WebElement inpUsuario;

    @FindBy(id="frmcaindex:SENHA_ATUAL")
    public WebElement inpSenha;

    @FindBy(id="frmcaindex:btnOk")
    public WebElement btnLogin;

    //tag de homologação por ambiente, alterar o mapeamento se for usar em outro ambiente
    @FindBy(id="frmcaindex:id_AB_MODO_HOMOLOGACAO")
    public WebElement linkTagHomologacao;

    @FindBy(xpath = "//div[@id=\"page:frmSideMenu:divTituloTela\"]")
    public WebElement linkTituloTelaInicial;

}
