package org.java.backend;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
 
class Product {
	private String name;
	private int price;
 
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
 
	public String getName() {
		return name;
	}
 
	public int getPrice() {
		return price;
	}
 
}
 
class LocalSupplier implements Supplier<Product> {
 
	@Override
	public Product get() {
		return new Product("Local Product", 100);
	}
 
}
 
class OnlineSupplier implements Supplier<Product> {
 
	@Override
	public Product get() {
		return new Product("Online Product", 100);
	}
 
}
 
public class _02_Main {
	public static void main(String[] args) {
//		LocalSupplier localSupplier = new LocalSupplier();
		Supplier<Product> localSupplier = () -> new Product("local", 100);
		Product localProduct = localSupplier.get();
		System.out.println(localProduct.getName());
		
//		OnlineSupplier onlineSupplier = new OnlineSupplier();
		Supplier<Product> onlineSupplier = () -> new Product("online", 100);

		Product onlineProduct = onlineSupplier.get();
		System.out.println(onlineProduct.getName());


		Supplier<Product> retailSupplier = () -> new Product("Retail Product", 1);
		Product retailProduct = retailSupplier.get();

		Consumer<Product> printProductDetailsConsumer = e -> System.out
				.println("Product Name: " + e.getName() + " Price: " + e.getPrice());

		List<Product> list = Arrays.asList(onlineSupplier.get(), retailSupplier.get(), localSupplier.get());
		list.forEach(printProductDetailsConsumer);
//		printProductDetailsConsumer.accept(retailProduct);
 
	}
}