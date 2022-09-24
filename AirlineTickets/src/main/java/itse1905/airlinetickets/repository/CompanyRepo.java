package itse1905.airlinetickets.repository;

import itse1905.airlinetickets.model.CompanyAL;
import itse1905.airlinetickets.model.UserAL;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public class CompanyRepo implements CompanyRepoInter {
    private SessionFactory sessionFactory;

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public List<CompanyAL> getAllCompany() {
        return sessionFactory.getCurrentSession().createQuery("from CompanyAL c").list();
    }

    @Override
    public Optional<CompanyAL> getCompanyByName(String compName) {
        return getAllCompany().stream()
                .filter(companyAL -> companyAL.getCompName()
                        .equals(compName)).findAny();
    }


}
