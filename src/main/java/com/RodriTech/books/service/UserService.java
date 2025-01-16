package com.RodriTech.books.service;

import com.RodriTech.books.dto.UserDTO;
import com.RodriTech.books.entities.User;
import com.RodriTech.books.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO cadasUser(UserDTO userDTO){
        User user = new User();
        copyDtoToUser(user, userDTO);
        user = repository.save(user);
        return new UserDTO(user);
    }

    private void copyDtoToUser(User user, UserDTO userDTO) {
        user.setName(userDTO.getName());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        user.setFavoriteBook(userDTO.getFavoriteBook());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
    }
}
