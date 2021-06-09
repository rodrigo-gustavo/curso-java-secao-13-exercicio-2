package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private Client client;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, Client client, OrderStatus status) {
		this.moment = moment;
		this.client = client;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double total = 0;
		for (OrderItem o : items) {
			total += o.getQuantity() * o.getPrice();
		}
		return total;
	}

}
