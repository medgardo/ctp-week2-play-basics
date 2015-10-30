package controllers;

import models.Person;
import play.*;
import play.data.Form;
import play.mvc.*;

// The following is the location of the ebean package in Play 2.4
import com.avaje.ebean.Model;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * This is the Application Controller from the tutorial video. Like all
 * controllers, it extends the play.mvc.Controller class.
 */
public class Application extends Controller {

    // index() is the Action method for our homepage route at url: /
    public Result index() {
        // Here we call the render method of the index view template and pass
        //  it a string value.
        return ok(index.render("Your new application is ready. YAY!"));
    }

    // addPerson() is the Action method that responds to POST requests
    //  at url: /person
    public Result addPerson() {
        // Forms help us retrieve user input from the request. We can customize
        //  them to also perform input validation.
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();

        // After a POST request is handled we respond typically respond with
        //  a redirect response.
        return  redirect(routes.Application.index());
    }

    // getPersons() is the Action method that responds to GET requests at
    //  url: /persons
    public Result getPersons() {
        // This is one way to query the database for a particular model.
        List<Person> persons = new Model.Finder(String.class, Person.class).all();

        // The toJson(...) method is a view that generates JSON output from our
        //  data. toJson() is a built in view method.
        return ok(toJson(persons));
    }
}
