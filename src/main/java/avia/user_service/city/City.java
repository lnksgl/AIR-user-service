package avia.user_service.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.AUTO;
import static lombok.AccessLevel.PRIVATE;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")
@FieldDefaults(level = PRIVATE)
public class City {

    @Id
    @GeneratedValue(strategy = AUTO)
    Long id;
    String name;
    //TODO *-1 dependency with country
}
