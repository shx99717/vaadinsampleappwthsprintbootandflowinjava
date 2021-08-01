package com.shx99717.vaadin.vaadinsampleappwithsprintbootandflowinjava.data.service;

import com.shx99717.vaadin.vaadinsampleappwithsprintbootandflowinjava.data.entity.SamplePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}