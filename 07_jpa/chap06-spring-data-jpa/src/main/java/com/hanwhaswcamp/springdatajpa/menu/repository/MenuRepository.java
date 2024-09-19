package com.hanwhaswcamp.springdatajpa.main.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
