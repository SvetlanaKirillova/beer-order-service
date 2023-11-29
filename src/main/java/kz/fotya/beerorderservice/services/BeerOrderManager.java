package kz.fotya.beerorderservice.services;

import kz.fotya.beerorderservice.domain.BeerOrder;

public interface BeerOrderManager {
    BeerOrder createNewOrder(BeerOrder beerOrder);
}
