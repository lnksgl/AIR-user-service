package avia.user_service.user;

import avia.user_service.city.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static javax.persistence.GenerationType.AUTO;
import static lombok.AccessLevel.PRIVATE;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@FieldDefaults(level = PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = AUTO)
    Long id;

    String username;

    String email;

    String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    City city;
}
