package com.bigcommerce.products;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDTO {
	@JsonProperty("id")
	private int id;
	@JsonProperty("keyword_filter")
	private String keywordFilter;
	@JsonProperty("name")
	private String name;

	private enum type {
		@JsonProperty("phusical")
		phusical, @JsonProperty("digital")
		digital
	};

	@JsonProperty("sku")
	private String sku;
	@JsonProperty("description")
	private String description;
	@JsonProperty("search_keywords")
	private String searchKeywords;
	@JsonProperty("availability_description")
	private String availabilityDescription;
	@JsonProperty("price")
	private double price;
	@JsonProperty("cost_price")
	private double costPrice;
	@JsonProperty("retail_price")
	private double retailPrice;
	@JsonProperty("sale_price")
	private double salePrice;
	@JsonProperty("calculated_price")
	private double calculatedPrice;
	@JsonProperty("sort_order")
	private int sortOrder;
	@JsonProperty("is_visible")
	private boolean isVisible;
	@JsonProperty("is_featured")
	private boolean isFeatured;
	@JsonProperty("related_products")
	private String relatedProducts;
	@JsonProperty("inventory_level")
	private int inventoryLevel;
	@JsonProperty("inventory_warning_level")
	private int inventoryWarningLevel;
	@JsonProperty("warranty")
	private String warranty;
	@JsonProperty("weight")
	private double weight;
	@JsonProperty("width")
	private double width;
	@JsonProperty("height")
	private double height;
	@JsonProperty("depth")
	private double depth;
	@JsonProperty("fixed_cost_shipping_price")
	private double fixedCostShippingPrice;
	@JsonProperty("is_free_shipping")
	private boolean isFreeShipping;

	private enum inventory_tracking {
		@JsonProperty("none")
		none, @JsonProperty("simple")
		simple, @JsonProperty("sku")
		sku
	};

	@JsonProperty("rating_total")
	private int ratingTotal;
	@JsonProperty("rating_count")
	private int ratingCount;
	@JsonProperty("total_sold")
	private int totalSold;
	@JsonProperty("date_created")
	private Date dateCreated;
	@JsonProperty("brand_id")
	private int brandId;
	@JsonProperty("view_count")
	private int viewCount;
	@JsonProperty("page_title")
	private String pageTitle;
	@JsonProperty("meta_keywords")
	private String metaKeywords;
	@JsonProperty("meta_description")
	private String metaDescription;
	@JsonProperty("layout_file")
	private String layoutFile;
	@JsonProperty("is_price_hidden")
	private boolean isPriceHidden;
	@JsonProperty("price_hidden_label")
	private String priceHiddenLabel;
	@JsonProperty("categories")
	private int[] categories;
	@JsonProperty("dateModified")
	private Date date_modified;
	@JsonProperty("event_Date_field_name")
	private String eventDateFieldName;

	private enum event_Date_type {
		@JsonProperty("none")
		none, @JsonProperty("after")
		after, @JsonProperty("before")
		before, @JsonProperty("range")
		range
	};

	@JsonProperty("event_date_start")
	private Date eventDateStart;
	@JsonProperty("event_date_end")
	private Date eventDateEnd;
	@JsonProperty("myob_asset_account")
	private String myobAssetAccount;
	@JsonProperty("myob_income_account")
	private String myobIncomeAccount;
	@JsonProperty("myob_expense_account")
	private String myobExpenseAccount;
	@JsonProperty("peachtree_gl_account")
	private String peachtreeGlAccount;

	private enum condition {
		@JsonProperty("New")
		New, @JsonProperty("Used")
		Used, @JsonProperty("Refurbished")
		Refurbished
	};

	@JsonProperty("is_condition_shown")
	private boolean isConditionShown;
	@JsonProperty("preorder_release_date")
	private Date preorderReleaseDate;
	@JsonProperty("is_preorder_only")
	private boolean isPreorderOnly;
	@JsonProperty("preorder_message")
	private String preorderMessage;
	@JsonProperty("order_quantity_minimum")
	private int orderQuantityMinimum;
	@JsonProperty("order_quantity_maximum")
	private int orderQuantityMaximum;

	private enum open_graph_type {
		@JsonProperty("id")
		product, @JsonProperty("album")
		album, @JsonProperty("book")
		book, @JsonProperty("drink")
		drink, @JsonProperty("food")
		food, @JsonProperty("game")
		game, @JsonProperty("movie")
		movie, @JsonProperty("song")
		song, @JsonProperty("tv_show")
		tv_show
	};

	@JsonProperty("open_graph_title")
	private String openGraphTitle;
	@JsonProperty("open_graph_description")
	private String openGraphDescription;
	@JsonProperty("is_open_graph_thumbnail")
	private boolean isOpenGraphThumbnail;
	@JsonProperty("upc")
	private String upc;
	@JsonProperty("date_last_imported")
	private Date dateLastImported;
	@JsonProperty("option_set_id")
	private int optionSetId;
	@JsonProperty("tax_class_id")
	private int taxClassId;

	private enum option_set_display {
	};

	@JsonProperty("bin_picking_number")
	private String binPickingNumber;
	@JsonProperty("custom_url")
	private String customUrl;
	@JsonProperty("primary_image")
	private PrimaryImageDTO primaryImage;

	private enum availability {
		@JsonProperty("available")
		available, @JsonProperty("disabled")
		disabled, @JsonProperty("preorder")
		preorder
	};

	@JsonProperty("brand")
	private ProductBrandDTO brand;
	@JsonProperty("downloads")
	private ProductDownloadsDTO downloads;
	@JsonProperty("images")
	private ProductImagesDTO images;
	@JsonProperty("discount_rules")
	private ProductDiscountRuleDTO discountRules;
	@JsonProperty("configurable_fields")
	private ProductConfigurableFiledsDTO configurableFields;
	@JsonProperty("custom_fields")
	private ProductCustomFieldsDTO customFields;
	@JsonProperty("videos")
	private ProductVideosDTO videos;
	@JsonProperty("skus")
	private ProductSkusDTO skus;
	@JsonProperty("rules")
	private ProductRulesDTO rules;
	@JsonProperty("option_set")
	private ProductOptionSetDTO optionSet;
	@JsonProperty("options")
	private ProductOptionsDTO options;
	@JsonProperty("tax_class")
	private ProductTaxClassDTO taxClass;
	@JsonProperty("avalaraProductTaxCode")
	private AvalaraProductTaxCodeDTo avalaraProductTaxCode;

}
