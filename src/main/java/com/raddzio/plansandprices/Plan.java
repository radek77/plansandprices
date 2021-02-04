package com.raddzio.plansandprices;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "Plan")
@Table(name = "plan")
public class Plan {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String handle;
    private String name;

    @Column(name = "product_name")
    @JsonProperty("product_name")
    private String productName;

    private String product;
    private String licences;

    @Column(name = "payment_interval_unit")
    @JsonProperty("payment_interval_unit")
    private String paymentIntervalUnit;

    @Column(name = "payment_interval")
    @JsonProperty("payment_interval")
    private String paymentInterval;

    @Column(name = "renewal_interval_unit")
    @JsonProperty("renewal_interval_unit")
    private String renewalIntervalUnit;

    @Column(name = "renewal_interval")
    @JsonProperty("renewal_interval")
    private String renewalInterval;

    private String type;
    private String category;

    @Column(name = "price_zone_id")
    @JsonProperty("price_zone_id")
    private String priceZoneId;

    @Column(name = "enabled_direct")
    @JsonProperty("enabled_direct")
    private String enabledDirect;

    @Column(name = "enabled_indirect")
    @JsonProperty("enabled_indirect")
    private String enabledIndirect;

    public Plan() {
    }

    public Plan(Long id, String handle, String name, String productName, String product, String licences,
            String paymentIntervalUnit, String paymentInterval, String renewalIntervalUnit, String renewalInterval,
            String type, String category, String priceZoneId, String enabledDirect, String enabledIndirect) {
        this.id = id;
        this.handle = handle;
        this.name = name;
        this.productName = productName;
        this.product = product;
        this.licences = licences;
        this.paymentIntervalUnit = paymentIntervalUnit;
        this.paymentInterval = paymentInterval;
        this.renewalIntervalUnit = renewalIntervalUnit;
        this.renewalInterval = renewalInterval;
        this.type = type;
        this.category = category;
        this.priceZoneId = priceZoneId;
        this.enabledDirect = enabledDirect;
        this.enabledIndirect = enabledIndirect;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHandle() {
        return this.handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLicences() {
        return this.licences;
    }

    public void setLicences(String licences) {
        this.licences = licences;
    }

    public String getPaymentIntervalUnit() {
        return this.paymentIntervalUnit;
    }

    public void setPaymentIntervalUnit(String paymentIntervalUnit) {
        this.paymentIntervalUnit = paymentIntervalUnit;
    }

    public String getPaymentInterval() {
        return this.paymentInterval;
    }

    public void setPaymentInterval(String paymentInterval) {
        this.paymentInterval = paymentInterval;
    }

    public String getRenewalIntervalUnit() {
        return this.renewalIntervalUnit;
    }

    public void setRenewalIntervalUnit(String renewalIntervalUnit) {
        this.renewalIntervalUnit = renewalIntervalUnit;
    }

    public String getRenewalInterval() {
        return this.renewalInterval;
    }

    public void setRenewalInterval(String renewalInterval) {
        this.renewalInterval = renewalInterval;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriceZoneId() {
        return this.priceZoneId;
    }

    public void setPriceZoneId(String priceZoneId) {
        this.priceZoneId = priceZoneId;
    }

    public String getEnabledDirect() {
        return this.enabledDirect;
    }

    public void setEnabledDirect(String enabledDirect) {
        this.enabledDirect = enabledDirect;
    }

    public String getEnabledIndirect() {
        return this.enabledIndirect;
    }

    public void setEnabledIndirect(String enabledIndirect) {
        this.enabledIndirect = enabledIndirect;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", handle='" + getHandle() + "'" +
            ", name='" + getName() + "'" +
            ", productName='" + getProductName() + "'" +
            ", product='" + getProduct() + "'" +
            ", licences='" + getLicences() + "'" +
            ", paymentIntervalUnit='" + getPaymentIntervalUnit() + "'" +
            ", paymentInterval='" + getPaymentInterval() + "'" +
            ", renewalIntervalUnit='" + getRenewalIntervalUnit() + "'" +
            ", renewalInterval='" + getRenewalInterval() + "'" +
            ", type='" + getType() + "'" +
            ", category='" + getCategory() + "'" +
            ", priceZoneId='" + getPriceZoneId() + "'" +
            ", enabledDirect='" + getEnabledDirect() + "'" +
            ", enabledIndirect='" + getEnabledIndirect() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Plan)) {
            return false;
        }
        Plan plan = (Plan) o;
        return Objects.equals(id, plan.id) && Objects.equals(handle, plan.handle) && Objects.equals(name, plan.name) && Objects.equals(productName, plan.productName) && Objects.equals(product, plan.product) && Objects.equals(licences, plan.licences) && Objects.equals(paymentIntervalUnit, plan.paymentIntervalUnit) && Objects.equals(paymentInterval, plan.paymentInterval) && Objects.equals(renewalIntervalUnit, plan.renewalIntervalUnit) && Objects.equals(renewalInterval, plan.renewalInterval) && Objects.equals(type, plan.type) && Objects.equals(category, plan.category) && Objects.equals(priceZoneId, plan.priceZoneId) && Objects.equals(enabledDirect, plan.enabledDirect) && Objects.equals(enabledIndirect, plan.enabledIndirect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, handle, name, productName, product, licences, paymentIntervalUnit, paymentInterval, renewalIntervalUnit, renewalInterval, type, category, priceZoneId, enabledDirect, enabledIndirect);
    }

}