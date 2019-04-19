package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.SportClub;
import serverPhotos.service.SportClubService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SportClubController {

    @GetMapping(name = "/hello")
    public String getHello(){
        return "Hello world";
    }
   }
