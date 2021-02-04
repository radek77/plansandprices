package com.raddzio.plansandprices;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@Entity(name = "PriceZone")
@Table(name = "price_zone")
public class PriceZone {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "company_name")
    @JsonProperty("company_name")
    private String companyName;

    @Column(name = "currency_code")
    @JsonProperty("currency_code")
    private String currencyCode;

    @Column(name = "currency_symbol")
    @JsonProperty("currency_symbol")
    private String currencySymbol;

    @Column(name = "currency_zero_decimal")
    @JsonProperty("currency_zero_decimal")
    private Boolean currencyZeroDecimal;

    @Column(name = "tier")
    @JsonProperty("tier")
    private Integer tier;

    public PriceZone() {
    }

    public PriceZone(String id, String companyName, String currencyCode, String currencySymbol, Boolean currencyZeroDecimal, Integer tier) {
        this.id = id;
        this.companyName = companyName;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.currencyZeroDecimal = currencyZeroDecimal;
        this.tier = tier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Boolean getCurrencyZeroDecimal() {
        return currencyZeroDecimal;
    }

    public void setCurrencyZeroDecimal(Boolean currencyZeroDecimal) {
        this.currencyZeroDecimal = currencyZeroDecimal;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "PriceZone{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencySymbol='" + currencySymbol + '\'' +
                ", currencyZeroDecimal=" + currencyZeroDecimal +
                ", tier=" + tier +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PriceZone)) return false;
        PriceZone priceZone = (PriceZone) o;
        return Objects.equals(id, priceZone.id) && Objects.equals(companyName, priceZone.companyName) && Objects.equals(currencyCode, priceZone.currencyCode) && Objects.equals(currencySymbol, priceZone.currencySymbol) && Objects.equals(currencyZeroDecimal, priceZone.currencyZeroDecimal) && Objects.equals(tier, priceZone.tier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyName, currencyCode, currencySymbol, currencyZeroDecimal, tier);
    }
}
