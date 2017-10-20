package src.com.adammendak.ProductRepository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import src.com.adammendak.ProductRepository.model.Consumer;
import src.com.adammendak.ProductRepository.model.User;
import src.com.adammendak.ProductRepository.repository.UserRepository;

@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(path= "/users", method = RequestMethod.GET)
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "layout/users/users";
    }

    @RequestMapping(path = "/users/add", method = RequestMethod.POST)
    public String addUser(Model model) {
        model.addAttribute("user", new Consumer());
        return "layout/users/edit";
    }
}
