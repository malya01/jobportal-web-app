package Jobportal.jobportal.service;


import Jobportal.jobportal.entity.userType;
import Jobportal.jobportal.repository.userTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userTypeservice {
    private final userTypeRepo userTypeRepo;
    public userTypeservice(userTypeRepo userTypeRepo){

        this.userTypeRepo = userTypeRepo;
    }

    public List<userType>getAll(){

        return userTypeRepo.findAll();
    }



}
