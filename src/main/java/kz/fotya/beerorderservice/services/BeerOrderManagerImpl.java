package kz.fotya.beerorderservice.services;

import kz.fotya.beerorderservice.domain.BeerOrder;
import kz.fotya.beerorderservice.domain.BeerOrderStatusEnum;
import kz.fotya.beerorderservice.repositories.BeerOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BeerOrderManagerImpl implements BeerOrderManager {

    private final BeerOrderRepository beerOrderRepository;

    @Override
    public BeerOrder createNewOrder(BeerOrder beerOrder) {
        beerOrder.setOrderStatus(BeerOrderStatusEnum.NEW);
        BeerOrder savedBeerOrder = beerOrderRepository.saveAndFlush(beerOrder);

        return null;
    }

    private void sendBeerOrderEvent(BeerOrder beerOrder){

    }
}
