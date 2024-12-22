package HelloWorld;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a basic server on port 8080
        Server server = new Server(8080);

        // Create a context and map the servlet
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // Add the servlet to the context
        context.addServlet(HelloWorldServlet.class, "/hello");

        // Start the server
        server.start();
        server.join();
    }
}
