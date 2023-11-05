package com.company;

import com.company.SomeSmallTest;
import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestExecutor;
import org.graphwalker.java.test.Executor;
import org.graphwalker.websocket.WebSocketServer;
import java.io.IOException;

public class Runner {
  public static void main(String[] args) throws IOException {
    /*
    Multiple executor example

    Executor executor = new TestExecutor(PetClinic.class,
            FindOwners.class,
            NewOwner.class,
            OwnerInformation.class,
            Veterinariens.class);
    */

    /*TestExecutor executor = new TestExecutor(
      SomeSmallTest.class
    );*/

    TestExecutor executor = new TestExecutor(
      LoginTrelloTest.class
    );


    WebSocketServer server = new WebSocketServer(8887, executor.getMachine());
    server.start();

    Result result = executor.execute(true);
    result.getErrors().forEach(System.out::println);
    System.out.println("Done: [" + result.getResults().toString(2) + "]");
  }
}
