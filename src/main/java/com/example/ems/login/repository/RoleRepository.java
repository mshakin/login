package com.example.ems.login.repository;

import com.example.ems.login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);

    Role save(Role role);
}