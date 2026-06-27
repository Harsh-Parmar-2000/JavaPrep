package com.singaji.bharosa.repositories;

public class UserRepository extends  JpaRepository / CRUDRepository / MongoRepository<User, String> {
    User findById();
    List<User> findAll();
    User findByUserName();
    // @Query("Select * from"), @Param
}
