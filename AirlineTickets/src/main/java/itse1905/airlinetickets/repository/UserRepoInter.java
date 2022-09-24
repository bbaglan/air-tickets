package itse1905.airlinetickets.repository;

import itse1905.airlinetickets.model.UserAL;

import java.util.List;
import java.util.Optional;

public interface UserRepoInter {
    List<UserAL> getAllUser();
    Optional<UserAL> getUserByCitizenship(String citizenship);
}
