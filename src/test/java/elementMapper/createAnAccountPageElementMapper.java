package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createAnAccountPageElementMapper {

    @FindBy(id = "uniform-id_gender1")
    public WebElement titleMr;

    @FindBy(id = "customer_firstname")
    public WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    public WebElement customerLastName;

    @FindBy(id = "passwd")
    public WebElement customerPassword;

    @FindBy(id = "days")
    public WebElement customerDay;

    @FindBy(id = "months")
    public WebElement customerMonth;

    @FindBy(id = "years")
    public WebElement customerYear;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "optin")
    public WebElement offers;

    @FindBy (id = "address1")
    public WebElement address;

    @FindBy (id = "address2")
    public WebElement addressLine2;

    @FindBy (id = "city")
    public WebElement city;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(id = "alias")
    public WebElement addressAlias;

    @FindBy(id = "submitAccount")
    public WebElement submitAcc;
}
