package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class UserModel {
    private String name;
    private String password;
    private String country;
    private String programingLanguage;
    private List<String> operatingSystems;
}
