package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This is the Article model used to represent and store blog entries. You can
 * find ebean documentation here: http://ebean-orm.github.io/apidocs/ See the
 * docs under com.avaje.ebean, specifically classes 'Model' and 'Model.Finder'
 */
@Entity
public class Article extends Model {
    @Id
    public Long id;

    public String title;
    public String body;

    // A finder object for easier querying
    public static Finder<Long, Article> find = new Finder<Long, Article>(Article.class);
}
