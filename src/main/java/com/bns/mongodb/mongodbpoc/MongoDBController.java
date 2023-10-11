package com.bns.mongodb.mongodbpoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Annotation
@RestController

//Class
public class MongoDBController {

              
              @Autowired
    private AuditEventRepo repo;

    @PostMapping("/addEvent")
    public String saveAuditEvent(@RequestBody AuditEvent auditEvent){
        
              System.out.println("Auditevent+"+auditEvent.getEventType());
              repo.save(auditEvent);
       
        return "Added Successfully";
    }

    @GetMapping("/findAllEvents")
    public List<AuditEvent> getAuditEvents() {
       
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAuditEvent(@PathVariable String id){
        repo.deleteById(id);
       
        return "Deleted Successfully";
    }
              
}

