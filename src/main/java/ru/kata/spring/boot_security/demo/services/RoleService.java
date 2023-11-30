package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entityes.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    void saveRoleToDB(Role role);

    Set<Role> findRoles(List<Long> roles);

    List<Role> getAllRoles();
}
