package extreme;

import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.servlet.ServletHandler;
import java.util.Scanner;

import main.Problem;

/**
 * TODO: Insert description here. (generated by chumbarova)
 */
public class YandexApi extends Problem {

  @Override
  public void run() {
//    Server server = new Server(8080);
//    ServletHandler handler = new ServletHandler();
//    server.setHandler(handler);
//    handler.addServletWithMapping(MyServlet.class, "/*");
//    server.start();
//
//    // The use of server.join() the will make the current thread join and
//    // wait until the server is done executing.
//    // See
//    // http://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html#join()
//    server.join();
  }

  @Override
  public void runFromInput(Scanner scanner, boolean skipPrompts, PrintStream out) {
    // TODO(chumbarova): Auto-generated method stub
    
  }

//  @SuppressWarnings("serial")
//  public static class MyServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//        throws ServletException, IOException {
//      response.setContentType("text/html");
//      response.setStatus(HttpServletResponse.SC_OK);
//      response.getWriter().println("<h1>Hello from HelloServlet</h1>");
//    }
//
//    // HTTP GET request
//    private void sendGet(String query) throws Exception {
//
//      String url = "https://blogs.yandex.ru/search.rss?text=" + query;
//
//      URL obj = new URL(url);
//      HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//      // optional default is GET
//      con.setRequestMethod("GET");
//
//      int responseCode = con.getResponseCode();
//      System.out.println("\nSending 'GET' request to URL : " + url);
//      System.out.println("Response Code : " + responseCode);
//
//      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//      String inputLine;
//      StringBuffer response = new StringBuffer();
//
//      while ((inputLine = in.readLine()) != null) {
//        response.append(inputLine);
//      }
//      in.close();
//
//      // print result
//      System.out.println(response.toString());
//
//    }
//  }
}
