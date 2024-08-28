package com.MongoDBtest.Components;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.MongoDBtest.Model.Students;

	

@Component
public class MongoListener extends AbstractMongoEventListener<Students> {

  @Override
  public void onBeforeConvert(BeforeConvertEvent<Students> event) {
    super.onBeforeConvert(event);
    
    Date dateNow = new Date();
    
    event.getSource().setCreatedAt(dateNow);
    event.getSource().setUpdatedAt(dateNow);
  }
}