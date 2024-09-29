package com.example.demo.repository;

import com.example.demo.model.SpiritualDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpiritualDetailsRepository extends JpaRepository<SpiritualDetails, Integer> {

    @Query("SELECT u FROM SpiritualDetails u WHERE u.label = ?1")
    List<SpiritualDetails> getLabelContent(String label);


    @Query("SELECT u FROM SpiritualDetails u WHERE u.message LIKE CONCAT('%',:message,'%')")
    List<SpiritualDetails> getMessagesContent(@Param("message") String message);
}
