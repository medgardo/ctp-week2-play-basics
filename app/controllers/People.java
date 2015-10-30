package controllers;

import play.mvc.*;

/**
 * This is a People controller that implements RESTful routes. You can test
 * these routes using the CURL utility.
 */
public class People extends Controller {

    // Route: GET /people
    public Result index() {
        return ok("This is the people/index page.\n");
    }

    // Route: GET /people/:id
    public Result show(Long id) {
        return ok("This is the people/show page for person with id: " + String.valueOf(id) + "\n");
    }

    // Route: DELETE /people/:id
    public Result delete(Long id) {
        return ok("Delete person with id: " + String.valueOf(id) + "\n");
    }

    // Route: GET /people/:id/edit
    public Result edit(Long id) {
        return ok("Editing person with id: " + String.valueOf(id) + "\n");
    }

    // Route: PUT /people/:id
    public Result update(Long id) {
        return redirect(routes.People.show(id));
    }

    // Route: GET /people/new
    public Result form() {
        return ok("A form to create a person.\n");
    }

    // Route: POST /people
    public Result create() {
        return redirect(routes.People.index());
    }

}
