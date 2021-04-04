package pageObject;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage(){

        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Clicar em Sign In e direcionar para a página de Login")
    public void clickBtnLogin(){
        login.click();
    }
}
