import lombok.extern.slf4j.Slf4j;
import products.Product;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@Slf4j
@WebServlet(name = "ProductsServlet", urlPatterns = "/products")
public class ProductsServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        log.info("Servlet {} started", getServletInfo());
    }

    @Override
    public void destroy() {
        log.info("Servlet {} destroyed", getServletInfo());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            products.add(new Product(i, String.format("Яблоко%s", i), i * 5));
        }

        req.setAttribute("products", products);
        getServletContext().getRequestDispatcher("/products.jsp").forward(req, resp);
    }
}
