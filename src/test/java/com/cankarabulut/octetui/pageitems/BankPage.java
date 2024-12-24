package com.cankarabulut.octetui.pageitems;

import org.openqa.selenium.By;

public class BankPage {
    public static final By TANIMLAMALAR_MENU = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/menu/ul/li[2]/div/p");
    public static final By BANKA_TANIMLA_MENU = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/menu/ul/li[2]/ul/div/div[2]/div[2]/a/p");
    public static final By BANK_SEARCH_FIELD = By.className("search-input");
    public static final By BANK_SEARCH_BUTTON = By.className("search-button");
    public static final By BANK_ACTION_BUTTON = By.cssSelector("[data-testid='tableRowAction-detail']");
    public static final By ENTEGRASYON_EKLE_BUTTON = By.cssSelector(".button.button-is-color-ghost.button-is-size-small.m-2");
    public static final By ENTEGRASYON_NAME = By.xpath("/html/body/div[4]/div/div/div/div/section/div[2]/div[2]/div[1]/form/div/section/div/div/div/div/table/tbody/tr[1]/td[1]/div/div/div");
    public static final By ENTEGRASYON_ACIKLAMA = By.xpath("/html/body/div[4]/div/div/div/div/section/div[2]/div[2]/div[1]/form/div/section/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input");
    public static final By ENTEGRASYON_VERI_TIPI = By.xpath("/html/body/div[4]/div/div/div/div/section/div[2]/div[2]/div[1]/form/div/section/div/div/div/div/table/tbody/tr[1]/td[3]/div/div");
    public static final By ENTEGRASYON_VERI_TIPI_METIN = By.cssSelector("ul[role='listbox'] li[data-value='1']");
    public static final By ENTEGRASYON_VERI_TIPI_SIFRE = By.cssSelector("ul[role='listbox'] li[data-value='2']");
    public static final By ENTEGRASYON_VERI_TIPI_SAYI = By.cssSelector("ul[role='listbox'] li[data-value='3']");
    public static final By ENTEGRASYON_VERI_TIPI_TARIH = By.cssSelector("ul[role='listbox'] li[data-value='4']");
    public static final By ENTEGRASYON_PARAMETRE_TIPI = By.xpath("/html/body/div[4]/div/div/div/div/section/div[2]/div[2]/div[1]/form/div/section/div/div/div/div/table/tbody/tr[1]/td[4]/div/div");
    public static final By ENTEGRASYON_PARAMETRE_TIPI_GORUNUR = By.cssSelector("ul[role='listbox'] li[data-value='1']");
    public static final By ENTEGRASYON_PARAMETRE_TIPI_GORUNMEZ = By.cssSelector("ul[role='listbox'] li[data-value='2']");
    public static final By ENTEGRASYON_SIRA_INDEX = By.xpath("/html/body/div[4]/div/div/div/div/section/div[2]/div[2]/div[1]/form/div/section/div/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/input");
    public static final By POS_BILGILERI_TAB = By.xpath("//button[text()='POS Bilgileri']");
}