package server.bank.domian.model;
import jakarta.validation.constraints.*;
import java.util.UUID;

public class User {

    private final UUID externalId;

    @NotBlank
    private final String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 5, max = 20)
    private final String idNumber;

    @NotBlank
    private String phoneNumber;

    //constructors
    public User(String firstName; String lastName; String idNumber, String phoneNumber; String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.externalId = UUID.randomUUID();
    }


    //getters
    public String getExternalId(){
        return this.externalId;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.firstName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getIdNumber(){
        return this.idNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    //setters
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public void setPhoneNumber(String newNumber){
        this.phoneNumber = newNumber;
    }



}
