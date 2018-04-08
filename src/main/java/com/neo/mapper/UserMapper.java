package com.neo.mapper;

import com.neo.entity.UserEntity;

import java.util.List;

public interface UserMapper {

    List<UserEntity> getAll();

    List<UserEntity> getAllByLimit(int limit, int offset);

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}