package itse1905.airlinetickets.service;

import itse1905.airlinetickets.model.CompanyAL;
import itse1905.airlinetickets.repository.CompanyRepo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private CompanyRepo companyRepo;
    private SessionFactory sessionFactory;
    private Log logger = LogFactory.getLog(CompanyRepo.class);

    @Autowired
    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public List<CompanyAL> getAllCompany(){
        return companyRepo.getAllCompany();
    }

//    public List<CompanyAL> getCompanyListByName(){
//        List<CompanyAL> temp = companyRepo.getAllCompany();
//        List<CompanyAL> list = temp.stream()
//                .filter(anime -> "Haikyuu".equalsIgnoreCase(Optional.ofNullable(anime)
//                        .map(CompanyRepo::getCompanyName).orElse("")))
//                .collect(Collectors.toList());
//        return list;
//    }

    public Optional<CompanyAL> getCompanyByName(int animeid){
        return companyRepo.getCompanyByName("AirAstana");
    }



}
