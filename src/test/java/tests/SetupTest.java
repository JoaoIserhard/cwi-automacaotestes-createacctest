package tests;

import io.qameta.allure.Feature;

import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageObject.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

@Feature("Teste site de ecommerce")
public class SetupTest extends BaseTests{
    @Test
    @Story("Teste criação de conta")
    @DisplayName("Account Creation Test")
    public void testCreateAcc() {
        //Iniciar páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        createAnAccountPage accpage = new createAnAccountPage();
        MyAccountPage myacc = new MyAccountPage();

        //01 - Clicar em Sign In:
        home.clickBtnLogin();
        System.out.println("01 OK");


        //02 - Validar página:
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        System.out.println("02 OK");

        //03 - Inserir e-mail em Create an Account:
        login.fillEmailAcc();
        System.out.println("03 OK");

        //04 - Clicar em Create an Account:
        login.clickBtnCreateAcc();
        System.out.println("04 OK");

        //05 - Validar pagina de create account:
        accpage.isCreateAnAccountPage();
        System.out.println("05 OK");

        //06 -Selecionar Titulo:
        accpage.clickTitleMr();
        System.out.println("06 OK");

        //07 - Preencher primeiro nome:
        accpage.fillFirstName();
        System.out.println("07 OK");

        //08 - Preencher sobrenome:
        accpage.fillLastName();
        System.out.println("08 OK");

        //09 - Preencher senha:
        accpage.fillPassword();
        System.out.println("09 OK");

        //10 - Preencher dia de nascimento:
        accpage.fillDay();
        System.out.println("10 OK");

        //11 - Preencher mês de nascimento:
        accpage.fillMonth();
        System.out.println("11 OK");

        //12 - Preencher o ano de nascimento:
        accpage.fillYear();
        System.out.println("12 OK");

        //13 - Assinar para receber novidades:
        accpage.acceptNewsletter();
        System.out.println("13 OK");

        //14 - Receber ofertas:
        accpage.receiveOffers();
        System.out.println("14 OK");

        //15 - Preencher Endereço:
        accpage.fillAddress();
        System.out.println("15 OK");

        //16 - Preencher Endereço Line 2:
        accpage.fillAddressLine2();
        System.out.println("16 OK");

        //17 - Preencher cidade:
        accpage.fillCity();
        System.out.println("17 OK");

        //18 - Preencher codigo postal:
        accpage.fillZip();
        System.out.println("18 OK");

        //19 - Preencher estado
        accpage.fillState();
        System.out.println("19 OK");

        //20 - Preencher país:
        accpage.fillCountry();
        System.out.println("20 OK");

        //21 - Preencher telefone:
        accpage.fillPhoneMobile();
        System.out.println("21 OK");

        //22 - Preencher telefone:
        accpage.fillAdressAlias();
        System.out.println("22 OK");

        //23 - Submit Account:
        accpage.submitAccount();
        System.out.println("23 OK");

        //24 - Validar conta criada:
        myacc.isAccount();
        System.out.println("24 OK");
    }
}
