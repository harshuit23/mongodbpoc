package com.bns.mongodb.mongodbpoc;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface AuditEventRepo extends MongoRepository<AuditEvent, String>{

}

