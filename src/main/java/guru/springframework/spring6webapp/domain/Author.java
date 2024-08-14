package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;


@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iD;
    private String firstName;
    private String lastName;


    public Long getiD() {
        return iD;
    }
    public void setiD(Long iD) {
        this.iD = iD;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
