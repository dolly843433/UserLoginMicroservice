package com.user.login.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.login.entity.Model;



public interface Repository  extends JpaRepository <Model, String> {

}
