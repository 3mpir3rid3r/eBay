package com.example.demo.repository;

import com.example.demo.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
@Repository
public interface ItemRepository extends JpaRepository<Items, Integer> {

    @Query(value = "SELECT * FROM `items` WHERE catergory_sub_id=?1 ", nativeQuery = true)
    List<Items> getSubCatergorys(Integer catergoryId);

    @Override
    List<Items> findAll();

    @Query(value = "SELECT * FROM `items` WHERE item_id=?1 ", nativeQuery = true)
    Items getItemsByItemId(Integer inputItemIdValue);
}
