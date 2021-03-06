package com.bigcommerce.catalog.models;

import java.util.List;

public class Variants implements PaginatedModel<Variant> {

	private final List<Variant> variants;
	private final Pagination pagination;

	public Variants(final List<Variant> products, final Pagination pagination) {
		this.variants = products;
		this.pagination = pagination;
	}

	public List<Variant> getVariants() {
		return variants;
	}

	public Pagination getPagination() {
		return pagination;
	}

    @Override
    public List<Variant> getItems() {
        return getVariants();
    }

}
