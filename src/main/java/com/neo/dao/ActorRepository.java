package com.neo.dao;

import com.neo.entity.Actor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor,Integer>,JpaSpecificationExecutor {


    List<Actor> findByAge(Integer age);

    List<Actor> findByRealnameContainingAndAgeLessThan(String realname,Integer age);

    List<Actor> findByNameContainingOrderByAge(String name);

    Page<Actor> findAll(Pageable pageable);

//    Page findAll(Specification specification, Pageable pageable);


    List<Actor> findFirst2ByNameContaining(String name);
}
