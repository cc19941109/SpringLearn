package com.neo.web;

import com.neo.entity.Actor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/actor")
public class ActorController {

    @GetMapping("/all")
    public List<Actor> findByPages(){


        return null;

    }

}
