package com.cankarabulut.octetui.pageitems;

import org.openqa.selenium.By;

public class PosPage {

    public static final By TANIMLAMALAR_MENU = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/menu/ul/li[2]/div/p");
    public static final By POS_TANIMLA_MENU = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/menu/ul/li[2]/ul/div/div[1]/div[2]/a/p");
    public static final By ADD_POS_BUTTON = By.className("button-is-color-success");
    public static final By BANK_LIST = By.cssSelector("[data-testid='formItem-bankId']");
    public static final By SELECT_BANK  = By.cssSelector("li.list-box-item");
    public static final By DRAWER_CLOSE = By.className("drawer-xmark");
    public static final By POS_NAME_INPUT = By.cssSelector("[data-testid='formItem-name']");
    public static final By POS_DURUM_INPUT = By.cssSelector("[data-testid='formItem-isActive']");
    public static final By POS_DURUM_ACTIVE = By.cssSelector("li[data-value='true']");
    public static final By POS_MOD_INPUT = By.cssSelector("[data-testid='formItem-posModeType']");
    public static final By POS_MOD_ACTIVE = By.cssSelector("li[data-value='2']");
    public static final By UYE_ISYERI_CHECK_ITEM_0 = By.cssSelector("[data-testid='formItem-posConnectionParameters.0.value']");
    public static final By UYE_ISYERI_CHECK_ITEM_1 = By.cssSelector("[data-testid='formItem-posConnectionParameters.1.value']");
    public static final By UYE_ISYERI_CHECK_ITEM_2 = By.cssSelector("[data-testid='formItem-posConnectionParameters.2.value']");
    public static final By UYE_ISYERI_CHECK_ITEM_3 = By.cssSelector("[data-testid='formItem-posConnectionParameters.3.value']");
    public static final By POS_TYPE_INPUT = By.cssSelector("[data-testid='formItem-posType']");
    public static final By POS_TYPE_STANDART = By.cssSelector("li[data-value='1']");
    public static final By CART_ACCOUNT_TYPE = By.cssSelector("[data-testid='formItem-cardAccountType']");
    public static final By CART_ACCOUNT_TYPE_TUMU = By.cssSelector("li[data-value='1']");
    public static final By POS_TYPE_3D_INPUT = By.cssSelector("[data-testid='formItem-pos3DType']");
    public static final By POS_TYPE_WITHOUT_3D = By.cssSelector("li[data-value='2']");
    public static final By ADD_POS_SAVE_BUTTON = By.xpath("//button[text()='Kaydet']");
    public static final By POS_SEARCH_FIELD = By.className("search-input");
    public static final By POS_SEARCH_BUTTON = By.className("search-button");
    public static final By POS_ACTION_BUTTON = By.cssSelector("[data-testid='tableRowAction-detail']");
}
