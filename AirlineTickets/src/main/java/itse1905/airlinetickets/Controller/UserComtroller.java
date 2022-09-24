package itse1905.airlinetickets.Controller;

import itse1905.airlinetickets.model.UserAL;
import itse1905.airlinetickets.repository.UserRepo;
import itse1905.airlinetickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.sql.SQLException;
import java.util.List;

@Path("/user-ops")
public class UserComtroller {
    UserRepo userRepo;
    UserService userService;

    @Autowired
    public UserComtroller(UserRepo userRepo, UserService userService) {
        this.userRepo = userRepo;
        this.userService = userService;
    }

    @GET
   @Produces("application/json")
    public List<UserAL> getAllUser() throws SQLException {
        return userService.findAllUser();
    }

    @POST
    @Produces("application/json")
    public List<UserAL> insertUser(UserAL userAL) throws Exception{
        return userRepo.insertUser(userAL);
    }

    @PUT
    @Produces("application/json")
    public  boolean updateUser(UserAL userAL) throws Exception{
       return userService.updateUser(userAL);
    }

    @DELETE
    @Produces("application/json")
    public List<UserAL> deleteStudent(UserAL userAL) throws Exception{
       return userRepo.deleteUser(userAL);
    }
}


//    @GET
//    @Path("{id}")
//    public  Response getStudenServ(@PathParam("id") Long id){
//        StudentServ studentServ=repository.findByID(id);
//        return Response.ok(studentServ).build();
//    }
//
//    @PUT
//    @Path("{id}")
//    public Response update(@PathParam("id") Long id, StudentServ studentServ) {
//        StudentServ updateStudent = repository.findByID(id);
//
//        updateStudent.setName(studentServ.getName());
//        updateStudent.setSurname(studentServ.getSurname());
//        repository.update(updateStudent);
//
//        return Response.ok().build();
//    }
//
//    @POST
//    public Response create(StudentServ studentServ) {
//        repository.create(studentServ);
//        return Response.ok().build();
//    }
//
//    @DELETE
//    @Path("{id}")
//    public Response delete(@PathParam("id") Long id) {
//        StudentServ getStudent = repository.findByID(id);
//
//        repository.delete(getStudent);
//
//        return Response.ok().build();
//    }
