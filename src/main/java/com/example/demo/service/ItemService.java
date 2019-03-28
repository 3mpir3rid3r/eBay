package com.example.demo.service;

import com.example.demo.dto.CatergoryDto;
import com.example.demo.dto.ItemDto;

import java.util.List;

public interface ItemService {
    List<CatergoryDto> getCatergorys() throws Exception;

    List<ItemDto> getItems() throws Exception;

    ItemDto getItemById(Integer inputItemIdValue) throws Exception;
}
