package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojoclass.ModelLogin;

public interface RepoLogin extends JpaRepository<ModelLogin, Integer> {

	ModelLogin findByuname(String uname);
}
