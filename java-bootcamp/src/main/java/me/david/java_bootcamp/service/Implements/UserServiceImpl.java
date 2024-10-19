package me.david.java_bootcamp.service.Implements;

import me.david.java_bootcamp.domain.model.User;
import me.david.java_bootcamp.domain.repository.UserRespository;
import me.david.java_bootcamp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRespository userRespository;

    public UserServiceImpl(UserRespository userRespository){
        this.userRespository=userRespository;
    }

    @Override
    public User FindById(Long id) {
        return userRespository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User usertoCreate) {
        if(usertoCreate != null && userRespository.existsById(usertoCreate.getId())){
            throw new IllegalArgumentException("This user ID already exists");
        }
        return userRespository.save(usertoCreate);
    }
}
