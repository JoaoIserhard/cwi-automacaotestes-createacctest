package pageObject;

import elementMapper.MyAccountPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public String accountNameGetText(){
        return accountNameLogIn.getText();
    }

    @Step("Validou a página da conta")
    public boolean isAccount(){
        return accountNameGetText().contains("Bob Esponja");
    }
}
