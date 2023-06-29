package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

  @Autowired
  CharacterMapper characterMapper;

  // @CrossOrigin(origins = "https://qiita.com") // 許可するオリジンを指定
  @GetMapping("")
  public List<CharacterEntity> read() {
    return characterMapper.read();
  }

  @PostMapping("")
  public boolean create(@RequestBody String name) {
    return characterMapper.create(name);
  }

  @PatchMapping("/{id}")
  public boolean update(@PathVariable int id, @RequestBody String name) {
    return characterMapper.update(id, name);
  }

  @DeleteMapping("/{id}")
  public boolean delete(@PathVariable int id) {
    return characterMapper.delete(id);
  }

}
