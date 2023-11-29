package kz.fotya.beerorderservice.services;

import kz.fotya.beerorderservice.brewery.models.BeerOrderDto;
import kz.fotya.beerorderservice.brewery.models.BeerOrderPagedList;
import kz.fotya.beerorderservice.domain.Customer;
import kz.fotya.beerorderservice.repositories.BeerOrderLineRepository;
import kz.fotya.beerorderservice.repositories.BeerOrderRepository;
import kz.fotya.beerorderservice.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerOrderServiceImpl implements BeerOrderService {
    private final CustomerRepository customerRepository;
//    private final BeerOrderRepository beerOrderRepository;
//    private final BeerOrderLineRepository beerOrderLineRepository;

    @Override
    public BeerOrderDto getOrderById(UUID customerId, UUID orderId) {
        return null;
    }

    @Override
    public BeerOrderPagedList getOrdersByCustomer(UUID customerId, Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isPresent()){

        }
        return null;
    }

    @Override
    public BeerOrderDto updateOrder(UUID customerId, UUID orderId, BeerOrderDto beerOrderDto) {
        return null;
    }
}
