package kz.fotya.beerorderservice.web.mappers;

import kz.fotya.beerorderservice.brewery.models.BeerOrderDto;
import kz.fotya.beerorderservice.domain.BeerOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderMapper {
    BeerOrder beerOrderFromDto(BeerOrderDto beerOrderDto);
    @Mapping(target = "customerId", source = "customer.id")
    BeerOrderDto dtoFromBeerOrder(BeerOrder beerOrder);
}
