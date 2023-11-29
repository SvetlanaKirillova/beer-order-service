package kz.fotya.beerorderservice.services;

import kz.fotya.beerorderservice.brewery.models.BeerOrderDto;
import kz.fotya.beerorderservice.brewery.models.BeerOrderPagedList;

import java.util.UUID;

public interface BeerOrderService {


    BeerOrderDto getOrderById(UUID customerId, UUID orderId);

    BeerOrderPagedList getOrdersByCustomer(UUID customerId, Integer pageNumber, Integer pageSize);

    BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto);

    BeerOrderDto updateOrder(UUID customerId, UUID orderId, BeerOrderDto beerOrderDto);
}
