package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CharacterMapper {

  @Select("SELECT * FROM characters")
  public List<CharacterEntity> read();

  @Insert("INSERT INTO characters (name) VALUES (#{name})")
  public boolean create(String name);

  @Update("UPDATE characters SET name = #{name} WHERE id = #{id}")
  public boolean update(int id, String name);

  @Delete("DELETE FROM characters WHERE id = #{id}")
  public boolean delete(int id);

}