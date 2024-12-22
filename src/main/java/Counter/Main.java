package Counter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a Jetty server running on port 8080
        Server server = new Server(8080);

        // Create a context handler for servlets
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);

        // Map the CounterServlet to the "/counter" URL
        handler.addServlet(CounterServlet.class, "/counter");

        // Set the handler and start the server
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
