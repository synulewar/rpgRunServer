package rpgSport.services;

import org.springframework.stereotype.Service;
import rpgSport.model.User;
import rpgSport.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {


    private UserRepository mUserRepository;

    public UserServiceImp(UserRepository mUserRepository) {
        this.mUserRepository = mUserRepository;
    }

    @Override
    public User addUser(String name) {
        User user = new User();
        user.setName(name);
        user.setScore(0L);
        mUserRepository.save(user);
        return user;
    }

    @Override
    public User updateScore(String id, String value) {
        Optional<User> optionalUser = mUserRepository.findById(Long.parseLong(id));
        if (!optionalUser.isPresent()) {
            return new User();
        }

        User user = optionalUser.get();
        user.updateScore(Long.parseLong(value));
        mUserRepository.save(user);
        return user;
    }

    @Override
    public User getUser(String id) {
        Optional<User> optionalUser = mUserRepository.findById(Long.parseLong(id));
        return optionalUser.orElse(new User());
    }

    @Override
    public Iterable<User> getAllUsers() {
        return mUserRepository.findAll();
    }
}
