package controllers;

import org.junit.Test;
import si.urbas.pless.test.PlessContollerWithJpaTest;

import static controllers.routes.ref.Application;
import static play.test.Helpers.callAction;

public class ApplicationTest extends PlessContollerWithJpaTest {
    
    @Test
    public void index_MUST_return_ok() {
        callAction(Application.index());
    }
    
}
