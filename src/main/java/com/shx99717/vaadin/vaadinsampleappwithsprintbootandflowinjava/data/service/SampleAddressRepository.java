package com.shx99717.vaadin.vaadinsampleappwithsprintbootandflowinjava.data.service;

import com.shx99717.vaadin.vaadinsampleappwithsprintbootandflowinjava.data.entity.SampleAddress;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, Integer> {

}