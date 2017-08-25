package com.venkat.service;

import com.venkat.model.Role;
import com.venkat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Role addRole(Role role){
        return roleRepository.save(role);
    }

    public Role getRoleById(Integer id){
        return roleRepository.getOne(id);
    }
    public boolean deleteRoleById(Integer id){
        roleRepository.delete(id);
        return true;
    }
}
