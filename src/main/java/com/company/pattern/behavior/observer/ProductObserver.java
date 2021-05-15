package com.company.pattern.behavior.observer;

/**
 * @author lilei
 */
public interface ProductObserver {

	/**
	 *
	 * @param product
	 */
	void onPublished(Product product);


	/**
	 *
	 * @param product
	 */
	void onPriceChanged(Product product);
}
