package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This is the Person model from the Play tutorial video.
 */
@Entity
public class Person extends Model {
    @Id
    public String id;

    public String name;
}
