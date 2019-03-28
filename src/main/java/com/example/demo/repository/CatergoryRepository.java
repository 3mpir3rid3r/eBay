package com.example.demo.repository;

import com.example.demo.dto.CatergoryDto;
import com.example.demo.entity.Catergory;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
@Repository
public interface CatergoryRepository extends JpaRepository<Catergory, Integer> {

    @Query(value = "SELECT * FROM `catergory` WHERE catergory_sub_id='0' ", nativeQuery = true)
    List<Catergory> getCatergorys();

    @Query(value = "SELECT * FROM `catergory` WHERE catergory_sub_id=?1 ", nativeQuery = true)
    List<Catergory> getSubCatergorys(Integer subCatergoryId);
}
