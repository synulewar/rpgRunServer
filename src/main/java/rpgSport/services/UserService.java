package rpgSport.services;

import rpgSport.model.User;

public interface UserService {
    User addUser(String name);
    User updateScore(String id, String value);
    User update(String id, String score, String runDistance, String bikeDistance, String walkDistance);
    User getUser(String id);
    Iterable<User> getAllUsers();
}
