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

    @FindBy(xpath="/html/body/div[3]/div/div/div[7]/div[1]/p/a")
    public WebElement btnOc;

    //tag de homologação por ambiente, alterar o mapeamento se for usar em outro ambiente
    @FindBy(id="frmcaindex:id_AB_MODO_HOMOLOGACAO")
    public WebElement linkTagHomologacao;

    @FindBy(id="page:frmSideMenu:divTituloTela")
    public WebElement linkTituloTelaInicial;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/form/div[4]/input")
    public WebElement btnContinuar;


    @FindBy(xpath="/html/body/div[4]/div[2]/div/form/div[2]/select")
    public WebElement selectEmpresa;


    @FindBy(xpath="/html/body/div[4]/div[2]/div/form/div[6]/input")
    public WebElement btnOk;


    @FindBy(xpath = "/html/body/div[4]/form/table/tbody/tr/td[1]/div/span")
    public WebElement divtelainicial;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div")
    public WebElement logo;

}
