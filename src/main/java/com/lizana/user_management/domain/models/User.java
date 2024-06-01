package com.lizana.user_management.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document( collection = "user")
public class User {

  @Id
  private String userId;
  private String userPassword;
  private String userName;
  private String userLastName;
  private String userEmail;
  private String userPhone;
  private String userUrlPhoto;

}
