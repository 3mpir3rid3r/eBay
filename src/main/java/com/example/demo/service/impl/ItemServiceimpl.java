package com.example.demo.service.impl;

import com.example.demo.dto.CatergoryDto;
import com.example.demo.dto.ItemDto;
import com.example.demo.entity.Catergory;
import com.example.demo.entity.Items;
import com.example.demo.repository.CatergoryRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceimpl implements ItemService {

    @Autowired
    CatergoryRepository catergoryRepository;

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<CatergoryDto> getCatergorys() throws Exception {

        final List<Catergory> mainCatergorys = catergoryRepository.getCatergorys();

        if (!mainCatergorys.isEmpty()) {
            List<CatergoryDto> catergoryDtos = new ArrayList<>();

            for (Catergory catergory : mainCatergorys) {

                Integer main = 0;
                List<CatergoryDto> catergoryDtos1 = new ArrayList<>();
                CatergoryDto catergoryDto = new CatergoryDto();

                final List<Catergory> subCatergorys = catergoryRepository.getSubCatergorys(catergory.getCatergoryId());

                if (!subCatergorys.isEmpty()) {
                    for (Catergory catergory1 : subCatergorys) {

                        final List<Items> subCatergorys1 = itemRepository.getSubCatergorys(catergory1.getCatergoryId());
                        CatergoryDto catergoryDto1 = new CatergoryDto();
                        catergoryDto1.setCatergoryName(catergory1.getCatergoryName());
                        catergoryDto1.setCatergoryCount(subCatergorys1.size() + "");
                        catergoryDtos1.add(catergoryDto1);
                        main += subCatergorys1.size();
                    }
                    catergoryDto.setCatergoryName(catergory.getCatergoryName());
                    catergoryDto.setCatergoryCount(main.toString());
                    catergoryDto.setSubCatergory(catergoryDtos1);
                    catergoryDtos.add(catergoryDto);
                } else {
                    throw new Exception("null");
                }
            }
            return catergoryDtos;
        } else {
            throw new Exception("null");
        }
    }

    @Override
    public List<ItemDto> getItems() throws Exception {
        final List<Items> items = itemRepository.findAll();
        if (!items.isEmpty()) {
            final List<ItemDto> allItems = new ArrayList<>();
            for (Items items1 : items) {

                ItemDto itemDto = new ItemDto();
                BeanUtils.copyProperties(items1, itemDto);
                itemDto.setItemId(items1.getItemId().toString());
                itemDto.setCatergorySubId(items1.getCatergorySubId().toString());
                itemDto.setItemPrice(items1.getItemPrice().toString());
                allItems.add(itemDto);
            }
            return allItems;
        } else {
            throw new Exception("null");
        }

    }

    @Override
    public ItemDto getItemById(Integer inputItemIdValue) throws Exception {
        final Items itemsByItemId = itemRepository.getItemsByItemId(inputItemIdValue);
        if (null != inputItemIdValue) {
            ItemDto itemDto = new ItemDto();

            BeanUtils.copyProperties(itemsByItemId, itemDto);
            itemDto.setItemId(itemsByItemId.getItemId().toString());
            itemDto.setCatergorySubId(itemsByItemId.getCatergorySubId().toString());
            itemDto.setItemPrice(itemsByItemId.getItemPrice().toString());

            return itemDto;
        } else {
            throw new Exception("null");
        }

    }
}
