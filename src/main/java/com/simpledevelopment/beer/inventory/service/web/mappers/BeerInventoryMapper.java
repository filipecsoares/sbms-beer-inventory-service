package com.simpledevelopment.beer.inventory.service.web.mappers;

import org.mapstruct.Mapper;

import com.simpledevelopment.beer.inventory.service.domain.BeerInventory;
import com.simpledevelopment.beer.inventory.service.web.model.BeerInventoryDto;

@Mapper(uses = { DateMapper.class })
public interface BeerInventoryMapper {

	BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

	BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
