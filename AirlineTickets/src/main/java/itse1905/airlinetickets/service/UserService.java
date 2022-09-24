package itse1905.airlinetickets.service;


import itse1905.airlinetickets.model.UserAL;
import itse1905.airlinetickets.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserAL> findAllUser() throws SQLException {
        return userRepo.getAllUser();
    }
    public boolean updateUser(UserAL userAL) throws SQLException {
        return userRepo.updateUser(userAL);
    }
    public void deleteUser(UserAL userAL) throws SQLException {
        userRepo.deleteUser(userAL);
    }
}
