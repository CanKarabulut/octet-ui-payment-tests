package com.cankarabulut.octetui.steps;


import com.cankarabulut.octetui.pageitems.BankPage;
import com.cankarabulut.octetui.pageitems.PosPage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class PosPageSteps extends BaseSteps {
    public static String randomPOSName;
    public void definesPos(DataTable table) throws InterruptedException {
        Thread.sleep(5000);
        hoverElement(PosPage.TANIMLAMALAR_MENU);
        clickElement(PosPage.POS_TANIMLA_MENU);
        clickElement(PosPage.ADD_POS_BUTTON);
        clickElement(PosPage.BANK_LIST);

        String selectedBankName = randomSelectElementsAndClick(PosPage.SELECT_BANK);

        Thread.sleep(2000);
        while (true) {
            try {
                if (isDiplayedClickElement(PosPage.UYE_ISYERI_CHECK_ITEM_0) ||
                        isDiplayedClickElement(PosPage.UYE_ISYERI_CHECK_ITEM_1) ||
                        isDiplayedClickElement(PosPage.UYE_ISYERI_CHECK_ITEM_2) ||
                        isDiplayedClickElement(PosPage.UYE_ISYERI_CHECK_ITEM_3)) {

                    randomPOSName = randomPOSGenerate();

                    sendText(PosPage.POS_NAME_INPUT, randomPOSName);
                    clickElement(PosPage.POS_DURUM_INPUT);
                    clickElement(PosPage.POS_DURUM_ACTIVE);
                    clickElement(PosPage.POS_MOD_INPUT);
                    clickElement(PosPage.POS_MOD_ACTIVE);

                    sendText(PosPage.UYE_ISYERI_CHECK_ITEM_0, "TEST_API_NAME");
                    sendText(PosPage.UYE_ISYERI_CHECK_ITEM_1, "TEST_PASSWORD");
                    sendText(PosPage.UYE_ISYERI_CHECK_ITEM_2, "TEST_MERCHANT");
                    sendText(PosPage.UYE_ISYERI_CHECK_ITEM_3, "TEST_3D KEY");

                    Thread.sleep(5000);

                    clickElement(PosPage.POS_TYPE_INPUT);
                    clickElement(PosPage.POS_TYPE_STANDART);
                    clickElement(PosPage.CART_ACCOUNT_TYPE);
                    clickElement(PosPage.CART_ACCOUNT_TYPE_TUMU);
                    clickElement(PosPage.POS_TYPE_3D_INPUT);
                    clickElement(PosPage.POS_TYPE_WITHOUT_3D);

                    Thread.sleep(5000);

                    List<WebElement> spansInvidual = driver.findElements(By.xpath("//div[@data-testid='formItem-posInstalmentPersonal']//span"));
                    for (WebElement span : spansInvidual) {
                        String text = span.getText().trim();
                        if (isNumeric(text)) {
                            int number = Integer.parseInt(text);
                            if (number % 2 != 0) {
                                clickElement(span);
                            }
                        }
                    }

                    List<WebElement> spansCommercial = driver.findElements(By.xpath("//div[@data-testid='formItem-posInstalmentCommercial']//span"));
                    for (WebElement span : spansCommercial) {
                        String text = span.getText().trim();
                        if (isNumeric(text)) {
                            int number = Integer.parseInt(text);
                            if (number % 2 == 0) {
                                clickElement(span);
                            }
                        }
                    }
                    Thread.sleep(2000);
                    clickElement(PosPage.ADD_POS_SAVE_BUTTON);
                    Thread.sleep(2000);
                }
                break;

            } catch (Exception e) {
                clickElement(PosPage.DRAWER_CLOSE);
                hoverElement(BankPage.TANIMLAMALAR_MENU);
                clickElement(BankPage.BANKA_TANIMLA_MENU);
                Thread.sleep(2000);
                sendText(BankPage.BANK_SEARCH_FIELD, selectedBankName);
                clickElement(BankPage.BANK_SEARCH_BUTTON);
                Thread.sleep(3000);
                clickElement(BankPage.BANK_ACTION_BUTTON);
                Thread.sleep(2000);
                findAndClickElement(BankPage.POS_BILGILERI_TAB, "POS Bilgileri");
                clickElement(BankPage.ENTEGRASYON_EKLE_BUTTON);
                Thread.sleep(2000);

                List<Map<String, String>> rows = table.asMaps(String.class, String.class);

                for (Map<String, String> row : rows) {
                    clickElement(BankPage.ENTEGRASYON_NAME);
                    sendText(BankPage.ENTEGRASYON_NAME, row.get("Name"));

                    Thread.sleep(5000);

                    clickElement(BankPage.ENTEGRASYON_ACIKLAMA);
                    sendText(BankPage.ENTEGRASYON_ACIKLAMA, row.get("Açıklama"));

                    clickElement(BankPage.ENTEGRASYON_VERI_TIPI);
                    By veriTipiOption;
                    switch (row.get("Veri Tipi")) {
                        case "Metin":
                            veriTipiOption = BankPage.ENTEGRASYON_VERI_TIPI_METIN;
                            break;
                        case "Şifre":
                            veriTipiOption = BankPage.ENTEGRASYON_VERI_TIPI_SIFRE;
                            break;
                        case "Sayı":
                            veriTipiOption = BankPage.ENTEGRASYON_VERI_TIPI_SAYI;
                            break;
                        case "Tarih":
                            veriTipiOption = BankPage.ENTEGRASYON_VERI_TIPI_TARIH;
                            break;
                        default:
                            throw new IllegalArgumentException("Geçersiz Veri Tipi: " + row.get("Veri Tipi"));
                    }
                    clickElement(veriTipiOption);

                    clickElement(BankPage.ENTEGRASYON_PARAMETRE_TIPI);
                    By parametreTipiOption;
                    switch (row.get("Parametre Tipi")) {
                        case "Görünür":
                            parametreTipiOption = BankPage.ENTEGRASYON_PARAMETRE_TIPI_GORUNUR;
                            break;
                        case "Görünmez":
                            parametreTipiOption = BankPage.ENTEGRASYON_PARAMETRE_TIPI_GORUNMEZ;
                            break;
                        default:
                            throw new IllegalArgumentException("Geçersiz Parametre Tipi: " + row.get("Parametre Tipi"));
                    }
                    clickElement(parametreTipiOption);

                    sendText(BankPage.ENTEGRASYON_SIRA_INDEX, row.get("Sıra Index"));

                    clickElement(PosPage.DRAWER_CLOSE);
                    hoverElement(BankPage.TANIMLAMALAR_MENU);
                    clickElement(PosPage.POS_TANIMLA_MENU);

                    Thread.sleep(5000);
                }
            }
        }
    }
}
