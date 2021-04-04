package pageObject;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Preencheu o e-mail para criar conta")
    public void fillEmailAcc(){
        emailCreate.sendKeys("bobesponjafeliz@biquinimail.com.br");
    }

    @Step("Clicou em 'Create An Account'")
    public void clickBtnCreateAcc(){
        btnCreateAcc.click();
    }

}