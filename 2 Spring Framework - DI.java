
Introduction to Spring Framework

The Spring Framework is an open-source application framework.

 It simplies the development process by providing a consistent and flexible way of managing dependencies, configuring applications, and integrating with other frameworks.

Key Features:

1. Dependency Injection: Spring provides a robust dependency injection mechanism, making it easy to manage dependencies between objects.
2. Aspect-Oriented Programming (AOP): Spring supports AOP, allowing developers to decouple cross-cutting concerns from business logic.
3. Declarative Configuration: Spring uses declarative configuration, making it easy to configure applications using XML, Java, or Groovy.

What is the primary benefit of using Dependency Injection in Spring?

A) Improved performance
B) Simplified configuration
C) Reduced coupling between objects
D) Enhanced security

he correct answer is:

C) Reduced coupling between objects

Dependency Injection helps reduce coupling by decoupling dependent components, making it easier to test, maintain, and extend the application.

Here's why:

- Without DI, components are tightly coupled, making it hard to change or replace one component without affecting others.
- With DI, components are loosely coupled, allowing for greater flexibility and modularity.

Question 2: What is the main purpose of the @Autowired annotation in Spring?

A) To inject dependencies
B) To configure beans
C) To enable AOP
D) To secure methods

A) To inject dependencies

The @Autowired annotation is used to inject dependencies into a component, such as a bean or a controller. It tells Spring to automatically wire the required dependencies, making it easier to manage and configure components.


By using the @Qualifier annotation, we can eliminate the issue of which bean needs to be injected. By including the @Qualifier annotation, together with the name of the specific implementation we want to use, in this example Foo, we can avoid ambiguity when Spring finds multiple beans of the same type.


@Profile helps spring to identify the beans that belong to a particular environment. Any class which is annotated with stereotype annotations such as @Component,@Service,@Repository and @Configuration can be annotated with @Profile

@Configuration
@Profile("dev")
public class DevConfig {
    // Dev-specific beans
}
@Configuration
@Profile("prod")
public class ProdConfig {
    // Production-specific beans
}

@ActiveProfiles comes into picture in case of an ApplicationContext and defines which profiles should be active if respective ApplicationContext is being used.
Remember:  @ActiveProfile is specifically for testing purposes and should not be used in production code. For production profile management, use application properties or command-line arguments.


Question 3: What is the primary difference between a Singleton and a Prototype bean in Spring?

A) Singleton beans are thread-safe, while Prototype beans are not.
B) Singleton beans are created once, while Prototype beans are created every time they're requested.
C) Singleton beans are used for stateless components, while Prototype beans are used for stateful components.
D) Singleton beans are used for web applications, while Prototype beans are used for desktop applications.

B) Singleton beans are created once, while Prototype beans are created every time they're requested.

In Spring, beans can have different scopes, which determine how they're created and managed. The two main scopes are:

1. Singleton: A single instance of the bean is created when the application starts, and the same instance is shared across the application. This is the default scope.
2. Prototype: A new instance of the bean is created every time it's requested. This means that multiple instances of the bean can exist simultaneously.

Here's a simple example to illustrate the difference:

- Singleton: A single database connection object is created and shared across the application.
- Prototype: A new database connection object is created every time a component requests it.

Question 4: What is the purpose of the Spring MVC DispatcherServlet?

A) To handle requests and responses
B) To configure beans and dependencies
C) To provide a web interface for application configuration
D) To secure web applications

The correct answer is:

A) To handle requests and responses

The DispatcherServlet is the central component of Spring MVC, responsible for handling incoming requests and routing them to the appropriate controllers. It acts as a front controller, directing requests to the correct handlers and returning responses to the client.

Here's a brief overview of its responsibilities:

- Receives incoming requests
- Determines the appropriate controller to handle the request
- Passes the request to the controller
- Receives the response from the controller
- Returns the response to the client

The other options aren't accurate:

- B) Configuring beans and dependencies is done by the Spring container, not the DispatcherServlet.
- C) Providing a web interface for application configuration isn't the primary purpose of the DispatcherServlet.
- D) Securing web applications is a broader topic, involving multiple components and configurations, not just the DispatcherServlet.

Question 5: What is the purpose of the @RequestMapping annotation in Spring MVC?

A) To map a controller method to a specific URL
B) To inject dependencies into a controller
C) To configure bean properties
D) To secure controller methods

A) To map a controller method to a specific URL

The @RequestMapping annotation is used to map a controller method to a specific URL, HTTP method, or request parameters. It's a crucial annotation in Spring MVC, allowing you to define the request handling logic for your web application.

Here's a brief overview of its usage:

- @RequestMapping("/path"): Maps a controller method to a specific URL path
- @RequestMapping(method = RequestMethod.GET): Maps a controller method to a specific HTTP method (e.g., GET, POST, PUT, DELETE)
- @RequestMapping(params = "param=value"): Maps a controller method to a specific request parameter

	• Base annotation for mapping web requests to controller methods
	• Can be used at both class and method level
 
	@RequestMapping("/api/users")
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() { ... }
}
	

Question 6: What is the purpose of the ModelAndView object in Spring MVC?

A) To return a view name and model data from a controller method
B) To inject dependencies into a controller
C) To configure bean properties
D) To secure controller methods

A) To return a view name and model data from a controller method

The ModelAndView object is used to return both the view name and model data from a controller method in Spring MVC. It's a convenient way to encapsulate both the view and model data, making it easy to render the correct view with the necessary data.

Here's a brief overview of its usage:

- ModelAndView viewName, model): Returns a view name and adds model data to the request scope
- ModelAndView(String viewName, String modelName, Object modelObject): Returns a view name, adds model data to the request scope, and specifies the model name


Overview of how Spring MVC works and its flow:

Spring MVC Architecture:

1. Front Controller (DispatcherServlet)
2. Handler Mapping
3. Controller (Handler)
4. View Resolver
5. View


Flow:

1. Request: Client sends an HTTP request to the server.

2. DispatcherServlet: Receives request, acts as Front Controller.

3. Handler Mapping: Maps request to corresponding Controller method.

4. Controller (Handler): Processes request, returns ModelAndView.

5. View Resolver: Resolves view based on ModelAndView.

6. View: Renders response.

7. Response: Sent back to client.


Detailed Flow:

1. Client sends request (e.g., GET /users).

2. DispatcherServlet receives request, calls HandlerMapping.

3. HandlerMapping finds matching Controller method (e.g., UserController.getUsers()).

4. Controller method processes request, returns ModelAndView (data and view name).

5. DispatcherServlet calls ViewResolver to resolve view (e.g., users.jsp).

6. ViewResolver returns view (users.jsp).

7. DispatcherServlet renders view with data.

8. Response sent back to client.


Key Components:

1. DispatcherServlet: Central controller, handles requests.

2. HandlerMapping: Maps requests to controllers.

3. Controller: Handles requests, returns ModelAndView.

4. ViewResolver: Resolves views.

5. View: Renders response.


Spring MVC Benefits:

1. Separation of Concerns (SoC)
2. Reusability
3. Flexibility
4. Easy maintenance


Spring MVC Annotations:

1. @RequestMapping -
2. @GetMapping
3. @PostMapping
4. @Controller 
		○ Marks a class as a Spring MVC controller
		○ Handles web requests
		○ @Controller
public class HomeController {
    // Controller methods
}
		
5. @ResponseBody
6. @PathVariable -> 
	• Binds URI template variables to method parameters

	@GetMapping("/users/{id}/orders/{orderId}")
public Order getOrder(@PathVariable Long id, 
                     @PathVariable Long orderId) { ... }
7.@ModelAttribute


A - Here's a simple example of a Spring MVC application:


UserController.java

@Controller
@RequestMapping("/users")
public class UserController {
    
    @GetMapping
    public ModelAndView getUsers() {
        List<User> users = Arrays.asList(new User("John"), new User("Jane"));
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}


User.java

public class User {
    private String name;
    
    public User(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}


users.jsp

jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
    <h1>Users</h1>
    <ul>
        <c:forEach items="${users}" var="user">
            <li>${user.name}</li>
        </c:forEach>
    </ul>
</body>
</html>


spring-servlet.xml (configuration file)

<beans xmlns="(link unavailable)"
       xmlns:xsi="(link unavailable)"
       xsi:schemaLocation="(link unavailable)
       (link unavailable)">
    
    <context:component-scan base-package="com.example"/>
    
    <bean id="viewResolver"
          class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/views/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
</beans>


In this example, we have a UserController that handles GET requests to /users and returns a ModelAndView with a list of User objects. The users.jsp view renders the list of users.


Would you like:

A) More code examples
B) Explanation of specific parts (e.g., @Controller, @RequestMapping)
C) Related topics (e.g., Spring Boot, Thymeleaf)
D) Practice exercises

Please choose your next step!

Here's an example of a POST mapping in Spring MVC:


UserController.java

@Controller
@RequestMapping("/users")
public class UserController {
    
    @PostMapping
    public ModelAndView createUser(@ModelAttribute User user) {
        // Save user to database or perform other actions
        System.out.println("Creating user: " + user.getName());
        return new ModelAndView("user-created");
    }
}


User.java

public class User {
    private String name;
    private String email;
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}


create-user.jsp

<jsp:forward page="/WEB-INF/views/create-user.jsp"/>


create-user.jsp (actual view)

<form action="/users" method="post">
    Name: <input type="text" name="name"><br>
    Email: <input type="email" name="email"><br>
    <input type="submit" value="Create User">
</form>


In this example, we have a UserController with a createUser method that handles POST requests to /users. The method takes a User object as a parameter, which is automatically populated from the form data by Spring MVC.

When the form is submitted, the createUser method is called, and the User object is printed to the console. Finally, the method returns a ModelAndView that renders the user-created view.


Would you like:

A) More examples (e.g., PUT, DELETE)
B) Explanation of specific parts (e.g., @ModelAttribute)
C) Related topics (e.g., validation, error handling)
D) Practice exercises

Please choose your next step!

Here's an example of combining POST and GET mappings in one controller:


UserController.java

@Controller
@RequestMapping("/users")
public class UserController {
    
    // GET mapping to display user form
    @GetMapping
    public ModelAndView getUserForm() {
        ModelAndView modelAndView = new ModelAndView("create-user");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }
    
    // POST mapping to create new user
    @PostMapping
    public ModelAndView createUser(@ModelAttribute User user) {
        // Save user to database or perform other actions
        System.out.println("Creating user: " + user.getName());
        return new ModelAndView("user-created");
    }
    
    // GET mapping to display all users
    @GetMapping("/all")
    public ModelAndView getAllUsers() {
        List<User> users = Arrays.asList(new User("John"), new User("Jane"));
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}


User.java

public class User {
    private String name;
    private String email;
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}


create-user.jsp

<form action="/users" method="post">
    Name: <input type="text" name="name"><br>
    Email: <input type="email" name="email"><br>
    <input type="submit" value="Create User">
</form>


users.jsp

<h1>Users</h1>
<ul>
    <c:forEach items="${users}" var="user">
        <li>${user.name}</li>
    </c:forEach>
</ul>


In this example:


1. getUserForm method handles GET requests to /users and displays the user form.
2. createUser method handles POST requests to /users and creates a new user.
3. getAllUsers method handles GET requests to /users/all and displays all users.


