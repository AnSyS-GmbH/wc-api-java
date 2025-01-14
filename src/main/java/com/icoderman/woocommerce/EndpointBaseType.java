package com.icoderman.woocommerce;

/**
 * Enum with basic WooCommerce endpoints
 */
public enum EndpointBaseType {

    COUPONS("coupons"),
    CUSTOMERS("customers"),
    ORDERS("orders"),
    PRODUCTS("products"),
    PRODUCTS_ATTRIBUTES("products/attributes"),
    PRODUCTS_ATTRIBUTES_TERMS("products/attributes/PARAMETER1/terms"),
    PRODUCTS_CATEGORIES("products/categories"),
    PRODUCTS_SHIPPING_CLASSES("products/shipping_classes"),
    PRODUCTS_TAGS("products/tags"),
    REPORTS("reports"),
    REPORTS_SALES("reports/sales"),
    REPORTS_TOP_SELLERS("reports/top_sellers"),
    TAXES("taxes"),
    TAXES_CLASSES("taxes/classes"),
    WEBHOOKS("webhooks");

    private String value;

    EndpointBaseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public String getValue(int pparameter) {
        return value.replaceAll("PARAMETER1", Integer.toString(pparameter));
    }
}
