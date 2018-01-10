# Flight-Reservation-System
FRS application is used to search, book flights online. Admin users can add/delete/update flight details. It is developed using Spring and Hibernate frameworks.

### Project workflow :
- web.xml -> FRS-servlet.xml, DispatcherServlet ->  hibernate.cfg.xml, jdbc.properties, views folder. 
- Request comes from user -> DispatcherServlet -> HandlerMapping -> Controller -> class/method based on url --(Model)-> Service layer -> DAO layer -> all the way back to controller -> ViewResolver ->View -> Response to user.

### web.xml : 
It is called deployment descriptor of web application. It includes all Servlet details mainly Dispatcher servlet which is called front controller of web application.
In servlet-mapping all url's are mapped to FRS servlet.Upon initialization of DispatcherServlet, the framework will try to load the application context from a file named [servlet-name]-servlet.xml located in the application's WebContent/WEB-INFdirectory. 
In this project, our file will be FRS-servlet.xml.

### FRS-servlet.xml :
This file is used to create the beans defined in additon to InternalResourceViewResolver, ReloadableResourceBundleMessageSource, PropertyPlaceholderConfigurer, AnnotationSessionFactoryBean, HibernateTransactionManager.
hibernate.cfg.xml is also configured in this file in the bean SessionFactory. PropertyPlaceholderConfigurer bean is used to define our property files such as jdbc.properties and message.properties.

### hibernate.cfg.xml :
It contains configuration details of hibernate along with mapping class 'Flight'.

### jdbc.properties :
This is properties file which contains jdbc related information such as 
- driverClassName : OracleDriver
- dialect : OracleDialect
- databaseurl : url to connect to database
- username : username of database
- password : password of database

## Model :
It encapsulates the application data and generally consists of POJO. @Entity marks java bean class as Model. In this project one model 'Flight' is there.

## View:
View is responsible for rendering the model data according to user request. Spring MVC supports many types of views for different presentation technologies. These include - JSPs, HTML, PDF, Excel worksheets, XML, Velocity templates, XSLT, JSON, Atom and RSS feeds, JasperReports, etc. But most commonly we use JSP. 

## Controller :
The DispatcherServlet delegates the request to the controllers to execute the functionality specific to it. The @Controller annotation indicates that a particular class serves the role of a controller. The @RequestMapping annotation is used to map a URL to either an entire class or a particular handler method.
In this project only one controller 'FRSController' is there which is autowired with 'FlightService'. RequestMapping annotation helps controller which method to call/resolve based on path of request and method type GET/POST.
@ModelAttribute is used as parameter to method to tell which model to use to bind View and Controller.

## Service :
@Service annotation indicates class as service.
- FlightService.java is an interface that contains set of methods.
- FlightServiceImpl.java is a class that implements FlightService and access DAO layer by autowiring FlightDAO.

## DAO :
- FlightDAO.java is an interface that contains set of methods.
- FlightDAOImpl.java is a class that implements FlightService and access database using Hibernate by autowiring SessionFactory.
(still needs to add some more files)
