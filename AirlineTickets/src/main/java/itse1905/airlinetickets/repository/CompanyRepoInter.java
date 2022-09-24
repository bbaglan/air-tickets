package itse1905.airlinetickets.repository;

import itse1905.airlinetickets.model.CompanyAL;

import java.util.List;
import java.util.Optional;

public interface CompanyRepoInter {
    List<CompanyAL> getAllCompany();
    Optional<CompanyAL> getCompanyByName(String compName);

}
