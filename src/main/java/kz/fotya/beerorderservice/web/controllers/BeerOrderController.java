package kz.fotya.beerorderservice.web.controllers;

import kz.fotya.beerorderservice.brewery.models.BeerOrderDto;
import kz.fotya.beerorderservice.brewery.models.BeerOrderPagedList;
import kz.fotya.beerorderservice.services.BeerOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customers/{customerId}/")
public class BeerOrderController {

    private static final Integer DEFAULT_PAGE_NUMBER = 0;
    private static final Integer DEFAULT_PAGE_SIZE = 25;
    private final BeerOrderService beerOrderService;


    public BeerOrderController(BeerOrderService beerOrderService) {
        this.beerOrderService = beerOrderService;
    }

    @GetMapping("orders/")
    BeerOrderPagedList gerOrderList(@PathVariable UUID customerId,
                                    @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
                                    @RequestParam(value = "pageSize", required = false) Integer pageSize){
        if (pageNumber == null) pageNumber = DEFAULT_PAGE_NUMBER;
        if (pageSize == null) pageSize = DEFAULT_PAGE_SIZE;

        return beerOrderService.getOrdersByCustomer(customerId, pageNumber, pageSize);
    }
    @GetMapping("orders/{orderId}")
    BeerOrderDto getOrder(@PathVariable UUID customerId,
                          @PathVariable UUID orderId){
        return beerOrderService.getOrderById(customerId, orderId);
    }

    @PostMapping("orders")
    @ResponseStatus(HttpStatus.CREATED)
    BeerOrderDto postOrder(@PathVariable UUID customerId,
                            @RequestBody BeerOrderDto beerOrderDto){
        return beerOrderService.placeOrder(customerId, beerOrderDto);
    }

    @PutMapping("orders/{orderId}")
    BeerOrderDto putOrder(@PathVariable UUID customerId,
                          @PathVariable UUID orderId,
                          @RequestBody BeerOrderDto beerOrderDto){

        return beerOrderService.updateOrder(customerId, orderId, beerOrderDto);
    }
}
