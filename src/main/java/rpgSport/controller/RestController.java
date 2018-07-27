package rpgSport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import rpgSport.model.User;
import rpgSport.services.UserService;

import java.util.Optional;


@Controller
public class RestController {

    private UserService mUserService;

    public RestController(UserService mUserService) {
        this.mUserService = mUserService;
    }

    @GetMapping("/user")
    public @ResponseBody User getUser(@RequestParam String id) {
        return mUserService.getUser(id);
    }

    @GetMapping("/adduser")
    public @ResponseBody User addUser(@RequestParam String name) {
        return mUserService.addUser(name);
    }

    @GetMapping("/update")
    public @ResponseBody User updateScore(@RequestParam String id, @RequestParam String score,
                                          @RequestParam String runDistance, @RequestParam String bikeDistance,
                                          @RequestParam String walkDistance) {
        return mUserService.update(id, score, runDistance, bikeDistance, walkDistance);
    }

    @GetMapping("/allusers")
    public @ResponseBody Iterable<User> getAllUsers() {
        return mUserService.getAllUsers();
    }
}
