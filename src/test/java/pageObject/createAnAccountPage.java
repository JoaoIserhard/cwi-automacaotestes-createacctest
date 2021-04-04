package pageObject;

import elementMapper.createAnAccountPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Browser;

public class createAnAccountPage extends createAnAccountPageElementMapper {

    public createAnAccountPage(){PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Validar a página Create an Account")
    public boolean isCreateAnAccountPage(){
        return (Browser.wait.until(ExpectedConditions.urlContains("#account-creation")));
    }

    @Step("Selecionar opção Mr")
    public void clickTitleMr(){
        titleMr.click();
    }

    @Step("Preencher primeiro nome")
    public void fillFirstName(){
        customerFirstName.sendKeys("Bob");
    }

    @Step("Preencher sobrenome")
    public void fillLastName(){
        customerLastName.sendKeys("Esponja");
    }

    @Step("Preencher senha")
    public void fillPassword(){
        customerPassword.sendKeys("HamburguerDeSiri");
    }

    @Step("Selecionar o dia de nascimento")
    public void fillDay(){
        customerDay.click();
        customerDay.sendKeys("14");
    }

    @Step("Selecionar o mês de nascimento")
    public void fillMonth(){
        customerMonth.click();
        customerMonth.sendKeys("July");
    }

    @Step("Selecionar o ano de nascimento")
    public void fillYear(){
        customerYear.click();
        customerYear.sendKeys("1986");
    }

    @Step("Assinar novidades")
    public void acceptNewsletter(){
        newsletter.click();
    }

    @Step("Receber ofertas")
    public void receiveOffers(){
        offers.click();
    }

    @Step("Preencher endereço")
    public void fillAddress(){
        address.click();
        address.sendKeys("Rua da Concha, 124");
    }

    @Step("Preencher AddressLine2")
    public void fillAddressLine2(){
        addressLine2.click();
        addressLine2.sendKeys("Abacaxi no fundo do mar");
    }

    @Step("Preencher cidade")
    public void fillCity(){
        city.click();
        city.sendKeys("Fenda do Biquíni");
    }

    @Step("Preencher ZIP")
    public void fillZip(){
        postcode.click();
        postcode.sendKeys("72716");
    }

    @Step("Preencher estado")
    public void fillState(){
        state.click();
        state.sendKeys("Hawaii");
    }

    @Step("Preencher estado")
    public void fillCountry(){
        country.click();
        country.sendKeys("United States");
    }

    @Step("Preencher telefone")
    public void fillPhoneMobile(){
        phoneMobile.click();
        phoneMobile.sendKeys("(707) 663-4279");
    }

    @Step("Preencher nome do endereço")
    public void fillAdressAlias() {
        addressAlias.click();
        addressAlias.clear();
        addressAlias.sendKeys("Endereço do Bob Esponja");
    }

    @Step("Conluir o cadastro")
    public void submitAccount(){
        submitAcc.click();
    }
}
