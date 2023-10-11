package com.bns.mongodb.mongodbpoc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "AuditEvent")
public class AuditEvent {

              @Id private String sessionId;
              
              private String eventType;
              private String CID;
              public String getSessionId() {
                             return sessionId;
              }
              public void setSessionId(String sessionId) {
                             this.sessionId = sessionId;
              }
              public String getEventType() {
                             return eventType;
              }
              public void setEventType(String eventType) {
                             this.eventType = eventType;
              }
              public String getCID() {
                             return CID;
              }
              public void setCID(String cID) {
                             CID = cID;
              }
              

}

