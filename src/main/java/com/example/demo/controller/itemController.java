package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.ItemService;
import com.example.demo.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
@RequestMapping("/item")
@RestController
public class itemController {

    @Autowired
    ItemService itemService;

    @GetMapping(Constants.CATERGORY)
    public List<CatergoryDto> getCatergorys() {
        try {
            return itemService.getCatergorys();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping(Constants.GET_ALL_ITEMS)
    public List<ItemDto> getItems() {
        try {
            return itemService.getItems();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping(Constants.GET_ITEM_BY_ID)
    public ItemDto getItemById(@PathVariable Integer inputItemIdValue) {
        try {
            return itemService.getItemById(inputItemIdValue);
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(Constants.ADD_TO_CART)
    public ItemDto addToCart(@RequestBody AddToCartDto addToCartDto) {
        try {
            System.out.println(addToCartDto + ":::::::::::::::::::::::");
//            return itemService.getItemById(inputItemIdValue);
        } catch (Exception e) {
        }
        return null;
    }


}
