package com.smartthings.searchlight.persistence;

import com.smartthings.searchlight.model.Bot;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

//@Repository("botRepository")
@EnableScan
public interface BotRepository extends JpaRepository<Bot, Long> {


}