package controllers;

import play.mvc.Result;
import si.urbas.pless.PlessController;
import si.urbas.pless.authentication.routes;
import views.html.index;

public class Application extends PlessController {

  public static Result index() {
    if (auth().isLoggedIn()) {
      return ok(index.render());
    } else {
      return redirect(routes.AuthenticationController.status());
    }
  }

}
