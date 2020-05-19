package com.capg.mms.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.mms.theatre.model.Screen;
@Repository
public interface IScreenRepo extends JpaRepository<Screen, Integer> {

}
